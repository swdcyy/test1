package com.yxcorp.gifshow.ad.webview.f;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.StringBuilder;
import java.lang.String;
import o56.a;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.ad.widget.BaseCollapsedContainer;
import android.view.View;
import androidx.fragment.app.c;
import io.reactivex.subjects.PublishSubject;
import k59.t2;
import com.yxcorp.gifshow.ad.webview.d;
import erd.r;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.webview.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.webview.api.WebViewFragment$d;
import uxc.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k59.e2;
import com.kwai.framework.model.feed.BaseFeed;
import lnc.f;
import k59.d0;
import msd.a;
import k59.j2;
import java.lang.System;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment;
import m59.p;
import android.app.Activity;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import k59.z;
import uxc.a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.ad.webview.e;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import k59.a0;
import uxc.b;
import com.yxcorp.gifshow.ad.webview.l;
import k59.v;
import com.yxcorp.gifshow.webview.view.c;
import android.widget.RelativeLayout;
import k59.g0;
import com.yxcorp.gifshow.ad.widget.BaseCollapsedContainer$a;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import k59.c0;
import p59.t;
import k59.w;
import com.kuaishou.webkit.WebView;
import mxb.j0;
import mxb.i0;
import mxb.j;
import k59.b0;
import com.kwai.yoda.bridge.YodaBaseWebView;
import android.util.LruCache;
import com.yxcorp.gifshow.ad.webview.jsbridge.g;
import com.yxcorp.gifshow.ad.webview.jshandler.d;
import com.yxcorp.gifshow.ad.webview.jshandler.RegisterWebViewDidShowHandler;
import java.util.Objects;
import u09.i0;
import zl9.b;
import r59.b;
import r59.i;
import p59.x;
import k59.a;
import com.kuaishou.webkit.WebViewClient;
import m59.o;
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
import com.yxcorp.gifshow.ad.webview.c;
import com.yxcorp.gifshow.ad.webview.b;
import o49.d;
import com.kuaishou.webkit.WebSettings;

public class f extends PresenterV2 implements WebViewFragment$b	// class@0018bb
{
    public j2 A;
    public o B;
    public g C;
    public d D;
    public b E;
    public RegisterWebViewDidShowHandler F;
    public i G;
    public String H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public boolean L;
    public final AdDataWrapper p;
    public final e2 q;
    public final int r;
    public final BaseCollapsedContainer s;
    public WebView t;
    public final View u;
    public WebViewFragment v;
    public l w;
    public final c x;
    public AdYodaFragment y;
    public t z;
    public static final String M;

    static {
       f.M = " AliBaichuan\(2014_0_23537706@baichuan_h5_0.1.1/"+a.m+"\)";
    }
    public void f(String p0,AdDataWrapper p1,BaseCollapsedContainer p2,View p3,int p4,c p5,boolean p6,PublishSubject p7){
       super();
       this.q = new t2();
       this.L = true;
       this.H = p0;
       this.p = p1;
       this.r = p4;
       this.s = p2;
       this.u = p3;
       this.J = p6;
       this.x = p5;
       if (p6 && p7 != null) {
          this.X7(p7.filter(d.b).observeOn(d.a).subscribe(new a(this)));
       }
       return;
    }
    public WebViewFragment$d C1(){
       return g.a(this);
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "1")) {
          return;
       }
       if (TextUtils.x(this.H)) {
          return;
       }
       if (this.J != null) {
          this.q.a();
       }
       this.H = f.a(this.H, this.p.getPhoto());
       this.q.m(new d0(this));
       if (!PatchProxy.applyVoid(objArray, this, uof, "5")) {
          if (!PatchProxy.applyVoid(objArray, this, uof, "4")) {
             j2 oj2 = new j2();
             this.A = oj2;
             oj2.d(System.currentTimeMillis());
             this.A.f(System.currentTimeMillis());
          }
          AdYodaFragment uAdYodaFragm = new AdYodaFragment();
          this.y = uAdYodaFragm;
          p op = new p(this.getActivity(), this.y, this.p.getPhoto(), 0, 2, 3, null, this.A);
          uAdYodaFragm.Qh(v13);
          this.y.gh(new z(this));
          this.y.lh(this);
          f ty = this.y;
          Bundle uBundle = PatchProxy.apply(objArray, this, uof, "7");
          if (uBundle != PatchProxyResult.class) {
          }else {
             uBundle = new Bundle();
             uBundle.putString("KEY_URL", this.H);
             uBundle.putBoolean("KEY_USE_PREFETCH", true);
             String str = (this.u == null)? "none": "back";
             uBundle.putString("KEY_LEFT_TOP_BTN_TYPE", str);
             SerializableHook.putSerializable(uBundle, "KEY_EXTRA", this.p.getPhoto());
          }
          ty.setArguments(uBundle);
          this.y.ch(new e(this));
          this.y.kh(new a0(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "8")) {
          uof = this.u;
          if (uof != null) {
             l ol = new l(uof, "back");
             this.w = ol;
             this.y.F = new v(this);
             ol.l.setVisibility(8);
             this.s.a(new g0(this));
          }
       }
       e uoe = this.x.beginTransaction();
       uoe.v(this.r, this.y);
       uoe.m();
       GifshowActivity activity = this.getActivity();
       if (activity != null && !activity.isFinishing()) {
          this.X7(activity.m().subscribe(new c0(this)));
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       f tz = this.z;
       if (tz != null) {
          tz.b();
       }
       tz = this.A;
       if (tz != null) {
          tz.e(System.currentTimeMillis());
       }
       this.q.m(new w(this));
       this.q.d();
       return;
    }
    public boolean J(WebView p0,String p1){
       return g.d(this, p0, p1);
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       f tA = this.A;
       if (tA == null) {
          return;
       }
       b0 uob0 = new b0(this.A.b(), tA.a(), this.A.c());
       i0.a().p(52, this.p.getAdLogWrapper()).d(v7).a();
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       if (this.y.Ch() != null && this.y.Ch().canGoBack()) {
          this.y.Ch().goBack();
       }else if(this.s != null){
          if (this.y.Ch() != null) {
             this.y.Ch().scrollTo(0, 0);
          }
          this.s.d();
       }
       return;
    }
    public final void S8(WebView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "10")) {
          return;
       }
       t ot = new t();
       this.z = ot;
       ot.a = this.getActivity();
       f tz = this.z;
       tz.b = p0;
       tz.d = this.p.getPhoto();
       int i = 1;
       this.z.h.put("landingPageWebViewType", String.valueOf(i));
       g og = new g(p0, this.getActivity());
       this.C = og;
       d.a(og, this.z, this.H);
       if (this.q.j()) {
          f tq = this.q;
          Objects.requireNonNull(tq);
          RegisterWebViewDidShowHandler registerWebV = new RegisterWebViewDidShowHandler(this.z, new i0(tq));
          this.F = registerWebV;
          this.C.g(registerWebV, i);
       }
       this.E = new b();
       this.G = new i(this.z);
       this.C.f(this.E);
       this.C.f(this.G);
       this.C.f(new x(this.z));
       a.a(this.C, p0);
       WebViewClient webViewClien = p0.getWebViewClient();
       if (webViewClien instanceof o) {
          this.B = webViewClien;
          this.D = new d();
          if (j.g(this.p.getPhoto())) {
             this.D.k(new h(p0));
          }
          if (this.q.j()) {
             this.D.k(new f());
             this.B.O(this.q);
             this.q.o(i);
          }else {
             this.D.k(this.E);
             this.D.k(this.G);
             p0.setDownloadListener(b.a(0xb238bc2).b(this.getActivity(), this.p.getPhoto(), p0, this.B));
          }
          this.B.M(this.D);
          this.B.N(i);
          return;
       }else {
          Object[] objArray = new Object[0];
          j0.c("AdLandingPageFragment", "webview client is not PhotoAdvertisementWebViewClient", objArray);
          return;
       }
    }
    public String T1(){
       return g.c(this);
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, f.class, "15")) {
          return;
       }
       i0.a().p(59, this.p.getAdLogWrapper()).d(c.b).a();
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, f.class, "14")) {
          return;
       }
       i0.a().p(50, this.p.getAdLogWrapper()).d(b.b).a();
       d.b(this.p.getPhoto(), this.H);
       return;
    }
    public final void X8(o p0,b p1,i p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "18")) {
          return;
       }
       d uod = new d();
       uod.k(p1.i());
       uod.k(p2.i());
       p0.M(uod);
       return;
    }
    public void Y8(boolean p0){
       this.L = p0;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, f.class, "16")) {
          return;
       }
       f tw = this.w;
       if (tw == null) {
          return;
       }
       if (this.I != null) {
          tw.l.setVisibility(0);
       }else {
          tw.l.setVisibility(8);
       }
       return;
    }
    public void w1(WebViewFragment p0,WebView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "9")) {
          return;
       }
       this.t = p1;
       this.v = p0;
       if (this.p.getConversionType() == 3) {
          p1.getSettings().setUserAgentString(p1.getSettings().getUserAgentString()+f.M);
       }
       if (this.u == null) {
          f ty = this.y;
          if (ty != null && (ty.vh() != null && this.y.vh().l != null)) {
             this.y.vh().l.setVisibility(8);
          }
       }
       p1.getSettings().setUserAgentString(p1.getSettings().getUserAgentString()+" AllowKsCallApp");
       this.S8(p1);
       return;
    }
}
