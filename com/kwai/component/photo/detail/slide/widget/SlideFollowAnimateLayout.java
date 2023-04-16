package com.kwai.component.photo.detail.slide.widget.SlideFollowAnimateLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import com.kwai.component.photo.detail.slide.widget.SlideFollowAnimateLayout$a;
import com.kwai.component.photo.detail.slide.widget.SlideFollowAnimateLayout$b;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.slide.widget.SlideFollowAnimateLayout$c;
import android.view.View;
import ekd.m1;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Float;

public class SlideFollowAnimateLayout extends RelativeLayout	// class@000abb
{
    public View b;
    public View c;
    public LottieAnimationView d;
    public SlideFollowAnimateLayout$c e;
    public AnimatorListenerAdapter f;
    public AnimatorListenerAdapter g;

    public void SlideFollowAnimateLayout(Context p0){
       super(p0);
       this.f = new SlideFollowAnimateLayout$a(this);
       this.g = new SlideFollowAnimateLayout$b(this);
    }
    public void SlideFollowAnimateLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = new SlideFollowAnimateLayout$a(this);
       this.g = new SlideFollowAnimateLayout$b(this);
    }
    public void SlideFollowAnimateLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = new SlideFollowAnimateLayout$a(this);
       this.g = new SlideFollowAnimateLayout$b(this);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, SlideFollowAnimateLayout.class, "5")) {
          return;
       }
       SlideFollowAnimateLayout te = this.e;
       if (te != null) {
          te.onAnimationEnd();
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, SlideFollowAnimateLayout.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.d = m1.f(this, 0x7f0a0870);
       this.b = m1.f(this, 0x7f0a0872);
       this.c = m1.f(this, 0x7f0a0871);
       return;
    }
    public void setCallback(SlideFollowAnimateLayout$c p0){
       this.e = p0;
    }
    public void setLottieSpeed(float p0){
       if (PatchProxy.isSupport(SlideFollowAnimateLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SlideFollowAnimateLayout.class, "9")) {
          return;
       }
       SlideFollowAnimateLayout td = this.d;
       if (td != null) {
          td.setSpeed(p0);
       }
       return;
    }
    public final void setViewInvisibleAndReset(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideFollowAnimateLayout.class, "7")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setVisibility(4);
       p0.setAlpha(0x3f800000);
       p0.setScaleX(0x3f800000);
       p0.setScaleY(0x3f800000);
       return;
    }
}
