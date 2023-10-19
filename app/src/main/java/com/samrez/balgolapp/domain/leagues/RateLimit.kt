package com.samrez.balgolapp.domain.leagues

import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class RateLimit(
    val resetsInSeconds: Int? = null,
    val remaining: Int? = null,
    val requestedEntity: String? = null
)
