package com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import com.yxcorp.gateway.pay.webview.JsNativeEventCommunication;
import java.lang.Object;
import lv8.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageButton;
import android.widget.TextView;
import com.yxcorp.gateway.pay.params.webview.JsPageButtonParams$Icon;
import com.yxcorp.gateway.pay.webview.PayWebView;
import rv8.f;
import android.view.View$OnClickListener;
import com.yxcorp.gateway.pay.webview.b$b;
import rv8.d;
import lv8.g;
import com.yxcorp.gateway.pay.webview.b$d;
import com.yxcorp.gateway.pay.webview.b$a;
import com.yxcorp.gateway.pay.webview.b$b0;
import com.yxcorp.gateway.pay.webview.b$j;
import com.yxcorp.gateway.pay.webview.b$l;
import com.yxcorp.gateway.pay.webview.b$k;
import com.yxcorp.gateway.pay.webview.b$n;
import com.yxcorp.gateway.pay.webview.b$c;
import com.yxcorp.gateway.pay.webview.b$e;
import com.yxcorp.gateway.pay.webview.b$u;
import com.yxcorp.gateway.pay.webview.b$t;
import com.yxcorp.gateway.pay.webview.b$a0;
import com.yxcorp.gateway.pay.webview.b$z;
import com.yxcorp.gateway.pay.webview.b$m;
import com.yxcorp.gateway.pay.webview.b$i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gateway.pay.webview.b$s;
import com.yxcorp.gateway.pay.webview.b$q;
import com.yxcorp.gateway.pay.webview.b$r;
import com.yxcorp.gateway.pay.webview.b$o;
import com.yxcorp.gateway.pay.webview.b$p;
import com.yxcorp.gateway.pay.webview.b$h;
import com.yxcorp.gateway.pay.webview.b$v;
import com.yxcorp.gateway.pay.webview.b$w;
import com.yxcorp.gateway.pay.webview.b$x;
import com.yxcorp.gateway.pay.webview.b$g;
import com.yxcorp.gateway.pay.webview.b$y;
import com.yxcorp.gateway.pay.webview.b$f;

public class b	// class@001299
{
    public final PayWebViewActivity a;
    public a b;
    public JsNativeEventCommunication c;

    public void b(PayWebViewActivity p0,JsNativeEventCommunication p1){
       super();
       this.b = new a();
       this.a = p0;
       this.c = p1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "15")) {
          return;
       }
       this.a.mRightBtn.setVisibility(4);
       this.a.mRightTv.setVisibility(4);
       this.a.mLeftTv.setVisibility(0);
       this.a.mLeftBtn.setVisibility(0);
       PayWebViewActivity mLeftBtn = this.a.mLeftBtn;
       if (mLeftBtn instanceof ImageButton) {
          mLeftBtn.setImageResource(JsPageButtonParams$Icon.BACK.mIconId);
       }
       this.a.mWebView.i();
       f uof = new f(this);
       this.a.mLeftTv.setOnClickListener(uof);
       this.a.mLeftBtn.setOnClickListener(uof);
       return;
    }
    public void authThirdPartyAccount(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "20")) {
          return;
       }
       new b$b(this, this.a, p0).c(p0);
       return;
    }
    public void bindPhone(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "21")) {
          return;
       }
       g.d("bindPhone start");
       g.i("BIZ_BIND_PHONE", "START");
       new b$d(this, this.a).c(p0);
       return;
    }
    public void bindWithdrawType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "19")) {
          return;
       }
       new b$a(this, this.a, p0).c(p0);
       return;
    }
    public void emit(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "18")) {
          return;
       }
       new b$b0(this, this.a, p0).c(p0);
       return;
    }
    public void exitWebView(){
       if (PatchProxy.applyVoid(null, this, b.class, "27")) {
          return;
       }
       new b$j(this, this.a).c(null);
       return;
    }
    public void exitWebViewWithData(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "28")) {
          return;
       }
       new b$l(this, this.a, p0).c(p0);
       return;
    }
    public void getDeviceInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b$k ok = new b$k(this, this.a);
       if (!PatchProxy.applyVoidOneRefs(p0, ok, d.class, "3")) {
          ok.d = true;
          ok.c(p0);
       }
       return;
    }
    public void hasImportSdk(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       new b$n(this, this.a).c(p0);
       return;
    }
    public void hasInstalledApp(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       new b$c(this, this.a).c(p0);
       return;
    }
    public void injectCookie(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "22")) {
          return;
       }
       new b$e(this, this.a).c(p0);
       return;
    }
    public void loadUrlOnBusinessPage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
          return;
       }
       new b$u(this, this.a, p0).c(p0);
       return;
    }
    public void loadUrlOnNewPage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       new b$t(this, this.a, p0).c(p0);
       return;
    }
    public void off(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "17")) {
          return;
       }
       new b$a0(this, this.a, p0).c(p0);
       return;
    }
    public void on(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "16")) {
          return;
       }
       new b$z(this, this.a, p0).c(p0);
       return;
    }
    public void payLogger(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "29")) {
          return;
       }
       new b$m(this, this.a).c(p0);
       return;
    }
    public void popBack(){
       if (PatchProxy.applyVoid(null, this, b.class, "26")) {
          return;
       }
       new b$i(this, this.a).c(null);
       return;
    }
    public void resetTopButtons(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       if (TextUtils.x(p0)) {
          this.a();
       }else {
          new b$s(this, this.a).c(p0);
       }
       return;
    }
    public void setPageTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       new b$q(this, this.a, p0).c(p0);
       return;
    }
    public void setPhysicalBackButton(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       new b$r(this, this.a, p0).c(p0);
       return;
    }
    public void setTopLeftBtn(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       new b$o(this, this.a, p0).c(p0);
       return;
    }
    public void setTopRightBtn(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       new b$p(this, this.a, p0).c(p0);
       return;
    }
    public void showToast(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "25")) {
          return;
       }
       new b$h(this, this.a).c(p0);
       return;
    }
    public void startContract(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "11")) {
          return;
       }
       new b$v(this, this.a).c(p0);
       return;
    }
    public void startGatewayPayForOrder(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       new b$w(this, this.a).c(p0);
       return;
    }
    public void startGatewayPayForOrderV2(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "13")) {
          return;
       }
       new b$x(this, this.a).c(p0);
       return;
    }
    public void startIdentityVerify(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "24")) {
          return;
       }
       new b$g(this, this.a).c(p0);
       return;
    }
    public void uploadCertVideo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "14")) {
          return;
       }
       new b$y(this, this.a, p0).c(p0);
       return;
    }
    public void verifyRealNameInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "23")) {
          return;
       }
       new b$f(this, this.a, p0).c(p0);
       return;
    }
}
