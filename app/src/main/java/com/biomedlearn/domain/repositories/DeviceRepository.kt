package com.biomedlearn.domain.repositories

import com.biomedlearn.domain.entities.MedicalDevice

interface DeviceRepository {
    suspend fun getDevices(): List<MedicalDevice>
}
