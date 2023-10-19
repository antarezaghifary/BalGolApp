package com.samrez.balgolapp.domain.leagues

import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class SubscriptionItem(
    val meta: List<Any?>? = null,
    val plans: List<PlansItem?>? = null,
    val addOns: List<Any?>? = null,
    val widgets: List<Any?>? = null
)
