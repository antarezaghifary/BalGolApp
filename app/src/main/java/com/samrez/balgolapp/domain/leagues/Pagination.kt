package com.samrez.balgolapp.domain.leagues

import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class Pagination(
    val nextPage: Any? = null,
    val perPage: Int? = null,
    val count: Int? = null,
    val hasMore: Boolean? = null,
    val currentPage: Int? = null
)
