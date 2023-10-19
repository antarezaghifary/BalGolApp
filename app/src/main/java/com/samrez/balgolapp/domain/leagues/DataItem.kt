package com.samrez.balgolapp.domain.leagues

import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class DataItem(
    val sportId: Int? = null,
    val subType: String? = null,
    val imagePath: String? = null,
    val name: String? = null,
    val active: Boolean? = null,
    val hasJerseys: Boolean? = null,
    val id: Int? = null,
    val type: String? = null,
    val lastPlayedAt: String? = null,
    val category: Int? = null,
    val countryId: Int? = null,
    val shortCode: String? = null
)
