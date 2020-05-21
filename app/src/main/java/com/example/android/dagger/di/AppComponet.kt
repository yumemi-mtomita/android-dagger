package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationActivity
import dagger.Component

@Component
interface AppComponet {
    fun inject(activity: RegistrationActivity)
}
