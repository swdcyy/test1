package com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView;
import com.yxcorp.widget.selector.view.SelectShapeFrameLayout;
import com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.text.TextPaint;
import qrd.l1;
import kotlin.LazyThreadSafetyMode;
import com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView$mFollowDismissListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView$mViewDismissListener$2;
import com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView$followAnimator$2;
import com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView$mDelayDismissRunnable$2;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.animation.AnimationSet;
import android.view.animation.Animation$AnimationListener;
import java.lang.Runnable;
import com.airbnb.lottie.LottieAnimationView;
import com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView$mFollowDismissListener$2$a;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewStub;
import com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView$b;
import android.animation.Animator$AnimatorListener;
import com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView$mViewDismissListener$2$a;
import java.lang.Boolean;
import java.lang.Integer;

public final class CommonFollowAnimationView extends SelectShapeFrameLayout	// class@000ab5
{
    public final View c;
    public LottieAnimationView d;
    public boolean e;
    public final p f;
    public final p g;
    public final p h;
    public final p i;
    public final DefaultObservable j;
    public static final CommonFollowAnimationView$a k;

    static {
       CommonFollowAnimationView.k = new CommonFollowAnimationView$a(null);
    }
    public void CommonFollowAnimationView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void CommonFollowAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void CommonFollowAnimationView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d07cb, this, true);
       View view = this.findViewById(R.id.static_btn);
       TextPaint paint = view.getPaint();
       a.o(paint, "paint");
       paint.setFakeBoldText(true);
       a.o(view, "findViewById<TextView>\(R¡­isFakeBoldText = true\n  }");
       this.c = view;
       LazyThreadSafetyMode nONE = LazyThreadSafetyMode.NONE;
       this.f = s.b(nONE, new CommonFollowAnimationView$mFollowDismissListener$2(this));
       this.g = s.b(nONE, new CommonFollowAnimationView$mViewDismissListener$2(this));
       this.h = s.b(nONE, CommonFollowAnimationView$followAnimator$2.INSTANCE);
       this.i = s.b(nONE, new CommonFollowAnimationView$mDelayDismissRunnable$2(this));
       this.j = new DefaultObservable();
    }
    public void CommonFollowAnimationView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, CommonFollowAnimationView.class, "9")) {
          return;
       }
       if (this.e != null) {
          this.getFollowAnimator().cancel();
          this.getFollowAnimator().setAnimationListener(null);
          this.c.clearAnimation();
          this.removeCallbacks(this.getMDelayDismissRunnable());
          CommonFollowAnimationView td = this.d;
          if (td != null) {
             td.f();
          }
          this.clearAnimation();
          this.e = false;
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, CommonFollowAnimationView.class, "7")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       this.e = true;
       this.getFollowAnimator().setAnimationListener(this.getMFollowDismissListener());
       this.c.startAnimation(this.getFollowAnimator());
       return;
    }
    public final boolean d(){
       return this.e;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, CommonFollowAnimationView.class, "8")) {
          return;
       }
       this.b();
       CommonFollowAnimationView td = this.d;
       if (td != null) {
          td.setFrame(0);
       }
       td = this.d;
       if (td != null) {
          td.setVisibility(8);
       }
       this.c.setVisibility(0);
       this.setVisibility(0);
       return;
    }
    public final AnimationSet getFollowAnimator(){
       Object obj = PatchProxy.apply(null, this, CommonFollowAnimationView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public final LottieAnimationView getLottieView(){
       Object[] objArray = null;
       ViewStub obj = PatchProxy.apply(objArray, this, CommonFollowAnimationView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          obj = this.findViewById(R.id.lottie_animation_view_stub);
          View view = (obj != null)? obj.inflate(): objArray;
          if (view instanceof LottieAnimationView) {
             objArray = view;
          }
          this.d = objArray;
          if (objArray != null) {
             objArray.a(new CommonFollowAnimationView$b(this));
          }
       }
       CommonFollowAnimationView td = this.d;
       a.m(td);
       return td;
    }
    public final Runnable getMDelayDismissRunnable(){
       Object obj = PatchProxy.apply(null, this, CommonFollowAnimationView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public final CommonFollowAnimationView$mFollowDismissListener$2$a getMFollowDismissListener(){
       Object obj = PatchProxy.apply(null, this, CommonFollowAnimationView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final CommonFollowAnimationView$mViewDismissListener$2$a getMViewDismissListener(){
       Object obj = PatchProxy.apply(null, this, CommonFollowAnimationView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, CommonFollowAnimationView.class, "10")) {
          return;
       }
       this.b();
       super.onDetachedFromWindow();
       return;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(CommonFollowAnimationView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CommonFollowAnimationView.class, "13")) {
          return;
       }
       super.setPressed(p0);
       float f = (p0)? 0x3f000000: 0x3f800000;
       this.setAlpha(f);
       return;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(CommonFollowAnimationView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CommonFollowAnimationView.class, "11")) {
          return;
       }
       super.setVisibility(p0);
       CommonFollowAnimationView tj = this.j;
       boolean b = (!p0)? true: false;
       tj.notifyChanged(Boolean.valueOf(b));
       return;
    }
}
