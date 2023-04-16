package com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$a;
import nsd.u;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import oha.t$a;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$f;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$e;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$b;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$c;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$d;
import ba9.a;
import v99.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import com.yxcorp.gifshow.model.LivePlayConfig;
import java.util.Map;
import u99.d;
import java.lang.Runnable;
import android.widget.ImageView;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import zf6.l;
import android.graphics.drawable.Drawable;
import tkd.b;
import tkd.d;
import os5.l;
import brd.t;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$g;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.i;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$h;
import java.util.Objects;
import com.yxcorp.gifshow.follow.init.plugin.live.d;
import java.lang.Integer;
import vw5.a;
import tw5.e;
import s99.d;
import com.yxcorp.gifshow.autoplay.widget.FrameAutoPlayCard;
import com.yxcorp.gifshow.util.rx.RxBus;
import sw5.b;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$onBind$4;
import oha.b;
import msd.l;
import t99.y;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import s99.i;
import im8.f;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import t99.w;
import android.view.View;
import t99.w$a;
import android.view.ViewStub;
import android.widget.TextView;
import com.yxcorp.gifshow.follow.init.plugin.live.HomeLiveAutoPlayPresenter$i;
import lnc.b9;
import android.animation.ValueAnimator;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.yxcorp.gifshow.image.KwaiImageView;
import ekd.m1;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import y99.k;
import java.lang.Number;
import xl8.b;
import io.reactivex.subjects.PublishSubject;
import r99.i;
import java.lang.Long;
import ra5.c;
import k2b.e0;
import oha.t;
import s99.m;

public class HomeLiveAutoPlayPresenter extends PresenterV2	// class@0010c7
{
    public ImageView A;
    public ObjectAnimator B;
    public ObjectAnimator C;
    public long D;
    public boolean E;
    public b F;
    public PublishSubject G;
    public boolean H;
    public ViewStub I;
    public TextView J;
    public a K;
    public FrameAutoPlayCard L;
    public LivePlayTextureView M;
    public a N;
    public d O;
    public d P;
    public k Q;
    public LiveAutoPlayModule R;
    public i S;
    public f T;
    public b U;
    public final RefreshLayout$h U0;
    public ValueAnimator V;
    public final HomeLiveAutoPlayPresenter$b V0;
    public boolean W;
    public final i W0;
    public int X;
    public final y X0;
    public float Y;
    public final CardStyle Y0;
    public final Runnable Z;
    public int p;
    public LivePlayConfig q;
    public QPhoto r;
    public RecyclerFragment s;
    public ViewStub t;
    public ViewStub u;
    public KwaiImageView v;
    public f w;
    public View x;
    public View y;
    public ImageView z;
    public static final HomeLiveAutoPlayPresenter$a Z0;

    static {
       HomeLiveAutoPlayPresenter.Z0 = new HomeLiveAutoPlayPresenter$a(null);
    }
    public void HomeLiveAutoPlayPresenter(CardStyle p0){
       a.p(p0, "cardStyle");
       super();
       this.Y0 = p0;
       this.X = t$a.c;
       this.Y = t$a.a;
       this.Z = new HomeLiveAutoPlayPresenter$f(this);
       this.U0 = new HomeLiveAutoPlayPresenter$e(this);
       this.V0 = new HomeLiveAutoPlayPresenter$b(this);
       this.W0 = new HomeLiveAutoPlayPresenter$c(this);
       this.X0 = new HomeLiveAutoPlayPresenter$d(this);
    }
    public static final a P8(HomeLiveAutoPlayPresenter p0){
       p0 = p0.K;
       if (p0 == null) {
          a.S("mFeedCard");
       }
       return p0;
    }
    public static final a R8(HomeLiveAutoPlayPresenter p0){
       p0 = p0.N;
       if (p0 == null) {
          a.S("mPlayManager");
       }
       return p0;
    }
    public void E8(){
       int i;
       HomeLiveAutoPlayPresenter r1;
       boolean b1;
       int i1;
       HomeLiveAutoPlayPresenter$h oh1;
       w$a a;
       boolean b = this;
       HomeLiveAutoPlayPresenter homeLiveAuto = HomeLiveAutoPlayPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, homeLiveAuto, "19")) {
          return;
       }
       HashMap hashMap = new HashMap();
       HomeLiveAutoPlayPresenter q = b.q;
       if (q != null) {
          hashMap.put("mMaxPlayCount", String.valueOf(q.mMaxPlayCount));
          hashMap.put("mMaxPlaySeconds", String.valueOf(q.mMaxPlaySeconds));
       }
       d.h("HomeLiveAutoPlayPresenter", "onBind", hashMap);
       HomeLiveAutoPlayPresenter v = b.v;
       if (v == null) {
          a.S("mCoverView");
       }
       v.post(b.Z);
       v = b.z;
       String str = "mPhoto";
       if (v != null) {
          i = a1.a(R.color.arg_RES_7f061d82);
          HomeLiveAutoPlayPresenter r = b.r;
          if (r == null) {
             a.S(str);
          }
          v.setBackground(new ColorDrawable(l.m(i, r1.t0(r.mEntity))));
       }
       b.X7(d.a(-1492894991).Jy().subscribe(new HomeLiveAutoPlayPresenter$g(b)));
       v = b.P;
       if (v == null) {
          a.S("mLiveDanmakuHelper");
       }
       r1 = b.r;
       if (r1 == null) {
          a.S(str);
       }
       RefreshLayout obj = PatchProxy.apply(objArray, b, homeLiveAuto, "20");
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(b.p == 1){
          if (i.e() != 2) {
             b1 = true;
          }
       }else {
          homeLiveAuto = b.q;
          if (homeLiveAuto != null) {
             b1 = homeLiveAuto.mEnableCommentBullet;
          }
       }
       b1 = false;
       q = b.p;
       if (q != 1) {
          i1 = (q != 3)? 0: 5;
       }else {
          i1 = 1;
       }
       HomeLiveAutoPlayPresenter$h oh = new HomeLiveAutoPlayPresenter$h(b);
       Objects.requireNonNull(v);
       if (PatchProxy.isSupport(d.class)) {
          oh1 = oh;
          if (PatchProxy.applyVoidFourRefs(r1, Boolean.valueOf(b1), Integer.valueOf(i1), oh, v, d.class, "1")) {
          label_010e :
             homeLiveAuto = b.L;
             String str1 = "mPlayView";
             if (homeLiveAuto == null) {
                a.S(str1);
             }
             v = b.O;
             if (v == null) {
                a.S("mInterceptor");
             }
             homeLiveAuto.B(v);
             if (b.p == 5) {
                b.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new b(new HomeLiveAutoPlayPresenter$onBind$4(b))));
             }
             homeLiveAuto = b.R;
             if (homeLiveAuto == null) {
                a.S("mPlayModule");
             }
             homeLiveAuto.O(b.X0);
             homeLiveAuto = b.L;
             if (homeLiveAuto == null) {
                a.S(str1);
             }
             homeLiveAuto.y(b.W0);
             homeLiveAuto = b.T;
             if (homeLiveAuto == null) {
                a.S("mAutoPlayConfigRef");
             }
             homeLiveAuto.set(b.V0);
             homeLiveAuto = b.s;
             if (homeLiveAuto == null) {
                a.S("mFragment");
             }
             obj = homeLiveAuto.Ac();
             if (obj != null) {
                obj.c(b.U0);
             }
             a = w.a;
             a.g(b.z, 1, 1);
             a.g(b.A, 1, 1);
             b.W = false;
             if (i.i() && b.J == null) {
                homeLiveAuto = b.I;
                View view = (homeLiveAuto != null)? homeLiveAuto.inflate(): 0;
                TextView textView = (!view instanceof TextView)? null: view;
                b.J = textView;
             }
             return;
          }
       }else {
          oh1 = oh;
       }
       v.d = r1;
       v.f = b1;
       v.g = i1;
       v.q = oh1;
       v.s = d.a(-680793205).pr().a();
       v.d();
       goto label_010e ;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, HomeLiveAutoPlayPresenter.class, "18")) {
          return;
       }
       this.O = new HomeLiveAutoPlayPresenter$i(this);
       HomeLiveAutoPlayPresenter tt = this.t;
       if (tt == null) {
          a.S("mDanmakuViewStub");
       }
       this.P = new d(tt, this.Y0);
       return;
    }
    public void J8(){
       HomeLiveAutoPlayPresenter homeLiveAuto = HomeLiveAutoPlayPresenter.class;
       if (PatchProxy.applyVoid(null, this, homeLiveAuto, "21")) {
          return;
       }
       HomeLiveAutoPlayPresenter tv = this.v;
       String str = "mCoverView";
       if (tv == null) {
          a.S(str);
       }
       tv.setAlpha(0x3f800000);
       b9.a(this.U);
       tv = this.v;
       if (tv == null) {
          a.S(str);
       }
       tv.removeCallbacks(this.Z);
       tv = this.L;
       str = "mPlayView";
       if (tv == null) {
          a.S(str);
       }
       HomeLiveAutoPlayPresenter tO = this.O;
       if (tO == null) {
          a.S("mInterceptor");
       }
       tv.v(tO);
       tv = this.L;
       if (tv == null) {
          a.S(str);
       }
       tv.A(this.W0);
       tv = this.R;
       if (tv == null) {
          a.S("mPlayModule");
       }
       tv.e0(this.X0);
       tv = this.s;
       if (tv == null) {
          a.S("mFragment");
       }
       RefreshLayout refreshLayou = tv.Ac();
       if (refreshLayou != null) {
          refreshLayou.E(this.U0);
       }
       tv = this.J;
       if (tv != null) {
          tv.setVisibility(8);
       }
       if (!PatchProxy.applyVoid(null, this, homeLiveAuto, "14")) {
          homeLiveAuto = this.V;
          if (homeLiveAuto != null) {
             homeLiveAuto.cancel();
          }
          homeLiveAuto = this.V;
          if (homeLiveAuto != null) {
             homeLiveAuto.removeAllUpdateListeners();
          }
          homeLiveAuto = this.V;
          if (homeLiveAuto != null) {
             homeLiveAuto.removeAllListeners();
          }
          homeLiveAuto = this.B;
          if (homeLiveAuto != null) {
             homeLiveAuto.removeAllListeners();
          }
          homeLiveAuto = this.C;
          if (homeLiveAuto != null) {
             homeLiveAuto.removeAllListeners();
          }
       }
       return;
    }
    public final void S8(){
       ObjectAnimator objectAnimat;
       if (PatchProxy.applyVoid(null, this, HomeLiveAutoPlayPresenter.class, "13")) {
          return;
       }
       int i = 600;
       int i1 = 2;
       if (this.B == null) {
          objectAnimat = ObjectAnimator.ofFloat(this.x, View.ALPHA, new float[i1]{0,0x3f800000});
          this.B = objectAnimat;
          if (objectAnimat != null) {
             objectAnimat.setDuration((long)i);
          }
       }
       if (this.C == null) {
          objectAnimat = ObjectAnimator.ofFloat(this.x, View.ALPHA, new float[i1]{0x3f800000,0});
          this.C = objectAnimat;
          if (objectAnimat != null) {
             objectAnimat.setDuration((long)i);
          }
       }
       return;
    }
    public final void V8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeLiveAutoPlayPresenter.class, "17")) {
          return;
       }
       if (this.x == null) {
          HomeLiveAutoPlayPresenter ty = this.y;
          if (ty != null) {
             objArray = ty.findViewById(R.id.right_bottom_feed_general_cover_label_view);
          }
          this.x = objArray;
       }
       return;
    }
    public final KwaiImageView W8(){
       HomeLiveAutoPlayPresenter obj = PatchProxy.apply(null, this, HomeLiveAutoPlayPresenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj == null) {
          a.S("mCoverView");
       }
       return obj;
    }
    public final RecyclerFragment X8(){
       HomeLiveAutoPlayPresenter obj = PatchProxy.apply(null, this, HomeLiveAutoPlayPresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("mFragment");
       }
       return obj;
    }
    public final QPhoto Y8(){
       HomeLiveAutoPlayPresenter obj = PatchProxy.apply(null, this, HomeLiveAutoPlayPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("mPhoto");
       }
       return obj;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, HomeLiveAutoPlayPresenter.class, "16")) {
          return;
       }
       this.V8();
       if (this.x == null) {
          return;
       }
       this.S8();
       HomeLiveAutoPlayPresenter tC = this.C;
       if (tC != null) {
          tC.start();
       }
       return;
    }
    public void a9(){
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, HomeLiveAutoPlayPresenter.class, "31")) {
          return;
       }
       HomeLiveAutoPlayPresenter tN = this.N;
       if (tN == null) {
          a.S("mPlayManager");
       }
       HomeLiveAutoPlayPresenter tL = this.L;
       if (tL == null) {
          a.S("mPlayView");
       }
       if (tN.g(tL)) {
          tN = this.P;
          if (tN == null) {
             a.S("mLiveDanmakuHelper");
          }
          tN.g();
       }
       return;
    }
    public void c9(){
       if (PatchProxy.applyVoid(null, this, HomeLiveAutoPlayPresenter.class, "28")) {
          return;
       }
       HomeLiveAutoPlayPresenter tP = this.P;
       if (tP == null) {
          a.S("mLiveDanmakuHelper");
       }
       tP.c();
       return;
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, HomeLiveAutoPlayPresenter.class, "27")) {
          return;
       }
       HomeLiveAutoPlayPresenter tP = this.P;
       if (tP == null) {
          a.S("mLiveDanmakuHelper");
       }
       tP.e();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLiveAutoPlayPresenter.class, "2")) {
          return;
       }
       this.y = p0;
       View view = m1.f(p0, R.id.player_cover);
       a.o(view, "ViewBindUtils.bindWidget¡­tView, R.id.player_cover\)");
       this.v = view;
       View view1 = m1.f(p0, R.id.play_view_container);
       a.o(view1, "ViewBindUtils.bindWidget¡­R.id.play_view_container\)");
       this.L = view1;
       view1 = m1.f(p0, R.id.danmaku_viewStub);
       a.o(view1, "ViewBindUtils.bindWidget¡­w, R.id.danmaku_viewStub\)");
       this.t = view1;
       view1 = m1.f(p0, R.id.commodity_info_label_container);
       a.o(view1, "ViewBindUtils.bindWidget¡­ity_info_label_container\)");
       this.u = view1;
       this.A = m1.f(p0, 0x7f0a2086);
       this.z = m1.f(p0, 0x7f0a1a68);
       this.x = m1.f(p0, 0x7f0a363e);
       view1 = m1.f(p0, R.id.live_surface);
       a.o(view1, "ViewBindUtils.bindWidget¡­tView, R.id.live_surface\)");
       this.M = view1;
       view = m1.f(p0, R.id.play_view_container);
       a.o(view, "ViewBindUtils.bindWidget¡­R.id.play_view_container\)");
       this.K = view;
       this.I = m1.f(p0, 0x7f0a09df);
       return;
    }
    public void e9(){
    }
    public void h9(){
       if (PatchProxy.applyVoid(null, this, HomeLiveAutoPlayPresenter.class, "30")) {
          return;
       }
       HomeLiveAutoPlayPresenter tP = this.P;
       if (tP == null) {
          a.S("mLiveDanmakuHelper");
       }
       tP.g();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HomeLiveAutoPlayPresenter.class, "1")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.s = obj;
       obj = this.r8("AUTO_PLAY_DISPATCH_FOCUS_STATE");
       a.o(obj, "inject\(AutoPlayAccessIds¡­LAY_DISPATCH_FOCUS_STATE\)");
       this.Q = obj;
       this.q = this.t8("HOME_LIVE_PLAY_CONFIG");
       obj = this.r8("AUTO_PLAY_LIVE_MODULE");
       a.o(obj, "inject\(AutoPlayAccessIds.AUTO_PLAY_LIVE_MODULE\)");
       this.R = obj;
       this.w = this.x8("HOME_ENABLE_LIVE_AUTO_PLAY");
       obj = this.r8("AUTO_PLAY_BIZ_TYPE");
       a.o(obj, "inject\(AutoPlayAccessIds.AUTO_PLAY_BIZ_TYPE\)");
       this.p = obj.intValue();
       obj = this.r8("AUTO_PLAY_MANAGER");
       a.o(obj, "inject\(AutoPlayAccessIds.AUTO_PLAY_MANAGER\)");
       this.N = obj;
       this.F = this.t8("HOME_LIVE_AUTO_PLAYING");
       this.G = this.t8("PLAY_PLAYER_INTERCEPT");
       obj = this.x8("AUTO_PLAY_LIVE_CONFIG");
       a.o(obj, "injectRef\(AutoPlayAccessIds.AUTO_PLAY_LIVE_CONFIG\)");
       this.T = obj;
       Boolean obj1 = this.r8("AUTO_PLAY_STRATEGY");
       a.o(obj1, "inject\(AutoPlayAccessIds.AUTO_PLAY_STRATEGY\)");
       this.S = obj1;
       obj1 = this.t8("HOME_SHOW_RIGHT_BOTTOM_TAG_IMMEDIATELY");
       boolean b = (obj1 != null)? obj1.booleanValue(): false;
       this.H = b;
       return;
    }
    public void j9(){
       if (PatchProxy.applyVoid(null, this, HomeLiveAutoPlayPresenter.class, "26")) {
          return;
       }
       HomeLiveAutoPlayPresenter tP = this.P;
       if (tP == null) {
          a.S("mLiveDanmakuHelper");
       }
       tP.e();
       return;
    }
    public void k9(){
       if (PatchProxy.applyVoid(null, this, HomeLiveAutoPlayPresenter.class, "29")) {
          return;
       }
       HomeLiveAutoPlayPresenter tP = this.P;
       if (tP == null) {
          a.S("mLiveDanmakuHelper");
       }
       tP.c();
       return;
    }
    public void l9(){
    }
    public void m9(){
       w$a a;
       if (PatchProxy.applyVoid(null, this, HomeLiveAutoPlayPresenter.class, "32")) {
          return;
       }
       HomeLiveAutoPlayPresenter tP = this.P;
       if (tP == null) {
          a.S("mLiveDanmakuHelper");
       }
       a = w.a;
       HomeLiveAutoPlayPresenter tv = this.v;
       String str = "mCoverView";
       if (tv == null) {
          a.S(str);
       }
       int measuredWidt = tv.getMeasuredWidth();
       HomeLiveAutoPlayPresenter tv1 = this.v;
       if (tv1 == null) {
          a.S(str);
       }
       tP.i = a.b(measuredWidt, tv1.getMeasuredHeight());
       return;
    }
    public final void n9(){
       if (PatchProxy.applyVoid(null, this, HomeLiveAutoPlayPresenter.class, "15")) {
          return;
       }
       w$a a = w.a;
       HomeLiveAutoPlayPresenter tr = this.r;
       if (tr == null) {
          a.S("mPhoto");
       }
       QPhoto mEntity = tr.mEntity;
       a.o(mEntity, "mPhoto.mEntity");
       if (a.d(mEntity)) {
          return;
       }else {
          this.V8();
          HomeLiveAutoPlayPresenter tx = this.x;
          if (tx == null) {
             return;
          }else if(this.H != null){
             if (tx != null) {
                tx.setAlpha(0x3f800000);
             }
             return;
          }else {
             this.S8();
             tx = this.B;
             if (tx != null) {
                tx.start();
             }
             return;
          }
       }
    }
    public final void o9(long p0){
       HomeLiveAutoPlayPresenter y1;
       Object obj = this;
       HomeLiveAutoPlayPresenter homeLiveAuto = HomeLiveAutoPlayPresenter.class;
       if (PatchProxy.isSupport(homeLiveAuto) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), obj, homeLiveAuto, "23")) {
          return;
       }
       homeLiveAuto = obj.p;
       String str = "mFragment";
       String str1 = "mPhoto";
       if (homeLiveAuto != 3) {
          if (homeLiveAuto != 5) {
             HomeLiveAutoPlayPresenter s = obj.s;
             if (s == null) {
                a.S(str);
             }
             HomeLiveAutoPlayPresenter r = obj.r;
             if (r == null) {
                a.S(str1);
             }
             HomeLiveAutoPlayPresenter x = obj.X;
             HomeLiveAutoPlayPresenter y = obj.Y;
             homeLiveAuto = obj.r;
             if (homeLiveAuto == null) {
                a.S(str1);
             }
             t.d("2208523", s, r, p0, x, y, c.c(homeLiveAuto.mEntity));
          }else {
             HomeLiveAutoPlayPresenter s1 = obj.s;
             if (s1 == null) {
                a.S(str);
             }
             HomeLiveAutoPlayPresenter r1 = obj.r;
             if (r1 == null) {
                a.S(str1);
             }
             homeLiveAuto = obj.X;
             y1 = obj.Y;
             HomeLiveAutoPlayPresenter r2 = obj.r;
             if (r2 == null) {
                a.S(str1);
             }
             t.d("2683201", s1, r1, p0, homeLiveAuto, y1, c.c(r2.mEntity));
          }
       }else {
          homeLiveAuto = obj.s;
          if (homeLiveAuto == null) {
             a.S(str);
          }
          HomeLiveAutoPlayPresenter r3 = obj.r;
          if (r3 == null) {
             a.S(str1);
          }
          HomeLiveAutoPlayPresenter x1 = obj.X;
          HomeLiveAutoPlayPresenter y2 = obj.Y;
          y1 = obj.r;
          if (y1 == null) {
             a.S(str1);
          }
          t.d("2455846", homeLiveAuto, r3, p0, x1, y2, c.c(y1.mEntity));
       }
       obj.D = 0;
       return;
    }
    public final void onEventMainThreadNearbyNotify(b p0){
       HomeLiveAutoPlayPresenter tN;
       HomeLiveAutoPlayPresenter tK;
       m om;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLiveAutoPlayPresenter.class, "24")) {
          return;
       }
       String str = p0.a();
       HomeLiveAutoPlayPresenter tr = this.r;
       if (tr == null) {
          a.S("mPhoto");
       }
       String str1 = "mAutoPlayConfigRef";
       String str2 = "mFeedCard";
       String str3 = "mPlayManager";
       if (a.g(str, tr.getPhotoId())) {
          tN = this.N;
          if (tN == null) {
             a.S(str3);
          }
          tK = this.K;
          if (tK == null) {
             a.S(str2);
          }
          tN.u("focus_dispatch", tK);
          tN = this.T;
          if (tN == null) {
             a.S(str1);
          }
          om = tN.get();
          if (om != null && om.a() == true) {
             tN = this.N;
             if (tN == null) {
                a.S(str3);
             }
             tr = this.K;
             if (tr == null) {
                a.S(str2);
             }
             tN.h(tr);
          }
       }else {
          tN = this.N;
          if (tN == null) {
             a.S(str3);
          }
          tK = this.K;
          if (tK == null) {
             a.S(str2);
          }
          if (tN.f(tK)) {
             tN = this.N;
             if (tN == null) {
                a.S(str3);
             }
             HomeLiveAutoPlayPresenter tK1 = this.K;
             if (tK1 == null) {
                a.S(str2);
             }
             tN.v("nearby_animated_strategy", tK1);
          }
          tN = this.T;
          if (tN == null) {
             a.S(str1);
          }
          om = tN.get();
          if (om != null) {
             tr = this.v;
             if (tr == null) {
                a.S("mCoverView");
             }
             om.d(tr);
          }
       }
    label_00a5 :
       return;
    }
}
