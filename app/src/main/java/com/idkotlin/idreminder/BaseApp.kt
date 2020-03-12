package com.idkotlin.idreminder

import android.app.Application
import com.tutorial.learnlinuxpro.presentation.di.component.ApplicationComponent
import com.tutorial.learnlinuxpro.presentation.di.component.DaggerApplicationComponent
import com.tutorial.learnlinuxpro.presentation.di.module.ApplicationModule
import com.tutorial.learnlinuxpro.presentation.util.Util

/**
 * Created by kodeartisan on 26/10/17.
 */
class BaseApp : Application() {

    companion object {
        lateinit var appComponent: ApplicationComponent
    }
//Nelson Bangsad DIA GAY
//Saya setuju
    //Abun Gans
    //Jelas!!
    //Mantap
    override fun onCreate() {
        super.onCreate()
        appComponent = createApplicationComponent()
        Util.init(this)
    }

    private fun createApplicationComponent(): ApplicationComponent {
        return DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}