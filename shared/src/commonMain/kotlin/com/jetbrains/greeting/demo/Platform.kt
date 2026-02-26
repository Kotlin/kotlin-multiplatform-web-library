package com.jetbrains.greeting.demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform