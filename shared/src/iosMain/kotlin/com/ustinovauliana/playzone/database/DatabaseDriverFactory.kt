package com.ustinovauliana.playzone.database

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver
import com.ustinovauliana.playzone.platform.PlatformConfiguration

actual class DatabaseDriverFactory actual constructor(platformConfiguration: PlatformConfiguration)  {
    actual fun createDriver(schema: SqlDriver.Schema, name: String): SqlDriver {
        return NativeSqliteDriver(schema,name)
    }
}
