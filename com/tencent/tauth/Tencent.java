package com.tencent.tauth.Tencent;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import com.tencent.connect.auth.c;
import com.tencent.open.b.b;
import java.lang.StringBuilder;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ActivityInfo;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tencent.open.utils.g;
import com.tencent.open.a.a;
import android.content.Intent;
import com.tencent.tauth.IUiListener;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.utils.i;
import java.lang.Boolean;
import com.tencent.open.utils.k;
import java.lang.Integer;
import java.util.Map;
import java.util.HashMap;
import org.json.JSONObject;
import java.util.Iterator;
import android.net.Uri;
import java.lang.Throwable;
import com.tencent.open.log.Tracer;
import android.app.Activity;
import com.tencent.open.SocialOperation;
import com.tencent.connect.auth.QQToken;
import java.lang.Long;
import java.lang.Exception;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import com.tencent.connect.share.QzonePublish;
import com.tencent.open.utils.HttpUtils;
import com.tencent.tauth.IRequestListener;
import com.tencent.connect.avatar.QQAvatar;
import java.util.ArrayList;
import com.tencent.connect.emotion.QQEmotion;
import com.tencent.connect.share.QQShare;
import com.tencent.connect.share.QzoneShare;
import com.tencent.open.apireq.IApiCallback;
import com.tencent.connect.api.QQAuthManage;
import com.tencent.open.im.IM;
import com.tencent.open.miniapp.MiniApp;

public class Tencent	// class@000f90
{
    public final c a;
    public String b;
    public static boolean USE_ONE_HOUR;
    public static Tencent c;

    public void Tencent(String p0,Context p1){
       super();
       this.a = c.a(p0, p1);
       b.a().a(p0, p1);
    }
    public static String a(Object[] p0){
       StringBuilder str = "";
       if (p0 == null || !p0.length) {
          return str;
       }
       if (p0.length % 2) {
          return str;
       }
       str = "";
       int len = p0.length;
       for (int i = 0; i < len; i = i + 2) {
          if (i > 0) {
             str = str+'|';
          }
          int i1 = i + 1;
          str = str+p0[i]+':'+p0[i1];
       }
       return str;
    }
    public static void a(String p0,Object p1){
       b.a().a(p0, p1);
    }
    public static void a(String p0,Object[] p1){
       b.a().a(p0, Tencent.a(p1));
    }
    public static boolean a(Context p0,String p1){
       int i = 0;
       try{
          ComponentName uComponentNa = new ComponentName(p0.getPackageName(), "com.tencent.tauth.AuthActivity");
          PackageManager packageManag = p0.getPackageManager();
          try{
             packageManag.getActivityInfo(uComponentNa, 128);
             p0.getPackageManager().getActivityInfo(new ComponentName(p0.getPackageName(), "com.tencent.connect.common.AssistActivity"), 128);
             return true;
          }catch(android.content.pm.PackageManager$NameNotFoundException e0){
             SLog.e(e0, "AndroidManifest.xml 没有检测到com.tencent.connect.common.AssistActivity\n"+"没有在AndroidManifest.xml中检测到com.tencent.connect.common.AssistActivity,请加上com.tencent.connect.common.AssistActivity,详细信息请查看官网文档.\n配置示例如下: \n<activity\n     android:name=\"com.tencent.connect.common.AssistActivity\"\n     android:screenOrientation=\"behind\"\n     android:theme=\"@android:style/Theme.Translucent.NoTitleBar\"\n     android:configChanges=\"orientation|keyboardHidden\">\n</activity>");
             return i;
          }
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          SLog.e(e0, "AndroidManifest.xml 没有检测到com.tencent.tauth.AuthActivity"+"没有在AndroidManifest.xml中检测到com.tencent.tauth.AuthActivity,请加上com.tencent.tauth.AuthActivity,并配置<data android:scheme=\"tencent"+p1+"\" />,详细信息请查看官网文档."+"\n配置示例如下: \n<activity\n     android:name=\"com.tencent.tauth.AuthActivity\"\n     android:noHistory=\"true\"\n     android:launchMode=\"singleTask\">\n<intent-filter>\n    <action android:name=\"android.intent.action.VIEW\" />\n    <category android:name=\"android.intent.category.DEFAULT\" />\n    <category android:name=\"android.intent.category.BROWSABLE\" />\n    <data android:scheme=\"tencent"+p1+"\" />\n</intent-filter>\n</activity>");
          return i;
       }
    }
    public static synchronized Tencent createInstance(String p0,Context p1){
       _monitor_enter(Tencent.class);
       f.a(p1.getApplicationContext());
       SLog.i("openSDK_LOG.Tencent", "createInstance\(\)  -- start, appId = "+p0);
       Tencent tencent = null;
       if (TextUtils.isEmpty(p0)) {
          SLog.e("openSDK_LOG.Tencent", "appId should not be empty!");
          _monitor_exit(Tencent.class);
          return tencent;
       }else {
          Tencent c = Tencent.c;
          if (c == null) {
             Tencent.c = new Tencent(p0, p1);
          }else if(!p0.equals(c.getAppId())){
             Tencent.c.logout(p1);
             Tencent.c = new Tencent(p0, p1);
          }
          if (!Tencent.a(p1, p0)) {
             _monitor_exit(Tencent.class);
             return tencent;
          }else {
             Object[] objArray = new Object[]{"appid",p0};
             Tencent.a("createInstance", objArray);
             a.a().a(g.a(p1, p0));
             SLog.i("openSDK_LOG.Tencent", "createInstance\(\)  -- end");
             _monitor_exit(Tencent.class);
             return Tencent.c;
          }
       }
    }
    public static synchronized Tencent createInstance(String p0,Context p1,String p2){
       _monitor_enter(Tencent.class);
       Tencent tencent = Tencent.createInstance(p0, p1);
       SLog.i("openSDK_LOG.Tencent", "createInstance\(\)  -- start, appId = "+p0+", authorities="+p2);
       Object[] objArray = new Object[]{"appid",p0,"authorities",p2};
       Tencent.a("createInstance_authority", objArray);
       if (tencent != null) {
          tencent.b = p2;
       }else {
          SLog.i("openSDK_LOG.Tencent", "null == tencent set mAuthorities fail");
       }
       _monitor_exit(Tencent.class);
       return tencent;
    }
    public static synchronized String getAuthorities(String p0){
       Tencent b;
       _monitor_enter(Tencent.class);
       Object[] objArray = new Object[]{"appid",p0};
       Tencent.a("getAuthorities", objArray);
       if (TextUtils.isEmpty(p0)) {
          SLog.i("openSDK_LOG.Tencent", "TextUtils.isEmpty\(appId\)");
          _monitor_exit(Tencent.class);
          return null;
       }else {
          Tencent c = Tencent.c;
          if (c == null) {
             SLog.i("openSDK_LOG.Tencent", "sInstance == null");
             _monitor_exit(Tencent.class);
             return null;
          }else if(p0.equals(c.getAppId())){
             b = Tencent.c.b;
          }else {
             p0 = "";
          }
          _monitor_exit(Tencent.class);
          return b;
       }
    }
    public static void handleResultData(Intent p0,IUiListener p1){
       StringBuilder str = "handleResultData\(\) data = null ? ";
       boolean b = true;
       boolean b1 = (p0 == null)? true: false;
       str = str+b1+", listener = null ? ";
       if (p1 != null) {
          b = false;
       }
       SLog.i("openSDK_LOG.Tencent", str+b);
       Object[] objArray = new Object[0];
       Tencent.a("handleResultData", objArray);
       UIListenerManager.getInstance().handleDataToListener(p0, p1);
       return;
    }
    public static boolean isSupportPushToQZone(Context p0){
       boolean b = (i.c(p0, "5.9.5") >= 0 || i.a(p0, "com.tencent.qqlite") != null)? true: false;
       SLog.i("openSDK_LOG.Tencent", "isSupportPushToQZone\(\) support="+b);
       Tencent.a("isSupportPushToQZone", Boolean.valueOf(b));
       return b;
    }
    public static boolean isSupportShareToQQ(Context p0){
       SLog.i("openSDK_LOG.Tencent", "isSupportShareToQQ\(\)");
       boolean b = true;
       if (k.c(p0) && i.a(p0, "com.tencent.minihd.qq") != null) {
          Tencent.a("isSupportShareToQQ", Boolean.TRUE);
          return b;
       }else if(i.c(p0, "4.1") < 0 && (i.a(p0, "com.tencent.tim") != null || i.a(p0, "com.tencent.qqlite") != null)){
          b = false;
       }
    label_0038 :
       SLog.i("openSDK_LOG.Tencent", "isSupportShareToQQ\(\) support="+b);
       Tencent.a("isSupportShareToQQ", Boolean.valueOf(b));
       return b;
    }
    public static boolean onActivityResultData(int p0,int p1,Intent p2,IUiListener p3){
       StringBuilder str = "onActivityResultData\(\) reqcode = "+p0+", resultcode = "+p1+", data = null ? ";
       int i = 1;
       int i1 = 0;
       boolean b = (p2 == null)? true: false;
       str = str+b+", listener = null ? ";
       b = (p3 == null)? true: false;
       SLog.i("openSDK_LOG.Tencent", str+b);
       Object[] objArray = new Object[]{"requestCode",Integer.valueOf(p0),"resultCode",Integer.valueOf(p1)};
       Tencent.a("onActivityResultData", objArray);
       return UIListenerManager.getInstance().onActivityResult(p0, p1, p2, p3);
    }
    public static Map parseMiniParameters(Intent p0){
       int i = 0;
       Object[] objArray = new Object[i];
       Tencent.a("parseMiniParameters", objArray);
       HashMap hashMap = new HashMap();
       if (p0 == null) {
          SLog.e("openSDK_LOG.Tencent", "parseMiniParameters null == intent");
          return hashMap;
       }else {
          try{
             String stringExtra = p0.getStringExtra("appParameter");
             if (!TextUtils.isEmpty(stringExtra)) {
                SLog.d("openSDK_LOG.Tencent", "parseMiniParameters appParameter="+stringExtra);
                JSONObject jSONObject = new JSONObject(stringExtra);
                Iterator iterator = jSONObject.keys();
                while (iterator.hasNext()) {
                   stringExtra = iterator.next();
                   hashMap.put(stringExtra, jSONObject.getString(stringExtra));
                }
                return hashMap;
             }else {
                Uri data = p0.getData();
                if (data == null) {
                   SLog.d("openSDK_LOG.Tencent", "parseMiniParameters uri==null");
                   return hashMap;
                }else {
                   String str = data.toString();
                   if (TextUtils.isEmpty(str)) {
                      SLog.d("openSDK_LOG.Tencent", "parseMiniParameters uriStr isEmpty");
                      return hashMap;
                   }else {
                      str = str.substring((str.lastIndexOf(63) + 1));
                      if (TextUtils.isEmpty(str)) {
                         SLog.d("openSDK_LOG.Tencent", "parseMiniParameters uriParam is empty");
                         return hashMap;
                      }else {
                         SLog.d("openSDK_LOG.Tencent", "parseMiniParameters uriParam="+str);
                         String[] stringArray = str.split("&");
                         int len = stringArray.length;
                         int i1 = 0;
                         while (i1 < len) {
                            String[] stringArray1 = (stringArray[i1]).split("=");
                            if (stringArray1.length == 2) {
                               hashMap.put(stringArray1[i], stringArray1[1]);
                            }
                            i1 = i1 + 1;
                         }
                      }
                   }
                }
             }
          }catch(java.lang.Exception e9){
             SLog.e("openSDK_LOG.Tencent", "parseMiniParameters Exception", e9);
          }
          return hashMap;
       }
    }
    public static void setCustomLogger(Tracer p0){
       SLog.i("openSDK_LOG.Tencent", "setCustomLogger");
       Object[] objArray = new Object[0];
       Tencent.a("setCustomLogger", objArray);
       SLog.getInstance().setCustomLogger(p0);
    }
    public void bindQQGroup(Activity p0,String p1,String p2,IUiListener p3){
       SLog.i("openSDK_LOG.Tencent", "bindQQGroup\(\)");
       Object[] objArray = new Object[]{"organizationId",p1,"organizationName",p2};
       Tencent.a("bindQQGroup", objArray);
       new SocialOperation(this.getQQToken()).bindQQGroup(p0, p1, p2, p3);
    }
    public void checkLogin(IUiListener p0){
       SLog.i("openSDK_LOG.Tencent", "checkLogin\(\)");
       Object[] objArray = new Object[0];
       Tencent.a("checkLogin", objArray);
       this.a.a(p0);
    }
    public String getAccessToken(){
       String accessToken = this.a.b().getAccessToken();
       SLog.i("openSDK_LOG.Tencent", "getAccessToken\(\) accessToken = "+accessToken);
       Object[] objArray = new Object[0];
       Tencent.a("getAccessToken", objArray);
       return accessToken;
    }
    public String getAppId(){
       String appId = this.a.b().getAppId();
       SLog.i("openSDK_LOG.Tencent", "getAppId\(\) appid ="+appId);
       Tencent.a("getAppId", appId);
       return appId;
    }
    public long getExpiresIn(){
       long expireTimeIn = this.a.b().getExpireTimeInSecond();
       SLog.i("openSDK_LOG.Tencent", "getExpiresIn\(\) expiresin= "+expireTimeIn);
       Tencent.a("getExpiresIn", Long.valueOf(expireTimeIn));
       return expireTimeIn;
    }
    public String getOpenId(){
       String openId = this.a.b().getOpenId();
       SLog.i("openSDK_LOG.Tencent", "getOpenId\(\) openid= "+openId);
       Object[] objArray = new Object[0];
       Tencent.a("getOpenId", objArray);
       return openId;
    }
    public QQToken getQQToken(){
       SLog.i("openSDK_LOG.Tencent", "getQQToken\(\)");
       Object[] objArray = new Object[0];
       Tencent.a("getQQToken", objArray);
       return this.a.b();
    }
    public void handleLoginData(Intent p0,IUiListener p1){
       StringBuilder str = "handleLoginData\(\) data = null ? ";
       boolean b = true;
       boolean b1 = (p0 == null)? true: false;
       str = str+b1+", listener = null ? ";
       if (p1 != null) {
          b = false;
       }
       SLog.i("openSDK_LOG.Tencent", str+b);
       Object[] objArray = new Object[0];
       Tencent.a("handleLoginData", objArray);
       UIListenerManager.getInstance().handleDataToListener(p0, p1);
       return;
    }
    public void initSessionCache(JSONObject p0){
       Object[] objArray = new Object[0];
       String str = "initSessionCache";
       try{
          Tencent.a(str, objArray);
          String str1 = p0.getString("access_token");
          str = p0.getString("expires_in");
          String str2 = p0.getString("openid");
          if (!TextUtils.isEmpty(str1) && (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2))) {
             this.setAccessToken(str1, str);
             this.setOpenId(str2);
          }
       label_0032 :
          SLog.i("openSDK_LOG.Tencent", "initSessionCache\(\)");
       }catch(java.lang.Exception e4){
          SLog.i("QQToken", "initSessionCache "+e4.toString());
       }
       return;
    }
    public boolean isQQInstalled(Context p0){
       boolean b = i.b(p0);
       SLog.i("openSDK_LOG.Tencent", "isQQInstalled\(\) installed="+b);
       Tencent.a("isQQInstalled", Boolean.valueOf(b));
       return b;
    }
    public boolean isReady(){
       boolean b = (this.isSessionValid() && this.getOpenId() != null)? true: false;
       SLog.i("openSDK_LOG.Tencent", "isReady\(\) --ready="+b);
       Tencent.a("isReady", Boolean.valueOf(b));
       return b;
    }
    public boolean isSessionValid(){
       boolean b = this.a.c();
       SLog.i("openSDK_LOG.Tencent", "isSessionValid\(\) isvalid ="+b);
       Tencent.a("isSessionValid", Boolean.valueOf(b));
       return b;
    }
    public boolean isSupportSSOLogin(Activity p0){
       SLog.i("openSDK_LOG.Tencent", "isSupportSSOLogin\(\)");
       boolean b = true;
       if (k.c(p0) && i.a(p0, "com.tencent.minihd.qq") != null) {
          Tencent.a("isSupportSSOLogin", Boolean.TRUE);
          return b;
       }else if(i.c(p0, "4.1") < 0 && (i.d(p0, "1.1") >= 0 || i.e(p0, "4.0.0") >= 0)){
          b = false;
       }
    label_0038 :
       SLog.i("openSDK_LOG.Tencent", "isSupportSSOLogin\(\) support="+b);
       Tencent.a("isSupportSSOLogin", Boolean.valueOf(b));
       return b;
    }
    public void joinQQGroup(Activity p0,String p1,IUiListener p2){
       SLog.i("openSDK_LOG.Tencent", "joinQQGroup\(\)");
       Object[] objArray = new Object[]{"organizationId",p1};
       Tencent.a("joinQQGroup", objArray);
       new SocialOperation(this.getQQToken()).joinGroup(p0, p1, p2);
    }
    public JSONObject loadSession(String p0){
       JSONObject jSONObject = this.a.b().loadSession(p0);
       StringBuilder str = "loadSession\(\) appid "+p0+", length=";
       int i = 0;
       int i1 = (jSONObject != null)? jSONObject.length(): 0;
       SLog.i("openSDK_LOG.Tencent", str+i1);
       Object[] objArray = new Object[]{"appid",p0};
       Tencent.a("loadSession", objArray);
       return jSONObject;
    }
    public int login(Activity p0,IUiListener p1,Map p2){
       SLog.i("openSDK_LOG.Tencent", "login activity with params");
       Object[] objArray = new Object[0];
       Tencent.a("login_param", objArray);
       return this.a.a(p0, p1, p2);
    }
    public int login(Activity p0,String p1,IUiListener p2){
       SLog.i("openSDK_LOG.Tencent", "login\(\) with activity, scope is "+p1);
       Object[] objArray = new Object[]{"scope",p1};
       Tencent.a("login_scope", objArray);
       return this.a.a(p0, p1, p2);
    }
    public int login(Activity p0,String p1,IUiListener p2,boolean p3){
       SLog.i("openSDK_LOG.Tencent", "login\(\) with activity, scope is "+p1);
       Object[] objArray = new Object[]{"scope",p1,"qrcode",Boolean.valueOf(p3)};
       Tencent.a("login_qrcode", objArray);
       return this.a.a(p0, p1, p2, p3);
    }
    public int login(Fragment p0,String p1,IUiListener p2){
       SLog.i("openSDK_LOG.Tencent", "login\(\) with fragment, scope is "+p1);
       Object[] objArray = new Object[]{"scope",p1};
       Tencent.a("login_fragment_scope", objArray);
       return this.a.a(p0, p1, p2, "");
    }
    public int login(Fragment p0,String p1,IUiListener p2,boolean p3){
       SLog.i("openSDK_LOG.Tencent", "login\(\) with fragment, scope is "+p1);
       Object[] objArray = new Object[]{"scope",p1,"qrcode",Boolean.valueOf(p3)};
       Tencent.a("login_fragment_scope_qrcode", objArray);
       return this.a.a(p0, p1, p2, "", p3);
    }
    public int loginServerSide(Activity p0,String p1,IUiListener p2){
       SLog.i("openSDK_LOG.Tencent", "loginServerSide\(\) with activity, scope = "+p1+",server_side");
       Object[] objArray = new Object[]{"scope",p1};
       Tencent.a("loginServerSide_activity", objArray);
       return this.a.a(p0, p1+",server_side", p2);
    }
    public int loginServerSide(Fragment p0,String p1,IUiListener p2){
       SLog.i("openSDK_LOG.Tencent", "loginServerSide\(\) with fragment, scope = "+p1+",server_side");
       Object[] objArray = new Object[]{"scope",p1};
       Tencent.a("loginServerSide_fragment", objArray);
       return this.a.a(p0, p1+",server_side", p2, "");
    }
    public int loginWithOEM(Activity p0,String p1,IUiListener p2,boolean p3,String p4,String p5,String p6){
       object oobject = p1;
       SLog.i("openSDK_LOG.Tencent", "loginWithOEM\(\) with activity, scope = "+p1);
       Object[] objArray = new Object[10];
       objArray[0] = "scope";
       objArray[1] = oobject;
       objArray[2] = "qrcode";
       objArray[3] = Boolean.valueOf(p3);
       objArray[4] = "registerChannel";
       objArray[5] = p4;
       objArray[6] = "installChannel";
       objArray[7] = p5;
       objArray[8] = "businessId";
       objArray[9] = p6;
       Tencent.a("loginWithOEM", objArray);
       return this.a.a(p0, oobject, p2, p3, p4, p5, p6);
    }
    public void logout(Context p0){
       SLog.i("openSDK_LOG.Tencent", "logout\(\)");
       Object[] objArray = new Object[0];
       Tencent.a("logout", objArray);
       this.a.b().setAccessToken(null, "0");
       this.a.b().setOpenId(null);
       this.a.b().removeSession(this.a.b().getAppId());
    }
    public void publishToQzone(Activity p0,Bundle p1,IUiListener p2){
       SLog.i("openSDK_LOG.Tencent", "publishToQzone\(\)");
       Object[] objArray = new Object[0];
       Tencent.a("publishToQzone", objArray);
       new QzonePublish(p0, this.a.b()).publishToQzone(p0, p1, p2);
    }
    public int reAuth(Activity p0,String p1,IUiListener p2){
       SLog.i("openSDK_LOG.Tencent", "reAuth\(\) with activity, scope = "+p1);
       Object[] objArray = new Object[]{"scope",p1};
       Tencent.a("reAuth", objArray);
       return this.a.b(p0, p1, p2);
    }
    public void reportDAU(){
       SLog.i("openSDK_LOG.Tencent", "reportDAU\(\) ");
       Object[] objArray = new Object[0];
       Tencent.a("reportDAU", objArray);
       this.a.a();
    }
    public JSONObject request(String p0,Bundle p1,String p2){
       SLog.i("openSDK_LOG.Tencent", "request\(\)");
       Object[] objArray = new Object[]{"graphPath",p0,"httpMethod",p2};
       Tencent.a("request", objArray);
       return HttpUtils.request(this.a.b(), f.a(), p0, p1, p2);
    }
    public void requestAsync(String p0,Bundle p1,String p2,IRequestListener p3){
       SLog.i("openSDK_LOG.Tencent", "requestAsync\(\)");
       Object[] objArray = new Object[]{"graphPath",p0,"httpMethod",p2};
       Tencent.a("requestAsync", objArray);
       HttpUtils.requestAsync(this.a.b(), f.a(), p0, p1, p2, p3);
    }
    public void saveSession(JSONObject p0){
       StringBuilder str = "saveSession\(\) length=";
       int i = 0;
       int i1 = (p0 != null)? p0.length(): 0;
       SLog.i("openSDK_LOG.Tencent", str+i1);
       Object[] objArray = new Object[i];
       Tencent.a("saveSession", objArray);
       this.a.b().saveSession(p0);
       return;
    }
    public void setAccessToken(String p0,String p1){
       SLog.i("openSDK_LOG.Tencent", "setAccessToken\(\), expiresIn = "+p1+"");
       Object[] objArray = new Object[0];
       Tencent.a("setAccessToken", objArray);
       this.a.a(p0, p1);
    }
    public void setAvatar(Activity p0,Bundle p1,IUiListener p2){
       SLog.i("openSDK_LOG.Tencent", "setAvatar\(\)");
       Object[] objArray = new Object[0];
       Tencent.a("setAvatar", objArray);
       new QQAvatar(this.a.b()).setAvatar(p0, Uri.parse(p1.getString("picture")), p2, p1.getInt("exitAnim"));
    }
    public void setAvatar(Activity p0,Bundle p1,IUiListener p2,int p3,int p4){
       SLog.i("openSDK_LOG.Tencent", "setAvatar\(\)");
       Object[] objArray = new Object[0];
       Tencent.a("setAvatar_anim", objArray);
       p1.putInt("exitAnim", p4);
       p0.overridePendingTransition(p3, 0);
       this.setAvatar(p0, p1, p2);
    }
    public void setAvatarByQQ(Activity p0,Uri p1,IUiListener p2){
       SLog.i("openSDK_LOG.Tencent", "setAvatarByQQ\(\)");
       Object[] objArray = new Object[0];
       Tencent.a("setAvatarByQQ", objArray);
       new QQAvatar(this.a.b()).setAvatarByQQ(p0, p1, p2);
    }
    public void setDynamicAvatar(Activity p0,Uri p1,IUiListener p2){
       SLog.i("openSDK_LOG.Tencent", "setDynamicAvatar\(\)");
       Object[] objArray = new Object[0];
       Tencent.a("setDynamicAvatar", objArray);
       new QQAvatar(this.a.b()).setDynamicAvatar(p0, p1, p2);
    }
    public void setEmotions(Activity p0,ArrayList p1,IUiListener p2){
       SLog.i("openSDK_LOG.Tencent", "saveQQEmotions\(\)");
       Object[] objArray = new Object[0];
       Tencent.a("setEmotions", objArray);
       new QQEmotion(this.a.b()).setEmotions(p0, p1, p2);
    }
    public void setOpenId(String p0){
       SLog.i("openSDK_LOG.Tencent", "setOpenId\(\) --start");
       Object[] objArray = new Object[0];
       Tencent.a("setOpenId", objArray);
       this.a.b(f.a(), p0);
       SLog.i("openSDK_LOG.Tencent", "setOpenId\(\) --end");
    }
    public void shareToQQ(Activity p0,Bundle p1,IUiListener p2){
       SLog.i("openSDK_LOG.Tencent", "shareToQQ\(\)");
       Object[] objArray = new Object[0];
       Tencent.a("shareToQQ", objArray);
       if (TextUtils.isEmpty(this.b)) {
          p2.onWarning(-19);
       }
       new QQShare(p0, this.a.b()).shareToQQ(p0, p1, p2);
       return;
    }
    public void shareToQzone(Activity p0,Bundle p1,IUiListener p2){
       SLog.i("openSDK_LOG.Tencent", "shareToQzone\(\)");
       Object[] objArray = new Object[0];
       Tencent.a("shareToQzone", objArray);
       new QzoneShare(p0, this.a.b()).shareToQzone(p0, p1, p2);
    }
    public void startAuthManagePage(Activity p0,IApiCallback p1){
       SLog.i("openSDK_LOG.Tencent", "startAuthManagePage");
    }
    public int startIMAio(Activity p0,String p1,String p2){
       SLog.i("openSDK_LOG.Tencent", "startIMAio\(\)");
       Object[] objArray = new Object[]{"uin",p1,"pkg_name",p2};
       Tencent.a("startIMAio", objArray);
       return this.startIMConversation(p0, "thirdparty2c", p1, p2);
    }
    public int startIMAudio(Activity p0,String p1,String p2){
       SLog.i("openSDK_LOG.Tencent", "startIMAudio\(\)");
       Object[] objArray = new Object[]{"uin",p1,"pkg_name",p2};
       Tencent.a("startIMAudio", objArray);
       return this.startIMConversation(p0, "audio_chat", p1, p2);
    }
    public int startIMConversation(Activity p0,String p1,String p2,String p3){
       Object[] objArray = new Object[]{"chatType",p1,"uin",p2,"pkg_name",p3};
       Tencent.a("startIMConversation", objArray);
       return new IM(this.getQQToken()).startIMConversation(p0, p1, p2, p3);
    }
    public int startIMVideo(Activity p0,String p1,String p2){
       SLog.i("openSDK_LOG.Tencent", "startIMVideo\(\)");
       Object[] objArray = new Object[]{"uin",p1,"pkg_name",p2};
       Tencent.a("startIMVideo", objArray);
       return this.startIMConversation(p0, "video_chat", p1, p2);
    }
    public int startMiniApp(Activity p0,String p1,String p2,String p3){
       SLog.i("openSDK_LOG.Tencent", "startMiniApp\(\)");
       Object[] objArray = new Object[]{"miniAppId",p1,"miniAppPath",p2,"miniAppVersion",p3};
       Tencent.a("startMiniApp", objArray);
       return new MiniApp(this.getQQToken()).startMiniApp(p0, "mini_program_or_game", p1, "21", p2, p3);
    }
    public void unBindQQGroup(Context p0,String p1,IUiListener p2){
       SLog.i("openSDK_LOG.Tencent", "unBindQQGroup\(\)");
       Object[] objArray = new Object[]{"organizationId",p1};
       Tencent.a("unBindQQGroup", objArray);
       new SocialOperation(this.getQQToken()).unBindGroup(p0, p1, p2);
    }
}
