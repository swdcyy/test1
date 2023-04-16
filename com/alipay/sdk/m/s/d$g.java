package com.alipay.sdk.m.s.d$g;
import j6.c$a;
import com.alipay.sdk.m.s.d$f;
import java.lang.String;
import java.lang.Object;
import org.json.JSONObject;

public class d$g implements c$a	// class@000ea9
{
    public final d$f a;
    public final String b;

    public void d$g(d$f p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(boolean p0,JSONObject p1,String p2){
       try{
          this.a.b(new JSONObject().put("success", p0).put("random", this.b).put("code", p1).put("status", p2));
          return;
       }catch(org.json.JSONException e0){
       }
    }
}
