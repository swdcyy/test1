package com.tencent.connect.auth.QQToken;
import java.lang.String;
import java.lang.Object;
import android.content.SharedPreferences;
import android.content.Context;
import com.tencent.open.utils.f;
import oe6.o;
import java.lang.StringBuilder;
import com.tencent.open.utils.k;
import android.util.Base64;
import com.tencent.open.utils.a;
import org.json.JSONObject;
import com.tencent.open.log.SLog;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tencent.open.web.security.JniInterface;
import com.tencent.connect.auth.AuthAgent;
import com.tencent.open.utils.i;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Throwable;
import java.lang.Exception;
import java.lang.System;
import java.lang.Long;
import com.tencent.open.b.b;

public class QQToken	// class@000e20
{
    public String a;
    public String b;
    public String c;
    public int d;
    public long e;
    public a f;
    public static SharedPreferences g;

    public void QQToken(String p0){
       super();
       this.d = 1;
       this.e = -1;
       this.a = p0;
    }
    public static synchronized SharedPreferences a(){
       _monitor_enter(QQToken.class);
       if (QQToken.g == null) {
          QQToken.g = o.c(f.a(), "token_info_file", 0);
       }
       _monitor_exit(QQToken.class);
       return QQToken.g;
    }
    public static String a(String p0){
       return Base64.encodeToString(k.j(p0), 2)+"_aes_google";
    }
    public static synchronized JSONObject a(String p0,a p1){
       String str1;
       _monitor_enter(QQToken.class);
       if (f.a() == null) {
          SLog.i("QQToken", "loadJsonPreference context null");
          _monitor_exit(QQToken.class);
          return null;
       }else if(p0 == null){
          SLog.i("QQToken", "loadJsonPreference prefKey is null");
          _monitor_exit(QQToken.class);
          return null;
       }else {
          String str = QQToken.a().getString(QQToken.a(p0), "");
          if (TextUtils.isEmpty(str)) {
             if (!JniInterface.isJniOk) {
                i.a(AuthAgent.SECURE_LIB_FILE_NAME, AuthAgent.SECURE_LIB_NAME, 5);
                JniInterface.loadSo();
             }
             if (!JniInterface.isJniOk) {
                SLog.i("QQToken", "loadJsonPreference jni load fail SECURE_LIB_VERSION=5");
                _monitor_exit(QQToken.class);
                return null;
             }else {
                str = QQToken.c(p0);
                str1 = QQToken.a().getString(str, "");
                if (TextUtils.isEmpty(str1)) {
                   str = QQToken.b(p0);
                   str1 = QQToken.a().getString(str, "");
                   if (TextUtils.isEmpty(str1)) {
                      SLog.i("QQToken", "loadJsonPreference oldDesValue null");
                      _monitor_exit(QQToken.class);
                      return null;
                   }else {
                      try{
                         str1 = JniInterface.d1(str1);
                         if (TextUtils.isEmpty(str1)) {
                            SLog.i("QQToken", "loadJsonPreference decodeResult d1 empty");
                            g.a(QQToken.a().edit().remove(str));
                            _monitor_exit(QQToken.class);
                            return null;
                         }else {
                            QQToken.a(p0, new JSONObject(str1), p1);
                            g.a(QQToken.a().edit().remove(str));
                         }
                      }catch(java.lang.Exception e5){
                         SLog.e("QQToken", "Catch Exception", e5);
                         g.a(QQToken.a().edit().remove(str));
                         _monitor_exit(QQToken.class);
                         return null;
                      }
                   }
                }else {
                   try{
                      str1 = JniInterface.d2(str1);
                      QQToken.a(p0, new JSONObject(str1), p1);
                      g.a(QQToken.a().edit().remove(str));
                   }catch(java.lang.Exception e5){
                      SLog.e("QQToken", "Catch Exception", e5);
                      g.a(QQToken.a().edit().remove(str));
                      _monitor_exit(QQToken.class);
                      return null;
                   }
                }
             }
          }else {
             str1 = p1.b(str);
          }
          SLog.i("QQToken", "loadJsonPreference sucess");
          _monitor_exit(QQToken.class);
          return new JSONObject(str1);
       }
    }
    public static synchronized boolean a(String p0,JSONObject p1,a p2){
       _monitor_enter(QQToken.class);
       if (f.a() == null) {
          SLog.i("QQToken", "saveJsonPreference context null");
          _monitor_exit(QQToken.class);
          return false;
       }else if(p0 == null || p1 == null){
          SLog.i("QQToken", "saveJsonPreference prefKey or jsonObject null");
          _monitor_exit(QQToken.class);
          return false;
       }else {
          try{
             String str = p1.getString("expires_in");
             if (!TextUtils.isEmpty(str)) {
                p1.put("expires_time", (System.currentTimeMillis() + (Long.parseLong(str) * 1000)));
                p0 = QQToken.a(p0);
                String str1 = p2.a(p1.toString());
                if (p0.length() <= 6 || str1 == null) {
                   SLog.i("QQToken", "saveJsonPreference keyEncode or josnEncode null");
                   _monitor_exit(QQToken.class);
                   return false;
                }else {
                   g.b(QQToken.a().edit().putString(p0, str1));
                   SLog.i("QQToken", "saveJsonPreference sucess");
                   _monitor_exit(QQToken.class);
                   return true;
                }
             }else {
                SLog.i("QQToken", "expires is null");
                _monitor_exit(QQToken.class);
                return false;
             }
          }catch(java.lang.Exception e9){
             SLog.e("QQToken", "saveJsonPreference exception:"+e9.toString());
             _monitor_exit(QQToken.class);
             return false;
          }
       }
    }
    public static String b(String p0){
       return Base64.encodeToString(k.j(p0), 2);
    }
    public static String c(String p0){
       return Base64.encodeToString(k.j(p0), 2)+"_spkey";
    }
    public String getAccessToken(){
       return this.b;
    }
    public String getAppId(){
       return this.a;
    }
    public int getAuthSource(){
       return this.d;
    }
    public long getExpireTimeInSecond(){
       return this.e;
    }
    public String getOpenId(){
       return this.c;
    }
    public String getOpenIdWithCache(){
       String openId = this.getOpenId();
       try{
          String str = " appId = ";
          if (TextUtils.isEmpty(openId)) {
             JSONObject jSONObject = this.loadSession(this.a);
             if (jSONObject != null) {
                openId = jSONObject.getString("openid");
                if (!TextUtils.isEmpty(openId)) {
                   this.setOpenId(openId);
                }
             }
             SLog.i("QQToken", "getOpenId from Session openId = "+openId+str+this.a);
          }else {
             SLog.i("QQToken", "getOpenId from field openId = "+openId+str+this.a);
          }
       }catch(java.lang.Exception e2){
          SLog.i("QQToken", "getLocalOpenIdByAppId "+e2.toString());
       }
       return openId;
    }
    public boolean isSessionValid(){
       boolean b = (this.b != null && System.currentTimeMillis() - this.e < 0)? true: false;
       return b;
    }
    public JSONObject loadSession(String p0){
       try{
          if (this.f == null) {
             this.f = new a(f.a());
          }
          return QQToken.a(p0, this.f);
       }catch(java.lang.Exception e3){
          SLog.i("QQToken", "login loadSession"+e3.toString());
          return null;
       }
    }
    public void removeSession(String p0){
       SharedPreferences$Editor uEditor = QQToken.a().edit();
       uEditor.remove(QQToken.c(p0));
       uEditor.remove(QQToken.c(p0));
       uEditor.remove(QQToken.a(p0));
       g.a(uEditor);
       SLog.i("QQToken", "removeSession sucess");
    }
    public boolean saveSession(JSONObject p0){
       try{
          if (this.f == null) {
             this.f = new a(f.a());
          }
          return QQToken.a(this.a, p0, this.f);
       }catch(java.lang.Exception e3){
          SLog.i("QQToken", "login saveSession"+e3.toString());
          return false;
       }
    }
    public void setAccessToken(String p0,String p1){
       this.b = p0;
       this.e = 0;
       if (p1 != null) {
          this.e = System.currentTimeMillis() + (Long.parseLong(p1) * 1000);
       }
       return;
    }
    public void setAppId(String p0){
       this.a = p0;
    }
    public void setAuthSource(int p0){
       this.d = p0;
    }
    public void setOpenId(String p0){
       this.c = p0;
       b.a().a(p0);
    }
}
