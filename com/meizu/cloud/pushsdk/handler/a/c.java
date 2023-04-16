package com.meizu.cloud.pushsdk.handler.a.c;
import com.meizu.cloud.pushsdk.handler.a.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import java.lang.Object;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import android.content.Intent;
import java.lang.String;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.util.d;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.handler.b;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.meizu.cloud.pushsdk.notification.model.styleenum.BaseStyleModel;
import com.meizu.cloud.pushsdk.notification.model.styleenum.InnerStyleLayout;
import com.meizu.cloud.pushsdk.notification.b.c;
import com.meizu.cloud.pushsdk.notification.b.b;
import com.meizu.cloud.pushsdk.notification.b.a;
import com.meizu.cloud.pushsdk.notification.a.d;
import com.meizu.cloud.pushsdk.notification.b;
import com.meizu.cloud.pushsdk.notification.a.c;
import com.meizu.cloud.pushsdk.notification.a.b;
import com.meizu.cloud.pushsdk.notification.a.a;
import com.meizu.cloud.pushsdk.notification.d;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import com.meizu.cloud.pushsdk.notification.model.BrightRemindSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import com.meizu.cloud.pushsdk.util.b;
import java.lang.StringBuilder;
import java.lang.System;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import java.lang.Long;
import android.app.AlarmManager;
import com.meizu.cloud.pushsdk.NotificationService;
import java.lang.Class;
import android.net.Uri;
import android.os.Parcelable;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import android.app.PendingIntent;
import java.text.SimpleDateFormat;
import java.util.Date;
import android.os.SystemClock;
import com.meizu.cloud.pushsdk.b;
import com.meizu.cloud.pushsdk.handler.a.f.a;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import org.json.JSONObject;

public class c extends a	// class@001546
{

    public void c(Context p0,a p1){
       super(p0, p1);
    }
    public int a(){
       return 4;
    }
    public c a(Object p0){
       return this.f(p0);
    }
    public void a(MessageV3 p0,c p1){
       if (p1 != null) {
          p1.b(p0);
          this.a(p0);
       }
       return;
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public boolean a(Intent p0){
       DebugLogger.i("AbstractMessageHandler", "start MessageV3Handler match");
       if (!this.a(0, this.g(p0))) {
          return 0;
       }
       if (("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction()) && ("notification_show_v3").equals(this.k(p0))) {
          return true;
       }
       if (TextUtils.isEmpty(this.k(p0))) {
          String stringExtra = p0.getStringExtra("message");
          if (!TextUtils.isEmpty(stringExtra) && this.a(stringExtra)) {
             DebugLogger.e("AbstractMessageHandler", "old cloud notification message");
             return true;
          }
       }
       return 0;
    }
    public boolean a(Object p0,String p1){
       return this.b(p0, p1);
    }
    public void b(Object p0){
       this.d(p0);
    }
    public boolean b(MessageV3 p0,String p1){
       return this.a(p0, p1);
    }
    public Object c(Intent p0){
       return this.l(p0);
    }
    public void c(Object p0){
       this.e(p0);
    }
    public int d(Object p0){
       return this.h(p0);
    }
    public void d(MessageV3 p0){
       d.b(this.d(), p0.getUploadDataPackageName(), p0.getDeviceId(), p0.getTaskId(), p0.getSeqId(), p0.getPushTimestamp(), p0.getDelayedReportMillis());
    }
    public void e(MessageV3 p0){
       d.a(this.d(), p0.getUploadDataPackageName(), p0.getDeviceId(), p0.getTaskId(), p0.getSeqId(), p0.getPushTimestamp(), p0.getDelayedReportMillis());
    }
    public void e(Object p0){
       this.i(p0);
    }
    public c f(MessageV3 p0){
       int innerStyle;
       PushNotificationBuilder pushNotifica = new PushNotificationBuilder(this.d());
       pushNotifica.setClickPackageName(this.k(p0));
       this.c().a(pushNotifica);
       c uoc = null;
       if (p0.getNotificationStyle() != null) {
          int baseStyle = p0.getNotificationStyle().getBaseStyle();
          if (BaseStyleModel.FLYME.getCode() == baseStyle) {
             innerStyle = p0.getNotificationStyle().getInnerStyle();
             if (InnerStyleLayout.EXPANDABLE_STANDARD.getCode() == innerStyle) {
                DebugLogger.i("AbstractMessageHandler", "show Standard Notification with Expandable disable");
                uoc = new c(this.d(), pushNotifica);
             }else if(InnerStyleLayout.EXPANDABLE_TEXT.getCode() == innerStyle){
                DebugLogger.i("AbstractMessageHandler", "show Standard Notification with Expandable Text");
                uoc = new b(this.d(), pushNotifica);
             }else if(InnerStyleLayout.EXPANDABLE_PIC.getCode() == innerStyle){
                DebugLogger.i("AbstractMessageHandler", "show Standard Notification with Expandable Picture");
                uoc = new a(this.d(), pushNotifica);
             }else if(InnerStyleLayout.EXPANDABLE_VIDEO.getCode() == innerStyle){
                DebugLogger.i("AbstractMessageHandler", "show Flyme Video notification");
                uoc = new d(this.d(), pushNotifica);
             }
          }else if(BaseStyleModel.PURE_PICTURE.getCode() == baseStyle){
             uoc = new b(this.d(), pushNotifica);
             DebugLogger.i("AbstractMessageHandler", "show Pure Picture Notification");
          }else if(BaseStyleModel.ANDROID.getCode() == baseStyle){
             innerStyle = p0.getNotificationStyle().getInnerStyle();
             if (InnerStyleLayout.EXPANDABLE_STANDARD.getCode() == innerStyle) {
                DebugLogger.i("AbstractMessageHandler", "show Android  Notification with Expandable disable");
                uoc = new c(this.d(), pushNotifica);
             }else if(InnerStyleLayout.EXPANDABLE_TEXT.getCode() == innerStyle){
                DebugLogger.i("AbstractMessageHandler", "show Android  Notification with Expandable Text");
                uoc = new b(this.d(), pushNotifica);
             }else if(InnerStyleLayout.EXPANDABLE_PIC.getCode() == innerStyle){
                DebugLogger.i("AbstractMessageHandler", "show Android  Notification with Expandable Picture");
                uoc = new a(this.d(), pushNotifica);
             }else if(InnerStyleLayout.EXPANDABLE_VIDEO.getCode() == innerStyle){
                DebugLogger.i("AbstractMessageHandler", "show Flyme Video notification");
                uoc = new d(this.d(), pushNotifica);
             }
          }
       }
       if (uoc == null) {
          DebugLogger.e("AbstractMessageHandler", "use standard v2 notification");
          uoc = new d(this.d(), pushNotifica);
       }
       return uoc;
    }
    public void f(Object p0){
       this.j(p0);
    }
    public boolean g(MessageV3 p0){
       String uriPackageNa = p0.getUriPackageName();
       boolean b = (!TextUtils.isEmpty(uriPackageNa))? MzSystemUtils.isPackageInstalled(this.d(), uriPackageNa): true;
       return b;
    }
    public boolean g(Object p0){
       return this.g(p0);
    }
    public int h(MessageV3 p0){
       Context uContext;
       String taskId;
       String deviceId;
       String str;
       int i1;
       int i = 0;
       if (p0.getBrightRemindSetting() != null && (p0.getBrightRemindSetting().getIsBrightRemind() && !MzSystemUtils.isInteractive(this.d()))) {
          i = 4;
       }else if(p0.getAdvertisementOption() != null && !TextUtils.isEmpty(p0.getAdvertisementOption().getAdInstallPackage())){
          long l = b.m(this.d(), p0.getAdvertisementOption().getAdPackage());
          DebugLogger.i("AbstractMessageHandler", "ad message last click time is: "+l);
          if (l && (l + 0x48190800) - System.currentTimeMillis() > 0) {
             i = 5;
             d.f(this.d(), p0.getAdvertisementOption().getAdInstallPackage(), p0.getDeviceId(), p0.getTaskId(), p0.getSeqId(), p0.getPushTimestamp());
          }
       }else if(p0.getTimeDisplaySetting() == null || !p0.getTimeDisplaySetting().isTimeDisplay()){
          if (System.currentTimeMillis() - Long.valueOf(p0.getTimeDisplaySetting().getEndShowTime()).longValue() > 0) {
             i = 1;
             uContext = this.d();
             taskId = p0.getTaskId();
             deviceId = p0.getDeviceId();
             str = "schedule notification expire";
          }else if(System.currentTimeMillis() - Long.valueOf(p0.getTimeDisplaySetting().getStartShowTime()).longValue() > 0){
             i = 2;
             uContext = this.d();
             i1 = 2201;
             taskId = p0.getTaskId();
             deviceId = p0.getDeviceId();
             str = "schedule notification on time";
          }else {
             i = 3;
             uContext = this.d();
             i1 = 2202;
             taskId = p0.getTaskId();
             deviceId = p0.getDeviceId();
             str = "schedule notification delay";
          }
          d.a(uContext, str, 2200, taskId, deviceId);
       }
       return i;
    }
    public void i(MessageV3 p0){
       AlarmManager systemServic = this.d().getSystemService("alarm");
       Intent intent = new Intent(this.d(), NotificationService.class);
       intent.setPackage(p0.getPackageName());
       intent.addCategory(p0.getPackageName());
       intent.setData(Uri.parse("custom://"+System.currentTimeMillis()));
       intent.putExtra("command_type", "reflect_receiver");
       intent.setAction("com.meizu.flyme.push.intent.MESSAGE");
       intent.putExtra("extra_app_push_schedule_notification_message", p0);
       intent.putExtra("method", "schedule_notification");
       int i = (MinSdkChecker.isSupportSetDrawableSmallIcon())? 0x4000000: 0x40000000;
       PendingIntent service = PendingIntent.getService(this.d(), 0, intent, i);
       String startShowTim = p0.getTimeDisplaySetting().getStartShowTime();
       SimpleDateFormat simpleDateFo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Date uDate = null;
       if (!TextUtils.isEmpty(startShowTim)) {
          uDate = simpleDateFo.format(new Date(Long.valueOf(startShowTim).longValue()));
       }
       long l = Long.valueOf(startShowTim).longValue() - System.currentTimeMillis();
       String str = "AbstractMessageHandler";
       DebugLogger.i(str, "after "+(l / 1000)+" seconds Notification AlarmManager execute At "+uDate);
       if (systemServic != null) {
          DebugLogger.i(str, "setAlarmManager setExact ELAPSED_REALTIME_WAKEUP");
          systemServic.setExact(2, (SystemClock.elapsedRealtime() + l), service);
       }else if(systemServic != null){
          DebugLogger.i(str, "setAlarmManager set ELAPSED_REALTIME_WAKEUP");
          systemServic.set(2, (SystemClock.elapsedRealtime() + l), service);
       }
       return;
    }
    public void j(MessageV3 p0){
       Intent intent = new Intent(this.d(), NotificationService.class);
       intent.setPackage(p0.getPackageName());
       intent.addCategory(p0.getPackageName());
       intent.setData(Uri.parse("custom://"+System.currentTimeMillis()));
       intent.putExtra("command_type", "reflect_receiver");
       intent.setAction("com.meizu.flyme.push.intent.MESSAGE");
       intent.putExtra("extra_app_push_bright_notification_message", p0);
       intent.putExtra("method", "bright_notification_message");
       a uoa = b.a(this.d()).a();
       if (uoa != null) {
          uoa.a(intent, p0.getUploadDataPackageName());
       }
       return;
    }
    public final String k(MessageV3 p0){
       String selfDefineCo = MzPushMessage.fromMessageV3(p0).getSelfDefineContentString();
       if (!TextUtils.isEmpty(selfDefineCo)) {
          try{
             selfDefineCo = new JSONObject(selfDefineCo).getString("package_name");
          label_0022 :
             return selfDefineCo;
          }catch(org.json.JSONException e0){
             DebugLogger.e("AbstractMessageHandler", "no quick json message");
          }
          selfDefineCo = null;
          goto label_0022 ;
       }else {
          goto label_0021 ;
       }
    }
    public MessageV3 l(Intent p0){
       String str = (("notification_show_v3").equals(this.k(p0)))? "pushMessage": "message";
       return MessageV3.parse(this.d().getPackageName(), this.g(p0), this.h(p0), this.d(p0), this.e(p0), this.f(p0), p0.getStringExtra(str), this.i(p0), this.j(p0));
    }
}
