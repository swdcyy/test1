package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureOpenDanmakuGuidePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureOpenDanmakuGuidePresenter$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureOpenDanmakuGuidePresenter$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureOpenDanmakuGuidePresenter$mShowGuideRunnable$1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.FeatureOpenDanmakuGuidePresenter$mGuider$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.Set;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.danmaku.DanmakuSwitchUtil;
import sm5.d;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import xx9.a;
import rf5.u;
import im8.f;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import com.kwai.feature.api.feed.home.common.SlideGuideManager$a;
import android.app.Activity;
import com.kwai.framework.model.user.QCurrentUser;
import j8a.a;
import j8a.d1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;

public final class FeatureOpenDanmakuGuidePresenter extends PresenterV2	// class@001953
{
    public final k3 A;
    public final Runnable B;
    public final p C;
    public QPhoto p;
    public u q;
    public f r;
    public Set s;
    public a t;
    public View u;
    public BaseFragment v;
    public SlidePlayViewModel w;
    public f x;
    public NasaBizParam y;
    public final FeatureOpenDanmakuGuidePresenter$a z;

    public void FeatureOpenDanmakuGuidePresenter(){
       super();
       this.z = new FeatureOpenDanmakuGuidePresenter$a(this);
       this.A = new FeatureOpenDanmakuGuidePresenter$b(this);
       this.B = new FeatureOpenDanmakuGuidePresenter$mShowGuideRunnable$1(this);
       this.C = s.c(new FeatureOpenDanmakuGuidePresenter$mGuider$2(this));
    }
    public static final QPhoto P8(FeatureOpenDanmakuGuidePresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, FeatureOpenDanmakuGuidePresenter.class, "3")) {
          return;
       }
       FeatureOpenDanmakuGuidePresenter tv = this.v;
       String str = "mFragment";
       if (tv == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tv.requireParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(m¡­.requireParentFragment\(\)\)");
       this.w = slidePlayVie;
       if (slidePlayVie == null) {
          a.S("mSlidePlayViewModel");
       }
       FeatureOpenDanmakuGuidePresenter tv1 = this.v;
       if (tv1 == null) {
          a.S(str);
       }
       slidePlayVie.P(tv1, this.z);
       tv = this.s;
       if (tv == null) {
          a.S("mDispatchListeners");
       }
       tv.add(this.A);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, FeatureOpenDanmakuGuidePresenter.class, "4")) {
          return;
       }
       k1.m(this.B);
       FeatureOpenDanmakuGuidePresenter tw = this.w;
       if (tw == null) {
          a.S("mSlidePlayViewModel");
       }
       FeatureOpenDanmakuGuidePresenter tv = this.v;
       if (tv == null) {
          a.S("mFragment");
       }
       tw.D(tv, this.z);
       tw = this.s;
       if (tw == null) {
          a.S("mDispatchListeners");
       }
       tw.remove(this.A);
       return;
    }
    public final boolean R8(){
       boolean b;
       FeatureOpenDanmakuGuidePresenter obj = PatchProxy.apply(null, this, FeatureOpenDanmakuGuidePresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p;
       String str = "mPhoto";
       if (obj == null) {
          a.S(str);
       }
       if (DanmakuSwitchUtil.b(obj)) {
          obj = this.p;
          if (obj == null) {
             a.S(str);
          }
          if (d.e(obj) == 2 && !DanmakuSwitchUtils.h.f()) {
             obj = this.t;
             if (obj == null) {
                a.S("mScreenCleanStatusCombination");
             }
             if (!obj.c()) {
                obj = this.p;
                if (obj == null) {
                   a.S(str);
                }
                if (d.c(obj)) {
                   obj = this.p;
                   if (obj == null) {
                      a.S(str);
                   }
                   if (!d.b(obj)) {
                      obj = this.q;
                      if (obj == null) {
                         a.S("mSwipeToProfileFeedMovement");
                      }
                      if (!obj.w()) {
                         obj = this.x;
                         if (obj == null) {
                            a.S("mHasShownGuide");
                         }
                         if (!obj.get().booleanValue() && !SlideGuideManager.m.a().b(this.getActivity())) {
                            b = true;
                         label_0099 :
                            return b;
                         }
                      }
                   }
                }
             }
          }
       }
    label_0098 :
       b = false;
       goto label_0099 ;
    }
    public final boolean S8(QPhoto p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, FeatureOpenDanmakuGuidePresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (DanmakuSwitchUtil.b(p0) && (d.a() && !DanmakuSwitchUtils.h.d())) {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          if (mE.isLogined()) {
             FeatureOpenDanmakuGuidePresenter tx = this.x;
             if (tx == null) {
                a.S("mHasShownGuide");
             }
             if (!tx.get().booleanValue() && !SlideGuideManager.m.a().b(this.getActivity())) {
                b = true;
             label_005c :
                return b;
             }
          }
       }
    label_005b :
       b = false;
       goto label_005c ;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, FeatureOpenDanmakuGuidePresenter.class, "6")) {
          return;
       }
       this.W8().h();
       FeatureOpenDanmakuGuidePresenter tx = this.x;
       if (tx == null) {
          a.S("mHasShownGuide");
       }
       tx.set(Boolean.FALSE);
       tx = this.r;
       if (tx == null) {
          a.S("mCanClearScreen");
       }
       tx.set(Boolean.TRUE);
       return;
    }
    public final a W8(){
       Object obj = PatchProxy.apply(null, this, FeatureOpenDanmakuGuidePresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, FeatureOpenDanmakuGuidePresenter.class, "1")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.x8("DETAIL_CAN_CLEAR_SCREEN");
       a.o(obj, "injectRef\(AccessIds.DETAIL_CAN_CLEAR_SCREEN\)");
       this.r = obj;
       Object obj1 = this.r8("DETAIL_SCREEN_TOUCH_LISTENER");
       a.o(obj1, "inject\(AccessIds.DETAIL_SCREEN_TOUCH_LISTENER\)");
       this.s = obj1;
       obj1 = this.r8("DETAIL_FRAGMENT");
       a.o(obj1, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.v = obj1;
       obj1 = this.r8("DETAIL_PARENT_VIEW");
       a.o(obj1, "inject\(AccessIds.DETAIL_PARENT_VIEW\)");
       this.u = obj1;
       obj1 = this.q8(u.class);
       a.o(obj1, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.q = obj1;
       obj1 = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       a.o(obj1, "inject\(DetailAccessIds.DETAIL_SCREEN_CLEAN_STATUS\)");
       this.t = obj1;
       obj = this.x8("DETAIL_HAS_SHOWN_GUIDE");
       a.o(obj, "injectRef\(AccessIds.DETAIL_HAS_SHOWN_GUIDE\)");
       this.x = obj;
       obj1 = this.q8(NasaBizParam.class);
       a.o(obj1, "inject\(NasaBizParam::class.java\)");
       this.y = obj1;
       return;
    }
}
