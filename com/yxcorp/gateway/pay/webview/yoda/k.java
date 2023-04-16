package com.yxcorp.gateway.pay.webview.yoda.k;
import com.kwai.yoda.bridge.g;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import lv8.l;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gateway.pay.webview.JsNativeEventCommunication;
import com.yxcorp.gateway.pay.api.PayManager;
import go7.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.webkit.WebView;
import nv8.b;
import android.app.Activity;
import lv8.m;
import android.net.Uri;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.Bitmap;
import sv8.r0;
import sv8.s0;
import android.view.View$OnClickListener;
import java.lang.Integer;
import java.lang.Throwable;
import java.lang.StringBuilder;
import lv8.g;
import com.kuaishou.webkit.WebResourceRequest;
import com.kuaishou.webkit.WebResourceResponse;
import com.kuaishou.webkit.SslErrorHandler;
import android.net.http.SslError;
import android.content.Context;
import lv8.u;
import java.lang.Exception;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.AbsoluteLayout;
import android.content.Intent;
import android.content.ComponentName;
import com.yxcorp.gateway.pay.activity.PayYodaWebViewActivity;
import com.yxcorp.gateway.pay.api.PayRetrofitGlobalConfig;
import android.content.res.Resources;
import rv8.b;

public class k extends g	// class@0012d3
{
    public BaseActivity e;
    public l f;
    public YodaBaseWebView g;
    public JsNativeEventCommunication h;
    public String i;
    public int j;

    public void k(BaseActivity p0,l p1,YodaBaseWebView p2,JsNativeEventCommunication p3){
       super(p2);
       int i = (PayManager.getInstance().getWebInitConfig() != null)? PayManager.getInstance().getWebInitConfig().g(): 0;
       this.j = i;
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, k.class, "9")) {
          return;
       }
       this.h.e();
       this.h.c();
       return;
    }
    public void onPageFinished(WebView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "2")) {
          return;
       }
       super.onPageFinished(p0, p1);
       b.p("PayYodaWebViewClient", "onPageFinished", "url", p1);
       if (this.e.isFinishing()) {
          return;
       }
       this.h.f();
       if (!p0.f()) {
          if (TextUtils.n(Uri.decode(p0.getTitle()), Uri.decode(p1)) || TextUtils.m(Uri.decode(p1), p0.getTitle())) {
             this.f.setText(R.id.pay_title_tv, "");
          }else {
             this.f.setText(R.id.pay_title_tv, p0.getTitle());
          }
       }
       return;
    }
    public void onPageStarted(WebView p0,String p1,Bitmap p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k.class, "1")) {
          return;
       }
       super.onPageStarted(p0, p1, p2);
       b.p("PayYodaWebViewClient", "onPageStarted", "url", p1);
       if (this.e.isFinishing()) {
          return;
       }
       int i = 4;
       if (!p0.b()) {
          this.f.setVisibility(R.id.pay_right_btn, i);
          this.f.setVisibility(R.id.pay_right_tv, i);
       }
       if (!p0.d()) {
          this.f.setVisibility(R.id.pay_left_tv, i);
          this.f.setVisibility(R.id.pay_left_btn, 0);
          k tf = this.f;
          int i1 = (TextUtils.n(tf.getLeftTopButtonType(), "close"))? 0x7f081a57: 0x7f081a53;
          tf.setImageRes(R.id.pay_left_btn, i1);
          tf = this.f;
          r0 or0 = (TextUtils.n(tf.getLeftTopButtonType(), "close"))? new r0(this): new s0(this);
          tf.setOnClickListener(R.id.pay_left_btn, or0);
       }
       return;
    }
    public void onReceivedError(WebView p0,int p1,String p2,String p3){
       boolean b;
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, k.class, "4")) {
          return;
       }
       super.onReceivedError(p0, p1, p2, p3);
       b.j("PayYodaWebViewClient", "onReceivedError", null, "errorCode", Integer.valueOf(p1), "description", p2, "failingUrl", p3);
       if (!TextUtils.n(p0.getUrl(), p3)) {
          return;
       }
       k te = this.e;
       if (te != null && !te.isFinishing()) {
          te = PayManager.getInstance().getWebInitConfig();
          if (!PayManager.getInstance().isEnableSwitchHost() || te == null) {
             g.d("onReceivedError, enableSwitchCdnHost: "+PayManager.getInstance().isEnableSwitchHost()+", webviewInitConfig:"+te);
             this.v(p0);
          }else {
             b = TextUtils.n(this.i, p3);
             g.d("onReceivedError, mainRequest:"+b+"£¬ errorCode:"+p1);
             if (b && (p1 != -6 && (p1 == -2 || (p1 == -8 && this.j > null)))) {
                this.w(te, p0);
             }else {
                this.v(p0);
             }
             return;
          }
       }
       return;
    }
    public void onReceivedHttpError(WebView p0,WebResourceRequest p1,WebResourceResponse p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k.class, "5")) {
          return;
       }
       super.onReceivedHttpError(p0, p1, p2);
       k te = this.e;
       if (te != null && !te.isFinishing()) {
          te = PayManager.getInstance().getWebInitConfig();
          if (!PayManager.getInstance().isEnableSwitchHost() || te == null) {
             g.d("onReceivedHttpError, enableSwitchCdnHost: "+PayManager.getInstance().isEnableSwitchHost()+", webviewInitConfig:"+te);
          }else {
             boolean b = TextUtils.n(this.i, p1.getUrl().toString());
             g.d("onReceivedHttpError, mainRequest:"+b);
             if (b && (p2.getStatusCode() >= 500 && this.j > null)) {
                this.w(te, p0);
             }
          label_0065 :
             return;
          }
       }
       return;
    }
    public void onReceivedSslError(WebView p0,SslErrorHandler p1,SslError p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k.class, "8")) {
          return;
       }
       super.onReceivedSslError(p0, p1, p2);
       String str = "onReceivedSslError, error = "+p2.getPrimaryError()+", url = "+p2.getUrl();
       try{
          g.d(str);
          b.f("PayYodaWebViewClient", "onReceivedSslError");
          u.b(this.e, p1);
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
       }
       return;
    }
    public boolean r(WebView p0,String p1){
       CharSequence uCharSequenc;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       g.d("shouldOverrideUrlLoading, url = "+p1);
       if (this.e.isFinishing() || TextUtils.x(p1)) {
          this.c();
          return false;
       }else {
          Intent intent = u.a(p0.getContext(), Uri.parse(p1), true, PayManager.getInstance().isKwaiUrl(p0.getUrl()));
          if (intent != null) {
             p1 = (intent.getComponent() != null)? intent.getComponent().getClassName(): null;
             if (!TextUtils.n(p1, PayYodaWebViewActivity.class.getName())) {
                this.e.startActivity(intent);
                return true;
             }
          }
          this.c();
          return false;
       }
    }
    public final void v(WebView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "6")) {
          return;
       }
       k te = this.e;
       PayManager.getInstance().getPayRetrofitGlobalConfig().showToast(te, te.getResources().getString(R.string.arg_RES_7f103bae), 0);
       this.e.finish();
       return;
    }
    public final void w(k p0,WebView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "7")) {
          return;
       }
       g.d("switchHostAndReload");
       if (p1 != null) {
          p0.f(this.i);
          this.i = p0.b(this.i);
          if (PayManager.getInstance().isKwaiUrl(this.i)) {
             b.e(p1, this.i);
          }
          this.j = this.j - 1;
          p1.loadUrl(this.i);
       }
       return;
    }
}
