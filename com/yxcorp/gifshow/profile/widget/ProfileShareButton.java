package com.yxcorp.gifshow.profile.widget.ProfileShareButton;
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
import com.yxcorp.gifshow.profile.widget.d;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;
import android.widget.ImageView;
import com.yxcorp.gifshow.profile.widget.c;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.n;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.profile.widget.e;
import lnc.c3$b;
import android.graphics.Bitmap;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet$Builder;
import b6c.g;
import android.animation.Animator$AnimatorListener;
import java.lang.Boolean;
import android.view.View$OnClickListener;
import java.lang.Integer;

public class ProfileShareButton extends FrameLayout	// class@0015fd
{
    public ImageView b;
    public ImageView c;
    public View d;
    public Animator e;
    public Animator f;
    public Animator g;
    public View$OnClickListener h;
    public int i;
    public Bitmap j;
    public boolean k;
    public boolean l;
    public static final int m;

    public void ProfileShareButton(Context p0){
       super(p0);
       this.i = -1;
       this.j = null;
       this.c(p0);
    }
    public void ProfileShareButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.i = -1;
       this.j = null;
       this.c(p0);
    }
    public void ProfileShareButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.i = -1;
       this.j = null;
       this.c(p0);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, ProfileShareButton.class, "19")) {
          return;
       }
       c3.c(this.e, b.a);
       c3.c(this.f, b.a);
       c3.c(this.g, b.a);
       this.k = false;
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, ProfileShareButton.class, "15")) {
          return;
       }
       if (this.l == null) {
          return;
       }
       this.a();
       c3.c(this.d, d.a);
       this.e(this.b);
       return;
    }
    public final void c(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileShareButton.class, "2")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d0751, this);
       ImageView imageView = this.findViewById(R.id.action_bar_share_profile);
       this.b = imageView;
       imageView.setImageResource(R.drawable.arg_RES_7f081da9);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, ProfileShareButton.class, "8")) {
          return;
       }
       ProfileShareButton td = this.d;
       if (!PatchProxy.applyVoidOneRefs(td, this, ProfileShareButton.class, "9")) {
          c3.c(td, new c(this));
       }
       return;
    }
    public final void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileShareButton.class, "14")) {
          return;
       }
       p0.setAlpha(0x3f800000);
       p0.setScaleX(0x3f800000);
       p0.setScaleY(0x3f800000);
       return;
    }
    public void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileShareButton.class, "6")) {
          return;
       }
       if (this.k != null) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoid(objArray, this, ProfileShareButton.class, "7") && this.l == null) {
          this.d = a.c(this.getContext(), 0x7f0d11f6, objArray);
          this.addView(this.d, new FrameLayout$LayoutParams(n.c(this.getContext(), 0x41f00000), n.c(this.getContext(), 0x41f00000), 17));
          ImageView imageView = c3.a(this.d, e.a);
          this.c = imageView;
          String str = -1;
          if (imageView != null) {
             ProfileShareButton ti = this.i;
             if (ti != str) {
                imageView.setImageResource(ti);
             }else {
                ti = this.j;
                if (ti != null) {
                   imageView.setImageBitmap(ti);
                }
             }
          }
          AnimatorSet uAnimatorSet = PatchProxy.apply(objArray, this, ProfileShareButton.class, "11");
          int i = 3;
          if (uAnimatorSet != patchProxyRe) {
          }else {
             uAnimatorSet = new AnimatorSet();
             PropertyValuesHolder[] propertyValu3 = new PropertyValuesHolder[i];
             propertyValu3[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0});
             propertyValu3[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0x3f000000});
             propertyValu3[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0x3f000000});
             PropertyValuesHolder[] propertyValu4 = new PropertyValuesHolder[i];
             propertyValu4[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000});
             propertyValu4[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f000000,0x3f800000});
             propertyValu4[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f000000,0x3f800000});
             uAnimatorSet.play(ObjectAnimator.ofPropertyValuesHolder(this.b, propertyValu3)).with(ObjectAnimator.ofPropertyValuesHolder(this.d, propertyValu4));
             uAnimatorSet.setDuration(250);
          }
          this.e = uAnimatorSet;
          ObjectAnimator objectAnimat = PatchProxy.apply(objArray, this, ProfileShareButton.class, "12");
          if (objectAnimat != patchProxyRe) {
          }else {
             PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i]{0x3f800000,0x3f570a3d,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i]{0x3f800000,0x3f570a3d,0x3f800000})};
             objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.d, propertyValu2);
             objectAnimat.setDuration(1000);
             objectAnimat.setRepeatCount(str);
          }
          this.f = objectAnimat;
          AnimatorSet uAnimatorSet1 = PatchProxy.apply(objArray, this, ProfileShareButton.class, "13");
          if (uAnimatorSet1 != patchProxyRe) {
          }else {
             uAnimatorSet1 = new AnimatorSet();
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i];
             propertyValu[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000});
             propertyValu[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f000000,0x3f800000});
             propertyValu[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f000000,0x3f800000});
             PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[i];
             propertyValu1[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0});
             propertyValu1[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0x3f000000});
             propertyValu1[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0x3f000000});
             uAnimatorSet1.play(ObjectAnimator.ofPropertyValuesHolder(this.b, propertyValu)).with(ObjectAnimator.ofPropertyValuesHolder(this.d, propertyValu1));
             uAnimatorSet1.setDuration(250);
          }
          this.g = uAnimatorSet1;
          this.e.addListener(new g(this));
          this.d();
          this.l = true;
       }
       this.e(this.b);
       this.b.setVisibility(0);
       this.e(this.d);
       this.d.setVisibility(0);
       this.e.start();
       this.k = true;
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, ProfileShareButton.class, "18")) {
          return;
       }
       super.onDetachedFromWindow();
       this.a();
       return;
    }
    public void setAnimBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileShareButton.class, "3")) {
          return;
       }
       this.j = p0;
       ProfileShareButton tc = this.c;
       if (tc != null) {
          tc.setImageBitmap(p0);
       }
       return;
    }
    public void setAnimResource(int p0){
       this.i = p0;
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(ProfileShareButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ProfileShareButton.class, "4")) {
          return;
       }
       super.setEnabled(p0);
       if (p0) {
          if (!PatchProxy.applyVoid(null, this, ProfileShareButton.class, "16") && this.k != null) {
             this.b.setVisibility(8);
          }
       }else {
          this.b();
       }
       return;
    }
    public void setOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileShareButton.class, "17")) {
          return;
       }
       super.setOnClickListener(p0);
       this.h = p0;
       this.d();
       return;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(ProfileShareButton.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ProfileShareButton.class, "5")) {
          return;
       }
       super.setVisibility(p0);
       if (!this.isShown()) {
          this.b();
       }
       return;
    }
}
