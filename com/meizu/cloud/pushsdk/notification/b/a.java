package com.meizu.cloud.pushsdk.notification.b.a;
import com.meizu.cloud.pushsdk.notification.b.c;
import android.content.Context;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import android.app.Notification;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import android.app.PendingIntent;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import android.widget.RemoteViews;
import com.meizu.cloud.pushsdk.notification.a;
import java.lang.String;
import com.meizu.cloud.pushsdk.notification.c.c;
import java.lang.CharSequence;
import java.lang.System;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import android.text.TextUtils;
import android.graphics.Bitmap;

public class a extends c	// class@001567
{

    public void a(Context p0,PushNotificationBuilder p1){
       super(p0, p1);
    }
    public void a(Notification p0,MessageV3 p1,PendingIntent p2){
       if (MinSdkChecker.isSupportNotificationBuild()) {
          RemoteViews remoteViews = new RemoteViews(this.a.getPackageName(), c.a(this.a));
          remoteViews.setTextViewText(c.d(this.a), p1.getTitle());
          remoteViews.setTextViewText(c.e(this.a), p1.getContent());
          remoteViews.setLong(c.f(this.a), "setTime", System.currentTimeMillis());
          this.a(remoteViews, p1);
          this.b(remoteViews, p1);
          p0.bigContentView = remoteViews;
       }
       return;
    }
    public final void b(RemoteViews p0,MessageV3 p1){
       if (p1.getNotificationStyle() != null && !this.a()) {
          int i = 8;
          if (!TextUtils.isEmpty(p1.getNotificationStyle().getExpandableImageUrl())) {
             Bitmap uBitmap = this.a(p1.getNotificationStyle().getExpandableImageUrl());
             if (uBitmap != null) {
                p0.setViewVisibility(c.g(this.a), 0);
                p0.setImageViewBitmap(c.g(this.a), uBitmap);
             }
          }
          p0.setViewVisibility(c.g(this.a), i);
       }
       return;
    }
}
