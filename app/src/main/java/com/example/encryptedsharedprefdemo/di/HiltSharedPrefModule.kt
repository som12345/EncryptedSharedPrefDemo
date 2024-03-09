package com.example.encryptedsharedprefdemo.di

import android.content.SharedPreferences
import com.example.encryptedsharedprefdemo.util.EncryptSharedPrefManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HiltSharedPrefModule {
   @Provides
   @Singleton
   fun hiltEncryptedSharedPref(encrypTedSharedPref: EncryptSharedPrefManager) : SharedPreferences =
      encrypTedSharedPref.getEncryptedSharedPref()
}