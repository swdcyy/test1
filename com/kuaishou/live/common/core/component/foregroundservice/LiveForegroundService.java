package com.kuaishou.live.common.core.component.foregroundservice.LiveForegroundService;
import android.app.Service;
import java.lang.String;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import androidx.core.content.ContextCompat;
import android.os.Build$VERSION;
import android.app.NotificationChannel;
import java.lang.CharSequence;
import s7.b;
import android.app.Notification;
import android.os.IBinder;
import androidx.core.app.NotificationCompat$Builder;
import android.content.res.Resources;
import o56.c;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.Integer;
import java.lang.Number;
import ekd.j0;
import android.content.ComponentName;
import android.app.PendingIntent;

public class LiveForegroundService extends Service	// class@00110f
{
    public int b;
    public static boolean c;
    public static boolean d;
    public static boolean e;

    public void LiveForegroundService(){
       super();
       this.b = 0xf4241;
    }
    public static Intent b(String p0,String p1){
       Intent obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveForegroundService.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Intent(a.b(), LiveForegroundService.class);
       obj.putExtra("activityName", p0);
       obj.putExtra("notiContent", p1);
       return obj;
    }
    public static void d(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LiveForegroundService.class, "11")) {
          return;
       }
       LiveLogTag lIVE_FOREGRO = LiveLogTag.LIVE_FOREGROUND_SERVICE;
       b.Z(lIVE_FOREGRO, "stop ForegroundService");
       p0.stopService(new Intent(a.b(), LiveForegroundService.class));
       b.Z(lIVE_FOREGRO, "stop ForegroundService end");
       LiveForegroundService.e = false;
       LiveForegroundService.d = false;
       return;
    }
    public static void e(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveForegroundService.class, "2")) {
          return;
       }
       LiveLogTag lIVE_FOREGRO = LiveLogTag.LIVE_FOREGROUND_SERVICE;
       b.c0(lIVE_FOREGRO, "try start ForegroundService", "sIsServiceStarting", Boolean.valueOf(LiveForegroundService.c));
       if (!LiveForegroundService.c) {
          b.Z(lIVE_FOREGRO, "start ForegroundService");
          ContextCompat.startForegroundService(p0, p1);
          b.Z(lIVE_FOREGRO, "start ForegroundService end");
          LiveForegroundService.c = true;
       }else {
          b.Z(lIVE_FOREGRO, "starting ForegroundService, ingore");
       }
       return;
    }
    public static void f(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LiveForegroundService.class, "3")) {
          return;
       }
       LiveLogTag lIVE_FOREGRO = LiveLogTag.LIVE_FOREGROUND_SERVICE;
       b.Z(lIVE_FOREGRO, "try stop ForegroundService");
       if (LiveForegroundService.c) {
          b.Z(lIVE_FOREGRO, "delay stop ForegroundService");
          LiveForegroundService.e = true;
       }else if(LiveForegroundService.d){
          LiveForegroundService.d(p0);
       }else {
          b.Z(lIVE_FOREGRO, "no ForegroundService running, ignore");
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveForegroundService.class, "8")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 26) {
          b.c(new NotificationChannel("kwai-live-channel-id", this.getString(R.string.arg_RES_7f101ce3), 4));
       }
       return;
    }
    public final void c(Notification p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveForegroundService.class, "6")) {
          return;
       }
       LiveLogTag lIVE_FOREGRO = LiveLogTag.LIVE_FOREGROUND_SERVICE;
       b.Z(lIVE_FOREGRO, "sendNotification");
       b.i(this, this.b, p0);
       b.Z(lIVE_FOREGRO, "sendNotification end");
       return;
    }
    public IBinder onBind(Intent p0){
       return null;
    }
    public void onCreate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveForegroundService.class, "4")) {
          return;
       }
       super.onCreate();
       b.Z(LiveLogTag.LIVE_FOREGROUND_SERVICE, "onCreate send Default Notification");
       Notification notification = PatchProxy.apply(objArray, this, LiveForegroundService.class, "9");
       if (notification != PatchProxyResult.class) {
       }else {
          this.a();
          notification = new NotificationCompat$Builder(this, "kwai-live-channel-id").setContentTitle(this.getString(R.string.arg_RES_7f101c05)).setContentText(a.b().getResources().getString(R.string.arg_RES_7f101e94)).setLargeIcon(BitmapFactory.decodeResource(a.a().a().getResources(), R.drawable.arg_RES_7f0813b2)).setSmallIcon(R.drawable.notification_icon_small).setOnlyAlertOnce(true).build();
       }
       this.c(notification);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveForegroundService.class, "10")) {
          return;
       }
       super.onDestroy();
       b.Z(LiveLogTag.LIVE_FOREGROUND_SERVICE, "ForegroundService onDestroy");
       LiveForegroundService.e = false;
       LiveForegroundService.d = false;
       return;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LiveForegroundService.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveForegroundService.class, "5");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       b.Z(LiveLogTag.LIVE_FOREGROUND_SERVICE, "onStartCommand");
       if (p0 != null) {
          String str = j0.f(p0, "activityName");
          String str1 = j0.f(p0, "notiContent");
          Notification notification = PatchProxy.applyTwoRefs(str, str1, this, LiveForegroundService.class, "7");
          if (notification != patchProxyRe) {
          }else {
             Intent intent = new Intent("android.intent.action.MAIN");
             intent.addCategory("android.intent.category.LAUNCHER");
             intent.setComponent(new ComponentName(this.getPackageName(), str));
             intent.setFlags(0x10200000);
             this.a();
             notification = new NotificationCompat$Builder(this, "kwai-live-channel-id").setContentTitle(this.getString(R.string.arg_RES_7f101c05)).setContentText(str1).setLargeIcon(BitmapFactory.decodeResource(a.a().a().getResources(), R.drawable.arg_RES_7f0813b2)).setSmallIcon(R.drawable.notification_icon_small).setContentIntent(PendingIntent.getActivity(this, false, intent, false)).setOnlyAlertOnce(true).build();
          }
          this.c(notification);
       }
       LiveForegroundService.c = false;
       LiveForegroundService.d = true;
       if (LiveForegroundService.e) {
          LiveForegroundService.d(this.getApplicationContext());
       }
       return 2;
    }
}
