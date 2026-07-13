package com.biomedlearn.domain.usecases

import com.biomedlearn.domain.entities.MedicalDevice
import com.biomedlearn.domain.repositories.DeviceRepository

class GetDevicesUseCase(
    private val repository: DeviceRepository
) {
    suspend operator fun invoke(): List<MedicalDevice> {
        return repository.getDevices()
    }
}
