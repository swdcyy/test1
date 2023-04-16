package com.meizu.cloud.pushsdk.handler.a.e.b;
import com.meizu.cloud.pushsdk.handler.a.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import java.lang.Object;
import com.meizu.cloud.pushsdk.notification.c;
import java.lang.String;
import com.meizu.cloud.pushsdk.handler.b;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;

public class b extends a	// class@00154f
{

    public void b(Context p0,a p1){
       super(p0, p1);
    }
    public int a(){
       return 0x4000;
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public void a(String p0,c p1){
       if (this.c() != null && p0 != null) {
          this.c().c(this.d(), p0);
       }
       return;
    }
    public boolean a(Intent p0){
       DebugLogger.i("AbstractMessageHandler", "start ReceiveNotifyMessageHandler match");
       boolean b = (("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction()) && ("response_notification_message").equals(this.k(p0)))? true: false;
       return b;
    }
    public Object c(Intent p0){
       return this.l(p0);
    }
    public String l(Intent p0){
       return p0.getStringExtra("extra_app_push_response_notification_message");
    }
}
