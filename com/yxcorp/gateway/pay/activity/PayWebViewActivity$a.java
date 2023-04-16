package com.yxcorp.gateway.pay.activity.PayWebViewActivity$a;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import android.content.Intent;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class PayWebViewActivity$a	// class@001207
{
    public final Context a;
    public final Class b;
    public final String c;
    public String d;
    public boolean e;
    public String f;
    public String g;
    public Serializable h;

    public void PayWebViewActivity$a(Context p0,Class p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.g = "back";
    }
    public Intent a(){
       Intent obj = PatchProxy.apply(null, this, PayWebViewActivity$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Intent(this.a, this.b);
       obj.putExtra("web_url", this.c);
       obj.putExtra("page_uri", this.d);
       SerializableHook.putExtra(obj, "extra", this.h);
       obj.putExtra("translucent", this.e);
       obj.putExtra("left_top_btn_type", this.g);
       obj.putExtra("sessionId", this.f);
       return obj;
    }
    public PayWebViewActivity$a b(String p0){
       this.g = p0;
       return this;
    }
    public PayWebViewActivity$a c(boolean p0){
       this.e = p0;
       return this;
    }
    public PayWebViewActivity$a d(String p0){
       this.f = p0;
       return this;
    }
}
