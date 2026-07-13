package com.biomedlearn.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.biomedlearn.domain.entities.MedicalDevice
import com.biomedlearn.domain.usecases.GetDevicesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DeviceViewModel(
    private val getDevicesUseCase: GetDevicesUseCase
) : ViewModel() {

    private val _devices = MutableStateFlow<List<MedicalDevice>>(emptyList())
    val devices: StateFlow<List<MedicalDevice>> = _devices

    fun loadDevices() {
        viewModelScope.launch {
            _devices.value = getDevicesUseCase()
        }
    }
}
