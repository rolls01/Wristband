package com.michalrola.wristband

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.view.View
import android.content.Context.NOTIFICATION_SERVICE
import android.app.NotificationManager
import android.content.Context
import android.content.Intent


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun onClickNotify(view: View){


        val mBuilder = NotificationCompat.Builder(this, "1")
                .setSmallIcon(R.drawable.baseline_accessible_black_18)
                .setContentTitle("HEARING LOSS")
                .setContentText("I'va got hearing problems!")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        val mNotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // notificationID allows you to update the notification later on.
        mNotificationManager.notify(1, mBuilder.build())
    }
}
