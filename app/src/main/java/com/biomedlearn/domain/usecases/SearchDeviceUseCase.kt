package com.biomedlearn.domain.usecases

import com.biomedlearn.domain.entities.MedicalDevice

class SearchDeviceUseCase {
    operator fun invoke(
        devices: List<MedicalDevice>,
        query: String
    ): List<MedicalDevice> {
        return devices.filter {
            it.name.contains(query, ignoreCase = true) ||
            it.manufacturer.contains(query, ignoreCase = true)
        }
    }
}
