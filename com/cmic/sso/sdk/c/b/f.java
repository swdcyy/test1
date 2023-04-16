package com.cmic.sso.sdk.c.b.f;
import com.cmic.sso.sdk.c.b.g;
import java.lang.String;
import com.cmic.sso.sdk.c.b.f$b;
import com.cmic.sso.sdk.c.b.f$a;
import org.json.JSONObject;
import java.lang.Object;
import org.json.JSONException;

public class f extends g	// class@000f4a
{
    public f$b a;
    public f$a b;

    public void f(){
       super();
    }
    public String a(){
       return f$b.a(this.a);
    }
    public String a(String p0){
       return null;
    }
    public void a(f$a p0){
       this.b = p0;
    }
    public void a(f$b p0){
       this.a = p0;
    }
    public JSONObject b(){
       JSONObject jSONObject = new JSONObject();
       JSONObject jSONObject1 = new JSONObject();
       try{
          JSONObject jSONObject2 = new JSONObject();
          jSONObject1.put("sign", this.a.d());
          jSONObject1.put("msgid", this.a.e());
          jSONObject1.put("systemtime", this.a.f());
          jSONObject1.put("appid", this.a.a());
          jSONObject1.put("version", this.a.c());
          jSONObject.put("header", jSONObject1);
          jSONObject2.put("log", this.b.a());
          jSONObject.put("body", jSONObject2);
       }catch(org.json.JSONException e1){
          e1.printStackTrace();
       }
       return jSONObject;
    }
}
