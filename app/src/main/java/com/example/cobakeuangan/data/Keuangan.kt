package com.example.cobakeuangan.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tblKeuangan")
data class Keuangan(
    val tipe: String = "",
    val dateAdded: Long,
    val kategori: String = "",
    val nominal: Int,
    val catatan: String,

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)

