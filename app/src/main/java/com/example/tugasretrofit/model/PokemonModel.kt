package com.example.tugasretrofit.model

import com.google.gson.annotations.SerializedName

data class PokemonModel(
	@field:SerializedName("data")
	val data: List<DataItem>,
)

data class AbilitiesItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class UnlimitedHolofoil(

	@field:SerializedName("market")
	val market: Any? = null,

	@field:SerializedName("high")
	val high: Int? = null,

	@field:SerializedName("directLow")
	val directLow: Any? = null,

	@field:SerializedName("low")
	val low: Int? = null,

	@field:SerializedName("mid")
	val mid: Any? = null
)

data class Set(

	@field:SerializedName("total")
	val total: Int? = null,

	@field:SerializedName("images")
	val images: Images? = null,

	@field:SerializedName("printedTotal")
	val printedTotal: Int? = null,

	@field:SerializedName("ptcgoCode")
	val ptcgoCode: String? = null,

	@field:SerializedName("releaseDate")
	val releaseDate: String? = null,

	@field:SerializedName("series")
	val series: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("legalities")
	val legalities: Legalities? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)

data class Prices(

	@field:SerializedName("avg30")
	val avg30: Any? = null,

	@field:SerializedName("reverseHoloSell")
	val reverseHoloSell: Int? = null,

	@field:SerializedName("reverseHoloLow")
	val reverseHoloLow: Any? = null,

	@field:SerializedName("averageSellPrice")
	val averageSellPrice: Any? = null,

	@field:SerializedName("reverseHoloAvg7")
	val reverseHoloAvg7: Any? = null,

	@field:SerializedName("germanProLow")
	val germanProLow: Int? = null,

	@field:SerializedName("avg7")
	val avg7: Any? = null,

	@field:SerializedName("trendPrice")
	val trendPrice: Any? = null,

	@field:SerializedName("suggestedPrice")
	val suggestedPrice: Int? = null,

	@field:SerializedName("avg1")
	val avg1: Any? = null,

	@field:SerializedName("reverseHoloTrend")
	val reverseHoloTrend: Any? = null,

	@field:SerializedName("lowPrice")
	val lowPrice: Any? = null,

	@field:SerializedName("reverseHoloAvg30")
	val reverseHoloAvg30: Any? = null,

	@field:SerializedName("lowPriceExPlus")
	val lowPriceExPlus: Int? = null,

	@field:SerializedName("reverseHoloAvg1")
	val reverseHoloAvg1: Int? = null,

	@field:SerializedName("holofoil")
	val holofoil: Holofoil? = null,

	@field:SerializedName("reverseHolofoil")
	val reverseHolofoil: ReverseHolofoil? = null,

	@field:SerializedName("normal")
	val normal: Normal? = null,

	@field:SerializedName("1stEditionHolofoil")
	val jsonMember1stEditionHolofoil: JsonMember1stEditionHolofoil? = null,

	@field:SerializedName("unlimitedHolofoil")
	val unlimitedHolofoil: UnlimitedHolofoil? = null
)

data class ReverseHolofoil(

	@field:SerializedName("market")
	val market: Any? = null,

	@field:SerializedName("high")
	val high: Any? = null,

	@field:SerializedName("directLow")
	val directLow: Any? = null,

	@field:SerializedName("low")
	val low: Any? = null,

	@field:SerializedName("mid")
	val mid: Any? = null
)

data class Tcgplayer(

	@field:SerializedName("prices")
	val prices: Prices? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)

data class Legalities(

	@field:SerializedName("unlimited")
	val unlimited: String? = null,

	@field:SerializedName("expanded")
	val expanded: String? = null
)

data class ResistancesItem(

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)

data class Normal(

	@field:SerializedName("market")
	val market: Any? = null,

	@field:SerializedName("high")
	val high: Int? = null,

	@field:SerializedName("directLow")
	val directLow: Any? = null,

	@field:SerializedName("low")
	val low: Any? = null,

	@field:SerializedName("mid")
	val mid: Any? = null
)

data class JsonMember1stEditionHolofoil(

	@field:SerializedName("market")
	val market: Any? = null,

	@field:SerializedName("high")
	val high: Any? = null,

	@field:SerializedName("directLow")
	val directLow: Any? = null,

	@field:SerializedName("low")
	val low: Any? = null,

	@field:SerializedName("mid")
	val mid: Any? = null
)

data class WeaknessesItem(

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)

data class DataItem(

	@field:SerializedName("flavorText")
	val flavorText: String?=null,

	@field:SerializedName("images")
	val images: Images?=null,

	@field:SerializedName("name")
	val name: String?=null,

	@field:SerializedName("rarity")
	val rarity: String?=null
)

data class Images(

	@field:SerializedName("symbol")
	val symbol: String?=null,

	@field:SerializedName("logo")
	val logo: String?=null,

	@field:SerializedName("small")
	val small: String?=null,

	@field:SerializedName("large")
	val large: String?=null
)

data class Holofoil(

	@field:SerializedName("market")
	val market: Any? = null,

	@field:SerializedName("high")
	val high: Any? = null,

	@field:SerializedName("directLow")
	val directLow: Any? = null,

	@field:SerializedName("low")
	val low: Any? = null,

	@field:SerializedName("mid")
	val mid: Any? = null
)

data class Cardmarket(

	@field:SerializedName("prices")
	val prices: Prices? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("updatedAt")
	val updatedAt: String? = null
)

data class AttacksItem(

	@field:SerializedName("damage")
	val damage: String? = null,

	@field:SerializedName("cost")
	val cost: List<String?>? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("convertedEnergyCost")
	val convertedEnergyCost: Int? = null
)
