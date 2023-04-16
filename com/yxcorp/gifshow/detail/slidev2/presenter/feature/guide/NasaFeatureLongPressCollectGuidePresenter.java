package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter$a;
import nsd.u;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter$mGuider$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter$c;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.component.tti.TTIStrategy;
import j8a.a;
import j8a.d1;
import vy6.a;
import java.util.Set;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter$d;
import erd.g;
import crd.b;
import brd.t;
import lnc.u1;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import kp.r1;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.CollectGuideInfo;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager$a;
import im8.f;
import android.app.Activity;
import com.yxcorp.utility.n;
import xx9.a;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import com.kwai.feature.api.feed.home.common.SlideGuideManager$a;
import java.util.Objects;
import oe6.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import android.view.View;
import r7a.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rf5.u;
import cda.c;

public final class NasaFeatureLongPressCollectGuidePresenter extends PresenterV2	// class@00197d
{
    public final p A;
    public Runnable B;
    public boolean C;
    public SlidePlayViewModel D;
    public final a E;
    public final k3 F;
    public final p G;
    public QPhoto p;
    public u q;
    public f r;
    public f s;
    public Set t;
    public a u;
    public f v;
    public View w;
    public t x;
    public BaseFragment y;
    public View z;
    public static final NasaFeatureLongPressCollectGuidePresenter$a H;

    static {
       NasaFeatureLongPressCollectGuidePresenter.H = new NasaFeatureLongPressCollectGuidePresenter$a(null);
    }
    public void NasaFeatureLongPressCollectGuidePresenter(){
       super();
       this.A = s.c(new NasaFeatureLongPressCollectGuidePresenter$mGuider$2(this));
       this.E = new NasaFeatureLongPressCollectGuidePresenter$b(this);
       this.F = new NasaFeatureLongPressCollectGuidePresenter$c(this);
       this.G = s.b(LazyThreadSafetyMode.NONE, new NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, NasaFeatureLongPressCollectGuidePresenter.class, "24")) {
          return;
       }
       NasaFeatureLongPressCollectGuidePresenter ty = this.y;
       String str = "mFragment";
       if (ty == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(ty.requireParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(m¡­.requireParentFragment\(\)\)");
       this.D = slidePlayVie;
       if (this.P8()) {
          TTIStrategy.c = true;
          this.S8().S();
          this.W8();
          ty = this.D;
          if (ty == null) {
             a.S("mSlidePlayViewModel");
          }
          NasaFeatureLongPressCollectGuidePresenter ty1 = this.y;
          if (ty1 == null) {
             a.S(str);
          }
          ty.P(ty1, this.E);
          ty = this.t;
          if (ty != null) {
             ty.add(this.F);
          }
          ty = this.x;
          if (ty == null) {
             a.S("mCancelGuideObservable");
          }
          this.X7(ty.subscribe(new NasaFeatureLongPressCollectGuidePresenter$d(this)));
          u1.a(this);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, NasaFeatureLongPressCollectGuidePresenter.class, "25")) {
          return;
       }
       k1.m(this.V8());
       NasaFeatureLongPressCollectGuidePresenter tD = this.D;
       if (tD == null) {
          a.S("mSlidePlayViewModel");
       }
       NasaFeatureLongPressCollectGuidePresenter ty = this.y;
       if (ty == null) {
          a.S("mFragment");
       }
       tD.D(ty, this.E);
       tD = this.t;
       if (tD != null) {
          tD.remove(this.F);
       }
       u1.b(this);
       return;
    }
    public final boolean P8(){
       NasaFeatureLongPressCollectGuidePresenter obj = PatchProxy.apply(null, this, NasaFeatureLongPressCollectGuidePresenter.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p;
       String str = "mPhoto";
       if (obj == null) {
          a.S(str);
       }
       boolean b = true;
       if (!obj.isAtlasPhotos()) {
          obj = this.p;
          if (obj == null) {
             a.S(str);
          }
          if (!obj.isLongPhotos()) {
             obj = this.p;
             if (obj == null) {
                a.S(str);
             }
             if (!obj.isAd()) {
                obj = this.p;
                if (obj == null) {
                   a.S(str);
                }
                if (!r1.w3(obj)) {
                   obj = this.p;
                   if (obj == null) {
                      a.S(str);
                   }
                   PhotoMeta photoMeta = obj.getPhotoMeta();
                   if (photoMeta != null) {
                      photoMeta = photoMeta.mCollectGuideInfo;
                      if (photoMeta != null && (photoMeta.mEnableStrongGuide == b && NasaFeatureGuideManager.e.a().i())) {
                         obj = this.r;
                         if (obj == null) {
                            a.S("mHasShownGuide");
                         }
                         if (!obj.get().booleanValue() && !n.I(this.getActivity())) {
                            obj = this.u;
                            if (obj == null) {
                               a.S("mScreenCleanStatusCombination");
                            }
                            if (!obj.c()) {
                               obj = this.p;
                               if (obj == null) {
                                  a.S(str);
                               }
                               if (!obj.isSerialPayPhoto() && !SlideGuideManager.m.a().b(this.getActivity())) {
                               label_00b9 :
                                  return b;
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
    label_00b8 :
       b = false;
       goto label_00b9 ;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, NasaFeatureLongPressCollectGuidePresenter.class, "22")) {
          return;
       }
       this.S8().h();
       NasaFeatureLongPressCollectGuidePresenter tr = this.r;
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
    public final a S8(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureLongPressCollectGuidePresenter.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.A.getValue();
    }
    public final Runnable V8(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureLongPressCollectGuidePresenter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G.getValue();
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, NasaFeatureLongPressCollectGuidePresenter.class, "27")) {
          return;
       }
       k1.m(this.B);
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, NasaFeatureLongPressCollectGuidePresenter.class, "23")) {
          return;
       }
       NasaFeatureGuideManager nasaFeatureG = NasaFeatureGuideManager.e.a();
       Objects.requireNonNull(nasaFeatureG);
       NasaFeatureGuideManager nasaFeatureG1 = NasaFeatureGuideManager.class;
       if (!PatchProxy.isSupport(nasaFeatureG1) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, nasaFeatureG, nasaFeatureG1, "17")) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean("ShouldShowLongPressCollectHint", false);
          g.a(uEditor);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaFeatureLongPressCollectGuidePresenter.class, "20")) {
          return;
       }
       Activity activity = this.getActivity();
       activity = (activity != null)? activity.findViewById(R.id.profile_photos_layout): null;
       this.z = activity;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NasaFeatureLongPressCollectGuidePresenter.class, "1")) {
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
       this.t = this.t8("DETAIL_SCREEN_TOUCH_LISTENER");
       Object obj1 = this.r8("NASA_SIDEBAR_STATUS");
       a.o(obj1, "inject\(DetailAccessIds.NASA_SIDEBAR_STATUS\)");
       this.v = obj1;
       obj1 = this.r8("DETAIL_CANCEL_GUIDE_OBSERVABLE");
       a.o(obj1, "inject\(DetailAccessIds.D¡­_CANCEL_GUIDE_OBSERVABLE\)");
       this.x = obj1;
       obj1 = this.r8("DETAIL_FRAGMENT");
       a.o(obj1, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.y = obj1;
       obj1 = this.r8("DETAIL_PARENT_VIEW");
       a.o(obj1, "inject\(AccessIds.DETAIL_PARENT_VIEW\)");
       this.w = obj1;
       obj1 = this.q8(u.class);
       a.o(obj1, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.q = obj1;
       obj1 = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       a.o(obj1, "inject\(DetailAccessIds.DETAIL_SCREEN_CLEAN_STATUS\)");
       this.u = obj1;
       return;
    }
    public final void onEventMainThread(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaFeatureLongPressCollectGuidePresenter.class, "21")) {
          return;
       }
       a.p(p0, "event");
       if (p0.a == 1) {
          this.X8();
       }
       return;
    }
}
