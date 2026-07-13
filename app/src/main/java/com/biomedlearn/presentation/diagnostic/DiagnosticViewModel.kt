package com.biomedlearn.presentation.diagnostic

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.biomedlearn.domain.usecases.DiagnoseDeviceUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DiagnosticViewModel(
    private val diagnoseDeviceUseCase: DiagnoseDeviceUseCase
) : ViewModel() {

    private val _state = MutableStateFlow<DiagnosticState>(DiagnosticState.Idle)
    val state: StateFlow<DiagnosticState> = _state

    fun diagnose(input: DiagnosticInput) {
        viewModelScope.launch {
            _state.value = DiagnosticState.Loading
            try {
                val result = diagnoseDeviceUseCase(input.deviceType, input.symptom)
                _state.value = DiagnosticState.Success(result)
            } catch (e: Exception) {
                _state.value = DiagnosticState.Error(e.message ?: "Unknown error")
            }
        }
    }
}
