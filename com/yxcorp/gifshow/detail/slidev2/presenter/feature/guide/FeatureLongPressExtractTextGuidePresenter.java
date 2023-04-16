package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureLongPressExtractTextGuidePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureLongPressExtractTextGuidePresenter$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureLongPressExtractTextGuidePresenter$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureLongPressExtractTextGuidePresenter$mShowGuideRunnable$1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureLongPressExtractTextGuidePresenter$mGuider$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.Set;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureLongPressExtractTextGuidePresenter$c;
import erd.g;
import crd.b;
import brd.t;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import im8.f;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager$a;
import xx9.a;
import j8a.a;
import j8a.d1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import rf5.u;
import io.reactivex.subjects.PublishSubject;

public final class FeatureLongPressExtractTextGuidePresenter extends PresenterV2	// class@00194c
{
    public final FeatureLongPressExtractTextGuidePresenter$a A;
    public final k3 B;
    public final Runnable C;
    public final p D;
    public QPhoto p;
    public BaseFragment q;
    public f r;
    public f s;
    public View t;
    public u u;
    public Set v;
    public SlidePlayViewModel w;
    public PublishSubject x;
    public a y;
    public boolean z;

    public void FeatureLongPressExtractTextGuidePresenter(){
       super();
       this.A = new FeatureLongPressExtractTextGuidePresenter$a(this);
       this.B = new FeatureLongPressExtractTextGuidePresenter$b(this);
       this.C = new FeatureLongPressExtractTextGuidePresenter$mShowGuideRunnable$1(this);
       this.D = s.c(new FeatureLongPressExtractTextGuidePresenter$mGuider$2(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, FeatureLongPressExtractTextGuidePresenter.class, "3")) {
          return;
       }
       FeatureLongPressExtractTextGuidePresenter tq = this.q;
       String str = "mFragment";
       if (tq == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tq.requireParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(m¡­.requireParentFragment\(\)\)");
       this.w = slidePlayVie;
       if (!this.P8()) {
          return;
       }else {
          tq = this.w;
          if (tq == null) {
             a.S("mSlidePlayViewModel");
          }
          FeatureLongPressExtractTextGuidePresenter tq1 = this.q;
          if (tq1 == null) {
             a.S(str);
          }
          tq.P(tq1, this.A);
          tq = this.v;
          if (tq == null) {
             a.S("mDispatchListeners");
          }
          tq.add(this.B);
          this.z = false;
          tq = this.x;
          if (tq == null) {
             a.S("mExtractTextVisiblePublisher");
          }
          this.X7(tq.subscribe(new FeatureLongPressExtractTextGuidePresenter$c(this)));
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, FeatureLongPressExtractTextGuidePresenter.class, "4")) {
          return;
       }
       k1.m(this.C);
       FeatureLongPressExtractTextGuidePresenter tw = this.w;
       if (tw == null) {
          a.S("mSlidePlayViewModel");
       }
       FeatureLongPressExtractTextGuidePresenter tq = this.q;
       if (tq == null) {
          a.S("mFragment");
       }
       tw.D(tq, this.A);
       tw = this.v;
       if (tw == null) {
          a.S("mDispatchListeners");
       }
       tw.remove(this.B);
       return;
    }
    public final boolean P8(){
       boolean b;
       FeatureLongPressExtractTextGuidePresenter obj = PatchProxy.apply(null, this, FeatureLongPressExtractTextGuidePresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p;
       String str = "mPhoto";
       if (obj == null) {
          a.S(str);
       }
       if (obj.hasAtlasText()) {
          obj = this.r;
          if (obj == null) {
             a.S("mHasShownGuide");
          }
          if (!obj.get().booleanValue()) {
             obj = this.p;
             if (obj == null) {
                a.S(str);
             }
             if (!obj.isSinglePhoto()) {
                obj = this.p;
                if (obj == null) {
                   a.S(str);
                }
                if (!obj.isAtlasPhotos()) {
                   obj = this.p;
                   if (obj == null) {
                      a.S(str);
                   }
                   if (!obj.isLongPhotos()) {
                   label_0090 :
                      b = false;
                   label_0091 :
                      return b;
                   }
                }
             }
          label_005f :
             NasaFeatureGuideManager$a e = NasaFeatureGuideManager.e;
             if (!e.a().e() && (!e.a().n() && !e.a().h())) {
                obj = this.y;
                if (obj == null) {
                   a.S("mScreenCleanStatusCombination");
                }
                if (!obj.c()) {
                   b = true;
                   goto label_0091 ;
                }else {
                   goto label_0090 ;
                }
             }else {
                goto label_0090 ;
             }
          }else {
             goto label_0090 ;
          }
       }else {
          goto label_0090 ;
       }
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, FeatureLongPressExtractTextGuidePresenter.class, "6")) {
          return;
       }
       this.S8().h();
       FeatureLongPressExtractTextGuidePresenter tr = this.r;
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
       Object obj = PatchProxy.apply(null, this, FeatureLongPressExtractTextGuidePresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.D.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FeatureLongPressExtractTextGuidePresenter.class, "2")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       obj = this.x8("DETAIL_HAS_SHOWN_GUIDE");
       a.o(obj, "injectRef\(AccessIds.DETAIL_HAS_SHOWN_GUIDE\)");
       this.r = obj;
       obj = this.x8("DETAIL_CAN_CLEAR_SCREEN");
       a.o(obj, "injectRef\(AccessIds.DETAIL_CAN_CLEAR_SCREEN\)");
       this.s = obj;
       Object obj1 = this.r8("DETAIL_PARENT_VIEW");
       a.o(obj1, "inject\(AccessIds.DETAIL_PARENT_VIEW\)");
       this.t = obj1;
       obj1 = this.q8(u.class);
       a.o(obj1, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.u = obj1;
       obj1 = this.r8("DETAIL_SCREEN_TOUCH_LISTENER");
       a.o(obj1, "inject\(AccessIds.DETAIL_SCREEN_TOUCH_LISTENER\)");
       this.v = obj1;
       obj1 = this.r8("OCR_EXTRACT_TEXT_ENTRY_VISIBLE");
       a.o(obj1, "inject\(DetailAccessIds.O¡­TRACT_TEXT_ENTRY_VISIBLE\)");
       this.x = obj1;
       obj1 = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       a.o(obj1, "inject\(DetailAccessIds.DETAIL_SCREEN_CLEAN_STATUS\)");
       this.y = obj1;
       return;
    }
}
