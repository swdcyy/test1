package com.yxcorp.gifshow.detailbubble.LikeBubbleView;
import java.lang.Runnable;
import com.yxcorp.gifshow.detailbubble.LikeBubbleBaseView;
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
import java.lang.String;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import t9a.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Number;
import com.yxcorp.gifshow.detailbubble.LikeBubbleView$a;
import android.view.animation.Interpolator;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$a;
import android.util.SparseArray;
import java.util.Objects;
import java.lang.Math;
import android.widget.FrameLayout;
import android.view.View;
import a2.i0;
import android.view.ViewGroup;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.ViewParent;
import t9a.b;
import android.view.animation.AnimationUtils;
import java.lang.Long;

public class LikeBubbleView extends LikeBubbleBaseView implements Runnable	// class@001a91
{
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final DecelerateInterpolator e;
    public LikeBubbleView$a f;
    public LikeBubbleView$a g;
    public LikeBubbleView$a h;
    public final Random i;
    public a j;
    public boolean k;
    public List l;
    public boolean m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;

    static {
       LikeBubbleView.n = a1.e(50.00f);
       LikeBubbleView.o = a1.e(100.00f);
       LikeBubbleView.p = a1.e(50.00f);
       LikeBubbleView.q = a1.e(215.00f);
       LikeBubbleView.r = a1.e(225.00f);
    }
    public void LikeBubbleView(Context p0){
       super(p0, null);
    }
    public void LikeBubbleView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LikeBubbleView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Rect();
       this.c = new Rect();
       this.d = new Rect();
       this.e = new DecelerateInterpolator();
       this.i = new Random();
       CdnResource$d[] uodArray = new CdnResource$d[]{CdnResource$d.a(10.00f, 25.00f),CdnResource$d.a(40.00f, 50.00f)};
       this.l = Arrays.asList(uodArray);
       this.m = false;
    }
    public boolean a(){
       boolean b = (this.f != null)? true: false;
       return b;
    }
    public void b(String p0,CdnResource$ResourceKey p1,int[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LikeBubbleView.class, "3")) {
          return;
       }
       a uoa = new a(p2, this.i, p1, p0, this.m);
       this.j = v0;
       return;
    }
    public void c(){
       this.k = true;
    }
    public void d(int p0,int p1,int p2,int p3,float p4){
       Object[] objArray;
       String str1;
       LikeBubbleView likeBubbleVi1;
       float f;
       int i7;
       int i8;
       boolean b = this;
       int i = p1;
       String str = "1";
       int i1 = 3;
       int i2 = 2;
       int i3 = 0;
       if (PatchProxy.isSupport(LikeBubbleView.class)) {
          objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, b, LikeBubbleView.class, str)) {
             return;
          }
       }
       b.k = i3;
       int i4 = p0 + (p2 >> 1);
       int n = LikeBubbleView.n;
       int i5 = i4 - (n >> 1);
       b.b.set(i5, i, (i5 + n), (i + n));
       i5 = LikeBubbleView.o;
       int i6 = i4 - (i5 >> 1);
       i = i - LikeBubbleView.q;
       b.c.set(i6, i, (i5 + i6), (LikeBubbleView.p + i));
       i = LikeBubbleView.r;
       i4 = i4 - (i >> 1);
       Rect bottom = b.c.bottom;
       i6 = bottom + n;
       b.d.set(i4, i6, (i + i4), (((b.b.top + i6) - bottom) - (n * 2)));
       objArray = null;
       Object obj = PatchProxy.apply(objArray, b, LikeBubbleView.class, "2");
       i = (obj != PatchProxyResult.class)? obj.intValue(): b.i.nextInt(i2) + i1;
       if (!PatchProxy.isSupport(LikeBubbleView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), b, LikeBubbleView.class, "6")) {
          i6 = 0;
          while (i6 < i) {
             LikeBubbleView likeBubbleVi = PatchProxy.apply(objArray, b, LikeBubbleView.class, "17");
             if (likeBubbleVi != PatchProxyResult.class) {
             }else {
                likeBubbleVi = b.h;
                if (likeBubbleVi != null) {
                   b.h = likeBubbleVi.d;
                   likeBubbleVi.d = objArray;
                }else {
                   likeBubbleVi = new LikeBubbleView$a(b.e);
                }
                LikeBubbleView j = b.j;
                if (j != null) {
                   Bitmap uBitmap = PatchProxy.apply(objArray, j, a.class, "2");
                   if (uBitmap != PatchProxyResult.class) {
                   }else {
                      i8 = j.c.nextInt(j.a.size());
                      Bitmap uBitmap1 = j.b.get(j.a.b(i8));
                      if (uBitmap1 == null) {
                         uBitmap1 = j.a.a(i8);
                         j.b.put(j.a.b(i8), uBitmap1);
                      }
                      uBitmap = uBitmap1;
                   }
                   if (!PatchProxy.applyVoidOneRefs(uBitmap, likeBubbleVi, LikeBubbleView$a.class, str)) {
                      likeBubbleVi.e = uBitmap;
                      float f2 = 2.00f;
                      float f3 = (float)likeBubbleVi.a() / f2;
                      likeBubbleVi.r = f3;
                      LikeBubbleView$a obj3 = PatchProxy.apply(objArray, likeBubbleVi, LikeBubbleView$a.class, "3");
                      if (obj3 != PatchProxyResult.class) {
                         i3 = obj3.intValue();
                      }else {
                         obj3 = likeBubbleVi.e;
                         i3 = (obj3 == null)? 0: obj3.getHeight();
                      }
                      f3 = (float)i3 / f2;
                      likeBubbleVi.s = f3;
                   }
                }
             }
             i6 = i6 + 1;
             if (!PatchProxy.isSupport(LikeBubbleView.class) || !PatchProxy.applyVoidTwoRefs(likeBubbleVi, Integer.valueOf(i6), b, LikeBubbleView.class, "12")) {
                i3 = i6 % 3;
                i7 = b.d.width() * 2;
                i7 = i7 / i1;
                if (i3 == 1) {
                   i3 = 0;
                }else if(i3 == i2){
                   i3 = b.d.width() / i1;
                }else {
                   i3 = b.d.width() * 2;
                   i3 = i3 / i1;
                }
                LikeBubbleView d2 = b.d;
                int i9 = d2.left + i3;
                i8 = d2.width() - i7;
                i9 = i9 + b.i.nextInt(i8);
                likeBubbleVi.n = i9;
                likeBubbleVi1 = b.d;
                i7 = likeBubbleVi1.top + b.i.nextInt(likeBubbleVi1.height());
                likeBubbleVi.o = i7;
             }
             if (!PatchProxy.applyVoidOneRefs(likeBubbleVi, b, LikeBubbleView.class, "10")) {
                if (likeBubbleVi.n < b.b.centerX()) {
                   likeBubbleVi1 = b.b;
                   i3 = likeBubbleVi1.width() >> 1;
                   i7 = likeBubbleVi1.left + b.i.nextInt(i3);
                   likeBubbleVi.j = i7;
                }else {
                   i8 = b.b.width() >> 1;
                   i3 = b.b.centerX() + b.i.nextInt(i8);
                   likeBubbleVi.j = i3;
                }
                likeBubbleVi1 = b.b;
                i7 = likeBubbleVi1.top + b.i.nextInt(likeBubbleVi1.height());
                likeBubbleVi.k = i7;
             }
             if (!PatchProxy.applyVoidOneRefs(likeBubbleVi, b, LikeBubbleView.class, "11")) {
                if (likeBubbleVi.n < b.c.centerX()) {
                   likeBubbleVi1 = b.c;
                   i3 = likeBubbleVi1.width() >> 1;
                   i7 = likeBubbleVi1.left + b.i.nextInt(i3);
                   likeBubbleVi.l = i7;
                }else {
                   i8 = b.c.width() >> 1;
                   i3 = b.c.centerX() + b.i.nextInt(i8);
                   likeBubbleVi.l = i3;
                }
                likeBubbleVi1 = b.c;
                i7 = likeBubbleVi1.top + b.i.nextInt(likeBubbleVi1.height());
                likeBubbleVi.m = i7;
             }
             if (!PatchProxy.isSupport(LikeBubbleView.class) || !PatchProxy.applyVoidTwoRefs(likeBubbleVi, Integer.valueOf(i6), b, LikeBubbleView.class, "7")) {
                i3 = b.i.nextBoolean() ^ 1;
                if (PatchProxy.isSupport(LikeBubbleView.class)) {
                   Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(i3), Integer.valueOf(i6), b, LikeBubbleView.class, "8");
                   if (obj1 != PatchProxyResult.class) {
                      i1 = obj1.intValue();
                   }else {
                   label_0280 :
                      i1 = i6 % b.l.size();
                      if (i3 == 1) {
                         i7 = b.l.size() - i1;
                         i1 = i7 - 1;
                      }
                      if (b.l.get(i1) == null) {
                         i1 = 0;
                      }else {
                         i1 = a1.e(b.l.get(i1).s);
                      }
                   }
                }else {
                   goto label_0280 ;
                }
                if (PatchProxy.isSupport(LikeBubbleView.class)) {
                   Object obj2 = PatchProxy.applyTwoRefs(Integer.valueOf(i3), Integer.valueOf(i6), b, LikeBubbleView.class, "9");
                   if (obj2 != PatchProxyResult.class) {
                      i2 = obj2.intValue();
                   }else {
                   label_02cc :
                      i2 = i6 % b.l.size();
                      if (i3 == 1) {
                         i3 = b.l.size() - i2;
                         i2 = i3 - 1;
                      }
                      if (b.l.get(i2) == null) {
                         i2 = 0;
                      }else {
                         i2 = a1.e(b.l.get(i2).e);
                      }
                   }
                }else {
                   goto label_02cc ;
                }
                i2 = i2 - i1;
                i1 = i1 + b.i.nextInt(i2);
                if (likeBubbleVi.a() > 0) {
                   f = (float)i1 * 0x3f800000;
                   f = f / (float)likeBubbleVi.a();
                   likeBubbleVi.t = f;
                }
                f = likeBubbleVi.t * 0.40f;
                likeBubbleVi.u = f;
                float f1 = b.i.nextFloat() * 0x3f333333;
                f1 = f1 + 0.30f;
                likeBubbleVi.B = f1;
                f1 = this.getAlphaFactor() * 0x437f0000;
                i1 = (int)f1;
                likeBubbleVi.z = i1;
                likeBubbleVi.A = i1;
                i2 = 600;
                i1 = b.i.nextInt(i2) + i2;
                likeBubbleVi.h = i1;
             }
             Objects.requireNonNull(likeBubbleVi);
             if (PatchProxy.applyVoid(objArray, likeBubbleVi, LikeBubbleView$a.class, "4")) {
                str1 = str;
             }else {
                i1 = Math.min(likeBubbleVi.j, likeBubbleVi.k);
                LikeBubbleView$a n1 = likeBubbleVi.n;
                double d = -45.00f;
                str1 = str;
                double d1 = (n1 < i1)? d: 45.00f;
                likeBubbleVi.x = d1;
                if (n1 < i1) {
                   d = 45.00f;
                }
                likeBubbleVi.w = d;
             }
             if (b.f == null) {
                b.f = likeBubbleVi;
                b.g = likeBubbleVi;
             }else {
                b.g.d = likeBubbleVi;
                b.g = likeBubbleVi;
             }
             str = str1;
             objArray = null;
             i1 = 3;
             i2 = 2;
             likeBubbleVi1 = null;
          }
       }
       b.removeCallbacks(b);
       i0.k0(b, b);
       return;
    }
    public final float getAlphaFactor(){
       return 0x3f666666;
    }
    public a getBubbleProvider(){
       return this.j;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LikeBubbleView.class, "5")) {
          return;
       }
       super.onDetachedFromWindow();
       this.removeCallbacks(this);
       this.f = null;
       LikeBubbleView tj = this.j;
       if (tj != null) {
          tj.a();
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LikeBubbleView.class, "13")) {
          return;
       }
       LikeBubbleView tf = this.f;
       while (tf != null) {
          if (!PatchProxy.applyVoidOneRefs(p0, tf, LikeBubbleView$a.class, "6") && tf.i == null) {
             LikeBubbleView$a e = tf.e;
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
       LikeBubbleView$a uoa = LikeBubbleView$a.class;
       if (PatchProxy.applyVoid(null, this, LikeBubbleView.class, "14")) {
          return;
       }
       LikeBubbleView tf = this.f;
       if (tf == null) {
          if (!PatchProxy.applyVoid(null, this, LikeBubbleView.class, "18") && (this.k != null && this.getParent() != null)) {
             b.e(this, this.getParent());
          }
       label_0030 :
          return;
       }else {
          Object[] objArray = null;
          while (tf != null) {
             long l = 0;
             if (tf.i != null) {
                LikeBubbleView$a uoa1 = PatchProxy.applyTwoRefs(tf, objArray, this, LikeBubbleView.class, "15");
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
                if (!PatchProxy.applyVoidOneRefs(tf, this, LikeBubbleView.class, "16")) {
                   LikeBubbleView th = this.h;
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
                   LikeBubbleView$a h = tf.h;
                   if (tf.g - (long)h >= 0) {
                      tf.i = true;
                   }else {
                      l1 = l1 - tf.f;
                      tf.g = l1;
                      float f = 0x3f800000;
                      float f1 = (float)l1 * f;
                      f1 = f1 / (float)h;
                      LikeBubbleView$a t = tf.t;
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
    public void setBifrostStyle(boolean p0){
       this.m = p0;
    }
    public void setBubbleSize(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LikeBubbleView.class, "4")) {
          return;
       }
       if (p0 != null && p0.size()) {
          this.l = p0;
       }
       return;
    }
}
