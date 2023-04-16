package com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeVisiblePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeVisiblePresenter$a;
import java.lang.Runnable;
import ekd.k1;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeVisiblePresenter$onBind$2;
import msd.l;
import e59.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import im8.f;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.ad.report.ReportModuleUseTools;
import android.view.ViewParent;
import i2b.a;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeVisiblePresenter$b;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import ekd.m1;
import j19.a;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel;
import android.view.MotionEvent;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import lnc.ja;
import qrd.l1;
import n29.h;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.a;
import n29.e;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import de5.a;
import com.yxcorp.gifshow.comment.e;

public final class ThanosDislikeVisiblePresenter extends PresenterV2	// class@001754
{
    public DislikeViewModel p;
    public f q;
    public QPhoto r;
    public BaseFragment s;
    public a t;
    public e u;
    public ViewGroup v;
    public View w;
    public SlidePlayViewModel x;
    public a y;

    public void ThanosDislikeVisiblePresenter(){
       super();
    }
    public static final ViewGroup P8(ThanosDislikeVisiblePresenter p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mRootLayout");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ThanosDislikeVisiblePresenter.class, "11")) {
          return;
       }
       ThanosDislikeVisiblePresenter tw = this.w;
       if (tw != null) {
          tw.setVisibility(8);
          k1.r(new ThanosDislikeVisiblePresenter$a(tw, this), 0);
       }
       tw = this.s;
       if (tw == null) {
          a.S("mFragment");
       }
       this.x = SlidePlayViewModel.B0(tw.getParentFragment());
       tw = this.p;
       if (tw == null) {
          a.S("mDislikeViewModel");
       }
       tw.b(new ThanosDislikeVisiblePresenter$onBind$2(this));
       return;
    }
    public final boolean R8(){
       boolean b;
       ThanosDislikeVisiblePresenter obj = PatchProxy.apply(null, this, ThanosDislikeVisiblePresenter.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!VisitorModeManager.f()) {
          obj = this.q;
          if (obj == null) {
             a.S("mEndScreenVisible");
          }
          Object obj1 = obj.get();
          a.o(obj1, "mEndScreenVisible.get\(\)");
          if (!obj1.booleanValue()) {
             b = false;
          label_0038 :
             return b;
          }
       }
       b = true;
       goto label_0038 ;
    }
    public final void S8(int p0){
       ThanosDislikeVisiblePresenter tv;
       ThanosDislikeVisiblePresenter tv1;
       View view;
       ObjectAnimator objectAnimat;
       ThanosDislikeVisiblePresenter thanosDislik = ThanosDislikeVisiblePresenter.class;
       if (PatchProxy.isSupport(thanosDislik) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, thanosDislik, "14")) {
          return;
       }
       if (this.R8()) {
          return;
       }
       thanosDislik = this.r;
       if (thanosDislik == null) {
          a.S("mPhoto");
       }
       Fragment uFragment = null;
       ReportModuleUseTools.b("ks_negative_mask_v1", thanosDislik, uFragment, false, String.valueOf(p0));
       thanosDislik = this.w;
       if (thanosDislik != null) {
          uFragment = thanosDislik.getParent();
       }
       String str = "mRootLayout";
       if (uFragment != null) {
          tv = this.v;
          if (tv == null) {
             a.S(str);
          }
          tv.removeView(this.w);
       }
       int i = 2;
       if (p0) {
          if (p0 != i) {
             tv1 = this.v;
             if (tv1 == null) {
                a.S(str);
             }
             view = a.i(tv1, R.layout.arg_RES_7f0d1527);
          }else {
             tv1 = this.v;
             if (tv1 == null) {
                a.S(str);
             }
             view = a.i(tv1, R.layout.arg_RES_7f0d008e);
          }
       }else {
          tv1 = this.v;
          if (tv1 == null) {
             a.S(str);
          }
          view = a.i(tv1, R.layout.arg_RES_7f0d008d);
       }
       this.w = view;
       if (view != null) {
          view.setOnClickListener(new ThanosDislikeVisiblePresenter$b(this, p0));
          ViewGroup$LayoutParams layoutParams = new ViewGroup$LayoutParams(-1, -1);
          ThanosDislikeVisiblePresenter tv2 = this.v;
          if (tv2 == null) {
             a.S(str);
          }
          tv2.addView(view, layoutParams);
          view.setVisibility(false);
          a uoa = new a(view, m1.f(view, 0x7f0a39e3));
          thanosDislik = this.p;
          if (thanosDislik == null) {
             a.S("mDislikeViewModel");
          }
          DislikeViewModel e = thanosDislik.e;
          if (!PatchProxy.applyVoidOneRefs(e, uoa, a.class, "1") && e != null) {
             uoa.b.measure(false, false);
             int measuredHeig = uoa.b.getMeasuredHeight();
             int i1 = (int)e.getRawY();
             int i2 = n.A(a.B);
             int i3 = a1.d(R.dimen.arg_RES_7f070340);
             if (i1 > ((measuredHeig + i3) + i2)) {
                uoa.c = false;
                float[] uofloatArray = new float[i];
                i1 = i1 - measuredHeig;
                uofloatArray[0] = (float)i1;
                uofloatArray[1] = (float)(i1 - i3);
                objectAnimat = ObjectAnimator.ofFloat(uoa.b, View.TRANSLATION_Y, uofloatArray);
             }else {
                uoa.c = true;
                float[] uofloatArray1 = new float[i];
                uofloatArray1[0] = (float)(a1.d(0x7f070fdf) + i2);
                uofloatArray1[1] = (float)a1.d(0x7f070254);
                objectAnimat = ObjectAnimator.ofFloat(uoa.b, View.TRANSLATION_Y, uofloatArray1);
             }
             AnimatorSet uAnimatorSet = new AnimatorSet();
             uAnimatorSet.setDuration(150);
             uAnimatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
             uAnimatorSet.play(objectAnimat).with(ObjectAnimator.ofFloat(uoa.a, View.ALPHA, new float[i]{0,0x3f800000}));
             uAnimatorSet.start();
             ja.a();
          }
          this.y = uoa;
          PresenterV2 presenterV2 = new PresenterV2();
          presenterV2.f(view);
          if (p0) {
             if (p0 != 1) {
                if (p0 == i) {
                   tv = this.p;
                   if (tv == null) {
                      a.S("mDislikeViewModel");
                   }
                   presenterV2.U7(new h(tv));
                }
             }else {
                tv = this.p;
                if (tv == null) {
                   a.S("mDislikeViewModel");
                }
                presenterV2.U7(new a(tv));
             }
          }else {
             tv = this.p;
             if (tv == null) {
                a.S("mDislikeViewModel");
             }
             presenterV2.U7(new e(tv));
          }
          Object[] objArray = new Object[false];
          presenterV2.i(objArray);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosDislikeVisiblePresenter.class, "10")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          activity = activity.findViewById(0x1020002);
          a.o(activity, "it.findViewById\(android.R.id.content\)");
          this.v = activity;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ThanosDislikeVisiblePresenter.class, "1")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       obj = this.r8("thanos_dislike_view_model");
       a.o(obj, "inject\(com.yxcorp.gifsho¡­HANOS_DISLIKE_VIEW_MODEL\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.s = obj;
       obj = this.x8("PHOTO_VIDEO_PLAY_END_VIEW");
       a.o(obj, "injectRef\(com.yxcorp.gif¡­HOTO_VIDEO_PLAY_END_VIEW\)");
       this.q = obj;
       this.t = this.s8(a.class);
       this.u = this.t8("COMMENT_HELPER");
       return;
    }
}
