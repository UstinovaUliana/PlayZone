package com.ustinovauliana.playzone.database

import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton

val databaseModule = DI.Module("databaseModule") {
    bind<DatabaseDriverFactory>() with singleton {
        DatabaseDriverFactory(instance())
    }
}
