package com.ustinovauliana.playzone

import com.ustinovauliana.playzone.database.databaseModule
import com.ustinovauliana.playzone.json.serializationModule
import com.ustinovauliana.playzone.ktor.ktorModule
import org.kodein.di.DI

val coreModule = DI.Module("coreModule"){
    importAll(
        serializationModule,
        databaseModule,
        ktorModule,
    )
}
