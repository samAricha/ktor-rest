 package com.teka.plugins

import com.teka.routes.randomCeleb
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*

fun Application.configureRouting() {

    routing {
        randomCeleb()

        // Static plugin. Try to access `/static/index.html`
        static("/static") {
            resources("static")
        }

    }
}
