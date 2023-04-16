package com.meizu.cloud.pushsdk.handler.a.f;
import com.meizu.cloud.pushsdk.handler.a.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import java.lang.Boolean;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.handler.b;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.meizu.cloud.pushsdk.util.b;

public class f extends a	// class@00155a
{

    public void f(Context p0,a p1){
       super(p0, p1);
    }
    public int a(){
       return 32;
    }
    public void a(Boolean p0,c p1){
       if (this.c() != null) {
          this.c().a(this.d(), p0.booleanValue());
       }
       return;
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public boolean a(Intent p0){
       DebugLogger.i("AbstractMessageHandler", "start UnRegisterMessageHandler match");
       boolean b = (("com.meizu.flyme.push.intent.UNREGISTER.FEEDBACK").equals(p0.getAction()) || (("com.meizu.c2dm.intent.UNREGISTER").equals(p0.getAction()) && TextUtils.isEmpty(p0.getStringExtra("unregistered"))))? true: false;
       return b;
    }
    public Object c(Intent p0){
       return this.l(p0);
    }
    public Boolean l(Intent p0){
       boolean booleanExtra = p0.getBooleanExtra("extra_app_is_unregister_success", false);
       String stringExtra = p0.getStringExtra("registration_error");
       String stringExtra1 = p0.getStringExtra("unregistered");
       DebugLogger.i("AbstractMessageHandler", "processUnRegisterCallback 5.0:"+booleanExtra+" 4.0:"+stringExtra+" 3.0:"+stringExtra1);
       if (TextUtils.isEmpty(stringExtra) || (!booleanExtra && TextUtils.isEmpty(stringExtra1))) {
          return Boolean.FALSE;
       }
       b.g(this.d(), "", this.d().getPackageName());
       return Boolean.TRUE;
    }
}
