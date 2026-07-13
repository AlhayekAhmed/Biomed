package com.biomedlearn.domain.entities

 data class DiagnosticResult(
    val problem: String,
    val possibleCauses: List<String>,
    val recommendedSteps: List<String>,
    val severity: String
)
