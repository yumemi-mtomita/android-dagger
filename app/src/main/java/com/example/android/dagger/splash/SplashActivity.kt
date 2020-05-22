package com.example.android.dagger.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.dagger.MyApplication
import com.example.android.dagger.login.LoginActivity
import com.example.android.dagger.registration.RegistrationActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (!(application as MyApplication).appComponent.userManager().isUserRegistered()) {
            startActivity(Intent(this, RegistrationActivity::class.java))
            finish()
        } else {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}