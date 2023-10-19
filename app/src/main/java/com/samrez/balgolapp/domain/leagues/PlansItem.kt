package com.samrez.balgolapp.domain.leagues

import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class PlansItem(
    val category: String? = null,
    val plan: String? = null,
    val sport: String? = null
)
