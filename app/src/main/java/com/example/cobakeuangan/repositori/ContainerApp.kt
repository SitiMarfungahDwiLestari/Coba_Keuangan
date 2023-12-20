package com.example.cobakeuangan.repositori

import android.content.Context
import com.example.cobakeuangan.data.DatabaseKeuangan

interface ContainerApp{
    val repositoriKeuangan : RepositoriKeuangan
}

class ContainerDataApp(private val context: Context): ContainerApp{
    override val repositoriKeuangan: RepositoriKeuangan by lazy {
        OfflineRepositori(DatabaseKeuangan.getDatabase(context).dao())
    }
}