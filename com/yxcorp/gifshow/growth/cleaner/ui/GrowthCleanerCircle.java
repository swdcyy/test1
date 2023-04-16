package com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerCircle;
import android.view.View;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import java.lang.String;
import android.graphics.Color;
import qrd.l1;
import java.util.ArrayList;
import lnc.a1;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.graphics.Rect;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerCircle$a;
import java.lang.Runnable;
import java.util.Collection;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.lang.Boolean;
import ssd.e;
import ssd.e$a;
import xrd.c;
import kotlin.jvm.internal.a;
import android.graphics.drawable.Drawable;
import java.lang.Integer;

public final class GrowthCleanerCircle extends View	// class@00134f
{
    public long A;
    public long B;
    public int C;
    public final GradientDrawable D;
    public final Rect E;
    public final Rect F;
    public final Rect G;
    public long H;
    public long I;
    public int J;
    public final GradientDrawable K;
    public final Rect L;
    public final Rect M;
    public final Rect N;
    public long O;
    public long P;
    public int Q;
    public final GradientDrawable R;
    public final Rect S;
    public final Rect T;
    public final Rect U;
    public final Rect U0;
    public long V;
    public final Rect V0;
    public final Rect W;
    public long W0;
    public boolean X0;
    public int Y0;
    public boolean b;
    public final GradientDrawable c;
    public final GradientDrawable d;
    public final GradientDrawable e;
    public final GradientDrawable f;
    public ArrayList g;
    public ArrayList h;
    public final ArrayList i;
    public final int j;
    public final int k;
    public final long l;
    public final long m;
    public final AccelerateDecelerateInterpolator n;
    public final float o;
    public final float p;
    public final float q;
    public final float r;
    public final float s;
    public final float t;
    public long u;
    public int v;
    public final GradientDrawable w;
    public final Rect x;
    public final Rect y;
    public final Rect z;

    public void GrowthCleanerCircle(Context p0){
       super(p0);
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setShape(1);
       gradientDraw.setGradientType(1);
       gradientDraw.setGradientRadius(300.00f);
       int[] ointArray = new int[]{Color.parseColor("#aaff5000"),Color.parseColor("#66ff5000"),0};
       gradientDraw.setColors(ointArray);
       this.c = gradientDraw;
       gradientDraw = new GradientDrawable();
       gradientDraw.setShape(1);
       gradientDraw.setGradientType(1);
       gradientDraw.setGradientRadius(300.00f);
       int[] ointArray1 = new int[]{Color.parseColor("#aaff3a30"),Color.parseColor("#66ff3a30"),0};
       gradientDraw.setColors(ointArray1);
       this.d = gradientDraw;
       gradientDraw = new GradientDrawable();
       gradientDraw.setShape(1);
       ointArray1 = new int[]{Color.parseColor("#4deeeeee"),Color.parseColor("#66eeeeee")};
       gradientDraw.setColors(ointArray1);
       this.e = gradientDraw;
       gradientDraw = new GradientDrawable();
       gradientDraw.setShape(1);
       ointArray1 = new int[]{Color.parseColor("#00000000"),Color.parseColor("#00000000")};
       gradientDraw.setColors(ointArray1);
       gradientDraw.setStroke(15, Color.parseColor("#ffffffff"));
       this.f = gradientDraw;
       this.g = new ArrayList();
       this.h = new ArrayList();
       this.i = new ArrayList();
       this.j = a1.e(45.00f);
       this.k = a1.e(55.00f);
       this.l = 200;
       this.m = 350;
       this.n = new AccelerateDecelerateInterpolator();
       this.o = -0.15f;
       this.p = 0x3f866666;
       this.q = 0.10f;
       this.r = -0.25f;
       this.s = 0x3f333333;
       this.t = 0x3f19999a;
       this.u = 500;
       this.v = -1;
       this.w = this.b();
       this.x = new Rect();
       this.y = new Rect();
       this.z = new Rect();
       this.B = 500;
       this.C = -1;
       this.D = this.b();
       this.E = new Rect();
       this.F = new Rect();
       this.G = new Rect();
       this.I = 500;
       this.J = -1;
       this.K = this.b();
       this.L = new Rect();
       this.M = new Rect();
       this.N = new Rect();
       this.P = 500;
       this.Q = -1;
       this.R = this.b();
       this.S = new Rect();
       this.T = new Rect();
       this.U = new Rect();
       this.W = new Rect();
       this.U0 = new Rect();
       this.V0 = new Rect();
    }
    public final int a(long p0,long p1){
       if (PatchProxy.isSupport(GrowthCleanerCircle.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, GrowthCleanerCircle.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       float f = (float)(p1 - (System.currentTimeMillis() - p0)) / (float)p1;
       int i = (f - 0x3e4ccccd > 0)? (int)(f * (float)200): 0;
       return i;
    }
    public final GradientDrawable b(){
       GradientDrawable obj = PatchProxy.apply(null, this, GrowthCleanerCircle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GradientDrawable();
       obj.setShape(1);
       obj.setGradientType(1);
       obj.setGradientRadius((float)a1.e(38.00f));
       int[] ointArray = new int[]{0,Color.parseColor("#11ff3a30"),Color.parseColor("#55ff3a30")};
       obj.setColors(ointArray);
       obj.setStroke(2, Color.parseColor("#44ff3a30"));
       return obj;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerCircle.class, "4")) {
          return;
       }
       this.invalidate();
       this.postInvalidate();
       if (this.X0 == null) {
          return;
       }
       this.postDelayed(new GrowthCleanerCircle$a(this), 0);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, GrowthCleanerCircle.class, "9")) {
          return;
       }
       GrowthCleanerCircle th = this.h;
       GrowthCleanerCircle tg = this.g;
       this.h = tg;
       this.g = th;
       tg.clear();
       this.h.addAll(this.g);
       return;
    }
    public final void e(long p0,long p1,Rect p2,Rect p3,Rect p4){
       if (PatchProxy.isSupport(GrowthCleanerCircle.class)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),Long.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, GrowthCleanerCircle.class, "16")) {
             return;
          }
       }
       float interpolatio = this.n.getInterpolation(((float)p0 / (float)p1));
       int i = (int)(((float)((this.getWidth() / 2) - p2.centerX()) * 0x3f4ccccd) * interpolatio);
       int i1 = (int)(interpolatio * ((float)((this.getHeight() / 2) - p2.centerY()) * 0x3f4ccccd));
       p3.left = p2.left + i;
       p3.top = p2.top + i1;
       p3.right = p2.right + i;
       p3.bottom = p2.bottom + i1;
       i1 = p3.centerX();
       i = p3.centerY();
       GrowthCleanerCircle tk = this.k;
       p4.left = i1 - (tk / 2);
       p4.top = i - (tk / 2);
       p4.right = i1 + (tk / 2);
       p4.bottom = i + (tk / 2);
       return;
    }
    public final boolean getNightMode(){
       return this.b;
    }
    public final int getProgress(){
       return this.Y0;
    }
    public void onDraw(Canvas p0){
       long l6;
       e$a b;
       long l7;
       int[] ointArray1;
       long l = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, l, GrowthCleanerCircle.class, "10")) {
          return;
       }
       super.onDraw(p0);
       if (obj != null) {
          int i = p0.saveLayer(0, 0, (float)this.getWidth(), (float)this.getHeight(), null, 31);
          long l1 = System.currentTimeMillis() - l.W0;
          GrowthCleanerCircle l2 = l.l;
          long l3 = (long)100;
          long l4 = ((l1 % l2) * l3) / l2;
          long l5 = (long)3;
          l1 = ((l1 % (l5 * l2)) * l3) / (l5 * l2);
          int width = (this.getWidth() < this.getHeight())? this.getWidth(): this.getHeight();
          width = width / 2;
          float f = 0;
          int i1 = 50;
          if (l.X0 != null) {
             l1 = l1 - (long)i1;
             int i2 = 25;
             l1 = (l1 < 0)? l1 + (long)i2: (long)i2 - l1;
             if (l1 - (long)-20 < 0) {
                l1 = -20;
             }else if(l1 - (long)20 > 0){
                l1 = 20;
             }
             f = (((float)l1 / 20.00f) * (float)width) * 0.10f;
          }
          float f1 = (float)width;
          float f2 = (0x3f000000 * f1) + f;
          f1 = f1 * 0x3f4ccccd;
          float f3 = f1 - 0x40f00000;
          l.c.setGradientRadius(f2);
          l.d.setGradientRadius(f2);
          l.e.setGradientRadius((f1 - (float)15));
          l.f.setGradientRadius(f1);
          l.W.left = (int)((float)(this.getWidth() / 2) - f2);
          l.W.top = (int)((float)(this.getHeight() / 2) - f2);
          l.W.right = (int)((float)(this.getWidth() / 2) + f2);
          l.W.bottom = (int)((float)(this.getHeight() / 2) + f2);
          l.U0.left = (int)((float)(this.getWidth() / 2) - f3);
          l.U0.top = (int)((float)(this.getHeight() / 2) - f3);
          l.U0.right = (int)((float)(this.getWidth() / 2) + f3);
          l.U0.bottom = (int)((float)(this.getHeight() / 2) + f3);
          l.V0.left = (int)((float)(this.getWidth() / 2) - f1);
          l.V0.top = (int)((float)(this.getHeight() / 2) - f1);
          l.V0.right = (int)((float)(this.getWidth() / 2) + f1);
          l.V0.bottom = (int)((float)(this.getHeight() / 2) + f1);
          if (l.X0 == null) {
             l4 = 0;
          }
          double d = (((double)((long)i1 - l4) * 0x3fc999999999999a) / (double)i1) + 0x3fe999999999999a;
          l.c.setBounds(l.W);
          width = 100;
          l.c.setAlpha((int)((double)(((l.Y0 - 100) * 255) / width) * d));
          l.d.setBounds(l.W);
          l.d.setAlpha((int)((double)((l.Y0 * 255) / width) * d));
          l.e.setBounds(l.U0);
          l.f.setBounds(l.V0);
          l.f.draw(obj);
          if (l.X0 != null) {
             l.i.clear();
             l.i.addAll(l.g);
             int i3 = l.i.size();
             if (i3 > 0) {
                GrowthCleanerCircle obj1 = PatchProxy.apply(null, l, GrowthCleanerCircle.class, "12");
                if (obj1 != PatchProxyResult.class) {
                   obj1.booleanValue();
                }else {
                   l1 = System.currentTimeMillis();
                   l6 = l1 - l.A;
                   if (l6 - l.u > 0) {
                      b = e.b;
                      l.u = (long)((float)l.l + ((float)l.m * b.j()));
                      l.A = l1;
                      ointArray1 = new int[]{l.C,l.J,l.Q};
                      l.v = c.J(l.v, ointArray1) + 1;
                      l.x.left = (int)((float)this.getWidth() * (l.o + (l.q * b.j())));
                      l.x.top = (int)((float)this.getHeight() * (l.r + (l.t * b.j())));
                      obj1 = l.x;
                      l2 = l.j;
                      obj1.right = obj1.left + l2;
                      obj1.bottom = obj1.top + l2;
                      l7 = 0;
                   }else {
                      l7 = l6;
                   }
                   this.e(l7, l.u, l.x, l.y, l.z);
                }
                int i4 = l.v % i3;
                l.v = i4;
                obj1 = l.i.get(i4);
                a.o(obj1, "mDrawIcons[mLeftTopIndex]");
                int i5 = l.a(l.A, l.u);
                obj1.setAlpha(i5);
                obj1.setBounds(l.y);
                obj1.draw(obj);
                l.w.setAlpha(i5);
                l.w.setBounds(l.z);
                l.w.draw(obj);
                obj1 = PatchProxy.apply(null, l, GrowthCleanerCircle.class, "13");
                if (obj1 != PatchProxyResult.class) {
                   obj1.booleanValue();
                }else {
                   l1 = System.currentTimeMillis();
                   l6 = l1 - l.H;
                   if (l6 - l.B > 0) {
                      b = e.b;
                      l.B = (long)((float)l.l + ((float)l.m * b.j()));
                      l.H = l1;
                      ointArray1 = new int[]{l.C,l.J,l.Q};
                      l.C = c.J(l.v, ointArray1) + 1;
                      l.E.left = (int)((float)this.getWidth() * (l.o + (l.q * b.j())));
                      l.E.top = (int)((float)this.getHeight() * (l.s + (l.t * b.j())));
                      obj1 = l.E;
                      l2 = l.j;
                      obj1.right = obj1.left + l2;
                      obj1.bottom = obj1.top + l2;
                      l7 = 0;
                   }else {
                      l7 = l6;
                   }
                   this.e(l7, l.B, l.E, l.F, l.G);
                }
                i4 = l.C % i3;
                l.C = i4;
                obj1 = l.i.get(i4);
                a.o(obj1, "mDrawIcons[mLeftBottomIndex]");
                i5 = l.a(l.H, l.B);
                obj1.setAlpha(i5);
                obj1.setBounds(l.F);
                obj1.draw(obj);
                l.D.setAlpha(i5);
                l.D.setBounds(l.G);
                l.D.draw(obj);
                obj1 = PatchProxy.apply(null, l, GrowthCleanerCircle.class, "14");
                if (obj1 != PatchProxyResult.class) {
                   obj1.booleanValue();
                }else {
                   l1 = System.currentTimeMillis();
                   l6 = l1 - l.O;
                   if (l6 - l.I > 0) {
                      b = e.b;
                      l.I = (long)((float)l.l + ((float)l.m * b.j()));
                      l.O = l1;
                      ointArray1 = new int[]{l.C,l.J,l.Q};
                      l.J = c.J(l.v, ointArray1) + 1;
                      l.L.left = (int)((float)this.getWidth() * (l.p + (l.q * b.j())));
                      l.L.top = (int)((float)this.getHeight() * (l.r + (l.t * b.j())));
                      obj1 = l.L;
                      l2 = l.j;
                      obj1.right = obj1.left + l2;
                      obj1.bottom = obj1.top + l2;
                      l7 = 0;
                   }else {
                      l7 = l6;
                   }
                   this.e(l7, l.I, l.L, l.M, l.N);
                }
                i4 = l.J % i3;
                l.J = i4;
                obj1 = l.i.get(i4);
                a.o(obj1, "mDrawIcons[mRightTopIndex]");
                i5 = l.a(l.O, l.I);
                obj1.setAlpha(i5);
                obj1.setBounds(l.M);
                obj1.draw(obj);
                l.K.setAlpha(i5);
                l.K.setBounds(l.N);
                l.K.draw(obj);
                obj1 = PatchProxy.apply(null, l, GrowthCleanerCircle.class, "15");
                if (obj1 != PatchProxyResult.class) {
                   obj1.booleanValue();
                }else {
                   l1 = System.currentTimeMillis();
                   l6 = l1 - l.V;
                   if (l6 - l.P > 0) {
                      b = e.b;
                      l.P = (long)((float)l.l + ((float)l.m * b.j()));
                      l.V = l1;
                      int[] ointArray = new int[]{l.C,l.J,l.Q};
                      l.Q = c.J(l.v, ointArray) + 1;
                      l.S.left = (int)((float)this.getWidth() * (l.p + (l.q * b.j())));
                      l.S.top = (int)((float)this.getHeight() * (l.s + (l.t * b.j())));
                      obj1 = l.S;
                      l2 = l.j;
                      obj1.right = obj1.left + l2;
                      obj1.bottom = obj1.top + l2;
                      l7 = 0;
                   }else {
                      l7 = l6;
                   }
                   this.e(l7, l.P, l.S, l.T, l.U);
                }
                i4 = l.Q % i3;
                l.Q = i4;
                obj1 = l.i.get(i4);
                a.o(obj1, "mDrawIcons[mRightBottomIndex]");
                i5 = l.a(l.V, l.P);
                obj1.setAlpha(i5);
                obj1.setBounds(l.T);
                obj1.draw(obj);
                l.R.setAlpha(i5);
                l.R.setBounds(l.U);
                l.R.draw(obj);
             }
          }
          l.c.draw(obj);
          l.d.draw(obj);
          l.e.draw(obj);
          obj.restoreToCount(i);
       }
       return;
    }
    public final void setAnimating(boolean p0){
       if (PatchProxy.isSupport(GrowthCleanerCircle.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GrowthCleanerCircle.class, "3")) {
          return;
       }
       this.X0 = p0;
       long l = (p0)? System.currentTimeMillis(): 0;
       this.W0 = l;
       this.c();
       return;
    }
    public final void setNightMode(boolean p0){
       int[] ointArray;
       if (PatchProxy.isSupport(GrowthCleanerCircle.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, GrowthCleanerCircle.class, "1")) {
          return;
       }
       if (this.b != p0) {
          this.b = p0;
          int i = 1;
          int i1 = 0;
          int i2 = 2;
          if (!p0) {
             ointArray = new int[i2];
             ointArray[i1] = Color.parseColor("#4deeeeee");
             ointArray[i] = Color.parseColor("#66eeeeee");
             this.e.setColors(ointArray);
             this.f.setStroke(15, Color.parseColor("#ffffffff"));
          }else {
             ointArray = new int[i2];
             ointArray[i1] = Color.parseColor("#4dcccccc");
             ointArray[i] = Color.parseColor("#66cccccc");
             this.e.setColors(ointArray);
             this.f.setStroke(15, Color.parseColor("#aaeeeeee"));
          }
       }
       return;
    }
    public final void setProgress(int p0){
       if (PatchProxy.isSupport(GrowthCleanerCircle.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, GrowthCleanerCircle.class, "5")) {
          return;
       }
       this.Y0 = p0;
       this.invalidate();
       this.postInvalidate();
       return;
    }
}
