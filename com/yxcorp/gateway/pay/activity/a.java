package com.yxcorp.gateway.pay.activity.a;
import androidx.fragment.app.Fragment;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.model.LaunchModel;
import com.kwai.yoda.model.LaunchModel$a;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import java.lang.CharSequence;
import java.util.Objects;
import android.text.TextUtils;
import com.kwai.yoda.cache.YodaXCache;
import java.lang.StringBuilder;
import java.lang.Error;
import lv8.g;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import my7.f;
import com.yxcorp.gateway.pay.webview.yoda.PayYodaWebView;
import com.kuaishou.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import com.yxcorp.gateway.pay.activity.a$a;
import lv8.l;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gateway.pay.api.PayManager;
import rv8.b;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import com.yxcorp.gateway.pay.webview.yoda.b;
import com.yxcorp.gateway.pay.webview.JsNativeEventCommunication;
import sv8.i0;
import sv8.a;
import sv8.d0;
import sv8.a$a;
import ny7.a;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import sv8.f0;
import sv8.e0;
import sv8.p;
import sv8.q;
import sv8.n;
import sv8.o;
import sv8.l;
import sv8.d;
import sv8.c;
import sv8.s;
import sv8.t;
import sv8.u;
import sv8.w;
import sv8.j;
import sv8.i;
import sv8.b0;
import sv8.x;
import sv8.b;
import sv8.m;
import sv8.g0;
import sv8.y;
import sv8.v;
import sv8.h0;
import sv8.r;
import sv8.z;
import sv8.a0;
import sv8.c0;
import sv8.k;
import sv8.h;
import sv8.f;
import sv8.e;
import sv8.g;
import rx7.s;
import android.app.Activity;

public class a extends Fragment	// class@001214
{
    public String b;
    public boolean c;
    public LaunchModel d;
    public PayYodaWebView e;
    public f f;
    public String g;
    public static final int h;

    public void a(){
       super();
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       super.onAttach(p0);
       if (this.getArguments() != null) {
          this.b = this.getArguments().getString("url");
          this.c = this.getArguments().getBoolean("immersive_mode");
          this.g = this.getArguments().getString("sessionId");
       }
       a tb = this.b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LaunchModel launchModel = PatchProxy.applyOneRefs(tb, null, a.class, "16");
       if (launchModel != patchProxyRe) {
       }else {
          LaunchModel$a uoa = new LaunchModel$a(TextUtils.k(tb)).g(false);
          String str = x0.a(Uri.parse(TextUtils.k(tb)), "hyId");
          if (!TextUtils.x(str)) {
             Objects.requireNonNull(uoa);
             if (PatchProxy.applyOneRefs(str, uoa, LaunchModel$a.class, "1") != patchProxyRe) {
             }else if(!TextUtils.isEmpty(str)){
                uoa.j = str;
             }
          }
          launchModel = uoa.a();
       }
       this.d = launchModel;
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       try{
          super.onCreate(p0);
          if (!PatchProxy.applyVoid(null, this, a.class, "4") && !TextUtils.x(this.b)) {
             a td = this.d;
             if (td != null) {
                YodaXCache.n.s(td);
             }
          }
       }catch(java.lang.Error e3){
          g.d("prepare WebResource Response failed, "+e3.getMessage());
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "5");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d1101, p1, false);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, a.class, "15")) {
          return;
       }
       g.d("PayYodaWebViewFragment onDestroy");
       a tf = this.f;
       if (tf != null) {
          tf.onDestroy();
       }
       tf = this.e;
       if (tf != null) {
          tf.destroy();
          this.e = null;
       }
       super.onDestroy();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, a.class, "13")) {
          return;
       }
       g.d("PayYodaWebViewFragment onPause");
       super.onPause();
       a tf = this.f;
       if (tf != null) {
          tf.onPause();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       g.d("PayYodaWebViewFragment onResume");
       super.onResume();
       a tf = this.f;
       if (tf != null) {
          tf.onResume();
       }
       tf = this.e;
       if (tf != null) {
          tf.resumeTimers();
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       g.d("PayYodaWebViewFragment onStart");
       super.onStart();
       a tf = this.f;
       if (tf != null) {
          tf.onStart();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, a.class, "14")) {
          return;
       }
       g.d("PayYodaWebViewFragment onStop");
       super.onStop();
       a tf = this.f;
       if (tf != null) {
          tf.onStop();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "6")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.e = p0.findViewById(0x7f0a2fbd);
       FragmentActivity activity = this.getActivity();
       g.d("PayYodaWebViewFragment onViewCreated: activity "+activity+", url "+this.b);
       if (activity instanceof BaseActivity && (this.e != null && (TextUtils.x(this.b) || !Uri.parse(this.b).isHierarchical()))) {
          if (activity != null) {
             activity.finish();
          }
          return;
       }else {
          FragmentActivity uFragmentAct = activity;
          if (!PatchProxy.applyVoidOneRefs(uFragmentAct, this, a.class, "7")) {
             g.d("PayYodaWebViewFragment: start init webView");
             a td = this.d;
             if (!PatchProxy.applyVoidOneRefs(td, this, a.class, "8") && (this.c != null && this.e != null)) {
                td.setWebViewBgColor(0);
                g.d("PayYodaWebViewFragment: initWebViewBackground, set bg transparent");
             }
          label_008b :
             a$a uoa = new a$a(uFragmentAct, uFragmentAct, this.e, this.d, this.g);
             this.f = td;
             this.e.attach(td);
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, this, a.class, "9") && PayManager.getInstance().isKwaiUrl(this.b)) {
                b.e(this.e, this.b);
                g.d("PayYodaWebViewFragment injectCookie");
             }
             if (!PatchProxy.applyVoid(objArray, this, a.class, "10") && (PayManager.getInstance().isKwaiUrl(this.b) && this.getActivity() != null)) {
                NewYodaJavascriptBridge javascriptBr = this.e.getJavascriptBridge();
                b uob = new b(this.getActivity(), this.getActivity(), this.e, new JsNativeEventCommunication(this.getActivity(), this.e));
                if (!PatchProxy.applyVoidTwoRefs(javascriptBr, uob, objArray, i0.class, "1")) {
                   javascriptBr.o("kspay", "getDeviceInfo", new a("getDeviceInfo", new d0(uob)));
                   javascriptBr.o("kspay", "hasInstalledApp", new a("hasInstalledApp", new f0(uob)));
                   javascriptBr.o("kspay", "hasImportSdk", new a("hasImportSdk", new e0(uob)));
                   javascriptBr.o("kspay", "setTopLeftBtn", new a("setTopLeftBtn", new p(uob)));
                   javascriptBr.o("kspay", "setTopRightBtn", new a("setTopRightBtn", new q(uob)));
                   javascriptBr.o("kspay", "setPageTitle", new a("setPageTitle", new n(uob)));
                   javascriptBr.o("kspay", "setPhysicalBackButton", new a("setPhysicalBackButton", new o(uob)));
                   javascriptBr.o("kspay", "resetTopButtons", new a("resetTopButtons", new l(uob)));
                   javascriptBr.o("kspay", "loadUrlOnNewPage", new a("loadUrlOnNewPage", new d(uob)));
                   javascriptBr.o("kspay", "loadUrlOnBusinessPage", new a("loadUrlOnBusinessPage", new c(uob)));
                   javascriptBr.o("kspay", "startContract", new a("startContract", new s(uob)));
                   javascriptBr.o("kspay", "startGatewayPayForOrder", new a("startGatewayPayForOrder", new t(uob)));
                   javascriptBr.o("kspay", "startGatewayPayForOrderV2", new a("startGatewayPayForOrderV2", new u(uob)));
                   javascriptBr.o("kspay", "uploadCertVideo", new a("uploadCertVideo", new w(uob)));
                   javascriptBr.o("kspay", "on", new a("on", new j(uob)));
                   javascriptBr.o("kspay", "off", new a("off", new i(uob)));
                   javascriptBr.o("kspay", "emit", new a("emit", new b0(uob)));
                   javascriptBr.o("kspay", "bindWithdrawType", new a("bindWithdrawType", new x(uob)));
                   javascriptBr.o("kspay", "authThirdPartyAccount", new a("authThirdPartyAccount", new b(uob)));
                   javascriptBr.o("kspay", "bindPhone", new a("bindPhone", new m(uob)));
                   javascriptBr.o("kspay", "injectCookie", new a("injectCookie", new g0(uob)));
                   javascriptBr.o("kspay", "verifyRealNameInfo", new a("verifyRealNameInfo", new y(uob)));
                   javascriptBr.o("kspay", "startIdentityVerify", new a("startIdentityVerify", new v(uob)));
                   javascriptBr.o("kspay", "isBiometricValid", new a("isBiometricValid", new h0(uob)));
                   javascriptBr.o("kspay", "showToast", new a("showToast", new r(uob)));
                   javascriptBr.o("kspay", "popBack", new a("popBack", new z(uob)));
                   javascriptBr.o("kspay", "exitWebView", new a("exitWebView", new a0(uob)));
                   javascriptBr.o("kspay", "exitWebViewWithData", new a("exitWebViewWithData", new c0(uob)));
                   javascriptBr.o("kspay", "payLogger", new a("payLogger", new k(uob)));
                   javascriptBr.o("kspay", "logTaskEvent", new a("logTaskEvent", new h(uob)));
                   javascriptBr.o("kspay", "logPageShow", new a("logPageShow", new f(uob)));
                   javascriptBr.o("kspay", "logClickEvent", new a("logClickEvent", new e(uob)));
                   javascriptBr.o("kspay", "logRubas", new a("logRubas", new g(uob)));
                }
                g.d("PayYodaWebViewFragment tryRegisterFunctions");
             }
          }
       label_030b :
          s.c(this.e, this.d);
          return;
       }
    }
}
