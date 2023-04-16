package com.meizu.cloud.pushsdk.handler.a.e.c;
import com.meizu.cloud.pushsdk.handler.a.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.b.c.a;
import com.meizu.cloud.pushsdk.handler.a.e.c$1;
import java.lang.Runnable;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.handler.b;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import com.meizu.cloud.pushsdk.util.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.platform.message.a;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.System;

public class c extends a	// class@001551
{

    public void c(Context p0,a p1){
       super(p0, p1);
    }
    public static void a(c p0){
       p0.e();
    }
    public int a(){
       return 512;
    }
    public void a(RegisterStatus p0){
       a.a().execute(new c$1(this));
    }
    public void a(RegisterStatus p0,c p1){
       if (this.c() != null && p0 != null) {
          this.c().a(this.d(), p0);
       }
       return;
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public boolean a(Intent p0){
       DebugLogger.i("AbstractMessageHandler", "start RegisterStatusHandler match");
       boolean b = (("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction()) && ("register_status").equals(this.k(p0)))? true: false;
       return b;
    }
    public Object c(Intent p0){
       return this.l(p0);
    }
    public void c(Object p0){
       this.a(p0);
    }
    public final void e(){
       String mzPushServic = MzSystemUtils.getMzPushServicePackageName(this.d());
       if (b.l(this.d(), mzPushServic)) {
          b.c(this.d(), mzPushServic, false);
          if (!TextUtils.isEmpty(b.k(this.d(), mzPushServic))) {
             return;
          }else {
             String str = this.b();
             if (!TextUtils.isEmpty(str)) {
                b.k(this.d(), mzPushServic, str);
             }
          }
       }
       return;
    }
    public RegisterStatus l(Intent p0){
       String stringExtra = p0.getStringExtra("messageValue");
       RegisterStatus registerStat = (!TextUtils.isEmpty(stringExtra))? a.a(stringExtra): SerializableHook.getSerializableExtra(p0, "extra_app_push_register_status");
       if (!TextUtils.isEmpty(registerStat.getPushId())) {
          b.g(this.d(), registerStat.getPushId(), this.d().getPackageName());
          b.a(this.d(), (int)((System.currentTimeMillis() / 1000) + (long)registerStat.getExpireTime()), this.d().getPackageName());
       }
       return registerStat;
    }
}
