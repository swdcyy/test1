package com.kuaishou.live.preview.item.view.LivePreviewFollowAnimationView;
import com.yxcorp.widget.selector.view.SelectShapeFrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.TextView;
import bld.b;
import lnc.a1;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import java.lang.Integer;
import com.kuaishou.live.preview.item.view.LivePreviewFollowAnimationView$a;
import android.animation.Animator$AnimatorListener;
import android.widget.ImageView;

public class LivePreviewFollowAnimationView extends SelectShapeFrameLayout	// class@000e54
{
    public LottieAnimationView c;
    public TextView d;
    public boolean e;

    public void LivePreviewFollowAnimationView(Context p0){
       super(p0, null);
    }
    public void LivePreviewFollowAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePreviewFollowAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePreviewFollowAnimationView.class, "5")) {
       }else {
          a.k(this, R.layout.arg_RES_7f0d0d3c, true);
          this.c = m1.f(this, 0x7f0a1cdc);
          this.d = m1.f(this, 0x7f0a1cf0);
          if (!PatchProxy.applyVoid(objArray, this, LivePreviewFollowAnimationView.class, "6")) {
             b uob = new b();
             uob.v(a1.a(R.color.arg_RES_7f060753));
             uob.g(KwaiRadiusStyles.FULL);
             this.setBackground(uob.a());
             this.d.setCompoundDrawablesWithIntrinsicBounds(a1.f(R.drawable.arg_RES_7f081443), objArray, objArray, objArray);
             ViewGroup$LayoutParams layoutParams = this.d.getLayoutParams();
             if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                objArray.leftMargin = a1.d(0x7f07033f);
             }
             this.d.setLayoutParams(layoutParams);
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LivePreviewFollowAnimationView.class, "3")) {
          return;
       }
       if (this.e != null) {
          this.c.f();
          this.d.animate().cancel();
          this.animate().cancel();
          this.e = false;
       }
       return;
    }
    public void c(int p0){
       if (PatchProxy.isSupport(LivePreviewFollowAnimationView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePreviewFollowAnimationView.class, "2")) {
          return;
       }
       this.e = true;
       this.animate().alpha(0).setStartDelay((long)p0).setDuration(250).setListener(new LivePreviewFollowAnimationView$a(this)).start();
       return;
    }
    public boolean d(){
       return this.e;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LivePreviewFollowAnimationView.class, "4")) {
          return;
       }
       this.b();
       this.c.setFrame(0);
       this.c.setVisibility(8);
       this.d.setAlpha(0x3f800000);
       this.setAlpha(0x3f800000);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LivePreviewFollowAnimationView.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       this.b();
       return;
    }
}
