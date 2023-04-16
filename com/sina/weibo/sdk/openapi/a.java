package com.sina.weibo.sdk.openapi.a;
import com.sina.weibo.sdk.openapi.IWBAPI;
import android.content.Context;
import java.lang.Object;
import com.sina.weibo.sdk.auth.a;
import com.sina.weibo.sdk.share.e;
import android.app.Activity;
import com.sina.weibo.sdk.auth.WbAuthListener;
import java.lang.String;
import com.sina.weibo.sdk.b.c;
import com.sina.weibo.sdk.a;
import com.sina.weibo.sdk.b.a$a;
import com.sina.weibo.sdk.b.a;
import java.lang.RuntimeException;
import android.content.Intent;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Bundle;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.AccessTokenHelper;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.share.WbShareCallback;
import java.lang.Exception;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.openapi.SdkListener;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import java.lang.System;
import com.sina.weibo.sdk.web.b.d;
import com.sina.weibo.sdk.web.b.b;
import com.sina.weibo.sdk.share.ShareTransActivity;
import java.lang.Class;

public final class a implements IWBAPI	// class@000bcc
{
    public Context mContext;
    public a r;
    public e s;

    public void a(Context p0){
       super();
       this.mContext = p0;
       this.r = new a();
       this.s = new e();
    }
    public final void authorize(Activity p0,WbAuthListener p1){
       a tr = this.r;
       c.a("WBSsoTag", "authorize\(\)");
       if (p1 == null) {
          throw new RuntimeException("listener can not be null.");
       }
       tr.d = p1;
       if (a.a(p0)) {
          int i = (a.e(p0) != null)? 1: 0;
          if (i) {
             tr.a(p0);
             return;
          }
       }
       tr.b(p0);
       return;
    }
    public final void authorizeCallback(Activity p0,int p1,int p2,Intent p3){
       a tr = this.r;
       c.a("WBSsoTag", "authorizeCallback\(\)");
       a d = tr.d;
       if (d != null) {
          if (0x80cd == p1) {
             if (p2 == -1) {
                if (p3 != null) {
                   String stringExtra = p3.getStringExtra("error");
                   String stringExtra1 = p3.getStringExtra("error_type");
                   String stringExtra2 = p3.getStringExtra("error_description");
                   if (TextUtils.isEmpty(stringExtra) && (TextUtils.isEmpty(stringExtra1) && TextUtils.isEmpty(stringExtra2))) {
                      Oauth2AccessToken oauth2Access = Oauth2AccessToken.parseAccessToken(p3.getExtras());
                      if (oauth2Access != null) {
                         AccessTokenHelper.writeAccessToken(p0, oauth2Access);
                         tr.d.onComplete(oauth2Access);
                         return;
                      }else {
                         tr.d.onError(new UiError(-4, "oauth2AccessToken is null", "oauth2AccessToken is null"));
                         return;
                      }
                   }else if(("access_denied").equals(stringExtra) || ("OAuthAccessDeniedException").equals(stringExtra)){
                      tr.d.onCancel();
                      return;
                   }else {
                      tr.d.onError(new UiError(-5, stringExtra1, stringExtra2));
                      return;
                   }
                }
             }else if(!p2){
                d.onCancel();
                return;
             }else {
                d.onError(new UiError(-6, "result code is error", "result code is error"));
                return;
             }
          }else {
             d.onError(new UiError(-7, "request code is error", "requestCode is error"));
          }
       }
       return;
    }
    public final void authorizeClient(Activity p0,WbAuthListener p1){
       a tr = this.r;
       c.a("WBSsoTag", "authorizeClient\(\)");
       if (p1 == null) {
          throw new RuntimeException("listener can not be null.");
       }
       tr.d = p1;
       tr.a(p0);
       return;
    }
    public final void authorizeWeb(Activity p0,WbAuthListener p1){
       a tr = this.r;
       c.a("WBSsoTag", "authorizeWeb\(\)");
       if (p1 == null) {
          throw new RuntimeException("listener can not be null.");
       }
       tr.d = p1;
       tr.b(p0);
       return;
    }
    public final void doResultIntent(Intent p0,WbShareCallback p1){
       if (p0 != null && p1 != null) {
          Bundle extras = p0.getExtras();
          if (extras != null) {
             int i = -1;
             try{
                int intx = extras.getInt("_weibo_resp_errcode", i);
                if (intx) {
                   if (intx != 1) {
                      if (intx == 2) {
                         p1.onError(new UiError(intx, extras.getString("_weibo_resp_errstr"), "error from weibo client!"));
                      }
                      return;
                   }else {
                      p1.onCancel();
                      return;
                   }
                }else {
                   p1.onComplete();
                   return;
                }
             }catch(java.lang.Exception e5){
                String message = e5.getMessage();
                p1.onError(new UiError(i, message, e5.getMessage()));
             }
          }
       }
    }
    public final boolean isWBAppInstalled(){
       return a.a(this.mContext);
    }
    public final boolean isWBAppSupportMultipleImage(){
       return a.b(this.mContext);
    }
    public final void registerApp(Context p0,AuthInfo p1){
       this.registerApp(p0, p1, null);
    }
    public final void registerApp(Context p0,AuthInfo p1,SdkListener p2){
       a.a(p1, p2);
    }
    public final void setLoggerEnable(boolean p0){
       c.setLoggerEnable(p0);
    }
    public final void shareMessage(Activity p0,WeiboMultiMessage p1,boolean p2){
       d uod;
       a ts = this.s;
       if (p0 != null && (a.a(p0) || !p2)) {
          long l = System.currentTimeMillis();
          if ((l - ts.D) - 5000 >= 0) {
             ts.D = l;
             if (p2) {
                e.a(p0, p1);
                return;
             }else {
                a$a uoa = a.e(p0);
                if (a.a(p0) && uoa != null) {
                   uoa = a.e(p0);
                   uod = null;
                   if (uoa != null && uoa.ah > 0x2710) {
                      uod = 1;
                   }
                   if (uod) {
                      e.a(p0, p1);
                      return;
                   }
                }
             label_0042 :
                AuthInfo uAuthInfo = a.a();
                if (uAuthInfo != null) {
                   uod = new d(uAuthInfo);
                   uod.setContext(p0);
                   uod.aE = p1;
                   uod.packageName = p0.getPackageName();
                   Oauth2AccessToken oauth2Access = AccessTokenHelper.readAccessToken(p0);
                   if (oauth2Access != null) {
                      String accessToken = oauth2Access.getAccessToken();
                      if (!TextUtils.isEmpty(oauth2Access.getAccessToken())) {
                         uod.ae = accessToken;
                      }
                   }
                   Bundle uBundle = new Bundle();
                   uod.writeToBundle(uBundle);
                   Intent intent = new Intent(p0, ShareTransActivity.class);
                   intent.putExtra("start_flag", 1001);
                   intent.putExtra("start_web_activity", "com.sina.weibo.sdk.web.WebActivity");
                   intent.putExtras(uBundle);
                   p0.startActivityForResult(intent, 0x2711);
                }
             }
          }
       }
       return;
    }
}
