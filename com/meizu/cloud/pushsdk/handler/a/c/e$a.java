package com.meizu.cloud.pushsdk.handler.a.c.e$a;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import java.lang.StringBuilder;
import org.json.JSONException;
import com.meizu.cloud.pushinternal.DebugLogger;

public class e$a	// class@00153e
{
    public String a;
    public String b;
    public String c;

    public void e$a(String p0){
       String str = "value";
       super();
       if (!TextUtils.isEmpty(p0)) {
          try{
             JSONObject jSONObject = new JSONObject(p0);
             if (!jSONObject.isNull("code")) {
                this.a(jSONObject.getString("code"));
             }
             if (!jSONObject.isNull("message")) {
                this.b(jSONObject.getString("message"));
             }
             if (!jSONObject.isNull(str)) {
                this.c(jSONObject.getString(str));
             }
          }catch(org.json.JSONException e5){
             DebugLogger.e("SecurityMessage", "covert json error "+e5.getMessage());
          }
       }
    }
    public String a(){
       return this.c;
    }
    public void a(String p0){
       this.a = p0;
    }
    public void b(String p0){
       this.b = p0;
    }
    public void c(String p0){
       this.c = p0;
    }
    public String toString(){
       return "PublicKeyStatus{code=\'"+this.a+'''+", message=\'"+this.b+'''+", publicKey=\'"+this.c+'''+'}';
    }
}
