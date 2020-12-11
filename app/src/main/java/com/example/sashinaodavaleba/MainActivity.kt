package com.example.sashinaodavaleba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView:BottomNavigationView=findViewById(R.id.nav_view)
        val navController=findNavController(R.id.nav_host_fragmet)
        val appBarConfig = AppBarConfiguration(setOf(
            R.id.Navigation_Home, R.id.Navigation_Dashboard, R.id.Navigation_Notifications, R.id.Navigation_Settings
        ))

        setupActionBarWithNavController(navController, appBarConfig)
        navView.setupWithNavController(navController)
    }
}