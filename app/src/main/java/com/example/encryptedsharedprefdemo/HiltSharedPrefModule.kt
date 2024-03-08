package com.example.encryptedsharedprefdemo

import android.content.SharedPreferences
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