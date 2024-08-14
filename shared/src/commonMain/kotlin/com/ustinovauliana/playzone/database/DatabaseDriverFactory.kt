package com.ustinovauliana.playzone.database

import com.squareup.sqldelight.db.SqlDriver
import com.ustinovauliana.playzone.platform.PlatformConfiguration

expect class DatabaseDriverFactory(platformConfiguration: PlatformConfiguration)  {
    fun createDriver(schema: SqlDriver.Schema, name: String): SqlDriver
}
