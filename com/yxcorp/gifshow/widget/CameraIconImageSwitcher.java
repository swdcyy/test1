package com.yxcorp.gifshow.widget.CameraIconImageSwitcher;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import android.view.animation.Interpolator;
import android.view.View;
import java.util.List;
import java.lang.Float;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import th0.n;
import android.animation.TimeInterpolator;
import java.util.ArrayList;
import android.view.ViewGroup;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import android.animation.AnimatorSet;
import th0.e;
import th0.a;
import java.util.Collection;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import android.util.Property;
import th0.j;
import tyc.b0;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.widget.CameraIconImageSwitcher$a;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewParent;
import com.yxcorp.gifshow.widget.CameraIconImageSwitcher$b;
import android.view.ViewOutlineProvider;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.model.CDNUrl;
import com.facebook.drawee.view.DraweeView;

public class CameraIconImageSwitcher extends FrameLayout	// class@0017fe
{
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public KwaiBindableImageView h;
    public KwaiBindableImageView i;
    public KwaiBindableImageView j;
    public KwaiBindableImageView k;
    public View l;
    public View m;
    public ImageView n;
    public View o;
    public View p;
    public CDNUrl[] q;
    public CDNUrl[] r;
    public AnimatorSet s;
    public boolean t;
    public b u;
    public static final int v;
    public static final int w;

    static {
       CameraIconImageSwitcher.v = a1.e(3.00f);
       CameraIconImageSwitcher.w = a1.e(6.00f);
    }
    public void CameraIconImageSwitcher(Context p0){
       super(p0);
       this.b = "CameraIconImage";
       this.c = 300;
       this.d = 240;
       this.e = 600;
       this.f = 0x3f99999a;
       this.g = 0x3f19999a;
       this.c(p0);
    }
    public void CameraIconImageSwitcher(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = "CameraIconImage";
       this.c = 300;
       this.d = 240;
       this.e = 600;
       this.f = 0x3f99999a;
       this.g = 0x3f19999a;
       this.c(p0);
    }
    public void CameraIconImageSwitcher(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = "CameraIconImage";
       this.c = 300;
       this.d = 240;
       this.e = 600;
       this.f = 0x3f99999a;
       this.g = 0x3f19999a;
       this.c(p0);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, CameraIconImageSwitcher.class, "7")) {
          return;
       }
       CameraIconImageSwitcher tu = this.u;
       if (tu != null && !tu.isDisposed()) {
          this.u.dispose();
       }
       return;
    }
    public final List b(float p0,float p1,Interpolator p2,boolean p3,View p4){
       float[] obj;
       if (PatchProxy.isSupport(CameraIconImageSwitcher.class)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),p2,Boolean.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, CameraIconImageSwitcher.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new float[]{p0,p1};
       PropertyValuesHolder propertyValu = PropertyValuesHolder.ofFloat("scaleX", obj);
       float[] uofloatArray = new float[]{p0,p1};
       PropertyValuesHolder propertyValu1 = PropertyValuesHolder.ofFloat("scaleY", uofloatArray);
       float[] uofloatArray1 = new float[2];
       int i = 0x3f800000;
       int i1 = (p3)? 0: 0x3f800000;
       uofloatArray1[0] = i1;
       if (!p3) {
          i = 0;
       }
       uofloatArray1[1] = i;
       PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[]{propertyValu,propertyValu1};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p4, propertyValu2);
       propertyValu2 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("alpha", uofloatArray1)};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(p4, propertyValu2);
       objectAnimat1.setDuration(240);
       objectAnimat1.setInterpolator(new n());
       objectAnimat.setDuration(300);
       objectAnimat.setInterpolator(p2);
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(objectAnimat1);
       uArrayList.add(objectAnimat);
       return uArrayList;
    }
    public final void c(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraIconImageSwitcher.class, "1")) {
          return;
       }
       a.d(p0, R.layout.arg_RES_7f0d0170, this, true);
       this.h = this.findViewById(0x7f0a1025);
       this.i = this.findViewById(0x7f0a039a);
       this.n = this.findViewById(0x7f0a3c37);
       this.p = this.findViewById(0x7f0a38b6);
       this.j = this.findViewById(0x7f0a1027);
       this.k = this.findViewById(0x7f0a039e);
       this.l = this.findViewById(0x7f0a1029);
       this.m = this.findViewById(0x7f0a039f);
       this.s = new AnimatorSet();
       this.h(CameraIconImageSwitcher.w, CameraIconImageSwitcher.v);
       return;
    }
    public final void d(View p0,View p1,boolean p2,boolean p3,boolean p4){
       int i2;
       int i3;
       CameraIconImageSwitcher uCameraIconI = this;
       int i = 2;
       int i1 = 0;
       if (PatchProxy.isSupport(CameraIconImageSwitcher.class)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, CameraIconImageSwitcher.class, "12")) {
             return;
          }
       }
       if (uCameraIconI.s.isRunning()) {
          AnimatorSet uAnimatorSet = (!uCameraIconI.n.getVisibility())? 1: null;
          uCameraIconI.s.end();
          i2 = uAnimatorSet;
          i3 = 1;
       }else {
          i3 = 0;
          i2 = 0;
       }
       uCameraIconI.s = new AnimatorSet();
       int i4 = (!p2)? 0x3f99999a: 0x3f19999a;
       int i5 = 0x3f800000;
       int i6 = (p3)? 0x3f99999a: 0x3f19999a;
       uCameraIconI.o.getVisibility();
       List list = this.b(i5, i6, new e(), 0, p1);
       if (p2) {
          super(3.00f);
       }else {
          super(0);
       }
       list.addAll(this.b(i4, 0x3f800000, this, true, p0));
       AnimatorSet$Builder uBuilder = uCameraIconI.s.play(list.get(i1));
       for (int i7 = 1; i7 < list.size(); i7 = i7 + 1) {
          uBuilder.with(list.get(i7));
       }
       if (p4) {
          ObjectAnimator objectAnimat = PatchProxy.apply(null, this, CameraIconImageSwitcher.class, "14");
          if (objectAnimat != PatchProxyResult.class) {
          }else {
             float[] uofloatArray = new float[i];
             uofloatArray[i1] = (float)(- uCameraIconI.n.getWidth());
             uofloatArray[1] = (float)uCameraIconI.n.getWidth();
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, uofloatArray)};
             objectAnimat = ObjectAnimator.ofPropertyValuesHolder(uCameraIconI.n, propertyValu);
             objectAnimat.setDuration(600);
             objectAnimat.setInterpolator(new j());
             objectAnimat.addListener(new b0(this));
          }
          uBuilder.before(objectAnimat);
       }
       CameraIconImageSwitcher$a uBuilder1 = new CameraIconImageSwitcher$a(this, p0, p1, i3, i2);
       uCameraIconI.s.addListener(i1);
       uCameraIconI.s.start();
       return;
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraIconImageSwitcher.class, "8")) {
          return;
       }
       this.a();
       this.t = false;
       this.o.setVisibility(false);
       if (this.q != null) {
          CameraIconImageSwitcher tl = this.l;
          if (PatchProxy.isSupport(CameraIconImageSwitcher.class)) {
             Boolean fALSE = Boolean.FALSE;
             if (!PatchProxy.applyVoidFourRefs(p0, tl, fALSE, fALSE, this, CameraIconImageSwitcher.class, "11")) {
             }
          }else {
          }
       }
    label_0040 :
       this.p.setVisibility(8);
       this.q = null;
       this.r = null;
       return;
    }
    public void f(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraIconImageSwitcher.class, "9")) {
          return;
       }
       this.o = p0;
       this.e(p0);
       return;
    }
    public void g(int p0,int p1){
       if (PatchProxy.isSupport(CameraIconImageSwitcher.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CameraIconImageSwitcher.class, "3")) {
          return;
       }
       this.h(p1, p0);
       ViewGroup$MarginLayoutParams layoutParams = this.p.getLayoutParams();
       layoutParams.setMargins(p0, p0, p0, p0);
       this.p.setLayoutParams(layoutParams);
       return;
    }
    public View getCameraButtonView(){
       return this.o;
    }
    public final void h(int p0,int p1){
       if (PatchProxy.isSupport(CameraIconImageSwitcher.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CameraIconImageSwitcher.class, "16")) {
          return;
       }
       View parent = this.n.getParent();
       parent.setPadding(p1, p1, p1, p1);
       parent.setOutlineProvider(new CameraIconImageSwitcher$b(this, p1, p0));
       parent.setClipToOutline(true);
       return;
    }
    public void i(Drawable p0,CDNUrl[] p1,View p2,boolean p3,boolean p4,boolean p5,Drawable p6,CDNUrl[] p7){
       CameraIconImageSwitcher uCameraIconI = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p6;
       object oobject4 = p7;
       int i = 4;
       int i1 = 1;
       if (PatchProxy.isSupport(CameraIconImageSwitcher.class)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Boolean.valueOf(p3),Boolean.valueOf(p4),Boolean.valueOf(p5),oobject3,oobject4};
          if (PatchProxy.applyVoid(objArray, this, CameraIconImageSwitcher.class, "5")) {
             return;
          }
       }
       uCameraIconI.o = oobject2;
       uCameraIconI.t = i1;
       uCameraIconI.l.setVisibility(0);
       uCameraIconI.h.setVisibility(0);
       uCameraIconI.h.setImageDrawable(p0);
       if (oobject3 != null) {
          uCameraIconI.j.setVisibility(0);
          uCameraIconI.j.setImageDrawable(oobject3);
       }else {
          uCameraIconI.j.setVisibility(8);
       }
       if (p5) {
          uCameraIconI.p.setVisibility(0);
       }else {
          uCameraIconI.p.setVisibility(8);
       }
       this.setVisibility(0);
       if (uCameraIconI.q != null) {
          uCameraIconI.m.setVisibility(0);
          uCameraIconI.o.setVisibility(i);
          this.d(uCameraIconI.l, uCameraIconI.m, p3, p3, p4);
       }else {
          this.d(uCameraIconI.l, p2, true, true, p4);
       }
       uCameraIconI.q = oobject1;
       uCameraIconI.r = oobject4;
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, CameraIconImageSwitcher.class, "10")) {
          return;
       }
       super.onDetachedFromWindow();
       this.a();
       return;
    }
}
