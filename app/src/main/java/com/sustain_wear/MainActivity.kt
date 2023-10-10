package com.sustain_wear

import android.Manifest
import android.app.PendingIntent
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat


class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        WearOSNotificationHelper.postLocalNotification(applicationContext, "Tip of the day", "If you are travelling today, try carpooling. ");

        findViewById<Button>(R.id.btnLeaderboard).setOnClickListener {
            val intent = Intent(this@MainActivity, LeaderboardActivity::class.java)
            startActivity(intent)

        }

        findViewById<Button>(R.id.btnChallenges).setOnClickListener {

        }

    }


}