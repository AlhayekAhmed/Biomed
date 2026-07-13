package com.biomedlearn.data.models

import com.biomedlearn.domain.entities.MedicalDevice

data class MedicalDeviceModel(
    val id: String,
    val name: String,
    val manufacturer: String,
    val category: String
) {
    fun toEntity() = MedicalDevice(id, name, manufacturer, category)
}
