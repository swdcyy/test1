package com.gifshow.kuaishou.visitor.home.feature.VisitorMilanoBaseContainerFragment;
import hf5.e;
import hf5.b;
import hf5.f;
import hf5.g;
import qvb.r;
import ge5.b;
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
import io.reactivex.subjects.PublishSubject;
import com.gifshow.kuaishou.thanos.milano.MilanoAttachCallbackPresenter;
import android.os.Handler;
import com.gifshow.kuaishou.visitor.home.feature.VisitorMilanoBaseContainerFragment$a;
import com.gifshow.kuaishou.visitor.home.feature.VisitorMilanoBaseContainerFragment$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import jta.c;
import tda.m;
import jf5.a;
import rf5.u;
import df5.b;
import ef5.a;
import android.view.ViewGroup;
import ge5.a;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import jga.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import wca.b;
import android.view.View;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.d0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import ekd.i;
import joc.z;
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
import bf5.s;
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
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import com.kuaishou.ax2c.AX2C;
import android.content.Context;
import i2b.a;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import com.kwai.component.uiconfig.visitor.VisitorModeManager$a;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import wq6.d;
import yq6.e;
import androidx.lifecycle.Lifecycle;
import zn5.a;
import wh.h;
import yq6.a;
import xq6.b;
import java.lang.StringBuilder;
import yw6.g;
import com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher;
import qh.g;
import bf5.e;
import c95.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import rh.e;
import sh.a;
import le5.f;
import te5.c;
import com.yxcorp.gifshow.featured.detail.featured.presenter.n;
import ok.x;
import z0a.n;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaAudioFocusPresenter;
import zda.l1;
import b8a.g0;
import te5.l;
import te5.g;
import id5.o;
import w1a.d;
import zda.l;
import android.content.Intent;
import com.yxcorp.gifshow.widget.SwipeLayout$Direction;
import android.view.ViewConfiguration;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.observers.ErrorCrashLambdaObserver;
import wh.k;
import brd.y;
import com.yxcorp.gifshow.autoplay.state.f;
import com.gifshow.kuaishou.visitor.home.feature.b;
import io.reactivex.internal.functions.Functions;
import wh.i;
import sw6.b;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;
import wkd.b;
import com.yxcorp.gifshow.w;
import com.yxcorp.gifshow.w$b;
import wh.j;
import wh.t;
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
import android.content.res.Configuration;
import java.util.Iterator;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper;
import lh5.a;
import com.kwai.component.taskdispatcher.utils.DispatchStrategyUtil;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import eh5.s;
import java.util.Objects;
import kotlin.jvm.internal.a;
import ih5.z;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import com.kwai.component.photo.detail.slide.degrade.SlidePlayDegradeApi;
import java.lang.Runnable;
import zv6.t;
import p1b.b;
import wh.g;
import z1.a;
import com.yxcorp.gifshow.util.MultiWindowLayoutUtil;
import pb5.a;
import qvb.i;
import qvb.n0;
import ww6.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import yy6.c;
import android.os.SystemClock;

public abstract class VisitorMilanoBaseContainerFragment extends LazyInitSupportedFragment implements e, b, f, g, r, b, v, b, f, g, e, f, a, b, g	// class@0015df
{
    public MilanoAttachCallbackPresenter A;
    public h B;
    public SlidePlayViewModel C;
    public SlideTaskDispatcher D;
    public SwipeLayout E;
    public PresenterV2 F;
    public m G;
    public f H;
    public KwaiGrootViewPager I;
    public View J;
    public View K;
    public long L;
    public b M;
    public b N;
    public boolean O;
    public w P;
    public Runnable Q;
    public final Handler R;
    public final w$b S;
    public String T;
    public String U;
    public boolean V;
    public final VisitorModeManager$a W;
    public e s;
    public c t;
    public e u;
    public final c v;
    public PublishSubject w;
    public final List x;
    public final List y;
    public final List z;
    public static final int X;

    public void VisitorMilanoBaseContainerFragment(){
       super();
       c uoc = new c(new ArrayList());
       this.v = uoc;
       this.w = PublishSubject.g();
       this.x = new ArrayList();
       this.y = new ArrayList();
       this.z = new ArrayList();
       this.A = new MilanoAttachCallbackPresenter(uoc);
       this.O = true;
       this.R = new Handler();
       this.S = new VisitorMilanoBaseContainerFragment$a(this);
       this.V = false;
       this.W = new VisitorMilanoBaseContainerFragment$b(this);
    }
    public void B5(int p0){
    }
    public boolean B7(){
       Object obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.V != null) {
          return false;
       }
       return this.Mf();
    }
    public void D0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorMilanoBaseContainerFragment.class, "53")) {
          return;
       }
       this.G.c.R.j(p0);
       return;
    }
    public void De(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorMilanoBaseContainerFragment.class, "36")) {
          return;
       }
       this.v.a(p0);
       return;
    }
    public ViewGroup Fe(){
       return a.b(this);
    }
    public int G0(int p0){
       if (PatchProxy.isSupport(VisitorMilanoBaseContainerFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, VisitorMilanoBaseContainerFragment.class, "41");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.C.G0(p0);
    }
    public c G9(){
       VisitorMilanoBaseContainerFragment obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       if (obj != null) {
          QPhoto currentPhoto = obj.getCurrentPhoto();
          if (currentPhoto != null) {
             return b.c(currentPhoto.mEntity);
          }
       }
       return null;
    }
    public final View H6(){
       return this.I;
    }
    public ClientEvent$ExpTagTrans I1(){
       BaseFragment obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.xh();
       ClientEvent$ExpTagTrans uExpTagTrans = (obj != null)? obj.I1(): d0.e(this);
       return uExpTagTrans;
    }
    public final void J2(){
       if (PatchProxy.applyVoid(null, this, VisitorMilanoBaseContainerFragment.class, "11")) {
          return;
       }
       i.h(this.getActivity(), 0, 0);
       return;
    }
    public void Jd(z p0){
    }
    public ClientEvent$ExpTagTrans K5(){
       BaseFragment obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.xh();
       ClientEvent$ExpTagTrans uExpTagTrans = (obj != null)? obj.K5(): d0.d(this);
       return uExpTagTrans;
    }
    public b L2(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VisitorMilanoBaseContainerFragment.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G.c.s2.h(p0);
    }
    public void L5(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorMilanoBaseContainerFragment.class, "47")) {
          return;
       }
       this.z.add(p0);
       return;
    }
    public void L8(){
       if (PatchProxy.applyVoid(null, this, VisitorMilanoBaseContainerFragment.class, "33")) {
          return;
       }
       if (this.V != null) {
          return;
       }
       this.T9();
       return;
    }
    public int M(){
       BaseFragment obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.xh();
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
       Object obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.T == null) {
          this.T = UUID.randomUUID().toString();
       }
       return this.T;
    }
    public void P8(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorMilanoBaseContainerFragment.class, "44")) {
          return;
       }
       this.y.remove(p0);
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
       Object obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.Vg().c();
    }
    public boolean T9(){
       Object obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.V != null) {
          return false;
       }
       this.G.d.onNext(new s(9));
       return true;
    }
    public View Tf(){
       return a.a(this);
    }
    public void U0(boolean p0){
       e.k(this, p0);
    }
    public void Ud(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorMilanoBaseContainerFragment.class, "40")) {
          return;
       }
       this.C.g(p0);
       return;
    }
    public void V1(boolean p0){
       if (PatchProxy.isSupport(VisitorMilanoBaseContainerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VisitorMilanoBaseContainerFragment.class, "50")) {
          return;
       }
       this.G.c.s2.g(new j(ChangeScreenVisibilityCause.CLICK, (p0 ^ 1), 1), 1);
       return;
    }
    public void X(RefreshType p0,boolean p1){
       e.i(this, p0, p1);
    }
    public String X3(){
       Object obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "25");
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
       BaseFragment obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.xh();
       String str = (obj != null)? obj.a2(): super.a2();
       return str;
    }
    public void a6(){
       e.b(this);
    }
    public String ae(){
       Object obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.N8();
    }
    public a b0(){
       return j.a(this);
    }
    public void c3(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorMilanoBaseContainerFragment.class, "37")) {
          return;
       }
       this.v.f(p0);
       return;
    }
    public void cc(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorMilanoBaseContainerFragment.class, "39")) {
          return;
       }
       this.C.i(p0);
       return;
    }
    public final View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, VisitorMilanoBaseContainerFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = (SlidePerformanceExp.g())? new AX2C(p0.getContext()).inflateSync(R.layout.arg_RES_7f0d0414, p1, false): a.g(p0, R.layout.arg_RES_7f0d0414, p1, false);
       this.E = w9.c(this.getActivity());
       this.I = view.findViewById(0x7f0a2d41);
       this.J = view.findViewById(0x7f0a2d6f);
       this.K = view.findViewById(0x7f0a2d78);
       return view;
    }
    public final void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VisitorMilanoBaseContainerFragment.class, "3")) {
          return;
       }
       VisitorModeManager.a(this.W);
       this.a6();
       d uod = this.z5();
       if (uod != null) {
          uod.c0().b(this.getLifecycle(), a.a, new h(this));
       }
       this.u = new e(this.wh());
       this.U = "HomeMilano"+this.wh();
       m om = this.qh();
       this.G = om;
       this.nh(om, p0);
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.v0(this, this.I, this.rh(), this.D);
       this.C = slidePlayVie;
       slidePlayVie.b = false;
       this.B = new g(slidePlayVie);
       e uoe = this.sh();
       this.s = uoe;
       uoe.c();
       this.u.a();
       c uoc = this.s.a();
       this.t = uoc;
       boolean b = true;
       uoc.t = b;
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, VisitorMilanoBaseContainerFragment.class, "4");
       if (presenterV2 != PatchProxyResult.class) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new e(this.s, null));
          presenterV2.U7(this.A);
          if (f.p()) {
             presenterV2.U7(new c());
          }
          presenterV2.U7(new n(null));
          presenterV2.U7(new n());
          presenterV2.U7(new NasaAudioFocusPresenter());
          presenterV2.U7(new l1());
          presenterV2.U7(new g0());
          presenterV2.U7(new l());
          presenterV2.U7(new g());
          if (o.c()) {
             presenterV2.U7(new d());
          }
          this.mh(presenterV2);
          presenterV2.U7(new l());
          PatchProxy.onMethodExit(VisitorMilanoBaseContainerFragment.class, "4");
       }
       this.F = presenterV2;
       presenterV2.f(p0);
       this.yh(this.getActivity().getIntent());
       if (!PatchProxy.applyVoid(null, this, VisitorMilanoBaseContainerFragment.class, "6")) {
          this.E.setEnabled(b);
          this.E.setDirection(SwipeLayout$Direction.LEFT);
          this.E.setAdjustChildScrollHorizontally(false);
          this.E.setIgnoreEdge(false);
          this.E.setSwipeTriggerDistance(n.P(this.getContext(), (float)ViewConfiguration.get(this.getContext()).getScaledTouchSlop()));
       }
       ErrorCrashLambdaObserver uErrorCrashL = new ErrorCrashLambdaObserver(new k(this));
       this.M = uErrorCrashL;
       this.Vg().i().subscribe(uErrorCrashL);
       f uof = new f(this);
       this.H = uof;
       this.N = uof.d().subscribe(b.b, Functions.d());
       if (f.b()) {
          this.K.setVisibility(false);
       }
       this.I.setPageScrolledInterceptor(new i(this));
       w ow = b.a(-1343064608);
       this.P = ow;
       ow.W(this.S);
       this.G.c.U1.subscribe(new j(this));
       this.oh();
       return;
    }
    public QPhoto getCurrentPhoto(){
       Object obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.getCurrentPhoto();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VisitorMilanoBaseContainerFragment.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, VisitorMilanoBaseContainerFragment.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(VisitorMilanoBaseContainerFragment.class, new t());
       }else {
          obj.put(VisitorMilanoBaseContainerFragment.class, null);
       }
       return obj;
    }
    public c getSupportFragmentManager(){
       Object obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getFragmentManager();
    }
    public String getUrl(){
       BaseFragment obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.xh();
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
       Object obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.G.c.s2.c();
    }
    public String h5(){
       BaseFragment obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.xh();
       String str = (obj != null)? obj.h5(): d0.g(this);
       return str;
    }
    public void hb(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorMilanoBaseContainerFragment.class, "43")) {
          return;
       }
       this.y.add(p0);
       return;
    }
    public float i4(){
       Object obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.G.c.R.q();
    }
    public void i6(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorMilanoBaseContainerFragment.class, "46")) {
          return;
       }
       this.x.remove(p0);
       return;
    }
    public boolean i8(){
       return e.e(this);
    }
    public boolean j1(){
       return this.G.c.j;
    }
    public void jg(boolean p0){
       if (PatchProxy.isSupport(VisitorMilanoBaseContainerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VisitorMilanoBaseContainerFragment.class, "56")) {
          return;
       }
       this.w.onNext(Boolean.valueOf(p0));
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
    public void nh(m p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VisitorMilanoBaseContainerFragment.class, "5")) {
          return;
       }
       p0.b = this;
       l0 ol0 = new l0();
       p0.c = ol0;
       ol0.W1 = new b();
       p0 = p0.c;
       p0.v = p1;
       p0.q2 = k.a(this);
       return;
    }
    public boolean o3(){
       Object obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.V != null) {
          return false;
       }
       this.zh();
       return true;
    }
    public void oh(){
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorMilanoBaseContainerFragment.class, "22")) {
          return;
       }
       super.onConfigurationChanged(p0);
       boolean b = (p0.orientation == 2)? true: false;
       Iterator iterator = this.x.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(Boolean.valueOf(b));
       }
       return;
    }
    public void onCreate(Bundle p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorMilanoBaseContainerFragment.class, str)) {
          return;
       }
       super.onCreate(p0);
       if (SlideDispatchHelper.e()) {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          a obj = PatchProxy.apply(null, null, SlideDispatchHelper.class, "18");
          if (obj != patchProxyRe) {
          }else {
             obj = DispatchStrategyUtil.e();
             DispatchLogger.d.j("DispatchStrategyUtil", "createSlideDispatcher, "+obj);
             s a = s.a;
             Objects.requireNonNull(a);
             Object obj1 = PatchProxy.applyOneRefs(obj, a, s.class, str);
             if (obj1 != patchProxyRe) {
                obj = obj1;
             }else {
                a.p(obj, "config");
                obj = new SlideTaskDispatcher(obj, null);
             }
          }
          this.D = obj;
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, VisitorMilanoBaseContainerFragment.class, "29")) {
          return;
       }
       super.onDestroy();
       NasaFeatureGuideManager.f().p();
       VisitorMilanoBaseContainerFragment tD = this.D;
       if (tD != null) {
          tD.l();
          this.D = null;
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, VisitorMilanoBaseContainerFragment.class, "13")) {
          return;
       }
       super.onDestroyView();
       VisitorModeManager.h(this.W);
       boolean b = false;
       SlidePlayDegradeApi.setNeedDegrade(b);
       VisitorMilanoBaseContainerFragment tQ = this.Q;
       if (tQ != null) {
          this.R.removeCallbacks(tQ);
       }
       tQ = this.S;
       if (tQ != null) {
          VisitorMilanoBaseContainerFragment tP = this.P;
          if (tP != null) {
             tP.j(tQ);
          }
       }
       tQ = this.C;
       if (tQ != null) {
          tQ.t1().f();
       }
       tQ = this.F;
       if (tQ != null) {
          this.O = b;
          tQ.destroy();
       }
       VisitorMilanoBaseContainerFragment tM = this.M;
       if (tM != null && !tM.isDisposed()) {
          this.M.dispose();
       }
       tM = this.N;
       if (tM != null && !tM.isDisposed()) {
          this.N.dispose();
       }
       tM = this.H;
       if (tM != null) {
          tM.a();
       }
       tM = this.G;
       if (tM != null) {
          m c = tM.c;
          if (c != null) {
             c.clear();
          }
       }
       b.o0(this).r0();
       tM = this.s;
       if (tM != null) {
          tM.d();
       }
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport(VisitorMilanoBaseContainerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VisitorMilanoBaseContainerFragment.class, "21")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       if (p0) {
          MultiWindowLayoutUtil.a(this.getView(), new g(this));
       }else {
          Iterator iterator = this.y.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(false, n.A(this.getContext()));
          }
          MultiWindowLayoutUtil.d(this.getView());
       }
       return;
    }
    public void onRefresh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VisitorMilanoBaseContainerFragment.class, "32")) {
          return;
       }
       if (this.V != null) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, VisitorMilanoBaseContainerFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          obj.booleanValue();
       }else if(this.V != null){
          this.zh();
       }
       return;
    }
    public SlidePlayViewModel p0(){
       return this.C;
    }
    public boolean p3(){
       return a.a(this);
    }
    public void p8(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorMilanoBaseContainerFragment.class, "48")) {
          return;
       }
       this.z.remove(p0);
       return;
    }
    public void ph(){
       if (PatchProxy.applyVoid(null, this, VisitorMilanoBaseContainerFragment.class, "8")) {
          return;
       }
       if (this.O != null && this.F.R1()) {
          this.O = false;
          Object[] objArray = new Object[]{this,this.G};
          this.F.i(objArray);
       }
       return;
    }
    public i q(){
       Object obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.X0();
    }
    public boolean q3(){
       Object obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.C.X0() instanceof n0) {
          return this.C.X0().D1();
       }
       return false;
    }
    public void q9(d p0){
    }
    public abstract m qh();
    public int r(){
       return e.a(this);
    }
    public boolean r4(){
       if (this.V != null) {
          return false;
       }
       return this.zh();
    }
    public abstract g rh();
    public d s8(){
       return j.b(this);
    }
    public abstract e sh();
    public abstract a th();
    public boolean u0(boolean p0){
       return e.c(this, p0);
    }
    public void ub(z p0){
    }
    public abstract NasaBizParam uh();
    public abstract PhotoDetailParam vh();
    public void w0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorMilanoBaseContainerFragment.class, "54")) {
          return;
       }
       this.G.c.R.B(p0);
       return;
    }
    public abstract int wh();
    public void xb(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorMilanoBaseContainerFragment.class, "45")) {
          return;
       }
       this.x.add(p0);
       return;
    }
    public BaseFragment xh(){
       Object[] objArray = null;
       VisitorMilanoBaseContainerFragment obj = PatchProxy.apply(objArray, this, VisitorMilanoBaseContainerFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.C;
       Object[] objArray1 = (obj == null)? objArray: obj.t();
       if (objArray1 instanceof GrootBaseFragment) {
          objArray = objArray1;
       }
       return objArray;
    }
    public boolean yf(){
       return false;
    }
    public void yh(Intent p0){
    }
    public d z5(){
       return j.c(this);
    }
    public c z6(){
       return this.G.c.f;
    }
    public boolean zh(){
       VisitorMilanoBaseContainerFragment obj = PatchProxy.apply(null, this, VisitorMilanoBaseContainerFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.V != null) {
          return false;
       }
       if ((SystemClock.elapsedRealtime() - this.L) - 1000 > 0) {
          this.L = SystemClock.elapsedRealtime();
          obj = this.G;
          if (obj != null) {
             obj.d.onNext(new s(2));
          }
       }
       return true;
    }
}
