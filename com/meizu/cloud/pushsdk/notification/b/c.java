package com.meizu.cloud.pushsdk.notification.b.c;
import com.meizu.cloud.pushsdk.notification.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import android.app.Notification;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import android.widget.RemoteViews;
import java.lang.String;
import com.meizu.cloud.pushsdk.notification.c.c;
import java.lang.CharSequence;
import java.lang.System;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import android.graphics.Bitmap;

public class c extends a	// class@001569
{

    public void c(Context p0,PushNotificationBuilder p1){
       super(p0, p1);
    }
    public void a(Notification p0,MessageV3 p1){
       if (MinSdkChecker.isSupportNotificationBuild()) {
          RemoteViews remoteViews = new RemoteViews(this.a.getPackageName(), c.a(this.a));
          remoteViews.setTextViewText(c.d(this.a), p1.getTitle());
          remoteViews.setTextViewText(c.e(this.a), p1.getContent());
          remoteViews.setLong(c.f(this.a), "setTime", System.currentTimeMillis());
          this.a(remoteViews, p1);
          remoteViews.setViewVisibility(c.g(this.a), 8);
          remoteViews.setViewVisibility(c.h(this.a), 8);
          p0.contentView = remoteViews;
       }
       return;
    }
    public void a(RemoteViews p0,MessageV3 p1){
       if (p1.getAppIconSetting() != null && (!this.a() && !p1.getAppIconSetting().isDefaultLargeIcon())) {
          Bitmap uBitmap = this.a(p1.getAppIconSetting().getLargeIconUrl());
          if (uBitmap != null) {
             p0.setImageViewBitmap(c.k(this.a), uBitmap);
          label_0041 :
             return;
          }
       }
       p0.setImageViewBitmap(c.k(this.a), this.a(this.a, p1.getUploadDataPackageName()));
       goto label_0041 ;
    }
}
