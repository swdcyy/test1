package com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor$b;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor;
import com.kwai.android.register.core.notification.NotificationChain;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import m0d.l;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap$Config;
import androidx.core.app.NotificationCompat$Builder;
import androidx.core.app.NotificationCompat$c;
import com.kwai.android.common.bean.PushData;
import java.lang.CharSequence;
import androidx.core.app.NotificationCompat$j;
import i6c.k;
import com.kwai.android.common.bean.Channel;
import java.util.Objects;
import java.lang.Integer;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Context;
import android.app.PendingIntent;
import com.kwai.android.common.intercept.Chain;
import qrd.l1;

public final class KwaiPushTypeInterceptor$b implements ImageCallback	// class@00165d
{
    public final KwaiPushTypeInterceptor b;
    public final NotificationChain c;
    public final KwaiPushMsgData d;

    public void KwaiPushTypeInterceptor$b(KwaiPushTypeInterceptor p0,NotificationChain p1,KwaiPushMsgData p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onCompleted(Drawable p0){
       l.a(this, p0);
    }
    public void onCompletedBitmap(Bitmap p0){
       l1 a;
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPushTypeInterceptor$b.class, "1")) {
          return;
       }
       if (p0 != null) {
          boolean b = true;
          p0 = p0.copy(p0.getConfig(), b);
          if (p0 != null) {
             NotificationCompat$Builder notification = this.c.getNotificationBuilder();
             if (notification != null) {
                NotificationCompat$c uoc = new NotificationCompat$c();
                uoc.z(p0);
                uoc.A(this.d.title);
                uoc.B(this.d.body);
                notification.setStyle(uoc);
                notification.setLargeIcon(this.b.e(p0));
                if (k.d(this.d)) {
                   KwaiPushTypeInterceptor$b tb = this.b;
                   KwaiPushTypeInterceptor$b td = this.d;
                   int notification1 = this.c.getNotificationId();
                   Channel channel = this.c.getChannel();
                   Objects.requireNonNull(tb);
                   if (!PatchProxy.isSupport(KwaiPushTypeInterceptor.class) || !PatchProxy.applyVoidFourRefs(notification, td, Integer.valueOf(notification1), channel, tb, KwaiPushTypeInterceptor.class, "16")) {
                      c uoc1 = a.a();
                      a.o(uoc1, "AppEnv.get\(\)");
                      Application uApplication = uoc1.a();
                      a.o(uApplication, "AppEnv.get\(\).appContext");
                      notification.addAction(0, uApplication.getString(R.string.arg_RES_7f104071), tb.b(td, b, notification1, channel));
                      String str = uApplication.getString(R.string.arg_RES_7f104058);
                      notification.addAction(0, str, tb.b(td, 2, notification1, channel));
                      notification.setDeleteIntent(tb.b(td, 3, notification1, channel));
                   }
                }
                this.c.proceed();
                a = l1.a;
             }else {
                a = null;
             }
             if (a != null) {
             label_00c5 :
                return;
             }
          }
       }
       this.b.i(this.c);
       a = l1.a;
       goto label_00c5 ;
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
