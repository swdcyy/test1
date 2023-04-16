package com.sina.weibo.sdk.auth.a;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import com.sina.weibo.sdk.b.c;
import android.content.Context;
import com.sina.weibo.sdk.b.a$a;
import com.sina.weibo.sdk.b.a;
import android.content.Intent;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.a;
import java.lang.StringBuilder;
import java.lang.System;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.auth.WbAuthListener;
import java.lang.Exception;
import com.sina.weibo.sdk.net.h;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.AccessTokenHelper;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.sina.weibo.sdk.auth.b;
import com.sina.weibo.sdk.web.WebActivity;
import java.lang.Class;
import com.sina.weibo.sdk.web.b.a;
import android.os.Bundle;
import com.sina.weibo.sdk.web.b.b;

public final class a	// class@000bb0
{
    public WbAuthListener d;

    public void a(){
       super();
    }
    public final void a(Activity p0){
       String str = "startClientAuth\(\)";
       try{
          c.a("WBSsoTag", str);
          a$a uoa = a.e(p0);
          Intent intent = new Intent();
          if (uoa == null) {
             intent.setClassName("com.sina.weibo", "com.sina.weibo.SSOActivity");
          }else {
             intent.setClassName(uoa.packageName, uoa.ag);
          }
          AuthInfo uAuthInfo = a.a();
          intent.putExtra("appKey", uAuthInfo.getAppKey());
          intent.putExtra("redirectUri", uAuthInfo.getRedirectUrl());
          intent.putExtra("scope", uAuthInfo.getScope());
          intent.putExtra("packagename", uAuthInfo.getPackageName());
          intent.putExtra("key_hash", uAuthInfo.getHash());
          intent.putExtra("_weibo_command_type", 3);
          intent.putExtra("_weibo_transaction", System.currentTimeMillis());
          str = "";
          if (p0 == null) {
             this.d.onError(new UiError(-1, "activity is null", str));
             return;
          }else if(a.a(p0, intent)){
             p0.startActivityForResult(intent, 0x80cd);
             c.a("WBSsoTag", "start SsoActivity ");
             return;
          }else {
             this.d.onError(new UiError(-2, "your app is illegal", str));
             return;
          }
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
          c.b("WBSsoTag", e7.getMessage());
          this.d.onError(new UiError(-3, "occur exception", e7.getMessage()));
          return;
       }
    }
    public final void b(Activity p0){
       String accessToken;
       h oh = new h();
       AuthInfo uAuthInfo = a.a();
       if (uAuthInfo == null) {
          return;
       }
       oh.put("client_id", uAuthInfo.getAppKey());
       oh.put("redirect_uri", uAuthInfo.getRedirectUrl());
       oh.put("scope", uAuthInfo.getScope());
       oh.put("packagename", uAuthInfo.getPackageName());
       oh.put("key_hash", uAuthInfo.getHash());
       oh.put("response_type", "code");
       oh.put("version", "0041005000");
       oh.put("luicode", "10000360");
       oh.put("lfid", "OP_"+uAuthInfo.getAppKey());
       Oauth2AccessToken oauth2Access = AccessTokenHelper.readAccessToken(p0);
       if (oauth2Access != null) {
          accessToken = oauth2Access.getAccessToken();
          if (!TextUtils.isEmpty(oauth2Access.getAccessToken())) {
             oh.put("trans_token", accessToken);
             oh.put("trans_access_token", accessToken);
          }
       }
       String str = "https://open.weibo.cn/oauth2/authorize?"+oh.g();
       if (this.d != null) {
          accessToken = System.currentTimeMillis();
          b.b().a(accessToken, this.d);
          Intent intent = new Intent(p0, WebActivity.class);
          Bundle uBundle = new Bundle();
          new a(uAuthInfo, str, accessToken).writeToBundle(uBundle);
          intent.putExtras(uBundle);
          p0.startActivity(intent);
       }
       return;
    }
}
