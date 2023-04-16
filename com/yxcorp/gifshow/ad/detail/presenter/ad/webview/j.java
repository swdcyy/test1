package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.j;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import java.lang.Object;
import k59.t2;
import u09.b0;
import k59.h2;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.j$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import k59.j2;
import java.lang.String;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import tw.j;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import java.lang.IllegalArgumentException;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import lnc.f;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.webview.api.WebViewFragment$d;
import uxc.g;
import com.kuaishou.webkit.WebView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import p59.t;
import k59.e2;
import crd.b;
import lnc.b9;
import m59.p;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import ekd.k1;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import u09.f0;
import erd.g;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import u09.c0;
import o49.d;
import yx.j0;
import u09.g0;
import u09.h0;
import msd.a;
import lnc.y0;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import u09.e0;
import android.util.LruCache;
import com.yxcorp.gifshow.ad.webview.jsbridge.g;
import com.yxcorp.gifshow.ad.webview.jshandler.d;
import r59.b;
import r59.i;
import com.yxcorp.gifshow.ad.webview.jshandler.RegisterWebViewDidShowHandler;
import java.util.Objects;
import u09.i0;
import zl9.b;
import p59.x;
import k59.a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kuaishou.webkit.WebViewClient;
import m59.o;
import r59.d;
import r59.f;
import r59.c;
import r59.h;
import wkd.b;
import k59.d2;
import l59.b;
import com.kuaishou.webkit.DownloadListener;
import com.kuaishou.webkit.WebSettings;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.ad.webview.o;

public class j implements WebViewFragment$b	// class@00164f
{
    public final BaseFeed b;
    public PhotoAdvertisement c;
    public int d;
    public int e;
    public AdDataWrapper$AdLogParamAppender f;
    public t g;
    public final j2 h;
    public final GifshowActivity i;
    public WebView j;
    public final AdYodaFragment k;
    public o l;
    public final e2 m;
    public RegisterWebViewDidShowHandler n;
    public b o;
    public i p;
    public d q;
    public b r;

    public void j(AdYodaFragment p0,BaseFeed p1,GifshowActivity p2,Bundle p3){
       String str;
       super();
       t2 ot2 = new t2();
       this.m = ot2;
       this.i = p2;
       this.k = p0;
       ot2.a();
       p0.Ph(new b0(this));
       p0.lh(this);
       p0.ch(new j$a(this));
       this.h = new j2();
       this.b = p1;
       if (p3 != null) {
          this.e = p3.getInt("KEY_EXTRA_WEB_FORM_DETAIL_WEB", 1);
          str = "KEY_EXTRA_AD_LOG_APPENDER";
          if (p3.containsKey(str)) {
             this.f = SerializableHook.getSerializable(p3, str);
          }
       }
       if (p1 != null) {
          this.c = j.k(p1);
       }
       if (p3 != null) {
          str = "KEY_URL";
          String str1 = p3.getString(str);
          if (!TextUtils.x(str1) && (x0.f(str1) == null || x0.f(str1).getHost() == null)) {
             ExceptionHandler.handleCaughtException(new IllegalArgumentException(a.a.q(p1)));
          }
          p3.putString(str, f.a(str1, p1));
          SerializableHook.putSerializable(p3, "KEY_EXTRA", p1);
          p0.setArguments(p3);
       }
       return;
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
    public void a(){
       if (PatchProxy.applyVoid(null, this, j.class, "4")) {
          return;
       }
       j tg = this.g;
       if (tg != null) {
          tg.b();
       }
       this.m.d();
       b9.a(this.r);
       return;
    }
    public p b(){
       Object obj = PatchProxy.apply(null, this, j.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p op = new p(this.i, this.k, this.b, this.d, -1, -1, this.f, this.h);
       obj.a = true;
       return obj;
    }
    public void c(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "5")) {
          return;
       }
       b9.a(this.r);
       this.k.Rh();
       if (!PatchProxy.applyVoid(objArray, this, oj, "6")) {
          this.h.e(k1.i());
          long l = this.h.a();
          long l1 = this.h.b();
          int i = this.h.c();
          if (this.b != null) {
             f0 uof0 = new f0(this, l1, l, i);
             o.z().e(52, this.b).f(this.f).d(v8).a();
          }
       }
       return;
    }
    public void d(AdDataWrapper p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "1")) {
          return;
       }
       this.d = p0.getAdPosition();
       this.h.d(k1.i());
       if (this.b != null) {
          o.z().e(50, this.b).f(this.f).d(new c0(this)).a();
          d.b(this.b, p1);
       }
       return;
    }
    public void e(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "9")) {
          return;
       }
       if (this.j == null) {
          Object[] objArray1 = new Object[0];
          j0.c("AdWebViewPreloader", "reload webview os webview fragment is null", objArray1);
          return;
       }else {
          this.m.l(new g0(this), new h0(this));
          this.k.Th();
          if (!PatchProxy.applyVoid(objArray, this, oj, "10")) {
             b9.a(this.r);
             if (!y0.o(this.i)) {
                this.r = this.i.m().subscribe(new e0(this));
             }
          }
          return;
       }
    }
    public final void f(WebViewFragment p0,WebView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "8")) {
          return;
       }
       j tg = this.g;
       if (tg != null) {
          tg.b();
       }
       t ot = new t();
       this.g = ot;
       ot.a = this.i;
       ot.b = p1;
       ot.d = this.b;
       ot.h.put("landingPageWebViewType", String.valueOf(2));
       g og = new g(p1, this.i);
       Bundle arguments = p0.getArguments();
       if (arguments != null) {
          d.a(og, this.g, arguments.getString("KEY_URL"));
       }else {
          d.a(og, this.g, null);
       }
       this.o = new b();
       this.p = new i(this.g);
       j tm = this.m;
       Objects.requireNonNull(tm);
       this.n = new RegisterWebViewDidShowHandler(this.g, new i0(tm));
       og.f(this.o);
       og.f(this.p);
       og.f(new x(this.g));
       og.g(this.n, true);
       a.a(og, p1);
       WebViewClient webViewClien = p1.getWebViewClient();
       if (webViewClien instanceof o) {
          this.l = webViewClien;
          this.q = new d();
          if (this.m.j()) {
             this.q.k(new f());
          }else if(j.g(this.b)){
             this.q.k(new h(p1));
          }
          this.q.k(this.o);
          this.q.k(this.p);
          this.j.setDownloadListener(b.a(0xb238bc2).b(this.i, this.b, this.j, this.l));
          this.l.O(this.m);
          this.l.M(this.q);
          return;
       }else {
          Object[] objArray = new Object[0];
          j0.c("AdWebViewPreloader", "webview client is not PhotoAdvertisementWebViewClient", objArray);
          return;
       }
    }
    public void w1(WebViewFragment p0,WebView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "7")) {
          return;
       }
       this.j = p1;
       j tc = this.c;
       if (tc == null || tc.mConversionType == 3) {
          p1.getSettings().setUserAgentString(p1.getSettings().getUserAgentString()+o.o);
       }
       p1.getSettings().setUserAgentString(p1.getSettings().getUserAgentString()+" AllowKsCallApp");
       if (p0 instanceof AdYodaFragment && p0.getArguments() != null) {
          p0.Oh(p0.getArguments().getString("KEY_THEME", "0"));
       }
       this.f(p0, p1);
       return;
    }
}
