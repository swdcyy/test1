package com.meizu.cloud.pushsdk.handler.a.b;
import com.meizu.cloud.pushsdk.handler.a.c;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.handler.a.a;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.b;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.util.d;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.meizu.cloud.pushsdk.notification.MPushMessage;

public class b extends c	// class@001535
{

    public void b(Context p0,a p1){
       super(p0, p1);
    }
    public int a(){
       return 2;
    }
    public void a(MessageV3 p0,c p1){
       if (p1 != null) {
          p1.b(p0);
          this.c().b(this.d(), MzPushMessage.fromMessageV3(p0));
       }
       return;
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public boolean a(Intent p0){
       DebugLogger.i("AbstractMessageHandler", "start MessageV2Handler match");
       int i = 0;
       if (!this.a(i, this.g(p0))) {
          return i;
       }
       if (("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction()) && ("notification_show").equals(this.k(p0))) {
          i = true;
       }
       return i;
    }
    public void b(Object p0){
       this.d(p0);
    }
    public Object c(Intent p0){
       return this.l(p0);
    }
    public void c(Object p0){
       this.e(p0);
    }
    public void d(MessageV3 p0){
       d.b(this.d(), p0.getUploadDataPackageName(), p0.getDeviceId(), p0.getTaskId(), p0.getSeqId(), p0.getPushTimestamp(), p0.getDelayedReportMillis());
    }
    public void e(MessageV3 p0){
       d.a(this.d(), p0.getUploadDataPackageName(), p0.getDeviceId(), p0.getTaskId(), p0.getSeqId(), p0.getPushTimestamp(), p0.getDelayedReportMillis());
    }
    public MessageV3 l(Intent p0){
       MPushMessage serializable = SerializableHook.getSerializableExtra(p0, "pushMessage");
       return MessageV3.parse(this.g(p0), this.d(p0), serializable.getTaskId(), serializable);
    }
}
