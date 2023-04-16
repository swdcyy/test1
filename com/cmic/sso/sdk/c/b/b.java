package com.cmic.sso.sdk.c.b.b;
import com.cmic.sso.sdk.c.b.g;
import java.lang.String;
import java.lang.StringBuilder;
import org.json.JSONObject;
import java.lang.Object;
import org.json.JSONException;

public class b extends g	// class@000f44
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    public void b(){
       super();
    }
    public String a(){
       return this.f;
    }
    public String a(String p0){
       return this.a+this.e+this.f+"iYm0HAnkxQtpvN44";
    }
    public JSONObject b(){
       JSONObject jSONObject;
       try{
          jSONObject = new JSONObject();
          jSONObject.put("version", this.a);
          jSONObject.put("apptype", this.b);
          jSONObject.put("phone_ID", this.c);
          jSONObject.put("certflag", this.d);
          jSONObject.put("sdkversion", this.e);
          jSONObject.put("appid", this.f);
          jSONObject.put("expandparams", "");
          jSONObject.put("sign", this.g);
       }catch(org.json.JSONException e1){
          e1.printStackTrace();
       }
       return jSONObject;
    }
    public void b(String p0){
       this.a = p0;
    }
    public void c(String p0){
       this.b = p0;
    }
    public void d(String p0){
       this.c = p0;
    }
    public void e(String p0){
       this.d = p0;
    }
    public void f(String p0){
       this.e = p0;
    }
    public void g(String p0){
       this.f = p0;
    }
    public void h(String p0){
       this.g = p0;
    }
}
