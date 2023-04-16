package com.meizu.cloud.pushsdk.handler.a.d.c;
import com.meizu.cloud.pushsdk.handler.a.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.c;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.b;
import java.lang.Object;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.util.d;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import java.lang.System;
import com.meizu.cloud.pushsdk.util.b;
import android.os.Parcelable;

public class c extends a	// class@001549
{
    public Context a;

    public void c(Context p0,a p1){
       this.a = p0;
    }
    public int a(){
       return 0x100000;
    }
    public void a(MessageV3 p0,c p1){
       if (p0 == null) {
          return;
       }
       this.e(p0);
       if (!TextUtils.isEmpty(p0.getTitle()) && (!TextUtils.isEmpty(p0.getContent()) && this.c() != null)) {
          this.c().c(this.d(), MzPushMessage.fromMessageV3(p0));
       }
    label_002f :
       this.b(p0);
       this.a(this.a, p0);
       return;
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public boolean a(Intent p0){
       DebugLogger.i("AbstractMessageHandler", "start NotificationCloseMessageHandler match");
       boolean b = (("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction()) && ("notification_close").equals(this.k(p0)))? true: false;
       return b;
    }
    public void b(Object p0){
       this.d(p0);
    }
    public Object c(Intent p0){
       return this.l(p0);
    }
    public void d(MessageV3 p0){
       d.a(this.d(), p0.getUploadDataPackageName(), p0.getDeviceId(), p0.getTaskId(), p0.getSeqId(), p0.getPushTimestamp());
    }
    public final void e(MessageV3 p0){
       if (p0.getAdvertisementOption() != null && !TextUtils.isEmpty(p0.getAdvertisementOption().getAdPackage())) {
          b.a(this.a, p0.getAdvertisementOption().getAdPackage(), System.currentTimeMillis());
          d.e(this.a, p0.getAdvertisementOption().getAdInstallPackage(), p0.getDeviceId(), p0.getTaskId(), p0.getSeqId(), p0.getPushTimestamp());
       }
       return;
    }
    public MessageV3 l(Intent p0){
       return p0.getParcelableExtra("pushMessage");
    }
}
