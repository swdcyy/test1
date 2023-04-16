package com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor$c;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor;
import com.kwai.android.register.core.notification.NotificationChain;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import m0d.l;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap$Config;
import androidx.core.app.NotificationCompat$Builder;
import com.kwai.android.common.intercept.Chain;
import qrd.l1;

public final class KwaiPushTypeInterceptor$c implements ImageCallback	// class@00165e
{
    public final KwaiPushTypeInterceptor b;
    public final NotificationChain c;

    public void KwaiPushTypeInterceptor$c(KwaiPushTypeInterceptor p0,NotificationChain p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onCompleted(Drawable p0){
       l.a(this, p0);
    }
    public void onCompletedBitmap(Bitmap p0){
       l1 a;
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPushTypeInterceptor$c.class, "1")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.copy(p0.getConfig(), true);
          if (p0 != null) {
             NotificationCompat$Builder notification = this.c.getNotificationBuilder();
             if (notification != null) {
                notification.setLargeIcon(this.b.e(p0));
                this.c.proceed();
                a = l1.a;
             }else {
                a = null;
             }
             if (a != null) {
             label_0043 :
                return;
             }
          }
       }
       this.b.c(this.c);
       this.c.proceed();
       a = l1.a;
       goto label_0043 ;
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
