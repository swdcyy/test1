package com.yxcorp.gifshow.detail.nonslide.toolbar.widget.CollectView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PhotoMeta;
import android.widget.ImageView;
import android.animation.AnimatorSet;
import android.view.View;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import ekd.f$l;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.yxcorp.gifshow.detail.nonslide.toolbar.widget.CollectView$a;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup;
import com.yxcorp.gifshow.detail.view.DetailToolBarButtonView;
import java.lang.Float;

public class CollectView extends FrameLayout	// class@0015f5
{
    public DetailToolBarButtonView b;
    public DetailToolBarButtonView c;
    public Animator d;
    public ObjectAnimator e;

    public void CollectView(Context p0){
       super(p0);
    }
    public void CollectView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void CollectView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, CollectView.class, "10")) {
          return;
       }
       CollectView td = this.d;
       if (td != null) {
          td.cancel();
       }
       return;
    }
    public boolean b(){
       CollectView obj = PatchProxy.apply(null, this, CollectView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       boolean b = (obj != null && obj.isRunning())? true: false;
       return b;
    }
    public void c(boolean p0,PhotoMeta p1){
       if (PatchProxy.isSupport(CollectView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, CollectView.class, "7")) {
          return;
       }
       this.a();
       int i = 0;
       this.c.setVisibility(i);
       this.b.setVisibility(4);
       if (this.d == null) {
          AnimatorSet uAnimatorSet = PatchProxy.apply(null, this, CollectView.class, "11");
          if (uAnimatorSet != PatchProxyResult.class) {
          }else {
             uAnimatorSet = new AnimatorSet();
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0})};
             int i1 = 1;
             ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.b, propertyValu);
             objectAnimat.setDuration(250);
             objectAnimat.setInterpolator(new LinearInterpolator());
             PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0,0x3f800000})};
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(this.c, propertyValu1);
             this.e = objectAnimat1;
             Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
             uAnimatorSet.playTogether(uAnimatorArr);
          }
          this.d = uAnimatorSet;
       }
       if (!PatchProxy.isSupport(CollectView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CollectView.class, "8")) {
          if (p0) {
             this.e.setDuration(800);
             this.e.setInterpolator(new f$l(0x3f19999a));
          }else {
             this.e.setDuration(250);
             this.e.setInterpolator(new AccelerateDecelerateInterpolator());
          }
       }
       this.d.addListener(new CollectView$a(this, p1));
       this.d.start();
       return;
    }
    public void d(boolean p0){
       if (PatchProxy.isSupport(CollectView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CollectView.class, "3")) {
          return;
       }
       this.removeAllViews();
       if (p0) {
          this.addView(this.c);
          this.addView(this.b);
       }else {
          this.addView(this.b);
          this.addView(this.c);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, CollectView.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       this.a();
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, CollectView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.b = this.findViewById(0x7f0a07c9);
       DetailToolBarButtonView uDetailToolB = this.findViewById(R.id.iv_collect_bottom);
       this.c = uDetailToolB;
       uDetailToolB.setScaleX(0);
       this.c.setScaleY(0);
       this.c.setVisibility(8);
       return;
    }
    public void setAlphaProgress(float p0){
       if (PatchProxy.isSupport(CollectView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, CollectView.class, "6")) {
          return;
       }
       this.c.setProgress(p0);
       this.b.setProgress(p0);
       return;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(CollectView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CollectView.class, "2")) {
          return;
       }
       this.a();
       super.setSelected(p0);
       this.b.setSelected(p0);
       this.c.setSelected((p0 ^ 0x01));
       this.d(p0);
       return;
    }
}
