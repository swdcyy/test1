package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureScaleCleanGuidePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureScaleCleanGuidePresenter$a;
import nsd.u;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureScaleCleanGuidePresenter$mGuider$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureScaleCleanGuidePresenter$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureScaleCleanGuidePresenter$c;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import j8a.b1;
import j8a.d1;
import vy6.a;
import java.util.Set;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.entity.QPhoto;
import kp.r1;
import com.yxcorp.gifshow.model.CDNUrl;
import p5a.b;
import ekd.j;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager$a;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import im8.f;
import android.app.Activity;
import com.yxcorp.utility.n;
import xx9.a;
import wh5.c;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import com.kwai.feature.api.feed.home.common.SlideGuideManager$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import rf5.u;

public final class FeatureScaleCleanGuidePresenter extends PresenterV2	// class@00195b
{
    public final a A;
    public final k3 B;
    public final p C;
    public QPhoto p;
    public u q;
    public f r;
    public f s;
    public a t;
    public Set u;
    public BaseFragment v;
    public NasaBizParam w;
    public View x;
    public SlidePlayViewModel y;
    public final p z;
    public static final FeatureScaleCleanGuidePresenter$a D;

    static {
       FeatureScaleCleanGuidePresenter.D = new FeatureScaleCleanGuidePresenter$a(null);
    }
    public void FeatureScaleCleanGuidePresenter(){
       super();
       this.z = s.c(new FeatureScaleCleanGuidePresenter$mGuider$2(this));
       this.A = new FeatureScaleCleanGuidePresenter$b(this);
       this.B = new FeatureScaleCleanGuidePresenter$c(this);
       this.C = s.b(LazyThreadSafetyMode.NONE, new FeatureScaleCleanGuidePresenter$mShowGuideRunnable$2(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, FeatureScaleCleanGuidePresenter.class, "4")) {
          return;
       }
       FeatureScaleCleanGuidePresenter tv = this.v;
       String str = "mFragment";
       if (tv == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tv.requireParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(m¡­.requireParentFragment\(\)\)");
       this.y = slidePlayVie;
       if (this.P8()) {
          this.S8().S();
          tv = this.y;
          if (tv == null) {
             a.S("mSlidePlayViewModel");
          }
          FeatureScaleCleanGuidePresenter tv1 = this.v;
          if (tv1 == null) {
             a.S(str);
          }
          tv.P(tv1, this.A);
          tv = this.u;
          if (tv != null) {
             tv.add(this.B);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, FeatureScaleCleanGuidePresenter.class, "10")) {
          return;
       }
       k1.m(this.V8());
       FeatureScaleCleanGuidePresenter ty = this.y;
       if (ty == null) {
          a.S("mSlidePlayViewModel");
       }
       FeatureScaleCleanGuidePresenter tv = this.v;
       if (tv == null) {
          a.S("mFragment");
       }
       ty.D(tv, this.A);
       ty = this.u;
       if (ty != null) {
          ty.remove(this.B);
       }
       return;
    }
    public final boolean P8(){
       boolean b1;
       FeatureScaleCleanGuidePresenter tr;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FeatureScaleCleanGuidePresenter uFeatureScal = FeatureScaleCleanGuidePresenter.class;
       FeatureScaleCleanGuidePresenter obj = PatchProxy.apply(null, this, uFeatureScal, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.w;
       if (obj == null) {
          a.S("mNasaBizParam");
       }
       NasaSlideParam nasaSlidePar = obj.getNasaSlideParam();
       a.o(nasaSlidePar, "mNasaBizParam.nasaSlideParam");
       boolean b = false;
       if (nasaSlidePar.isHomeFeatureStyle()) {
          obj = this.y;
          if (obj == null) {
             a.S("mSlidePlayViewModel");
          }
          if (obj.a0() >= 5) {
             obj = this.p;
             if (obj == null) {
                a.S("mPhoto");
             }
             if (!obj.isAd()) {
                obj = this.p;
                if (obj == null) {
                   a.S("mPhoto");
                }
                if (!r1.w3(obj)) {
                   obj = this.p;
                   if (obj == null) {
                      a.S("mPhoto");
                   }
                   if (!obj.isHdr()) {
                      obj = this.p;
                      if (obj == null) {
                         a.S("mPhoto");
                      }
                      if (obj.isSinglePhoto()) {
                         obj = this.p;
                         if (obj == null) {
                            a.S("mPhoto");
                         }
                         if (j.h(b.b(obj))) {
                         label_0112 :
                            return b;
                         }
                      }
                      obj = this.p;
                      if (obj == null) {
                         a.S("mPhoto");
                      }
                      if (!r1.l3(obj.mEntity) && NasaFeatureGuideManager.e.a().a()) {
                         Object obj1 = PatchProxy.apply(null, this, uFeatureScal, "6");
                         if (obj1 != patchProxyRe) {
                            b1 = obj1.booleanValue();
                         }else {
                            tr = this.p;
                            if (tr == null) {
                               a.S("mPhoto");
                            }
                            PhotoMeta photoMeta = tr.getPhotoMeta();
                            if (photoMeta != null) {
                               photoMeta = photoMeta.mEnableClsGuide;
                            }else {
                               photoMeta = null;
                            }
                         }
                         if (b1 != null || !NasaExperimentUtils.E()) {
                            tr = this.r;
                            if (tr == null) {
                               a.S("mHasShownGuide");
                            }
                            if (!tr.get().booleanValue() && !n.I(this.getActivity())) {
                               tr = this.t;
                               if (tr == null) {
                                  a.S("mScreenCleanStatusCombination");
                               }
                               if (!tr.c() && (!c.b() && (!VisitorModeManager.f() && !SlideGuideManager.m.a().b(this.getActivity())))) {
                                  b = true;
                                  goto label_0112 ;
                               }else {
                                  goto label_0112 ;
                               }
                            }else {
                               goto label_0112 ;
                            }
                         }else {
                            goto label_0112 ;
                         }
                      }else {
                         goto label_0112 ;
                      }
                   }else {
                      goto label_0112 ;
                   }
                }else {
                   goto label_0112 ;
                }
             }else {
                goto label_0112 ;
             }
          }else {
             goto label_0112 ;
          }
       }else {
          goto label_0112 ;
       }
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, FeatureScaleCleanGuidePresenter.class, "7")) {
          return;
       }
       this.S8().h();
       FeatureScaleCleanGuidePresenter tr = this.r;
       if (tr == null) {
          a.S("mHasShownGuide");
       }
       tr.set(Boolean.FALSE);
       tr = this.s;
       if (tr == null) {
          a.S("mCanClearScreen");
       }
       tr.set(Boolean.TRUE);
       return;
    }
    public final b1 S8(){
       Object obj = PatchProxy.apply(null, this, FeatureScaleCleanGuidePresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getValue();
    }
    public final Runnable V8(){
       Object obj = PatchProxy.apply(null, this, FeatureScaleCleanGuidePresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FeatureScaleCleanGuidePresenter.class, "3")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.x8("DETAIL_HAS_SHOWN_GUIDE");
       a.o(obj, "injectRef\(AccessIds.DETAIL_HAS_SHOWN_GUIDE\)");
       this.r = obj;
       obj = this.x8("DETAIL_CAN_CLEAR_SCREEN");
       a.o(obj, "injectRef\(AccessIds.DETAIL_CAN_CLEAR_SCREEN\)");
       this.s = obj;
       this.u = this.t8("DETAIL_SCREEN_TOUCH_LISTENER");
       Object obj1 = this.r8("DETAIL_FRAGMENT");
       a.o(obj1, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.v = obj1;
       obj1 = this.r8("DETAIL_PARENT_VIEW");
       a.o(obj1, "inject\(AccessIds.DETAIL_PARENT_VIEW\)");
       this.x = obj1;
       obj1 = this.q8(u.class);
       a.o(obj1, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.q = obj1;
       obj1 = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       a.o(obj1, "inject\(DetailAccessIds.DETAIL_SCREEN_CLEAN_STATUS\)");
       this.t = obj1;
       obj1 = this.q8(NasaBizParam.class);
       a.o(obj1, "inject\(NasaBizParam::class.java\)");
       this.w = obj1;
       return;
    }
}
