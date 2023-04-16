package com.meizu.cloud.pushsdk.handler.a.e.a;
import com.meizu.cloud.pushsdk.handler.a.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.handler.b;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.platform.message.a;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import java.lang.StringBuilder;
import com.meizu.cloud.pushsdk.util.b;

public class a extends a	// class@00154e
{

    public void a(Context p0,a p1){
       super(p0, p1);
    }
    public int a(){
       return 256;
    }
    public void a(PushSwitchStatus p0,c p1){
       if (this.c() != null && p0 != null) {
          this.c().a(this.d(), p0);
       }
       return;
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public boolean a(Intent p0){
       DebugLogger.i("AbstractMessageHandler", "start PushSwitchStatusHandler match");
       boolean b = (("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction()) && ("push_status").equals(this.k(p0)))? true: false;
       return b;
    }
    public Object c(Intent p0){
       return this.l(p0);
    }
    public PushSwitchStatus l(Intent p0){
       String stringExtra = p0.getStringExtra("messageValue");
       PushSwitchStatus pushSwitchSt = (!TextUtils.isEmpty(stringExtra))? a.c(stringExtra): SerializableHook.getSerializableExtra(p0, "extra_app_push_switch_status");
       if (("200").equals(pushSwitchSt.getCode())) {
          String str = this.g(p0);
          DebugLogger.e("AbstractMessageHandler", "PushSwitchStatusHandler update local "+str+" switch status "+pushSwitchSt);
          b.a(this.d(), str, pushSwitchSt.isSwitchNotificationMessage());
          b.b(this.d(), str, pushSwitchSt.isSwitchThroughMessage());
       }
       return pushSwitchSt;
    }
}
