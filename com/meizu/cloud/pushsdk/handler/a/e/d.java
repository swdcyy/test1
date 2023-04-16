package com.meizu.cloud.pushsdk.handler.a.e.d;
import com.meizu.cloud.pushsdk.handler.a.a;
import android.content.Context;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.handler.b;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.util.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.platform.message.a;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;

public class d extends a	// class@001552
{

    public void d(Context p0,a p1){
       super(p0, p1);
    }
    public int a(){
       return 4096;
    }
    public void a(SubAliasStatus p0,c p1){
       if (this.c() != null && p0 != null) {
          this.c().a(this.d(), p0);
       }
       return;
    }
    public void a(Object p0,c p1){
       this.a(p0, p1);
    }
    public boolean a(Intent p0){
       DebugLogger.i("AbstractMessageHandler", "start SubScribeAliasStatusHandler match");
       boolean b = (("com.meizu.flyme.push.intent.MESSAGE").equals(p0.getAction()) && ("sub_alias_status").equals(this.k(p0)))? true: false;
       return b;
    }
    public Object c(Intent p0){
       return this.l(p0);
    }
    public final void c(String p0){
       b.h(this.d(), this.d().getPackageName(), p0);
    }
    public SubAliasStatus l(Intent p0){
       String stringExtra = p0.getStringExtra("messageValue");
       SubAliasStatus subAliasStat = (!TextUtils.isEmpty(stringExtra))? a.d(stringExtra): SerializableHook.getSerializableExtra(p0, "extra_app_push_sub_alias_status");
       if (("200").equals(subAliasStat.getCode())) {
          this.c(subAliasStat.getAlias());
       }
       return subAliasStat;
    }
}
