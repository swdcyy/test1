package com.yxcorp.gifshow.featured.detail.featured.milano.HomeMilanoBaseContainerFragment;
import hf5.e;
import hf5.b;
import hf5.f;
import hf5.g;
import qvb.r;
import ge5.b;
import bf5.r;
import ab5.v;
import eb5.b;
import wd5.f;
import eb5.g;
import jga.e;
import on5.f;
import qe5.a;
import pb5.b;
import im8.g;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import ef5.c;
import java.util.ArrayList;
import java.util.List;
import mrd.a;
import com.gifshow.kuaishou.thanos.milano.MilanoAttachCallbackPresenter;
import ef5.e;
import qh.j;
import android.os.Handler;
import com.yxcorp.gifshow.featured.detail.featured.milano.HomeMilanoBaseContainerFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import tkd.b;
import tkd.d;
import ida.b;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import jta.c;
import tda.m;
import jf5.a;
import rf5.u;
import df5.b;
import ef5.a;
import android.content.Intent;
import com.yxcorp.gifshow.widget.SwipeLayout;
import joc.z;
import android.view.ViewGroup;
import ge5.a;
import java.lang.Integer;
import jga.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import wca.b;
import android.os.SystemClock;
import bf5.s;
import io.reactivex.subjects.PublishSubject;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import android.view.View;
import c95.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import k2b.e0;
import k2b.d0;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import ekd.i;
import erd.g;
import crd.b;
import uw9.l0;
import xx9.a;
import df5.e;
import eb5.a;
import on5.e;
import java.util.UUID;
import df5.d;
import brd.t;
import eb5.f;
import ge5.d;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import androidx.viewpager.widget.ViewPager$i;
import rd5.j;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.kcube.TabIdentifier;
import gsa.i0;
import on5.a;
import ab5.u;
import qh.e;
import fr6.a;
import wq6.k;
import wq6.j;
import android.view.LayoutInflater;
import android.os.Bundle;
import gp5.c;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import wkd.b;
import com.yxcorp.gifshow.w;
import uv8.e1;
import uv8.m1;
import uy6.h;
import uy6.b;
import lda.b;
import android.content.Context;
import com.kwai.written.view.IWrittenLayout;
import lda.a;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import com.kuaishou.ax2c.AX2C;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import lnc.w9;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import wq6.d;
import yq6.e;
import androidx.lifecycle.Lifecycle;
import zn5.a;
import tda.v;
import yq6.a;
import xq6.b;
import yw6.g;
import com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher;
import com.kwai.framework.perf.phonelevel.d;
import com.yxcorp.gifshow.detail.view.CustomAnimationViewPager;
import com.yxcorp.gifshow.featured.detail.featured.milano.HomeMilanoBaseContainerFragment$b;
import n9a.b;
import bf5.e;
import bf5.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zda.v;
import qh.f;
import le5.f;
import te5.c;
import com.yxcorp.gifshow.featured.detail.featured.presenter.n;
import ok.x;
import j9a.h;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaAudioFocusPresenter;
import zda.l1;
import te5.g;
import id5.o;
import w1a.d;
import v0a.x0;
import e0a.j;
import com.yxcorp.gifshow.detail.logger.slideprocess.e;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import com.yxcorp.gifshow.detail.slidev2.presenter.l;
import com.yxcorp.gifshow.detail.slidev2.presenter.d;
import pt5.a;
import z0a.n;
import com.yxcorp.gifshow.detail.fragments.milano.profile.h;
import z0a.x;
import z0a.t;
import rkd.b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.m;
import tda.m0;
import tda.x;
import com.yxcorp.gifshow.featured.detail.featured.milano.MilanoLazyPresenterGroup;
import tda.n0;
import tda.l0;
import com.yxcorp.gifshow.widget.SwipeLayout$Direction;
import android.view.ViewConfiguration;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.observers.ErrorCrashLambdaObserver;
import tda.z;
import brd.y;
import com.yxcorp.gifshow.autoplay.state.f;
import com.yxcorp.gifshow.featured.detail.featured.milano.e;
import io.reactivex.internal.functions.Functions;
import tda.w;
import sw6.b;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;
import com.yxcorp.gifshow.w$b;
import tda.y;
import tda.k0;
import java.util.Map;
import java.util.HashMap;
import androidx.fragment.app.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import hf5.d;
import df5.c;
import uw9.v3;
import joc.d;
import d9a.b;
import e1a.l;
import e1a.k;
import qh.a;
import sh.a;
import android.content.res.Configuration;
import java.util.Iterator;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import com.kwai.component.photo.detail.slide.degrade.SlidePlayDegradeApi;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import zv6.t;
import p1b.b;
import tda.u;
import z1.a;
import com.yxcorp.gifshow.util.MultiWindowLayoutUtil;
import pb5.a;
import qvb.i;
import qvb.n0;
import ayb.g;
import ww6.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.featured.detail.featured.milano.commonslide.HomeCommonSlideContainerFragment;
import yy6.c;

public abstract class HomeMilanoBaseContainerFragment extends LazyInitSupportedFragment implements e, b, f, g, r, b, r, v, b, f, g, e, f, a, b, g	// class@000f19
{
    public final List A;
    public final List B;
    public MilanoAttachCallbackPresenter C;
    public final e D;
    public h E;
    public x F;
    public SlidePlayViewModel G;
    public SlideTaskDispatcher H;
    public SwipeLayout I;
    public PresenterV2 J;
    public m0 K;
    public m L;
    public f M;
    public KwaiGrootViewPager N;
    public View O;
    public View P;
    public long Q;
    public b R;
    public b S;
    public boolean T;
    public w U;
    public String U0;
    public Runnable V;
    public Runnable W;
    public final Handler X;
    public final w$b Y;
    public String Z;
    public d s;
    public e t;
    public c u;
    public e v;
    public final c w;
    public c x;
    public c y;
    public final List z;
    public static final int V0;

    public void HomeMilanoBaseContainerFragment(){
       super();
       c uoc = new c(new ArrayList());
       this.w = uoc;
       this.x = a.g();
       this.z = new ArrayList();
       this.A = new ArrayList();
       this.B = new ArrayList();
       this.C = new MilanoAttachCallbackPresenter(uoc);
       e uoe = new e();
       this.D = uoe;
       this.E = new j(uoe);
       this.T = true;
       this.X = new Handler();
       this.Y = new HomeMilanoBaseContainerFragment$a(this);
    }
    private int getLayoutResId(){
       Object obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return d.a(-859095268).zF();
    }
    public abstract int Ah();
    public void B5(int p0){
    }
    public boolean B7(){
       Object obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.Mf();
    }
    public BaseFragment Bh(){
       Object[] objArray = null;
       HomeMilanoBaseContainerFragment obj = PatchProxy.apply(objArray, this, HomeMilanoBaseContainerFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G;
       Object[] objArray1 = (obj == null)? objArray: obj.t();
       if (objArray1 instanceof GrootBaseFragment) {
          objArray = objArray1;
       }
       return objArray;
    }
    public void Ch(boolean p0){
    }
    public void D0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeMilanoBaseContainerFragment.class, "57")) {
          return;
       }
       this.L.c.R.j(p0);
       return;
    }
    public void De(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeMilanoBaseContainerFragment.class, "40")) {
          return;
       }
       this.w.a(p0);
       return;
    }
    public void Dh(Intent p0){
    }
    public void Eh(boolean p0){
       if (PatchProxy.isSupport(HomeMilanoBaseContainerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HomeMilanoBaseContainerFragment.class, "31")) {
          return;
       }
       this.I.setEnabled(p0);
       HomeMilanoBaseContainerFragment tL = this.L;
       if (tL != null && tL.c != null) {
          if (p0 && this.K0()) {
             this.I.b(0, this.L.c.R);
          }else {
             this.I.m(this.L.c.R);
          }
       }
       return;
    }
    public ViewGroup Fe(){
       return a.b(this);
    }
    public boolean Fh(){
       Object obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.Gh();
    }
    public int G0(int p0){
       if (PatchProxy.isSupport(HomeMilanoBaseContainerFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, HomeMilanoBaseContainerFragment.class, "45");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.G.G0(p0);
    }
    public c G9(){
       HomeMilanoBaseContainerFragment obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G;
       if (obj != null) {
          QPhoto currentPhoto = obj.getCurrentPhoto();
          if (currentPhoto != null) {
             return b.c(currentPhoto.mEntity);
          }
       }
       return null;
    }
    public boolean Gh(){
       HomeMilanoBaseContainerFragment obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if ((SystemClock.elapsedRealtime() - this.Q) - 1000 > 0) {
          this.Q = SystemClock.elapsedRealtime();
          obj = this.L;
          if (obj != null) {
             obj.d.onNext(new s(2));
             this.L.c.X.P.onNext(new s(2));
          }
       }
       return true;
    }
    public final View H6(){
       return this.N;
    }
    public void Hh(c p0){
    }
    public ClientEvent$ExpTagTrans I1(){
       BaseFragment obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Bh();
       ClientEvent$ExpTagTrans uExpTagTrans = (obj != null)? obj.I1(): d0.e(this);
       return uExpTagTrans;
    }
    public final void J2(){
       if (PatchProxy.applyVoid(null, this, HomeMilanoBaseContainerFragment.class, "15")) {
          return;
       }
       i.h(this.getActivity(), 0, 0);
       return;
    }
    public void Jd(z p0){
    }
    public ClientEvent$ExpTagTrans K5(){
       BaseFragment obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Bh();
       ClientEvent$ExpTagTrans uExpTagTrans = (obj != null)? obj.K5(): d0.d(this);
       return uExpTagTrans;
    }
    public b L2(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeMilanoBaseContainerFragment.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.L.c.s2.h(p0);
    }
    public void L5(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeMilanoBaseContainerFragment.class, "51")) {
          return;
       }
       this.B.add(p0);
       return;
    }
    public void L8(){
       if (PatchProxy.applyVoid(null, this, HomeMilanoBaseContainerFragment.class, "37")) {
          return;
       }
       this.T9();
       return;
    }
    public int M(){
       BaseFragment obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.Bh();
       int i = (obj != null)? obj.M(): super.M();
       return i;
    }
    public boolean Mf(){
       return a.a(this);
    }
    public void N1(){
       e.j(this);
    }
    public String N8(){
       Object obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Z == null) {
          this.Z = UUID.randomUUID().toString();
       }
       return this.Z;
    }
    public void P8(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeMilanoBaseContainerFragment.class, "48")) {
          return;
       }
       this.A.remove(p0);
       return;
    }
    public t Ra(){
       return f.b(this);
    }
    public final d Rc(){
       return null;
    }
    public void S8(int p0){
    }
    public boolean Sa(){
       Object obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.Vg().c();
    }
    public boolean T9(){
       Object obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.L.d.onNext(new s(9));
       this.L.c.X.P.onNext(new s(9));
       return true;
    }
    public View Tf(){
       return a.a(this);
    }
    public void U0(boolean p0){
       e.k(this, p0);
    }
    public void Ud(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeMilanoBaseContainerFragment.class, "44")) {
          return;
       }
       this.G.g(p0);
       return;
    }
    public void V1(boolean p0){
       if (PatchProxy.isSupport(HomeMilanoBaseContainerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HomeMilanoBaseContainerFragment.class, "54")) {
          return;
       }
       this.L.c.s2.g(new j(ChangeScreenVisibilityCause.CLICK, (p0 ^ 1), 1), 1);
       return;
    }
    public void X(RefreshType p0,boolean p1){
       e.i(this, p0, p1);
    }
    public String X3(){
       Object obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.d(this.Ua());
    }
    public boolean Xf(String p0){
       return u.a(this, p0);
    }
    public boolean Xg(){
       return false;
    }
    public String a2(){
       BaseFragment obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Bh();
       String str = (obj != null)? obj.a2(): super.a2();
       return str;
    }
    public void a6(){
       e.b(this);
    }
    public String ae(){
       Object obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.N8();
    }
    public a b0(){
       return j.a(this);
    }
    public void c3(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeMilanoBaseContainerFragment.class, "41")) {
          return;
       }
       this.w.f(p0);
       return;
    }
    public void cc(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeMilanoBaseContainerFragment.class, "43")) {
          return;
       }
       this.G.i(p0);
       return;
    }
    public final View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view1;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, HomeMilanoBaseContainerFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = d.a(-87665878).ag(this.getLayoutResId());
       StringBuilder str = "use async inflated view: ";
       boolean b = (view != null)? true: false;
       Log.g("HomeMilano", str+b);
       if (view != null) {
          b.a(-1343064608).z().w();
       }
       if (view == null) {
          if (m1.g()) {
             view1 = (h.a.e != null)? new b(p0.getContext()).l1(): new a(p0.getContext()).l1();
          }else if(SlidePerformanceExp.g()){
             view1 = new AX2C(p0.getContext()).inflateSync(this.getLayoutResId(), p1, false);
          }else {
             view1 = a.g(p0, this.getLayoutResId(), p1, false);
          }
          view = view1;
          view.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       }
       this.I = w9.c(this.getActivity());
       this.N = view.findViewById(0x7f0a2d41);
       this.O = view.findViewById(0x7f0a2d78);
       this.P = view.findViewById(0x7f0a3b47);
       return view;
    }
    public final void fh(View p0,Bundle p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeMilanoBaseContainerFragment.class, "3")) {
          return;
       }
       this.a6();
       d uod = this.z5();
       if (uod != null) {
          uod.c0().b(this.getLifecycle(), a.a, new v(this));
       }
       this.v = new e(this.Ah());
       this.U0 = "HomeMilano"+this.Ah();
       m om = this.rh();
       this.L = om;
       this.oh(om, p0);
       this.G = SlidePlayViewModel.v0(this, this.N, this.sh(), this.H);
       boolean b = b.a(-404437045).g();
       HomeMilanoBaseContainerFragment tN = this.N;
       if (tN instanceof CustomAnimationViewPager) {
          tN.setCustomAnimPagerInterceptor(new HomeMilanoBaseContainerFragment$b(this, b));
       }
       b.b = false;
       e uoe = this.th();
       this.t = uoe;
       uoe.c();
       this.v.a();
       c uoc = this.t.a();
       this.u = uoc;
       this.Hh(uoc);
       uoc.t = true;
       this.s = this.t.f(this.getActivity().findViewById(0x7f0a0472));
       String str = "5";
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, HomeMilanoBaseContainerFragment.class, str);
       if (presenterV2 != patchProxyRe) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new v());
          presenterV2.U7(this.C);
          presenterV2.U7(new f(this.D));
          if (f.p()) {
             presenterV2.U7(new c());
          }
          presenterV2.U7(new n(this.F));
          presenterV2.U7(new h(true));
          presenterV2.U7(new NasaAudioFocusPresenter());
          presenterV2.U7(new l1());
          presenterV2.U7(new g());
          if (o.c()) {
             presenterV2.U7(new d());
          }
          presenterV2.U7(new x0());
          if (j.a()) {
             presenterV2.U7(new e(this.getActivity()));
          }
          if (!NasaExperimentUtils.n()) {
             presenterV2.U7(new l());
          }
          presenterV2.U7(new d());
          d.a(0x60b9226c).Cp(presenterV2);
          presenterV2.U7(new n());
          if (this.u.e != null) {
             if (f.o()) {
                presenterV2.U7(new h());
                presenterV2.U7(new x());
             }else {
                presenterV2.U7(new t());
             }
          }
          if (b.f()) {
             presenterV2.U7(new m());
          }
          this.mh(presenterV2);
          PatchProxy.onMethodExit(HomeMilanoBaseContainerFragment.class, str);
       }
       this.J = presenterV2;
       presenterV2.f(p0);
       MilanoLazyPresenterGroup milanoLazyPr = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "6");
       if (milanoLazyPr != patchProxyRe) {
       }else {
          x ox = new x(this);
          MilanoLazyPresenterGroup milanoLazyPr1 = (this.xh())? new MilanoLazyPresenterGroup(ox): new l0(ox);
          milanoLazyPr = milanoLazyPr1;
       }
       this.K = milanoLazyPr;
       milanoLazyPr.c(p0);
       this.Dh(this.getActivity().getIntent());
       if (!PatchProxy.applyVoid(null, this, HomeMilanoBaseContainerFragment.class, "10")) {
          this.I.setEnabled(true);
          this.I.setDirection(SwipeLayout$Direction.LEFT);
          this.I.setAdjustChildScrollHorizontally(false);
          this.I.setIgnoreEdge(false);
          this.I.setSwipeTriggerDistance(n.P(this.getContext(), (float)ViewConfiguration.get(this.getContext()).getScaledTouchSlop()));
       }
       ErrorCrashLambdaObserver uErrorCrashL = new ErrorCrashLambdaObserver(new z(this));
       this.R = uErrorCrashL;
       this.Vg().i().subscribe(uErrorCrashL);
       f uof = new f(this);
       this.M = uof;
       this.S = uof.d().subscribe(e.b, Functions.d());
       if (f.b()) {
          this.O.setVisibility(false);
       }
       this.N.setPageScrolledInterceptor(new w(this));
       w ow = b.a(-1343064608);
       this.U = ow;
       ow.W(this.Y);
       this.L.c.U1.subscribe(new y(this));
       this.ph();
       return;
    }
    public QPhoto getCurrentPhoto(){
       Object obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G.getCurrentPhoto();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeMilanoBaseContainerFragment.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, HomeMilanoBaseContainerFragment.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(HomeMilanoBaseContainerFragment.class, new k0());
       }else {
          obj.put(HomeMilanoBaseContainerFragment.class, null);
       }
       return obj;
    }
    public c getSupportFragmentManager(){
       Object obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getFragmentManager();
    }
    public String getUrl(){
       BaseFragment obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Bh();
       String url = (obj != null)? obj.getUrl(): "";
       if (TextUtils.x(url)) {
          url = "ks://photo";
       }
       return url;
    }
    public void h1(){
       d.a(this);
    }
    public boolean h2(){
       Object obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.L.c.s2.c();
    }
    public String h5(){
       BaseFragment obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Bh();
       String str = (obj != null)? obj.h5(): d0.g(this);
       return str;
    }
    public void hb(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeMilanoBaseContainerFragment.class, "47")) {
          return;
       }
       this.A.add(p0);
       return;
    }
    public float i4(){
       Object obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.L.c.R.q();
    }
    public void i6(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeMilanoBaseContainerFragment.class, "50")) {
          return;
       }
       this.z.remove(p0);
       return;
    }
    public boolean i8(){
       return e.e(this);
    }
    public boolean j1(){
       return this.L.c.j;
    }
    public d j6(){
       return this.s;
    }
    public void jg(boolean p0){
       if (PatchProxy.isSupport(HomeMilanoBaseContainerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HomeMilanoBaseContainerFragment.class, "60")) {
          return;
       }
       this.x.onNext(Boolean.valueOf(p0));
       return;
    }
    public final void k2(){
    }
    public boolean kf(){
       return f.a(this);
    }
    public void m3(d p0){
    }
    public void mh(PresenterV2 p0){
    }
    public void nh(m0 p0){
    }
    public boolean o3(){
       Object obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.Gh();
       return true;
    }
    public void oh(m p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeMilanoBaseContainerFragment.class, "9")) {
          return;
       }
       p0.b = this;
       l0 ol0 = new l0();
       p0.c = ol0;
       ol0.W1 = new b();
       m c = p0.c;
       c.v = p1;
       c.q2 = k.a(this);
       this.y = new a(p0.c.z2);
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeMilanoBaseContainerFragment.class, "26")) {
          return;
       }
       super.onConfigurationChanged(p0);
       boolean b = (p0.orientation == 2)? true: false;
       Iterator iterator = this.z.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(Boolean.valueOf(b));
       }
       InvalidGestureChecker.b(this.getContext(), (b ^ 1));
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeMilanoBaseContainerFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (SlideDispatchHelper.e()) {
          this.H = SlideDispatchHelper.b();
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, HomeMilanoBaseContainerFragment.class, "33")) {
          return;
       }
       super.onDestroy();
       NasaFeatureGuideManager.f().p();
       HomeMilanoBaseContainerFragment tH = this.H;
       if (tH != null) {
          tH.l();
          this.H = null;
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, HomeMilanoBaseContainerFragment.class, "17")) {
          return;
       }
       super.onDestroyView();
       boolean b = false;
       SlidePlayDegradeApi.setNeedDegrade(b);
       HomeMilanoBaseContainerFragment tV = this.V;
       if (tV != null) {
          this.X.removeCallbacks(tV);
       }
       tV = this.W;
       if (tV != null) {
          e.c(tV);
       }
       tV = this.Y;
       if (tV != null) {
          HomeMilanoBaseContainerFragment tU = this.U;
          if (tU != null) {
             tU.j(tV);
          }
       }
       tV = this.G;
       if (tV != null) {
          tV.t1().f();
       }
       this.T = b;
       HomeMilanoBaseContainerFragment tJ = this.J;
       if (tJ != null) {
          tJ.destroy();
       }
       tJ = this.K;
       if (tJ != null) {
          tJ.d();
       }
       tJ = this.R;
       if (tJ != null && !tJ.isDisposed()) {
          this.R.dispose();
       }
       tJ = this.S;
       if (tJ != null && !tJ.isDisposed()) {
          this.S.dispose();
       }
       tJ = this.M;
       if (tJ != null) {
          tJ.a();
       }
       tJ = this.L;
       if (tJ != null) {
          m c = tJ.c;
          if (c != null) {
             c.clear();
          }
       }
       b.o0(this).r0();
       tJ = this.t;
       if (tJ != null) {
          tJ.d();
       }
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport(HomeMilanoBaseContainerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HomeMilanoBaseContainerFragment.class, "25")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       if (p0) {
          MultiWindowLayoutUtil.a(this.getView(), new u(this));
       }else {
          Iterator iterator = this.A.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(false, n.A(this.getContext()));
          }
          MultiWindowLayoutUtil.d(this.getView());
       }
       return;
    }
    public void onRefresh(){
       if (PatchProxy.applyVoid(null, this, HomeMilanoBaseContainerFragment.class, "36")) {
          return;
       }
       this.Fh();
       return;
    }
    public SlidePlayViewModel p0(){
       return this.G;
    }
    public boolean p3(){
       return a.a(this);
    }
    public void p8(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeMilanoBaseContainerFragment.class, "52")) {
          return;
       }
       this.B.remove(p0);
       return;
    }
    public void ph(){
    }
    public i q(){
       Object obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G.X0();
    }
    public boolean q3(){
       Object obj = PatchProxy.apply(null, this, HomeMilanoBaseContainerFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.G.X0() instanceof n0) {
          return this.G.X0().D1();
       }
       return false;
    }
    public void q9(d p0){
    }
    public void qh(){
       if (PatchProxy.applyVoid(null, this, HomeMilanoBaseContainerFragment.class, "12")) {
          return;
       }
       if (this.T != null && (this.J.R1() && this.K.g())) {
          boolean b = false;
          this.T = b;
          int i = 2;
          Object[] objArray = new Object[i];
          objArray[b] = this;
          objArray[1] = this.L;
          this.J.i(objArray);
          if (d.a(-908290672).z50()) {
             objArray = new Object[]{this,this.L,this.getActivity()};
             this.K.b(objArray);
          }else {
             Object[] objArray1 = new Object[i];
             objArray1[b] = this;
             objArray1[1] = this.L;
             this.K.b(objArray1);
          }
       }
       return;
    }
    public int r(){
       return e.a(this);
    }
    public boolean r4(){
       return this.Gh();
    }
    public abstract m rh();
    public d s8(){
       return j.b(this);
    }
    public abstract g sh();
    public abstract e th();
    public boolean u0(boolean p0){
       return e.c(this, p0);
    }
    public void ub(z p0){
    }
    public abstract a uh();
    public abstract NasaBizParam vh();
    public void w0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeMilanoBaseContainerFragment.class, "58")) {
          return;
       }
       this.L.c.R.B(p0);
       return;
    }
    public abstract PhotoDetailParam wh();
    public void xb(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeMilanoBaseContainerFragment.class, "49")) {
          return;
       }
       this.z.add(p0);
       return;
    }
    public boolean xh(){
       return false;
    }
    public boolean yf(){
       return false;
    }
    public boolean yh(){
       return (this instanceof HomeCommonSlideContainerFragment ^ 0x01);
    }
    public d z5(){
       return j.c(this);
    }
    public c z6(){
       return this.L.c.f;
    }
    public boolean zh(){
       return (this instanceof HomeCommonSlideContainerFragment ^ 0x01);
    }
}
