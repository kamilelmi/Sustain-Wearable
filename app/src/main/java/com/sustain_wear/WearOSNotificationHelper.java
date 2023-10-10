package com.sustain_wear;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;

public class WearOSNotificationHelper {
    private static final String CHANNEL_ID = "my_channel_id"; // Unique channel ID
    private static final int NOTIFICATION_ID = 1; // Unique notification ID

    public static void postLocalNotification(Context context, String title, String message) {
        // Create a notification builder
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_bulb)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        // Create a notification manager
        NotificationManager notificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        // Create a notification channel for API 26+ (Oreo and above)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "Channel Name", NotificationManager.IMPORTANCE_DEFAULT);
            notificationManager.createNotificationChannel(channel);
        }

        // Build the notification and display it
        Notification notification = builder.build();
        notificationManager.notify(NOTIFICATION_ID, notification);
    }
}
