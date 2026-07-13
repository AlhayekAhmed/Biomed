package com.biomedlearn.data.repository

import com.biomedlearn.domain.entities.MedicalDevice
import com.biomedlearn.domain.repositories.DeviceRepository

class DeviceRepositoryImpl : DeviceRepository {
    override suspend fun getDevices(): List<MedicalDevice> {
        return emptyList()
    }
}
