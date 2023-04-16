package com.meizu.cloud.pushsdk.handler.a.d.f;
import com.meizu.cloud.pushsdk.handler.a.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.handler.a.c.h;
import java.lang.String;
import com.meizu.cloud.pushsdk.handler.a.c.b;
import com.meizu.cloud.pushsdk.handler.a.c.f;
import com.meizu.cloud.pushsdk.util.d;
import com.meizu.cloud.pushsdk.notification.c;
import java.lang.Object;
import android.app.NotificationManager;
import java.lang.StringBuilder;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.b;
import com.meizu.cloud.pushsdk.handler.a.a.a;
import android.content.Intent;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.handler.a.c.a;

public class f extends a	// class@00154c
{

    public void f(Context p0,a p1){
       super(p0, p1);
    }
    public int a(){
       return 0x40000;
    }
    public void a(h p0){
       d.b(this.d(), p0.c(), p0.a().b().d(), p0.a().b().a(), p0.a().b().e(), p0.a().b().b());
    }
    public void a(h p0,c p1){
       NotificationManager systemServic = this.d().getSystemService("notification");
       if (systemServic != null) {
          DebugLogger.e("AbstractMessageHandler", "start cancel notification id "+p0.b());
          systemServic.cancel(p0.b());
          a uoa = b.a(this.d()).b();
          if (uoa != null) {
             uoa.a(p0.b());
          }
       }
       return;
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public boolean a(Intent p0){
       int i;
       DebugLogger.i("AbstractMessageHandler", "start WithDrawMessageHandler match");
       String stringExtra = p0.getStringExtra("mz_push_control_message");
       boolean b = false;
       if (!TextUtils.isEmpty(stringExtra)) {
          b uob = b.a(stringExtra);
          if (uob.a() != null) {
             i = uob.a().a();
          label_0028 :
             if (("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction()) && ("4").equals(String.valueOf(i))) {
                b = true;
             }
             return b;
          }
       }
       i = 0;
       goto label_0028 ;
    }
    public void b(Object p0){
       this.a(p0);
    }
    public Object c(Intent p0){
       return this.l(p0);
    }
    public h l(Intent p0){
       h oh = new h(p0.getStringExtra("pushMessage"), this.g(p0), p0.getStringExtra("mz_push_control_message"), p0.getStringExtra("statistics_imei_key"), p0.getStringExtra("extra_app_push_seq_Id"));
       return p0;
    }
}
