package com.samrez.balgolapp.domain.leagues

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Keep
@Parcelize
data class Leagues(
	val pagination: Pagination? = null,
	val rateLimit: RateLimit? = null,
	val data: List<DataItem?>? = null,
	val timezone: String? = null,
	val subscription: List<SubscriptionItem?>? = null
)

//data class DataItem(
//	val sportId: Int? = null,
//	val subType: String? = null,
//	val imagePath: String? = null,
//	val name: String? = null,
//	val active: Boolean? = null,
//	val hasJerseys: Boolean? = null,
//	val id: Int? = null,
//	val type: String? = null,
//	val lastPlayedAt: String? = null,
//	val category: Int? = null,
//	val countryId: Int? = null,
//	val shortCode: String? = null
//)

//data class SubscriptionItem(
//	val meta: List<Any?>? = null,
//	val plans: List<PlansItem?>? = null,
//	val addOns: List<Any?>? = null,
//	val widgets: List<Any?>? = null
//)

//data class RateLimit(
//	val resetsInSeconds: Int? = null,
//	val remaining: Int? = null,
//	val requestedEntity: String? = null
//)

//data class PlansItem(
//	val category: String? = null,
//	val plan: String? = null,
//	val sport: String? = null
//)

//data class Pagination(
//	val nextPage: Any? = null,
//	val perPage: Int? = null,
//	val count: Int? = null,
//	val hasMore: Boolean? = null,
//	val currentPage: Int? = null
//)
