package com.meizu.cloud.pushsdk.handler.a.e.e;
import com.meizu.cloud.pushsdk.handler.a.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
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

public class e extends a	// class@001553
{

    public void e(Context p0,a p1){
       super(p0, p1);
    }
    public int a(){
       return 2048;
    }
    public void a(SubTagsStatus p0,c p1){
       if (this.c() != null && p0 != null) {
          this.c().a(this.d(), p0);
       }
       return;
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public boolean a(Intent p0){
       DebugLogger.i("AbstractMessageHandler", "start SubScribeTagsStatusHandler match");
       boolean b = (("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction()) && ("sub_tags_status").equals(this.k(p0)))? true: false;
       return b;
    }
    public Object c(Intent p0){
       return this.l(p0);
    }
    public SubTagsStatus l(Intent p0){
       String stringExtra = p0.getStringExtra("messageValue");
       if (!TextUtils.isEmpty(stringExtra)) {
          return a.e(stringExtra);
       }
       return SerializableHook.getSerializableExtra(p0, "extra_app_push_sub_tags_status");
    }
}
