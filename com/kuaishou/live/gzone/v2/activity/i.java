package com.kuaishou.live.gzone.v2.activity.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gzone.v2.activity.i$a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import c77.a$a;
import c77.a;
import w53.l0;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import com.kwai.library.widget.refresh.RefreshLayout;
import y43.a;
import tkd.b;
import tkd.d;
import os5.h;
import android.view.View;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$b;
import androidx.fragment.app.c$b;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import android.view.ViewGroup;
import ekd.m1;
import android.widget.FrameLayout;
import com.kwai.live.gzone.pendant.service.LiveGzoneFeatureEntrances;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class i extends PresenterV2	// class@001cc1
{
    public boolean A;
    public boolean B;
    public KwaiYodaWebView$b C;
    public PresenterV2 D;
    public c$b E;
    public a p;
    public PagerSlidingTabStrip$d q;
    public LiveGzoneFeatureEntrances r;
    public a s;
    public BaseFragment t;
    public RefreshLayout u;
    public FrameLayout v;
    public c w;
    public a$a x;
    public WebViewFragment y;
    public boolean z;

    public void i(){
       super();
       this.z = false;
       this.A = false;
       this.B = false;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       if (this.p != null) {
          i tq = this.q;
          if (tq != null) {
             i$a uoa = new i$a(this, tq.c());
             this.x = uoa;
             this.p.e(uoa);
          }
       }
       this.u.setOnRefreshListener(new l0(this));
       if (this.s.t != null) {
          PresenterV2 presenterV2 = d.a(0x2cb5d4a8).h40();
          this.D = presenterV2;
          presenterV2.f(this.m8());
          Object[] objArray = new Object[0];
          this.D.i(objArray);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       i ty = this.y;
       if (ty != null) {
          WebView webView = ty.eh();
          if (webView instanceof KwaiYodaWebView) {
             webView.setOnOverScrolledCallBack(null);
          }
       }
       ty = this.E;
       if (ty != null) {
          this.w.unregisterFragmentLifecycleCallbacks(ty);
       }
       ty = this.y;
       if (ty != null && (this.w != null && ty.getFragmentManager() != null)) {
          this.w.beginTransaction().u(this.y).m();
       }
    label_0043 :
       ty = this.x;
       if (ty != null) {
          i tp = this.p;
          if (tp != null) {
             tp.d(ty);
          }
       }
       ty = this.p;
       if (ty != null) {
          ty.c(true);
       }
       this.u.setEnabled(true);
       ty = this.D;
       if (ty != null) {
          ty.unbind();
          this.D.destroy();
          this.D = null;
       }
       this.w = null;
       this.y = null;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a3537);
       this.v = m1.f(p0, 0x7f0a1f94);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.s8(a.class);
       this.q = this.t8("LIVE_GZONE_TAB");
       this.r = this.q8(LiveGzoneFeatureEntrances.class);
       this.s = this.q8(a.class);
       this.t = this.s8(BaseFragment.class);
       return;
    }
}
