package com.meizu.cloud.pushsdk.notification.a.a;
import com.meizu.cloud.pushsdk.notification.a.c;
import android.content.Context;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import android.app.Notification$Builder;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import android.app.Notification$BigPictureStyle;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.meizu.cloud.pushsdk.notification.a;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.Bitmap;
import android.app.Notification$Style;

public class a extends c	// class@001561
{

    public void a(Context p0,PushNotificationBuilder p1){
       super(p0, p1);
    }
    public void a(Notification$Builder p0,MessageV3 p1){
       if (MinSdkChecker.isSupportNotificationBuild()) {
          Notification$BigPictureStyle uBigPictureS = new Notification$BigPictureStyle();
          if (p1.getNotificationStyle() != null && (!this.a() && !TextUtils.isEmpty(p1.getNotificationStyle().getExpandableImageUrl()))) {
             Bitmap uBitmap = this.a(p1.getNotificationStyle().getExpandableImageUrl());
             if (uBitmap != null) {
                uBigPictureS.setBigContentTitle(p1.getTitle());
                uBigPictureS.bigPicture(uBitmap);
                p0.setStyle(uBigPictureS);
             }
          }
       }
       return;
    }
}
