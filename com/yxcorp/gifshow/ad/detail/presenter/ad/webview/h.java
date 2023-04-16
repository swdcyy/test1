package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import rf5.u;
import u09.t;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import u09.p;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.h$a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ge5.d;
import com.yxcorp.gifshow.entity.QPhoto;
import tw.j;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.c;
import yx.j0;
import android.app.Activity;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import jz8.n;
import id5.a;
import java.util.List;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Boolean;
import im8.f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.j;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.i;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import io.reactivex.subjects.PublishSubject;
import mxb.o;
import ekd.p1;
import g59.k0;
import android.widget.FrameLayout;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import jyc.b;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.e;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import android.os.Bundle;
import k59.e2;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment;
import m59.p;
import java.util.Objects;
import u09.q;
import uxc.a;
import u09.r;
import uxc.b;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import u09.s;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.f;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.h$b;
import jta.d;
import joc.z;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.h$c;
import android.view.View$OnTouchListener;
import u09.o;
import android.view.View$OnClickListener;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import qy8.a;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class h extends PresenterV2	// class@00164b
{
    public View A;
    public ViewGroup B;
    public ViewGroup C;
    public j D;
    public i E;
    public b F;
    public Float G;
    public b H;
    public PhotoAdvertisement$H5ControlInfo I;
    public b J;
    public final Runnable K;
    public boolean L;
    public l M;
    public boolean N;
    public boolean O;
    public final PhotoDetailParam P;
    public PublishSubject Q;
    public boolean R;
    public final boolean S;
    public final a T;
    public final a U;
    public d p;
    public QPhoto q;
    public BaseFragment r;
    public f s;
    public n t;
    public PublishSubject u;
    public PublishSubject v;
    public a w;
    public final u x;
    public SlidePlayViewModel y;
    public SwipeLayout z;
    public static final int V;

    static {
       h.V = a1.h();
    }
    public void h(PhotoDetailParam p0){
       super();
       this.x = new u();
       this.K = new t(this);
       this.L = false;
       this.N = false;
       this.O = false;
       this.S = a.t().d("uniAdWebPreloadPresenter", false);
       this.T = new p(this);
       this.U = new h$a(this);
       this.P = p0;
       if (p0.isThanos()) {
          this.U7(new AdWebViewPreloadGuidePresenter());
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       h tp = this.p;
       if (tp != null) {
          this.M = tp.e;
       }
       if (j.F(this.q) || (!c.b(this.q.mEntity) || c.V(this.q.mEntity))) {
          Object[] objArray = new Object[0];
          j0.a("AdH5PreloadPresenter", "is download ad or half H5, skip", objArray);
          return;
       }else if(this.getActivity() == null){
          return;
       }else if(this.B == null){
          return;
       }else {
          this.I = c.q(this.q.mEntity);
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.r.getParentFragment());
          this.y = slidePlayVie;
          if (slidePlayVie != null) {
             slidePlayVie.P(this.r, this.U);
          }else {
             this.t.h.j.add(this.U);
          }
          return;
       }
    }
    public void F8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oh, "14")) {
          this.z = w9.c(this.getActivity());
          this.B = this.getActivity().findViewById(0x1020002);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       h ty = this.y;
       if (ty != null) {
          ty.D(this.r, this.U);
       }else {
          this.t.h.j.remove(this.U);
       }
       return;
    }
    public final void P8(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "13")) {
          return;
       }
       if (this.A != null && this.P.enableSlidePlay()) {
          oh = this.A;
          int i = (p0)? 8: 0;
          oh.setVisibility(i);
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, h.class, "12")) {
          return;
       }
       if (!this.s.get().booleanValue()) {
          return;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().l3(this.T);
       }
       this.x.l();
       Boolean fALSE = Boolean.FALSE;
       this.s.set(fALSE);
       boolean b = false;
       this.P8(b);
       h tD = this.D;
       if (tD != null) {
          tD.c();
       }
       tD = this.E;
       if (tD != null) {
          tD.c();
       }
       if (this.O != null) {
          this.O = b;
          a.d().k(new PlayEvent(this.q, PlayEvent$Status.RESUME));
       }
       this.Q.onNext(fALSE);
       return;
    }
    public final void S8(){
       h tI;
       h oh = h.class;
       if (PatchProxy.applyVoid(null, this, oh, "6")) {
          return;
       }
       boolean b = true;
       this.R = b;
       boolean b1 = false;
       if (!j.A(this.q)) {
          this.x.E(b1);
       }else {
          this.x.E(b);
       }
       o.a = PublishSubject.g();
       ViewGroup viewGroup = p1.h(this.B, R.layout.arg_RES_7f0d0093);
       this.C = viewGroup;
       k0.e(viewGroup);
       this.B.addView(this.C);
       FrameLayout uFrameLayout = this.C.findViewById(R.id.root_webview);
       if (!this.P.enableSlidePlay()) {
          h tz = this.z;
          if (tz != null) {
             tz.a(uFrameLayout);
          }
       }
       this.C.findViewById(R.id.fl_root_webview).setTranslationX((float)a1.h());
       PhotoAdvertisement mUrl = k.B(this.q).mUrl;
       if (!("4").equals(b.b(mUrl))) {
          ViewGroup$MarginLayoutParams layoutParams = uFrameLayout.getLayoutParams();
          if (layoutParams.topMargin == null) {
             layoutParams.topMargin = p1.f(this.getActivity());
          }
          uFrameLayout.setLayoutParams(layoutParams);
       }
       Intent intent = KwaiWebViewActivity.N3(this.getActivity(), mUrl).a();
       e.a(intent, mUrl);
       WebViewFragment webViewFragm = PatchProxy.applyOneRefs(intent, this, oh, "7");
       if (webViewFragm != PatchProxyResult.class) {
       }else if(this.S != null){
          i oi = new i(this.q.mEntity, this.getActivity(), intent.getExtras());
          this.E = oi;
          tI = this.I;
          if (tI == null || tI.mShouldSuspendDeepLink == null) {
             b = false;
          }
          i oi1 = i.class;
          if (!PatchProxy.isSupport(oi1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), oi, oi1, "11")) {
             oi.c.o(b);
          }
          webViewFragm = this.E.b();
       }else {
          webViewFragm = new AdYodaFragment();
          j oj = new j(webViewFragm, this.q.mEntity, this.getActivity(), intent.getExtras());
          this.D = oj;
          webViewFragm.Qh(oj.b());
          tI = this.D;
          h tI1 = this.I;
          if (tI1 == null || tI1.mShouldSuspendDeepLink == null) {
             b = false;
          }
          Objects.requireNonNull(tI);
          j oj1 = j.class;
          if (!PatchProxy.isSupport(oj1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tI, oj1, "14")) {
             tI.m.o(b);
          }
       }
       webViewFragm.gh(new q(this));
       webViewFragm.kh(new r(this));
       e uoe = this.getActivity().getSupportFragmentManager().beginTransaction();
       uoe.v(R.id.root_webview, webViewFragm);
       uoe.o();
       this.F = o.a.subscribe(new s(this), f.b);
       this.x.k(this.getActivity());
       this.x.G(new h$b(this, mUrl));
       oh = this.z;
       if (oh != null) {
          oh.c(this.x);
       }
       View view = this.C.findViewById(R.id.root_webview_mask);
       view.setOnTouchListener(new h$c(this));
       view.setOnClickListener(new o(this));
       this.v.onNext(new Object());
       return;
    }
    public void V8(boolean p0){
       h tI;
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "10")) {
          return;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this.T);
       }
       this.x.A();
       Boolean tRUE = Boolean.TRUE;
       this.s.set(tRUE);
       boolean b = true;
       this.P8(b);
       h tD = this.D;
       if (tD != null) {
          tI = this.I;
          if (tI == null || tI.mShouldSuspendDeepLink == null) {
             tD.e();
          }
       }
       tD = this.E;
       if (tD != null) {
          tI = this.I;
          if (tI == null || tI.mShouldSuspendDeepLink == null) {
             tD.e();
          }
       }
       tD = this.w;
       if (tD != null && (tD.getPlayer() != null && this.w.getPlayer().isPlaying())) {
          this.O = b;
          a.d().k(new PlayEvent(this.q, PlayEvent$Status.PAUSE));
       }
    label_007e :
       this.Q.onNext(tRUE);
       h tq = this.q;
       if (!PatchProxy.isSupport(oh) || (!PatchProxy.applyVoidTwoRefs(tq, Boolean.valueOf(p0), this, oh, "11") && (tq != null && (!p0 || j.b(tq.mEntity))))) {
          new a(tq.mEntity).a();
       }
    label_00b0 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a3023);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.r8("DETAIL_FRAGMENT");
       this.s = this.x8("DETAIL_FULL_WEBVIEW_STATE");
       this.t = this.q8(n.class);
       this.u = this.r8("WEBVIEW_PRELOAD_GUIDE_TOUCH");
       this.v = this.r8("WEBVIEW_PRELOAD_COMPLETE");
       this.Q = this.r8("WEBVIEW_PRELOAD_VIEW_SHOW");
       this.w = this.q8(a.class);
       this.p = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       return;
    }
}
