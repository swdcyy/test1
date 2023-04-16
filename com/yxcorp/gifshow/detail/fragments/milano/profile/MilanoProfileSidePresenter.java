package com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter;
import qvb.q;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.graphics.Rect;
import z0a.s0;
import z0a.m0;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter$a;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter$b;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter$c;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter$d;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.viewpager.widget.ViewPager$i;
import hf5.h;
import jta.c;
import rf5.u;
import android.content.Context;
import android.view.ViewConfiguration;
import c95.c;
import android.view.View;
import com.yxcorp.utility.n;
import ge5.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import ub6.b;
import brd.t;
import t45.d;
import brd.z;
import z0a.n0;
import erd.g;
import crd.b;
import bf5.q;
import ef5.a;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import z0a.j0;
import java.lang.Runnable;
import z0a.o0;
import io.reactivex.internal.functions.Functions;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import z0a.r0;
import z0a.q0;
import z0a.p0;
import com.yxcorp.gifshow.detail.fragments.milano.profile.n;
import android.view.View$OnClickListener;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.View$OnLayoutChangeListener;
import ekd.k1;
import java.lang.Throwable;
import java.lang.Boolean;
import java.util.List;
import com.yxcorp.gifshow.detail.fragments.milano.profile.f;
import z0a.t0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import android.view.ViewGroup;
import java.lang.Integer;
import java.lang.Float;
import brd.y;
import tkd.b;
import tkd.d;
import nl9.h0;
import android.view.ViewGroup$LayoutParams;
import le5.f;
import java.lang.StringBuilder;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import com.kwai.sdk.switchconfig.a;
import android.view.ViewGroup$MarginLayoutParams;
import z0a.l0;
import hn5.i0;
import uo5.a;
import ro5.a;
import lnc.d2;
import wkd.b;
import ip.c;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import ip.a;
import o56.a;
import ekd.p0;
import java.util.Objects;
import fx6.b;
import gx6.c;
import java.lang.CharSequence;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter$i;
import p1a.a$a;
import im8.f;
import gkc.b;
import lnc.i3;
import android.os.SystemClock;
import java.lang.Long;
import com.yxcorp.utility.Log;
import k2b.e0;
import k2b.u1;
import i0a.d;
import ekd.m1;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter$h;
import nw6.f;
import pw6.a;
import cw6.b;
import lw6.a;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter$f;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter$g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ef5.c;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import uw9.u3;
import bf5.p;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import g9c.a;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import qvb.p;
import z0a.h0;
import android.view.animation.Interpolator;
import com.kwai.library.slide.base.pagelist.a;
import qvb.i;
import f6a.c;
import qvb.n0;
import uw9.v3;
import uw9.l0;
import z0a.m;
import a9a.c;
import me5.a$a;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter$j;
import z0a.s;
import z0a.g0;
import java.util.ArrayList;
import yw6.g;
import z0a.k0;
import com.yxcorp.gifshow.detail.fragments.milano.profile.m;
import java.lang.Math;

public class MilanoProfileSidePresenter extends PresenterV2 implements q, DefaultLifecycleObserver	// class@001540
{
    public View A;
    public ViewGroup B;
    public QPhoto C;
    public BaseFragment D;
    public c E;
    public f F;
    public u G;
    public PhotoDetailParam H;
    public boolean I;
    public f J;
    public f K;
    public f L;
    public u3 M;
    public MilanoContainerEventBus N;
    public q O;
    public SlidePlayViewModel P;
    public boolean Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public c U0;
    public int V;
    public h V0;
    public int W;
    public boolean W0;
    public boolean X;
    public boolean X0;
    public boolean Y;
    public String Y0;
    public boolean Z;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public boolean c1;
    public QPhoto d1;
    public int e1;
    public final Rect f1;
    public f g1;
    public l h1;
    public m i1;
    public GifshowActivity j1;
    public final Runnable k1;
    public final MilanoProfileSidePresenter$j l1;
    public final View$OnLayoutChangeListener m1;
    public final ViewPager$i n1;
    public final c o1;
    public d p;
    public final b p1;
    public View q;
    public RecyclerView$r q1;
    public View r;
    public View s;
    public View t;
    public View u;
    public View v;
    public View w;
    public View x;
    public View y;
    public CustomRecyclerView z;
    public static final int r1;
    public static final int s1;
    public static final int t1;
    public static final int u1;
    public static AccelerateDecelerateInterpolator v1;

    static {
       MilanoProfileSidePresenter.r1 = a1.d(0x7f070ec3);
       int i = a1.d(R.dimen.arg_RES_7f070a83);
       MilanoProfileSidePresenter.s1 = i;
       MilanoProfileSidePresenter.t1 = i;
       MilanoProfileSidePresenter.u1 = a1.d(0x7f070ec1) + i;
       MilanoProfileSidePresenter.v1 = new AccelerateDecelerateInterpolator();
    }
    public void MilanoProfileSidePresenter(){
       super();
       this.Q = true;
       this.R = 0x3f800000;
       this.f1 = new Rect();
       this.k1 = new s0(this);
       this.l1 = new m0(this);
       this.m1 = new MilanoProfileSidePresenter$a(this);
       this.n1 = new MilanoProfileSidePresenter$b(this);
       this.o1 = new MilanoProfileSidePresenter$c(this);
       this.p1 = new MilanoProfileSidePresenter$d(this);
       this.q1 = new MilanoProfileSidePresenter$e(this);
    }
    public void E8(){
       MilanoProfileSidePresenter milanoProfil = MilanoProfileSidePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, milanoProfil, "11")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       o.C().w("MilanoProfileSideP", "onBind", objArray1);
       this.P = SlidePlayViewModel.B0(this.D);
       this.V0.b(this.n1, true);
       this.G.j(this.o1);
       this.G.D(ViewConfiguration.get(this.getContext()).getScaledTouchSlop());
       this.P.C1(this);
       if (!PatchProxy.applyVoid(objArray, this, milanoProfil, "10") && this.E.q != null) {
          View[] viewArray = new View[true];
          viewArray[0] = this.r;
          n.Z(8, viewArray);
       }
       milanoProfil = this.p;
       if (milanoProfil != null) {
          this.h1 = milanoProfil.e;
          this.i1 = milanoProfil.d;
       }
       this.X = true;
       this.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new n0(this)));
       this.U = true;
       milanoProfil = this.O;
       this.V = milanoProfil.e;
       this.W = milanoProfil.f;
       this.U0.a(this.p1);
       this.P.A(this.z);
       this.z.addOnScrollListener(this.q1);
       milanoProfil = this.A;
       float f = 0x3f800000;
       if (milanoProfil == null) {
          this.R = f;
       }else if(!milanoProfil.getTranslationX() - null){
          f = 0;
       }
       this.R = f;
       if (this.y.getHeight()) {
          this.x9();
          this.W8(this.R);
          this.l9();
          this.k9();
       }else {
          this.y.post(new j0(this));
       }
       g e = Functions.e;
       this.X7(this.O.D.subscribe(new o0(this), e));
       this.X7(this.N.A.subscribe(new r0(this), e));
       this.X7(this.O.A.subscribe(new q0(this), e));
       this.X7(this.N.y.subscribe(new p0(this), e));
       this.r.setOnClickListener(n.b);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, MilanoProfileSidePresenter.class, "5")) {
          return;
       }
       this.y = this.getActivity().findViewById(0x1020002);
       GifshowActivity activity = this.getActivity();
       this.j1 = activity;
       activity.getLifecycle().addObserver(this);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, MilanoProfileSidePresenter.class, "13")) {
          return;
       }
       MilanoProfileSidePresenter tj1 = this.j1;
       if (tj1 != null) {
          tj1.getLifecycle().removeObserver(this);
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MilanoProfileSidePresenter.class, "12")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       o.C().w("MilanoProfileSideP", "onUnbind", objArray1);
       this.c1 = i;
       this.V0.g(this.n1);
       this.G.B(this.o1);
       this.z.removeOnScrollListener(this.q1);
       this.P.X1(this);
       this.X = i;
       this.Y = i;
       MilanoProfileSidePresenter tz = this.z;
       if (tz == null) {
          return;
       }
       MilanoProfileSidePresenter tP = this.P;
       if (tP != null) {
          tP.K(tz);
       }
       if (this.z == null) {
          return;
       }else {
          tz = this.P;
          if (tz != null) {
             tz.X1(this);
          }
          if (!this.a9() && this.z.getAdapter() != null) {
             this.z.setAdapter(objArray);
          }
          tz = this.y;
          if (tz != null) {
             tz.removeOnLayoutChangeListener(this.m1);
          }
          k1.m(this.k1);
          return;
       }
    }
    public void M1(boolean p0,Throwable p1){
       MilanoProfileSidePresenter milanoProfil = MilanoProfileSidePresenter.class;
       if (PatchProxy.isSupport(milanoProfil) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, milanoProfil, "29")) {
          return;
       }
       if (p0) {
          this.Y = true;
       }
       this.Z = false;
       if (p0 && !this.c9()) {
          if (!this.P.F0().isEmpty() && this.g1.a1()) {
             this.y.post(new t0(this));
          }
          this.U = false;
          this.P.A1(null, false);
       }
       return;
    }
    public ClientContent$UserPackage P8(User p0){
       ClientContent$UserPackage obj = PatchProxy.applyOneRefs(p0, this, MilanoProfileSidePresenter.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$UserPackage();
       obj.identity = TextUtils.k(p0.getId());
       return obj;
    }
    public final int R8(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MilanoProfileSidePresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return 0;
       }
       return (p0.getTop() - (((((this.O.a - this.B.getHeight()) - this.O.e) - this.W) - (p0.getBottom() - p0.getTop())) / 2));
    }
    public final void S8(View p0,int p1){
       MilanoProfileSidePresenter milanoProfil = MilanoProfileSidePresenter.class;
       if (PatchProxy.isSupport(milanoProfil) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, milanoProfil, "23")) {
          return;
       }
       if (p0 != null && p0.getVisibility() != p1) {
          p0.setVisibility(p1);
       }
       return;
    }
    public void V8(){
       float f;
       if (PatchProxy.applyVoid(null, this, MilanoProfileSidePresenter.class, "17")) {
          return;
       }
       if (this.S != null) {
          this.W8(this.R);
          this.O.n.onNext(Float.valueOf(this.R));
       }else if(this.P.C()){
          f = 0x3f800000;
       }else {
          f = 0;
       }
       this.W8(f);
       this.O.n.onNext(Float.valueOf(f));
       return;
    }
    public void W8(float p0){
       int i2;
       int i3;
       MilanoProfileSidePresenter d;
       Object obj = this;
       float f = p0;
       MilanoProfileSidePresenter milanoProfil = MilanoProfileSidePresenter.class;
       if (PatchProxy.isSupport(milanoProfil) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), obj, milanoProfil, "18")) {
          return;
       }
       boolean t1 = MilanoProfileSidePresenter.t1;
       float f1 = 0x3f800000 - f;
       float f2 = (float)t1 * f1;
       float f3 = (float)obj.V * f1;
       float f4 = (float)MilanoProfileSidePresenter.r1 * f1;
       float f5 = (float)obj.W * f1;
       boolean i = 0;
       int i1 = (!(v5 = f - 0x3f800000))? 8: 0;
       obj.S8(obj.u, i1);
       obj.S8(obj.v, i1);
       obj.S8(obj.w, i1);
       obj.S8(obj.x, i1);
       obj.o9(obj.q, (int)f2, -1);
       obj.q9(obj.r, f, (int)f3);
       obj.o9(obj.s, (int)f4, i);
       obj.q9(obj.t, f, (int)f5);
       if (PatchProxy.isSupport(milanoProfil) && (PatchProxy.applyVoidOneRefs(Float.valueOf(p0), obj, milanoProfil, "21") || d.a(-536296199).Q4())) {
       label_0254 :
          i2 = v5;
          i3 = 0;
       }else {
          ViewGroup$LayoutParams layoutParams = obj.P.W0();
          if (obj.P.s1() || layoutParams == null) {
             goto label_0254 ;
          }else {
             MilanoProfileSidePresenter o = obj.O;
             int i4 = o.a - o.g;
             q c = o.c;
             f4 = (float)c;
             int i5 = (int)(f4 + ((float)(i4 - c) * f));
             if (f.o()) {
                f4 = (float)i5 / (float)i4;
                MilanoProfileSidePresenter o1 = obj.O;
                o1.h = f4;
                o1.F.onNext(Float.valueOf(f4));
             }
             Object[] objArray = new Object[i];
             o.C().w("MilanoProfileSideP", "reSizeViewPager: height "+i5+", mMinHeight "+obj.O.c+", mScreenHeight "+obj.O.a+", mContainerMarginBottom "+obj.O.g+", progress "+f, objArray);
             layoutParams.height = i5;
             VerticalViewPager verticalView = obj.P.s2();
             if (verticalView instanceof KwaiGrootViewPager && !a.t().d("disableKwaiGrootViewPagerMaxHeight", i)) {
                verticalView.setMaxHeight(i5);
             }
             if (obj.E.t != null) {
                layoutParams.topMargin = (int)((float)obj.V * f1);
                i2 = v5;
                Object[] objArray1 = new Object[0];
                o.C().w("MilanoProfileSideP", "reSizeViewPager: topMargin "+layoutParams.topMargin+", mTopCoverHeight "+obj.V+", progress "+f, objArray1);
                layoutParams.leftMargin = (int)((float)t1 * f1);
                objArray1 = new Object[0];
                o.C().w("MilanoProfileSideP", "reSizeViewPager: leftMargin "+layoutParams.leftMargin+", progress "+f, objArray1);
             }else {
                i2 = v5;
                i3 = 0;
             }
             if (verticalView != null) {
                verticalView.requestLayout();
                verticalView.post(new l0(obj, verticalView));
             }
             milanoProfil = obj.O;
             q b = milanoProfil.b;
             if (b != null && (milanoProfil.a != null && ((float)i4 / (float)b) - 0x40200000 > 0)) {
                i0.b("MilanoProfileSidePresenter", "reSizeViewPager: mScreenHeight "+obj.O.a+", mScreenWidth "+obj.O.b+", mMinHeight "+obj.O.c+", mMinWidth "+obj.O.d+", isNasaStyle "+obj.E.t+", mRootContentView height "+obj.y.getHeight()+", mRootContentView width "+obj.y.getWidth()+", getScreenShortAxis "+this.Y8()+", getScreenLongAxis "+this.X8()+", mTopCoverHeight "+obj.V+", mBottomCoverHeight "+obj.W+", progress "+f+", height "+i5);
             }
          }
       }
       Activity activity = this.getActivity();
       t1 = (!i2)? true: false;
       a.c(activity, t1, 7);
       d = obj.D;
       i = (!i2)? true: false;
       a.o(d, i, 3);
       obj.O.k.onNext(Float.valueOf(obj.R));
       return;
    }
    public final int X8(){
       Object obj = PatchProxy.apply(null, this, MilanoProfileSidePresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (d2.g()) {
          return d2.e();
       }
       return a1.g();
    }
    public final int Y8(){
       Object obj = PatchProxy.apply(null, this, MilanoProfileSidePresenter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (d2.g()) {
          return d2.f();
       }
       return a1.h();
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(MilanoProfileSidePresenter.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, MilanoProfileSidePresenter.class, "27")) {
          return;
       }
       if (this.P.E0() <= 1) {
          this.P.s(false);
       }
       return;
    }
    public final String Z8(QPhoto p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MilanoProfileSidePresenter milanoProfil = MilanoProfileSidePresenter.class;
       String obj = PatchProxy.applyOneRefs(p0, this, milanoProfil, "45");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       if (p0 == null) {
          return obj;
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, this, milanoProfil, "46");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): b.a(0x188c3889).a(p0.getAdvertisement());
       if (b) {
          Object obj2 = PatchProxy.applyOneRefs(p0, this, milanoProfil, "47");
          if (obj2 != patchProxyRe) {
             obj = obj2;
          }else {
             a uoa = b.a(0x188c3889).d(p0.getAdvertisement());
             if (uoa != null && uoa.getSidePhoto() != null) {
                obj = uoa.getSidePhoto().getUserId();
             }
          }
          return obj;
       }else {
          return p0.getUserId();
       }
    }
    public boolean a9(){
       return this.E.g;
    }
    public boolean b9(){
       Object obj = PatchProxy.apply(null, this, MilanoProfileSidePresenter.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.U != null && p0.C(a.B))? true: false;
       return b;
    }
    public boolean c9(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, MilanoProfileSidePresenter.class, "44");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.Z8(this.C);
       MilanoProfileSidePresenter tP = this.P;
       Objects.requireNonNull(tP);
       Object obj1 = PatchProxy.apply(objArray, tP, SlidePlayViewModel.class, "159");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          b uob = tP.Q0("kwai_data_source_service");
          if (uob != null && uob.i() != null) {
             objArray = uob.i().getPhoto();
          }
       }
       return (TextUtils.n(obj, this.Z8(objArray)) ^ 0x01);
    }
    public final void d9(User p0){
       Object[] this;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoProfileSidePresenter.class, "43")) {
          return;
       }
       MilanoProfileSidePresenter$i oi = new MilanoProfileSidePresenter$i(this, 6, 1586, "close_feed_model", p0);
       v0.r(true);
       if (this.L.get() != null) {
          b uob = this.L.get();
          Objects.requireNonNull(uob);
          this = null;
          str = PatchProxy.apply(this, uob, b.class, "4");
          if (str != PatchProxyResult.class) {
          }else {
             i3 oi3 = i3.f();
             oi3.d("first_llsid", uob.a);
             oi3.d("first_photo_id", uob.b);
             oi3.c("feed_mode_duration", Long.valueOf((SystemClock.elapsedRealtime() - uob.c)));
             str = oi3.e();
          }
          v0.m(str);
          uob = this.L.get();
          uob.a = this;
          uob.b = this;
          long l = 0;
          uob.c = l;
          uob.d = l;
          uob.e = l;
       }
       MilanoProfileSidePresenter tP = this.P;
       QPhoto currentPhoto = this.P.getCurrentPhoto();
       StringBuilder str1 = "logProfileFeedClosed\(\) mCurrentPhotoId="+this.C.getPhotoId()+" itemViewType="+tP.G0(tP.j())+" vmPhotoId=";
       String str2 = (currentPhoto == null)? "null": currentPhoto.getPhotoId();
       str = "MilanoProfileSideP";
       Log.g(str, str1+str2);
       if (!this.P.t() instanceof e0) {
          u1.Q("MilanoProfileSideCrash", "logProfileFeedClosed\(\) mSlidePlayViewModel.getCurrentFragment instance of ILogPage. PhotoId="+this.C.getPhotoId());
          Log.d(str, "logProfileFeedClosed\(\) mSlidePlayViewModel.getCurrentFragment instance of ILogPage. PhotoId="+this.C.getPhotoId());
       }else {
          d.a(this.P.t(), this.C, v0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoProfileSidePresenter.class, "2")) {
          return;
       }
       this.z = m1.f(p0, 0x7f0a32a9);
       this.A = m1.f(p0, 0x7f0a32a8);
       this.B = m1.f(p0, 0x7f0a327e);
       this.q = m1.f(p0, 0x7f0a39b4);
       this.r = m1.f(p0, 0x7f0a3a39);
       this.s = m1.f(p0, 0x7f0a3a2f);
       this.t = m1.f(p0, 0x7f0a39a8);
       this.u = m1.f(p0, 0x7f0a39b5);
       this.v = m1.f(p0, 0x7f0a39b3);
       this.w = m1.f(p0, 0x7f0a3a30);
       this.x = m1.f(p0, 0x7f0a3a2d);
       return;
    }
    public final void e9(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoProfileSidePresenter.class, "42")) {
          return;
       }
       if (this.L.get() != null) {
          b uob = this.L.get();
          MilanoProfileSidePresenter tC = this.C;
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoidOneRefs(tC, uob, b.class, "1")) {
             uob.a = tC.getListLoadSequenceID();
             uob.b = tC.getPhotoId();
             uob.c = SystemClock.elapsedRealtime();
          }
       }
       String str = "MilanoProfileSideP";
       if (!this.P.t() instanceof e0) {
          u1.Q("MilanoProfileSideCrash", "logProfileFeedOpened\(\) mSlidePlayViewModel.getCurrentFragment instance of ILogPage. PhotoId="+this.C.getPhotoId());
          Log.d(str, "logProfileFeedOpened\(\) mSlidePlayViewModel.getCurrentFragment instance of ILogPage. PhotoId="+this.C.getPhotoId());
          return;
       }else {
          Log.g(str, "logProfileFeedOpened\(\) mCurrentPhotoId="+this.C.getPhotoId());
          MilanoProfileSidePresenter$h oh = new MilanoProfileSidePresenter$h(this, 6, 1585, "open_feed_model", p0);
          v8.r(true);
          d.a(this.P.t(), this.C, v8);
          return;
       }
    }
    public final void h9(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoProfileSidePresenter.class, "41")) {
          return;
       }
       if (!this.P.t() instanceof e0) {
          u1.Q("MilanoProfileSideCrash", "logShowProfileFeedUserInfo\(\)  mSlidePlayViewModel.getCurrentFragment instance of ILogPage. PhotoId="+this.C.getPhotoId());
          Log.d("MilanoProfileSideP", "logShowProfileFeedUserInfo\(\) mSlidePlayViewModel.getCurrentFragment instance of ILogPage. PhotoId="+this.C.getPhotoId());
          int i = this.P.j();
          MilanoProfileSidePresenter tP = this.P;
          Objects.requireNonNull(tP);
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
          if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyOneRefs(Integer.valueOf(i), tP, slidePlayVie, "99") != PatchProxyResult.class) {
          }else {
             f uof = tP.Q0("view_item_service");
             if (uof != null) {
                a uoa = uof.b.C(i);
                uof.c(uoa, "getCurrentViewItem, position = "+i);
                if (uoa != null) {
                   uof.c(uoa, "getFragment, position = "+i);
                   uoa.a();
                }else {
                   a.b("ViewItemService", "getFragment == null");
                }
             }
          }
          return;
       }else if(this.E.t != null){
          i3 oi3 = i3.f();
          oi3.a("is_live", Boolean.valueOf(this.X0));
          oi3.d("head_position", "BOTTOM_BAR");
          String str = oi3.e();
          e0 uoe0 = this.P.t();
          View view = this.m8();
          MilanoProfileSidePresenter tC = this.C;
          String str1 = (this.X0 != null)? "live": "not_live";
          MilanoProfileSidePresenter$f uof1 = new MilanoProfileSidePresenter$f(this, 0, 319, str1, p0);
          v11.m(str);
          v11.r(true);
          d.b(uoe0, view, tC, v11);
       }else {
          MilanoProfileSidePresenter$g og = new MilanoProfileSidePresenter$g(this, 0, 319, "show_author_avatar", p0);
          v10.r(true);
          d.b(this.P.t(), this.m8(), this.C, v10);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MilanoProfileSidePresenter.class, "1")) {
          return;
       }
       this.D = this.r8("FRAGMENT");
       this.E = this.q8(c.class);
       this.U0 = this.r8("MILANO_ATTACH_LISTENER");
       this.V0 = this.r8("MILANO_SLIDE_PLAY_VM_PROTOCOL");
       this.F = this.x8("SLIDE_PLAY_ORIGIN_INDEX_IN_FEED");
       this.H = this.s8(PhotoDetailParam.class);
       this.J = this.x8("FEED_KS_ORDER_ID");
       this.K = this.x8("PROFILE_KS_ORDER_ID");
       this.G = this.q8(u.class);
       this.L = this.x8("PHOTO_FEED_SIDE_MODE_STAY_DURATION");
       this.M = this.q8(u3.class);
       this.p = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       this.N = this.q8(MilanoContainerEventBus.class);
       this.O = this.q8(q.class);
       return;
    }
    public final void j9(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MilanoProfileSidePresenter.class, "22")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("MilanoProfileSideP", "logViewSize "+p1+": "+p0+", h "+p0.getMeasuredHeight()+", w "+p0.getMeasuredWidth()+", paddingLeft "+p0.getPaddingLeft()+", paddingRight "+p0.getPaddingRight()+", paddingTop "+p0.getPaddingTop()+", paddingBottom "+p0.getPaddingBottom(), objArray);
       ViewGroup$LayoutParams layoutParams = (p0 instanceof KwaiGrootViewPager)? p0.getLayoutParamsWithoutLog(): p0.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          Object[] objArray1 = new Object[0];
          o.C().w("MilanoProfileSideP", "logViewSize "+p1+": marginLeft "+layoutParams.leftMargin+", marginRight "+layoutParams.rightMargin+", marginTop "+layoutParams.topMargin+", marginBottom "+layoutParams.bottomMargin, objArray1);
       }
       return;
    }
    public final void k9(){
       if (PatchProxy.applyVoid(null, this, MilanoProfileSidePresenter.class, "15")) {
          return;
       }
       if (this.T == null) {
          this.T = true;
          this.y.addOnLayoutChangeListener(this.m1);
       }
       return;
    }
    public void l9(){
       if (PatchProxy.applyVoid(null, this, MilanoProfileSidePresenter.class, "6")) {
          return;
       }
       MilanoProfileSidePresenter tO = this.O;
       if (tO.b != null && (tO.a != null && this.c1 == null)) {
          tO.q.onNext(Boolean.TRUE);
          this.c1 = true;
       }
    label_0024 :
       return;
    }
    public void m9(){
       MilanoProfileSidePresenter milanoProfil = MilanoProfileSidePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, milanoProfil, "33")) {
          return;
       }
       if (this.g1 == null) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, milanoProfil, "34")) {
          MilanoContainerEventBus z = this.N.z;
          if (z != null) {
             boolean b = (z.b() == 4)? true: false;
             this.W0 = b;
          }
       }
       this.g1.W0(this.P.F0());
       milanoProfil = this.g1;
       if (this.W0 != null) {
          objArray = this.C;
       }
       milanoProfil.g1(objArray);
       this.g1.k0();
       return;
    }
    public void n9(){
       MilanoProfileSidePresenter milanoProfil = MilanoProfileSidePresenter.class;
       if (PatchProxy.applyVoid(null, this, milanoProfil, "38")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, milanoProfil, "39")) {
          LinearLayoutManager layoutManage1 = this.z.getLayoutManager();
          if (layoutManage1 != null) {
             int i = layoutManage1.i0();
             RecyclerView$ViewHolder viewHolder = this.z.findViewHolderForLayoutPosition(i);
             if (viewHolder != null) {
                this.d1 = this.g1.N0(i);
                this.z.getDecoratedBoundsWithMargins(viewHolder.itemView, this.f1);
                this.e1 = this.f1.top;
             }
          }
       }
       this.g1.k0();
       if (!PatchProxy.applyVoid(null, this, milanoProfil, "40") && this.d1 != null) {
          LinearLayoutManager layoutManage = this.z.getLayoutManager();
          if (layoutManage != null) {
             layoutManage.scrollToPositionWithOffset(this.g1.Z0(this.d1), this.e1);
             this.d1 = null;
          }
       }
       return;
    }
    public final void o9(View p0,int p1,int p2){
       if (PatchProxy.isSupport(MilanoProfileSidePresenter.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, MilanoProfileSidePresenter.class, "19")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (p1 >= 0) {
          layoutParams.width = p1;
       }
       if (p2 >= 0) {
          layoutParams.height = p2;
       }
       p0.setLayoutParams(layoutParams);
       return;
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoProfileSidePresenter.class, "31")) {
          return;
       }
       if (this.S != null && this.P.r()) {
          MilanoProfileSidePresenter tL = this.L;
          if (tL != null && tL.get() != null) {
             b uob = this.L.get();
             Objects.requireNonNull(uob);
             if (!PatchProxy.applyVoid(null, uob, b.class, "3")) {
                uob.e = SystemClock.elapsedRealtime();
             }
          }
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoProfileSidePresenter.class, "30")) {
          return;
       }
       if (this.S != null && (this.P.r() && this.c9())) {
          this.u9();
       }
    label_0020 :
       if (this.S != null && this.P.r()) {
          MilanoProfileSidePresenter tL = this.L;
          if (tL != null && tL.get() != null) {
             b uob = this.L.get();
             Objects.requireNonNull(uob);
             if (!PatchProxy.applyVoid(null, uob, b.class, "2")) {
                uob.d = uob.d + (SystemClock.elapsedRealtime() - uob.e);
             }
          }
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
    public final void q9(View p0,float p1,int p2){
       MilanoProfileSidePresenter tO;
       q d;
       int i;
       if (PatchProxy.isSupport(MilanoProfileSidePresenter.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Integer.valueOf(p2), this, MilanoProfileSidePresenter.class, "20")) {
          return;
       }
       if (f.o()) {
          tO = this.O;
          d = tO.d;
          int t1 = MilanoProfileSidePresenter.t1;
          i = (int)((float)(d + t1) + ((float)(tO.b - (d + t1)) * p1));
       }else {
          tO = this.O;
          d = tO.d;
          i = (int)((float)d + ((float)(tO.b - d) * p1));
       }
       this.o9(p0, i, p2);
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void s9(RecyclerView p0,LinearLayoutManager p1,int p2,boolean p3){
       int u1;
       int i1;
       if (PatchProxy.isSupport(MilanoProfileSidePresenter.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, MilanoProfileSidePresenter.class, "3")) {
          return;
       }
       if (p2 == -1) {
          return;
       }
       int i = 0;
       if (!p3) {
          int height = this.z.getHeight();
          u1 = MilanoProfileSidePresenter.u1;
          i1 = (height - u1) / 2;
          if (p2) {
             i = MilanoProfileSidePresenter.s1 + ((height % u1) / 2);
          }
          p1.scrollToPositionWithOffset(p2, (i1 - i));
          this.z.post(new h0(this));
          return;
       }else {
          View view = p1.findViewByPosition(p2);
          if (view != null) {
             p0.smoothScrollBy(i, this.R8(view), MilanoProfileSidePresenter.v1);
          }else {
             u1 = p1.i0();
             i1 = p1.c();
             if (p2 < u1) {
                p0.smoothScrollBy(i, (((- (u1 - p2)) * MilanoProfileSidePresenter.u1) + this.R8(p1.findViewByPosition(u1))), MilanoProfileSidePresenter.v1);
             }else if(p2 > i1){
                p0.smoothScrollBy(i, (((p2 - i1) * MilanoProfileSidePresenter.u1) + this.R8(p1.findViewByPosition(i1))), MilanoProfileSidePresenter.v1);
             }
          }
          return;
       }
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void t9(){
       MilanoProfileSidePresenter tg1;
       MilanoProfileSidePresenter milanoProfil = MilanoProfileSidePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, milanoProfil, "35")) {
          return;
       }
       Integer integer = null;
       if (!PatchProxy.applyVoid(objArray, this, milanoProfil, "37")) {
          tg1 = this.R;
          if (!tg1 - 0x3f800000) {
             this.J.set(this.C.getKsOrderId());
             this.K.set("");
          }else if(!tg1 - integer){
             this.J.set(this.C.getKsOrderId());
          }
       }
       if (!this.a9()) {
          if (!PatchProxy.applyVoid(objArray, this, milanoProfil, "36")) {
             milanoProfil = this.R;
             if (!milanoProfil - 0x3f800000) {
                this.M.c("SIDE_PANEL_OPEN_ID");
                this.P.Y1(this.C, 0, "MilanoProfileSideP");
                this.d9(this.C.getUser());
             }else if(!milanoProfil - integer){
                this.M.b("SIDE_PANEL_OPEN_ID", this.C.getPhotoId());
                this.P.Y1(this.C, 1, "MilanoProfileSideP");
                this.h9(this.C.getUser());
                this.e9(this.C.getUser());
             }
          }
          return;
       }else {
          a uoa = this.P.H0();
          MilanoProfileSidePresenter tR = this.R;
          if (!tR - 0x3f800000) {
             milanoProfil = this.P;
             if (milanoProfil.b2(milanoProfil.X0())) {
                this.M.c("SIDE_PANEL_OPEN_ID");
                this.P.Y1(this.C, 0, "MilanoProfileSideP");
                this.F.set(Integer.valueOf(-1));
                this.P.a2(-1, "MilanoProfileSideP");
                this.d9(this.C.getUser());
             }
          }else if(!tR - integer && (this.P.E0() > 0 && this.P.b2(uoa))){
             this.M.b("SIDE_PANEL_OPEN_ID", this.C.getPhotoId());
             int i = c.c(this.P, this.C);
             this.F.set(Integer.valueOf(i));
             this.P.a2(i, "MilanoProfileSideP");
             this.P.Y1(this.C, 1, "MilanoProfileSideP");
             this.h9(this.C.getUser());
             this.e9(this.C.getUser());
             tR = this.g1;
             if (tR == null) {
                return;
             }else if(!tR.a1() || !uoa.isLoading()){
                if (this.g1.a1()) {
                   this.m9();
                   milanoProfil = this.z;
                   tg1 = this.g1;
                   this.s9(milanoProfil, milanoProfil.getLayoutManager(), tg1.Z0(tg1.Y0()), 0);
                }else if(this.I != null){
                   this.I = false;
                   this.g1.W0(this.P.F0());
                   this.n9();
                }
             }
          }
          return;
       }
    }
    public void u9(){
       MilanoProfileSidePresenter h;
       int source;
       int b1;
       f uof = this;
       MilanoProfileSidePresenter milanoProfil = MilanoProfileSidePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uof, milanoProfil, "24")) {
          return;
       }
       if (!this.a9() && uof.g1 != null) {
          return;
       }
       if (uof.Z == null) {
          return;
       }
       v3 ov3 = uof.P.M0();
       int i = 0;
       l0 i2 = (ov3 instanceof l0)? ov3.I2: null;
       boolean b = true;
       if (i2 != null) {
          MilanoProfileSidePresenter p = uof.P;
          MilanoProfileSidePresenter q = uof.Q;
          h = uof.H;
          source = (h != null)? h.getSource(): 0;
          m om = new m(p, q, new c(source), (uof.E.m ^ 0x01), uof.l1);
          uof.g1 = i2;
       }else {
          MilanoProfileSidePresenter p1 = uof.P;
          MilanoProfileSidePresenter q1 = uof.Q;
          h = uof.H;
          source = (h != null)? h.getSource(): 0;
          s os = new s(p1, q1, new c(source), (uof.E.m ^ 0x01), uof.l1);
          uof.g1 = i2;
       }
       MilanoProfileSidePresenter g1 = uof.g1;
       g1.h1(uof.C);
       g1.f1(new g0(uof));
       uof.z.setAdapter(uof.g1);
       uof.P.A1(uof.C, b);
       if (this.a9()) {
          if (!PatchProxy.applyVoid(objArray, uof, milanoProfil, "25")) {
             uof.P.y0();
             if (uof.P.r1()) {
                if (!PatchProxy.applyVoid(objArray, uof, milanoProfil, "32")) {
                   b1 = this.b9();
                   uof.P.t0(uof.C, "ThanosProfileSidePresenter");
                   ArrayList uArrayList = new ArrayList();
                   while (true) {
                      if (b1) {
                         g1 = 20;
                      label_00d6 :
                         if (i < g1) {
                            uArrayList.add(uof.C);
                            i = i + 1;
                         }else {
                            milanoProfil = uof.g1;
                            Objects.requireNonNull(milanoProfil);
                            if (!PatchProxy.applyVoidOneRefs(uArrayList, milanoProfil, f.class, "5")) {
                               milanoProfil.W0(uArrayList);
                               milanoProfil.p = b;
                            }
                            uof.g1.k0();
                         }
                      }else {
                         g1 = 1;
                         goto label_00d6 ;
                      }
                   }
                }
             }else {
                this.m9();
                if (uof.P.F0().indexOf(uof.C)) {
                   milanoProfil = uof.z;
                   g1 = uof.g1;
                   uof.s9(milanoProfil, milanoProfil.getLayoutManager(), g1.Z0(g1.Y0()), i);
                }
             }
          }
          uof.P.B1();
       }else {
          uof.g1.e1(uof.P.J0());
          uof.g1.d1(uof.P.P0());
          uof.g1.W0(uof.P.K0());
          uof.g1.k0();
          b1 = uof.g1.Z0(uof.C);
          if (b1 > -1) {
             uof.z.post(new k0(uof, b1));
          }
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       MilanoProfileSidePresenter milanoProfil = MilanoProfileSidePresenter.class;
       if (PatchProxy.isSupport(milanoProfil) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, milanoProfil, "28")) {
          return;
       }
       boolean b = true;
       this.P.s(b);
       this.Y = false;
       if (this.z == null) {
          return;
       }
       this.U = b;
       if (p0 || !this.P.m1()) {
          this.z.post(new m(this, p0));
       }else {
          this.m9();
          this.t9();
       }
       return;
    }
    public void x9(){
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, MilanoProfileSidePresenter.class, "7")) {
          return;
       }
       MilanoProfileSidePresenter tO = this.O;
       int width = (this.y.getWidth())? this.y.getWidth(): this.Y8();
       tO.b = width;
       if (f.o()) {
          tO = this.O;
          tO.d = (tO.b - MilanoProfileSidePresenter.r1) - MilanoProfileSidePresenter.t1;
       }else {
          tO = this.O;
          tO.d = tO.b - MilanoProfileSidePresenter.r1;
       }
       tO = this.O;
       width = (this.y.getHeight())? this.y.getHeight(): this.X8();
       tO.a = width;
       String str = "updateScreenHeight: mScreenHeight ";
       int i = 0;
       Object[] objArray = new Object[i];
       o.C().w("MilanoProfileSideP", str+this.O.a+", mRootContentView height "+this.y.getHeight()+", mScreenWidth "+this.O.b+", mRootContentView width "+this.y.getWidth(), objArray);
       String str1 = ", mBottomCoverHeight ";
       if (f.o()) {
          tO = this.O;
          tO.c = (int)((float)tO.d * ((float)(tO.a - tO.g) / (float)tO.b));
          objArray1 = new Object[i];
          o.C().w("MilanoProfileSideP", "mMinHeight "+this.O.c+", mBottomCoverHeight"+this.W, objArray1);
       }else if(this.E.t != null){
          tO = this.O;
          tO.c = (tO.a - this.V) - this.W;
          objArray1 = new Object[i];
          o.C().w("MilanoProfileSideP", "updateScreenHeight: isNasaStyle, mMinHeight "+this.O.c+", mTopCoverHeight "+this.V+str1+this.W, objArray1);
       }else {
          tO = this.O;
          MilanoProfileSidePresenter tV = this.V;
          MilanoProfileSidePresenter tW = this.W;
          tO.c = ((tO.a - tV) - tW) + Math.abs((tV - tW));
          objArray1 = new Object[i];
          o.C().w("MilanoProfileSideP", "updateScreenHeight: mMinHeight "+this.O.c+", mTopCoverHeight "+this.V+str1+this.W, objArray1);
       }
       tO = this.O;
       q b = tO.b;
       if (b != null) {
          q a = tO.a;
          if (a != null && ((float)a / (float)b) - 0x40200000 > 0) {
             i0.b("MilanoProfileSidePresenter", str+this.O.a+", mScreenWidth "+this.O.b+", mMinHeight "+this.O.c+", mMinWidth "+this.O.d+", isNasaStyle "+this.E.t+", mRootContentView height "+this.y.getHeight()+", mRootContentView width "+this.y.getWidth()+", getScreenShortAxis "+this.Y8()+", getScreenLongAxis "+this.X8()+", mTopCoverHeight "+this.V+str1+this.W);
          }
       }
       return;
    }
}
