package com.tencent.open.SocialApiIml;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.auth.c;
import android.app.Activity;
import android.content.Context;
import java.lang.String;
import android.os.Bundle;
import com.tencent.tauth.IUiListener;
import android.content.Intent;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import com.tencent.connect.common.UIListenerManager;
import java.lang.Object;
import com.tencent.open.utils.f;
import com.tencent.open.utils.g;
import com.tencent.open.utils.h;
import com.tencent.open.SocialApiIml$a;
import android.content.ComponentName;
import com.tencent.open.utils.k;
import org.json.JSONObject;
import org.json.JSONException;
import com.kuaishou.webkit.CookieSyncManager;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.Exception;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.TDialog;
import android.app.Dialog;
import com.tencent.open.c;
import com.tencent.open.utils.i;
import com.tencent.open.c.b;
import com.kuaishou.webkit.WebSettings;
import com.kuaishou.webkit.WebView;

public class SocialApiIml extends BaseApi	// class@000f2d
{
    public Activity a;

    public void SocialApiIml(QQToken p0){
       super(p0);
    }
    public void SocialApiIml(c p0,QQToken p1){
       super(p0, p1);
    }
    public static Activity a(SocialApiIml p0){
       return p0.a;
    }
    public static void a(SocialApiIml p0,Context p1,String p2,Bundle p3,String p4,IUiListener p5){
       p0.a(p1, p2, p3, p4, p5);
    }
    public final void a(Activity p0,Intent p1,String p2,Bundle p3,IUiListener p4){
       SLog.i("openSDK_LOG.SocialApiIml", "-->handleIntentWithAgent action = "+p2);
       p1.putExtra("key_action", p2);
       p1.putExtra("key_params", p3);
       UIListenerManager.getInstance().setListenerWithRequestcode(0x2b61, p4);
       this.a(p0, p1, 0x2b61);
    }
    public final void a(Activity p0,Intent p1,String p2,Bundle p3,String p4,IUiListener p5,boolean p6){
       StringBuilder str = "-->handleIntent action = "+p2+", activityIntent = null ? ";
       int i = 1;
       boolean b = (p1 == null)? true: false;
       SLog.i("openSDK_LOG.SocialApiIml", str+b);
       if (p1 != null) {
          this.a(p0, p1, p2, p3, p5);
       }else {
          g og = g.a(f.a(), this.c.getAppId());
          if (!p6 && !og.b("C_LoginH5")) {
             i = 0;
          }
          if (i) {
             this.a(p0, p2, p3, p4, p5);
          }else {
             this.a(p0, p3, p5);
          }
       }
       return;
    }
    public final void a(Activity p0,String p1,Bundle p2,IUiListener p3){
       this.a = p0;
       Intent intent = this.c("com.tencent.open.agent.SocialFriendChooser");
       if (intent == null) {
          SLog.i("openSDK_LOG.SocialApiIml", "--askgift--friend chooser not found");
          intent = this.c("com.tencent.open.agent.RequestFreegiftActivity");
       }
       Intent intent1 = intent;
       p2.putAll(this.b());
       String str = "type";
       if (("action_ask").equals(p1)) {
          p2.putString(str, "request");
       }else if(("action_gift").equals(p1)){
          p2.putString(str, "freegift");
       }
       this.a(p0, intent1, p1, p2, h.a().a(f.a(), "https://imgcache.qq.com/open/mobile/request/sdk_request.html?"), p3, false);
       return;
    }
    public final void a(Activity p0,String p1,Bundle p2,String p3,IUiListener p4){
       JSONObject jSONObject;
       SLog.i("openSDK_LOG.SocialApiIml", "-->handleIntentWithH5 action = "+p1);
       Intent intent = this.b("com.tencent.open.agent.AgentActivity");
       SocialApiIml$a uoa = new SocialApiIml$a(this, p0, p4, p1, p3, p2);
       Intent intent1 = this.b("com.tencent.open.agent.EncryTokenActivity");
       if (intent1 != null && (intent != null && (intent.getComponent() != null && (intent1.getComponent() != null && (intent.getComponent().getPackageName()).equals(intent1.getComponent().getPackageName()))))) {
          intent1.putExtra("oauth_consumer_key", this.c.getAppId());
          intent1.putExtra("openid", this.c.getOpenId());
          intent1.putExtra("access_token", this.c.getAccessToken());
          intent1.putExtra("key_action", "action_check_token");
          if (this.a(intent1)) {
             SLog.i("openSDK_LOG.SocialApiIml", "-->handleIntentWithH5--found token activity");
             UIListenerManager.getInstance().setListenerWithRequestcode(0x2b62, v9);
             this.a(p0, intent1, 0x2b62);
          }
       }else {
          SLog.i("openSDK_LOG.SocialApiIml", "-->handleIntentWithH5--token activity not found");
          String str = k.g("tencent&sdk&qazxc***14969%%"+this.c.getAccessToken()+this.c.getAppId()+this.c.getOpenId()+"qzone3.4");
          try{
             jSONObject = new JSONObject();
             jSONObject.put("encry_token", str);
          }catch(org.json.JSONException e11){
             e11.printStackTrace();
          }
          v9.onComplete(jSONObject);
       }
       return;
    }
    public final void a(Context p0,String p1,Bundle p2,String p3,IUiListener p4){
       SLog.v("openSDK_LOG.SocialApiIml", "OpenUi, showDialog --start");
       CookieSyncManager.createInstance(p0);
       p2.putString("oauth_consumer_key", this.c.getAppId());
       if (this.c.isSessionValid()) {
          p2.putString("access_token", this.c.getAccessToken());
       }
       String openId = this.c.getOpenId();
       if (openId != null) {
          p2.putString("openid", openId);
       }
       try{
          p2.putString("pf", o.c(f.a(), "pfStore", 0).getString("pf", "openmobile_android"));
       }catch(java.lang.Exception e10){
          e10.printStackTrace();
          p2.putString("pf", "openmobile_android");
       }
       String str = p3+HttpUtils.encodeUrl(p2);
       SLog.d("openSDK_LOG.SocialApiIml", "OpenUi, showDialog TDialog");
       if (("action_challenge").equals(p1) || ("action_brag").equals(p1)) {
          SLog.d("openSDK_LOG.SocialApiIml", "OpenUi, showDialog PKDialog");
          c uoc = new c(this.a, p1, str, p4, this.c);
          "OpenUi, showDialog PKDialog".show();
       }else {
          TDialog tDialog = new TDialog(this.a, p1, str, p4, this.c);
          ("action_brag").equals(p1).show();
       }
       return;
    }
    public void ask(Activity p0,Bundle p1,IUiListener p2){
       this.a(p0, "action_ask", p1, p2);
    }
    public Intent b(String p0){
       Intent intent = new Intent();
       String str = "com.qzone";
       intent.setClassName(str, p0);
       Intent intent1 = new Intent();
       intent1.setClassName("com.tencent.mobileqq", p0);
       Intent intent2 = new Intent();
       intent2.setClassName("com.tencent.minihd.qq", p0);
       if (k.c(f.a()) && i.a(f.a(), intent2)) {
          return intent2;
       }
       if (i.a(f.a(), intent1) && i.c(f.a(), "4.7") >= 0) {
          return intent1;
       }
       if (!i.a(f.a(), intent) || i.a(i.a(f.a(), str), "4.2") < 0) {
          return null;
       }
       if (!i.a(f.a(), intent.getComponent().getPackageName(), "ec96e9ac1149251acbb1b0c5777cae95")) {
          intent = null;
       }
       return intent;
    }
    public void gift(Activity p0,Bundle p1,IUiListener p2){
       this.a(p0, "action_gift", p1, p2);
    }
    public void invite(Activity p0,Bundle p1,IUiListener p2){
       this.a = p0;
       Intent intent = this.c("com.tencent.open.agent.SocialFriendChooser");
       if (intent == null) {
          SLog.i("openSDK_LOG.SocialApiIml", "--invite--friend chooser not found");
          intent = this.c("com.tencent.open.agent.AppInvitationActivity");
       }
       p1.putAll(this.b());
       this.a(p0, intent, "action_invite", p1, h.a().a(f.a(), "https://imgcache.qq.com/open/mobile/invite/sdk_invite.html?"), p2, false);
       return;
    }
    public void story(Activity p0,Bundle p1,IUiListener p2){
       this.a = p0;
       p1.putAll(this.b());
       this.a(p0, this.c("com.tencent.open.agent.SendStoryActivity"), "action_story", p1, h.a().a(f.a(), "https://imgcache.qq.com/open/mobile/sendstory/sdk_sendstory_v1.3.html?"), p2, false);
    }
    public void writeEncryToken(Context p0){
       String accessToken = this.c.getAccessToken();
       String appId = this.c.getAppId();
       String openId = this.c.getOpenId();
       accessToken = (accessToken != null && (accessToken.length() > 0 && (appId != null && (appId.length() > 0 && (openId != null && openId.length() > 0)))))? k.g("tencent&sdk&qazxc***14969%%"+accessToken+appId+openId+"qzone3.4"): null;
       b uob = new b(p0);
       WebSettings settings = uob.getSettings();
       settings.setDomStorageEnabled(true);
       settings.setJavaScriptEnabled(true);
       settings.setDatabaseEnabled(true);
       i.a(settings);
       String str = h.a().a(p0, "https://imgcache.qq.com");
       uob.loadDataWithBaseURL(str, "<!DOCTYPE HTML><html lang=\"en-US\"><head><meta charset=\"UTF-8\"><title>localStorage Test</title><script type=\"text/javascript\">document.domain = \'qq.com\';localStorage[\""+this.c.getOpenId()+"_"+this.c.getAppId()+"\"]=\""+accessToken+"\";</script></head><body></body></html>", "text/html", "utf-8", str);
       return;
    }
}
