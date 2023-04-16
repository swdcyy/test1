package com.yxcorp.gateway.pay.webview.m;
import com.kuaishou.webkit.WebViewClient;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import com.yxcorp.gateway.pay.webview.JsNativeEventCommunication;
import com.yxcorp.gateway.pay.api.PayManager;
import go7.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gateway.pay.webview.PayWebView;
import com.yxcorp.gateway.pay.api.PayRetrofitGlobalConfig;
import android.content.res.Resources;
import android.content.Context;
import nv8.b;
import lv8.g;
import rv8.b;
import android.app.Activity;
import android.net.Uri;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.graphics.Bitmap;
import java.lang.StringBuilder;
import android.widget.ImageButton;
import android.text.TextUtils;
import rv8.m;
import rv8.n;
import android.view.View$OnClickListener;
import java.lang.Integer;
import java.lang.Throwable;
import com.kuaishou.webkit.WebResourceRequest;
import com.kuaishou.webkit.WebResourceResponse;
import com.kuaishou.webkit.SslErrorHandler;
import android.net.http.SslError;
import lv8.u;
import java.lang.Exception;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.AbsoluteLayout;
import android.content.Intent;
import android.content.ComponentName;

public class m extends WebViewClient	// class@0012a4
{
    public PayWebViewActivity a;
    public JsNativeEventCommunication b;
    public String c;
    public int d;

    public void m(PayWebViewActivity p0,JsNativeEventCommunication p1){
       super();
       int i = (PayManager.getInstance().getWebInitConfig() != null)? PayManager.getInstance().getWebInitConfig().g(): 0;
       this.d = i;
       this.a = p0;
       this.b = p1;
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, m.class, "4")) {
          return;
       }
       this.b.e();
       this.b.c();
       return;
    }
    public final void d(WebView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "7")) {
          return;
       }
       p0.k();
       m ta = this.a;
       PayManager.getInstance().getPayRetrofitGlobalConfig().showToast(ta, ta.getResources().getString(R.string.arg_RES_7f103bae), 0);
       this.a.finish();
       b.f("PayWebViewClient", "network error!");
       return;
    }
    public final void e(k p0,WebView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "9")) {
          return;
       }
       g.d("switchHostAndReload");
       if (p1 != null) {
          p0.f(this.c);
          this.c = p0.b(this.c);
          if (PayManager.getInstance().isKwaiUrl(this.c)) {
             b.e(p1, this.c);
          }
          this.d = this.d - 1;
          p1.loadUrl(this.c);
       }
       return;
    }
    public void onPageFinished(WebView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "1")) {
          return;
       }
       super.onPageFinished(p0, p1);
       if (this.a.isFinishing()) {
          return;
       }
       this.b.f();
       PayWebView payWebView = p0;
       if (payWebView.d == null) {
          if (TextUtils.n(Uri.decode(p0.getTitle()), Uri.decode(p1)) || TextUtils.m(Uri.decode(p1), p0.getTitle())) {
             this.a.mTitleTv.setText("");
          }else {
             this.a.mTitleTv.setText(p0.getTitle());
          }
       }
       payWebView.k();
       int i = (PayManager.getInstance().getWebInitConfig() != null)? PayManager.getInstance().getWebInitConfig().g(): 0;
       this.d = i;
       return;
    }
    public void onPageStarted(WebView p0,String p1,Bitmap p2){
       n on;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m.class, "2")) {
          return;
       }
       g.d("onPageStarted, url = "+p1);
       super.onPageStarted(p0, p1, p2);
       if (this.a.isFinishing()) {
          return;
       }
       int i = 4;
       if (p0.f == null) {
          this.a.mRightBtn.setVisibility(i);
          this.a.mRightTv.setVisibility(i);
       }
       if (p0.e == null) {
          this.a.mLeftTv.setVisibility(i);
          this.a.mLeftBtn.setVisibility(0);
          m ta = this.a;
          PayWebViewActivity mLeftBtn = ta.mLeftBtn;
          if (mLeftBtn instanceof ImageButton) {
             int i1 = (TextUtils.equals(ta.getLeftTopButtonType(), "close"))? 0x7f081a57: 0x7f081a53;
             mLeftBtn.setImageResource(i1);
          }
          ta = this.a;
          mLeftBtn = ta.mLeftBtn;
          ta = (TextUtils.equals(ta.getLeftTopButtonType(), "close"))? new m(this): new n(this);
          mLeftBtn.setOnClickListener(ta);
       }
       p0.m();
       return;
    }
    public void onReceivedError(WebView p0,int p1,String p2,String p3){
       boolean b;
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, m.class, "6")) {
          return;
       }
       super.onReceivedError(p0, p1, p2, p3);
       b.j("PayWebViewClient", "onReceivedError", null, "errorCode", Integer.valueOf(p1), "description", p2, "failingUrl", p3);
       if (!TextUtils.n(p0.getUrl(), p3)) {
          return;
       }
       m ta = this.a;
       if (ta != null && !ta.isFinishing()) {
          k webInitConfi = PayManager.getInstance().getWebInitConfig();
          if (!PayManager.getInstance().isDebug() && (!PayManager.getInstance().isEnableSwitchHost() || webInitConfi == null)) {
             g.d("onReceivedError, isDebug: "+PayManager.getInstance().isDebug()+", enableSwitchCdnHost: "+PayManager.getInstance().isEnableSwitchHost()+", webviewInitConfig:"+webInitConfi);
             this.d(p0);
          }else {
             b = TextUtils.n(this.c, p3);
             g.d("onReceivedError, mainRequest:"+b+"£¬ errorCode:"+p1);
             if (b && (p1 != -6 && (p1 == -2 || (p1 == -8 && this.d > null)))) {
                this.e(webInitConfi, p0);
             }else {
                this.d(p0);
             }
             return;
          }
       }
       return;
    }
    public void onReceivedHttpError(WebView p0,WebResourceRequest p1,WebResourceResponse p2){
       boolean b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m.class, "8")) {
          return;
       }
       super.onReceivedHttpError(p0, p1, p2);
       b.i("PayWebViewClient", "onReceivedHttpError", null, "errorCode", Integer.valueOf(p2.getStatusCode()), "failingUrl", p1.getUrl());
       m ta = this.a;
       if (ta != null && !ta.isFinishing()) {
          k webInitConfi = PayManager.getInstance().getWebInitConfig();
          if (!PayManager.getInstance().isDebug() && (!PayManager.getInstance().isEnableSwitchHost() || webInitConfi == null)) {
             g.d("onReceivedHttpError, isDebug: "+PayManager.getInstance().isDebug()+", enableSwitchCdnHost: "+PayManager.getInstance().isEnableSwitchHost()+", webviewInitConfig:"+webInitConfi);
          }else {
             b = TextUtils.n(this.c, p1.getUrl().toString());
             g.d("onReceivedHttpError, mainRequest:"+b);
             if (b && (p2.getStatusCode() >= 500 && this.d > null)) {
                this.e(webInitConfi, p0);
             }
          label_0088 :
             return;
          }
       }
       return;
    }
    public void onReceivedSslError(WebView p0,SslErrorHandler p1,SslError p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m.class, "5")) {
          return;
       }
       String str = "onReceivedSslError, error = "+p2.getPrimaryError()+", url = "+p2.getUrl();
       try{
          g.d(str);
          u.b(this.a, p1);
          b.f("PayWebViewClient", "onReceivedSslError");
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
       }
       return;
    }
    public boolean shouldOverrideUrlLoading(WebView p0,String p1){
       CharSequence uCharSequenc;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       g.d("shouldOverrideUrlLoading, url = "+p1);
       if (this.a.isFinishing() || TextUtils.x(p1)) {
          this.c();
          return false;
       }else {
          Intent intent = u.a(p0.getContext(), Uri.parse(p1), true, PayManager.getInstance().isKwaiUrl(p0.getUrl()));
          if (intent != null) {
             p1 = (intent.getComponent() != null)? intent.getComponent().getClassName(): null;
             if (!TextUtils.n(p1, PayWebViewActivity.class.getName())) {
                this.a.startActivity(intent);
                return true;
             }
          }
          this.c();
          return false;
       }
    }
}
