package com.moaimar.custom_newspaper.features.rssfeed.di

import com.moaimar.custom_newspaper.features.rssfeed.data.remote.ApiEndPoints
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NewsProvidesModule {

    @Provides
    @Singleton
    fun provideCharacterApiEndPoint(retrofit: Retrofit): ApiEndPoints {
        return retrofit.create(ApiEndPoints::class.java)
    }
}