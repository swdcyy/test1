package com.yxcorp.gateway.pay.webview.yoda.PayYodaWebView;
import lv8.m;
import com.kwai.yoda.YodaWebView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.webkit.WebView;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import android.view.KeyEvent;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gateway.pay.webview.PayWebView$a;
import com.yxcorp.gateway.pay.loading.PayLoadingView;
import android.widget.AbsoluteLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.View;

public class PayYodaWebView extends YodaWebView implements m	// class@0012a7
{
    public PayLoadingView b;
    public PayWebView$a c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;

    public void PayYodaWebView(Context p0){
       super(p0).q();
    }
    public void PayYodaWebView(Context p0,AttributeSet p1){
       super(p0, p1).q();
    }
    public void PayYodaWebView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2).q();
    }
    public boolean b(){
       return this.f;
    }
    public boolean d(){
       return this.e;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, PayYodaWebView.class, "9")) {
          return;
       }
       this.removeJavascriptInterface("kspay");
       super.destroy();
       return;
    }
    public boolean f(){
       return this.d;
    }
    public String getExtraUA(){
       Object obj = PatchProxy.apply(null, this, PayYodaWebView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(PayManager.getInstance().getUserAgent());
    }
    public void goBack(){
       if (PatchProxy.applyVoid(null, this, PayYodaWebView.class, "8")) {
          return;
       }
       this.r();
       super.goBack();
       return;
    }
    public void i(){
       this.e = false;
       this.f = false;
       this.g = false;
    }
    public void loadUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PayYodaWebView.class, "5")) {
          return;
       }
       this.r();
       super.loadUrl(p0);
       return;
    }
    public void loadUrl(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PayYodaWebView.class, "6")) {
          return;
       }
       this.r();
       super.loadUrl(p0, p1);
       return;
    }
    public boolean onCheckIsTextEditor(){
       return true;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       if (PatchProxy.isSupport(PayYodaWebView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, PayYodaWebView.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 4;
       if (p0 == i && this.g != null) {
          PayYodaWebView tc = this.c;
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
    public void p(){
       if (PatchProxy.applyVoid(null, this, PayYodaWebView.class, "3")) {
          return;
       }
       this.h = false;
       this.b.d();
       return;
    }
    public final void q(){
       if (PatchProxy.applyVoid(null, this, PayYodaWebView.class, "1")) {
          return;
       }
       if (this.b == null) {
          PayLoadingView payLoadingVi = new PayLoadingView(this.getContext());
          this.b = payLoadingVi;
          this.addView(payLoadingVi, new ViewGroup$LayoutParams(-1, -1));
       }
       this.s();
       return;
    }
    public final void r(){
       if (PatchProxy.applyVoid(null, this, PayYodaWebView.class, "10")) {
          return;
       }
       this.d = false;
       this.i();
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, PayYodaWebView.class, "2")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.h = true;
       this.b.b();
       return;
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
    public boolean tryInjectCookie(String p0){
       return false;
    }
}
