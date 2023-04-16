package com.yxcorp.gifshow.activity.web.presenter.OperateWebViewPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.webview.yoda.view.c;
import mx8.c;
import com.yxcorp.gifshow.activity.web.presenter.OperateWebViewPresenter$1;
import com.yxcorp.gifshow.activity.web.presenter.OperateWebViewPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import mx8.d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.web.presenter.b;
import isa.a;
import sta.n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import wkd.b;
import cta.e;
import cta.c;
import lnc.u1;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.yxcorp.gifshow.homepage.activity.e;
import ro5.a;
import java.lang.Boolean;
import wq6.d;
import as6.a;
import bo5.a;
import wq6.e;
import wq6.h;
import androidx.fragment.app.FragmentActivity;
import ro5.b;
import com.kwai.robust.PatchProxyResult;
import gsa.e0;
import za5.a;
import tkd.b;
import tkd.d;
import hn5.n;
import com.kwai.feature.api.feed.thanos.ThanosPlugin;
import zq6.p;
import com.kwai.yoda.bridge.YodaBaseWebView;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.webview.yoda.c;
import tra.b;
import q87.c;
import java.lang.StringBuilder;
import com.kwai.yoda.YodaWebView;
import com.kwai.yoda.model.LaunchModel;
import com.kuaishou.webkit.WebView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.sdk.switchconfig.a;
import android.content.Context;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.activity.web.OperateWebViewFragment;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.activity.web.JsActivityTabParams;
import m56.f;

public class OperateWebViewPresenter extends PresenterV2	// class@0014c0
{
    public final WebViewFragment$a A;
    public OperateWebViewFragment p;
    public PublishSubject q;
    public View r;
    public View s;
    public View t;
    public boolean u;
    public boolean v;
    public a w;
    public final c x;
    public final c y;
    public final LifecycleObserver z;

    public void OperateWebViewPresenter(c p0){
       super();
       this.u = false;
       this.v = false;
       this.x = new c(this);
       this.z = new OperateWebViewPresenter$1(this);
       this.A = new OperateWebViewPresenter$a(this);
       this.y = p0;
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, OperateWebViewPresenter.class, "5")) {
          return;
       }
       this.Z8();
       this.X7(this.p.Vg().i().subscribe(new d(this), Functions.d()));
       if (this.p.getParentFragment() instanceof BaseFragment) {
          objArray = this.p.getParentFragment();
       }
       if (objArray != null) {
          this.X7(objArray.Vg().j().subscribe(new b(this), Functions.d()));
       }
       if (this.p.Vg().c()) {
          this.R8();
          this.S8();
          int i = this.w.f();
          if (i > 0) {
             n.a(i);
          }
       }else {
          this.V8();
       }
       this.p.getLifecycle().addObserver(this.z);
       this.p.ch(this.A);
       b.a(-920422449).j(this.w.o(), this.x);
       u1.a(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, OperateWebViewPresenter.class, "6")) {
          return;
       }
       this.p.fh(this.A);
       this.p.getLifecycle().removeObserver(this.z);
       b.a(-920422449).h(this.w.o(), this.x);
       u1.b(this);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, OperateWebViewPresenter.class, "15")) {
          return;
       }
       this.Y8(false);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, OperateWebViewPresenter.class, "14")) {
          return;
       }
       this.Y8(this.p.isResumed());
       return;
    }
    public final void S8(){
       p e;
       e0 uoe0;
       OperateWebViewPresenter operateWebVi = OperateWebViewPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, operateWebVi, "11")) {
          return;
       }
       boolean b = true;
       if (this.p.zh() != null) {
          this.p.zh().s(b);
       }
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, operateWebVi, "12")) {
          e.b = i;
          operateWebVi = this.p;
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(operateWebVi, Boolean.TRUE, objArray, uoa, "58")) {
             d uod = a.d(operateWebVi);
             e = a.e;
             e uoe = uod.T();
             FragmentActivity activity = operateWebVi.getActivity();
             if (PatchProxy.isSupport(b.class)) {
                uoe0 = PatchProxy.applyThreeRefs(uoe, activity, Boolean.TRUE, null, b.class, "2");
                if (uoe0 != PatchProxyResult.class) {
                }else if(a.o0(activity).p0() != 2){
                   uoe0 = d.a(-1883158055).cw(uoe, activity);
                }else {
                   uoe0 = d.a(0xded02ea).Rn(uoe, activity, b);
                }
             }else {
                goto label_0069 ;
             }
             a.b(uod, e, uoe0);
          }
       }
       if (this.p.Ch() != null && this.p.Ch().getVisibility() == 4) {
          this.y.g().a();
          this.p.Ch().setVisibility(i);
          objArray = new Object[i];
          b.C().w("OperateWebViewPresenter", "set web view VISIBLE", objArray);
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, OperateWebViewPresenter.class, "13")) {
          return;
       }
       if (this.p.zh() != null) {
          this.p.zh().s(false);
       }
       return;
    }
    public final void W8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperateWebViewPresenter.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("OperateWebViewPresenter", "reloadUrl:"+p0, objArray);
       this.Z8();
       this.y.g().m();
       YodaBaseWebView yodaBaseWebV = this.p.Ch();
       if (yodaBaseWebV == null) {
          return;
       }
       yodaBaseWebV.loadUrl(p0);
       if (yodaBaseWebV instanceof YodaWebView && yodaBaseWebV.getLaunchModel() != null) {
          yodaBaseWebV.getLaunchModel().setEnableErrorPage(Boolean.TRUE);
       }
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, OperateWebViewPresenter.class, "7")) {
          return;
       }
       YodaBaseWebView yodaBaseWebV = this.p.Ch();
       if (yodaBaseWebV != null && TextUtils.n("about:blank", yodaBaseWebV.getUrl())) {
          boolean b = false;
          if (a.t().d("disableActivityTabReloadUrlIfBlank", b)) {
             return;
          }else {
             Object[] objArray = new Object[b];
             b.C().w("OperateWebViewPresenter", "reloadUrlIfBlank", objArray);
             OperateWebViewPresenter tw = this.w;
             if (tw != null && !TextUtils.x(tw.c())) {
                this.W8(this.w.c());
             }
          }
       }
       return;
    }
    public void Y8(boolean p0){
       OperateWebViewPresenter operateWebVi = OperateWebViewPresenter.class;
       if (PatchProxy.isSupport(operateWebVi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, operateWebVi, "16")) {
          return;
       }
       this.w.F(p0);
       Object[] objArray = new Object[0];
       b.C().w("OperateWebViewPresenter", "active:"+p0+", activity id "+this.w.m(), objArray);
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, OperateWebViewPresenter.class, "10")) {
          return;
       }
       int i = this.w.d(this.p, this.getContext());
       this.m8().setBackgroundColor(i);
       this.t.setBackgroundColor(i);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperateWebViewPresenter.class, "4")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a12bf);
       this.s = m1.f(p0, 0x7f0a2921);
       this.t = m1.f(p0, 0x7f0a35e3);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, OperateWebViewPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("ON_MULTI_WINDOW_MODE_CHANGED_EVENT");
       this.w = this.r8("ACTIVITY_CONFIG");
       return;
    }
    public void onEventMainThread(JsActivityTabParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperateWebViewPresenter.class, "8")) {
          return;
       }
       if (TextUtils.n(p0.mActivityId, this.w.m())) {
          this.Z8();
       }
       return;
    }
    public void onEventMainThread(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperateWebViewPresenter.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("YodaLogger", "tryReportWebLoadEvent::OnAppBackgroundEvent.", objArray);
       return;
    }
}
