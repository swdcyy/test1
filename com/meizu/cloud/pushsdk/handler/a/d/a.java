package com.meizu.cloud.pushsdk.handler.a.d.a;
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
import java.lang.CharSequence;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.handler.d;
import android.os.Parcelable;

public class a extends a	// class@001547
{

    public void a(Context p0,a p1){
       super(p0, p1);
    }
    public int a(){
       return 0x20000;
    }
    public void a(MessageV3 p0,c p1){
       if (this.c() != null && p0 != null) {
          this.c().b(this.d(), MzPushMessage.fromMessageV3(p0));
       }
       return;
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public boolean a(Intent p0){
       DebugLogger.i("AbstractMessageHandler", "start NotificationArrivedHandler match");
       boolean b = (("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction()) && ("notification_arrived").equals(this.k(p0)))? true: false;
       return b;
    }
    public Object c(Intent p0){
       return this.l(p0);
    }
    public MessageV3 l(Intent p0){
       String stringExtra = p0.getStringExtra("messageValue");
       if (!TextUtils.isEmpty(stringExtra)) {
          return d.a(stringExtra);
       }
       return p0.getParcelableExtra("pushMessage");
    }
}
