package com.rs.flickpedia

import android.app.Application
import com.rs.flickpedia.extensions.DelegatesExt

/**
 * Application class
 */
class App : Application() {
    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()

    }

    override fun onCreate() {
        super.onCreate()
        instance = this

    }

}




