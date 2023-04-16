package com.meizu.cloud.pushsdk.notification.a.b;
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

public class b extends c	// class@001562
{

    public void b(Context p0,PushNotificationBuilder p1){
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
}
