package com.teka.routes

import com.teka.data.model.Celeb
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


private const val BASE_URL = "http://localhost:8080"
private const val BASE_STATIC_URL = "http://localhost:8080/static"

private val celebs = listOf(
    Celeb("Elani", "A group of singers", "$BASE_STATIC_URL/celebs/elani.jpg"),
    Celeb("Kibe", "A controversial youtuber", "$BASE_STATIC_URL/celebs/kibe.jpg"),
    Celeb("Larry", "A decorated journalist", "$BASE_STATIC_URL/celebs/larry.jpg"),
    Celeb("Lupita", "A decorated actress", "$BASE_STATIC_URL/celebs/lupita.jpg"),
    Celeb("Stevo", "A loved singer", "$BASE_STATIC_URL/celebs/stevo.jpg")
)


fun Route.randomCeleb(){
    get("/random-celeb"){
        call.respond(
            HttpStatusCode.OK,
            celebs.random()
        )
    }
}