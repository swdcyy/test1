package com.loc.m$e;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;

public final class m$e	// class@001452
{
    public String a;
    public String b;
    public AtomicInteger c;

    public void m$e(String p0,String p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new AtomicInteger(p2);
    }
    public static String a(m$e p0){
       return p0.b;
    }
    public static m$e b(String p0){
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       JSONObject jSONObject = new JSONObject(p0);
       String str = jSONObject.optString("a");
       String str1 = jSONObject.optString("f");
       return new m$e(str, str1, jSONObject.optInt("h"));
    }
    public static AtomicInteger b(m$e p0){
       return p0.c;
    }
    public static String c(m$e p0){
       return p0.a;
    }
    public final int a(){
       m$e tc = this.c;
       if (tc == null) {
          return 0;
       }
       return tc.get();
    }
    public final void a(String p0){
       this.b = p0;
    }
    public final String b(){
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("a", this.a);
       jSONObject.put("f", this.b);
       jSONObject.put("h", this.c.get());
       return jSONObject.toString();
    }
}
