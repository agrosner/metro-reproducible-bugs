package com.example.myapplication

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesTo

// workaround
private const val key = ExampleConstants.CONTROLLER + DeepLinkStrategyId.ACTION_DISPLAY

@Module
@ContributesTo(AppScope::class)
interface ExampleModule {


    @Binds
    @IntoMap
    @StringKey(key)
    fun provideSoftForcedUpgradePreferencesDeepLinkPath(exampleClass: ExampleClass): ExampleClassInterface
}