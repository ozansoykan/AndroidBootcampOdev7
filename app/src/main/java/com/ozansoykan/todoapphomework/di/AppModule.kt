package com.ozansoykan.todoapphomework.di

import android.content.Context
import androidx.room.Room
import com.ozansoykan.todoapphomework.data.repo.IslerDaoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideKisilerDaoRepository(idao:IslerDao) : IslerDaoRepository {
        return IslerDaoRepository(idao)//var krepo = KisilerDaoRepository()
    }

    @Provides
    @Singleton
    fun provideKisilerDao(@ApplicationContext context: Context) : IslerDao {
        val vt = Room.databaseBuilder(context,Veritabani::class.java,"rehber.sqlite")
            .createFromAsset("rehber.sqlite").build()
        return  vt.getKisilerDao()
    }

}