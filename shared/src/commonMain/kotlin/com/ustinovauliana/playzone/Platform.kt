package com.ustinovauliana.playzone

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform