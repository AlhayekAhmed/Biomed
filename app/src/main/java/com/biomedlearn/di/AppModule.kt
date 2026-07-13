package com.biomedlearn.di

import com.biomedlearn.data.repository.DeviceRepositoryImpl
import com.biomedlearn.domain.repositories.DeviceRepository
import org.koin.dsl.module

val appModule = module {
    single<DeviceRepository> { DeviceRepositoryImpl() }
}
