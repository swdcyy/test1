package com.kuaishou.commercial.splash.presenter.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import wkd.b;
import tjc.c;
import tjc.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import ujc.g;
import brd.t;
import t45.d;
import brd.z;
import gz.y1;
import erd.g;
import crd.b;
import com.kuaishou.commercial.splash.presenter.l;
import com.kuaishou.commercial.splash.presenter.m;
import mxb.o;
import com.kuaishou.commercial.splash.presenter.k;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import java.lang.Boolean;
import android.graphics.Bitmap;
import android.view.View;
import android.graphics.Bitmap$Config;
import gz.d2;
import android.view.ViewGroup;
import com.kuaishou.commercial.splash.presenter.g;
import android.widget.ImageView;
import android.content.Context;
import android.widget.ImageView$ScaleType;
import android.graphics.Rect;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.animation.ValueAnimator;
import gz.o;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.animation.ObjectAnimator;
import gz.q;
import android.animation.Animator$AnimatorListener;
import gz.n;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import gz.r;
import im8.f;
import yy.x0;
import android.view.animation.AccelerateDecelerateInterpolator;
import gz.c2;

public class n extends PresenterV2	// class@0015fc
{
    public ViewGroup p;
    public f q;
    public t r;
    public View s;
    public boolean t;
    public BaseFeed u;

    public void n(){
       super();
    }
    public void E8(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, n.class, "3")) {
          return;
       }
       int i = 0;
       String str = "SplashExitAnimatorPrese";
       if (this.p == null) {
          objArray = new Object[i];
          j0.c(str, "mSplashFrameView is null", objArray);
          return;
       }else {
          b uob = b.a(-1608526086).a();
          if (uob == null) {
             objArray = new Object[i];
             j0.f(str, "splash ad data is null", objArray);
             return;
          }else {
             this.u = uob.b;
             this.X7(RxBus.f.f(g.class).observeOn(d.a).subscribe(new y1(this)));
             this.X7(this.r.subscribe(new l(this), m.b));
             c c = o.c;
             if (c != null) {
                this.X7(c.subscribe(new k(this)));
             }
             return;
          }
       }
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, n.class, "4");
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, n.class, "10")) {
          return;
       }
       c uoc = b.a(-1608526086);
       if (uoc.getState() == 3) {
          uoc.a0();
       }
       return;
    }
    public void R8(String p0){
       n on = n.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, on, "12")) {
          return;
       }
       StringBuilder str = "";
       String str1 = PatchProxy.apply(null, this, on, "13");
       if (str1 != PatchProxyResult.class) {
       }else {
          Activity activity = this.getActivity();
          str1 = (activity != null)? activity.toString(): "";
       }
       Object[] objArray = new Object[0];
       j0.f("SplashExitAnimatorPrese", str+str1+p0, objArray);
       return;
    }
    public final void S8(boolean p0){
       n tp1;
       x0 ox0;
       Object[] objArray;
       n on = n.class;
       String str = "8";
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, on, str)) {
          return;
       }
       int i = 2;
       if (!p0) {
          n tp = this.p;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Bitmap obj = PatchProxy.applyOneRefs(tp, this, on, "11");
          if (obj != patchProxyRe) {
             patchProxyRe = obj.booleanValue();
          }else {
             this.R8("try to start anim");
             n ts = this.s;
             int i1 = 0;
             if (ts != null) {
                obj = PatchProxy.applyOneRefs(ts, this, on, "14");
                if (obj != patchProxyRe) {
                }else {
                   ts.setDrawingCacheEnabled(1);
                   obj = ts.getDrawingCache();
                   obj = (obj != null && !obj.isRecycled())? obj.copy(obj.getConfig(), obj.isMutable()): null;
                   ts.setDrawingCacheEnabled(i1);
                }
                Object obj1 = obj;
                if (obj1 != null) {
                   d2 uod2 = new d2(this, tp, ts, obj1, ts);
                   g og = g.class;
                   if (!PatchProxy.applyVoid(null, v12, og, "1")) {
                      if (!PatchProxy.applyVoid(null, v12, og, "2")) {
                         ImageView imageView = new ImageView(v12.b.getContext());
                         v12.e = imageView;
                         imageView.setScaleType(ImageView$ScaleType.CENTER_CROP);
                         v12.b.addView(v12.e);
                         v12.e.setVisibility(4);
                         float g imageView1 = v12.q;
                         g p = v12.p;
                         g og1 = PatchProxy.apply(null, v12, og, "5");
                         if (og1 != patchProxyRe) {
                         }else if(v12.f == null){
                            v12.f = new Rect();
                         }
                         int[] ointArray = new int[i];
                         v12.a.getLocationOnScreen(ointArray);
                         v12.f.set(i1, i1, v12.a.getWidth(), v12.a.getHeight());
                         v12.f.offset(ointArray[i1], ointArray[1]);
                         og1 = v12.f;
                         float f = 0x3f800000;
                         if (og1 == null || !og1.width()) {
                            int i2 = v12.c();
                            int i3 = v12.b();
                            if ((i2 * imageView1) >= (i3 * p)) {
                               imageView1 = (((float)p * f) * (float)i3) / (float)i2;
                            }else {
                               p = (int)((((float)imageView1 * f) * (float)i2) / (float)i3);
                            label_011e :
                               v12.g = p;
                               v12.h = imageView1;
                               v12.a();
                               ViewGroup$LayoutParams layoutParams = v12.e.getLayoutParams();
                               layoutParams.width = p;
                               layoutParams.height = imageView1;
                               if (!PatchProxy.applyVoidOneRefs(layoutParams, v12, og, "4")) {
                                  if (layoutParams instanceof FrameLayout$LayoutParams) {
                                     layoutParams.gravity = 17;
                                  }else if(layoutParams instanceof RelativeLayout$LayoutParams){
                                     layoutParams.addRule(13);
                                  }
                               }
                               v12.e.requestLayout();
                               v12.e.setImageBitmap(v12.c);
                            }
                         }else {
                            imageView1 = (((float)og1.height() * f) / (float)og1.width()) * (float)p;
                         }
                         imageView1 = (int)imageView1;
                         goto label_011e ;
                      }
                      if (!PatchProxy.applyVoid(null, v12, og, str)) {
                         v12.k = v12.b.getTranslationX();
                         v12.l = v12.b.getTranslationY();
                         v12.m = v12.b.getScaleX();
                         v12.n = v12.b.getScaleY();
                         ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[i]{0,0x3f800000});
                         valueAnimato.addUpdateListener(new o(v12));
                         valueAnimato.setDuration(600);
                         valueAnimato.setInterpolator(v12.o);
                         ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(v12.e, View.ALPHA, new float[i]{0,0x3f800000});
                         objectAnimat1.addListener(new q(v12));
                         ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[i]{0,0x3f800000});
                         valueAnimato1.addUpdateListener(new n(v12));
                         objectAnimat1.setDuration(500);
                         valueAnimato1.setDuration(500);
                         AnimatorSet uAnimatorSet = new AnimatorSet();
                         uAnimatorSet.play(valueAnimato).with(objectAnimat1).with(valueAnimato1);
                         uAnimatorSet.addListener(new r(v12));
                         uAnimatorSet.start();
                      }
                   }
                   tp1 = this.q;
                   if (tp1 != null) {
                      ox0 = tp1.get();
                      if (ox0 != null) {
                         ox0.s();
                      }
                   }
                   ox0 = true;
                }
             }
             patchProxyRe = false;
          }
          if (patchProxyRe) {
             return;
          }
       }
       tp1 = this.p;
       if (!PatchProxy.applyVoidOneRefs(tp1, this, on, "9")) {
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tp1, View.ALPHA, new float[i]{0x3f800000,0});
          objectAnimat.setDuration(400);
          objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
          objectAnimat.addListener(new c2(this));
          objectAnimat.start();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       this.p = this.getActivity().findViewById(0x7f0a3aec);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.q = this.w8("SPLASH_AD_LOG");
       this.r = this.r8("SPLASH_ENHANCE_DISPLAY_EVENT");
       return;
    }
    public void onEventMainThread(g p0){
       this.s = (p0.b != null && this.s == p0.a)? null: p0.a;
       return;
    }
}
