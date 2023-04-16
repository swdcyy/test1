package jg9.f;
import jg9.f$a;
import nsd.u;
import com.yxcorp.gifshow.camera.record.base.b;
import ed9.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Objects;
import android.graphics.Bitmap;
import jg9.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import msd.l;
import android.view.ViewGroup;
import android.animation.ValueAnimator;
import com.yxcorp.gifshow.camera.record.widget.RoundedImageView;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.FrameLayout$LayoutParams;
import o79.i;
import qrd.l1;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$b;
import android.widget.ImageView$ScaleType;
import java.util.HashSet;
import android.view.animation.Interpolator;
import c2.a;
import android.animation.TimeInterpolator;
import jg9.f$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.util.Property;
import android.animation.ObjectAnimator;
import jg9.f$c;
import android.animation.Animator$AnimatorListener;
import android.view.animation.LinearInterpolator;
import android.animation.AnimatorSet;
import jg9.f$d;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import kd9.s;
import android.view.ViewPropertyAnimator;

public final class f	// class@002a97
{
    public int a;
    public float b;
    public Animator c;
    public Animator d;
    public View e;
    public View f;
    public View g;
    public View h;
    public View i;
    public Activity j;
    public View k;
    public View l;
    public boolean m;
    public View n;
    public final b o;
    public final f p;
    public static final f$a q;

    static {
       f.q = new f$a(null);
    }
    public void f(b p0,f p1){
       a.p(p0, "callerContext");
       a.p(p1, "panelDisplayRecorder");
       super();
       this.o = p0;
       this.p = p1;
       this.m = true;
    }
    public final boolean a(View p0,int p1){
       ViewGroup$LayoutParams obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uof, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!p0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          return false;
       }else {
          obj = p0.getLayoutParams();
          Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          obj.bottomMargin = obj.bottomMargin + p1;
          p0.setLayoutParams(obj);
          return true;
       }
    }
    public final b b(){
       return this.o;
    }
    public final void c(int p0,Bitmap p1,t0 p2,LinearLayoutManager p3,MultiTakePictrueItem p4,l p5){
       float[] uofloatArray;
       Object obj = this;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       f uof = f.class;
       int i = 4;
       int i1 = 2;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),oobject,oobject1,oobject2,oobject3,oobject4};
          if (PatchProxy.applyVoid(objArray, obj, uof, "3")) {
             return;
          }
       }
       a.p(oobject, "bitmap");
       a.p(oobject1, "adapter");
       a.p(oobject2, "linearLayoutManager");
       a.p(oobject3, "item");
       a.p(oobject4, "endAction");
       uof = obj.i;
       String str = "cameraView";
       if (uof == null) {
          a.S(str);
       }
       int height = uof.getHeight();
       uof = obj.i;
       if (uof == null) {
          a.S(str);
       }
       int width = uof.getWidth();
       uof = obj.l;
       if (!uof instanceof ViewGroup) {
          uofloatArray = null;
       }
       f uof1 = uofloatArray;
       if (!height || (width && uof1 != null)) {
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[i1]{0,0x3f800000});
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          RoundedImageView roundedImage = new RoundedImageView(uoc.a());
          uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          View view = new View(uoc.a());
          view.setBackgroundResource(R.drawable.arg_RES_7f0816f1);
          c uoc1 = a.a();
          a.o(uoc1, "AppEnv.get\(\)");
          FrameLayout uFrameLayout = new FrameLayout(uoc1.a());
          uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(width, height));
          roundedImage.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(i.d(20.00f), i.d(20.00f));
          layoutParams.gravity = 53;
          layoutParams.topMargin = i.c(0x7f07030a);
          layoutParams.rightMargin = i.c(0x7f07030a);
          view.setLayoutParams(layoutParams);
          view.setVisibility(4);
          uFrameLayout.addView(roundedImage);
          uFrameLayout.addView(view);
          f i2 = obj.i;
          if (i2 == null) {
             a.S(str);
          }
          float x = i2.getX();
          i2 = obj.i;
          if (i2 == null) {
             a.S(str);
          }
          float y = i2.getY();
          i2 = obj.i;
          if (i2 == null) {
             a.S(str);
          }
          roundedImage.setScaleType(ImageView$ScaleType.CENTER_CROP);
          roundedImage.setImageBitmap(oobject);
          uFrameLayout.setTranslationX(x);
          uFrameLayout.setTranslationY(y);
          p2.M0().add(p4.c());
          a.o(valueAnimato, "moveAnimator");
          valueAnimato.setDuration(300);
          valueAnimato.setInterpolator(a.b(0.32f, 0x3f70a3d7, 0x3f19999a, 0x3f800000));
          FrameLayout uFrameLayout1 = uFrameLayout;
          View view1 = view;
          ValueAnimator valueAnimato1 = valueAnimato;
          FrameLayout uFrameLayout2 = uFrameLayout1;
          FrameLayout uFrameLayout3 = uFrameLayout1;
          f$b uob = new f$b(this, p0, p3, n.o(i2), x, y, roundedImage, uFrameLayout2, MultiTakePictureController.V.a(), width, height);
          valueAnimato1.addUpdateListener(obj);
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(view1, View.ALPHA, new float[2]{0,0x3f800000});
          objectAnimat.addListener(new f$c(view1));
          a.o(objectAnimat, "closeAnimator");
          objectAnimat.setStartDelay(200);
          objectAnimat.setDuration(100);
          objectAnimat.setInterpolator(new LinearInterpolator());
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(roundedImage, View.ALPHA, new float[2]{0,0x3f800000});
          a.o(objectAnimat1, "alphaAnimator");
          objectAnimat1.setDuration(300);
          objectAnimat1.setInterpolator(new LinearInterpolator());
          AnimatorSet uAnimatorSet = new AnimatorSet();
          f$d uod = new f$d(uof1, uFrameLayout3, p2, p4, p5);
          uAnimatorSet.addListener(width);
          uAnimatorSet.play(valueAnimato1).with(objectAnimat1).with(objectAnimat);
          uAnimatorSet.start();
       }
    label_01ec :
       return;
    }
    public final void d(View p0,boolean p1){
       float f;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uof, "6")) {
          return;
       }
       f = 0;
       if (this.o.d(s.g).e == 1 && p1) {
          f = (float)this.a * (float)-1;
       }
       f ti = this.i;
       if (ti == null) {
          a.S("cameraView");
       }
       if (ti.getTranslationY() - f) {
          ti = this.i;
          if (ti == null) {
             a.S("cameraView");
          }
          ti.animate().translationY(f).start();
       }
       if (p0 != null && p0.getTranslationY() - f) {
          p0.animate().translationY(f).start();
       }
       f tk = this.k;
       if (tk != null && tk.getTranslationY() - f) {
          tk.animate().translationY(f).start();
       }
       return;
    }
}
