package c77.c0;
import i63.b;
import j47.c;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import j63.a;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$b;
import t77.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tkd.b;
import tkd.d;
import os5.h;
import android.app.Activity;
import com.kwai.live.gzone.tab.page.a;
import android.view.View;
import android.os.Bundle;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.webkit.URLUtil;
import android.net.Uri;
import ekd.x0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Color;
import lnc.a1;
import java.lang.Exception;
import c77.u;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import com.kwai.library.widget.refresh.RefreshLayout;
import y43.a;
import android.view.ViewGroup;
import com.kwai.framework.model.user.QCurrentUser;
import mkc.b;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import c77.t;
import android.view.View$OnClickListener;
import java.lang.RuntimeException;
import android.view.LayoutInflater;
import ekd.m1;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import fq5.b;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.kwai.yoda.model.LaunchModel$a;
import com.kwai.yoda.model.LaunchModel;
import android.content.Intent;
import f37.o0;
import lp3.e;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import c77.z;
import uxc.b;
import c77.a0;
import uxc.a;
import c77.w;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import c77.x;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import androidx.fragment.app.c;
import c77.y;
import t77.a$b;
import xp5.a;
import com.kwai.sdk.switchconfig.a;
import androidx.fragment.app.e;

public class c0 extends b	// class@0004f7
{
    public PresenterV2 A;
    public String B;
    public boolean C;
    public boolean D;
    public int E;
    public View F;
    public final c G;
    public boolean H;
    public boolean I;
    public int J;
    public c u;
    public RefreshLayout v;
    public FrameLayout w;
    public WebViewFragment x;
    public KwaiYodaWebView$b y;
    public a z;

    public void c0(c p0){
       super();
       this.C = false;
       this.D = false;
       this.E = 0;
       this.G = p0;
    }
    public void C(boolean p0,String p1){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc0, "12")) {
          return;
       }
       b tt = this.t;
       if (tt != null) {
          tt.h(p0, p1);
       }
       tt = this.s;
       if (tt != null) {
          tt.h(p0, p1);
       }
       return;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c0.class, "7")) {
          return;
       }
       c0 tx = this.x;
       if (tx != null) {
          WebView webView = tx.eh();
          if (webView instanceof KwaiYodaWebView) {
             webView.setOnOverScrolledCallBack(objArray);
          }
       }
       tx = this.z;
       if (tx != null) {
          tx.b();
       }
       this.C(true, this.B);
       tx = this.A;
       if (tx != null) {
          tx.unbind();
          this.A.destroy();
          this.A = objArray;
       }
       this.u = objArray;
       this.x = objArray;
       d.a(0x2cb5d4a8).Z5(this.k(), this.w);
       return;
    }
    public void b(){
       c0 uoc0 = c0.class;
       if (PatchProxy.applyVoid(null, this, uoc0, "3")) {
          return;
       }
       super.b();
       if (this.l() == null) {
          throw new RuntimeException("gzone page not found url");
       }
       try{
          String str = this.l().getString("ARG_TAB_URL");
          this.B = str;
          if (!PatchProxy.applyVoidOneRefs(str, this, uoc0, "4") && (!TextUtils.isEmpty(str) && (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)))) {
             Uri uri = x0.f(str);
             this.H = uri.getBooleanQueryParameter("needLogin", 0);
             String queryParamet = uri.getQueryParameter("bgcolor");
             Object obj = PatchProxy.applyOneRefs(queryParamet, this, uoc0, "14");
             int i = (obj != PatchProxyResult.class)? obj.intValue(): Color.parseColor(queryParamet);
          label_006c :
             this.J = i;
             this.I = uri.getBooleanQueryParameter("disablepullrefresh", 0);
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       this.v.setOnRefreshListener(new u(this));
       if (this.l.s != null) {
          PresenterV2 presenterV2 = d.a(0x2cb5d4a8).h40();
          this.A = presenterV2;
          presenterV2.f(this.o());
          Object[] objArray = new Object[0];
          this.A.i(objArray);
       }
       if (this.I != null) {
          this.v.setShowRefreshView(0);
       }
       this.v.setBackgroundColor(this.J);
       if (this.H != null && (!QCurrentUser.me().isLogined() && this.G != null)) {
          this.F = c.h(this.w, b.g);
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.b();
          uoa.k(R.drawable.arg_RES_7f080609);
          uoa.h(R.string.arg_RES_7f1030ae);
          uoa.e(R.string.arg_RES_7f103059);
          uoa.p(new t(this));
          uoa.a(this.F);
       }else {
          uoc0 = this.F;
          if (uoc0 != null) {
             c.c(this.w, uoc0);
          }
       }
       return;
    }
    public int m(){
       return 0x7f0d0bec;
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, c0.class, "1")) {
          return;
       }
       this.c.setBackgroundColor(a1.a(R.color.arg_RES_7f061403));
       return;
    }
    public View p(LayoutInflater p0,ViewGroup p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.p(p0, p1);
       this.v = m1.f(view, 0x7f0a3537);
       this.w = m1.f(view, 0x7f0a1f94);
       return view;
    }
    public void q(){
       c0 uoc0 = c0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc0, "5")) {
          return;
       }
       c0 tx = this.x;
       boolean b = true;
       if (tx != null && tx.isAdded()) {
          this.x.bh(b);
          return;
       }else if(PatchProxy.applyVoid(objArray, this, uoc0, "6")){
          KwaiWebViewActivity$a uoa = KwaiWebViewActivity.N3(this.k(), this.B).o(this.l.m.b().getUrl()).l("KEY_THEME", "3").m("KEY_IS_SELECTABLE_PAGE", b).l("KEY_WEB_TYPE", "Live_GzoneTab_1");
          uoa.j("");
          LaunchModel$a uoa1 = new LaunchModel$a(this.B);
          uoa1.m(this.J);
          if (this.I != null) {
             uoa1.f(false);
             uoa1.g(false);
          }else {
             uoa1.f(false);
             uoa1.g(b);
          }
          uoa.h(uoa1.a());
          uoa.i("none");
          Intent intent = uoa.a();
          o0.q(intent, 2);
          b tl = this.l;
          if (tl != null) {
             objArray = tl.m.t5();
          }
          Bundle extras = intent.getExtras();
          KwaiYodaWebViewFragment kwaiYodaWebV = PatchProxy.applyTwoRefs(extras, objArray, this, uoc0, "8");
          if (kwaiYodaWebV != PatchProxyResult.class) {
          }else {
             kwaiYodaWebV = this.l.O.k3();
             kwaiYodaWebV.setArguments(extras);
             kwaiYodaWebV.kh(new z(this));
             kwaiYodaWebV.gh(new a0(this));
          }
          this.x = kwaiYodaWebV;
          kwaiYodaWebV.ch(new w(this));
          this.x.lh(new x(this));
          this.x.c0();
          c childFragmen = this.l.m.b().getChildFragmentManager();
          this.u = childFragmen;
          a uoa2 = new a(childFragmen, this.x, new y(this), "LiveGzoneWebTabFragment");
          this.z = uoa2;
          uoa2.a();
          d.a(0x2cb5d4a8).Z5(this.k(), this.w);
       }
       return;
    }
    public void r(){
       boolean b1;
       c0 uoc0 = c0.class;
       if (PatchProxy.applyVoid(null, this, uoc0, "9")) {
          return;
       }
       this.C(true, this.B);
       c0 tx = this.x;
       boolean b = false;
       if (tx != null && tx.isAdded()) {
          this.x.bh(b);
       }
       b obj = PatchProxy.apply(null, this, uoc0, "10");
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else {
          obj = this.l;
          if (obj != null && obj.y4().g()) {
             b = a.t().d("gzoneMultiTabReleaseH5", b);
          }
          b1 = b;
       }
       if (b1 && !PatchProxy.applyVoid(null, this, uoc0, "11")) {
          uoc0 = this.x;
          if (uoc0 != null) {
             WebView webView = uoc0.eh();
             if (webView instanceof KwaiYodaWebView) {
                webView.setOnOverScrolledCallBack(null);
             }
          }
          uoc0 = this.x;
          if (uoc0 != null && (this.u != null && uoc0.getFragmentManager() != null)) {
             this.u.beginTransaction().u(this.x).m();
          }
       label_0085 :
          this.x = null;
       }
       return;
    }
}
