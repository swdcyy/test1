package com.meizu.cloud.pushsdk.notification.a;
import com.meizu.cloud.pushsdk.notification.c;
import android.content.Context;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.lang.String;
import android.app.NotificationManager;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import android.app.PendingIntent;
import android.app.Notification;
import android.app.Notification$Builder;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import android.content.Intent;
import java.lang.StringBuilder;
import java.lang.System;
import android.net.Uri;
import com.meizu.cloud.pushsdk.handler.d;
import android.os.Parcelable;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import android.graphics.Bitmap;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import java.lang.Exception;
import com.meizu.cloud.pushinternal.DebugLogger;
import android.content.pm.ApplicationInfo;
import com.meizu.cloud.pushsdk.c.a.b$b;
import com.meizu.cloud.pushsdk.c.a;
import com.meizu.cloud.pushsdk.c.a.b;
import com.meizu.cloud.pushsdk.c.a.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import com.meizu.cloud.pushsdk.b;
import com.meizu.cloud.pushsdk.handler.a.a.a;
import android.graphics.drawable.Icon;
import com.meizu.cloud.pushsdk.notification.c.c;
import java.lang.Thread;
import android.content.res.Resources;
import com.meizu.cloud.pushsdk.notification.c.b;
import android.os.Bundle;
import java.lang.Math;
import com.meizu.cloud.pushsdk.notification.model.a;
import com.meizu.cloud.pushsdk.util.b;
import java.lang.Integer;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSettingEx;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import android.app.NotificationChannel;
import android.media.AudioAttributes;

public abstract class a implements c	// class@001566
{
    public final Context a;
    public final PushNotificationBuilder b;
    public final NotificationManager c;
    public final Handler d;

    public void a(Context p0,PushNotificationBuilder p1){
       super();
       this.b = p1;
       this.a = p0;
       this.d = new Handler(p0.getMainLooper());
       this.c = p0.getSystemService("notification");
    }
    public final Notification a(MessageV3 p0,PendingIntent p1,PendingIntent p2,PendingIntent p3){
       Notification$Builder uBuilder = new Notification$Builder(this.a);
       this.a(uBuilder, p0, p1, p2);
       this.c(uBuilder, p0);
       this.b(uBuilder, p0);
       this.a(uBuilder, p0);
       this.d(uBuilder, p0);
       Notification notification = (MinSdkChecker.isSupportNotificationBuild())? uBuilder.build(): uBuilder.getNotification();
       this.b(notification, p0);
       this.a(notification, p0);
       this.a(notification, p0, p3);
       return notification;
    }
    public final PendingIntent a(MessageV3 p0,String p1,boolean p2){
       Intent intent = new Intent();
       intent.setData(Uri.parse("custom://"+System.currentTimeMillis()));
       if (p2 && MinSdkChecker.isSupportTransmitMessageValue(this.a, p1)) {
          intent.putExtra("messageValue", d.a(p0));
       }else {
          intent.putExtra("pushMessage", p0);
       }
       intent.putExtra("method", "private");
       intent.setClassName(p1, MzSystemUtils.findReceiver(this.a, "com.meizu.flyme.push.intent.MESSAGE", p1));
       intent.setAction("com.meizu.flyme.push.intent.MESSAGE");
       intent.setFlags(32);
       return PendingIntent.getBroadcast(this.a, 0, intent, 0x40000000);
    }
    public Bitmap a(Context p0,String p1){
       Bitmap uBitmap;
       try{
          Drawable applicationI = p0.getPackageManager().getApplicationIcon(p1);
          uBitmap = null;
          if (Build$VERSION.SDK_INT < 26 || applicationI instanceof BitmapDrawable) {
          }else if(applicationI instanceof AdaptiveIconDrawable){
             Bitmap uBitmap1 = Bitmap.createBitmap(applicationI.getIntrinsicWidth(), applicationI.getIntrinsicHeight(), Bitmap$Config.ARGB_8888);
             Canvas uCanvas = new Canvas(uBitmap1);
             applicationI.setBounds(0, 0, uCanvas.getWidth(), uCanvas.getHeight());
             applicationI.draw(uCanvas);
             applicationI = uBitmap;
             uBitmap = uBitmap1;
          }else {
             applicationI = uBitmap;
          }
          if (uBitmap == null) {
             uBitmap = applicationI.getBitmap();
          }
       }catch(java.lang.Exception e8){
          DebugLogger.i("AbstractPushNotification", "get app icon error "+e8.getMessage());
          uBitmap = p0.getApplicationInfo().loadIcon(p0.getPackageManager()).getBitmap();
       }
       return uBitmap;
    }
    public Bitmap a(String p0){
       c uoc = a.a(p0).a().b();
       if (uoc.b() && uoc.a() != null) {
          StringBuilder str = "ANRequest On other Thread down load largeIcon "+p0+"image ";
          p0 = (uoc.a() != null)? "success": "fail";
          DebugLogger.i("AbstractPushNotification", str+p0);
          return uoc.a();
       }else {
          DebugLogger.i("AbstractPushNotification", "ANRequest On other Thread down load largeIcon "+p0+"image fail");
          return null;
       }
    }
    public String a(MessageV3 p0){
       String str = null;
       try{
          if (!TextUtils.isEmpty(p0.getNotificationMessage())) {
             str = new JSONObject(p0.getNotificationMessage()).getJSONObject("data").getJSONObject("extra").getString("fns");
          }
       }catch(java.lang.Exception e5){
          DebugLogger.e("AbstractPushNotification", "parse flyme notification setting error "+e5.getMessage());
       }
       DebugLogger.i("AbstractPushNotification", "current FlymeGreen notification setting is "+str);
       return str;
    }
    public final void a(int p0,String p1,MessageV3 p2){
       if (p2 == null || (p2.getAdvertisementOption() != null && !TextUtils.isEmpty(p2.getAdvertisementOption().getAdPackage()))) {
          DebugLogger.e("AbstractPushNotification", "save ad and recovery package, uploadDataPackageName:"+p1);
          a uoa = b.a(this.a).b();
          if (uoa != null) {
             uoa.a(p2);
             uoa.a(p0, this.a(p2, this.c(p2), this.e(p2), this.f(p2)), p2.getAdvertisementOption().getPriorityValidTime());
          }
          p2.setUploadDataPackageName(p1);
       }
    label_005a :
       return;
    }
    public void a(Notification$Builder p0,MessageV3 p1){
    }
    public final void a(Notification$Builder p0,MessageV3 p1,PendingIntent p2,PendingIntent p3){
       int i;
       p0.setContentTitle(p1.getTitle());
       p0.setContentText(p1.getContent());
       p0.setTicker(p1.getTitle());
       boolean b = true;
       p0.setAutoCancel(b);
       if (MinSdkChecker.isSupportSendNotification()) {
          p0.setVisibility(b);
       }
       if (MinSdkChecker.isSupportSetDrawableSmallIcon()) {
          Icon icon = this.b(p1.getUploadDataPackageName());
          if (icon != null) {
             p0.setSmallIcon(icon);
          label_006f :
             p0.setContentIntent(p2);
             p0.setDeleteIntent(p3);
             return;
          }else {
             DebugLogger.e("AbstractPushNotification", "cannot get "+p1.getUploadDataPackageName()+" smallIcon");
          }
       }else {
          a tb = this.b;
          if (tb != null && tb.getStatusBarIcon()) {
             i = this.b.getStatusBarIcon();
          label_006c :
             p0.setSmallIcon(i);
             goto label_006f ;
          }
       }
       i = c.l(this.a);
       goto label_006c ;
    }
    public void a(Notification p0,MessageV3 p1){
    }
    public void a(Notification p0,MessageV3 p1,PendingIntent p2){
    }
    public boolean a(){
       boolean b = (Thread.currentThread() == this.a.getMainLooper().getThread())? true: false;
       return b;
    }
    public final Icon b(String p0){
       Icon icon = null;
       try{
          int identifier = this.a.getPackageManager().getResourcesForApplication(p0).getIdentifier("mz_push_notification_small_icon", "drawable", p0);
          if (identifier) {
             DebugLogger.i("AbstractPushNotification", "get "+p0+" smallIcon success resId "+identifier);
             icon = Icon.createWithResource(p0, identifier);
          }
       }catch(java.lang.Exception e2){
          DebugLogger.e("AbstractPushNotification", "cannot load smallIcon form package "+p0+" Error message "+e2.getMessage());
       }
       return icon;
    }
    public final String b(Context p0,String p1){
       String str = null;
       try{
          PackageManager packageManag = p0.getPackageManager();
          ApplicationInfo applicationI = packageManag.getApplicationInfo(p1, 0);
          if (applicationI != null) {
             CharSequence applicationL = packageManag.getApplicationLabel(applicationI);
             if (applicationL != null) {
                str = applicationL;
             }
          }
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          DebugLogger.e("AbstractPushNotification", "can not find "+p1+" application info");
       }
       return e0;
    }
    public void b(Notification$Builder p0,MessageV3 p1){
    }
    public final void b(Notification p0,MessageV3 p1){
       b.a(p0, true);
       b.a(p0, this.g(p1));
       p0.extras.putString("android.originalPackageName", p1.getUploadDataPackageName());
       p0.extras.putString("android.flymeNotificationSetting", this.a(p1));
       p0.extras.putString("notification_extra_task_id", p1.getTaskId());
       p0.extras.putString("notification_extra_seq_id", p1.getSeqId());
       p0.extras.putString("notification_extra_device_id", p1.getDeviceId());
       p0.extras.putString("notification_extra_push_timestamp", p1.getPushTimestamp());
       if (!TextUtils.isEmpty(this.b.getAppLabel())) {
          DebugLogger.e("AbstractPushNotification", "set app label "+this.b.getAppLabel());
          p0.extras.putString("android.substName", this.b.getAppLabel());
       }else {
          String str = this.b(this.a, p1.getUploadDataPackageName());
          DebugLogger.e("AbstractPushNotification", "current package "+p1.getUploadDataPackageName()+" label is "+str);
          if (!TextUtils.isEmpty(str)) {
             p0.extras.putString("android.substName", str);
          }
       }
       return;
    }
    public void b(MessageV3 p0){
       String str = (p0.getAdvertisementOption() != null && !TextUtils.isEmpty(p0.getAdvertisementOption().getAdPackage()))? this.h(p0): null;
       Notification notification = this.a(p0, this.c(p0), this.e(p0), this.f(p0));
       int i = Math.abs((int)System.currentTimeMillis());
       a uoa = a.a(p0);
       if (uoa != null && uoa.a()) {
          i = uoa.a();
          DebugLogger.e("AbstractPushNotification", "server notify id "+i);
          if (!TextUtils.isEmpty(uoa.b())) {
             int i1 = b.i(this.a, p0.getUploadDataPackageName(), uoa.b());
             DebugLogger.e("AbstractPushNotification", "notifyKey "+uoa.b()+" preference notifyId is "+i1);
             if (i1) {
                DebugLogger.e("AbstractPushNotification", "use preference notifyId "+i1+" and cancel it");
                this.c.cancel(i1);
             }
             DebugLogger.e("AbstractPushNotification", "store new notifyId "+i+" by notifyKey "+uoa.b());
             b.b(this.a, p0.getUploadDataPackageName(), uoa.b(), i);
          }
       }
       DebugLogger.e("AbstractPushNotification", "current notify id "+i);
       if (p0.isDiscard()) {
          if (!b.c(this.a, p0.getPackageName())) {
             b.a(this.a, p0.getPackageName(), i);
             DebugLogger.i("AbstractPushNotification", "no notification show so put notification id "+i);
          }
          String str1 = "current package ";
          if (!TextUtils.isEmpty(p0.getTaskId())) {
             if (!b.d(this.a, p0.getPackageName())) {
                b.b(this.a, p0.getPackageName(), Integer.valueOf(p0.getTaskId()).intValue());
             }else if(Integer.valueOf(p0.getTaskId()).intValue() < b.d(this.a, p0.getPackageName())){
                DebugLogger.i("AbstractPushNotification", str1+p0.getPackageName()+" task id "+p0.getTaskId()+" don\'t show notification");
                return;
             }else {
                b.b(this.a, p0.getPackageName(), Integer.valueOf(p0.getTaskId()).intValue());
                i = b.c(this.a, p0.getPackageName());
             }
          }
          DebugLogger.i("AbstractPushNotification", str1+p0.getPackageName()+" notificationId="+i+" taskId="+p0.getTaskId());
       }
       if (p0.getAdvertisementOption() != null && !TextUtils.isEmpty(p0.getAdvertisementOption().getAdPackage())) {
          this.a(i, str, p0);
       }
       this.c.notify(i, notification);
       return;
    }
    public final PendingIntent c(MessageV3 p0){
       String packageName;
       boolean b;
       if (this.d(p0)) {
          packageName = p0.getPackageName();
          b = false;
       }else {
          packageName = p0.getUploadDataPackageName();
          b = true;
       }
       return this.a(p0, packageName, b);
    }
    public final void c(Notification$Builder p0,MessageV3 p1){
       StringBuilder str;
       boolean b;
       AdvanceSetting advanceSetti = p1.getAdvanceSetting();
       AdvanceSettingEx advanceSetti1 = p1.getAdvanceSettingEx();
       if (advanceSetti == null) {
          return;
       }
       int i = 0;
       if (advanceSetti1 != null && !TextUtils.isEmpty(advanceSetti1.getSoundTitle())) {
          Uri uri = b.b(this.a, advanceSetti1.getSoundTitle());
          if (uri != null) {
             DebugLogger.e("AbstractPushNotification", "advance setting builder, sound:"+uri);
             p0.setSound(uri);
             str = null;
          }else {
             str = 1;
          }
       }else {
          str = advanceSetti.getNotifyType().isSound();
       }
       if (advanceSetti.getNotifyType() != null) {
          b = advanceSetti.getNotifyType().isVibrate();
          boolean b1 = advanceSetti.getNotifyType().isLights();
          if (!b && (b1 || str)) {
             if (b) {
                i = 2;
             }
             if (b1) {
                i = i | 0x04;
             }
             if (str) {
                i = i | 0x01;
             }
             DebugLogger.e("AbstractPushNotification", "advance setting builder, defaults:"+i);
             p0.setDefaults(i);
          }
       }
       DebugLogger.e("AbstractPushNotification", "advance setting builder, ongoing:"+(advanceSetti.isClearNotification() ^ 1));
       p0.setOngoing((advanceSetti.isClearNotification() ^ 1));
       if (advanceSetti1 != null && MinSdkChecker.isSupportNotificationBuild()) {
          DebugLogger.e("AbstractPushNotification", "advance setting builder, priority:"+advanceSetti1.getPriorityDisplay());
          p0.setPriority(advanceSetti1.getPriorityDisplay());
       }
       return;
    }
    public final void d(Notification$Builder p0,MessageV3 p1){
       String str;
       String str1;
       NotificationChannel notification;
       if (!MinSdkChecker.isSupportNotificationChannel()) {
          return;
       }
       AdvanceSetting advanceSetti = p1.getAdvanceSetting();
       AdvanceSettingEx advanceSetti1 = p1.getAdvanceSettingEx();
       int priorityDisp = (advanceSetti1 != null)? advanceSetti1.getPriorityDisplay(): 0;
       if (Build$VERSION.SDK_INT >= 29 && (advanceSetti.isHeadUpNotification() && advanceSetti1.getPriorityDisplay() < 1)) {
          priorityDisp = 1;
       }
    label_002b :
       int i = 2;
       if (priorityDisp != -2) {
          if (priorityDisp != -1) {
             if (priorityDisp != 1) {
                if (priorityDisp != i) {
                   i = 3;
                   str = "mz_push_notification_channel";
                   str1 = "MEIZUPUSH";
                }else {
                   i = 5;
                   str = "mz_push_notification_channel_max";
                   str1 = "MEIZUPUSHMAX";
                }
             }else {
                i = 4;
                str = "mz_push_notification_channel_high";
                str1 = "MEIZUPUSHHIGH";
             }
          }else {
             str = "mz_push_notification_channel_low";
             str1 = "MEIZUPUSHLOW";
          }
       }else {
          str = "mz_push_notification_channel_min";
          str1 = "MEIZUPUSHMIN";
          i = 1;
       }
       Uri uri = (advanceSetti1.getSoundTitle() != null)? b.b(this.a, advanceSetti1.getSoundTitle()): null;
       if (!advanceSetti.getNotifyType().isSound() && advanceSetti1.getSoundTitle() == null) {
          str = str+"_mute";
          str1 = str1+"_MUTE";
       }else if(uri != null){
          str1 = str1+"_"+(advanceSetti1.getSoundTitle()).toUpperCase();
          str = str+"_"+(advanceSetti1.getSoundTitle()).toLowerCase();
       }
       DebugLogger.e("AbstractPushNotification", "notification channel builder, channelId: "+str+", channelName: "+str1+", importance:"+i+", sound: "+uri);
       notification = new NotificationChannel(str, str1, i);
       notification.enableLights(true);
       notification.setLightColor(-16711936);
       notification.setShowBadge(true);
       notification.enableVibration(true);
       if (!advanceSetti.getNotifyType().isSound() && advanceSetti1.getSoundTitle() == null) {
          notification.setSound(null, Notification.AUDIO_ATTRIBUTES_DEFAULT);
       }else if(uri != null){
          notification.setSound(uri, Notification.AUDIO_ATTRIBUTES_DEFAULT);
       }
       this.c.createNotificationChannel(notification);
       p0.setChannelId(str);
       return;
    }
    public final boolean d(MessageV3 p0){
       if (p0.getAdvertisementOption() != null && !TextUtils.isEmpty(p0.getAdvertisementOption().getAdPackage())) {
          return true;
       }
       if (p0.getWhiteList() && !MzSystemUtils.isExistReceiver(this.a, p0.getUploadDataPackageName(), "com.meizu.flyme.push.intent.MESSAGE")) {
          return true;
       }
       return false;
    }
    public final PendingIntent e(MessageV3 p0){
       Intent intent = new Intent();
       intent.setData(Uri.parse("custom://"+System.currentTimeMillis()));
       intent.putExtra("pushMessage", p0);
       intent.putExtra("method", "notification_delete");
       intent.setClassName(p0.getPackageName(), MzSystemUtils.findReceiver(this.a, "com.meizu.flyme.push.intent.MESSAGE", p0.getPackageName()));
       intent.setAction("com.meizu.flyme.push.intent.MESSAGE");
       return PendingIntent.getBroadcast(this.a, 0, intent, 0x40000000);
    }
    public final PendingIntent f(MessageV3 p0){
       Intent intent = new Intent();
       intent.setData(Uri.parse("custom://"+System.currentTimeMillis()));
       intent.putExtra("pushMessage", p0);
       intent.putExtra("method", "notification_close");
       intent.setClassName(p0.getPackageName(), MzSystemUtils.findReceiver(this.a, "com.meizu.flyme.push.intent.MESSAGE", p0.getPackageName()));
       intent.setAction("com.meizu.flyme.push.intent.MESSAGE");
       return PendingIntent.getBroadcast(this.a, 0, intent, 0x40000000);
    }
    public final PendingIntent g(MessageV3 p0){
       Intent intent = new Intent();
       intent.setData(Uri.parse("custom://"+System.currentTimeMillis()));
       intent.putExtra("notification_state_message", p0.getNotificationMessage());
       intent.putExtra("notification_extra_task_id", p0.getTaskId());
       intent.putExtra("notification_extra_seq_id", p0.getSeqId());
       intent.putExtra("notification_extra_device_id", p0.getDeviceId());
       intent.putExtra("notification_extra_push_timestamp", p0.getPushTimestamp());
       intent.putExtra("notification_extra_show_package_name", p0.getUploadDataPackageName());
       intent.putExtra("mz_push_white_list", p0.getWhiteList());
       intent.putExtra("mz_push_delayed_report_millis", p0.getDelayedReportMillis());
       intent.putExtra("method", "notification_state");
       intent.setClassName(p0.getPackageName(), MzSystemUtils.findReceiver(this.a, "com.meizu.flyme.push.intent.MESSAGE", p0.getPackageName()));
       intent.setAction("com.meizu.flyme.push.intent.MESSAGE");
       return PendingIntent.getBroadcast(this.a, 0, intent, 0x40000000);
    }
    public final String h(MessageV3 p0){
       if (p0 != null && (p0.getAdvertisementOption() == null || TextUtils.isEmpty(p0.getAdvertisementOption().getAdPackage()))) {
          return null;
       }
       String uploadDataPa = p0.getUploadDataPackageName();
       String adPackage = p0.getAdvertisementOption().getAdPackage();
       DebugLogger.e("AbstractPushNotification", "again show old ad and replace package, uploadDataPackageName:"+uploadDataPa+", adPackageName:"+adPackage);
       a uoa = b.a(this.a).b();
       if (uoa != null) {
          uoa.a();
       }
       p0.setUploadDataPackageName(adPackage);
       return uploadDataPa;
    }
}
