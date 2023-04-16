package com.yxcorp.gateway.pay.webview.yoda.b;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import lv8.l;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gateway.pay.webview.JsNativeEventCommunication;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gateway.pay.webview.yoda.b$b;
import android.app.Activity;
import sv8.p0;
import com.yxcorp.gateway.pay.params.webview.JsPageButtonParams$Icon;
import lv8.m;
import sv8.j0;
import android.view.View$OnClickListener;
import com.yxcorp.gateway.pay.webview.yoda.b$d;
import com.yxcorp.gateway.pay.webview.yoda.b$a;
import com.yxcorp.gateway.pay.webview.yoda.b$g0;
import com.yxcorp.gateway.pay.webview.yoda.b$l;
import com.yxcorp.gateway.pay.webview.yoda.b$m;
import com.yxcorp.gateway.pay.webview.yoda.b$k;
import com.yxcorp.gateway.pay.webview.yoda.b$o;
import com.yxcorp.gateway.pay.webview.yoda.b$c;
import com.yxcorp.gateway.pay.webview.yoda.b$e;
import com.yxcorp.gateway.pay.webview.yoda.b$h;
import com.yxcorp.gateway.pay.webview.yoda.b$v;
import com.yxcorp.gateway.pay.webview.yoda.b$z;
import com.yxcorp.gateway.pay.webview.yoda.b$r;
import com.yxcorp.gateway.pay.webview.yoda.b$q;
import com.yxcorp.gateway.pay.webview.yoda.b$s;
import com.yxcorp.gateway.pay.webview.yoda.b$p;
import com.yxcorp.gateway.pay.webview.yoda.b$f0;
import com.yxcorp.gateway.pay.webview.yoda.b$e0;
import com.yxcorp.gateway.pay.webview.yoda.b$n;
import com.yxcorp.gateway.pay.webview.yoda.b$j;
import lv8.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gateway.pay.webview.yoda.b$y;
import com.yxcorp.gateway.pay.webview.yoda.b$w;
import com.yxcorp.gateway.pay.webview.yoda.b$x;
import com.yxcorp.gateway.pay.webview.yoda.b$t;
import com.yxcorp.gateway.pay.webview.yoda.b$u;
import com.yxcorp.gateway.pay.webview.yoda.b$i;
import com.yxcorp.gateway.pay.webview.yoda.b$a0;
import com.yxcorp.gateway.pay.webview.yoda.b$b0;
import com.yxcorp.gateway.pay.webview.yoda.b$c0;
import com.yxcorp.gateway.pay.webview.yoda.b$g;
import com.yxcorp.gateway.pay.webview.yoda.b$d0;
import com.yxcorp.gateway.pay.webview.yoda.b$f;

public class b	// class@0012ca
{
    public final BaseActivity a;
    public final WebView b;
    public final l c;
    public JsNativeEventCommunication d;

    public void b(BaseActivity p0,l p1,WebView p2,JsNativeEventCommunication p3){
       super();
       this.a = p0;
       this.c = p1;
       this.b = p2;
       this.d = p3;
    }
    public static WebView a(b p0){
       return p0.b;
    }
    public void authThirdPartyAccount(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "20")) {
          return;
       }
       b$b uob = new b$b(this, this.a, this.b, "authThirdPartyAccount", p0);
       v0.c(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "15")) {
          return;
       }
       this.c.setVisibility(R.id.pay_right_btn, 4);
       this.c.setVisibility(R.id.pay_right_tv, 4);
       int i = 0x7f0a2fa2;
       this.c.setVisibility(i, 0);
       this.c.setVisibility(R.id.pay_left_btn, 0);
       this.c.setImageRes(R.id.pay_left_btn, JsPageButtonParams$Icon.BACK.mIconId);
       b tb = this.b;
       if (tb instanceof m) {
          tb.i();
       }
       j0 oj0 = new j0(this);
       this.c.setOnClickListener(i, oj0);
       this.c.setOnClickListener(R.id.pay_left_btn, oj0);
       return;
    }
    public void bindPhone(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "21")) {
          return;
       }
       new b$d(this, this.a, this.b, "bindPhone").c(p0);
       return;
    }
    public void bindWithdrawType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "19")) {
          return;
       }
       b$a uoa = new b$a(this, this.a, this.b, "bindWithdrawType", p0);
       v0.c(p0);
       return;
    }
    public void emit(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "18")) {
          return;
       }
       new b$g0(this, this.a, this.b, "emit").c(p0);
       return;
    }
    public void exitWebView(){
       if (PatchProxy.applyVoid(null, this, b.class, "28")) {
          return;
       }
       new b$l(this, this.a, this.b, "exitWebView").c(null);
       return;
    }
    public void exitWebViewWithData(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "29")) {
          return;
       }
       new b$m(this, this.a, this.b, "exitWebViewWithData").c(p0);
       return;
    }
    public void getDeviceInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b$k ok = new b$k(this, this.a, this.b, "getDeviceInfo");
       if (!PatchProxy.applyVoidOneRefs(p0, ok, p0.class, "3")) {
          ok.f = true;
          ok.c(p0);
       }
       return;
    }
    public void hasImportSdk(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       new b$o(this, this.a, this.b, "hasImportSdk").c(p0);
       return;
    }
    public void hasInstalledApp(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       new b$c(this, this.a, this.b, "hasInstalledApp").c(p0);
       return;
    }
    public void injectCookie(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "22")) {
          return;
       }
       new b$e(this, this.a, this.b, "injectCookie").c(p0);
       return;
    }
    public void isBiometricValid(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "25")) {
          return;
       }
       new b$h(this, this.a, this.b, "isBiometricValid").c(p0);
       return;
    }
    public void loadUrlOnBusinessPage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
          return;
       }
       new b$v(this, this.a, this.b, "loadUrlOnBusinessPage").c(p0);
       return;
    }
    public void loadUrlOnNewPage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       new b$z(this, this.a, this.b, "loadUrlOnNewPage").c(p0);
       return;
    }
    public void logClickEvent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "33")) {
          return;
       }
       new b$r(this, this.a, this.b, "logClickEvent").c(p0);
       return;
    }
    public void logPageShow(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "32")) {
          return;
       }
       new b$q(this, this.a, this.b, "logPageShow").c(p0);
       return;
    }
    public void logRubas(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "34")) {
          return;
       }
       new b$s(this, this.a, this.b, "logRubas").c(p0);
       return;
    }
    public void logTaskEvent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "31")) {
          return;
       }
       new b$p(this, this.a, this.b, "logTaskEvent").c(p0);
       return;
    }
    public void off(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "17")) {
          return;
       }
       new b$f0(this, this.a, this.b, "off").c(p0);
       return;
    }
    public void on(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "16")) {
          return;
       }
       new b$e0(this, this.a, this.b, "on").c(p0);
       return;
    }
    public void payLogger(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "30")) {
          return;
       }
       new b$n(this, this.a, this.b, "payLogger").c(p0);
       return;
    }
    public void popBack(){
       if (PatchProxy.applyVoid(null, this, b.class, "27")) {
          return;
       }
       new b$j(this, this.a, this.b, "popBack").c(null);
       return;
    }
    public void resetTopButtons(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       g.d("bridge: resetTopButtons");
       if (TextUtils.x(p0)) {
          this.b();
       }else {
          new b$y(this, this.a, this.b, "resetTopButtons").c(p0);
       }
       return;
    }
    public void setPageTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       new b$w(this, this.a, this.b, "setPageTitle").c(p0);
       return;
    }
    public void setPhysicalBackButton(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       new b$x(this, this.a, this.b, "setPhysicalBackButton").c(p0);
       return;
    }
    public void setTopLeftBtn(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       b$t ot = new b$t(this, this.a, this.b, "setTopLeftBtn", p0);
       v0.c(p0);
       return;
    }
    public void setTopRightBtn(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       b$u ou = new b$u(this, this.a, this.b, "setTopRightBtn", p0);
       v0.c(p0);
       return;
    }
    public void showToast(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "26")) {
          return;
       }
       new b$i(this, this.a, this.b, "showToast").c(p0);
       return;
    }
    public void startContract(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "11")) {
          return;
       }
       new b$a0(this, this.a, this.b, "startContract").c(p0);
       return;
    }
    public void startGatewayPayForOrder(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       new b$b0(this, this.a, this.b, "startGatewayPayForOrder").c(p0);
       return;
    }
    public void startGatewayPayForOrderV2(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "13")) {
          return;
       }
       new b$c0(this, this.a, this.b, "startGatewayPayForOrderV2").c(p0);
       return;
    }
    public void startIdentityVerify(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "24")) {
          return;
       }
       new b$g(this, this.a, this.b, "startIdentityVerify").c(p0);
       return;
    }
    public void uploadCertVideo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "14")) {
          return;
       }
       b$d0 uod0 = new b$d0(this, this.a, this.b, "uploadCertVideo", p0);
       v0.c(p0);
       return;
    }
    public void verifyRealNameInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "23")) {
          return;
       }
       b$f uof = new b$f(this, this.a, this.b, "verifyRealNameInfo", p0);
       v0.c(p0);
       return;
    }
}
