package com.kuaishou.live.common.core.component.like.particle.LiveHeartParticleBubbleView;
import java.lang.Runnable;
import android.view.View;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.view.animation.DecelerateInterpolator;
import java.util.Random;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$d;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.component.like.particle.LiveHeartParticleBubbleView$b;
import android.util.SparseArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.kuaishou.live.common.core.component.like.particle.LiveHeartParticleBubbleView$a;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.like.particle.b;
import com.kwai.robust.PatchProxyResult;
import android.view.animation.AnimationUtils;
import java.lang.Long;
import android.view.animation.Interpolator;
import a2.i0;
import com.kuaishou.live.common.core.component.like.particle.LiveHeartParticleBubbleView$c;

public class LiveHeartParticleBubbleView extends View implements Runnable	// class@001472
{
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final DecelerateInterpolator e;
    public LiveHeartParticleBubbleView$a f;
    public LiveHeartParticleBubbleView$a g;
    public LiveHeartParticleBubbleView$a h;
    public final Random i;
    public LiveHeartParticleBubbleView$b j;
    public ViewGroup k;
    public boolean l;
    public List m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;

    static {
       LiveHeartParticleBubbleView.n = a1.e(0x41f00000);
       LiveHeartParticleBubbleView.o = a1.e(60.00f);
       LiveHeartParticleBubbleView.p = a1.e(0x41f00000);
       LiveHeartParticleBubbleView.q = a1.e(129.00f);
       LiveHeartParticleBubbleView.r = a1.e(135.00f);
    }
    public void LiveHeartParticleBubbleView(Context p0){
       super(p0, null);
    }
    public void LiveHeartParticleBubbleView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveHeartParticleBubbleView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Rect();
       this.c = new Rect();
       this.d = new Rect();
       this.e = new DecelerateInterpolator();
       this.i = new Random();
       CdnResource$d[] uodArray = new CdnResource$d[]{CdnResource$d.a(10.00f, 20.00f),CdnResource$d.a(24.00f, 0x41f00000)};
       this.m = Arrays.asList(uodArray);
    }
    public final float getAlphaFactor(){
       return 0x3f666666;
    }
    public void onDetachedFromWindow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveHeartParticleBubbleView.class, "6")) {
          return;
       }
       super.onDetachedFromWindow();
       this.removeCallbacks(this);
       this.f = objArray;
       LiveHeartParticleBubbleView tj = this.j;
       if (tj != null) {
          Objects.requireNonNull(tj);
          if (!PatchProxy.applyVoid(objArray, tj, LiveHeartParticleBubbleView$b.class, "2")) {
             int i = 0;
             while (i < tj.b.size()) {
                LiveHeartParticleBubbleView$b b = tj.b;
                Bitmap uBitmap = b.get(b.keyAt(i));
                if (uBitmap != null && !uBitmap.isRecycled()) {
                   uBitmap.recycle();
                }
                i = i + 1;
             }
             tj.b.clear();
          }
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHeartParticleBubbleView.class, "14")) {
          return;
       }
       LiveHeartParticleBubbleView tf = this.f;
       while (tf != null) {
          if (!PatchProxy.applyVoidOneRefs(p0, tf, LiveHeartParticleBubbleView$a.class, "6") && tf.i == null) {
             LiveHeartParticleBubbleView$a e = tf.e;
             if (e != null && !e.isRecycled()) {
                tf.a.reset();
                tf.a.setScale(tf.v, tf.v, tf.r, tf.s);
                tf.a.postRotate(tf.y, tf.r, tf.s);
                float f = tf.p - tf.r;
                float f1 = tf.q - tf.s;
                f1 = f1 + (float)tf.C;
                tf.a.postTranslate(f, f1);
                tf.b.setAlpha(tf.A);
                p0.drawBitmap(tf.e, tf.a, tf.b);
             }
          }
          tf = tf.d;
       }
       return;
    }
    public void run(){
       LiveHeartParticleBubbleView$a uoa = LiveHeartParticleBubbleView$a.class;
       if (PatchProxy.applyVoid(null, this, LiveHeartParticleBubbleView.class, "15")) {
          return;
       }
       LiveHeartParticleBubbleView tf = this.f;
       if (tf == null) {
          if (!PatchProxy.applyVoid(null, this, LiveHeartParticleBubbleView.class, "19") && this.l != null) {
             LiveHeartParticleBubbleView tk = this.k;
             if (tk != null) {
                b.b(this, tk);
             }
          }
          return;
       }else {
          Object[] objArray = null;
          while (tf != null) {
             long l = 0;
             if (tf.i != null && objArray != null) {
                LiveHeartParticleBubbleView$a uoa1 = PatchProxy.applyTwoRefs(tf, objArray, this, LiveHeartParticleBubbleView.class, "16");
                if (uoa1 != PatchProxyResult.class) {
                }else if(tf == this.f){
                   uoa1 = tf.d;
                   this.f = uoa1;
                }else if(tf == this.g){
                   objArray.d = null;
                   this.g = objArray;
                   uoa1 = null;
                }else {
                   objArray.d = tf.d;
                   uoa1 = tf.d;
                }
                if (!PatchProxy.applyVoidOneRefs(tf, this, LiveHeartParticleBubbleView.class, "17")) {
                   LiveHeartParticleBubbleView th = this.h;
                   if (th == null) {
                      tf.d = null;
                      this.h = tf;
                   }else {
                      tf.d = th;
                      this.h = tf;
                   }
                   if (!PatchProxy.applyVoid(null, tf, uoa, "7")) {
                      tf.i = false;
                      tf.g = l;
                      tf.e = null;
                      tf.a.reset();
                      tf.A = 0;
                      tf.v = 0;
                      tf.f = -1;
                      tf.C = 0;
                   }
                }
                tf = uoa1;
             }else {
                long l1 = AnimationUtils.currentAnimationTimeMillis();
                if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l1), tf, uoa, "5")) {
                   if (tf.f - l <= 0) {
                      tf.f = l1;
                   }
                   LiveHeartParticleBubbleView$a h = tf.h;
                   if (tf.g - (long)h >= 0) {
                      tf.i = true;
                   }else {
                      l1 = l1 - tf.f;
                      tf.g = l1;
                      float f = 0x3f800000;
                      float f1 = (float)l1 * f;
                      f1 = f1 / (float)h;
                      LiveHeartParticleBubbleView$a t = tf.t;
                      float f2 = tf.u - t;
                      f2 = f2 * f1;
                      float f3 = t + f2;
                      tf.v = f3;
                      f1 = tf.c.getInterpolation(f1);
                      f2 = f - f1;
                      f3 = (float)tf.j * f2;
                      f3 = f3 * f2;
                      f3 = f3 * f2;
                      int i = tf.n * 3;
                      float f4 = (float)i;
                      float f5 = f4 * f1;
                      f5 = f5 * f2;
                      f5 = f5 * f2;
                      f3 = f3 + f5;
                      f4 = f4 * f2;
                      f4 = f4 * f1;
                      f4 = f4 * f1;
                      f3 = f3 + f4;
                      f4 = (float)tf.l * f1;
                      f4 = f4 * f1;
                      f4 = f4 * f1;
                      f3 = f3 + f4;
                      tf.p = f3;
                      f3 = (float)tf.k * f2;
                      f3 = f3 * f2;
                      f3 = f3 * f2;
                      i = tf.o * 3;
                      f4 = (float)i;
                      f5 = f4 * f1;
                      f5 = f5 * f2;
                      f5 = f5 * f2;
                      f3 = f3 + f5;
                      f4 = f4 * f2;
                      f4 = f4 * f1;
                      f4 = f4 * f1;
                      f3 = f3 + f4;
                      f2 = (float)tf.m * f1;
                      f2 = f2 * f1;
                      f2 = f2 * f1;
                      f3 = f3 + f2;
                      tf.q = f3;
                      t = tf.x;
                      double d = tf.w - t;
                      d = d * (double)f1;
                      double d1 = t + d;
                      tf.y = (float)d1;
                      t = tf.B;
                      if (f1 - t >= 0) {
                         f2 = (float)tf.z;
                         f1 = f1 - t;
                         f1 = f1 * f2;
                         f = f - t;
                         f1 = f1 / f;
                         f2 = f2 - f1;
                         tf.A = (int)f2;
                      }
                      if (tf.A < null) {
                         tf.A = 0;
                      }
                   }
                }
                objArray = tf;
                tf = tf.d;
             }
          }
          i0.j0(this);
          i0.k0(this, this);
          return;
       }
    }
    public void setBubbleDrawable(LiveHeartParticleBubbleView$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHeartParticleBubbleView.class, "4")) {
          return;
       }
       this.j = new LiveHeartParticleBubbleView$b(p0, this.i);
       return;
    }
    public void setBubbleDrawable(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHeartParticleBubbleView.class, "3")) {
          return;
       }
       this.j = new LiveHeartParticleBubbleView$b(p0, this.i);
       return;
    }
    public void setBubbleSize(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHeartParticleBubbleView.class, "5")) {
          return;
       }
       if (p0 != null && p0.size()) {
          this.m = p0;
       }
       return;
    }
    public void setDetachOnFinish(ViewGroup p0){
       this.k = p0;
       this.l = true;
    }
}
