package com.example.myapplication

import dagger.android.DispatchingAndroidInjector
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class ExampleActivity : DaggerAppCompatActivity() {

    @Inject
    internal lateinit var internalAndroidInjector: DispatchingAndroidInjector<Any>
}