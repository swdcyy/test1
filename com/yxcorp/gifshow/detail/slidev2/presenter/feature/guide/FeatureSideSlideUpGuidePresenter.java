package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureSideSlideUpGuidePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureSideSlideUpGuidePresenter$a;
import nsd.u;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureSideSlideUpGuidePresenter$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureSideSlideUpGuidePresenter$mSidebarStatusListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureSideSlideUpGuidePresenter$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager$a;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.slideplay.c;
import android.view.View;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.SideSlideUpGuider;
import qrd.l1;
import jta.c;
import r7a.f;
import vy6.a;
import androidx.viewpager.widget.ViewPager$i;
import im8.f;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import com.kwai.feature.api.feed.home.common.SlideGuideManager$a;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureSideSlideUpGuidePresenter$delayShowGuide$1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rf5.u;

public final class FeatureSideSlideUpGuidePresenter extends PresenterV2	// class@001963
{
    public boolean A;
    public final a B;
    public final p C;
    public final FeatureSideSlideUpGuidePresenter$c D;
    public f p;
    public boolean q;
    public f r;
    public BaseFragment s;
    public u t;
    public QPhoto u;
    public boolean v;
    public SideSlideUpGuider w;
    public Runnable x;
    public View y;
    public SlidePlayViewModel z;
    public static final FeatureSideSlideUpGuidePresenter$a E;

    static {
       FeatureSideSlideUpGuidePresenter.E = new FeatureSideSlideUpGuidePresenter$a(null);
    }
    public void FeatureSideSlideUpGuidePresenter(){
       super();
       this.B = new FeatureSideSlideUpGuidePresenter$b(this);
       this.C = s.c(new FeatureSideSlideUpGuidePresenter$mSidebarStatusListener$2(this));
       this.D = new FeatureSideSlideUpGuidePresenter$c(this);
    }
    public void E8(){
       boolean b1;
       Activity activity;
       l1 a;
       FeatureSideSlideUpGuidePresenter uFeatureSide = FeatureSideSlideUpGuidePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uFeatureSide, "14")) {
          return;
       }
       FeatureSideSlideUpGuidePresenter ts = this.s;
       if (ts == null) {
          a.S("mFragment");
       }
       Fragment parentFragme = ts.getParentFragment();
       a.m(parentFragme);
       this.z = SlidePlayViewModel.B0(parentFragme);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(objArray, this, uFeatureSide, "18");
       boolean b = false;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(NasaFeatureGuideManager.e.a().m()){
          Object obj1 = PatchProxy.apply(objArray, this, uFeatureSide, "19");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(this.q == null){
             activity = this.getActivity();
             ts = this.u;
             if (ts == null) {
                a.S("mPhoto");
             }
             if (!c.k(activity, ts)) {
                b1 = true;
             }
          }
          b1 = false;
          if (b1) {
             b1 = true;
          }
       }
       b1 = false;
       this.v = b1;
       uFeatureSide = this.y;
       if (uFeatureSide != null && !uFeatureSide.getTranslationX() - null) {
          b = true;
       }
       this.A = b;
       if (this.v != null) {
          activity = this.getActivity();
          if (activity != null) {
             a.o(activity, "it");
             objArray = new SideSlideUpGuider(activity);
             uFeatureSide = this.t;
             if (uFeatureSide == null) {
                a.S("mSwipeToProfileFeedMovement");
             }
             if (!PatchProxy.applyVoidOneRefs(uFeatureSide, objArray, SideSlideUpGuider.class, "3")) {
                a.p(uFeatureSide, "swipeToProfileFeedMovement");
                objArray.h = uFeatureSide;
             }
             a = l1.a;
          }
          this.w = objArray;
          uFeatureSide = this.p;
          if (uFeatureSide == null) {
             a.S("mSidebarStatusHelper");
          }
          uFeatureSide.a(this.V8());
          uFeatureSide = this.z;
          if (uFeatureSide != null) {
             FeatureSideSlideUpGuidePresenter ts1 = this.s;
             if (ts1 == null) {
                a.S("mFragment");
             }
             uFeatureSide.P(ts1, this.B);
          }
          uFeatureSide = this.z;
          if (uFeatureSide != null) {
             uFeatureSide.i(this.D);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, FeatureSideSlideUpGuidePresenter.class, "20")) {
          return;
       }
       if (this.v != null) {
          FeatureSideSlideUpGuidePresenter tp = this.p;
          if (tp == null) {
             a.S("mSidebarStatusHelper");
          }
          tp.c(this.V8());
          tp = this.z;
          if (tp != null) {
             FeatureSideSlideUpGuidePresenter ts = this.s;
             if (ts == null) {
                a.S("mFragment");
             }
             tp.D(ts, this.B);
          }
          tp = this.z;
          if (tp != null) {
             tp.g(this.D);
          }
          this.R8();
       }
       return;
    }
    public final boolean P8(){
       boolean b;
       FeatureSideSlideUpGuidePresenter obj = PatchProxy.apply(null, this, FeatureSideSlideUpGuidePresenter.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       String str = "mPhoto";
       if (obj == null) {
          a.S(str);
       }
       if (!obj.isAtlasPhotos()) {
          obj = this.u;
          if (obj == null) {
             a.S(str);
          }
          if (!obj.isLongPhotos()) {
             NasaFeatureGuideManager$a e = NasaFeatureGuideManager.e;
             if (e.a().m()) {
                FeatureSideSlideUpGuidePresenter tr = this.r;
                if (tr == null) {
                   a.S("mHasShownGuide");
                }
                if (!tr.get().booleanValue() && (e.a().d() > 3 && !SlideGuideManager.m.a().b(this.getActivity()))) {
                   b = true;
                label_006f :
                   return b;
                }
             }
          }
       }
    label_006e :
       b = false;
       goto label_006f ;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, FeatureSideSlideUpGuidePresenter.class, "16")) {
          return;
       }
       FeatureSideSlideUpGuidePresenter tx = this.x;
       if (tx != null) {
          k1.m(tx);
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, FeatureSideSlideUpGuidePresenter.class, "17")) {
          return;
       }
       if (this.x == null) {
          this.x = new FeatureSideSlideUpGuidePresenter$delayShowGuide$1(this);
       }
       k1.r(this.x, 5000);
       return;
    }
    public final c V8(){
       Object obj = PatchProxy.apply(null, this, FeatureSideSlideUpGuidePresenter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.getValue();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeatureSideSlideUpGuidePresenter.class, "13")) {
          return;
       }
       Activity activity = this.getActivity();
       activity = (activity != null)? activity.findViewById(R.id.profile_photos_layout): null;
       this.y = activity;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FeatureSideSlideUpGuidePresenter.class, "1")) {
          return;
       }
       f obj = this.r8("NASA_SIDEBAR_STATUS");
       a.o(obj, "inject\(DetailAccessIds.NASA_SIDEBAR_STATUS\)");
       this.p = obj;
       obj = this.r8("IS_DETAIL_FORM_PROFILE");
       a.o(obj, "inject\(AccessIds.IS_DETAIL_FORM_PROFILE\)");
       this.q = obj.booleanValue();
       obj = this.x8("DETAIL_HAS_SHOWN_GUIDE");
       a.o(obj, "injectRef\(AccessIds.DETAIL_HAS_SHOWN_GUIDE\)");
       this.r = obj;
       Object obj1 = this.r8("DETAIL_FRAGMENT");
       a.o(obj1, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.s = obj1;
       obj1 = this.q8(u.class);
       a.o(obj1, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.t = obj1;
       obj1 = this.q8(QPhoto.class);
       a.o(obj1, "inject\(QPhoto::class.java\)");
       this.u = obj1;
       return;
    }
}
