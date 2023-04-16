package com.yxcorp.gateway.pay.webview.PayWebView;
import com.kuaishou.webkit.WebView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.AbsoluteLayout;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import com.kuaishou.webkit.WebSettings;
import com.yxcorp.gateway.pay.api.PayManager;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import ekd.p0;
import com.yxcorp.gateway.pay.webview.l;
import android.view.View$OnTouchListener;
import com.yxcorp.gateway.pay.loading.PayLoadingView;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.kuaishou.webkit.WebViewClient;
import com.kuaishou.webkit.WebChromeClient;
import com.kuaishou.webkit.DownloadListener;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.util.Map;
import android.view.KeyEvent;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gateway.pay.webview.PayWebView$a;

public class PayWebView extends WebView	// class@00127a
{
    public PayLoadingView b;
    public PayWebView$a c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public static final int i;

    public void PayWebView(Context p0){
       super(p0, null);
    }
    public void PayWebView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PayWebView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       Object[] objArray = null;
       String str = 1;
       if (PatchProxy.applyVoid(objArray, this, PayWebView.class, "1")) {
       }else {
          PayWebViewActivity context = this.getContext();
          this.getSettings().setJavaScriptEnabled(str);
          this.getSettings().setBuiltInZoomControls(str);
          this.getSettings().setSupportZoom(str);
          this.getSettings().setUseWideViewPort(str);
          this.getSettings().setLoadWithOverviewMode(str);
          this.getSettings().setDomStorageEnabled(str);
          this.getSettings().setAllowFileAccessFromFileURLs(false);
          this.getSettings().setAllowUniversalAccessFromFileURLs(false);
          this.getSettings().setAllowFileAccess(false);
          if (!TextUtils.x(PayManager.getInstance().getUserAgent())) {
             this.getSettings().setUserAgentString(this.getSettings().getUserAgentString()+PayManager.getInstance().getUserAgent());
          }
          this.getSettings().setMixedContentMode(false);
          if (p0.C(context)) {
             this.getSettings().setCacheMode(-1);
          }else {
             this.getSettings().setCacheMode(str);
          }
          this.getSettings().setMediaPlaybackRequiresUserGesture(false);
       }
       if (!PatchProxy.applyVoid(objArray, this, PayWebView.class, "2")) {
          this.setFocusable(str);
          this.setFocusableInTouchMode(str);
          this.requestFocus(130);
          this.setOnTouchListener(l.b);
       }
       if (!PatchProxy.applyVoid(objArray, this, PayWebView.class, "3")) {
          if (this.b == null) {
             PayLoadingView payLoadingVi = new PayLoadingView(this.getContext());
             this.b = payLoadingVi;
             this.addView(payLoadingVi, new ViewGroup$LayoutParams(-1, -1));
          }
          this.m();
       }
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, PayWebView.class, "11")) {
          return;
       }
       this.removeJavascriptInterface("kspay");
       this.stopLoading();
       this.setWebViewClient(null);
       this.setWebChromeClient(null);
       this.setDownloadListener(null);
       if (this.getParent() != null) {
          this.getParent().removeView(this);
       }
       this.removeAllViews();
       this.destroyDrawingCache();
       this.clearHistory();
       super.destroy();
       return;
    }
    public void goBack(){
       if (PatchProxy.applyVoid(null, this, PayWebView.class, "10")) {
          return;
       }
       this.l();
       super.goBack();
       return;
    }
    public void i(){
       this.e = false;
       this.f = false;
       this.g = false;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, PayWebView.class, "8")) {
          return;
       }
       this.h = false;
       this.b.d();
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, PayWebView.class, "6")) {
          return;
       }
       this.d = false;
       this.i();
       return;
    }
    public void loadUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PayWebView.class, "4")) {
          return;
       }
       this.l();
       super.loadUrl(p0);
       return;
    }
    public void loadUrl(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PayWebView.class, "5")) {
          return;
       }
       this.l();
       super.loadUrl(p0, p1);
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, PayWebView.class, "7")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.h = true;
       this.b.b();
       return;
    }
    public boolean onCheckIsTextEditor(){
       return true;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       if (PatchProxy.isSupport(PayWebView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, PayWebView.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 4;
       if (p0 == i && this.g != null) {
          PayWebView tc = this.c;
          if (tc != null) {
             tc.onBackPressed();
             return true;
          }
       }
       if (p0 == i && this.canGoBack()) {
          this.goBack();
          return true;
       }else {
          return super.onKeyDown(p0, p1);
       }
    }
    public void setJsSetPhysicalBack(boolean p0){
       this.g = p0;
    }
    public void setJsSetTitle(boolean p0){
       this.d = p0;
    }
    public void setJsSetTopLeftButton(boolean p0){
       this.e = p0;
    }
    public void setJsSetTopRightButton(boolean p0){
       this.f = p0;
    }
    public void setOnBackPressedListener(PayWebView$a p0){
       this.c = p0;
    }
}
