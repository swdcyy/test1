package com.yxcorp.gifshow.im_rtc.service.IMRTCCallForegroundService;
import android.app.Service;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dc5.c;
import android.content.Intent;
import android.app.Application;
import o56.a;
import android.content.Context;
import java.lang.StringBuilder;
import androidx.core.content.ContextCompat;
import android.os.Build$VERSION;
import android.app.NotificationChannel;
import s7.b;
import java.lang.CharSequence;
import android.os.IBinder;
import com.kwai.robust.PatchProxyResult;
import android.app.Notification;
import androidx.core.app.NotificationCompat$Builder;
import android.content.res.Resources;
import java.lang.Integer;
import java.lang.Number;
import ekd.j0;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import android.app.PendingIntent;

public class IMRTCCallForegroundService extends Service	// class@00193c
{
    public static boolean b;
    public static boolean c;
    public static boolean d;

    public void IMRTCCallForegroundService(){
       super();
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, IMRTCCallForegroundService.class, "4")) {
          return;
       }
       c.g("IMRTCCallService", "stop");
       a.b().stopService(new Intent(a.b(), IMRTCCallForegroundService.class));
       IMRTCCallForegroundService.d = false;
       IMRTCCallForegroundService.c = false;
       return;
    }
    public static void c(String p0,String p1){
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, IMRTCCallForegroundService.class, "1")) {
          return;
       }
       String str = "IMRTCCallService";
       c.g(str, "tryStartService");
       if (IMRTCCallForegroundService.b) {
          c.c(str, "tryStartService, service is starting, ignore");
          return;
       }else {
          IMRTCCallForegroundService.b = true;
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, obj, IMRTCCallForegroundService.class, "2")) {
             c.g(str, "start with pendingIntent data"+p0);
             Intent intent = new Intent(a.b(), IMRTCCallForegroundService.class);
             intent.putExtra("scheme", p0);
             intent.putExtra("content", p1);
             ContextCompat.startForegroundService(a.b(), intent);
          }
          return;
       }
    }
    public static void d(){
       if (PatchProxy.applyVoid(null, null, IMRTCCallForegroundService.class, "3")) {
          return;
       }
       String str = "IMRTCCallService";
       c.g(str, "tryStopService");
       if (IMRTCCallForegroundService.b) {
          c.c(str, "tryStopService, service is starting, pending");
          IMRTCCallForegroundService.d = true;
       }else if(IMRTCCallForegroundService.c){
          IMRTCCallForegroundService.b();
       }else {
          c.g(str, "tryStopService, no service running, ignore");
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, IMRTCCallForegroundService.class, "10")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 26 && b.e(this, "foreground_service_high") == null) {
          b.c(new NotificationChannel("foreground_service_high", this.getString(R.string.arg_RES_7f103492), 4));
       }
       return;
    }
    public IBinder onBind(Intent p0){
       return null;
    }
    public void onCreate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, IMRTCCallForegroundService.class, "5")) {
          return;
       }
       super.onCreate();
       c.g("IMRTCCallService", "onCreate");
       Notification notification = PatchProxy.apply(objArray, this, IMRTCCallForegroundService.class, "8");
       if (notification != PatchProxyResult.class) {
       }else {
          this.a();
          notification = new NotificationCompat$Builder(this, "foreground_service_high").setContentTitle(this.getString(R.string.arg_RES_7f101c05)).setContentText(a.b().getResources().getString(R.string.arg_RES_7f101911)).setSmallIcon(R.drawable.notification_icon_small).setOnlyAlertOnce(true).build();
       }
       b.i(this, 0x4e21, notification);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, IMRTCCallForegroundService.class, "11")) {
          return;
       }
       super.onDestroy();
       c.g("IMRTCCallService", "onDestroy");
       IMRTCCallForegroundService.d = false;
       IMRTCCallForegroundService.c = false;
       return;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(IMRTCCallForegroundService.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, IMRTCCallForegroundService.class, "6");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       c.g("IMRTCCallService", "onStartCommand");
       String str = j0.f(p0, "scheme");
       String str1 = j0.f(p0, "content");
       if (!TextUtils.x(str) && Uri.parse(str) != null) {
          Uri uri = Uri.parse(str);
          str1 = TextUtils.k(str1);
          if (!PatchProxy.applyVoidTwoRefs(uri, str1, this, IMRTCCallForegroundService.class, "7")) {
             Notification notification = PatchProxy.applyTwoRefs(uri, str1, this, IMRTCCallForegroundService.class, "9");
             if (notification != patchProxyRe) {
             }else {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                intent.addCategory("android.intent.category.DEFAULT");
                PendingIntent activity = PendingIntent.getActivity(a.b(), false, intent, 0x8000000);
                this.a();
                notification = new NotificationCompat$Builder(this, "foreground_service_high").setContentTitle(this.getString(R.string.arg_RES_7f101c05)).setContentText(str1).setSmallIcon(R.drawable.notification_icon_small).setOnlyAlertOnce(true).setContentIntent(activity).build();
             }
             b.i(this, 0x4e21, notification);
          }
       }
       IMRTCCallForegroundService.b = false;
       IMRTCCallForegroundService.c = true;
       if (IMRTCCallForegroundService.d) {
          c.g("IMRTCCallService", "onStartCommand, is pending stopping, stop service");
          IMRTCCallForegroundService.b();
       }
       return 2;
    }
}
