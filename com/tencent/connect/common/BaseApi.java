package com.tencent.connect.common.BaseApi;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.auth.c;
import java.lang.Object;
import android.app.Activity;
import android.content.Intent;
import java.util.Map;
import android.content.Context;
import com.tencent.connect.common.AssistActivity;
import java.lang.Class;
import java.lang.String;
import android.os.Parcelable;
import com.tencent.connect.common.Constants;
import java.lang.Boolean;
import java.lang.Throwable;
import com.tencent.open.log.SLog;
import android.os.Bundle;
import android.os.Build$VERSION;
import android.os.Build;
import com.tencent.open.utils.f;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tencent.open.utils.HttpUtils;
import com.tencent.tauth.IUiListener;
import com.tencent.open.TDialog;
import android.app.Dialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tencent.open.utils.k;
import com.tencent.open.utils.i;
import android.content.ComponentName;

public abstract class BaseApi	// class@000e45
{
    public c b;
    public QQToken c;
    public static String businessId;
    public static String installChannel;
    public static boolean isOEM;
    public static String registerChannel;

    public void BaseApi(QQToken p0){
       super(null, p0);
    }
    public void BaseApi(c p0,QQToken p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Intent a(Activity p0,Intent p1,Map p2){
       Intent intent = new Intent(p0.getApplicationContext(), AssistActivity.class);
       intent.putExtra("is_login", true);
       intent.putExtra("openSDK_LOG.AssistActivity.ExtraIntent", p1);
       if (p2 == null) {
          return intent;
       }
       try{
          if (p2.containsKey(Constants.KEY_RESTORE_LANDSCAPE)) {
             intent.putExtra(Constants.KEY_RESTORE_LANDSCAPE, p2.get(Constants.KEY_RESTORE_LANDSCAPE).booleanValue());
          }
       }catch(java.lang.Exception e3){
          SLog.e("openSDK_LOG.BaseApi", "Exception", e3);
       }
       return intent;
    }
    public Bundle a(){
       Bundle uBundle = new Bundle();
       uBundle.putString("format", "json");
       uBundle.putString("status_os", Build$VERSION.RELEASE);
       uBundle.putString("status_machine", Build.MODEL);
       uBundle.putString("status_version", Build$VERSION.SDK);
       uBundle.putString("sdkv", "3.5.4.lite");
       uBundle.putString("sdkp", "a");
       BaseApi tc = this.c;
       if (tc != null && tc.isSessionValid()) {
          uBundle.putString("access_token", this.c.getAccessToken());
          uBundle.putString("oauth_consumer_key", this.c.getAppId());
          uBundle.putString("openid", this.c.getOpenId());
       }
       SharedPreferences sharedPrefer = o.c(f.a(), "pfStore", 0);
       if (BaseApi.isOEM) {
          uBundle.putString("pf", "desktop_m_qq-"+BaseApi.installChannel+"-"+"android"+"-"+BaseApi.registerChannel+"-"+BaseApi.businessId);
       }else {
          uBundle.putString("pf", sharedPrefer.getString("pf", "openmobile_android"));
       }
       return uBundle;
    }
    public String a(String p0){
       Bundle uBundle = this.a();
       StringBuilder str = "";
       if (!TextUtils.isEmpty(p0)) {
          uBundle.putString("need_version", p0);
       }
       return str+"https://openmobile.qq.com/oauth2.0/m_jump_by_version?"+HttpUtils.encodeUrl(uBundle);
    }
    public void a(Activity p0,int p1,Intent p2,boolean p3){
       Intent intent = new Intent(p0.getApplicationContext(), AssistActivity.class);
       if (p3) {
          intent.putExtra("is_qq_mobile_share", true);
       }
       intent.putExtra("openSDK_LOG.AssistActivity.ExtraIntent", p2);
       p0.startActivityForResult(intent, p1);
       return;
    }
    public void a(Activity p0,Intent p1,int p2){
       this.a(p0, p1, p2, null);
    }
    public void a(Activity p0,Intent p1,int p2,Map p3){
       p1.putExtra("key_request_code", p2);
       p0.startActivityForResult(this.a(p0, p1, p3), p2);
    }
    public void a(Activity p0,Bundle p1,IUiListener p2){
       SLog.i("openSDK_LOG.BaseApi", "--handleDownloadLastestQQ");
       TDialog tDialog = new TDialog(p0, "", "https://imgcache.qq.com/ptlogin/static/qzsjump.html?"+HttpUtils.encodeUrl(p1), null, this.c);
       HttpUtils.encodeUrl(p1).show();
    }
    public void a(Fragment p0,Intent p1,int p2,Map p3){
       p1.putExtra("key_request_code", p2);
       p0.startActivityForResult(this.a(p0.getActivity(), p1, p3), p2);
    }
    public void a(StringBuilder p0,Activity p1){
       String str = "?";
       p0 = (p0.indexOf(str) < 0)? p0+str: p0+"&";
       p0 = p0+"src_type"+"="+"app";
       str = this.c.getAppId();
       String openId = this.c.getOpenId();
       if (!TextUtils.isEmpty(str)) {
          this.a(p0, "app_id", str);
       }
       if (!TextUtils.isEmpty(openId)) {
          this.a(p0, "open_id", k.l(openId));
       }
       String str1 = k.a(p1);
       if (!TextUtils.isEmpty(str1)) {
          if (str1.length() > 20) {
             str1 = str1.substring(0, 20)+"...";
          }
          this.a(p0, "app_name", k.l(str1));
       }
       this.a(p0, "sdk_version", k.l("3.5.4.lite"));
       return;
    }
    public void a(StringBuilder p0,String p1,String p2){
       p0+"&"+p1+"="+k.f(p2);
    }
    public boolean a(Intent p0){
       if (p0 != null) {
          return i.a(f.a(), p0);
       }
       return false;
    }
    public Intent b(String p0){
       Intent intent = new Intent();
       if (k.c(f.a())) {
          intent.setClassName("com.tencent.minihd.qq", p0);
          if (i.a(f.a(), intent)) {
             return intent;
          }
       }
       intent.setClassName("com.tencent.mobileqq", p0);
       if (i.a(f.a(), intent)) {
          return intent;
       }else {
          intent.setClassName("com.tencent.tim", p0);
          if (i.a(f.a(), intent)) {
             return intent;
          }else {
             intent.setClassName("com.tencent.qqlite", p0);
             if (i.a(f.a(), intent)) {
                return intent;
             }else {
                return null;
             }
          }
       }
    }
    public Bundle b(){
       Bundle uBundle = new Bundle();
       uBundle.putString("appid", this.c.getAppId());
       if (this.c.isSessionValid()) {
          uBundle.putString("keystr", this.c.getAccessToken());
          uBundle.putString("keytype", "0x80");
       }
       String openId = this.c.getOpenId();
       if (openId != null) {
          uBundle.putString("hopenid", openId);
       }
       uBundle.putString("platform", "androidqz");
       SharedPreferences sharedPrefer = o.c(f.a(), "pfStore", 0);
       if (BaseApi.isOEM) {
          uBundle.putString("pf", "desktop_m_qq-"+BaseApi.installChannel+"-"+"android"+"-"+BaseApi.registerChannel+"-"+BaseApi.businessId);
       }else {
          String str = "openmobile_android";
          uBundle.putString("pf", sharedPrefer.getString("pf", str));
          uBundle.putString("pf", str);
       }
       uBundle.putString("sdkv", "3.5.4.lite");
       uBundle.putString("sdkp", "a");
       return uBundle;
    }
    public Intent c(String p0){
       Intent intent = new Intent();
       Intent intent1 = this.b(p0);
       String str = null;
       if (intent1 != null && intent1.getComponent() != null) {
          intent.setClassName(intent1.getComponent().getPackageName(), "com.tencent.open.agent.AgentActivity");
       }else {
          intent = str;
       }
       return intent;
    }
    public void releaseResource(){
    }
}
