package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter;
import qvb.q;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import r7a.i;
import lnc.a1;
import ekd.i;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.res.Resources;
import android.app.Application;
import cw9.c;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter$b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter$c;
import android.graphics.Rect;
import ge5.d;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.l;
import android.view.View$OnClickListener;
import android.view.View;
import vy6.a;
import uw9.o;
import q87.c;
import android.app.Activity;
import y6a.e0;
import java.lang.Runnable;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import y6a.j0;
import erd.g;
import crd.b;
import p5a.e;
import de5.a;
import y6a.i0;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import xl8.b;
import y6a.k0;
import io.reactivex.internal.functions.Functions;
import y6a.h0;
import androidx.lifecycle.Observer;
import zz5.d;
import androidx.recyclerview.widget.RecyclerView;
import tkd.b;
import tkd.d;
import wxb.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import jta.c;
import rf5.u;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.lang.Throwable;
import java.lang.Boolean;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import y6a.d0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import me5.a;
import y6a.l0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import java.lang.Integer;
import java.lang.Float;
import com.kwai.component.photo.detail.slide.widget.SlideAtlasViewPager;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import z1.e;
import im8.f;
import jta.e;
import com.kwai.framework.model.user.QCurrentUser;
import uo5.a;
import qvb.i;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter$f;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter$g;
import lnc.i3;
import android.os.SystemClock;
import java.lang.Long;
import p1a.a$a;
import p1a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter$e;
import y6a.g0;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter$d;
import ekd.m1;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter$h;
import y6a.m0;
import android.view.animation.Interpolator;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import r7a.f;
import uw9.u3;
import com.kwai.library.slide.base.pagelist.a;
import lw6.a;
import f6a.c;
import k2b.u1;
import qvb.n0;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import g9c.a;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import yy6.a;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.lang.Iterable;
import qk.m;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.m;
import ok.o;
import com.google.common.collect.ImmutableList;
import k2b.e0;
import a9a.c;
import me5.a$a;
import y6a.c0;
import y8c.g;
import y6a.f0;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import qvb.p;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.k;

public class NasaSidebarFeedPresenter extends PresenterV2 implements q, DefaultLifecycleObserver	// class@0017fb
{
    public View A;
    public final c A1;
    public View B;
    public final a B1;
    public View C;
    public final Rect C1;
    public View D;
    public View E;
    public View F;
    public View G;
    public View H;
    public View I;
    public View J;
    public View K;
    public View L;
    public RecyclerView M;
    public View N;
    public View O;
    public View P;
    public View Q;
    public View R;
    public PublishSubject S;
    public QPhoto T;
    public BaseFragment U;
    public f U0;
    public f V;
    public a V0;
    public PublishSubject W;
    public PhotoDetailParam W0;
    public u X;
    public PublishSubject X0;
    public List Y;
    public b Y0;
    public f Z;
    public f Z0;
    public f a1;
    public NasaBizParam b1;
    public f c1;
    public AvatarInfoResponse d1;
    public f e1;
    public int f1;
    public int g1;
    public int h1;
    public int i1;
    public float j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public d p;
    public a p1;
    public TextView q;
    public l q1;
    public View r;
    public m r1;
    public View s;
    public GifshowActivity s1;
    public View t;
    public QPhoto t1;
    public View u;
    public int u1;
    public SlideAtlasViewPager v;
    public NasaSidebarFeedPresenter$g v1;
    public View w;
    public SlidePlayViewModel w1;
    public View x;
    public NasaSidebarFeedPresenter$h x1;
    public View y;
    public u3 y1;
    public View z;
    public final View$OnLayoutChangeListener z1;
    public static final int D1;
    public static final int E1;
    public static final int F1;
    public static final int G1;
    public static final int H1;
    public static final int I1;
    public static final int J1;
    public static AccelerateDecelerateInterpolator K1;

    static {
       int i;
       NasaSidebarFeedPresenter.D1 = i.a();
       i = a1.d(R.dimen.arg_RES_7f070a83);
       NasaSidebarFeedPresenter.E1 = i;
       NasaSidebarFeedPresenter.F1 = i;
       int i1 = a1.d(R.dimen.arg_RES_7f070ee7);
       NasaSidebarFeedPresenter.G1 = i1;
       if (i.c()) {
          i1 = i1 + n.A(a.B);
       }
       NasaSidebarFeedPresenter.H1 = i1;
       NasaSidebarFeedPresenter.I1 = a1.d(0x7f070ee5);
       Object obj = PatchProxy.apply(null, null, i.class, "4");
       i1 = (obj != PatchProxyResult.class)? obj.intValue(): c.b(a.B.getResources(), R.dimen.arg_RES_7f070ec1);
       NasaSidebarFeedPresenter.J1 = i1 + i;
       NasaSidebarFeedPresenter.K1 = new AccelerateDecelerateInterpolator();
    }
    public void NasaSidebarFeedPresenter(){
       super();
       this.j1 = 0x3f800000;
       this.z1 = new NasaSidebarFeedPresenter$a(this);
       this.A1 = new NasaSidebarFeedPresenter$b(this);
       this.B1 = new NasaSidebarFeedPresenter$c(this);
       this.C1 = new Rect();
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaSidebarFeedPresenter.class, "12")) {
          return;
       }
       NasaSidebarFeedPresenter tp = this.p;
       if (tp != null) {
          this.q1 = tp.e;
          this.r1 = tp.d;
       }
       this.n1 = true;
       this.w1 = SlidePlayViewModel.B0(this.U.getParentFragment());
       if (this.b1.getNasaSlideParam().isFollowNasaDetail() || this.b1.getNasaSlideParam().isFromHistory()) {
          this.x.setOnClickListener(l.b);
       }
       this.w1.P(this.U, this.B1);
       int i = 0;
       if (!this.w1.n1()) {
          Object[] objArray = new Object[i];
          o.C().t("NasaSidebarFeedPresenter", "SlidePlayDataFetcherImpl is Null£¬finish activity", objArray);
          this.getActivity().finish();
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "12");
          return;
       }else {
          this.w1.K1(i);
          this.w1.L1(i);
          tp = this.N;
          if (tp != null) {
             float f = 0;
             if (tp.getTranslationX() - f) {
                f = 0x3f800000;
             }
             this.j1 = f;
          }
          if (this.L.getHeight() || this.L.getWidth()) {
             this.o9();
             this.V8(this.j1);
             this.b9();
          }else {
             this.L.post(new e0(this));
          }
          if (this.b1.mNeedReplaceFeed != null) {
             this.T.getUser().startSyncWithFragment(this.U.m());
             this.X7(this.T.getUser().observable().subscribe(new j0(this)));
          }
          this.V0.getPlayer().w(new i0(this));
          this.X7(this.Y0.observable().subscribe(new k0(this), Functions.e));
          d.b(this.T, this.U, new h0(this));
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "12");
          return;
       }
    }
    public void F8(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaSidebarFeedPresenter.class, "8")) {
          return;
       }
       View view = this.getActivity().findViewById(R.id.slide_play_background);
       this.K = view;
       if (view != null) {
          view.setVisibility(0);
       }
       this.L = this.getActivity().findViewById(0x1020002);
       this.M = this.getActivity().findViewById(0x7f0a32a9);
       this.N = this.getActivity().findViewById(0x7f0a32a8);
       this.O = this.getActivity().findViewById(0x7f0a007f);
       this.P = this.getActivity().findViewById(0x7f0a3023);
       this.H = this.getActivity().findViewById(0x7f0a3b47);
       this.I = this.getActivity().findViewById(0x7f0a32aa);
       this.J = this.getActivity().findViewById(0x7f0a32a8);
       view = this.getActivity().findViewById(R.id.slide_left_cover);
       this.w = view;
       this.j9(view);
       view = this.getActivity().findViewById(R.id.slide_top_cover);
       this.x = view;
       this.j9(view);
       view = this.getActivity().findViewById(R.id.slide_right_cover);
       this.y = view;
       this.j9(view);
       view = this.getActivity().findViewById(R.id.slide_bottom_cover);
       this.z = view;
       this.j9(view);
       this.A = this.getActivity().findViewById(0x7f0a39b5);
       this.B = this.getActivity().findViewById(0x7f0a39b3);
       this.C = this.getActivity().findViewById(0x7f0a3a30);
       this.D = this.getActivity().findViewById(0x7f0a3a2d);
       this.Q = d.a(-1243444263).ao(this.getActivity());
       this.R = d.a(-1243444263).L30(this.getActivity());
       GifshowActivity activity = this.getActivity();
       this.s1 = activity;
       activity.getLifecycle().addObserver(this);
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "8");
       return;
    }
    public void H8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, NasaSidebarFeedPresenter.class, "15")) {
          return;
       }
       NasaSidebarFeedPresenter tw1 = this.w1;
       if (tw1 != null) {
          tw1.X1(this);
       }
       if (this.W0 != null && (this.b1.mNeedReplaceFeed == null && this.M.getAdapter() != null)) {
          this.M.setAdapter(objArray);
       }
    label_002a :
       NasaSidebarFeedPresenter tX = this.X;
       if (tX != null) {
          tX.B(this.A1);
       }
       tX = this.L;
       if (tX != null) {
          tX.removeOnLayoutChangeListener(this.z1);
       }
       tX = this.s1;
       if (tX != null) {
          tX.getLifecycle().removeObserver(this);
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "15");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaSidebarFeedPresenter.class, "13")) {
          return;
       }
       this.n1 = false;
       NasaSidebarFeedPresenter tM = this.M;
       if (tM != null && this.x1 != null) {
          tM.getViewTreeObserver().removeOnPreDrawListener(this.x1);
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "13");
       return;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport2(NasaSidebarFeedPresenter.class, "31") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), p1, this, NasaSidebarFeedPresenter.class, "31")) {
          return;
       }
       this.m1 = false;
       this.w1.s2().post(new d0(this));
       if (p0 && TextUtils.n(this.w1.D0(), this.T.getUserId())) {
          if (!this.w1.F0().isEmpty()) {
             NasaSidebarFeedPresenter tp1 = this.p1;
             if (tp1 != null && tp1.t1()) {
                this.w1.s2().post(new l0(this));
             }
          }
          this.w1.A1(null, false);
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "31");
       return;
    }
    public ClientContent$UserPackage P8(User p0){
       ClientContent$UserPackage obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaSidebarFeedPresenter.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$UserPackage();
       obj.identity = TextUtils.k(p0.getId());
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "43");
       return obj;
    }
    public final int R8(View p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, NasaSidebarFeedPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "7");
          return 0;
       }else {
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "7");
          return ((p0.getTop() - ((((this.g1 - NasaSidebarFeedPresenter.G1) - NasaSidebarFeedPresenter.I1) - (p0.getBottom() - p0.getTop())) / 2)) + n.A(this.getContext()));
       }
    }
    public final void S8(View p0,int p1){
       if (PatchProxy.isSupport2(NasaSidebarFeedPresenter.class, "22") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, NasaSidebarFeedPresenter.class, "22")) {
          return;
       }
       if (p0 != null && p0.getVisibility() != p1) {
          p0.setVisibility(p1);
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "22");
       return;
    }
    public void V8(float p0){
       float f3;
       float f4;
       int i1;
       NasaSidebarFeedPresenter tP;
       int b1;
       NasaSidebarFeedPresenter tr;
       if (PatchProxy.isSupport2(NasaSidebarFeedPresenter.class, "18") && PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, NasaSidebarFeedPresenter.class, "18")) {
          return;
       }
       NasaSidebarFeedPresenter tv = this.v;
       int i = 0;
       float f = 0x3f800000;
       if (tv == null || !tv.o()) {
          float f1 = f - p0;
          float f2 = (float)NasaSidebarFeedPresenter.F1 * f1;
          f3 = (float)this.X8() * f1;
          f4 = (float)NasaSidebarFeedPresenter.D1 * f1;
          float f5 = (float)NasaSidebarFeedPresenter.I1 * f1;
          i1 = (!p0 - f)? 8: 0;
          this.S8(this.A, i1);
          this.S8(this.B, i1);
          this.S8(this.C, i1);
          this.S8(this.D, i1);
          int i2 = -1;
          this.d9(this.w, (int)f2, i2);
          this.d9(this.x, i2, (int)f3);
          this.d9(this.y, (int)f4, i);
          this.d9(this.z, i2, (int)f5);
       }
       String str = "21";
       if (!PatchProxy.isSupport2(NasaSidebarFeedPresenter.class, str) || !PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, NasaSidebarFeedPresenter.class, str)) {
          if (this.w1.s1()) {
             PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, str);
          }else {
             tP = this.h1;
             f3 = (float)tP;
             i1 = (int)(f3 + ((float)(this.f1 - tP) * p0));
             tr = this.i1;
             f4 = (float)tr;
             b1 = (int)(f4 + ((float)(this.g1 - tr) * p0));
             this.w1.W0().height = b1;
             float f6 = f - p0;
             this.w1.W0().topMargin = (int)((float)this.X8() * f6);
             this.w1.W0().leftMargin = (int)((float)NasaSidebarFeedPresenter.F1 * f6);
             this.m8().getLayoutParams().height = b1;
             this.Z.set(e.a(Integer.valueOf(i1), Integer.valueOf(b1)));
             for (int i3 = 0; i3 < this.Y.size(); i3 = i3 + 1) {
                this.Y.get(i3).b(i1, b1);
             }
             NasaSidebarFeedPresenter tt = this.t;
             if (tt != null) {
                tt.getLayoutParams().width = i1;
                this.t.getLayoutParams().height = b1;
             }
             tt = this.v;
             if (tt != null) {
                tt.getLayoutParams().width = i1;
                this.v.getLayoutParams().height = b1;
             }
             tt = this.K;
             if (tt != null) {
                tt.getLayoutParams().width = i1;
                this.K.getLayoutParams().height = b1;
             }
             PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, str);
          }
       }
       tv = this.v;
       if (tv == null || !tv.o()) {
          if (this.k1 != null) {
             boolean b = QCurrentUser.ME.isLogined();
             this.h9(this.O, ((0x3f400000 * p0) + 0.25f));
             tP = this.P;
             if (tP != null) {
                this.h9(tP, p0);
             }
             i1 = true;
             if (b) {
                tv = this.s1;
                b1 = (!p0 - f)? true: false;
                a.c(tv, b1, 7);
             }
             tv = this.Q;
             if (tv != null) {
                this.h9(tv, p0);
                tv = this.Q;
                b1 = (!p0 - f)? true: false;
                tv.setEnabled(b1);
             }
             tv = this.R;
             if (tv != null) {
                this.h9(tv, p0);
                tv = this.R;
                if (p0 - f) {
                   i1 = false;
                }
                tv.setEnabled(i1);
             }
          }
          if (!p0 - f) {
             this.k9(this.H, 0xff000000);
             this.k9(this.I, a1.a(R.color.arg_RES_7f061ed9));
             this.k9(this.J, a1.a(R.color.arg_RES_7f06202f));
          }else {
             this.k9(this.H, a1.a(R.color.arg_RES_7f061eda));
             this.k9(this.I, a1.a(R.color.arg_RES_7f061eda));
             this.k9(this.J, a1.a(R.color.arg_RES_7f061eda));
          }
          this.h9(this.E, p0);
          this.h9(this.F, p0);
          this.h9(this.G, p0);
       }
       str = "24";
       if (!PatchProxy.isSupport2(NasaSidebarFeedPresenter.class, str) || !PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, NasaSidebarFeedPresenter.class, str)) {
          i1 = (int)((float)NasaSidebarFeedPresenter.D1 * (f - p0));
          tr = this.r;
          if (tr != null) {
             tr.getLayoutParams().rightMargin = i1;
          }
          this.s.getLayoutParams().rightMargin = i1;
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, str);
       }
       str = "25";
       if (!PatchProxy.isSupport2(NasaSidebarFeedPresenter.class, str) || !PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, NasaSidebarFeedPresenter.class, str)) {
          tP = this.q;
          if (p0 - f) {
             i = 4;
          }
          this.S8(tP, i);
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, str);
       }
       ViewGroup$LayoutParams layoutParams = this.u.getLayoutParams();
       layoutParams.width = (int)((float)a1.h() - ((float)NasaSidebarFeedPresenter.D1 * (f - p0)));
       this.u.setLayoutParams(layoutParams);
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "18");
       return;
    }
    public String W8(i p0,String p1){
       StringBuilder obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, NasaSidebarFeedPresenter.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p1;
       int i = 0;
       while (i < p0.getCount()) {
          Object item = p0.getItem(i);
          if (item instanceof QPhoto) {
             if (i > 0) {
                obj = obj+", ";
             }
             obj = obj+item.getPhotoId();
          }
          i++;
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "46");
       return obj;
    }
    public final int X8(){
       NasaSidebarFeedPresenter nasaSidebarF = NasaSidebarFeedPresenter.class;
       Object obj = PatchProxy.applyWithListener(null, this, nasaSidebarF, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (i.c()) {
          PatchProxy.onMethodExit(nasaSidebarF, "11");
          return (NasaSidebarFeedPresenter.G1 + n.A(this.getContext()));
       }else {
          PatchProxy.onMethodExit(nasaSidebarF, "11");
          return NasaSidebarFeedPresenter.G1;
       }
    }
    public final void Y8(User p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaSidebarFeedPresenter.class, "42")) {
          return;
       }
       NasaSidebarFeedPresenter$f uof = new NasaSidebarFeedPresenter$f(this, 6, 1586, "close_feed_model", p0);
       NasaSidebarFeedPresenter tv1 = this.v1;
       if (tv1 != null) {
          Objects.requireNonNull(tv1);
          String str = PatchProxy.applyWithListener(null, tv1, NasaSidebarFeedPresenter$g.class, "3");
          if (str != PatchProxyResult.class) {
          }else {
             i3 oi3 = i3.f();
             oi3.d("first_llsid", tv1.a);
             oi3.d("first_photo_id", tv1.b);
             oi3.c("feed_mode_duration", Long.valueOf(((SystemClock.elapsedRealtime() - tv1.c) - tv1.d)));
             str = oi3.e();
             PatchProxy.onMethodExit(NasaSidebarFeedPresenter$g.class, "3");
          }
          v2.m(str);
          this.v1 = null;
       }
       this.U0.get().a(v2);
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "42");
       return;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport2(NasaSidebarFeedPresenter.class, "29") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), Boolean.valueOf(p1), this, NasaSidebarFeedPresenter.class, "29")) {
          return;
       }
       if (this.w1.E0() <= 1) {
          this.w1.s(false);
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "29");
       return;
    }
    public final void Z8(User p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaSidebarFeedPresenter.class, "41")) {
          return;
       }
       this.v1 = new NasaSidebarFeedPresenter$g(this.T);
       NasaSidebarFeedPresenter$e uoe = new NasaSidebarFeedPresenter$e(this, 6, 1585, "open_feed_model", p0);
       this.U0.get().a(v9);
       Kgi.c(new g0(this));
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "41");
       return;
    }
    public final void a9(User p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaSidebarFeedPresenter.class, "40")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.a("is_live", this.c1.get());
       oi3.d("head_position", "BOTTOM_BAR");
       String str = oi3.e();
       a uoa = this.U0.get();
       String str1 = (this.c1.get().booleanValue())? "live": "not_live";
       NasaSidebarFeedPresenter$d uod = new NasaSidebarFeedPresenter$d(this, 0, 319, str1, p0);
       v10.m(str);
       v10.r(true);
       uoa.b(v10);
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "40");
       return;
    }
    public final void b9(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaSidebarFeedPresenter.class, "16")) {
          return;
       }
       if (this.l1 == null) {
          this.l1 = true;
          this.L.addOnLayoutChangeListener(this.z1);
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "16");
       return;
    }
    public void c9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, NasaSidebarFeedPresenter.class, "35")) {
          return;
       }
       NasaSidebarFeedPresenter tp1 = this.p1;
       if (tp1 != null) {
          tp1.W0(this.w1.F0());
          tp1 = this.p1;
          if (this.V0.getPlayer().isPaused()) {
             objArray = this.T;
          }
          tp1.v1(objArray);
          this.p1.k0();
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "35");
       return;
    }
    public final void d9(View p0,int p1,int p2){
       if (PatchProxy.isSupport2(NasaSidebarFeedPresenter.class, "20") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, NasaSidebarFeedPresenter.class, "20")) {
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
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "20");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaSidebarFeedPresenter.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a302f);
       this.v = m1.f(p0, 0x7f0a4452);
       this.u = m1.f(p0, 0x7f0a39f7);
       this.t = m1.f(p0, 0x7f0a09e1);
       this.q = m1.f(p0, 0x7f0a0cb4);
       this.s = m1.f(p0, 0x7f0a39f2);
       this.F = m1.f(p0, 0x7f0a04db);
       this.G = m1.f(p0, 0x7f0a04dd);
       this.E = m1.f(p0, 0x7f0a400c);
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "2");
       return;
    }
    public void e9(RecyclerView p0,LinearLayoutManager p1,int p2,boolean p3){
       int height;
       int j1;
       if (PatchProxy.isSupport2(NasaSidebarFeedPresenter.class, "3") && PatchProxy.applyVoidFourRefsWithListener(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, NasaSidebarFeedPresenter.class, "3")) {
          return;
       }
       if (p2 == -1) {
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "3");
          return;
       }else {
          int i = 0;
          if (!p3) {
             height = this.M.getHeight();
             j1 = NasaSidebarFeedPresenter.J1;
             int i1 = (height - j1) / 2;
             if (p2) {
                i = NasaSidebarFeedPresenter.E1 + ((height % j1) / 2);
             }
             i1 = i1 - i;
             if (this.x1 != null) {
                p0.getViewTreeObserver().removeOnPreDrawListener(this.x1);
             }
             this.x1 = new NasaSidebarFeedPresenter$h(p0, p1, p2, i1);
             p0.getViewTreeObserver().addOnPreDrawListener(this.x1);
             p1.scrollToPositionWithOffset(p2, i1);
             this.M.post(new m0(this));
             PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "3");
             return;
          }else {
             View view = p1.findViewByPosition(p2);
             if (view != null) {
                p0.smoothScrollBy(i, this.R8(view), NasaSidebarFeedPresenter.K1);
             }else {
                height = p1.i0();
                j1 = p1.c();
                if (p2 < height) {
                   p0.smoothScrollBy(i, (((- (height - p2)) * NasaSidebarFeedPresenter.J1) + this.R8(p1.findViewByPosition(height))), NasaSidebarFeedPresenter.K1);
                }else if(p2 > j1){
                   p0.smoothScrollBy(i, (((p2 - j1) * NasaSidebarFeedPresenter.J1) + this.R8(p1.findViewByPosition(j1))), NasaSidebarFeedPresenter.K1);
                }
             }
             PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "3");
             return;
          }
       }
    }
    public final void h9(View p0,float p1){
       if (PatchProxy.isSupport2(NasaSidebarFeedPresenter.class, "23") && PatchProxy.applyVoidTwoRefsWithListener(p0, Float.valueOf(p1), this, NasaSidebarFeedPresenter.class, "23")) {
          return;
       }
       if (p0 != null && p0.getAlpha() - p1) {
          p0.setAlpha(p1);
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "23");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaSidebarFeedPresenter.class, "1")) {
          return;
       }
       this.S = this.r8("DETAIL_SLIDE_PHOTO_LIST_PAUSE_VIEW_CLICK");
       this.T = this.q8(QPhoto.class);
       this.U = this.r8("DETAIL_FRAGMENT");
       this.V = this.x8("SLIDE_PLAY_ORIGIN_INDEX_IN_FEED");
       this.W = this.r8("SLIDE_PLAY_MARQUEE_COMMENT_SHOW");
       this.X = this.q8(u.class);
       this.Y = this.r8("SLIDE_PLAY_SIZE_CHANGED_LIST");
       this.Z = this.x8("SLIDE_PLAY_SIZE_SUPPLIER");
       this.U0 = this.x8("LOG_LISTENER");
       this.V0 = this.q8(a.class);
       this.W0 = this.q8(PhotoDetailParam.class);
       this.X0 = this.r8("SLIDE_V2_PROFILE_SCROLLED");
       this.Y0 = this.r8("NASA_FEATURE_SIDE_PROFILE_LIVE_ADD");
       this.Z0 = this.x8("FEED_KS_ORDER_ID");
       this.a1 = this.x8("PROFILE_KS_ORDER_ID");
       this.b1 = this.q8(NasaBizParam.class);
       this.c1 = this.x8("AVATAR_LIVE_STATUS");
       this.e1 = this.r8("NASA_SIDEBAR_STATUS");
       this.y1 = this.q8(u3.class);
       this.p = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "1");
       return;
    }
    public final void j9(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaSidebarFeedPresenter.class, "9")) {
          return;
       }
       if (p0 == null) {
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "9");
          return;
       }else {
          p0.setBackgroundColor(a1.a(R.color.arg_RES_7f061eda));
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "9");
          return;
       }
    }
    public final void k9(View p0,int p1){
       if (PatchProxy.isSupport2(NasaSidebarFeedPresenter.class, "19") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, NasaSidebarFeedPresenter.class, "19")) {
          return;
       }
       if (p0 != null) {
          p0.setBackgroundColor(p1);
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "19");
       return;
    }
    public void l9(){
       NasaSidebarFeedPresenter nasaSidebarF1;
       NasaSidebarFeedPresenter tj1;
       Object[] objArray1;
       LinearLayoutManager layoutManage;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, NasaSidebarFeedPresenter.class, "36")) {
          return;
       }
       String str = "39";
       NasaSidebarFeedPresenter nasaSidebarF = null;
       int i = 0x3f800000;
       if (!PatchProxy.applyVoidWithListener(objArray, this, NasaSidebarFeedPresenter.class, str)) {
          nasaSidebarF1 = this.j1;
          if (!nasaSidebarF1 - i) {
             this.Z0.set(this.T.getKsOrderId());
             this.a1.set("");
          }else if(!nasaSidebarF1 - nasaSidebarF){
             this.Z0.set(this.T.getKsOrderId());
          }
          this.m9();
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, str);
       }
       nasaSidebarF1 = 1;
       String str1 = "NasaSidebarFeedPresenter";
       if (this.b1.mNeedReplaceFeed == null) {
          if (!PatchProxy.applyVoidWithListener(objArray, this, NasaSidebarFeedPresenter.class, "38")) {
             tj1 = this.j1;
             if (!tj1 - i) {
                this.w1.Y1(this.T, 0, str1);
                this.Y8(this.T.getUser());
             }else if(!tj1 - nasaSidebarF){
                this.w1.Y1(this.T, nasaSidebarF1, str1);
                this.a9(this.T.getUser());
                this.Z8(this.T.getUser());
             }
             PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "38");
          }
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "36");
          return;
       }else {
          a uoa = this.w1.H0();
          NasaSidebarFeedPresenter tj11 = this.j1;
          String str2 = "SIDE_PANEL_OPEN_ID";
          int i1 = -1;
          if (!tj11 - i) {
             tj1 = this.w1;
             if (tj1.b2(tj1.X0())) {
                this.y1.c(str2);
                this.w1.Y1(this.T, 0, str1);
                this.V.set(Integer.valueOf(i1));
                this.w1.a2(i1, str1);
                a.b(str1, "set vm 1 -- "+this.V.get());
                this.Y8(this.T.getUser());
                objArray1 = new Object[0];
                o.C().w("NasaSlideLogger", "profile close", objArray1);
             }
          }else if(!tj11 - nasaSidebarF && (this.w1.E0() > 0 && this.w1.b2(uoa))){
             this.y1.b(str2, this.T.getPhotoId());
             int i2 = c.c(this.w1, this.T);
             this.V.set(Integer.valueOf(i2));
             this.w1.a2(i2, str1);
             a.b(str1, "set vm 9 -- "+this.V.get());
             if (this.V.get().intValue() == i1) {
                StringBuilder str3 = "37";
                String str4 = "originIndexInFeed = -1, indexOfPhotoId = ";
                if (!PatchProxy.applyVoidWithListener(objArray, this, NasaSidebarFeedPresenter.class, str3)) {
                   StringBuilder str6 = str4;
                   int i3 = (this.w1.V0() == null)? -1: this.w1.V0().indexOf(this.T);
                   u1.R("NasaSideFeedPresenter", str6+i3, 5);
                   PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, str3);
                }
                str3 = str4;
                if (this.w1.V0() != null) {
                   i1 = this.w1.V0().indexOf(this.T);
                }
                a.b(str1, str3+i1+" photo = "+this.T.toString());
             }
             this.w1.Y1(this.T, nasaSidebarF1, str1);
             this.a9(this.T.getUser());
             this.Z8(this.T.getUser());
             nasaSidebarF1 = this.p1;
             if (nasaSidebarF1 == null) {
                PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "36");
                return;
             }else if(!nasaSidebarF1.t1() || !uoa.isLoading()){
                if (this.p1.t1()) {
                   this.c9();
                   tj1 = this.M;
                   nasaSidebarF1 = this.p1;
                   this.e9(tj1, tj1.getLayoutManager(), nasaSidebarF1.s1(nasaSidebarF1.r1()), 0);
                }else if(this.o1 != null){
                   this.o1 = false;
                   this.p1.W0(this.w1.F0());
                   str = "4";
                   if (!PatchProxy.applyVoidWithListener(objArray, this, NasaSidebarFeedPresenter.class, str)) {
                      String str5 = "5";
                      if (!PatchProxy.applyVoidWithListener(objArray, this, NasaSidebarFeedPresenter.class, str5)) {
                         layoutManage = this.M.getLayoutManager();
                         if (layoutManage == null) {
                            PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, str5);
                         }else {
                            i2 = layoutManage.i0();
                            RecyclerView$ViewHolder viewHolder = this.M.findViewHolderForLayoutPosition(i2);
                            if (viewHolder == null) {
                               PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, str5);
                            }else {
                               this.t1 = this.p1.N0(i2);
                               this.M.getDecoratedBoundsWithMargins(viewHolder.itemView, this.C1);
                               this.u1 = this.C1.top;
                               PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, str5);
                            }
                         }
                      }
                      nasaSidebarF1 = this.p1;
                      if (nasaSidebarF1 != null) {
                         nasaSidebarF1.k0();
                      }
                      str5 = "6";
                      if (!PatchProxy.applyVoidWithListener(objArray, this, NasaSidebarFeedPresenter.class, str5)) {
                         if (this.t1 == null) {
                            PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, str5);
                         }else {
                            layoutManage = this.M.getLayoutManager();
                            if (layoutManage == null) {
                               PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, str5);
                            }else {
                               layoutManage.scrollToPositionWithOffset(this.p1.s1(this.t1), this.u1);
                               this.t1 = objArray;
                               PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, str5);
                            }
                         }
                      }
                      PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, str);
                   }
                }
             }
             objArray1 = new Object[0];
             o.C().w("NasaSlideLogger", "profile open", objArray1);
          }
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "36");
          return;
       }
    }
    public void m9(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaSidebarFeedPresenter.class, "44")) {
          return;
       }
       NasaSidebarFeedPresenter tU = this.U;
       if (tU instanceof GrootBaseFragment) {
          SlidePlayLogger slidePlayLog = tU.d1();
          if (!PatchProxy.applyVoidOneRefsWithListener(slidePlayLog, this, NasaSidebarFeedPresenter.class, "45")) {
             if (slidePlayLog == null) {
                PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "45");
             }else {
                String[] stringArray = new String[]{this.Z0.get(),this.a1.get()};
                ImmutableList immutableLis = m.s(Lists.e(stringArray)).p(m.b).B();
                Object[] objArray = new Object[0];
                o.C().s("NasaSidebarFeedPresenter", "Update customKsOrderList "+this.U.o()+"/"+this.U.h5()+": "+immutableLis, objArray);
                slidePlayLog.setCustomKsOrderList(immutableLis);
                PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "45");
             }
          }
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "44");
       return;
    }
    public void n9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, NasaSidebarFeedPresenter.class, "26")) {
          return;
       }
       if (this.b1.mNeedReplaceFeed == null && this.p1 != null) {
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "26");
          return;
       }else if(this.m1 == null){
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "26");
          return;
       }else {
          int i = 1;
          a uoa = new a(this.w1, new c(this.W0.getSource()), (this.b1.getNasaSlideParam().mSidebarFeedLiveTopResident ^ i));
          this.p1 = uoa;
          uoa.w1(this.T);
          uoa.u1(new c0(this));
          this.M.setAdapter(this.p1);
          this.w1.A1(this.T, i);
          if (this.b1.mNeedReplaceFeed != null) {
             if (!PatchProxy.applyVoidWithListener(objArray, this, NasaSidebarFeedPresenter.class, "28")) {
                this.w1.y0();
                int i1 = 0;
                if (this.w1.r1()) {
                   if (!PatchProxy.applyVoidWithListener(objArray, this, NasaSidebarFeedPresenter.class, "34")) {
                      this.w1.t0(this.T, "NasaSideFeedVMPresenter");
                      ArrayList uArrayList = new ArrayList();
                      for (; i1 < 20; i1 = i1 + 1) {
                         uArrayList.add(this.T);
                      }
                      NasaSidebarFeedPresenter tp1 = this.p1;
                      if (tp1 != null) {
                         if (!PatchProxy.applyVoidOneRefs(uArrayList, tp1, a.class, "1")) {
                            tp1.W0(uArrayList);
                            tp1.C = i;
                         }
                         this.p1.k0();
                      }
                      PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "34");
                   }
                }else {
                   this.c9();
                   if (this.w1.F0().indexOf(this.T)) {
                      NasaSidebarFeedPresenter tM = this.M;
                      NasaSidebarFeedPresenter tp11 = this.p1;
                      this.e9(tM, tM.getLayoutManager(), tp11.s1(tp11.r1()), i1);
                   }
                }
                PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "28");
             }
             this.w1.B1();
          }else {
             this.p1.q1(this.w1.X0());
             this.p1.W0(this.w1.V0());
             this.p1.k0();
             int i2 = this.p1.s1(this.T);
             if (i2 > -1) {
                this.M.post(new f0(this, i2));
             }
          }
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "26");
          return;
       }
    }
    public void o9(){
       if (PatchProxy.applyVoidWithListener(null, this, NasaSidebarFeedPresenter.class, "10")) {
          return;
       }
       int width = (this.L.getWidth())? this.L.getWidth(): a1.h();
       this.f1 = width;
       this.h1 = (width - NasaSidebarFeedPresenter.D1) - NasaSidebarFeedPresenter.F1;
       width = (this.L.getHeight())? this.L.getHeight(): a1.g();
       this.g1 = width;
       this.i1 = (((width - NasaSidebarFeedPresenter.H1) - NasaSidebarFeedPresenter.I1) + 0) + 0;
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "10");
       return;
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaSidebarFeedPresenter.class, "33")) {
          return;
       }
       NasaSidebarFeedPresenter tv1 = this.v1;
       if (tv1 != null) {
          Objects.requireNonNull(tv1);
          if (!PatchProxy.applyVoidWithListener(null, tv1, NasaSidebarFeedPresenter$g.class, "2")) {
             tv1.e = SystemClock.elapsedRealtime();
             PatchProxy.onMethodExit(NasaSidebarFeedPresenter$g.class, "2");
          }
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "33");
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NasaSidebarFeedPresenter.class, "32")) {
          return;
       }
       if (this.k1 != null && (this.w1.r() && !TextUtils.n(this.w1.D0(), this.T.getUserId()))) {
          this.n9();
       }
    label_002c :
       NasaSidebarFeedPresenter tv1 = this.v1;
       if (tv1 != null) {
          Objects.requireNonNull(tv1);
          if (!PatchProxy.applyVoidWithListener(null, tv1, NasaSidebarFeedPresenter$g.class, "1")) {
             tv1.d = tv1.d + (SystemClock.elapsedRealtime() - tv1.e);
             PatchProxy.onMethodExit(NasaSidebarFeedPresenter$g.class, "1");
          }
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "32");
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport2(NasaSidebarFeedPresenter.class, "30") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), Boolean.valueOf(p1), this, NasaSidebarFeedPresenter.class, "30")) {
          return;
       }
       this.w1.s(true);
       if (this.M == null) {
          PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "30");
          return;
       }else if(p0 || !this.w1.m1()){
          this.M.post(new k(this, p0));
       }else {
          this.c9();
          this.l9();
       }
       PatchProxy.onMethodExit(NasaSidebarFeedPresenter.class, "30");
       return;
    }
}
