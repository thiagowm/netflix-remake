package co.thiagocc.netflixremake.model

data class Movie(
    val id: Int,
    val coverUrl: String,
    val title: String = "",
    val des: String = "",
    val cast: String = ""

    )
