package com.biomedlearn.data.repository

import com.biomedlearn.domain.entities.DiagnosticResult
import com.biomedlearn.domain.repositories.DiagnosticRepository

class DiagnosticRepositoryImpl : DiagnosticRepository {
    override suspend fun diagnose(deviceType: String, symptom: String): DiagnosticResult {
        val causes = when {
            symptom.contains("لا يعمل") -> listOf("انقطاع التغذية", "عطل في لوحة التحكم", "فشل في المكونات الداخلية")
            symptom.contains("يفصل") -> listOf("حماية كهربائية", "ارتفاع حمل", "خلل في مصدر الطاقة")
            else -> listOf("يحتاج إلى فحص ميداني وتحديد القياسات")
        }

        return DiagnosticResult(
            problem = symptom,
            possibleCauses = causes,
            recommendedSteps = listOf("فحص التغذية", "قياس الجهود", "فحص التوصيلات"),
            severity = "متوسط"
        )
    }
}
