package com.biomedlearn.domain.repositories

import com.biomedlearn.domain.entities.DiagnosticResult

interface DiagnosticRepository {
    suspend fun diagnose(deviceType: String, symptom: String): DiagnosticResult
}
