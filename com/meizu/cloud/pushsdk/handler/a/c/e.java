package com.meizu.cloud.pushsdk.handler.a.c.e;
import java.lang.Object;
import java.lang.String;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import java.lang.StringBuilder;
import org.json.JSONException;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.System;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import java.lang.Exception;

public class e	// class@00153f
{
    public int a;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;

    public void e(){
       super();
       this.b = String.valueOf(-1);
       this.c = "";
       this.d = "";
       this.e = -1;
       this.f = "";
    }
    public static String a(MessageV3 p0){
       JSONObject jSONObject1;
       String str = "extra";
       String notification = p0.getNotificationMessage();
       String str1 = null;
       if (!TextUtils.isEmpty(notification)) {
          try{
             JSONObject jSONObject = new JSONObject(notification).getJSONObject("data");
             if (!jSONObject.isNull(str)) {
                jSONObject1 = jSONObject.getJSONObject(str);
                if (!jSONObject1.isNull("se")) {
                   str1 = jSONObject1.getString("se");
                }
             }
             if (TextUtils.isEmpty(str1)) {
                jSONObject1 = new JSONObject(notification);
             }
          }catch(org.json.JSONException e0){
             DebugLogger.e("SecurityMessage", "parse notification message error "+e0.getMessage());
             if (TextUtils.isEmpty(str1)) {
                jSONObject1 = new JSONObject(notification);
             }
          }catch(java.lang.Exception e0){
          }
       }
    label_0076 :
       DebugLogger.i("SecurityMessage", "encrypt message "+str1);
       return str1;
    }
    public static boolean a(String p0,MessageV3 p1){
       e uoe = e.e(p0);
       DebugLogger.e("SecurityMessage", "securityMessage "+uoe);
       if ((System.currentTimeMillis() / 1000) - (long)uoe.a() > 0) {
          uoe = "message expire";
       }else if(!(p1.getTitle()).contains(uoe.c())){
          uoe = "invalid title";
       }else if(!(p1.getContent()).contains(uoe.d())){
          uoe = "invalid content";
       }else {
          int i = -1;
          if (!(String.valueOf(i)).equals(uoe.b()) && !(uoe.b()).equals(p1.getTaskId())) {
             uoe = "invalid taskId";
          }else if(uoe.e() != i){
             i = uoe.e();
             if (i != 1) {
                if (i != 2) {
                   if (i == 3 && !(MzPushMessage.fromMessageV3(p1).getSelfDefineContentString()).contains(uoe.f())) {
                      uoe = "invalid self define";
                   }
                }else if(!(p1.getWebUrl()).contains(uoe.f())){
                   uoe = "invalid web url";
                }
             }else if(!(p1.getActivity()).contains(uoe.f())){
                uoe = "invalid click activity";
             }
             return true;
          }else {
             uoe = "invalid click type";
          }
       }
       DebugLogger.e("SecurityMessage", uoe);
       return false;
    }
    public static e e(String p0){
       e uoe;
       String str = "pm";
       try{
          uoe = new e();
          JSONObject jSONObject = new JSONObject(p0);
          if (!jSONObject.isNull("tt")) {
             uoe.a(jSONObject.getInt("tt"));
          label_0023 :
             if (!jSONObject.isNull("ti")) {
                uoe.a(jSONObject.getString("ti"));
             }
             if (!jSONObject.isNull("tl")) {
                uoe.b(jSONObject.getString("tl"));
             }
             if (!jSONObject.isNull("cont")) {
                uoe.c(jSONObject.getString("cont"));
             }
             if (!jSONObject.isNull("ct")) {
                uoe.b(jSONObject.getInt("ct"));
             }
             if (!jSONObject.isNull(str)) {
                uoe.d(jSONObject.getString(str));
             }
          }else {
             goto label_0023 ;
          }
       }catch(java.lang.Exception e8){
          DebugLogger.e("SecurityMessage", "parse decryptSign error "+e8.getMessage());
       }
       return uoe;
    }
    public int a(){
       return this.a;
    }
    public void a(int p0){
       this.a = p0;
    }
    public void a(String p0){
       this.b = p0;
    }
    public String b(){
       return this.b;
    }
    public void b(int p0){
       this.e = p0;
    }
    public void b(String p0){
       this.c = p0;
    }
    public String c(){
       return this.c;
    }
    public void c(String p0){
       this.d = p0;
    }
    public String d(){
       return this.d;
    }
    public void d(String p0){
       this.f = p0;
    }
    public int e(){
       return this.e;
    }
    public String f(){
       return this.f;
    }
    public String toString(){
       return "SecurityMessage{timestamp="+this.a+", taskId=\'"+this.b+'''+", title=\'"+this.c+'''+", content=\'"+this.d+'''+", clickType="+this.e+", params=\'"+this.f+'''+'}';
    }
}
