package com.meizu.cloud.pushsdk.notification.a.c;
import com.meizu.cloud.pushsdk.notification.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import android.app.Notification$Builder;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.String;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.Thread;
import android.os.Looper;

public class c extends a	// class@001563
{

    public void c(Context p0,PushNotificationBuilder p1){
       super(p0, p1);
    }
    public void b(Notification$Builder p0,MessageV3 p1){
       Bitmap uBitmap;
       String str;
       if (MzSystemUtils.isInternational() && !MzSystemUtils.isMeizuAndFlyme()) {
          return;
       }
       AppIconSetting appIconSetti = p1.getAppIconSetting();
       if (appIconSetti != null) {
          if (appIconSetti.isDefaultLargeIcon()) {
             a tb = this.b;
             if (tb != null && tb.getLargeIcon()) {
                uBitmap = BitmapFactory.decodeResource(this.a.getResources(), this.b.getLargeIcon());
                str = "set largeIcon by resource id";
             }else {
                tb = this.b;
                if (tb != null && tb.getAppLargeIcon() != null) {
                   uBitmap = this.b.getAppLargeIcon();
                   str = "set largeIcon by bitmap provided by user setting";
                }else {
                   uBitmap = this.a(this.a, p1.getUploadDataPackageName());
                   str = "set largeIcon by package default large icon";
                }
             }
             DebugLogger.i("AbstractPushNotification", str);
          }else if(Thread.currentThread() != this.a.getMainLooper().getThread()){
             Bitmap uBitmap1 = this.a(appIconSetti.getLargeIconUrl());
             if (uBitmap1 != null) {
                DebugLogger.i("AbstractPushNotification", "On other Thread down load largeIcon image success");
                p0.setLargeIcon(uBitmap1);
             }else {
                uBitmap = this.a(this.a, p1.getUploadDataPackageName());
             }
          }
          p0.setLargeIcon(uBitmap);
       }
       return;
    }
}
