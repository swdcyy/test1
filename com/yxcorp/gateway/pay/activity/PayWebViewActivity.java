package com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity$a;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.activity.PayYodaWebViewActivity;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import lv8.d;
import com.google.gson.Gson;
import android.app.Activity;
import android.content.Intent;
import ekd.j0;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.Number;
import android.content.res.Resources$Theme;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.StringBuilder;
import lv8.g;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Exception;
import com.yxcorp.gateway.pay.params.result.BaseResult;
import android.view.View;
import com.yxcorp.gateway.pay.webview.PayWebView;
import android.widget.ImageButton;
import android.widget.TextView;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gateway.pay.webview.JsNativeEventCommunication;
import com.yxcorp.gateway.pay.webview.k;
import com.kuaishou.webkit.WebChromeClient;
import com.yxcorp.gateway.pay.webview.m;
import com.kuaishou.webkit.WebViewClient;
import rv8.b;
import com.yxcorp.gateway.pay.webview.b;
import java.lang.Boolean;
import java.lang.Runtime;
import androidx.activity.ComponentActivity;
import android.os.Bundle;
import com.yxcorp.gateway.pay.webview.n;
import rv8.o;
import lv8.k;
import androidx.fragment.app.FragmentActivity;

public class PayWebViewActivity extends BaseActivity	// class@001208
{
    public View mDivider;
    public JsNativeEventCommunication mJsNativeEventCommunication;
    public ImageButton mLeftBtn;
    public TextView mLeftTv;
    public ImageButton mRightBtn;
    public TextView mRightTv;
    public String mThemeType;
    public View mTitleBar;
    public TextView mTitleTv;
    public boolean mTranslucent;
    public PayWebView mWebView;

    public void PayWebViewActivity(){
       super();
    }
    public static PayWebViewActivity$a buildWebViewIntent(Context p0,Class p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, PayWebViewActivity.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PayWebViewActivity$a(p0, p1, p2);
    }
    public static PayWebViewActivity$a buildWebViewIntent(Context p0,String p1){
       PayWebViewActivity payWebViewAc = PayWebViewActivity.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, payWebViewAc, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (PayManager.getInstance().isEnableExperimentalYoda()) {
          payWebViewAc = PayYodaWebViewActivity.class;
       }
       return PayWebViewActivity.buildWebViewIntent(p0, payWebViewAc, p1);
    }
    public final String buildCancelResult(){
       Object obj = PatchProxy.apply(null, this, PayWebViewActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a.q(new JsErrorResult(0, ""));
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, PayWebViewActivity.class, "14")) {
          return;
       }
       super.finish();
       if (this.mTranslucent != null) {
          this.overridePendingTransition(0, 0);
       }else {
          this.overridePendingTransition(0, R.anim.arg_RES_7f0100dc);
       }
       return;
    }
    public String getLeftTopButtonType(){
       Object obj = PatchProxy.apply(null, this, PayWebViewActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j0.f(this.getIntent(), "left_top_btn_type");
    }
    public String getPageName(){
       return "GATEWAY_WEBVIEW";
    }
    public String getPageType(){
       return "H5";
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PayWebViewActivity.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public int getStatusColor(){
       TypedArray obj = PatchProxy.apply(null, this, PayWebViewActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getTheme().obtainStyledAttributes(c$b.R3);
       obj.recycle();
       return obj.getColor(0, -1);
    }
    public String getWebUrl(){
       Object obj = PatchProxy.apply(null, this, PayWebViewActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j0.f(this.getIntent(), "web_url");
    }
    public void handleFinished(String p0){
       JsErrorResult jsErrorResul;
       if (PatchProxy.applyVoidOneRefs(p0, this, PayWebViewActivity.class, "11")) {
          return;
       }
       g.d("PayWebViewActivity handleFinished, data:"+p0);
       if (TextUtils.isEmpty(p0)) {
          PayManager.getInstance().onWithdrawCancel(this.buildCancelResult());
          this.finish();
          return;
       }else {
          try{
             jsErrorResul = d.a.h(p0, JsErrorResult.class);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
             jsErrorResul = null;
          }
          if (jsErrorResul != null) {
             BaseResult mResult = jsErrorResul.mResult;
             if (mResult == null) {
             label_0062 :
                PayManager.getInstance().onWithdrawCancel(p0);
             }else if(1 == mResult){
                PayManager.getInstance().onWithdrawSuccess(p0);
             }else {
                PayManager.getInstance().onWithdrawFailure(jsErrorResul.mResult, jsErrorResul.mErrorMsg);
             }
          }else {
             goto label_0062 ;
          }
          this.finish();
          return;
       }
    }
    public final void initView(){
       if (PatchProxy.applyVoid(null, this, PayWebViewActivity.class, "6")) {
          return;
       }
       this.mWebView = this.findViewById(0x7f0a2fbd);
       this.mLeftBtn = this.findViewById(0x7f0a2fa1);
       this.mLeftTv = this.findViewById(0x7f0a2fa2);
       this.mRightBtn = this.findViewById(0x7f0a2fb2);
       this.mRightTv = this.findViewById(0x7f0a2fb3);
       this.mTitleTv = this.findViewById(0x7f0a2fbc);
       this.mTitleBar = this.findViewById(0x7f0a2fba);
       this.mDivider = this.findViewById(0x7f0a2fb9);
       return;
    }
    public final void initWebView(){
       if (PatchProxy.applyVoid(null, this, PayWebViewActivity.class, "7")) {
          return;
       }
       if (this.mWebView == null) {
          return;
       }
       if (this.isImmersiveMode()) {
          this.mTitleBar.setVisibility(8);
          this.mDivider.setVisibility(8);
          this.mWebView.setBackgroundColor(0);
       }
       this.mJsNativeEventCommunication = new JsNativeEventCommunication(this, this.mWebView);
       this.mWebView.setWebChromeClient(new k(this));
       m om = new m(this, this.mJsNativeEventCommunication);
       om.c = this.getWebUrl();
       this.mWebView.setWebViewClient(om);
       if (PayManager.getInstance().isKwaiUrl(this.getWebUrl())) {
          b.e(this.mWebView, this.getWebUrl());
          this.mWebView.addJavascriptInterface(new b(this, this.mJsNativeEventCommunication), "kspay");
          g.d("PayWebViewActivity injectCookie & injectJsBridge");
       }
       this.mWebView.loadUrl(this.getWebUrl());
       return;
    }
    public boolean isCustomImmersiveMode(){
       Object obj = PatchProxy.apply(null, this, PayWebViewActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.isImmersiveMode();
    }
    public final boolean isImmersiveMode(){
       Object obj = PatchProxy.apply(null, this, PayWebViewActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mTranslucent != null || ("4").equals(this.mThemeType))? true: false;
       return b;
    }
    public final void logMemory(){
       if (PatchProxy.applyVoid(null, this, PayWebViewActivity.class, "15")) {
          return;
       }
       Runtime runtime = Runtime.getRuntime();
       g.d("PayWebViewActivity logMemory, maxMemory:"+runtime.maxMemory()+", totalMemory:"+runtime.totalMemory()+", freeMemory:"+runtime.freeMemory());
       return;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, PayWebViewActivity.class, "13")) {
          return;
       }
       super.onBackPressed();
       g.d("PayWebViewActivity onBackPressed");
       this.handleFinished(null);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PayWebViewActivity.class, "1")) {
          return;
       }
       try{
          n.a(this);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       if (this.getIntent() != null) {
          this.mTranslucent = j0.a(this.getIntent(), "translucent", false);
       }
       this.mThemeType = o.a(this.getWebUrl());
       g.d("PayWebViewActivity onCreate, mTranslucent="+this.mTranslucent+", mThemeType="+this.mThemeType);
       if (this.mTranslucent != null) {
          this.setTheme(R.style.arg_RES_7f11024f);
          this.overridePendingTransition(false, false);
          k.b(this, false, true, true);
       }else if(("4").equals(this.mThemeType)){
          this.setTheme(R.style.arg_RES_7f110250);
          this.overridePendingTransition(R.anim.arg_RES_7f0100da, false);
          k.b(this, false, false, true);
       }else {
          this.setTheme(R.style.arg_RES_7f11024e);
          this.overridePendingTransition(R.anim.arg_RES_7f0100da, false);
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d1105);
       this.initView();
       this.initWebView();
       this.logMemory();
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PayWebViewActivity.class, "10")) {
          return;
       }
       PayWebViewActivity tmWebView = this.mWebView;
       if (tmWebView != null) {
          tmWebView.destroy();
          this.mWebView = null;
       }
       super.onDestroy();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, PayWebViewActivity.class, "3")) {
          return;
       }
       super.onResume();
       PayWebViewActivity tmWebView = this.mWebView;
       if (tmWebView != null) {
          tmWebView.resumeTimers();
       }
       return;
    }
}
