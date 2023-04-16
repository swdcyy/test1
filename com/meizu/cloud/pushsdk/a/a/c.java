package com.meizu.cloud.pushsdk.a.a.c;
import java.lang.String;
import java.lang.Object;
import org.json.JSONObject;
import org.json.JSONException;
import java.lang.StringBuilder;

public class c	// class@001490
{
    public final int a;
    public final String b;

    public void c(int p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public String toString(){
       JSONObject jSONObject;
       try{
          jSONObject = new JSONObject();
          jSONObject.put("code", this.a);
          jSONObject.put("body", this.b);
       }catch(org.json.JSONException e1){
          e1.printStackTrace();
       }
       return "[NetResponse] "+jSONObject.toString();
    }
}
