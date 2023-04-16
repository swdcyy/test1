package com.meizu.cloud.pushsdk.handler.a.e;
import com.meizu.cloud.pushsdk.handler.a.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.notification.c;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.handler.b;
import com.meizu.cloud.pushsdk.handler.a.c.d$a;
import com.meizu.cloud.pushsdk.handler.a.c.d;
import java.lang.Object;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.util.d;

public class e extends a	// class@001555
{

    public void e(Context p0,a p1){
       super(p0, p1);
    }
    public int a(){
       return 8;
    }
    public void a(MessageV3 p0,c p1){
       if (this.c() != null && (p0 != null && !TextUtils.isEmpty(p0.getThroughMessage()))) {
          this.c().b(this.d(), p0.getThroughMessage());
          this.c().a(this.d(), p0.getThroughMessage(), d.a().a(p0.getTaskId()).b(p0.getSeqId()).c(p0.getPushTimestamp()).d(p0.getDeviceId()).a().b());
       }
    label_005c :
       return;
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public boolean a(Intent p0){
       DebugLogger.i("AbstractMessageHandler", "start ThroughMessageHandler match");
       if (!this.a(1, this.g(p0))) {
          return false;
       }
       if (("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction())) {
          String str = "message";
          if (str.equals(this.k(p0))) {
             return 1;
          }else if(TextUtils.isEmpty(this.k(p0))){
             String stringExtra = p0.getStringExtra(str);
             if (!TextUtils.isEmpty(stringExtra) && !this.a(stringExtra)) {
                return 1;
             }
          }
       }
       return ("com.meizu.c2dm.intent.RECEIVE").equals(p0.getAction());
    }
    public void b(Object p0){
       this.d(p0);
    }
    public Object c(Intent p0){
       return this.l(p0);
    }
    public void d(MessageV3 p0){
       if (p0 != null && (!TextUtils.isEmpty(p0.getDeviceId()) && !TextUtils.isEmpty(p0.getTaskId()))) {
          String str = this.b(p0.getThroughMessage());
          if (!TextUtils.isEmpty(str)) {
             d.c(this.d(), str, p0.getDeviceId(), p0.getTaskId(), p0.getSeqId(), p0.getPushTimestamp());
          }else {
             d.c(this.d(), p0.getUploadDataPackageName(), p0.getDeviceId(), p0.getTaskId(), p0.getSeqId(), p0.getPushTimestamp());
          }
       }
       return;
    }
    public MessageV3 l(Intent p0){
       MessageV3 messageV3 = new MessageV3();
       if (("com.meizu.c2dm.intent.RECEIVE").equals(p0.getAction())) {
          this.c().a(this.d(), p0);
          return null;
       }else {
          messageV3.setThroughMessage(p0.getStringExtra("message"));
          messageV3.setTaskId(this.e(p0));
          messageV3.setDeviceId(this.d(p0));
          messageV3.setSeqId(this.f(p0));
          messageV3.setPushTimestamp(this.h(p0));
          messageV3.setUploadDataPackageName(this.g(p0));
          return messageV3;
       }
    }
}
