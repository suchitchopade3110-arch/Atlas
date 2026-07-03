package com.atlas.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Hilt module for binding repository interfaces to their concrete implementations.
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    // Repository bindings (e.g., @Binds abstract fun bindMyRepository(impl: MyRepositoryImpl): MyRepository) 
    // will be declared here.
}
