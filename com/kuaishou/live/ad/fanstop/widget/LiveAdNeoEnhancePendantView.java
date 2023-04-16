package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.View;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$c;
import android.animation.Animator$AnimatorListener;
import ekd.m1;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.graphics.Typeface;
import ekd.d0;
import android.animation.AnimatorSet;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import lnc.a1;
import yx.j0;
import android.animation.Animator;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$b;
import qrd.l1;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$playGrantedAnimThenDismiss$1;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j0;
import mxb.i0;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$d;
import erd.g;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$e;
import android.widget.ImageView;
import qw.e;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$g;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$h;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$i;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$j;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import android.net.Uri;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$f;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class LiveAdNeoEnhancePendantView extends LiveAdNeoPendantBaseView	// class@0009d3
{
    public View h;
    public LottieAnimationView i;
    public View j;
    public KwaiImageView k;
    public TextView l;
    public TextView m;
    public Animator n;
    public AnimatorSet o;
    public HashMap p;
    public static final LiveAdNeoEnhancePendantView$a q;

    static {
       LiveAdNeoEnhancePendantView.q = new LiveAdNeoEnhancePendantView$a(null);
    }
    public void LiveAdNeoEnhancePendantView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveAdNeoEnhancePendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveAdNeoEnhancePendantView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void LiveAdNeoEnhancePendantView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void d(boolean p0,a p1){
       if (PatchProxy.isSupport(LiveAdNeoEnhancePendantView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, LiveAdNeoEnhancePendantView.class, "4")) {
          return;
       }
       a.p(p1, "endCallBack");
       int i = 2;
       PropertyValuesHolder propertyValu = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i]{0x3f800000,0});
       PropertyValuesHolder propertyValu1 = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i]{0x3f800000,0});
       LiveAdNeoEnhancePendantView th = this.h;
       if (th == null) {
          a.S("mCountDownImageGroup");
       }
       PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[i];
       propertyValu2[0] = propertyValu;
       propertyValu2[1] = propertyValu1;
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(th, propertyValu2);
       objectAnimat.setDuration(160);
       long l = (p0)? 0x7530: 1000;
       objectAnimat.setStartDelay(l);
       objectAnimat.start();
       objectAnimat.addListener(new LiveAdNeoEnhancePendantView$c(this, p0, p1));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAdNeoEnhancePendantView.class, "1")) {
          return;
       }
       View view = m1.f(p0, R.id.neo_report_success_lottie);
       a.o(view, "bindWidget\(rootView, R.i¡­eo_report_success_lottie\)");
       this.i = view;
       view = m1.f(p0, R.id.neo_count_down_image_group);
       a.o(view, "bindWidget\(rootView, R.i¡­o_count_down_image_group\)");
       this.h = view;
       view = m1.f(p0, R.id.neo_count_down_text_group);
       a.o(view, "bindWidget\(rootView, R.i¡­eo_count_down_text_group\)");
       this.j = view;
       view = m1.f(p0, R.id.neo_count_down_bg_image);
       a.o(view, "bindWidget\(rootView, R.id.neo_count_down_bg_image\)");
       this.k = view;
       this.setMCountDownTextView$commercial_live_release(m1.f(p0, R.id.neo_count_down_text));
       this.l = m1.f(p0, 0x7f0a2d92);
       TextView textView = m1.f(p0, R.id.live_neo_pendent_double_text);
       try{
          this.m = textView;
          LiveAdNeoEnhancePendantView tl = this.l;
          if (tl != null) {
             tl.setTypeface(d0.a("alte-din.ttf", this.getContext()));
          }
          return;
       }catch(java.lang.IndexOutOfBoundsException e0){
       }
    }
    public AnimatorSet e(long p0,a p1){
       LiveAdNeoEnhancePendantView obj;
       float f2;
       if (PatchProxy.isSupport(LiveAdNeoEnhancePendantView.class)) {
          obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, LiveAdNeoEnhancePendantView.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "endCallBack");
       this.j();
       this.setCoolDownBgImageResourceIfNeed$commercial_live_release(p0);
       LiveAdNeoEnhancePendantView tj = this.j;
       if (tj == null) {
          a.S("mNeoTextGroup");
       }
       int i = 8;
       tj.setVisibility(i);
       tj = this.m;
       if (tj != null) {
          tj.setVisibility(i);
       }
       this.setBackground(null);
       this.clearAnimation();
       float f = 2.00f;
       i = a1.e(60.00f);
       int i1 = a1.e(14.00f);
       LiveAdNeoEnhancePendantView th = this.h;
       String str = "mCountDownImageGroup";
       if (th == null) {
          a.S(str);
       }
       th.setScaleX(f);
       th = this.h;
       if (th == null) {
          a.S(str);
       }
       th.setScaleY(f);
       tj = this.h;
       if (tj == null) {
          a.S(str);
       }
       float f1 = (float)i;
       tj.setTranslationY(f1);
       tj = this.h;
       if (tj == null) {
          a.S(str);
       }
       float[] uofloatArray = new float[]{f2,f2};
       f2 = (float)i1;
       f2 = - f2;
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tj, FrameLayout.TRANSLATION_X, uofloatArray);
       a.o(objectAnimat, "ObjectAnimator.ofFloat\(\n¡­ialTransX.toFloat\(\)\n    \)");
       objectAnimat.setDuration(200);
       PropertyValuesHolder propertyValu = PropertyValuesHolder.ofFloat(FrameLayout.SCALE_X, new float[2]{0x40000000,0x3f800000});
       PropertyValuesHolder propertyValu1 = PropertyValuesHolder.ofFloat(FrameLayout.SCALE_Y, new float[2]{0x40000000,0x3f800000});
       float[] uofloatArray1 = new float[]{f1,0};
       PropertyValuesHolder propertyValu2 = PropertyValuesHolder.ofFloat(FrameLayout.TRANSLATION_Y, uofloatArray1);
       float[] uofloatArray2 = new float[]{f2,0};
       PropertyValuesHolder propertyValu3 = PropertyValuesHolder.ofFloat(FrameLayout.TRANSLATION_X, uofloatArray2);
       obj = this.h;
       if (obj == null) {
          a.S(str);
       }
       PropertyValuesHolder[] propertyValu4 = new PropertyValuesHolder[]{propertyValu,propertyValu1,propertyValu2,propertyValu3};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(obj, propertyValu4);
       a.o(objectAnimat1, "ObjectAnimator.ofPropert¡­, scaleY, transY, transX\)");
       objectAnimat1.setDuration(400);
       objectAnimat1.setStartDelay(1380);
       obj = this.o;
       if (obj != null) {
          Object[] objArray = new Object[0];
          j0.c("LiveAdNeoEnhancePendantView", "duplicate fist add anim created", objArray);
          obj.removeAllListeners();
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
       uAnimatorSet.playSequentially(uAnimatorArr);
       uAnimatorSet.addListener(new LiveAdNeoEnhancePendantView$b(this, objectAnimat, objectAnimat1, p1));
       this.o = uAnimatorSet;
       a.m(uAnimatorSet);
       return uAnimatorSet;
    }
    public void g(boolean p0,long p1,a p2){
       if (PatchProxy.isSupport(LiveAdNeoEnhancePendantView.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Long.valueOf(p1), p2, this, LiveAdNeoEnhancePendantView.class, "7")) {
          return;
       }
       a.p(p2, "endCallBack");
       this.n(p1, new LiveAdNeoEnhancePendantView$playGrantedAnimThenDismiss$1(this, p0, p2));
       return;
    }
    public void g1(){
       if (PatchProxy.applyVoid(null, this, LiveAdNeoEnhancePendantView.class, "14")) {
          return;
       }
       super.g1();
       LiveAdNeoEnhancePendantView to = this.o;
       if (to != null) {
          to.removeAllListeners();
       }
       this.o = null;
       return;
    }
    public void h(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAdNeoEnhancePendantView.class, "10")) {
          return;
       }
       if (p0 == null) {
          Object[] objArray = new Object[0];
          j0.c("LiveAdNeoEnhancePendantView", "Empty feed when reporting click", objArray);
          return;
       }else {
          i0.a().e(141, p0).d(LiveAdNeoEnhancePendantView$d.b).a();
          return;
       }
    }
    public void i(BaseFeed p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAdNeoEnhancePendantView.class, "9")) {
          return;
       }
       if (p0 == null) {
          Object[] objArray = new Object[0];
          j0.c("LiveAdNeoEnhancePendantView", "Empty feed when reporting impression", objArray);
          return;
       }else {
          i0.a().e(140, p0).d(LiveAdNeoEnhancePendantView$e.b).a();
          return;
       }
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, LiveAdNeoEnhancePendantView.class, "2")) {
          return;
       }
       LiveAdNeoEnhancePendantView tj = this.j;
       if (tj == null) {
          a.S("mNeoTextGroup");
       }
       tj.setVisibility(0);
       tj = this.l;
       int i = 8;
       if (tj != null) {
          tj.setVisibility(i);
       }
       tj = this.h;
       if (tj == null) {
          a.S("mCountDownImageGroup");
       }
       this.setPendentBgImg("https://static.yximgs.com/udata/pkg/ad-res/neo_live_pendent/live_neo_pendent_bg.0ead9a8e4e1e40fe.webp");
       if (this.getMPendantType$commercial_live_release() != 1) {
          LiveAdNeoEnhancePendantView tm = this.m;
          if (tm != null) {
             tm.setVisibility(i);
          }
       }else {
          LiveAdNeoEnhancePendantView tm1 = this.m;
          if (tm1 != null) {
             tm1.setVisibility(0);
          }
       }
       tj.setVisibility(0);
       tj.setScaleX(0x3f800000);
       tj.setScaleY(0x3f800000);
       this.k("", 0);
       return;
    }
    public void l(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAdNeoEnhancePendantView.class, "5")) {
          return;
       }
       a.p(p0, "endCallBack");
       LiveAdNeoEnhancePendantView ti = this.i;
       if (ti == null) {
          a.S("mLottieView");
       }
       ti.setVisibility(0);
       ti.setAlpha(0x3f800000);
       ti.clearAnimation();
       ti.t();
       ti.setProgress(0);
       ti.setAnimationFromUrl(e.b.c("https://static.yximgs.com/udata/pkg/ad-res/neo_live_pendent/ad_neo_pendent_cool_down_end_anim.6449de4cb9efd917.json"));
       ti.a(new LiveAdNeoEnhancePendantView$g(p0));
       LiveAdNeoEnhancePendantView ti1 = this.i;
       if (ti1 == null) {
          a.S("mLottieView");
       }
       ti1.s();
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, LiveAdNeoEnhancePendantView.class, "13")) {
          return;
       }
       LiveAdNeoEnhancePendantView tn = this.n;
       if (tn != null) {
          tn.end();
       }
       this.n = null;
       return;
    }
    public final void n(long p0,a p1){
       if (PatchProxy.isSupport(LiveAdNeoEnhancePendantView.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, LiveAdNeoEnhancePendantView.class, "8")) {
          return;
       }
       a.p(p1, "endCallBack");
       LiveAdNeoEnhancePendantView ti = this.i;
       if (ti == null) {
          a.S("mLottieView");
       }
       ti.setVisibility(8);
       this.m();
       ti = this.h;
       if (ti == null) {
          a.S("mCountDownImageGroup");
       }
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(FrameLayout.SCALE_X, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(FrameLayout.SCALE_Y, new float[2]{0x3f800000,0})};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(ti, propertyValu);
       a.o(objectAnimat, "imageExitAnim");
       objectAnimat.setDuration(250);
       objectAnimat.addListener(new LiveAdNeoEnhancePendantView$h(this, p0));
       a.o(objectAnimat, "ObjectAnimator.ofPropert¡­\n        }\n      }\)\n    }");
       PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(FrameLayout.ALPHA, new float[2]{0x3f800000,0})};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(this.getMCountDownTextView$commercial_live_release(), propertyValu1);
       a.o(objectAnimat1, "textExitAnim");
       objectAnimat1.setDuration(250);
       objectAnimat1.addListener(new LiveAdNeoEnhancePendantView$i(this));
       a.o(objectAnimat1, "ObjectAnimator.ofPropert¡­\n        }\n      }\)\n    }");
       propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(FrameLayout.SCALE_X, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(FrameLayout.SCALE_Y, new float[2]{0x3f800000,0})};
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofPropertyValuesHolder(this.m, propertyValu1);
       objectAnimat2.setDuration(250);
       a.o(objectAnimat2, "ObjectAnimator.ofPropert¡­ED_ANIM_DURATION_MS\n    }");
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.addListener(new LiveAdNeoEnhancePendantView$j(objectAnimat, objectAnimat1, objectAnimat2, p1));
       uAnimatorSet.start();
       return;
    }
    public void setCoolDownBgImageResourceIfNeed$commercial_live_release(long p0){
       LiveAdNeoEnhancePendantView tm;
       if (PatchProxy.isSupport(LiveAdNeoEnhancePendantView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveAdNeoEnhancePendantView.class, "3")) {
          return;
       }
       if (p0 > 0) {
          this.setPendentBgImg("https://static.yximgs.com/udata/pkg/ad-res/neo_live_pendent/live_neo_pendent_bg_lock.6952d3409f3b2d3e.webp");
          if (this.getMPendantType$commercial_live_release() != 1) {
             tm = this.m;
             if (tm != null) {
                tm.setVisibility(8);
             }
          }else {
             tm = this.m;
             if (tm != null) {
                tm.setVisibility(0);
             }
          }
       }
       return;
    }
    public final void setPendentBgImg(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAdNeoEnhancePendantView.class, "11")) {
          return;
       }
       a$a uoa = a.d();
       uoa.b(":ks-features:ft-commercial:commercial-live");
       uoa.d(ImageSource.ICON);
       a uoa1 = uoa.a();
       a.o(uoa1, "KwaiImageCallerContext.n¡­urce.ICON\)\n      .build\(\)");
       LiveAdNeoEnhancePendantView tk = this.k;
       if (tk == null) {
          a.S("mPendentBgImg");
       }
       tk.E(Uri.parse(e.b.c(p0)), uoa1, a1.d(R.dimen.arg_RES_7f07015d), a1.d(R.dimen.arg_RES_7f07015c), new LiveAdNeoEnhancePendantView$f(p0));
       return;
    }
}
