package com.biomedlearn.domain.usecases

import com.biomedlearn.domain.entities.DiagnosticResult
import com.biomedlearn.domain.repositories.DiagnosticRepository

class DiagnoseDeviceUseCase(
    private val repository: DiagnosticRepository
) {
    suspend operator fun invoke(deviceType: String, symptom: String): DiagnosticResult {
        return repository.diagnose(deviceType, symptom)
    }
}
