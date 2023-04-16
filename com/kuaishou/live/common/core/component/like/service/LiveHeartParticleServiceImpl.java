package com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl;
import lo1.c;
import androidx.lifecycle.LifecycleObserver;
import lnc.a1;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import lo1.l;
import p91.m;
import lp3.e;
import ry1.b;
import wo1.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.like.service.a;
import java.util.Random;
import java.util.LinkedList;
import com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl$a;
import com.kuaishou.live.common.core.component.like.particle.LiveHeartParticleBubbleView$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.view.ViewGroup;
import w51.a;
import ko1.b0;
import com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import ry1.a;
import lp3.c;
import brd.t;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import lo1.f;
import com.kuaishou.live.common.core.component.like.service.b;
import erd.g;
import crd.b;
import lo1.g;
import lo1.e;
import com.kuaishou.live.common.core.component.like.service.c;
import ekd.y0;
import lo1.i;
import java.lang.Runnable;
import com.yxcorp.utility.n;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import android.view.View$OnTouchListener;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.k1;
import java.lang.Number;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator$AnimatorListener;
import android.widget.ImageView;
import java.util.Queue;
import java.lang.Float;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import android.content.Context;
import com.airbnb.lottie.RenderMode;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.common.core.component.like.particle.b;
import d61.y;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import lo1.h;
import java.lang.System;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.Math;
import java.lang.Integer;
import jo1.g;
import android.graphics.Bitmap;
import ekd.j;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import ko1.a;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.component.like.service.d;
import android.animation.Animator;
import d61.c0;
import com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl$b;
import w4.e;
import com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl$c;
import java.util.Objects;
import java.util.Iterator;
import com.kuaishou.live.common.core.basic.tools.g$c;

public class LiveHeartParticleServiceImpl implements c, LifecycleObserver	// class@001478
{
    public int A;
    public boolean B;
    public final Queue C;
    public final Queue D;
    public boolean E;
    public final Runnable F;
    public final LiveHeartParticleBubbleView$c G;
    public boolean b;
    public final c c;
    public int d;
    public long e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public final Activity k;
    public Queue l;
    public y0 m;
    public b0 n;
    public b o;
    public final l p;
    public final b q;
    public final a r;
    public final e s;
    public final BaseFragment t;
    public final m u;
    public final Random v;
    public ViewGroup w;
    public ViewGroup x;
    public View y;
    public int z;
    public static final int H;

    static {
       LiveHeartParticleServiceImpl.H = a1.e(80.00f);
    }
    public void LiveHeartParticleServiceImpl(Activity p0,BaseFragment p1,View p2,l p3,m p4,e p5,b p6,a p7){
       super();
       this.b = false;
       this.c = a.b;
       this.v = new Random();
       this.B = false;
       this.C = new LinkedList();
       this.D = new LinkedList();
       this.F = new LiveHeartParticleServiceImpl$a(this);
       this.G = new LiveHeartParticleBubbleView$c();
       this.p = p3;
       this.u = p4;
       this.s = p5;
       this.q = p6;
       this.r = p7;
       this.k = p0;
       this.t = p1;
       if (PatchProxy.applyVoidOneRefs(p2, this, LiveHeartParticleServiceImpl.class, "3")) {
       }else {
          this.w = m1.f(p2, 0x7f0a2006);
          this.y = m1.f(p2, 0x7f0a2007);
          this.x = m1.f(p2, 0x7f0a209b);
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveHeartParticleServiceImpl.class, "4")) {
          this.z = a1.e(0x42f00000);
          if (a.J()) {
             this.w.setVisibility(8);
             LiveHeartParticleServiceImpl ty = this.y;
             if (ty != null) {
                ty.setVisibility(8);
             }
             ty = this.x;
             if (ty != null) {
                ty.setVisibility(8);
             }
          }
          this.n = new b0();
          if (!PatchProxy.applyVoid(objArray, this, LiveHeartParticleServiceImpl.class, "12") && p4 != null) {
             if (p4.u5() == LiveSceneType.Anchor) {
                p5.a(a.class).F3().compose(p1.ge()).subscribe(new f(this), b.b);
             }else if(p6 != null){
                p6.W().compose(p1.ge()).subscribe(new g(this), b.b);
                p6.T3().compose(p1.ge()).subscribe(new e(this), c.b);
             }
          }
          this.l = new LinkedList();
          this.m = new y0(100, new i(this));
          this.f = n.k(p0) / 2;
          this.g = n.j(p0) / 2;
       }
       p1.getLifecycle().addObserver(this);
       return;
    }
    public void a(View$OnTouchListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHeartParticleServiceImpl.class, "2")) {
          return;
       }
       LiveHeartParticleServiceImpl tu = this.u;
       if (tu != null && tu.e()) {
          tu = this.y;
          if (tu != null) {
             tu.setOnTouchListener(p0);
          }
       }else {
          this.w.setOnTouchListener(p0);
       }
       return;
    }
    public void b(boolean p0){
       this.b = p0;
    }
    public boolean c(MotionEvent p0,boolean p1){
       LiveHeartParticleServiceImpl obj;
       Object obj1;
       if (PatchProxy.isSupport(LiveHeartParticleServiceImpl.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, LiveHeartParticleServiceImpl.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (this.B != null) {
          return b;
       }else {
          obj = this.r;
          if (obj != null) {
             obj.a();
          }
          boolean b1 = true;
          if (p1) {
             obj1 = PatchProxy.applyOneRefs(p0, this, LiveHeartParticleServiceImpl.class, "7");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else {
                k1.m(this.F);
                k1.s(this.F, this, 300);
                if (this.E != null) {
                   if (p0 != null) {
                      if (this.g()) {
                         if (this.u.e()) {
                            if (this.i != null) {
                               this.p.e(b1);
                               this.k(p0.getRawX(), p0.getRawY());
                            }else {
                               this.j(p0.getRawX(), p0.getRawY());
                            }
                         }else if(this.i != null){
                            this.p.e(b1);
                            this.k(p0.getRawX(), p0.getRawY());
                         }else {
                            this.p.e(b);
                            this.j(p0.getRawX(), p0.getRawY());
                         }
                      }else {
                         this.j(p0.getRawX(), p0.getRawY());
                      }
                   }
                   b = true;
                }
             }
             return b;
          }else {
             obj1 = PatchProxy.applyOneRefs(p0, this, LiveHeartParticleServiceImpl.class, "6");
             if (obj1 != PatchProxyResult.class) {
                b1 = obj1.booleanValue();
             }else {
                k1.m(this.F);
                k1.s(this.F, this, 300);
                if (this.E == null) {
                   this.E = b1;
                }
                if (p0 != null) {
                   if (this.g()) {
                      if (this.u.e()) {
                         if (this.i != null) {
                            this.k(p0.getRawX(), p0.getRawY());
                         }else {
                            this.j(p0.getRawX(), p0.getRawY());
                         }
                      }else if(this.i != null){
                         this.p.e(b1);
                         this.k(p0.getRawX(), p0.getRawY());
                      }else {
                         this.p.e(b);
                         this.j(p0.getRawX(), p0.getRawY());
                      }
                   }else {
                      this.j(p0.getRawX(), p0.getRawY());
                   }
                }
             }
             return b1;
          }
       }
    }
    public b0 d(){
       return this.n;
    }
    public final int e(){
       Object obj = PatchProxy.apply(null, this, LiveHeartParticleServiceImpl.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.v.nextInt(53) - 26);
    }
    public final int[] f(View p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, LiveHeartParticleServiceImpl.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new int[2];
       if (p0 != null) {
          p0.getLocationOnScreen(obj);
       }
       return obj;
    }
    public final boolean g(){
       boolean b = (this.u != null && this.p != null)? true: false;
       return b;
    }
    public void h(LottieAnimationView p0,Animator$AnimatorListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveHeartParticleServiceImpl.class, "10")) {
          return;
       }
       if (!this.t.isAdded()) {
          return;
       }
       p0.v(p1);
       p0.setVisibility(4);
       this.C.offer(p0);
       return;
    }
    public void i(LottieAnimationView p0,Animator$AnimatorListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveHeartParticleServiceImpl.class, "30")) {
          return;
       }
       if (!this.t.isAdded()) {
          return;
       }
       p0.v(p1);
       p0.setVisibility(4);
       this.l.offer(p0);
       return;
    }
    public final void j(float p0,float p1){
       LiveHeartParticleServiceImpl liveHeartPar = LiveHeartParticleServiceImpl.class;
       if (PatchProxy.isSupport(liveHeartPar) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, liveHeartPar, "8")) {
          return;
       }
       int i = 0;
       int i1 = 0xbf800000;
       LiveHeartParticleServiceImpl liveHeartPar1 = (p0 - i1 > 0 && p1 - i1 > 0)? 1: null;
       LiveHeartParticleServiceImpl tz = this.z;
       LottieAnimationView lottieAnimat = this.C.poll();
       if (lottieAnimat == null) {
          if (this.A == 3) {
             return;
          }else {
             lottieAnimat = new LiveLottieAnimationView(this.k);
             lottieAnimat.setRenderMode(RenderMode.HARDWARE);
             lottieAnimat.k(true);
             this.w.addView(lottieAnimat, new FrameLayout$LayoutParams(this.z, this.z));
             this.A = this.A + true;
          }
       }
       FrameLayout$LayoutParams layoutParams = lottieAnimat.getLayoutParams();
       layoutParams.width = tz;
       layoutParams.height = tz;
       float f = 2.00f;
       if (liveHeartPar1) {
          int[] ointArray = this.f(this.w);
          float f1 = (float)tz;
          lottieAnimat.setTranslationX(((p0 - (f1 / f)) - (float)ointArray[i]));
          lottieAnimat.setTranslationY(((p1 - (f1 * 0x3f7ae148)) - (float)ointArray[1]));
          lottieAnimat.setRotation((float)this.e());
          layoutParams.gravity = -1;
       }else {
          lottieAnimat.setTranslationX(0);
          lottieAnimat.setTranslationY(0);
          lottieAnimat.setRotation(0);
          layoutParams.gravity = 17;
       }
       lottieAnimat.setLayoutParams(layoutParams);
       this.l(lottieAnimat);
       float f2 = (float)tz;
       b.a((int)(p0 - (f2 / f)), (int)(p1 - (f2 * 0.30f)), tz, tz, this.w, this.G);
       return;
    }
    public final void k(float p0,float p1){
       LiveHeartParticleServiceImpl o;
       int b;
       double d;
       double d1;
       ImageView imageView1;
       int i2;
       int i3;
       float[] this;
       Bitmap[] obj1;
       object oobject;
       int h;
       b uob = this;
       float f = p0;
       float f1 = p1;
       if (PatchProxy.isSupport(LiveHeartParticleServiceImpl.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), uob, LiveHeartParticleServiceImpl.class, "13")) {
          return;
       }
       Float uFloat = 700;
       if (!y.d(uob.k) && uob.j == null) {
          o = uob.o;
          if (o != null) {
             o.dispose();
          }
          o = uob.m;
          if (o != null) {
             o.e();
          }
          b uob1 = PatchProxy.apply(null, uob, LiveHeartParticleServiceImpl.class, "22");
          if (uob1 != PatchProxyResult.class) {
          }else {
             uob1 = t.timer(uFloat, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new h(uob), b.b);
          }
          uob.o = uob1;
       }
       ImageView obj = PatchProxy.apply(null, uob, LiveHeartParticleServiceImpl.class, "27");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          long l = System.currentTimeMillis();
          b = ((l - uob.e) - uFloat < 0)? true: false;
          uob.e = l;
       }
       int i = 10;
       uob.d = (b || uob.d >= i)? uob.d + 1: 1;
       if (!q.f(uob.n.j())) {
          d = Math.random();
          d1 = (double)uob.n.j().size();
       }else {
          d = Math.random();
          d1 = 0x3ff0000000000000;
       }
       int i1 = (int)(d * d1);
       obj = uob.D.poll();
       if (obj == null) {
          if (uob.A == 20) {
             return;
          }else {
             obj = new ImageView(uob.k);
             uob.x.addView(obj, new FrameLayout$LayoutParams(-2, -2));
             uob.A = uob.A + 1;
          }
       }
       ImageView imageView = obj;
       if (PatchProxy.isSupport(LiveHeartParticleServiceImpl.class)) {
          imageView1 = imageView;
          i2 = i1;
          if (PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Integer.valueOf(i1), imageView, this, LiveHeartParticleServiceImpl.class, "15")) {
             i3 = i2;
          label_01e3 :
             if (!q.f(uob.n.j())) {
                if (uob.n.j().get(i3).b == 1) {
                   uob.m(this.o(p0, p1));
                }
             }else if(i3 == 2){
                uob.m(this.o(p0, p1));
             }
             LiveHeartParticleServiceImpl liveHeartPar = 3;
             if (f1 - (float)uob.g < 0) {
                b = (f - (float)uob.f < 0)? 1: 2;
             }else if(f - (float)uob.f < 0){
                b = 4;
             }else {
                b = 3;
             }
             uob.h = b;
             if (!PatchProxy.applyVoidOneRefs(imageView1, uob, LiveHeartParticleServiceImpl.class, "19")) {
                AnimatorSet uAnimatorSet = new AnimatorSet();
                this = new float[]{imageView1.getScaleX(),0x3f666666};
                float[] uofloatArray = new float[]{imageView1.getScaleY(),0x3f666666};
                uofloatArray = new float[]{imageView1.getRotation(),0xc0a00000};
                uAnimatorSet.addListener(new d(uob, imageView1));
                uAnimatorSet.setDuration(200);
                Animator[] uAnimatorArr = new Animator[liveHeartPar];
                uAnimatorArr[0] = ObjectAnimator.ofFloat(imageView1, View.SCALE_X, this);
                uAnimatorArr[1] = ObjectAnimator.ofFloat(imageView1, View.SCALE_Y, uofloatArray);
                uAnimatorArr[2] = ObjectAnimator.ofFloat(imageView1, View.ROTATION, uofloatArray);
                uAnimatorSet.playTogether(uAnimatorArr);
                uAnimatorSet.start();
             }
             o = uob.p;
             if (o != null) {
                o.i(uob.d);
             }
             if (uob.d == 5) {
                o = uob.p;
                if (o != null && (!o.c() && (!y.d(uob.k) && uob.j == null))) {
                   uob.p.j();
                }
             }
          label_02b7 :
             o = uob.p;
             if (o != null && (!o.c() && (!y.d(uob.k) && uob.j == null))) {
                uob.p.h(1);
             }
          label_02d2 :
             if (uob.d >= 10 && (!y.d(uob.k) && uob.j == null)) {
                this.n();
                uob.p.b(1);
             }
          label_02ec :
             if (uob.p.g()) {
                uob.p.f();
             }
             return;
          }
       }else {
          imageView1 = imageView;
          i2 = i1;
       }
       imageView1.setVisibility(0);
       if (q.f(uob.n.j())) {
          g og = g.class;
          if (PatchProxy.isSupport(og)) {
             obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i2), null, og, "1");
             if (obj1 != PatchProxyResult.class) {
                oobject = obj1;
                i3 = i2;
             }
          }
          if (j.h(g.a)) {
             obj1 = new Bitmap[1];
             g.a = obj1;
             g.a[0] = BitmapFactory.decodeResource(a1.m(), 0x7f081348);
             obj1 = g.a;
             int i4 = a1.d(R.dimen.arg_RES_7f070871);
             h = a1.d(R.dimen.arg_RES_7f070871);
             if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidThreeRefs(obj1, Integer.valueOf(i4), Integer.valueOf(h), null, g.class, "2")) {
                b = obj1.length;
                for (int this1 = 0; this1 < b; this1++) {
                   obj1[this1] = Bitmap.createScaledBitmap(obj1[this1], i4, h, 1);
                }
             }
          }
          i3 = i2;
          oobject = g.a[i3];
       }else {
          i3 = i2;
          oobject = uob.n.j().get(i3).a;
       }
       imageView1.setImageBitmap(oobject);
       FrameLayout$LayoutParams layoutParams = imageView1.getLayoutParams();
       h = LiveHeartParticleServiceImpl.H;
       layoutParams.width = h;
       layoutParams.height = h;
       imageView1.setRotation(0);
       imageView1.setAlpha(0x3f800000);
       imageView1.setScaleX(0.10f);
       imageView1.setScaleY(0.10f);
       float f2 = (float)h;
       imageView1.setTranslationX((f - (0x3f000000 * f2)));
       imageView1.setTranslationY((f1 - (f2 * 0x3f7ae148)));
       uob.p(f, f1, imageView1);
       layoutParams.gravity = -1;
       imageView1.setLayoutParams(layoutParams);
       goto label_01e3 ;
    }
    public final void l(LottieAnimationView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHeartParticleServiceImpl.class, "11")) {
          return;
       }
       p0.t();
       p0.f();
       p0.setVisibility(4);
       p0.setAnimationFromUrl(c0.a.b("/udata/pkg/kwai-client-image/live_dolike/live_heart_particle_animate.json"));
       p0.setSpeed(0x3fa66666);
       p0.a(new LiveHeartParticleServiceImpl$b(this, p0));
       p0.s();
       return;
    }
    public final void m(LottieAnimationView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHeartParticleServiceImpl.class, "29")) {
          return;
       }
       p0.t();
       p0.f();
       p0.setVisibility(4);
       if (this.n.k() != null) {
          p0.setComposition(this.n.k());
          p0.setSpeed(0x3fa66666);
          p0.a(new LiveHeartParticleServiceImpl$c(this, p0));
          p0.s();
       }
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, LiveHeartParticleServiceImpl.class, "23")) {
          return;
       }
       LiveHeartParticleServiceImpl tp = this.p;
       if (tp != null) {
          tp.h(false);
       }
       return;
    }
    public final LottieAnimationView o(float p0,float p1){
       LottieAnimationView obj;
       LiveLottieAnimationView liveLottieAn;
       LiveHeartParticleServiceImpl liveHeartPar = LiveHeartParticleServiceImpl.class;
       if (PatchProxy.isSupport(liveHeartPar)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, liveHeartPar, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.l.poll();
       if (obj == null) {
          liveLottieAn = new LiveLottieAnimationView(this.k);
          liveLottieAn.setRenderMode(RenderMode.HARDWARE);
          liveLottieAn.k(true);
          this.x.addView(liveLottieAn, new FrameLayout$LayoutParams(a1.e(80.00f), a1.e(80.00f)));
       }
       FrameLayout$LayoutParams layoutParams = liveLottieAn.getLayoutParams();
       int h = LiveHeartParticleServiceImpl.H;
       layoutParams.width = h;
       layoutParams.height = h;
       this.p(p0, p1, liveLottieAn);
       layoutParams.gravity = -1;
       liveLottieAn.setLayoutParams(layoutParams);
       return liveLottieAn;
    }
    public final void onUnbind(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveHeartParticleServiceImpl.class, "5")) {
          return;
       }
       k1.m(this.F);
       LiveHeartParticleServiceImpl tn = this.n;
       if (tn != null) {
          Objects.requireNonNull(tn);
          if (!PatchProxy.applyVoid(objArray, tn, b0.class, "19")) {
             Iterator iterator = tn.a.iterator();
             while (iterator.hasNext()) {
                iterator.next().a();
             }
             if (!q.f(tn.b)) {
                tn.b.clear();
             }
          }
       }
       tn = this.o;
       if (tn != null) {
          tn.dispose();
       }
       tn = this.m;
       if (tn != null) {
          tn.e();
       }
       this.D.clear();
       this.i = false;
       this.j = false;
       this.t.getLifecycle().removeObserver(this);
       return;
    }
    public final void p(float p0,float p1,View p2){
       if (PatchProxy.isSupport(LiveHeartParticleServiceImpl.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), p2, this, LiveHeartParticleServiceImpl.class, "16")) {
          return;
       }
       int[] ointArray = this.f(this.x);
       float f = (float)LiveHeartParticleServiceImpl.H;
       p2.setTranslationX(((p0 - (0x3f000000 * f)) - (float)ointArray[0]));
       p2.setTranslationY(((p1 - (f * 0x3f7ae148)) - (float)ointArray[1]));
       return;
    }
}
