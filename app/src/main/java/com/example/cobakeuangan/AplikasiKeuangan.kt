package com.example.cobakeuangan

import android.app.Application
import com.example.cobakeuangan.repositori.ContainerApp
import com.example.cobakeuangan.repositori.ContainerDataApp

class AplikasiKeuangan:Application() {
    lateinit var container:ContainerApp
    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}