package fia.z;
import vy6.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fia.z$a;
import nsd.u;
import fia.z$c;
import cia.w;
import java.lang.String;
import kotlin.jvm.internal.a;
import bia.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kwai.feature.component.entry.a;
import xf6.d;
import android.view.ViewStub;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import android.view.View;
import ekd.m1;
import com.airbnb.lottie.LottieAnimationView;
import androidx.constraintlayout.widget.ConstraintLayout;
import fia.d0;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import bia.k;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateInterpolator;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import fia.a0;
import android.animation.Animator$AnimatorListener;
import android.view.animation.DecelerateInterpolator;
import fia.b0;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.viewpager.widget.ViewPager$i;
import java.util.Set;
import brd.t;
import xl8.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import android.app.Activity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import fia.z$d;
import kga.c;
import erd.g;
import crd.b;
import fia.z$e;
import bia.j;
import com.yxcorp.gifshow.util.rx.RxBus;
import tga.e;
import t45.d;
import brd.z;
import bia.i;
import fia.z$f;
import fia.z$g;
import bia.f;
import java.lang.Integer;
import qrd.l1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.follow.config.model.FollowLiveTipsGuideConfig$LiveTipsSimpleGuide;
import java.lang.Boolean;
import java.util.concurrent.TimeUnit;
import fia.z$b;
import cha.a;
import java.lang.Float;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import im8.f;
import dia.a;
import k2b.e0;

public final class z extends PresenterV2 implements a	// class@002944
{
    public ViewGroup A;
    public ViewGroup B;
    public KwaiBindableImageView C;
    public TextView D;
    public TextView E;
    public LottieAnimationView F;
    public ViewGroup G;
    public TextView H;
    public List I;
    public int J;
    public boolean K;
    public View L;
    public int M;
    public final ViewPager$i N;
    public d p;
    public j q;
    public a r;
    public NasaBizParam s;
    public w t;
    public View u;
    public ConstraintLayout v;
    public LottieAnimationView w;
    public AnimatorSet x;
    public AnimatorSet y;
    public f z;
    public static final z$a O;

    static {
       z.O = new z$a(null);
    }
    public void z(){
       super();
       this.J = 1;
       this.K = true;
       this.N = new z$c(this);
    }
    public static final w P8(z p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mFollowSlideInjectAdapter");
       }
       return p0;
    }
    public static final d R8(z p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mLiveTipsEntranceState");
       }
       return p0;
    }
    public void B0(){
    }
    public void E8(){
       g a;
       d d;
       d c;
       t ot3;
       Object[] objArray1;
       int i = this;
       z oz = z.class;
       d uod = d.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, i, oz, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, i, oz, "10")) {
          z s = i.s;
          String str2 = "mNasaBizParam";
          if (s == null) {
             a.S(str2);
          }
          i.M = a.n(s.getNasaSlideParam().mEntrySource);
          if (d.v() >= 0) {
             i.M = d.v();
          }
          s = i.u;
          if (s instanceof ViewStub) {
             String str3 = "null cannot be cast to non-null type android.view.ViewStub";
             Objects.requireNonNull(s, str3);
             s.setLayoutResource(R.layout.arg_RES_7f0d0467);
             s = i.u;
             if (!s instanceof ViewStub) {
                objArray1 = objArray;
             }
             ViewGroup$LayoutParams layoutParams = (objArray1 != null)? objArray1.getLayoutParams(): objArray;
             if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
                layoutParams = objArray;
             }
             if (layoutParams != null) {
                if (FollowConfigUtil.i()) {
                   layoutParams.topMargin = n.A(objArray1.getContext()) + a1.d(0x7f070fdf);
                }
                z s1 = i.s;
                if (s1 == null) {
                   a.S(str2);
                }
                if (s1.getNasaSlideParam().mEnableCameraButton != null) {
                   s1 = i.s;
                   if (s1 == null) {
                      a.S(str2);
                   }
                   if (s1.getNasaSlideParam().mEnableSearchButton != null) {
                      int i1 = (i.M > null)? a1.d(R.dimen.arg_RES_7f07032d): a1.d(R.dimen.arg_RES_7f070262);
                      layoutParams.rightMargin = i1;
                      layoutParams.leftMargin = a1.d(0x7f070354);
                   }
                }
             }else {
                layoutParams = objArray;
             }
             if (objArray1 != null) {
                objArray1.setLayoutParams(layoutParams);
             }
             s = i.u;
             Objects.requireNonNull(s, str3);
             i.u = s.inflate();
             if (!PatchProxy.applyVoid(objArray, i, oz, "16")) {
                i.w = m1.f(i.u, 0x7f0a3356);
                i.v = m1.f(i.u, 0x7f0a3360);
                s = i.w;
                if (s != null) {
                   s.setOnClickListener(new d0(i));
                }
                k ok = k.class;
                if (!PatchProxy.applyVoid(objArray, i, oz, "26")) {
                   z v = i.v;
                   if (v != null) {
                      AnimatorSet uAnimatorSet = PatchProxy.applyOneRefs(v, objArray, ok, "5");
                      String str4 = 1;
                      a = null;
                      boolean b1 = 300;
                      boolean b2 = 2;
                      String str5 = "target";
                      if (uAnimatorSet != patchProxyRe) {
                      }else {
                         a.p(v, str5);
                         uAnimatorSet = new AnimatorSet();
                         ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(v, View.SCALE_X, new float[b2]{0x3f800000,0});
                         a.o(objectAnimat2, "collapseX");
                         objectAnimat2.setDuration(b1);
                         objectAnimat2.setInterpolator(new AccelerateInterpolator());
                         ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(v, View.SCALE_Y, new float[b2]{0x3f800000,0});
                         a.o(objectAnimat3, "collapseY");
                         objectAnimat3.setDuration(b1);
                         objectAnimat3.setInterpolator(new AccelerateInterpolator());
                         Animator[] uAnimatorArr1 = new Animator[b2];
                         uAnimatorArr1[a] = objectAnimat2;
                         uAnimatorArr1[str4] = objectAnimat3;
                         uAnimatorSet.playTogether(uAnimatorArr1);
                      }
                      i.x = uAnimatorSet;
                      if (uAnimatorSet != null) {
                         uAnimatorSet.addListener(new a0(i));
                      }
                      AnimatorSet uAnimatorSet1 = PatchProxy.applyOneRefs(v, null, ok, "6");
                      if (uAnimatorSet1 != patchProxyRe) {
                      }else {
                         a.p(v, str5);
                         uAnimatorSet1 = new AnimatorSet();
                         ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(v, View.SCALE_X, new float[b2]{0,0x3f800000});
                         a.o(objectAnimat, "expandX");
                         objectAnimat.setDuration(b1);
                         objectAnimat.setInterpolator(new DecelerateInterpolator());
                         ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(v, View.SCALE_Y, new float[b2]{0,0x3f800000});
                         a.o(objectAnimat1, "expandY");
                         objectAnimat1.setDuration(b1);
                         objectAnimat1.setInterpolator(new DecelerateInterpolator());
                         Animator[] uAnimatorArr = new Animator[b2];
                         uAnimatorArr[a] = objectAnimat;
                         uAnimatorArr[str4] = objectAnimat1;
                         uAnimatorSet1.playTogether(uAnimatorArr);
                      }
                      i.y = uAnimatorSet1;
                      if (uAnimatorSet1 != null) {
                         uAnimatorSet1.addListener(new b0(i));
                      }
                   }
                }
             }
          label_01d8 :
             if (!PatchProxy.applyVoid(null, i, oz, "11")) {
                i.A = m1.f(i.u, 0x7f0a3358);
                i.B = m1.f(i.u, 0x7f0a3357);
                i.C = m1.f(i.u, 0x7f0a3f24);
                i.F = m1.f(i.u, 0x7f0a3f25);
                i.G = m1.f(i.u, 0x7f0a3f26);
                i.D = m1.f(i.u, 0x7f0a3f28);
                i.E = m1.f(i.u, 0x7f0a3f27);
                i.H = m1.f(i.u, 0x7f0a3f29);
             }
          }
       }
    label_024a :
       oz = i.t;
       String str = "mFollowSlideInjectAdapter";
       if (oz == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = oz.O();
       if (slidePlayVie != null) {
          slidePlayVie.i(i.N);
       }
       oz = i.t;
       if (oz == null) {
          a.S(str);
       }
       Objects.requireNonNull(oz);
       if (!PatchProxy.applyVoidOneRefs(i, oz, w.class, "9")) {
          if (oz.d != null) {
             oz.O().E(i);
          }else {
             oz.n.add(i);
          }
       }
       this.Y8();
       oz = i.p;
       str = "mLiveTipsEntranceState";
       if (oz == null) {
          a.S(str);
       }
       Objects.requireNonNull(oz);
       t ot = PatchProxy.apply(null, oz, uod, "2");
       if (ot != patchProxyRe) {
       }else {
          ot = oz.b.observable();
          a.o(ot, "mFollowLiveTipsNumber.observable\(\)");
          d d2 = oz.d;
          c = oz.c;
          if (c != null && (!c.isDetached() && c.getActivity() != null)) {
             ot3 = ot.compose(c.Ug(FragmentEvent.DESTROY));
             a.o(ot3, "observable.compose\(fragm¡­t\(FragmentEvent.DESTROY\)\)");
          }else if(d2 != null && (!d2.isDestroyed() && !d2.isFinishing())){
             ot3 = ot.compose(d2.E2(ActivityEvent.DESTROY));
             a.o(ot3, "observable.compose\(activ¡­  ActivityEvent.DESTROY\)\)");
          }else {
             ot3 = t.empty();
             a.o(ot3, "Observable.empty\(\)");
          }
          ot = ot3;
       }
       a = c.a;
       i.X7(ot.distinctUntilChanged().subscribe(new z$d(i), a));
       oz = i.p;
       if (oz == null) {
          a.S(str);
       }
       Objects.requireNonNull(oz);
       String str1 = "1";
       t ot1 = PatchProxy.apply(null, oz, uod, str1);
       if (ot1 != patchProxyRe) {
       }else {
          t ot4 = oz.a.observable();
          a.o(ot4, "mLiveTipsEntranceShowState.observable\(\)");
          d d1 = oz.d;
          c = oz.c;
          if (c != null && (!c.isDetached() && c.getActivity() != null)) {
             ot3 = ot4.compose(c.Ug(FragmentEvent.DESTROY));
             a.o(ot3, "observable.compose\(fragm¡­t\(FragmentEvent.DESTROY\)\)");
          }else if(d1 != null && (!d1.isDestroyed() && !d1.isFinishing())){
             ot3 = ot4.compose(d1.E2(ActivityEvent.DESTROY));
             a.o(ot3, "observable.compose\(activ¡­  ActivityEvent.DESTROY\)\)");
          }else {
             ot3 = t.empty();
             a.o(ot3, "Observable.empty\(\)");
          }
          ot1 = ot3;
       }
       i.X7(ot1.distinctUntilChanged().subscribe(new z$e(i), a));
       oz = i.q;
       if (oz == null) {
          a.S("mFollowScreenState");
       }
       Objects.requireNonNull(oz);
       ot = PatchProxy.apply(null, oz, j.class, str1);
       if (ot != patchProxyRe) {
       }else if(oz.d == null){
          oz.d = RxBus.f.f(e.class).observeOn(d.a).subscribe(new i(oz));
       }
       ot = oz.a.observable();
       a.o(ot, "mPhotoScreenVisible.observable\(\)");
       j c1 = oz.c;
       j b = oz.b;
       if (b != null && (!b.isDetached() && b.getActivity() != null)) {
          ot3 = ot.compose(b.Ug(FragmentEvent.DESTROY));
          a.o(ot3, "observable.compose\(fragm¡­t\(FragmentEvent.DESTROY\)\)");
       }else if(c1 != null && (!c1.isDestroyed() && !c1.isFinishing())){
          ot3 = ot.compose(c1.E2(ActivityEvent.DESTROY));
          a.o(ot3, "observable.compose\(activ¡­  ActivityEvent.DESTROY\)\)");
       }else {
          ot3 = t.empty();
          a.o(ot3, "Observable.empty\(\)");
       }
       ot = ot3;
       i.X7(ot.distinctUntilChanged().subscribe(new z$f(i), a));
       oz = i.p;
       if (oz == null) {
          a.S(str);
       }
       Objects.requireNonNull(oz);
       t ot2 = PatchProxy.apply(null, oz, uod, "13");
       if (ot2 != patchProxyRe) {
       }else {
          ot2 = oz.e.observable();
          a.o(ot2, "mUserBannerInfosState.observable\(\)");
          d = oz.d;
          c = oz.c;
          if (c != null && (!c.isDetached() && c.getActivity() != null)) {
             ot3 = ot2.compose(c.Ug(FragmentEvent.DESTROY));
             a.o(ot3, "observable.compose\(fragm¡­t\(FragmentEvent.DESTROY\)\)");
          }else if(d != null && (!d.isDestroyed() && !d.isFinishing())){
             ot3 = ot2.compose(d.E2(ActivityEvent.DESTROY));
             a.o(ot3, "observable.compose\(activ¡­  ActivityEvent.DESTROY\)\)");
          }else {
             ot3 = t.empty();
             a.o(ot3, "Observable.empty\(\)");
          }
          ot2 = ot3;
       }
       i.X7(ot2.distinctUntilChanged().subscribe(new z$g(i), a));
       this.V8();
       return;
    }
    public void F1(){
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, z.class, "3")) {
          return;
       }
       f.a = 0;
       f.b = 0;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, z.class, "17")) {
          return;
       }
       z tt = this.t;
       String str = "mFollowSlideInjectAdapter";
       if (tt == null) {
          a.S(str);
       }
       Objects.requireNonNull(tt);
       if (!PatchProxy.applyVoidOneRefs(this, tt, w.class, "10")) {
          if (tt.d != null) {
             tt.O().g0(this);
          }else {
             tt.n.remove(this);
          }
       }
       tt = this.t;
       if (tt == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = tt.O();
       if (slidePlayVie != null) {
          slidePlayVie.g(this.N);
       }
       return;
    }
    public final void S8(int p0){
       z oz = z.class;
       if (PatchProxy.isSupport(oz) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oz, "22")) {
          return;
       }
       oz = this.L;
       if (oz != null) {
          a.m(oz);
          ViewGroup$LayoutParams layoutParams = oz.getLayoutParams();
          if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
             z tL = this.L;
             a.m(tL);
             layoutParams.rightMargin = p0;
             tL.setLayoutParams(layoutParams);
          }
          z tL1 = this.L;
          a.m(tL1);
          tL1.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void V8(){
       int b;
       long l;
       z oz = z.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oz, "27")) {
          return;
       }
       z tt = this.t;
       String str = "mFollowSlideInjectAdapter";
       if (tt == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = tt.O();
       QPhoto currentPhoto = (slidePlayVie != null)? slidePlayVie.getCurrentPhoto(): objArray;
       int i = 1;
       if (currentPhoto != null) {
          QPhoto mEntity = currentPhoto.mEntity;
          if (mEntity != null && (!r1.D3(mEntity) && (!r1.D2(mEntity) && (r1.f2(mEntity) || r1.X2(mEntity))))) {
             f.b = f.g() + i;
          }
       }
       int i1 = f.g();
       FollowLiveTipsGuideConfig$LiveTipsSimpleGuide liveTipsSimp = f.e();
       if (liveTipsSimp != null && i1 == liveTipsSimp.mConsumePhotoNum) {
          FollowLiveTipsGuideConfig$LiveTipsSimpleGuide obj = PatchProxy.apply(objArray, this, oz, "28");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             oz = this.t;
             if (oz == null) {
                a.S(str);
             }
             SlidePlayViewModel slidePlayVie1 = oz.O();
             b = (slidePlayVie1 != null)? slidePlayVie1.a0(): 0;
             z tt1 = this.t;
             if (tt1 == null) {
                a.S(str);
             }
             SlidePlayViewModel slidePlayVie2 = tt1.O();
             if (slidePlayVie2 == null || slidePlayVie2.G0(b) != 12) {
                i = 0;
             }
             b = i;
          }
          if (!b) {
             obj = f.e();
             obj = (obj != null)? obj.mConsumePhotoTime: 1000;
             this.X7(t.timer(obj, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new z$b(this, currentPhoto)));
          }
       }
    label_00b7 :
       return;
    }
    public final boolean W8(){
       boolean b;
       z obj = PatchProxy.apply(null, this, z.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q;
       if (obj == null) {
          a.S("mFollowScreenState");
       }
       if (obj.b()) {
          obj = this.p;
          if (obj == null) {
             a.S("mLiveTipsEntranceState");
          }
          if (obj.b() > 0) {
             obj = this.p;
             if (obj == null) {
                a.S("mLiveTipsEntranceState");
             }
             if (obj.c()) {
                b = true;
             label_0042 :
                return b;
             }
          }
       }
    label_0041 :
       b = false;
       goto label_0042 ;
    }
    public final boolean X8(){
       z obj = PatchProxy.apply(null, this, z.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.W8()) {
          obj = this.r;
          if (obj == null) {
             a.S("mFollowViewPagerState");
          }
          if (obj.b()) {
             obj = this.t;
             if (obj == null) {
                a.S("mFollowSlideInjectAdapter");
             }
             SlidePlayViewModel slidePlayVie = obj.O();
             Float uFloat = (slidePlayVie != null)? Float.valueOf(slidePlayVie.b1()): Integer.valueOf(b);
             if (a.g(uFloat, Float.valueOf(0))) {
                b = true;
             }
          }
       }
    label_0052 :
       return b;
    }
    public final void Y8(){
       z oz = z.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oz, "9")) {
          return;
       }
       if (this.X8()) {
          this.a9();
       }else if(PatchProxy.applyVoid(objArray, this, oz, "21")){
          c.a(KsLogFollowTag.FOLLOW_NIRVANA.appendTag("FollowSlideLiveTipsV2Presenter"), "hidePymiLiveTipsDirectly");
          View[] viewArray = new View[]{this.v};
          n.Z(8, viewArray);
          this.S8(a1.e(63.00f));
       }
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, z.class, "20")) {
          return;
       }
       c.a(KsLogFollowTag.FOLLOW_NIRVANA.appendTag("FollowSlideLiveTipsV2Presenter"), "hidePymiLiveTips");
       z tp = this.p;
       if (tp == null) {
          a.S("mLiveTipsEntranceState");
       }
       if (tp.c()) {
          tp = this.y;
          if (tp != null) {
             tp.cancel();
          }
       }else {
          tp = this.v;
          if (tp != null && !tp.getVisibility()) {
             tp = this.s;
             if (tp == null) {
                a.S("mNasaBizParam");
             }
             NasaSlideParam nasaSlidePar = tp.getNasaSlideParam();
             a.o(nasaSlidePar, "mNasaBizParam.nasaSlideParam");
             if (nasaSlidePar.isFollowNasaDetail()) {
                View[] viewArray = new View[]{this.v};
                n.Z(8, viewArray);
                tp = this.p;
                if (tp == null) {
                   a.S("mLiveTipsEntranceState");
                }
                tp.d(0);
             }else {
                tp = this.x;
                if (tp != null) {
                   tp.start();
                }
             }
          }
       }
       this.S8(a1.e(63.00f));
       return;
    }
    public final void a9(){
       a a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, z.class, "18")) {
          return;
       }
       if (!this.X8()) {
          return;
       }
       z tv = this.v;
       if (tv != null && !tv.getScaleX() - null) {
          tv = this.v;
          float f = 0x3f800000;
          if (tv != null) {
             tv.setScaleX(f);
          }
          tv = this.v;
          if (tv != null) {
             tv.setScaleY(f);
          }
       }
    label_0030 :
       c.a(KsLogFollowTag.FOLLOW_NIRVANA.appendTag("FollowSlideLiveTipsV2Presenter"), "showLiveTipsDirectly");
       int i = 1;
       View[] viewArray = new View[i];
       viewArray[0] = this.v;
       n.Z(0, viewArray);
       z tz = this.z;
       if (tz != null) {
          objArray = tz.get();
       }
       if (a.g(objArray, Boolean.FALSE)) {
          z tz1 = this.z;
          if (tz1 != null) {
             tz1.set(Boolean.TRUE);
          }
          this.J = i;
          a = a.a;
          tz1 = this.t;
          if (tz1 == null) {
             a.S("mFollowSlideInjectAdapter");
          }
          e0 uoe0 = tz1.N();
          tz = this.p;
          if (tz == null) {
             a.S("mLiveTipsEntranceState");
          }
          a.b(uoe0, tz.b(), Integer.valueOf(this.J));
       }
       this.S8(a1.e(110.00f));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       this.u = m1.f(p0, 0x7f0a366a);
       this.L = m1.f(p0, 0x7f0a375f);
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, z.class, "25")) {
          return;
       }
       this.Y8();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       Object obj = this.r8("NIRVANA_FOLLOW_LIVE_TIPS_ENTRANCE_STATE");
       a.o(obj, "inject\(FollowAccessIds.N¡­LIVE_TIPS_ENTRANCE_STATE\)");
       this.p = obj;
       obj = this.r8("NIRVANA_FOLLOW_SCREEN_STATE");
       a.o(obj, "inject\(FollowAccessIds.N¡­VANA_FOLLOW_SCREEN_STATE\)");
       this.q = obj;
       obj = this.r8("NIRVANA_FOLLOW_VIEW_PAGER_STATE");
       a.o(obj, "inject\(FollowAccessIds.N¡­_FOLLOW_VIEW_PAGER_STATE\)");
       this.r = obj;
       obj = this.q8(NasaBizParam.class);
       a.o(obj, "inject\(NasaBizParam::class.java\)");
       this.s = obj;
       this.z = this.x8("FOLLOW_LIVE_TIPS_SHOW");
       obj = this.q8(w.class);
       a.o(obj, "inject\(FollowSlideInjectAdapter::class.java\)");
       this.t = obj;
       return;
    }
    public void k1(){
    }
}
