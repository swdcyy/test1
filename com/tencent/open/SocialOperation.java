package com.tencent.open.SocialOperation;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.auth.QQToken;
import android.app.Activity;
import android.content.Intent;
import java.lang.String;
import com.tencent.open.TDialog;
import android.content.Context;
import com.tencent.tauth.IUiListener;
import android.app.Dialog;
import com.tencent.open.log.SLog;
import com.tencent.tauth.UiError;
import java.lang.StringBuffer;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tencent.open.utils.k;
import java.lang.StringBuilder;
import android.util.Base64;
import android.net.Uri;
import com.tencent.open.utils.i;
import com.tencent.open.SocialOperation$3;
import android.os.Bundle;
import com.tencent.connect.common.BaseApi$TempRequestListener;
import com.tencent.tauth.IRequestListener;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.SocialOperation$2;
import com.tencent.open.b.e;
import java.lang.Throwable;
import com.tencent.open.SocialOperation$1;

public class SocialOperation extends BaseApi	// class@000f32
{

    public void SocialOperation(QQToken p0){
       super(p0);
    }
    public static void a(SocialOperation p0,Activity p1){
       p0.a(p1);
    }
    public static void a(SocialOperation p0,Activity p1,int p2,Intent p3,boolean p4){
       p0.a(p1, p2, p3, p4);
    }
    public static void b(SocialOperation p0,Activity p1,int p2,Intent p3,boolean p4){
       p0.a(p1, p2, p3, p4);
    }
    public final void a(Activity p0){
       this.a(p0, "");
    }
    public final void a(Activity p0,String p1){
       TDialog tDialog = new TDialog(p0, "", this.a(p1), null, this.c);
       v6.show();
    }
    public void bindQQGroup(Activity p0,String p1,String p2,IUiListener p3){
       String str = "openSDK_LOG.GameAppOperation";
       SLog.i(str, "-->bindQQGroup\(\)  -- start");
       if (p0 == null) {
          SLog.e(str, "-->bindQQGroup, activity is empty.");
          if (p3 != null) {
             p3.onError(new UiError(1001, "param acitivty is null", "activity param of api can not be null."));
          }
          return;
       }else {
          StringBuffer str1 = "mqqapi://opensdk/bind_group?src_type=app&version=1";
          String appId = this.c.getAppId();
          String str2 = "please login.";
          if (TextUtils.isEmpty(appId)) {
             SLog.e(str, "-->bindQQGroup, appId is empty.");
             if (p3 != null) {
                p3.onError(new UiError(1003, "appid is null", str2));
             }
             return;
          }else {
             String openId = this.c.getOpenId();
             if (TextUtils.isEmpty(openId)) {
                SLog.e(str, "-->bindQQGroup, openid is empty.");
                if (p3 != null) {
                   p3.onError(new UiError(1004, "openid params is null", str2));
                }
                return;
             }else {
                str2 = k.a(p0);
                String str3 = "";
                if (TextUtils.isEmpty(str2)) {
                   SLog.e(str, "-->bindQQGroup, appname is empty.");
                   if (p3 != null) {
                      p3.onError(new UiError(1005, "appName params is null", str3));
                   }
                   return;
                }else if(TextUtils.isEmpty(p1)){
                   SLog.e(str, "-->bindQQGroup, organization id is empty.");
                   if (p3 != null) {
                      p3.onError(new UiError(1006, "organizationId params is null", str3));
                   }
                   return;
                }else if(TextUtils.isEmpty(p2)){
                   SLog.e(str, "-->bindQQGroup, organization name is empty.");
                   if (p3 != null) {
                      p3.onError(new UiError(1007, "organizationName params is null", str3));
                   }
                   return;
                }else {
                   int i = 2;
                   str1 = str1+"&app_name="+Base64.encodeToString(k.j(str2), i)+"&organization_id="+Base64.encodeToString(k.j(p1), i)+"&organization_name="+Base64.encodeToString(k.j(p2), i)+"&openid="+Base64.encodeToString(k.j(openId), i)+"&appid="+Base64.encodeToString(k.j(appId), i)+"&sdk_version="+Base64.encodeToString(k.j("3.5.4.lite"), i)+"&app_name_url_encode="+k.f(Base64.encodeToString(k.j(str2), i))+"&organization_name_url_encode="+k.f(Base64.encodeToString(k.j(p2), i));
                   SLog.v(str, "-->bindQQGroup, url: "+str1);
                   Intent intent = new Intent("android.intent.action.VIEW");
                   intent.setData(Uri.parse(str1));
                   if (!this.a(intent) || i.c(p0, "8.1.0") < 0) {
                      SLog.w(str, "-->bind group, there is no activity, show download page.");
                      this.a(p0);
                      return;
                   }else {
                      Bundle uBundle = this.a();
                      uBundle.putString("appid", appId);
                      uBundle.putString("orgid", p1);
                      HttpUtils.requestAsync(this.c, p0, "https://openmobile.qq.com/cgi-bin/qunopensdk/check_group", uBundle, "GET", new BaseApi$TempRequestListener(this, new SocialOperation$3(this, p3, p0, intent)));
                      SLog.i(str, "-->bindQQGroup\(\) do.");
                      return;
                   }
                }
             }
          }
       }
    }
    public void joinGroup(Activity p0,String p1,IUiListener p2){
       String str = "openSDK_LOG.GameAppOperation";
       SLog.i(str, "joinQQGroup\(\)");
       if (p0 == null) {
          SLog.e(str, "-->joinGroup, activity is empty.");
          if (p2 != null) {
             p2.onError(new UiError(1001, "param acitivty is null", "activity param of api can not be null."));
          }
          return;
       }else if(TextUtils.isEmpty(p1)){
          SLog.e(str, "-->joinGroup, params is empty.");
          if (p2 != null) {
             p2.onError(new UiError(1006, "param organizationId is null", "organizationId param of api can not be null."));
          }
          return;
       }else {
          Intent intent = new Intent();
          String appId = this.c.getAppId();
          if (TextUtils.isEmpty(appId)) {
             SLog.e(str, "-->joinGroup, appid is empty.");
             if (p2 != null) {
                p2.onError(new UiError(1003, "appid is null", "appid is null, please login."));
             }
             return;
          }else {
             String openId = this.c.getOpenId();
             if (TextUtils.isEmpty(openId)) {
                SLog.e(str, "-->joinGroup, openid is empty.");
                if (p2 != null) {
                   p2.onError(new UiError(1004, "openid is null", "openid is null, please login."));
                }
                return;
             }else {
                int i = 2;
                intent.setData(Uri.parse("mqqapi://opensdk/join_group?src_type=app&version=1"+"&openid="+Base64.encodeToString(k.j(openId), i)+"&appid="+Base64.encodeToString(k.j(appId), i)+"&organization_id="+Base64.encodeToString(k.j(p1), i)+"&sdk_version="+Base64.encodeToString(k.j("3.5.4.lite"), i)));
                if (!this.a(intent) || i.c(p0, "8.1.0") < 0) {
                   SLog.w(str, "-->bind group, there is no activity, show download page.");
                   this.a(p0);
                   return;
                }else {
                   Bundle uBundle = this.a();
                   uBundle.putString("appid", appId);
                   uBundle.putString("orgid", p1);
                   HttpUtils.requestAsync(this.c, p0, "https://openmobile.qq.com/cgi-bin/qunopensdk/check_group", uBundle, "GET", new BaseApi$TempRequestListener(this, new SocialOperation$2(this, p2, p0, intent)));
                   SLog.i(str, "-->joinQQGroup\(\) do.");
                   return;
                }
             }
          }
       }
    }
    public void makeFriend(Activity p0,Bundle p1){
       SLog.i("openSDK_LOG.GameAppOperation", "-->makeFriend\(\)  -- start");
       if (p1 == null) {
          SLog.e("openSDK_LOG.GameAppOperation", "-->makeFriend params is null");
          e.a().a(this.c.getOpenId(), this.c.getAppId(), "ANDROIDQQ.MAKEAFRIEND.XX", "14", "18", "1");
          return;
       }else {
          String str = p1.getString("fopen_id");
          if (TextUtils.isEmpty(str)) {
             SLog.e("openSDK_LOG.GameAppOperation", "-->make friend, fOpenid is empty.");
             e.a().a(this.c.getOpenId(), this.c.getAppId(), "ANDROIDQQ.MAKEAFRIEND.XX", "14", "18", "1");
             return;
          }else {
             String str1 = p1.getString("friend_label");
             String str2 = p1.getString("add_msg");
             String str3 = k.a(p0);
             String openId = this.c.getOpenId();
             String appId = this.c.getAppId();
             SLog.v("openSDK_LOG.GameAppOperation", "-->make friend, fOpenid: "+str+" | label: "+str1+" | message: "+str2+" | openid: "+openId+" | appid:"+appId);
             int i = 2;
             StringBuffer str4 = "mqqapi://gamesdk/add_friend?src_type=app&version=1"+"&fopen_id="+Base64.encodeToString(k.j(str), i);
             if (!TextUtils.isEmpty(openId)) {
                str4 = str4+"&open_id="+Base64.encodeToString(k.j(openId), i);
             }
             if (!TextUtils.isEmpty(appId)) {
                str4 = str4+"&app_id="+appId;
             }
             if (!TextUtils.isEmpty(str1)) {
                str4 = str4+"&friend_label="+Base64.encodeToString(k.j(str1), i);
             }
             if (!TextUtils.isEmpty(str2)) {
                str4 = str4+"&add_msg="+Base64.encodeToString(k.j(str2), i);
             }
             if (!TextUtils.isEmpty(str3)) {
                str4 = str4+"&app_name="+Base64.encodeToString(k.j(str3), i);
             }
             SLog.v("openSDK_LOG.GameAppOperation", "-->make friend, url: "+str4);
             Intent intent = new Intent("android.intent.action.VIEW");
             intent.setData(Uri.parse(str4));
             if (this.a(intent) && !k.f(p0, "5.1.0")) {
                try{
                   SLog.i("openSDK_LOG.GameAppOperation", "-->makeFriend target activity found, qqver greater than 5.1.0");
                   p0.startActivity(intent);
                   e.a().a(this.c.getOpenId(), this.c.getAppId(), "ANDROIDQQ.MAKEAFRIEND.XX", "14", "18", "0");
                }catch(java.lang.Exception e11){
                   SLog.e("openSDK_LOG.GameAppOperation", "-->make friend, start activity exception.", e11);
                   this.a(p0);
                   e.a().a(this.c.getOpenId(), this.c.getAppId(), "ANDROIDQQ.MAKEAFRIEND.XX", "14", "18", "1");
                }
             }else {
                SLog.w("openSDK_LOG.GameAppOperation", "-->make friend, there is no activity.");
                this.a(p0);
                e.a().a(this.c.getOpenId(), this.c.getAppId(), "ANDROIDQQ.MAKEAFRIEND.XX", "14", "18", "1");
             }
          }
       }
    }
    public void unBindGroup(Context p0,String p1,IUiListener p2){
       String str = "openSDK_LOG.GameAppOperation";
       SLog.i(str, "unBindQQGroup\(\)");
       if (p0 == null) {
          SLog.e(str, "-->uinBindGroup, activity is empty.");
          if (p2 != null) {
             p2.onError(new UiError(1001, "param acitivty is null", "activity param of api can not be null."));
          }
          return;
       }else if(TextUtils.isEmpty(p1)){
          SLog.e(str, "-->unBindGroup, params is empty.");
          if (p2 != null) {
             p2.onError(new UiError(1006, "param organizationId is null", "organizationId param of api can not be null."));
          }
          return;
       }else {
          String appId = this.c.getAppId();
          if (TextUtils.isEmpty(appId)) {
             SLog.e(str, "-->unBindGroup, appid is empty.");
             if (p2 != null) {
                p2.onError(new UiError(1003, "param appId is null", "appid is null please login."));
             }
             return;
          }else {
             Bundle uBundle = this.a();
             uBundle.putString("appid", appId);
             uBundle.putString("orgid", p1);
             HttpUtils.requestAsync(this.c, p0, "https://openmobile.qq.com/cgi-bin/qunopensdk/unbind", uBundle, "GET", new BaseApi$TempRequestListener(this, new SocialOperation$1(this, p2)));
             SLog.i(str, "-->unBindQQGroup\(\) do.");
             return;
          }
       }
    }
}
