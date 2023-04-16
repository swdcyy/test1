package com.meizu.cloud.pushsdk.notification.a.d;
import com.meizu.cloud.pushsdk.notification.a.c;
import android.content.Context;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import android.app.Notification$Builder;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import android.app.Notification$BigTextStyle;
import java.lang.String;
import java.lang.CharSequence;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import android.app.Notification$Style;
import android.app.Notification;
import com.meizu.cloud.pushsdk.notification.a;
import com.meizu.cloud.pushsdk.handler.MessageV4;
import com.meizu.cloud.pushsdk.notification.model.ActVideoSetting;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.util.a;
import java.lang.StringBuilder;
import java.io.File;
import android.os.Environment;
import java.lang.System;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.c.a.b$a;
import com.meizu.cloud.pushsdk.c.a;
import com.meizu.cloud.pushsdk.c.a.b;
import com.meizu.cloud.pushsdk.c.a.c;
import com.meizu.cloud.pushsdk.notification.c.e;
import android.os.Bundle;
import com.meizu.cloud.pushsdk.notification.a.d$1;
import java.lang.Runnable;
import com.meizu.cloud.pushsdk.d.b.a.b;

public class d extends c	// class@001565
{

    public void d(Context p0,PushNotificationBuilder p1){
       super(p0, p1);
    }
    public void a(Notification$Builder p0,MessageV3 p1){
       if (MinSdkChecker.isSupportNotificationBuild()) {
          Notification$BigTextStyle uBigTextStyl = new Notification$BigTextStyle();
          uBigTextStyl.setBigContentTitle(p1.getTitle());
          uBigTextStyl.bigText(p1.getNotificationStyle().getExpandableText());
          p0.setStyle(uBigTextStyl);
       }
       return;
    }
    public void a(Notification p0,MessageV3 p1){
       boolean b;
       super.a(p0, p1);
       MessageV4 messageV4 = MessageV4.parse(p1);
       String str = "only wifi can download act";
       if (messageV4.getActVideoSetting() == null) {
          DebugLogger.e("AbstractPushNotification", str);
          return;
       }else if(messageV4.getActVideoSetting().isWifiDisplay() && !a.b(this.a)){
          DebugLogger.e("AbstractPushNotification", str);
          return;
       }else {
          String str1 = Environment.getExternalStorageDirectory().getAbsolutePath()+"/Android/data/pushSdkAct/"+p1.getUploadDataPackageName();
          String str2 = String.valueOf(System.currentTimeMillis());
          String actUrl = messageV4.getActVideoSetting().getActUrl();
          if (!TextUtils.isEmpty(actUrl) && a.a(actUrl, str1, str2).a().c().b()) {
             DebugLogger.i("AbstractPushNotification", "down load "+actUrl+" success");
             str = File.separator;
             actUrl = str1+str+"ACT-"+str2;
             b = new e(str1+str+str2, actUrl).a();
             DebugLogger.i("AbstractPushNotification", "zip file "+b);
             if (b) {
                Bundle uBundle = new Bundle();
                uBundle.putString("path", actUrl);
                Bundle uBundle1 = new Bundle();
                uBundle1.putBundle("big", uBundle);
                if (MinSdkChecker.isSupportVideoNotification()) {
                   p0.extras.putBundle("flyme.active", uBundle1);
                }
             }
          }
          b.a(new d$1(this, str1));
          return;
       }
    }
}
