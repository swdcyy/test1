package com.cmic.sso.sdk.c.b.e;
import com.cmic.sso.sdk.c.b.g;
import java.lang.String;
import com.cmic.sso.sdk.c.b.a;
import org.json.JSONObject;
import java.lang.Object;
import com.cmic.sso.sdk.e.c;
import com.cmic.sso.sdk.e.a;
import org.json.JSONException;

public class e extends g	// class@000f47
{
    public a a;
    public byte[] b;
    public String c;
    public String d;
    public boolean e;

    public void e(){
       super();
       this.e = false;
    }
    public String a(){
       return this.a.a();
    }
    public String a(String p0){
       return null;
    }
    public void a(a p0){
       this.a = p0;
    }
    public void a(boolean p0){
       this.e = p0;
    }
    public void a(byte[] p0){
       this.b = p0;
    }
    public JSONObject b(){
       JSONObject jSONObject = new JSONObject();
       if (this.e != null) {
          try{
             jSONObject.put("encrypted", this.c);
             c.a("GetPrePhoneScripParameter", this.a.toString());
             jSONObject.put("reqdata", a.a(this.b, this.a.toString()));
             jSONObject.put("securityreinforce", this.d);
          }catch(org.json.JSONException e1){
             e1.printStackTrace();
          }
       }
    }
    public void b(String p0){
       this.d = p0;
    }
    public a c(){
       return this.a;
    }
    public void c(String p0){
       this.c = p0;
    }
}
