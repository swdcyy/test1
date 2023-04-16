package com.sina.weibo.sdk.web.a.a;
import com.sina.weibo.sdk.web.a.b;
import android.app.Activity;
import com.sina.weibo.sdk.web.a;
import com.sina.weibo.sdk.web.b.b;
import java.lang.String;
import com.sina.weibo.sdk.web.WebData;
import com.sina.weibo.sdk.auth.AuthInfo;
import android.os.Bundle;
import com.sina.weibo.sdk.b.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.webkit.WebView;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.auth.b;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import android.content.Context;
import com.sina.weibo.sdk.auth.AccessTokenHelper;
import com.sina.weibo.sdk.common.UiError;
import android.graphics.Bitmap;
import com.kuaishou.webkit.WebResourceRequest;
import android.net.Uri;

public final class a extends b	// class@000bdf
{

    public void a(Activity p0,a p1,b p2){
       super(p0, p1, p2);
    }
    public final boolean l(String p0){
       AuthInfo uAuthInfo = this.aA.u().a();
       if (uAuthInfo != null && p0.startsWith(uAuthInfo.getRedirectUrl())) {
          Bundle uBundle = e.g(p0);
          if (uBundle != null && !TextUtils.isEmpty(uBundle.getString("access_token"))) {
             return true;
          }
       }
       return false;
    }
    public final void onPageFinished(WebView p0,String p1){
       super.onPageFinished(p0, p1);
       AuthInfo uAuthInfo = this.aA.u().a();
       if (uAuthInfo != null && p1.startsWith(uAuthInfo.getRedirectUrl())) {
          String str = this.aA.u().r();
          if (!TextUtils.isEmpty(str)) {
             WbAuthListener wbAuthListen = this.ax.a(str);
             this.aB = wbAuthListen;
             if (wbAuthListen != null) {
                Bundle uBundle = e.g(p1);
                b uob = -1;
                if (uBundle != null) {
                   String str1 = uBundle.getString("error_code");
                   String str2 = uBundle.getString("error_description");
                   if (TextUtils.isEmpty(uBundle.getString("error")) && TextUtils.isEmpty(str1)) {
                      Oauth2AccessToken oauth2Access = Oauth2AccessToken.parseAccessToken(uBundle);
                      AccessTokenHelper.writeAccessToken(this.ay, oauth2Access);
                      this.aB.onComplete(oauth2Access);
                   }else {
                      this.aB.onError(new UiError(uob, str1, str2));
                   }
                }else {
                   this.aB.onError(new UiError(uob, "bundle is null", "parse url error"));
                }
                this.ax.b(str);
             }
          }
          b taz = this.az;
          if (taz != null) {
             taz.q();
          }
       }
    label_008c :
       return;
    }
    public final void onPageStarted(WebView p0,String p1,Bitmap p2){
       super.onPageStarted(p0, p1, p2);
    }
    public final void q(){
       super.q();
       String str = this.aA.u().r();
       if (!TextUtils.isEmpty(str)) {
          WbAuthListener wbAuthListen = this.ax.a(str);
          this.aB = wbAuthListen;
          if (wbAuthListen != null) {
             wbAuthListen.onCancel();
          }
          this.ax.b(str);
       }
       b taz = this.az;
       if (taz != null) {
          taz.q();
       }
       return;
    }
    public final boolean s(){
       this.q();
       return true;
    }
    public final boolean shouldOverrideUrlLoading(WebView p0,WebResourceRequest p1){
       return this.l(p1.getUrl().toString());
    }
    public final boolean shouldOverrideUrlLoading(WebView p0,String p1){
       return this.l(p1);
    }
}
