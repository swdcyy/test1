package com.kuaishou.live.core.show.screenrecord.LiveScreenRecordForegroundService;
import android.app.Service;
import com.kuaishou.live.core.show.screenrecord.LiveScreenRecordForegroundService$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Build$VERSION;
import android.app.NotificationChannel;
import java.lang.CharSequence;
import s7.b;
import android.app.Notification;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.content.Intent;
import android.os.IBinder;
import android.app.Application;
import o56.a;
import android.media.projection.MediaProjectionManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Number;
import android.os.Parcelable;
import ekd.j0;
import android.content.ComponentName;
import android.content.Context;
import android.app.PendingIntent;
import androidx.core.app.NotificationCompat$Builder;
import o56.c;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.projection.MediaProjection;
import java.lang.Throwable;
import android.util.DisplayMetrics;
import cw9.c;
import android.view.Surface;
import android.hardware.display.VirtualDisplay$Callback;
import android.os.Handler;
import android.hardware.display.VirtualDisplay;
import ij2.j0;

public final class LiveScreenRecordForegroundService extends Service	// class@000fdb
{
    public final int b;
    public final String c;
    public MediaProjectionManager d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static MediaProjection j;
    public static VirtualDisplay k;
    public static j0 l;
    public static final LiveScreenRecordForegroundService$a m;

    static {
       LiveScreenRecordForegroundService.m = new LiveScreenRecordForegroundService$a(null);
       LiveScreenRecordForegroundService.e = "foreground_service_low";
       LiveScreenRecordForegroundService.f = "activityName";
       LiveScreenRecordForegroundService.g = "mediaProjectionIntent";
       LiveScreenRecordForegroundService.h = "recordWidth";
       LiveScreenRecordForegroundService.i = "recordHeight";
    }
    public void LiveScreenRecordForegroundService(){
       super();
       this.b = 0xf4242;
       this.c = "LiveScreenRecordProjection";
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveScreenRecordForegroundService.class, "7")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 26) {
          b.c(new NotificationChannel(LiveScreenRecordForegroundService.e, this.getString(R.string.arg_RES_7f101ce3), 4));
       }
       return;
    }
    public final void b(Notification p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveScreenRecordForegroundService.class, "5")) {
          return;
       }
       LiveLogTag lIVE_SCREEN_ = LiveLogTag.LIVE_SCREEN_RECORD;
       b.Z(lIVE_SCREEN_, "sendNotification ScreenRecordForegroundService");
       if (Build$VERSION.SDK_INT >= 29) {
          b.j(this, this.b, p0, 32);
       }else {
          b.i(this, this.b, p0);
       }
       b.Z(lIVE_SCREEN_, "sendNotification ScreenRecordForegroundService end");
       return;
    }
    public IBinder onBind(Intent p0){
       return null;
    }
    public void onCreate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveScreenRecordForegroundService.class, "1")) {
          return;
       }
       super.onCreate();
       b.Z(LiveLogTag.LIVE_SCREEN_RECORD, "onCreate ScreenRecordForegroundService");
       Object systemServic = a.b().getSystemService("media_projection");
       if (systemServic instanceof MediaProjectionManager) {
          objArray = systemServic;
       }
       this.d = objArray;
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveScreenRecordForegroundService.class, "3")) {
          return;
       }
       super.onDestroy();
       b.Z(LiveLogTag.LIVE_SCREEN_RECORD, "onDestroy ScreenRecordForegroundService");
       LiveScreenRecordForegroundService.l = null;
       return;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       Intent obj;
       int this;
       j0 l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LiveScreenRecordForegroundService.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveScreenRecordForegroundService.class, "2");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       b.Z(LiveLogTag.LIVE_SCREEN_RECORD, "onStartCommand ScreenRecordForegroundService");
       if (p0 != null) {
          obj = j0.d(p0, LiveScreenRecordForegroundService.g);
          int i = 0;
          int i1 = j0.b(p0, LiveScreenRecordForegroundService.h, i);
          this = j0.b(p0, LiveScreenRecordForegroundService.i, i);
          String str = j0.f(p0, LiveScreenRecordForegroundService.f);
          if (str == null) {
             str = "";
          }
          Notification notification = PatchProxy.applyOneRefs(str, this, LiveScreenRecordForegroundService.class, "6");
          String str1 = "AppEnv.get\(\).appContext";
          String str2 = "AppEnv.get\(\)";
          if (notification != patchProxyRe) {
          }else {
             Intent intent = new Intent("android.intent.action.MAIN");
             intent.addCategory("android.intent.category.LAUNCHER");
             intent.setComponent(new ComponentName(this.getPackageName(), str));
             intent.setFlags(0x10200000);
             PendingIntent activity = PendingIntent.getActivity(this, i, intent, i);
             this.a();
             c uoc1 = a.a();
             a.o(uoc1, str2);
             Application uApplication1 = uoc1.a();
             a.o(uApplication1, str1);
             notification = new NotificationCompat$Builder(this, LiveScreenRecordForegroundService.e).setContentTitle(this.getString(R.string.arg_RES_7f101c05)).setContentText(this.getString(R.string.arg_RES_7f102b44)).setLargeIcon(BitmapFactory.decodeResource(uApplication1.getResources(), R.drawable.arg_RES_7f0813b2)).setSmallIcon(R.drawable.notification_icon_small).setContentIntent(activity).setOnlyAlertOnce(true).build();
             a.o(notification, "NotificationCompat.Build¡­ce\(true\)\n        .build\(\)");
          }
          this.b(notification);
          if (LiveScreenRecordForegroundService.k == null && obj != null) {
             VirtualDisplay virtualDispl = null;
             try{
                LiveScreenRecordForegroundService td = this.d;
                MediaProjection mediaProject = (td != null)? td.getMediaProjection(-1, obj): virtualDispl;
                LiveScreenRecordForegroundService.j = mediaProject;
             }catch(java.lang.IllegalStateException e13){
                LiveScreenRecordForegroundService.j = virtualDispl;
                b.I(LiveLogTag.LIVE_SCREEN_RECORD, "getMediaProjection error", e13);
             }
             try{
                if (LiveScreenRecordForegroundService.j != null && (PatchProxy.isSupport(LiveScreenRecordForegroundService.class) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), Integer.valueOf(this), this, LiveScreenRecordForegroundService.class, "4") && LiveScreenRecordForegroundService.k == null))) {
                   c uoc = a.a();
                   a.o(uoc, str2);
                   Application uApplication = uoc.a();
                   a.o(uApplication, str1);
                   Resources resources = uApplication.getResources();
                   a.o(resources, "AppEnv.get\(\).appContext.resources");
                   DisplayMetrics uDisplayMetr = c.c(resources);
                   a.o(uDisplayMetr, "AppEnv.get\(\).appContext.resources.displayMetrics");
                   MediaProjection j = LiveScreenRecordForegroundService.j;
                   VirtualDisplay virtualDispl1 = (j != null)? j.createVirtualDisplay(this.c, i1, this, uDisplayMetr.densityDpi, 16, null, null, null): virtualDispl;
                   LiveScreenRecordForegroundService.k = virtualDispl1;
                }
             }catch(java.lang.RuntimeException e13){
                LiveScreenRecordForegroundService.k = virtualDispl;
                b.I(LiveLogTag.LIVE_SCREEN_RECORD, "Create virtual display error", e13);
             }
          }
       }
    label_016e :
       return 2;
    }
}
