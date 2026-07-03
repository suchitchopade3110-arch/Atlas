package com.atlas.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Hilt module for providing Database, DAO, and cryptographic assets.
 * Instantiated as a singleton component.
 */
@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    // Provider functions for Room Database, SQLCipher SupportFactory, 
    // and DAOs will be added here.
}
