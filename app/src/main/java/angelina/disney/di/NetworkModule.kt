package angelina.disney.di

import angelina.disney.network.Api
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    fun provideApi(): Api {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.disneyapi.dev/")
            .client(
                OkHttpClient().newBuilder()
                    .addInterceptor(
                        HttpLoggingInterceptor().apply {
                            level = HttpLoggingInterceptor.Level.BODY
                        })
                    .build()
            )
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(Api::class.java)
    }
}