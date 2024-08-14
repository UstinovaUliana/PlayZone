package com.ustinovauliana.playzone.database

import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver
import com.ustinovauliana.playzone.platform.PlatformConfiguration

actual class DatabaseDriverFactory actual constructor(private val platformConfiguration: PlatformConfiguration)  {
    actual fun createDriver(schema: SqlDriver.Schema, name: String): SqlDriver {
        return AndroidSqliteDriver(schema, platformConfiguration.androidContext, name)
    }
}
