package com.ds.locationtest
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ds.locationtest.ui.theme.myLastLocation

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

          myLastLocation(this)

        }
    }


    }

