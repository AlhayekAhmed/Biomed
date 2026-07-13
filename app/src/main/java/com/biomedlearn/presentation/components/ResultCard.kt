package com.biomedlearn.presentation.components

import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.biomedlearn.domain.entities.DiagnosticResult

@Composable
fun ResultCard(result: DiagnosticResult) {
    Card {
        Text("Problem: ${result.problem}")
        Text("Severity: ${result.severity}")
    }
}
