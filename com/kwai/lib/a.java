package com.kwai.lib.a;
import fv6.e;
import java.lang.Object;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.app.PendingIntent;
import androidx.core.app.e;
import android.os.Build$VERSION;
import android.app.NotificationChannel;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.lang.CharSequence;
import android.net.Uri;
import android.media.AudioAttributes;
import android.app.Notification$Builder;
import android.app.Notification;
import android.os.Handler;
import android.os.Looper;
import fv6.d;
import java.lang.Runnable;

public final class a implements e	// class@000815
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public void a(Context p0,Intent p1){
       a.p(p0, "context");
       a.p(p1, "intent");
       p1.putExtra("type", "FullScreenEfforts");
       PendingIntent activity = PendingIntent.getActivity(p0, 0x27d7, p1, 0x8000000);
       a.o(activity, "getActivity\(\n            context, 10199, intent,\n            PendingIntent.FLAG_UPDATE_CURRENT\n        \)");
       e uoe = e.e(p0);
       a.o(uoe, "from\(context\)");
       int sDK_INT = Build$VERSION.SDK_INT;
       ApplicationInfo uApplication = 26;
       if (sDK_INT >= uApplication) {
          NotificationChannel notification = new NotificationChannel("spring_effort", p0.getApplicationInfo().loadLabel(p0.getPackageManager()), 4);
          notification.enableLights(false);
          notification.setShowBadge(false);
          notification.setBypassDnd(true);
          notification.setSound(null, null);
          uoe.d(notification);
       }
       Notification$Builder uBuilder = (sDK_INT >= uApplication)? new Notification$Builder(p0, "spring_effort"): new Notification$Builder(p0);
       uBuilder.setSmallIcon(p0.getApplicationInfo().icon);
       uBuilder.setContentTitle("");
       uBuilder.setDeleteIntent(PendingIntent.getActivity(p0, 1000, p1, 0x40000000));
       uBuilder.setFullScreenIntent(activity, true);
       uBuilder.setVisibility(true);
       uoe.c("spring_effort", 0x2777);
       uoe.j("spring_effort", 0x2777, uBuilder.getNotification());
       activity.send();
       new Handler(Looper.getMainLooper()).postDelayed(new d(uoe), 500);
       return;
    }
}
