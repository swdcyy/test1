package com.cmic.sso.sdk.auth.c;
import java.lang.String;
import org.json.JSONObject;
import java.lang.Object;
import org.json.JSONException;
import com.cmic.sso.sdk.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import java.lang.Exception;
import java.lang.StringBuilder;
import com.cmic.sso.sdk.e.c;

public class c	// class@000f32
{

    public static JSONObject a(String p0){
       JSONObject jSONObject;
       try{
          jSONObject = new JSONObject();
          jSONObject.put("resultCode", "103000");
          jSONObject.put("desc", "true");
          jSONObject.put("securityphone", p0);
       }catch(org.json.JSONException e3){
          e3.printStackTrace();
       }
       return jSONObject;
    }
    public static JSONObject a(String p0,a p1,JSONObject p2){
       String str = "0";
       String[] stringArray = new String[]{"未知","移动","联通","电信"};
       try{
          String str1 = p1.b("operatortype", str);
          if (str.equals(str1) || TextUtils.isEmpty(str1)) {
             if (("103000").equals(p0)) {
                p2.put("operatorType", stringArray[1]);
             }else {
                p2.put("operatorType", stringArray[0]);
             }
          }else {
             p2.put("operatorType", stringArray[Integer.parseInt(str1)]);
          }
          return p2;
       }catch(java.lang.Exception e0){
       }
    }
    public static JSONObject a(String p0,String p1){
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("resultCode", p0);
          jSONObject.put("desc", p1);
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static JSONObject a(String p0,String p1,a p2,JSONObject p3){
       JSONObject jSONObject;
       String str1;
       String str = "0";
       try{
          jSONObject = new JSONObject();
          int i = p2.c("networktype");
          if (Integer.parseInt(p2.b("authType", str)) == 3) {
             if (i == 3) {
                str = "WIFI下网关鉴权";
                str1 = "1";
             }else {
                str = "网关鉴权";
                str1 = "2";
             }
             str1 = str;
             str = str1;
          label_0033 :
             jSONObject.put("resultCode", p0);
             jSONObject.put("authType", str);
             jSONObject.put("authTypeDes", str1);
             if (("103000").equals(p0)) {
                if (1 == p2.c("logintype")) {
                   jSONObject.put("openId", p2.b("openId"));
                   jSONObject.put("securityphone", p2.b("securityphone"));
                }
                jSONObject.put("token", p3.optString("token"));
                jSONObject.put("tokenExpiresIn", p3.optString("tokenExpiresIn"));
             }else {
                jSONObject.put("desc", p1);
             }
          }else {
             str1 = "其他";
             goto label_0033 ;
          }
       }catch(java.lang.Exception e11){
          e11.printStackTrace();
       }
       c.b("AuthnResult", "返回参数:"+jSONObject.toString());
       return jSONObject;
    }
    public static JSONObject b(String p0,String p1){
       JSONObject jSONObject;
       try{
          jSONObject = new JSONObject();
          jSONObject.put("resultCode", p0);
          jSONObject.put("desc", p1);
       }catch(org.json.JSONException e2){
          e2.printStackTrace();
       }
       return jSONObject;
    }
}
