package com.yxcorp.gifshow.init.module.l0;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.NotificationChannelInitModule;
import o56.a;
import android.content.res.Resources;
import android.app.Application;
import android.app.NotificationChannel;
import java.lang.String;
import java.lang.CharSequence;
import android.net.Uri;
import android.media.AudioAttributes;
import s7.b;

public final class l0 implements Runnable	// class@0019ca
{
    public static final l0 b;

    static {
       l0.b = new l0();
    }
    public void l0(){
       super();
    }
    public final void run(){
       NotificationChannel notification = new NotificationChannel("default_push_sdk_notify_channel", a.B.getResources().getString(0x7f103492), 2);
       notification.setSound(null, null);
       b.c(notification);
    }
}
