package com.kwai.framework.download.d;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.download.DownloadManagerInitModule;
import o56.a;
import android.content.res.Resources;
import android.app.Application;
import android.app.NotificationChannel;
import java.lang.String;
import java.lang.CharSequence;
import android.net.Uri;
import android.media.AudioAttributes;
import s7.b;

public final class d implements Runnable	// class@001538
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void run(){
       NotificationChannel notification = new NotificationChannel("download_channel", a.B.getResources().getString(0x7f100c57), 2);
       notification.setSound(null, null);
       b.c(notification);
    }
}
