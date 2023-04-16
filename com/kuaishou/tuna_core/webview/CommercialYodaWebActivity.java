package com.kuaishou.tuna_core.webview.CommercialYodaWebActivity;
import com.kuaishou.tuna_core.webview.b;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import p05.c;
import k05.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dy5.h;
import android.content.Intent;
import smc.b;
import k05.i;
import smc.c;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.kuaishou.tuna_core.webview.b$a;
import java.util.HashSet;
import android.content.res.Resources;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.tuna.webview.config.IPolicyDataModel;
import java.lang.Integer;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import java.io.Serializable;
import ekd.j0;
import android.os.Bundle;
import android.view.Window;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import k05.g;
import java.lang.Number;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import l05.a;
import com.yxcorp.gifshow.webview.yoda.g$c;
import p05.b;
import com.yxcorp.gifshow.webview.yoda.g;
import com.kuaishou.webkit.WebViewClient;
import n05.b;
import com.kuaishou.webkit.DownloadListener;

public class CommercialYodaWebActivity extends KwaiYodaWebViewActivity implements b	// class@00112b
{
    public c J;
    public b K;
    public h L;
    public a M;

    public void CommercialYodaWebActivity(){
       super();
       this.J = new c(this);
       b uob = PatchProxy.applyOneRefs(this, null, b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b();
          uob.b = this;
       }
       this.K = uob;
       return;
    }
    public h B1(){
       return this.L;
    }
    public b L0(Intent p0){
       return i.a(this, p0);
    }
    public c N0(Intent p0){
       return i.c(this, p0);
    }
    public WebViewFragment R0(){
       Object obj = PatchProxy.apply(null, this, CommercialYodaWebActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.R0();
    }
    public void f0(b$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommercialYodaWebActivity.class, "6")) {
          return;
       }
       this.J.P8().remove(p0);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, CommercialYodaWebActivity.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public IPolicyDataModel h2(Intent p0,String p1){
       return i.b(this, p0, p1);
    }
    public void i0(b$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommercialYodaWebActivity.class, "5")) {
          return;
       }
       this.J.P8().add(p0);
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(CommercialYodaWebActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, CommercialYodaWebActivity.class, "3")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       CommercialYodaWebActivity tJ = this.J;
       Objects.requireNonNull(tJ);
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p2, tJ, uoc, "4") && (p0 == 1001 && p2 != null))) {
          tJ.q.B1().b(j0.e(p2, "NATIVE_PAGE_CALLBACK_DATA_KEY"));
       }
    label_004f :
       return;
    }
    public void onCreate(Bundle p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, CommercialYodaWebActivity.class, str)) {
          return;
       }
       super.onCreate(p0);
       CommercialYodaWebActivity tJ = this.J;
       Objects.requireNonNull(tJ);
       if (!PatchProxy.applyVoid(null, tJ, c.class, str)) {
          tJ.p = j0.c(tJ.q.getIntent(), "COMMERCIAL_WEB_EVENT_TASK_ID", 0);
       }
       this.J.f(this.getWindow().getDecorView());
       Object[] objArray = new Object[]{this.K};
       this.J.i(objArray);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, CommercialYodaWebActivity.class, "2")) {
          return;
       }
       super.onDestroy();
       this.J.destroy();
       return;
    }
    public HashMap u2(){
       Object obj = PatchProxy.apply(null, this, CommercialYodaWebActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.K.c.a;
    }
    public long v0(){
       Object obj = PatchProxy.apply(null, this, CommercialYodaWebActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.J.p;
    }
    public void w1(WebViewFragment p0,WebView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommercialYodaWebActivity.class, "4")) {
          return;
       }
       p0 = this.R0();
       if (p0 instanceof KwaiYodaWebViewFragment && p1 instanceof YodaBaseWebView) {
          a uoa = new a(p1, p0.zh(), this.N0(this.getIntent()), this.h2(this.getIntent(), "COMMERCIAL_WEB_URL_INTERCEPT_MODEL"));
          this.M = uoa;
          CommercialYodaWebActivity tJ = this.J;
          Objects.requireNonNull(tJ);
          b uob = PatchProxy.applyOneRefs(p0, tJ, c.class, "5");
          if (uob != PatchProxyResult.class) {
          }else {
             uob = new b(tJ, p0);
          }
          uoa.B(uob);
          p1.setWebViewClient(this.M);
          p1.setDownloadListener(new b(this, this.L0(this.getIntent()), this.h2(this.getIntent(), "COMMERCIAL_WEB_DOWNLOAD_INTERCEPT_MODEL")));
       }
       return;
    }
    public void x(h p0){
       this.L = p0;
    }
}
