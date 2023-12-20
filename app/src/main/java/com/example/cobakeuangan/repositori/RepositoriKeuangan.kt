package com.example.cobakeuangan.repositori

import com.example.cobakeuangan.data.Keuangan
import kotlinx.coroutines.flow.Flow

interface RepositoriKeuangan {
    fun getAllKeuanganStream(): Flow<List<Keuangan>>

    fun getKeuanganStream(id: Int): Flow<Keuangan?>

    suspend fun insertKeuangan(keuangan: Keuangan)

    suspend fun deleteKeuangan(keuangan: Keuangan)

    suspend fun updateKeuangan(keuangan: Keuangan)
}