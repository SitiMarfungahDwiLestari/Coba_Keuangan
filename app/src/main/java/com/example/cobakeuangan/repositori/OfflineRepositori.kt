package com.example.cobakeuangan.repositori

import com.example.cobakeuangan.data.Dao
import com.example.cobakeuangan.data.Keuangan
import kotlinx.coroutines.flow.Flow

class OfflineRepositori(private val dao: Dao): RepositoriKeuangan {
    override fun getAllKeuanganStream(): Flow<List<Keuangan>> = dao.getAllKeuangan()

    override fun getKeuanganStream(id: Int): Flow<Keuangan?> = dao.getKeuangan(id)

    override suspend fun insertKeuangan(keuangan: Keuangan) = dao.insert(keuangan)

    override suspend fun deleteKeuangan(keuangan: Keuangan) = dao.delete(keuangan)

    override suspend fun updateKeuangan(keuangan: Keuangan) = dao.update(keuangan)

}