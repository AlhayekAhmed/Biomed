package com.biomedlearn.presentation.diagnostic

import com.biomedlearn.domain.entities.DiagnosticResult

sealed class DiagnosticState {
    object Idle : DiagnosticState()
    object Loading : DiagnosticState()
    data class Success(val result: DiagnosticResult) : DiagnosticState()
    data class Error(val message: String) : DiagnosticState()
}
