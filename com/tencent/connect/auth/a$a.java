package com.tencent.connect.auth.a$a;
import com.kuaishou.webkit.WebViewClient;
import com.tencent.connect.auth.a;
import com.tencent.connect.auth.a$1;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import android.widget.FrameLayout;
import com.tencent.open.c.c;
import android.widget.AbsoluteLayout;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Handler;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Runnable;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.tencent.connect.auth.a$d;
import android.content.Context;
import com.tencent.open.utils.k;
import com.tencent.connect.auth.a$b;
import com.tencent.tauth.UiError;
import com.tencent.connect.auth.a$a$1;
import com.kuaishou.webkit.SslErrorHandler;
import android.net.http.SslError;
import org.json.JSONObject;
import android.net.Uri;
import java.util.List;
import java.lang.Integer;
import com.tencent.open.web.security.b;
import android.content.Intent;
import java.lang.Throwable;

public class a$a extends WebViewClient	// class@000e26
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a$a(a p0,a$1 p1){
       super(p0);
    }
    public void onPageFinished(WebView p0,String p1){
       super.onPageFinished(p0, p1);
       SLog.v("openSDK_LOG.AuthDialog", "-->onPageFinished, url: "+p1);
       a.g(this.a).setVisibility(8);
       if (a.e(this.a) != null) {
          a.e(this.a).setVisibility(0);
       }
       if (!TextUtils.isEmpty(p1)) {
          a.n(this.a).removeCallbacks(a.p(this.a).remove(p1));
       }
       return;
    }
    public void onPageStarted(WebView p0,String p1,Bitmap p2){
       SLog.v("openSDK_LOG.AuthDialog", "-->onPageStarted, url: "+p1);
       super.onPageStarted(p0, p1, p2);
       a.g(this.a).setVisibility(0);
       a.a(this.a, SystemClock.elapsedRealtime());
       if (!TextUtils.isEmpty(a.i(this.a))) {
          a.n(this.a).removeCallbacks(a.p(this.a).remove(a.i(this.a)));
       }
       a.d(this.a, p1);
       a$a ta = this.a;
       a$d uod = new a$d(ta, a.i(ta));
       a.p(this.a).put(p1, uod);
       a.n(this.a).postDelayed(uod, 0x1d4c0);
       return;
    }
    public void onReceivedError(WebView p0,int p1,String p2,String p3){
       super.onReceivedError(p0, p1, p2, p3);
       SLog.i("openSDK_LOG.AuthDialog", "-->onReceivedError, errorCode: "+p1+" | description: "+p2);
       if (!k.b(a.a(this.a))) {
          a.f(this.a).onError(new UiError(9001, "当前网络不可用，请稍后重试！", p3));
          this.a.dismiss();
          return;
       }else if(!(a.i(this.a)).startsWith("https://imgcache.qq.com/ptlogin/static/qzsjump.html?")){
          long l = SystemClock.elapsedRealtime() - a.j(this.a);
          if (a.k(this.a) < 1 && l - a.l(this.a) < 0) {
             a.m(this.a);
             a.n(this.a).postDelayed(new a$a$1(this), 500);
          }else {
             a.e(this.a).loadUrl(a.o(this.a));
          }
          return;
       }else {
          a.f(this.a).onError(new UiError(p1, p2, p3));
          this.a.dismiss();
          return;
       }
    }
    public void onReceivedSslError(WebView p0,SslErrorHandler p1,SslError p2){
       SLog.e("openSDK_LOG.AuthDialog", "-->onReceivedSslError "+p2.getPrimaryError()+"请求不合法，请检查手机安全设置，如系统时间、代理等");
       p1.cancel();
    }
    public boolean shouldOverrideUrlLoading(WebView p0,String p1){
       String str2;
       List pathSegments;
       String str = "openSDK_LOG.AuthDialog";
       SLog.v(str, "-->Redirect URL: "+p1);
       if (p1.startsWith("auth://browser")) {
          JSONObject jSONObject = k.c(p1);
          a$a ta = this.a;
          a.a(ta, a.b(ta));
          if (!a.c(this.a)) {
             ta = "fail_cb";
             str = null;
             if (jSONObject.optString(ta, str) != null) {
                this.a.a(jSONObject.optString(ta), "");
             }else if(jSONObject.optInt("fall_to_wv") == 1){
                a$a ta1 = this.a;
                ta = a.d(this.a);
                String str1 = "?";
                if ((a.d(this.a)).indexOf(str1) > -1) {
                   str1 = "&";
                }
                a.b(ta1, ta+str1);
                a.b(this.a, a.d(this.a)+"browser_error=1");
                a.e(this.a).loadUrl(a.d(this.a));
             }else {
                str2 = jSONObject.optString("redir", str);
                if (str2 != null) {
                   a.e(this.a).loadUrl(str2);
                }
             }
          }
          return true;
       }else if(p1.startsWith("auth://tauth.qq.com/")){
          a.f(this.a).onComplete(k.c(p1));
          this.a.dismiss();
          return true;
       }else if(p1.startsWith("auth://cancel")){
          a.f(this.a).onCancel();
          this.a.dismiss();
          return true;
       }else if(p1.startsWith("auth://close")){
          this.a.dismiss();
          return true;
       }else {
          str2 = "download://";
          if (p1.startsWith(str2) || p1.endsWith(".apk")) {
             try{
                Uri uri = (p1.startsWith(str2))? Uri.parse(Uri.decode(p1.substring(11))): Uri.parse(Uri.decode(p1));
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.addFlags(0x10000000);
                a.a(this.a).startActivity(intent);
             }catch(java.lang.Exception e5){
                SLog.e(str, "-->start download activity exception, e: ", e5);
             }
             return true;
          }else if(p1.startsWith("auth://progress")){
             try{
                pathSegments = Uri.parse(p1).getPathSegments();
                if (pathSegments.isEmpty()) {
                   return true;
                }else {
                   int i = Integer.valueOf(pathSegments.get(0)).intValue();
                   if (!i) {
                      a.g(this.a).setVisibility(8);
                      a.e(this.a).setVisibility(0);
                   }else if(i == 1){
                      a.g(this.a).setVisibility(0);
                   }
                   return true;
                }
             }catch(java.lang.Exception e0){
             }
          }else if(p1.startsWith("auth://onLoginSubmit")){
             try{
                pathSegments = Uri.parse(p1).getPathSegments();
                if (!pathSegments.isEmpty()) {
                   a.c(this.a, pathSegments.get(0));
                }
                return true;
             }catch(java.lang.Exception e0){
             }
          }else if(a.h(this.a).a(a.e(this.a), p1)){
             return true;
          }else {
             SLog.i(str, "-->Redirect URL: return false");
             return 0;
          }
       }
    }
}
