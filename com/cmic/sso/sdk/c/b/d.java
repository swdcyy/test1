package com.cmic.sso.sdk.c.b.d;
import com.cmic.sso.sdk.c.b.g;
import java.lang.String;
import org.json.JSONObject;
import java.lang.Object;
import org.json.JSONException;

public class d extends g	// class@000f46
{
    public final String a;
    public final String b;
    public final String c;
    public String d;
    public String e;

    public void d(String p0,String p1,String p2){
       super();
       this.d = "authz";
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public String a(){
       return this.a;
    }
    public String a(String p0){
       return null;
    }
    public JSONObject b(){
       JSONObject jSONObject;
       try{
          jSONObject = new JSONObject();
          jSONObject.put("ver", this.b);
          jSONObject.put("data", this.c);
          jSONObject.put("userCapaid", this.e);
          jSONObject.put("funcType", this.d);
       }catch(org.json.JSONException e1){
          e1.printStackTrace();
       }
       return jSONObject;
    }
    public void b(String p0){
       this.d = p0;
    }
    public void c(String p0){
       this.e = p0;
    }
}
