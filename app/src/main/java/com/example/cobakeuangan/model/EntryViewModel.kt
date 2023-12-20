package com.example.cobakeuangan.model

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import com.example.cobakeuangan.data.Keuangan
import com.example.cobakeuangan.repositori.RepositoriKeuangan

class EntryViewModel(private val repositoriKeuangan: RepositoriKeuangan) : ViewModel() {
    var uiStateKeuangan by mutableStateOf(UIStateKeuangan())
        private set

    fun setDetailKeuangan(detailKeuangan: DetailKeuangan) {
        uiStateKeuangan = uiStateKeuangan.copy(detailKeuangan = detailKeuangan)
    }

    fun setIsEntryValid(isValid: Boolean) {
        uiStateKeuangan = uiStateKeuangan.copy(isEntryValid = isValid)
    }
}

data class UIStateKeuangan(
    val detailKeuangan: DetailKeuangan = DetailKeuangan(),
    val isEntryValid: Boolean = false
)

data class DetailKeuangan(
    val tipe: String = "",
    val dateAdded: Long = System.currentTimeMillis(),
    val kategori: String = "",
    val nominal: Int = 0,
    val catatan: String = "",
    val id: Int = 0
)

fun DetailKeuangan.toKeuangan(): Keuangan = Keuangan(
    tipe = tipe,
    dateAdded = dateAdded,
    kategori = kategori,
    nominal = nominal,
    catatan = catatan,
    id = id

)

fun Keuangan.toUiStateKeuangan(isEntryValid: Boolean = false): UIStateKeuangan = UIStateKeuangan(
        detailKeuangan = this.toDetailKeuangan(),
        isEntryValid = isEntryValid
        )

fun Keuangan.toDetailKeuangan(): DetailKeuangan = DetailKeuangan(
    tipe = tipe,
    dateAdded = dateAdded,
    kategori = kategori,
    nominal = nominal,
    catatan = catatan,
    id = id
)
