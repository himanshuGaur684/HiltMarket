package gaur.himanshu.august.hiltmarket.modules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import gaur.himanshu.august.hiltmarket.di.wheeldi.Components
import gaur.himanshu.august.hiltmarket.di.wheeldi.Rim
import gaur.himanshu.august.hiltmarket.di.wheeldi.Spikes
import gaur.himanshu.august.hiltmarket.interfaces.TestingInteraface
import gaur.himanshu.august.hiltmarket.interfaces.TestingInterfaceImpl
import retrofit2.Retrofit
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object Modules {

    @Provides
    @Singleton
    fun provideTestInterfaceImpl(): TestingInteraface {
        return TestingInterfaceImpl()
    }

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl("https://google.com/").build()
    }

    @Provides
    @First // Tell the diffrences
    @Singleton
    fun provideRim(): Components {
        return Rim()
    }


    @Provides
    @Singleton
    @Second // Tell the diffrences
    fun provideSpikes(): Components {
        return Spikes()
    }

}


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class First

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Second