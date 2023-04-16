package com.meizu.cloud.pushsdk.handler.a.d;
import com.meizu.cloud.pushsdk.handler.a.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import java.lang.Object;
import com.meizu.cloud.pushsdk.notification.c;
import java.lang.String;
import com.meizu.cloud.pushsdk.handler.b;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.util.b;

public class d extends a	// class@00154d
{

    public void d(Context p0,a p1){
       super(p0, p1);
    }
    public int a(){
       return 16;
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public void a(String p0,c p1){
       if (this.c() != null) {
          this.c().a(this.d(), p0);
       }
       return;
    }
    public boolean a(Intent p0){
       DebugLogger.i("AbstractMessageHandler", "start RegisterMessageHandler match");
       boolean b = (("com.meizu.flyme.push.intent.REGISTER.FEEDBACK").equals(p0.getAction()) || (("com.meizu.c2dm.intent.REGISTRATION").equals(p0.getAction()) && !TextUtils.isEmpty(p0.getStringExtra("registration_id"))))? true: false;
       return b;
    }
    public Object c(Intent p0){
       return this.l(p0);
    }
    public String l(Intent p0){
       String stringExtra = p0.getStringExtra("registration_id");
       b.g(this.d(), stringExtra, this.d().getPackageName());
       b.a(this.d(), 0, this.d().getPackageName());
       return stringExtra;
    }
}
