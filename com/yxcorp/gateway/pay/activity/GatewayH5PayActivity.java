package com.yxcorp.gateway.pay.activity.GatewayH5PayActivity;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import com.yxcorp.gateway.pay.response.GatewayPayPrepayResponse;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import ekd.j0;
import java.io.Serializable;
import java.lang.CharSequence;
import android.text.TextUtils;
import lv8.g;
import com.kuaishou.webkit.WebSettings;
import android.os.Bundle;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewParent;
import android.widget.AbsoluteLayout;
import android.view.ViewGroup;
import com.kuaishou.webkit.WebViewClient;
import com.yxcorp.gateway.pay.activity.GatewayH5PayActivity$a;
import java.lang.StringBuilder;
import java.util.HashMap;
import org.json.JSONObject;
import java.util.Map;

public class GatewayH5PayActivity extends BaseActivity	// class@001201
{
    public int mOrientation;
    public GatewayPayPrepayResponse mPrepayResponse;
    public String mProvider;
    public WebView mWebView;

    public void GatewayH5PayActivity(){
       super();
    }
    public static boolean access$100(GatewayH5PayActivity p0,WebView p1,String p2){
       return p0.wechatShouldOverrideUrlLoading(p1, p2);
    }
    public static boolean access$200(GatewayH5PayActivity p0,WebView p1,String p2){
       return p0.aliPayShouldOverrideUrlLoading(p1, p2);
    }
    public final boolean aliPayShouldOverrideUrlLoading(WebView p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, GatewayH5PayActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          if (p1.startsWith("alipay")) {
             this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(p1)));
          }else if(p1.startsWith(this.mPrepayResponse.mReferer)){
             this.finish();
          }else if(p1.startsWith("http")){
             p0.loadUrl(p1);
          }
          return true;
       }catch(java.lang.Exception e0){
       }
    }
    public String getPageName(){
       return "GATEWAY_H5_PAY";
    }
    public String getPageType(){
       return "H5";
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, GatewayH5PayActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public final void initH5Pay(){
       if (PatchProxy.applyVoid(null, this, GatewayH5PayActivity.class, "2")) {
          return;
       }
       Intent intent = this.getIntent();
       this.mProvider = j0.f(intent, "provider");
       this.mPrepayResponse = j0.e(intent, "prepay_response");
       if (TextUtils.isEmpty(this.mProvider) || this.mPrepayResponse == null) {
          g.d("h5 pay failure, config invalid");
          this.finish();
          return;
       }else {
          this.initWebViewSettings();
          this.startPay();
          return;
       }
    }
    public final void initWebViewSettings(){
       if (PatchProxy.applyVoid(null, this, GatewayH5PayActivity.class, "3")) {
          return;
       }
       WebSettings settings = this.mWebView.getSettings();
       settings.setJavaScriptEnabled(true);
       settings.setDomStorageEnabled(true);
       settings.setBuiltInZoomControls(true);
       settings.setUseWideViewPort(true);
       settings.setLoadWithOverviewMode(true);
       settings.setJavaScriptCanOpenWindowsAutomatically(true);
       settings.setAllowFileAccessFromFileURLs(false);
       settings.setAllowUniversalAccessFromFileURLs(false);
       settings.setAllowFileAccess(false);
       return;
    }
    public final boolean isLandScape(){
       boolean b = (this.mOrientation == 2)? true: false;
       return b;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, GatewayH5PayActivity.class, "9")) {
          return;
       }
       if (this.mWebView.canGoBack()) {
          this.mWebView.goBack();
       }else {
          this.finish();
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayH5PayActivity.class, "1")) {
          return;
       }
       this.mOrientation = this.getResources().getConfiguration().orientation;
       int i = (this.isLandScape())? 0x1030011: 0x1030010;
       this.setTheme(i);
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d1102);
       this.mWebView = this.findViewById(0x7f0a2fbd);
       if (this.isLandScape()) {
          this.mWebView.setBackgroundColor(0);
       }
       this.initH5Pay();
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, GatewayH5PayActivity.class, "10")) {
          return;
       }
       GatewayH5PayActivity tmWebView = this.mWebView;
       if (tmWebView != null) {
          ViewParent parent = tmWebView.getParent();
          if (parent != null) {
             parent.removeView(this.mWebView);
          }
          this.mWebView.stopLoading();
          this.mWebView.getSettings().setJavaScriptEnabled(false);
          this.mWebView.clearHistory();
          this.mWebView.clearView();
          this.mWebView.removeAllViews();
          this.mWebView.destroy();
          this.mWebView = null;
       }
       super.onDestroy();
       return;
    }
    public final void startAlipay(WebViewClient p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayH5PayActivity.class, "8")) {
          return;
       }
       GatewayPayPrepayResponse mProviderCon = this.mPrepayResponse.mProviderConfig;
       this.mWebView.setWebViewClient(p0);
       if (mProviderCon.startsWith("http")) {
          this.mWebView.loadUrl(mProviderCon);
       }else {
          this.mWebView.postUrl("https://openapi.alipay.com/gateway.do?charset=utf-8", mProviderCon.getBytes("UTF-8"));
       }
       return;
    }
    public final void startPay(){
       if (PatchProxy.applyVoid(null, this, GatewayH5PayActivity.class, "4")) {
          return;
       }
       GatewayH5PayActivity$a uoa = new GatewayH5PayActivity$a(this);
       if (TextUtils.equals(this.mProvider, "wechat")) {
          this.startWechatPay(uoa);
       }else {
          this.startAlipay(uoa);
       }
       g.d("h5 pay start, provider="+this.mProvider+", config="+this.mPrepayResponse.mProviderConfig);
       return;
    }
    public final void startWechatPay(WebViewClient p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayH5PayActivity.class, "6")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("Referer", this.mPrepayResponse.mReferer);
       this.mWebView.setWebViewClient(p0);
       this.mWebView.loadUrl(new JSONObject(this.mPrepayResponse.mProviderConfig).getString("mweb_url"), hashMap);
       return;
    }
    public final boolean wechatShouldOverrideUrlLoading(WebView p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, GatewayH5PayActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          if (p1.startsWith("weixin://wap/pay?")) {
             this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(p1)));
          }else if(p1.startsWith(this.mPrepayResponse.mReferer)){
             this.finish();
          }else {
             p0.loadUrl(p1);
          }
          return true;
       }catch(java.lang.Exception e0){
       }
    }
}
