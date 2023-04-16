package com.yxcorp.gifshow.ad.webview.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.ad.widget.BaseCollapsedContainer;
import android.view.View;
import androidx.fragment.app.c;
import io.reactivex.subjects.PublishSubject;
import k59.t2;
import com.yxcorp.gifshow.commercial.api.web.AdYodaConfig;
import com.yxcorp.gifshow.ad.webview.h;
import erd.r;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.webview.g;
import erd.g;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k59.e2;
import com.kwai.framework.model.feed.BaseFeed;
import lnc.f;
import ekd.k1;
import android.app.Activity;
import yx.j0;
import com.yxcorp.gifshow.ad.webview.o;
import k59.p0;
import sl9.b;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import k59.i0;
import uxc.a;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.ad.webview.i;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import k59.j0;
import uxc.b;
import com.yxcorp.gifshow.ad.webview.l;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment2;
import k59.h0;
import com.yxcorp.gifshow.webview.view.c;
import android.widget.RelativeLayout;
import k59.s0;
import com.yxcorp.gifshow.ad.widget.BaseCollapsedContainer$a;
import androidx.fragment.app.e;
import k59.l0;
import msd.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import k59.k0;
import k59.m0;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kuaishou.webkit.WebView;

public class j extends PresenterV2	// class@0018c8
{
    public String A;
    public boolean B;
    public boolean C;
    public boolean D;
    public o E;
    public final AdDataWrapper p;
    public final e2 q;
    public final int r;
    public final BaseCollapsedContainer s;
    public final View t;
    public final c u;
    public final boolean v;
    public final AdYodaConfig w;
    public WebView x;
    public l y;
    public KwaiYodaWebViewFragment z;

    public void j(String p0,AdDataWrapper p1,BaseCollapsedContainer p2,View p3,int p4,c p5,boolean p6,PublishSubject p7){
       super();
       this.q = new t2();
       this.w = new AdYodaConfig();
       this.D = true;
       this.A = p0;
       this.p = p1;
       this.r = p4;
       this.s = p2;
       this.t = p3;
       this.v = p6;
       this.u = p5;
       if (p6 && p7 != null) {
          this.X7(p7.filter(h.b).observeOn(d.a).subscribe(new g(this)));
       }
       return;
    }
    public void E8(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "1")) {
          return;
       }
       if (TextUtils.x(this.A)) {
          return;
       }
       if (this.v != null) {
          this.q.a();
       }
       this.A = f.a(this.A, this.p.getPhoto());
       j tw = this.w;
       int i = 0;
       String str = 1;
       if (!PatchProxy.applyVoidOneRefs(tw, this, oj, "3")) {
          tw.mFeed = this.p.getPhoto();
          tw.mUrl = this.A;
          tw.mIsPreload = this.v;
          tw.mWebSource = 2;
          tw.mWebViewType = str;
          tw.mEntrySource = 3;
          tw.mAdClickTime = k1.i();
          tw.mEnterTime = k1.i();
          tw.mAutoRegisterFragmentLifecycle = i;
       }
       if (!PatchProxy.applyVoid(objArray, this, oj, "4")) {
          if (this.getActivity() == null) {
             Object[] objArray1 = new Object[i];
             j0.c("AdLandingPageFragmentV2", "createFragment getActivity is null", objArray1);
          }else {
             o oo = new o();
             this.E = oo;
             KwaiYodaWebViewFragment kwaiYodaWebV = oo.a(this.getActivity(), this.w, new p0(this));
             this.z = kwaiYodaWebV;
             kwaiYodaWebV.gh(new i0(this));
             tw = this.z;
             Bundle uBundle = PatchProxy.apply(objArray, this, oj, "6");
             if (uBundle != PatchProxyResult.class) {
             }else {
                uBundle = new Bundle();
                uBundle.putString("KEY_URL", this.A);
                uBundle.putBoolean("KEY_USE_PREFETCH", str);
                str = (this.t == null)? "none": "back";
                uBundle.putString("KEY_LEFT_TOP_BTN_TYPE", str);
                SerializableHook.putSerializable(uBundle, "KEY_EXTRA", this.p.getPhoto());
                SerializableHook.putSerializable(uBundle, "AD_YODA_CONFIG", this.w);
             }
             tw.setArguments(uBundle);
             this.z.ch(new i(this));
             this.z.kh(new j0(this));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, oj, "7")) {
          oj = this.t;
          if (oj != null) {
             l ol = new l(oj, "back");
             this.y = ol;
             oj = this.z;
             if (oj instanceof AdYodaFragment2) {
                oj.E = new h0(this);
             }
             ol.l.setVisibility(8);
             oj = this.s;
             if (oj != null) {
                oj.a(new s0(this));
             }
          }
       }
       e uoe = this.u.beginTransaction();
       uoe.v(this.r, this.z);
       uoe.m();
       if (this.v != null) {
          this.q.m(new l0(this));
       }
       GifshowActivity activity = this.getActivity();
       if (activity != null && !activity.isFinishing()) {
          this.X7(activity.m().subscribe(new k0(this)));
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       j tE = this.E;
       if (tE != null) {
          tE.b();
       }
       if (this.v != null) {
          this.q.m(new m0(this));
       }
       this.q.d();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, j.class, "5")) {
          return;
       }
       if (this.z.Ch() != null && this.z.Ch().canGoBack()) {
          this.z.Ch().goBack();
       }else if(this.s != null){
          if (this.z.Ch() != null) {
             this.z.Ch().scrollTo(0, 0);
          }
          this.s.d();
       }
       return;
    }
    public void R8(boolean p0){
       this.D = p0;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, j.class, "11")) {
          return;
       }
       j ty = this.y;
       if (ty == null) {
          return;
       }
       if (this.B != null) {
          ty.l.setVisibility(0);
       }else {
          ty.l.setVisibility(8);
       }
       return;
    }
}
