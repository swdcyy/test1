package com.meizu.cloud.pushsdk.handler.a.d.d;
import com.meizu.cloud.pushsdk.handler.a.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.b;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.util.d;
import android.os.Parcelable;

public class d extends a	// class@00154a
{
    public Context a;

    public void d(Context p0,a p1){
       this.a = p0;
    }
    public int a(){
       return 128;
    }
    public void a(MessageV3 p0,c p1){
       if (p0 == null) {
          return;
       }
       if (this.c() == null) {
          this.c().c(this.d(), MzPushMessage.fromMessageV3(p0));
       }
       this.c(p0);
       this.a(this.a, p0);
       return;
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public boolean a(Intent p0){
       DebugLogger.i("AbstractMessageHandler", "start NotificationDeleteMessageHandler match");
       boolean b = (("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction()) && ("notification_delete").equals(this.k(p0)))? true: false;
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
    public MessageV3 l(Intent p0){
       return p0.getParcelableExtra("pushMessage");
    }
}
