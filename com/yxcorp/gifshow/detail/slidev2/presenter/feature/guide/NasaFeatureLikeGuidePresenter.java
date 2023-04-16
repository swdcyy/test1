package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$a;
import nsd.u;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$c;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$mSidebarStatusListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$d;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import j8a.f0;
import j8a.d1;
import vy6.a;
import jta.c;
import r7a.f;
import java.util.Set;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$e;
import erd.g;
import crd.b;
import brd.t;
import tkd.b;
import tkd.d;
import ayb.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import fda.b;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$onBind$2;
import j8a.g0;
import msd.l;
import lnc.u1;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.entity.QPhoto;
import im8.f;
import android.app.Activity;
import com.yxcorp.utility.n;
import xx9.a;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import com.kwai.feature.api.feed.home.common.SlideGuideManager$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$b;
import android.view.ViewConfiguration;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import hn5.n;
import hn5.m;
import android.content.Context;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fda.c;
import java.util.Objects;
import oe6.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import mvb.c;

public final class NasaFeatureLikeGuidePresenter extends PresenterV2	// class@001974
{
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public Runnable E;
    public boolean F;
    public boolean G;
    public SlidePlayViewModel H;
    public NasaBizParam I;
    public final a J;
    public final p K;
    public final k3 L;
    public final p M;
    public QPhoto p;
    public f q;
    public f r;
    public a s;
    public Set t;
    public f u;
    public View v;
    public t w;
    public BaseFragment x;
    public View y;
    public f0 z;
    public static final NasaFeatureLikeGuidePresenter$a N;

    static {
       NasaFeatureLikeGuidePresenter.N = new NasaFeatureLikeGuidePresenter$a(null);
    }
    public void NasaFeatureLikeGuidePresenter(){
       super();
       this.J = new NasaFeatureLikeGuidePresenter$c(this);
       this.K = s.c(new NasaFeatureLikeGuidePresenter$mSidebarStatusListener$2(this));
       this.L = new NasaFeatureLikeGuidePresenter$d(this);
       this.M = s.b(LazyThreadSafetyMode.NONE, new NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2(this));
    }
    public void E8(){
       boolean b1;
       NasaFeatureLikeGuidePresenter tv;
       NasaFeatureLikeGuidePresenter nasaFeatureL = NasaFeatureLikeGuidePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nasaFeatureL, "27")) {
          return;
       }
       NasaFeatureLikeGuidePresenter tx = this.x;
       if (tx == null) {
          a.S("mFragment");
       }
       Fragment parentFragme = tx.getParentFragment();
       a.m(parentFragme);
       this.H = SlidePlayViewModel.B0(parentFragme);
       b obj = PatchProxy.apply(objArray, this, nasaFeatureL, "30");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(this.Z8()){
          nasaFeatureL = this.H;
          if (nasaFeatureL != null) {
             objArray = Boolean.valueOf(nasaFeatureL.r());
          }
          a.m(objArray);
          if (!objArray.booleanValue()) {
             b1 = true;
          }
       }
       b1 = false;
       this.A = b1;
       nasaFeatureL = this.y;
       if (nasaFeatureL != null && !nasaFeatureL.getTranslationX() - null) {
          b = true;
       }
       this.G = b;
       if (this.P8()) {
          if (this.z == null) {
             tv = this.v;
             if (tv == null) {
                a.S("mDetailParentView");
             }
             this.z = new f0(tv);
          }
          nasaFeatureL = this.z;
          a.m(nasaFeatureL);
          nasaFeatureL.S();
          this.a9();
          nasaFeatureL = this.H;
          if (nasaFeatureL != null) {
             tv = this.x;
             if (tv == null) {
                a.S("mFragment");
             }
             nasaFeatureL.P(tv, this.J);
          }
          nasaFeatureL = this.u;
          if (nasaFeatureL == null) {
             a.S("mSidebarStatusHelper");
          }
          nasaFeatureL.a(this.X8());
          nasaFeatureL = this.t;
          if (nasaFeatureL == null) {
             a.S("mDispatchListeners");
          }
          nasaFeatureL.add(this.L);
          nasaFeatureL = this.w;
          if (nasaFeatureL == null) {
             a.S("mCancelGuideObservable");
          }
          this.X7(nasaFeatureL.subscribe(new NasaFeatureLikeGuidePresenter$e(this)));
          obj = d.a(0x4f878389);
          a.o(obj, "PluginManager.get\(GrowthPlugin::class.java\)");
          if (obj.CJ()) {
             this.B = true;
             this.X7(RxBus.f.g(b.class, RxBus$ThreadMode.MAIN).subscribe(new g0(new NasaFeatureLikeGuidePresenter$onBind$2(this))));
          }
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, NasaFeatureLikeGuidePresenter.class, "25")) {
          return;
       }
       u1.a(this);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, NasaFeatureLikeGuidePresenter.class, "26")) {
          return;
       }
       u1.b(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, NasaFeatureLikeGuidePresenter.class, "29")) {
          return;
       }
       if (this.A != null) {
          k1.m(this.W8());
          NasaFeatureLikeGuidePresenter tH = this.H;
          if (tH != null) {
             NasaFeatureLikeGuidePresenter tx = this.x;
             if (tx == null) {
                a.S("mFragment");
             }
             tH.D(tx, this.J);
          }
          tH = this.u;
          if (tH == null) {
             a.S("mSidebarStatusHelper");
          }
          tH.c(this.X8());
          tH = this.t;
          if (tH == null) {
             a.S("mDispatchListeners");
          }
          tH.remove(this.L);
       }
       return;
    }
    public final boolean P8(){
       boolean b;
       NasaFeatureLikeGuidePresenter obj = PatchProxy.apply(null, this, NasaFeatureLikeGuidePresenter.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p;
       String str = "mPhoto";
       if (obj == null) {
          a.S(str);
       }
       if (!obj.isAtlasPhotos()) {
          obj = this.p;
          if (obj == null) {
             a.S(str);
          }
          if (!obj.isLongPhotos() && this.Z8()) {
             obj = this.q;
             if (obj == null) {
                a.S("mHasShownGuide");
             }
             if (!obj.get().booleanValue() && !n.I(this.getActivity())) {
                obj = this.s;
                if (obj == null) {
                   a.S("mScreenCleanStatusCombination");
                }
                if (!obj.c()) {
                   obj = this.p;
                   if (obj == null) {
                      a.S(str);
                   }
                   if (!obj.isSerialPayPhoto()) {
                      obj = this.p;
                      if (obj == null) {
                         a.S(str);
                      }
                      if (!obj.isLiked() && !SlideGuideManager.m.a().b(this.getActivity())) {
                         b = true;
                      label_0091 :
                         return b;
                      }
                   }
                }
             }
          }
       }
    label_0090 :
       b = false;
       goto label_0091 ;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, NasaFeatureLikeGuidePresenter.class, "22")) {
          return;
       }
       k1.m(this.W8());
       NasaFeatureLikeGuidePresenter tz = this.z;
       if (tz != null) {
          tz.h();
       }
       tz = this.q;
       if (tz == null) {
          a.S("mHasShownGuide");
       }
       tz.set(Boolean.FALSE);
       tz = this.r;
       if (tz == null) {
          a.S("mCanClearScreen");
       }
       tz.set(Boolean.TRUE);
       if (this.E == null) {
          this.E = new NasaFeatureLikeGuidePresenter$b(this);
       }
       k1.r(this.E, (long)ViewConfiguration.getJumpTapTimeout());
       return;
    }
    public final f S8(){
       NasaFeatureLikeGuidePresenter obj = PatchProxy.apply(null, this, NasaFeatureLikeGuidePresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("mCanClearScreen");
       }
       return obj;
    }
    public final f V8(){
       NasaFeatureLikeGuidePresenter obj = PatchProxy.apply(null, this, NasaFeatureLikeGuidePresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("mHasShownGuide");
       }
       return obj;
    }
    public final Runnable W8(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureLikeGuidePresenter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.M.getValue();
    }
    public final c X8(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureLikeGuidePresenter.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.K.getValue();
    }
    public final boolean Y8(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureLikeGuidePresenter.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.B != null) {
          return false;
       }
       int i = 0x4f878389;
       if (d.a(i).Cw(this.I, "DOUBLE_CLICK_LIKE")) {
          return true;
       }
       if (m.a().U3(this.getActivity()) && d.a(i).sN(this.I, "DOUBLE_CLICK_LIKE")) {
          return true;
       }
       return false;
    }
    public final boolean Z8(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureLikeGuidePresenter.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return NasaFeatureGuideManager.e.a().h();
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, NasaFeatureLikeGuidePresenter.class, "33")) {
          return;
       }
       k1.m(this.E);
       return;
    }
    public final void b9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaFeatureLikeGuidePresenter.class, "34")) {
          return;
       }
       if (this.B != null && !TextUtils.x(p0)) {
          this.D = false;
          c uoc = new c();
          uoc.a("like_guide");
          uoc.b(p0);
          RxBus.f.b(uoc);
       }
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, NasaFeatureLikeGuidePresenter.class, "23")) {
          return;
       }
       NasaFeatureGuideManager nasaFeatureG = NasaFeatureGuideManager.e.a();
       Objects.requireNonNull(nasaFeatureG);
       if (!PatchProxy.isSupport(NasaFeatureGuideManager.class) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, nasaFeatureG, NasaFeatureGuideManager.class, "13")) {
          a.c0(false);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaFeatureLikeGuidePresenter.class, "20")) {
          return;
       }
       Activity activity = this.getActivity();
       activity = (activity != null)? activity.findViewById(R.id.profile_photos_layout): null;
       this.y = activity;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NasaFeatureLikeGuidePresenter.class, "1")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.x8("DETAIL_HAS_SHOWN_GUIDE");
       a.o(obj, "injectRef\(AccessIds.DETAIL_HAS_SHOWN_GUIDE\)");
       this.q = obj;
       obj = this.x8("DETAIL_CAN_CLEAR_SCREEN");
       a.o(obj, "injectRef\(AccessIds.DETAIL_CAN_CLEAR_SCREEN\)");
       this.r = obj;
       Object obj1 = this.r8("DETAIL_SCREEN_TOUCH_LISTENER");
       a.o(obj1, "inject\(AccessIds.DETAIL_SCREEN_TOUCH_LISTENER\)");
       this.t = obj1;
       obj1 = this.r8("NASA_SIDEBAR_STATUS");
       a.o(obj1, "inject\(DetailAccessIds.NASA_SIDEBAR_STATUS\)");
       this.u = obj1;
       obj1 = this.r8("DETAIL_PARENT_VIEW");
       a.o(obj1, "inject\(AccessIds.DETAIL_PARENT_VIEW\)");
       this.v = obj1;
       obj1 = this.r8("DETAIL_CANCEL_GUIDE_OBSERVABLE");
       a.o(obj1, "inject\(DetailAccessIds.D¡­_CANCEL_GUIDE_OBSERVABLE\)");
       this.w = obj1;
       obj1 = this.r8("DETAIL_FRAGMENT");
       a.o(obj1, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.x = obj1;
       this.I = this.q8(NasaBizParam.class);
       obj1 = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       a.o(obj1, "inject\(DetailAccessIds.DETAIL_SCREEN_CLEAN_STATUS\)");
       this.s = obj1;
       return;
    }
    public final void onEventMainThread(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaFeatureLikeGuidePresenter.class, "21")) {
          return;
       }
       a.p(p0, "event");
       p0 = p0.a;
       if (p0 != null) {
          a.o(p0, "event.targetPhoto");
          if (p0.isLiked()) {
             this.c9();
          }
       }
       return;
    }
}
