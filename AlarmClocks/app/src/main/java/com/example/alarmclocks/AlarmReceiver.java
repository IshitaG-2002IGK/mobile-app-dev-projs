package com.example.alarmclocks;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Vibrator;
import android.widget.Toast;
public class AlarmReceiver extends BroadcastReceiver {
    //implement OnReceive Method
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context,"Alarm! Wake up! Wake up!",Toast.LENGTH_SHORT).show();

    }

}