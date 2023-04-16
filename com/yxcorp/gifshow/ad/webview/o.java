package com.yxcorp.gifshow.ad.webview.o;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import sl9.c;
import java.lang.StringBuilder;
import java.lang.String;
import o56.a;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.api.web.AdYodaConfig;
import java.util.ArrayList;
import com.yxcorp.gifshow.webview.api.WebViewFragment$d;
import uxc.g;
import com.kuaishou.webkit.WebView;
import android.app.Activity;
import sl9.b;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment2;
import k59.t1;
import com.yxcorp.gifshow.ad.webview.o$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.ad.webview.o$b;
import com.yxcorp.gifshow.ad.webview.o$c;
import erd.g;
import crd.b;
import p59.t;
import m59.o;
import ekd.k1;
import java.util.Objects;
import java.lang.Long;
import k59.j2;
import com.yxcorp.gifshow.ad.webview.jshandler.RegisterWebViewDidShowHandler;
import com.yxcorp.gifshow.entity.QPhoto;
import com.google.common.base.Optional;
import com.kuaishou.android.model.feed.VideoFeed;
import tw.g;
import com.kwai.framework.model.feed.BaseFeed;
import android.util.LruCache;
import com.yxcorp.gifshow.ad.webview.jsbridge.g;
import r59.b;
import r59.i;
import com.yxcorp.gifshow.ad.webview.jshandler.d;
import zl9.b;
import p59.x;
import k59.u1;
import msd.a;
import k59.a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import y55.a;
import com.kuaishou.webkit.WebViewClient;
import r59.d;
import tw.j;
import r59.h;
import r59.c;
import r59.f;
import wkd.b;
import k59.d2;
import l59.b;
import com.kuaishou.webkit.DownloadListener;
import yx.j0;

public class o implements WebViewFragment$b, c	// class@001912
{
    public AdYodaConfig b;
    public t c;
    public d d;
    public List e;
    public KwaiYodaWebViewFragment f;
    public Activity g;
    public b h;
    public WebView i;
    public b j;
    public i k;
    public RegisterWebViewDidShowHandler l;
    public WebViewClient m;
    public e2 n;
    public static final String o;

    static {
       o.o = " AliBaichuan\(2014_0_23537706@baichuan_h5_0.1.1/"+a.m+"\)";
    }
    public void o(){
       super();
       this.b = new AdYodaConfig();
       this.e = new ArrayList();
    }
    public WebViewFragment$d C1(){
       return g.a(this);
    }
    public boolean J(WebView p0,String p1){
       return g.d(this, p0, p1);
    }
    public String T1(){
       return g.c(this);
    }
    public KwaiYodaWebViewFragment a(Activity p0,AdYodaConfig p1,b p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b = p1;
       this.g = p0;
       this.h = p2;
       o tf = this.f;
       if (tf != null) {
          return tf;
       }
       AdYodaFragment2 uAdYodaFragm = new AdYodaFragment2();
       this.f = uAdYodaFragm;
       uAdYodaFragm.lh(this);
       tf = this.f;
       if (tf instanceof AdYodaFragment2) {
          o oo = tf;
          oo.F = new t1(this);
          oo.G = this.e;
       }
       tf.ch(new o$a(this));
       if (this.b.mAutoRegisterFragmentLifecycle != null) {
          this.f.m().subscribe(new o$b(this), new o$c(this));
       }
       return this.f;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, o.class, "4")) {
          return;
       }
       o tc = this.c;
       if (tc != null) {
          tc.b();
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       o tc = this.c;
       if (tc != null) {
          tc.c();
       }
       return;
    }
    public o d(){
       o tm = this.m;
       if (tm instanceof o) {
          return tm;
       }
       return null;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, o.class, "9")) {
          return;
       }
       this.b.mAdClickTime = k1.i();
       o tf = this.f;
       if (tf instanceof AdYodaFragment2) {
          AdYodaConfig mAdClickTime = this.b.mAdClickTime;
          Objects.requireNonNull(tf);
          if (!PatchProxy.isSupport(AdYodaFragment2.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(mAdClickTime), tf, AdYodaFragment2.class, "3")) {
             AdYodaFragment2 j = tf.J;
             if (j != null) {
                j.mAdClickTime = mAdClickTime;
             }
             tf.I.d(mAdClickTime);
          }
          this.f.Qh();
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, o.class, "11")) {
          return;
       }
       o tf = this.f;
       if (tf instanceof AdYodaFragment2) {
          tf.Oh();
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, o.class, "10")) {
          return;
       }
       o tf = this.f;
       if (tf instanceof AdYodaFragment2) {
          tf.Ph();
       }
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, o.class, "7")) {
          return;
       }
       this.j();
       o tl = this.l;
       if (tl != null) {
          tl.a();
       }
       return;
    }
    public void i(WebViewFragment p0,WebView p1){
       o th;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "6")) {
          return;
       }
       o tc = this.c;
       if (tc != null) {
          tc.b();
       }
       QPhoto qPhoto = new QPhoto(Optional.fromNullable(this.b.mFeed).or(g.a()));
       t ot = new t();
       this.c = ot;
       ot.a = this.g;
       ot.b = p1;
       ot.d = this.b.mFeed;
       ot.h.put("landingPageWebViewType", String.valueOf(2));
       this.c.f = this.h;
       g og = new g(p1, this.g);
       this.j = new b();
       this.k = new i(this.c);
       d.a(og, this.c, this.b.mUrl);
       og.f(this.j);
       og.f(this.k);
       og.f(new x(this.c));
       if (this.b.mIsPreload != null) {
          th = this.h;
          if (th != null && th.c()) {
             o th1 = this.h;
             Objects.requireNonNull(th1);
             RegisterWebViewDidShowHandler registerWebV = new RegisterWebViewDidShowHandler(this.c, new u1(th1));
             this.l = registerWebV;
             og.g(registerWebV, true);
          }
       }
       a.a(og, p1);
       th = this.h;
       if (th != null) {
          th.b(p1, og);
       }
       WebViewClient webViewClien = p1.getWebViewClient();
       this.m = webViewClien;
       if (webViewClien instanceof o) {
          this.d = new d();
          if (j.g(this.b.mFeed)) {
             this.d.k(new h(p1));
          }
          if (this.b.mIsPreload != null) {
             th = this.h;
             if (th != null && th.c()) {
                this.d.k(new f());
             }else {
             label_00fb :
                this.d.k(this.j);
                this.d.k(this.k);
                if (this.b.mDisableLandingPageDeepLink != null) {
                   this.d.k(new f());
                }
             }
          }else {
             goto label_00fb ;
          }
          webViewClien.M(this.d);
          webViewClien.t = this.e;
          webViewClien.N(this.b.mWebViewType);
          p1.setDownloadListener(b.a(0xb238bc2).b(this.g, qPhoto.mEntity, p1, webViewClien));
       }else {
          Object[] objArray = new Object[0];
          j0.c("AdYodaController", "webclient is not PhotoAdvertisementWebViewClient", objArray);
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, o.class, "8")) {
          return;
       }
       if (this.i == null) {
          Object[] objArray = new Object[0];
          j0.c("AdYodaController", "resetADeepLink webview is null", objArray);
       }
       this.d = new d();
       if (j.g(this.b.mFeed)) {
          this.d.k(new h(this.i));
       }
       o tj = this.j;
       if (tj != null) {
          this.d.k(tj.i());
       }
       tj = this.k;
       if (tj != null) {
          this.d.k(tj.i());
       }
       if (this.b.mDisableLandingPageDeepLink != null) {
          this.d.k(new f());
       }
       tj = this.d();
       if (tj != null) {
          tj.M(this.d);
       }
       return;
    }
    public void w1(WebViewFragment p0,WebView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "5")) {
          return;
       }
       this.i = p1;
       this.i(p0, p1);
       o th = this.h;
       if (th != null) {
          th.a(p1, p0);
       }
       return;
    }
}
