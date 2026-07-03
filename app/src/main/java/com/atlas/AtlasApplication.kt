package com.atlas

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/**
 * Root Application class for the Atlas on-device AI application.
 * Initializes Hilt Dependency Injection and Timber Logging.
 */
@HiltAndroidApp
class AtlasApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        
        // Initialize Timber logging in debug builds
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
