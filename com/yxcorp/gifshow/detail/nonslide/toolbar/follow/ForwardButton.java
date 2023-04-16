package com.yxcorp.gifshow.detail.nonslide.toolbar.follow.ForwardButton;
import b3a.h;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.nonslide.toolbar.follow.b;
import lnc.c3$a;
import lnc.c3;
import java.lang.Float;
import com.yxcorp.gifshow.detail.view.DetailToolBarButtonView;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import tkd.b;
import tkd.d;
import ayb.i;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.n;
import android.widget.FrameLayout$LayoutParams;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet$Builder;
import d3a.d;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.detail.nonslide.toolbar.follow.c;

public class ForwardButton extends FrameLayout implements h	// class@0015ef
{
    public DetailToolBarButtonView b;
    public View c;
    public ImageView d;
    public Animator e;
    public Animator f;
    public Animator g;
    public boolean h;
    public boolean i;
    public Drawable j;
    public int k;

    public void ForwardButton(Context p0){
       super(p0);
       this.d(p0);
    }
    public void ForwardButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d(p0);
    }
    public void ForwardButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d(p0);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, ForwardButton.class, "22")) {
          return;
       }
       c3.c(this.e, b.a);
       c3.c(this.f, b.a);
       c3.c(this.g, b.a);
       this.h = false;
       return;
    }
    public void b(float p0){
       if (PatchProxy.isSupport(ForwardButton.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ForwardButton.class, "6")) {
          return;
       }
       this.b.setProgress(p0);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, ForwardButton.class, "19")) {
          return;
       }
       if (this.i == null) {
          return;
       }
       this.a();
       ForwardButton tc = this.c;
       if (tc != null) {
          tc.setVisibility(8);
       }
       this.e(this.b);
       return;
    }
    public final void d(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardButton.class, "3")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d02c8, this);
       DetailToolBarButtonView childAt = this.getChildAt(0);
       this.b = childAt;
       childAt.k(R.drawable.arg_RES_7f08071f, 0x7f080722);
       return;
    }
    public final void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardButton.class, "18")) {
          return;
       }
       p0.setAlpha(0x3f800000);
       p0.setScaleX(0x3f800000);
       p0.setScaleY(0x3f800000);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, ForwardButton.class, "21")) {
          return;
       }
       super.onDetachedFromWindow();
       this.a();
       return;
    }
    public void setAnimResource(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardButton.class, "7")) {
          return;
       }
       this.j = p0;
       if (this.i != null && p0 != null) {
          this.d.setImageDrawable(p0);
       }
       return;
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(ForwardButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ForwardButton.class, "8")) {
          return;
       }
       super.setEnabled(p0);
       if (p0) {
          if (!PatchProxy.applyVoid(null, this, ForwardButton.class, "20") && this.h != null) {
             this.b.setVisibility(8);
          }
       }else {
          this.c();
       }
       return;
    }
    public void setShareLayoutSize(int p0){
       if (PatchProxy.isSupport(ForwardButton.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ForwardButton.class, "17")) {
          return;
       }
       this.k = p0;
       ForwardButton tc = this.c;
       if (tc != null && tc.getLayoutParams() != null) {
          ViewGroup$LayoutParams layoutParams = this.c.getLayoutParams();
          layoutParams.width = p0;
          layoutParams.height = p0;
          this.b.setLayoutParams(layoutParams);
       }
       return;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(ForwardButton.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ForwardButton.class, "9")) {
          return;
       }
       super.setVisibility(p0);
       if (!this.isShown()) {
          this.c();
       }else if(this.b.getVisibility()){
          ForwardButton tc = this.c;
          if (tc != null && tc.getVisibility()) {
             int i = 0;
             Object[] objArray = null;
             if (this.e != null && d.a(0x4f878389).oF()) {
                if (!PatchProxy.applyVoid(objArray, this, ForwardButton.class, "10") && this.h == null) {
                   PatchProxyResult patchProxyRe = PatchProxyResult.class;
                   if (!PatchProxy.applyVoid(objArray, this, ForwardButton.class, "11") && this.i == null) {
                      this.c = a.c(this.getContext(), 0x7f0d0481, objArray);
                      ForwardButton tk = this.k;
                      if (tk <= null) {
                         tk = n.c(this.getContext(), 0x41f00000);
                      }
                      this.addView(this.c, new FrameLayout$LayoutParams(tk, tk, 17));
                      ImageView imageView = this.c.findViewById(R.id.image_view);
                      this.d = imageView;
                      ForwardButton tj = this.j;
                      if (tj != null) {
                         imageView.setImageDrawable(tj);
                      }
                      AnimatorSet uAnimatorSet = PatchProxy.apply(objArray, this, ForwardButton.class, "13");
                      int i1 = 3;
                      if (uAnimatorSet != patchProxyRe) {
                      }else {
                         uAnimatorSet = new AnimatorSet();
                         PropertyValuesHolder[] propertyValu3 = new PropertyValuesHolder[i1];
                         propertyValu3[i] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0});
                         propertyValu3[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0x3f000000});
                         propertyValu3[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0x3f000000});
                         PropertyValuesHolder[] propertyValu4 = new PropertyValuesHolder[i1];
                         propertyValu4[i] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000});
                         propertyValu4[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f000000,0x3f800000});
                         propertyValu4[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f000000,0x3f800000});
                         uAnimatorSet.play(ObjectAnimator.ofPropertyValuesHolder(this.b, propertyValu3)).with(ObjectAnimator.ofPropertyValuesHolder(this.c, propertyValu4));
                         uAnimatorSet.setDuration(250);
                      }
                      this.e = uAnimatorSet;
                      ObjectAnimator objectAnimat = PatchProxy.apply(objArray, this, ForwardButton.class, "14");
                      if (objectAnimat != patchProxyRe) {
                      }else {
                         PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i1]{0x3f800000,0x3f570a3d,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i1]{0x3f800000,0x3f570a3d,0x3f800000})};
                         objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.c, propertyValu2);
                         objectAnimat.setDuration(1000);
                         objectAnimat.setRepeatCount(-1);
                      }
                      this.f = objectAnimat;
                      AnimatorSet uAnimatorSet1 = PatchProxy.apply(objArray, this, ForwardButton.class, "15");
                      if (uAnimatorSet1 != patchProxyRe) {
                      }else {
                         uAnimatorSet1 = new AnimatorSet();
                         PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i1];
                         propertyValu[i] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000});
                         propertyValu[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f000000,0x3f800000});
                         propertyValu[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f000000,0x3f800000});
                         PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[i1];
                         propertyValu1[i] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0});
                         propertyValu1[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0x3f000000});
                         propertyValu1[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0x3f000000});
                         uAnimatorSet1.play(ObjectAnimator.ofPropertyValuesHolder(this.b, propertyValu)).with(ObjectAnimator.ofPropertyValuesHolder(this.c, propertyValu1));
                         uAnimatorSet1.setDuration(250);
                      }
                      this.g = uAnimatorSet1;
                      this.e.addListener(new d(this));
                      this.i = true;
                   }
                   this.e(this.b);
                   this.b.setVisibility(i);
                   tc = this.c;
                   if (tc != null) {
                      this.e(tc);
                      this.c.setVisibility(i);
                   }
                   tc = this.e;
                   if (tc != null) {
                      tc.start();
                   }
                   this.h = true;
                }
             }else if(PatchProxy.applyVoid(objArray, this, ForwardButton.class, "1") || (PatchProxy.isSupport(ForwardButton.class) && (PatchProxy.applyVoidOneRefs(Boolean.TRUE, this, ForwardButton.class, "2") || this.h == null))){
                this.c();
                if (!PatchProxy.applyVoid(objArray, this, ForwardButton.class, "12")) {
                   this.b.setVisibility(i);
                   c3.c(this.g, c.a);
                }
             }
          }
       }
       return;
    }
}
