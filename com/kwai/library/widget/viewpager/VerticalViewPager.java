package com.kwai.library.widget.viewpager.VerticalViewPager;
import android.view.ViewGroup;
import com.kwai.library.widget.viewpager.VerticalViewPager$a;
import com.kwai.library.widget.viewpager.VerticalViewPager$b;
import com.kwai.library.widget.viewpager.VerticalViewPager$i;
import android.content.Context;
import java.util.ArrayList;
import com.kwai.library.widget.viewpager.VerticalViewPager$e;
import android.graphics.Rect;
import com.kwai.library.widget.viewpager.VerticalViewPager$c;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager$i;
import java.lang.Object;
import java.util.List;
import h3.a;
import java.lang.Math;
import e2.c;
import android.os.IBinder;
import android.view.View;
import android.view.ViewParent;
import android.content.res.Resources;
import java.lang.String;
import java.lang.Integer;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Class;
import android.widget.Scroller;
import a2.i0;
import androidx.viewpager.widget.ViewPager$j;
import java.util.Comparator;
import java.util.Collections;
import android.view.ViewGroup$LayoutParams;
import com.kwai.library.widget.viewpager.VerticalViewPager$LayoutParams;
import com.kwai.library.widget.viewpager.VerticalViewPager$d;
import android.view.FocusFinder;
import android.view.SoundEffectConstants;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.lang.Runnable;
import android.view.animation.Interpolator;
import android.view.VelocityTracker;
import android.view.MotionEvent;
import a2.q;
import android.view.View$MeasureSpec;
import android.os.Parcelable;
import com.kwai.library.widget.viewpager.VerticalViewPager$SavedState;
import android.view.View$BaseSavedState;
import java.lang.ClassLoader;
import a2.h0;
import java.lang.System;
import android.view.ViewConfiguration;
import android.util.DisplayMetrics;
import cw9.c;
import a2.j0;
import com.kwai.library.widget.viewpager.VerticalViewPager$f;
import a2.a;
import android.database.DataSetObserver;
import com.kwai.library.widget.viewpager.VerticalViewPager$h;
import com.kwai.library.widget.viewpager.VerticalViewPager$g;
import java.lang.Boolean;
import java.lang.reflect.Method;
import android.graphics.Paint;

public class VerticalViewPager extends ViewGroup	// class@000a81
{
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public float F;
    public float G;
    public float H;
    public float I;
    public int J;
    public VelocityTracker K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public long Q;
    public c R;
    public c S;
    public boolean T;
    public boolean U;
    public long U0;
    public boolean V;
    public int V0;
    public int W;
    public List W0;
    public ViewPager$i X0;
    public VerticalViewPager$g Y0;
    public ViewPager$j Z0;
    public Method a1;
    public int b;
    public int b1;
    public final ArrayList c;
    public ArrayList c1;
    public final VerticalViewPager$e d;
    public final Runnable d1;
    public final Rect e;
    public int e1;
    public a f;
    public boolean f1;
    public int g;
    public int h;
    public Parcelable i;
    public ClassLoader j;
    public Scroller k;
    public VerticalViewPager$h l;
    public List m;
    public int n;
    public Drawable o;
    public int p;
    public int q;
    public float r;
    public float s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public boolean z;
    public static boolean g1;
    public static final int[] h1;
    public static final Comparator i1;
    public static final Interpolator j1;
    public static final VerticalViewPager$i k1;

    static {
       int[] ointArray = new int[]{0x10100b3};
       VerticalViewPager.h1 = ointArray;
       VerticalViewPager.i1 = new VerticalViewPager$a();
       VerticalViewPager.j1 = new VerticalViewPager$b();
       VerticalViewPager.k1 = new VerticalViewPager$i();
    }
    public void VerticalViewPager(Context p0){
       super(p0);
       this.c = new ArrayList();
       this.d = new VerticalViewPager$e();
       this.e = new Rect();
       this.h = -1;
       this.i = null;
       this.j = null;
       this.r = -340282346638528860000000000000000000000.00f;
       this.s = Float.MAX_VALUE;
       this.y = 1;
       this.J = -1;
       this.T = true;
       this.U = false;
       this.V0 = -1;
       this.d1 = new VerticalViewPager$c(this);
       this.e1 = 0;
       this.r();
    }
    public void VerticalViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = new ArrayList();
       this.d = new VerticalViewPager$e();
       this.e = new Rect();
       this.h = -1;
       this.i = null;
       this.j = null;
       this.r = -340282346638528860000000000000000000000.00f;
       this.s = Float.MAX_VALUE;
       this.y = 1;
       this.J = -1;
       this.T = true;
       this.U = false;
       this.V0 = -1;
       this.d1 = new VerticalViewPager$c(this);
       this.e1 = 0;
       this.r();
    }
    private void h(int p0){
       VerticalViewPager tW0 = this.W0;
       if (tW0 != null) {
          int i = 0;
          ViewPager$i[] oiArray = new ViewPager$i[i];
          ViewPager$i[] oiArray1 = tW0.toArray(oiArray);
          int len = oiArray1.length;
          while (i < len) {
             object oobject = oiArray1[i];
             if (oobject != null) {
                oobject.onPageSelected(p0);
             }
             i = i + 1;
          }
       }
       tW0 = this.X0;
       if (tW0 != null) {
          tW0.onPageSelected(p0);
       }
       return;
    }
    public boolean A(){
       VerticalViewPager tg = this.g;
       if (tg <= null) {
          return false;
       }
       this.I((tg - 1), 1);
       return 1;
    }
    public boolean B(float p0){
       VerticalViewPager$e uoe;
       VerticalViewPager$e uoe1;
       this.G = p0;
       p0 = (float)this.getScrollY() + (this.G - p0);
       float f = (float)this.getClientHeight();
       float f1 = this.r * f;
       float f2 = this.s * f;
       int i = 0;
       if (this.c.size() > 0) {
          uoe = this.c.get(i);
          VerticalViewPager tc = this.c;
          uoe1 = tc.get((tc.size() - 1));
          if (uoe.b != null) {
             f1 = uoe.e * f;
             uoe = 0;
          }else {
             uoe = 1;
          }
          if (uoe1.b != (this.f.j() - 1)) {
             f2 = uoe1.e * f;
             uoe1 = 0;
          label_0055 :
             if (p0 - f1 < 0) {
                if (uoe) {
                   this.R.f((Math.abs((f1 - p0)) / f));
                   i = true;
                }
                p0 = f1;
             }else if(p0 - f2 > 0){
                if (uoe1) {
                   this.S.f((Math.abs((p0 - f2)) / f));
                   i = true;
                }
                p0 = f2;
             }
             this.G = (VerticalViewPager.g1)? this.G + (p0 - (float)(int)p0): this.F + (p0 - (float)(int)p0);
             int i1 = this.R((int)p0);
             this.scrollTo(this.getScrollX(), i1);
             this.z(this.R(i1));
             return i;
          }
       }else {
          uoe = 1;
       }
       uoe1 = 1;
       goto label_0055 ;
    }
    public void C(){
       this.D(this.g);
    }
    public void D(int p0){
       int i1;
       VerticalViewPager$e uoe;
       VerticalViewPager$e uoe1;
       VerticalViewPager$e b;
       VerticalViewPager$e d;
       VerticalViewPager$e uoe2;
       int i8;
       VerticalViewPager$e b1;
       float f2;
       int i9;
       VerticalViewPager$e uoe3;
       float f3;
       float f4;
       float f5;
       int i10;
       int i11;
       float f8;
       String resourceName;
       VerticalViewPager verticalView = this;
       int i = p0;
       VerticalViewPager g = verticalView.g;
       if (g != i) {
          i1 = (g < i)? 130: 33;
          uoe = verticalView.q(g);
          verticalView.g = i;
       }else {
          i1 = 2;
          uoe = null;
       }
       if (verticalView.f == null) {
          this.P();
          return;
       }else if(verticalView.x != null){
          this.P();
          return;
       }else if(this.getWindowToken() == null){
          return;
       }else {
          verticalView.f.x(verticalView);
          VerticalViewPager y = verticalView.y;
          int i2 = Math.max(0, (verticalView.g - y));
          int i3 = verticalView.f.j();
          int i4 = Math.min((i3 - 1), (verticalView.g + y));
          if (i3 == verticalView.b) {
             int i5 = 0;
             while (true) {
                if (i5 < verticalView.c.size()) {
                   uoe1 = verticalView.c.get(i5);
                   b = uoe1.b;
                   VerticalViewPager g1 = verticalView.g;
                   if (b >= g1) {
                      if (b == g1) {
                         break ;
                      }else {
                      label_006e :
                         uoe1 = null;
                         break ;
                      }
                   }else {
                      i5 = i5 + 1;
                   }
                }else {
                   goto label_006e ;
                }
             }
             if (uoe1 == null && i3 > 0) {
                uoe1 = verticalView.a(verticalView.g, i5);
             }
             if (uoe1 != null && y > null) {
                i = i5 - 1;
                b = (i >= 0)? verticalView.c.get(i): null;
                int clientHeight = this.getClientHeight();
                float f = 2.00f;
                int i6 = (clientHeight <= 0)? 0: (f - uoe1.d) + ((float)this.getPaddingLeft() / (float)clientHeight);
                int i7 = verticalView.g - 1;
                float f1 = 0;
                while (i7 >= 0) {
                   if (f1 - i6 >= 0 && i7 < i2) {
                      if (b == null) {
                         break ;
                      }else if(i7 == b.b && b.c == null){
                         verticalView.c.remove(i);
                         verticalView.f.h(verticalView, i7, b.a);
                         i = i - 1;
                         i5 = i5 - 1;
                         if (i >= 0) {
                            b1 = verticalView.c.get(i);
                         }else {
                         label_0100 :
                            i10 = 0;
                         }
                      }
                   }else if(b != null && i7 == b.b){
                      f1 = f1 + b.d;
                      i = i - 1;
                      if (i >= 0) {
                         b1 = verticalView.c.get(i);
                      }else {
                         goto label_0100 ;
                      }
                   }else {
                      i10 = i + 1;
                      f1 = f1 + verticalView.a(i7, i10).d;
                      i5 = i5 + 1;
                      if (i >= 0) {
                         b1 = verticalView.c.get(i);
                      }else {
                         goto label_0100 ;
                      }
                   }
                   b = b1;
                label_0102 :
                   i7 = i7 - 1;
                   i10 = 0;
                }
                d = uoe1.d;
                i7 = i5 + 1;
                if (d - f < 0) {
                   uoe2 = (i7 < verticalView.c.size())? verticalView.c.get(i7): null;
                   VerticalViewPager verticalView1 = (clientHeight <= 0)? null: ((float)this.getPaddingRight() / (float)clientHeight) + f;
                   i8 = verticalView.g + 1;
                   clientHeight = i7;
                   while (i8 < i3) {
                      if (d - verticalView1 >= 0 && i8 > i4) {
                         if (uoe2 != null) {
                            if (i8 == uoe2.b && uoe2.c == null) {
                               verticalView.c.remove(clientHeight);
                               verticalView.f.h(verticalView, i8, uoe2.a);
                               if (clientHeight < verticalView.c.size()) {
                                  uoe2 = verticalView.c.get(clientHeight);
                               }else {
                               label_0161 :
                                  uoe2 = null;
                               }
                            }
                         }
                      }else if(uoe2 != null && i8 == uoe2.b){
                         d = d + uoe2.d;
                         clientHeight = clientHeight + 1;
                         if (clientHeight < verticalView.c.size()) {
                            uoe2 = verticalView.c.get(clientHeight);
                         }else {
                            goto label_0161 ;
                         }
                      }else {
                         clientHeight = clientHeight + 1;
                         d = d + verticalView.a(i8, clientHeight).d;
                         if (clientHeight < verticalView.c.size()) {
                            uoe2 = verticalView.c.get(clientHeight);
                         }else {
                            goto label_0161 ;
                         }
                      }
                      i8 = i8 + 1;
                   }
                }
                i = verticalView.f.j();
                i2 = this.getClientHeight();
                f1 = (i2 > 0)? (float)verticalView.n / (float)i2: 0;
                if (uoe != null) {
                   uoe2 = uoe.b;
                   b1 = uoe1.b;
                   if (uoe2 < b1) {
                      f2 = (uoe.e + uoe.d) + f1;
                      i9 = 0;
                      for (i2 = uoe2 + 1; i2 <= uoe1.b && i9 < verticalView.c.size(); i2 = i2 + 1) {
                         uoe3 = verticalView.c.get(i9);
                         while (i2 > uoe3.b) {
                            i4 = verticalView.c.size() - 1;
                            if (i9 < i4) {
                               i9 = i9 + 1;
                               uoe3 = verticalView.c.get(i9);
                            }else {
                               break ;
                            }
                         }
                         while (i2 < uoe3.b) {
                            f3 = verticalView.f.m(i2) + f1;
                            f2 = f2 + f3;
                            i2 = i2 + 1;
                         }
                         uoe3.e = f2;
                         f4 = uoe3.d + f1;
                         f2 = f2 + f4;
                      }
                   }else if(uoe2 > b1){
                      i10 = verticalView.c.size() - 1;
                      uoe = uoe.e;
                      i2 = uoe2 - 1;
                      while (i2 >= uoe1.b && i10 >= 0) {
                         uoe3 = verticalView.c.get(i10);
                         while (i2 < uoe3.b && i10 > 0) {
                            i10 = i10 - 1;
                            uoe3 = verticalView.c.get(i10);
                         }
                         while (i2 > uoe3.b) {
                            f3 = verticalView.f.m(i2) + f1;
                            f8 = uoe - f3;
                            i2 = i2 - 1;
                         }
                         f3 = uoe3.d + f1;
                         f8 = uoe - f3;
                         uoe3.e = f8;
                      }
                   }
                }
                i9 = verticalView.c.size();
                uoe2 = uoe1.e;
                b1 = uoe1.b;
                i3 = b1 - 1;
                VerticalViewPager$e uoe4 = (b1 == null)? uoe2: -340282346638528860000000000000000000000.00f;
                verticalView.r = uoe4;
                i = i - 1;
                f2 = (b1 == i)? (uoe1.d + uoe2) - 0x3f800000: Float.MAX_VALUE;
                verticalView.s = f2;
                i5 = i5 - 1;
                while (i5 >= 0) {
                   b1 = verticalView.c.get(i5);
                   b = b1.b;
                   while (i3 > b) {
                      clientHeight = i3 - 1;
                      f4 = verticalView.f.m(i3) + f1;
                      f5 = uoe2 - f4;
                      i3 = clientHeight;
                   }
                   float f6 = b1.d + f1;
                   f5 = uoe2 - f6;
                   b1.e = f5;
                   if (b == null) {
                      verticalView.r = f5;
                   }
                   i5 = i5 - 1;
                   i3 = i3 - 1;
                }
                f5 = (uoe1.e + uoe1.d) + f1;
                b1 = uoe1.b;
                i10 = b1 + 1;
                while (i7 < i9) {
                   uoe3 = verticalView.c.get(i7);
                   VerticalViewPager$e b2 = uoe3.b;
                   while (i10 < b2) {
                      i8 = i10 + 1;
                      f2 = verticalView.f.m(i10) + f1;
                      f5 = f5 + f2;
                      i10 = i8;
                   }
                   if (b2 == i) {
                      float f7 = uoe3.d + f5;
                      f7 = f7 - 0x3f800000;
                      verticalView.s = f7;
                   }
                   uoe3.e = f5;
                   f4 = uoe3.d + f1;
                   f5 = f5 + f4;
                   i7 = i7 + 1;
                }
                verticalView.U = false;
             }else {
                VerticalViewPager verticalView2 = null;
             }
             y = verticalView.f;
             g = verticalView.g;
             uoe2 = (uoe1 != null)? uoe1.a: null;
             y.v(verticalView, g, uoe2);
             verticalView.f.i(verticalView);
             this.Q();
             if (this.hasFocus()) {
                View view = this.findFocus();
                if (view != null) {
                   while (true) {
                      ViewParent parent = view.getParent();
                      if (parent != verticalView) {
                         if (parent == null || !parent instanceof View) {
                            i11 = 0;
                         label_030d :
                            d = i11;
                         }else {
                            view = parent;
                         }
                      }else {
                         i11 = verticalView.o(view);
                         goto label_030d ;
                      }
                   }
                }else {
                   d = null;
                }
                if (d == null || d.b != verticalView.g) {
                   i10 = 0;
                   while (i10 < this.getChildCount()) {
                      view = verticalView.getChildAt(i10);
                      uoe = verticalView.o(view);
                      if (uoe == null || (uoe.b != verticalView.g || !view.requestFocus(i1))) {
                         i10 = i10 + 1;
                      }
                   }
                }
             }
             return;
          }else {
             try{
                resourceName = this.getResources().getResourceName(this.getId());
             }catch(android.content.res.Resources$NotFoundException e0){
                resourceName = Integer.toHexString(this.getId());
             }
             throw new IllegalStateException("The application\'s PagerAdapter changed the adapter\'s contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "+e0.b+", found: "+i3+" Pager id: "+resourceName+" Pager class: "+this.getClass()+" Problematic adapter: "+e0.f.getClass());
          }
       }
    }
    public final void E(int p0,int p1,int p2,int p3){
       if (p1 > 0 && !this.c.isEmpty()) {
          if (this.f1 != null && !this.k.isFinished()) {
             VerticalViewPager$e uoe = this.q(this.g);
             if (uoe != null) {
                this.k.setFinalY((int)(uoe.e * (float)p0));
                return;
             }
          }
          int i = (int)(((float)this.getScrollY() / (float)(((p1 - this.getPaddingTop()) - this.getPaddingBottom()) + p3)) * (float)(((p0 - this.getPaddingTop()) - this.getPaddingBottom()) + p2));
          this.scrollTo(this.getScrollX(), i);
          if (!this.k.isFinished()) {
             this.k.startScroll(0, i, 0, (int)(this.q(this.g).e * (float)p0), (this.k.getDuration() - this.k.timePassed()));
          }
       }else {
          VerticalViewPager$e uoe1 = this.q(this.g);
          float f = (uoe1 != null)? Math.min(uoe1.e, this.s): 0;
          p0 = (int)(f * (float)((p0 - this.getPaddingTop()) - this.getPaddingBottom()));
          if (p0 != this.getScrollY()) {
             this.e(false);
             this.scrollTo(this.getScrollX(), p0);
          }
       }
       return;
    }
    public void F(ViewPager$i p0){
       VerticalViewPager tW0 = this.W0;
       if (tW0 != null) {
          tW0.remove(p0);
       }
       return;
    }
    public final void G(boolean p0){
       ViewParent parent = this.getParent();
       if (parent != null) {
          parent.requestDisallowInterceptTouchEvent(p0);
       }
       return;
    }
    public final void H(int p0,boolean p1,int p2,boolean p3,boolean p4){
       VerticalViewPager verticalView = this;
       VerticalViewPager$e uoe = this.q(p0);
       int b = false;
       int i = (uoe != null)? (int)((float)this.getClientHeight() * Math.max(verticalView.r, Math.min(uoe.e, verticalView.s))): 0;
       int i1 = 2;
       if (p1) {
          if (!this.getChildCount()) {
             this.setScrollingCacheEnabled(b);
          }else {
             int scrollX = this.getScrollX();
             int scrollY = this.getScrollY();
             int i2 = scrollX - 0;
             int i3 = i - scrollY;
             if (!i2 && !i3) {
                this.e(b);
                this.C();
                if (p4) {
                   this.w();
                }
                this.setScrollState(b);
             }else {
                this.setScrollingCacheEnabled(true);
                this.setScrollState(i1);
                i = this.getClientHeight();
                b = i / 2;
                float f = 0x3f800000;
                float f1 = (float)i;
                float f2 = (float)b;
                f2 = f2 + ((float)Math.sin((double)(float)((double)(Math.min(f, (((float)Math.abs(i3) * f) / f1)) - 0x3f000000) * 0x3fde28c7460698c7)) * f2);
                int i4 = Math.abs(p2);
                i = (i4 > 0)? Math.round((Math.abs((f2 / (float)i4)) * 1000.00f)) * 4: (int)((((float)Math.abs(i3) / ((f1 * verticalView.f.m(verticalView.g)) + (float)verticalView.n)) + f) * 100.00f) * 2;
                verticalView.k.startScroll(scrollX, scrollY, i2, i3, Math.min(i, this.getMaxSettleDuration()));
                i0.j0(this);
             }
          }
          if (p3) {
             this.h(p0);
          }
       }else if(p3){
          this.h(p0);
       }
       this.e(b);
       this.scrollTo(b, i);
       this.z(i);
       if (p3 && verticalView.e1 != i1) {
          this.w();
       }
    label_00df :
       return;
    }
    public void I(int p0,boolean p1){
       this.x = false;
       this.K(p0, p1, false);
    }
    public void J(int p0,boolean p1){
       this.x = false;
       this.K(p0, p1, true);
    }
    public void K(int p0,boolean p1,boolean p2){
       this.L(p0, p1, p2, 0);
    }
    public void L(int p0,boolean p1,boolean p2,int p3){
       this.M(p0, p1, p2, p3, false);
    }
    public void M(int p0,boolean p1,boolean p2,int p3,boolean p4){
       int i;
       VerticalViewPager tf = this.f;
       if (tf == null || tf.j() <= 0) {
          this.setScrollingCacheEnabled(false);
          return;
       }else if(!p2 && (this.g == p0 && this.c.size())){
          this.setScrollingCacheEnabled(false);
          return;
       }else if(p0 < 0){
          i = 0;
       }else if(p0 >= this.f.j()){
          p0 = this.f.j() - true;
       }
       i = p0;
       VerticalViewPager ty = this.y;
       tf = this.g;
       if (i > (tf + ty) || i < (tf - ty)) {
          for (ty = 0; ty < this.c.size(); ty++) {
             this.c.get(ty).c = true;
          }
       }
       boolean b = (this.g != i)? true: false;
       if (this.T != null) {
          this.g = i;
          if (b) {
             this.h(i);
          }
          this.requestLayout();
       }else {
          this.D(i);
          this.H(i, p1, p3, b, p4);
       }
       return;
    }
    public void N(boolean p0,boolean p1){
       this.setChildrenDrawingOrderEnabled(p0);
       if (p0) {
          int i = (p1)? 2: 1;
          this.b1 = i;
          this.P();
       }else {
          this.b1 = 0;
       }
       return;
    }
    public void O(boolean p0,ViewPager$j p1){
       int i = 0;
       boolean b = true;
       int i1 = (this.Z0 != null)? 1: 0;
       if (b != i1) {
          i = 1;
       }
       this.Z0 = p1;
       this.setChildrenDrawingOrderEnabledCompat(b);
       if (p0) {
          b = 2;
       }
       this.b1 = b;
       if (i) {
          this.C();
       }
       return;
    }
    public final void P(){
       if (this.b1 != null) {
          VerticalViewPager tc1 = this.c1;
          if (tc1 == null) {
             this.c1 = new ArrayList();
          }else {
             tc1.clear();
          }
          int childCount = this.getChildCount();
          for (int i = 0; i < childCount; i = i + 1) {
             this.c1.add(this.getChildAt(i));
          }
          Collections.sort(this.c1, VerticalViewPager.k1);
       }
       return;
    }
    public void Q(){
       int childCount = this.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          VerticalViewPager$LayoutParams layoutParams = childAt.getLayoutParams();
          layoutParams.f = i;
          if (layoutParams.a == null && !layoutParams.c) {
             VerticalViewPager$e uoe = this.o(childAt);
             if (uoe != null) {
                layoutParams.c = uoe.d;
                layoutParams.e = uoe.b;
             }
          }
          i = i + 1;
       }
       this.P();
       return;
    }
    public int R(int p0){
       return p0;
    }
    public VerticalViewPager$e a(int p0,int p1){
       VerticalViewPager$e uoe = new VerticalViewPager$e();
       uoe.b = p0;
       uoe.a = this.f.o(this, p0);
       uoe.d = this.f.m(p0);
       if (p1 < 0 || p1 >= this.c.size()) {
          this.c.add(uoe);
       }else {
          this.c.add(p1, uoe);
       }
       return uoe;
    }
    public void addFocusables(ArrayList p0,int p1,int p2){
       int i = p0.size();
       int descendantFo = this.getDescendantFocusability();
       if (descendantFo != 0x60000) {
          int i1 = 0;
          while (i1 < this.getChildCount()) {
             View childAt = this.getChildAt(i1);
             if (!childAt.getVisibility()) {
                VerticalViewPager$e uoe = this.o(childAt);
                if (uoe != null && uoe.b == this.g) {
                   childAt.addFocusables(p0, p1, p2);
                }
             }
             i1 = i1 + 1;
          }
       }
       if (descendantFo != 0x40000 || i == p0.size()) {
          if (!this.isFocusable()) {
             return;
          }else {
             p1 = 1;
             if ((p2 & p1) == p1 && (this.isInTouchMode() && !this.isFocusableInTouchMode())) {
                return;
             }else {
                p0.add(this);
             }
          }
       }
       return;
    }
    public void addTouchables(ArrayList p0){
       int i = 0;
       while (i < this.getChildCount()) {
          View childAt = this.getChildAt(i);
          if (!childAt.getVisibility()) {
             VerticalViewPager$e uoe = this.o(childAt);
             if (uoe != null && uoe.b == this.g) {
                childAt.addTouchables(p0);
             }
          }
          i = i + 1;
       }
       return;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (!this.checkLayoutParams(p2)) {
          p2 = this.generateLayoutParams(p2);
       }
       ViewGroup$LayoutParams layoutParams = p2;
       int i = layoutParams.a | p0 instanceof VerticalViewPager$d;
       layoutParams.a = i;
       if (this.v != null) {
          if (!i) {
             layoutParams.d = true;
             this.addViewInLayout(p0, p1, p2);
          }else {
             throw new IllegalStateException("Cannot add pager decor view during layout");
          }
       }else if(p0.getParent() instanceof ViewGroup){
          p0.getParent().removeView(p0);
       }
       super.addView(p0, p1, p2);
       return;
    }
    public void b(ViewPager$i p0){
       if (this.W0 == null) {
          this.W0 = new ArrayList();
       }
       this.W0.add(p0);
       return;
    }
    public boolean c(int p0){
       Rect top;
       Rect top1;
       boolean b;
       StringBuilder str;
       View view = this.findFocus();
       VerticalViewPager verticalView = 1;
       VerticalViewPager verticalView1 = null;
       FocusFinder uFocusFinder = null;
       if (view == this) {
       }else if(view != null){
          ViewParent parent = view.getParent();
          while (true) {
             if (parent instanceof ViewGroup) {
                if (parent == this) {
                   str = 1;
                label_001f :
                   if (!str) {
                      str = view.getClass().getSimpleName();
                      ViewParent parent1 = view.getParent();
                      while (parent1 instanceof ViewGroup) {
                         str = str+" => "+parent1.getClass().getSimpleName();
                         parent1 = parent1.getParent();
                      }
                      view = uFocusFinder;
                   }
                }else {
                   parent = parent.getParent();
                }
             }else {
                str = null;
                goto label_001f ;
             }
          }
       }
       View view1 = FocusFinder.getInstance().findNextFocus(this, view, p0);
       if (view1 != null && view1 != view) {
          if (p0 == 33) {
             top = this.j(this.e, view1).top;
             top1 = this.j(this.e, view).top;
             b = (view != null && top >= top1)? this.A(): view1.requestFocus();
          }else if(p0 == 130){
             top = this.j(this.e, view1).bottom;
             top1 = this.j(this.e, view).bottom;
             b = (view != null && top <= top1)? this.y(): view1.requestFocus();
          }
          verticalView1 = b;
       }else if(p0 == 33 || p0 == verticalView){
          verticalView1 = this.A();
       }else if(p0 == 130 || p0 == 2){
          verticalView1 = this.y();
       }
       if (verticalView1) {
          this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(p0));
       }
       return verticalView1;
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       boolean b = (p0 instanceof VerticalViewPager$LayoutParams && super.checkLayoutParams(p0))? true: false;
       return b;
    }
    public void computeScroll(){
       if (!this.k.isFinished() && this.k.computeScrollOffset()) {
          int scrollY = this.getScrollY();
          int currX = this.k.getCurrX();
          int currY = this.k.getCurrY();
          if (this.getScrollX() != currX || scrollY != currY) {
             this.scrollTo(currX, currY);
             if (!this.z(currY)) {
                this.k.abortAnimation();
                this.scrollTo(currX, 0);
             }
          }
          i0.j0(this);
          return;
       }else {
          this.e(true);
          return;
       }
    }
    public boolean d(View p0,boolean p1,int p2,int p3,int p4){
       int i = p0;
       int i1 = 1;
       if (i instanceof ViewGroup) {
          ViewGroup viewGroup = i;
          int scrollX = p0.getScrollX();
          int scrollY = p0.getScrollY();
          int i2 = viewGroup.getChildCount() - i1;
          while (true) {
             if (i2 >= 0) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.isEnabled()) {
                   int i3 = p4 + scrollY;
                   if (i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                      int i4 = p3 + scrollX;
                      if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                         int i5 = i4 - childAt.getLeft();
                         int i6 = i3 - childAt.getTop();
                         if (this.d(childAt, 1, p2, i5, i6)) {
                            return i1;
                         }
                      }
                   }
                }
                i2 = i2 - 1;
             }
          }
       }
       if (!p1 || !i0.e(p0, (- p2))) {
          i1 = false;
       }
       return i1;
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       boolean b1;
       boolean b = false;
       if (!super.dispatchKeyEvent(p0)) {
          if (!p0.getAction()) {
             int keyCode = p0.getKeyCode();
             if (keyCode != 21) {
                if (keyCode != 22) {
                   if (keyCode != 61) {
                   label_0044 :
                      b1 = false;
                   }else if(p0.hasNoModifiers()){
                      b1 = this.c(2);
                   }else if(p0.hasModifiers(1)){
                      b1 = this.c(1);
                   }else {
                      goto label_0044 ;
                   }
                }else {
                   b1 = this.c(66);
                }
             }else {
                b1 = this.c(17);
             }
          }else {
             goto label_0044 ;
          }
          if (!b1) {
          label_0048 :
             return b;
          }
       }
       b = true;
       goto label_0048 ;
    }
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent p0){
       if (p0.getEventType() == 4096) {
          return super.dispatchPopulateAccessibilityEvent(p0);
       }
       int childCount = this.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return false;
          }
          View childAt = this.getChildAt(i);
          if (!childAt.getVisibility()) {
             VerticalViewPager$e uoe = this.o(childAt);
             if (uoe != null && (uoe.b == this.g && childAt.dispatchPopulateAccessibilityEvent(p0))) {
                break ;
             }
          }
          i = i + 1;
       }
       return true;
    }
    public void draw(Canvas p0){
       super.draw(p0);
       int i = i0.F(this);
       int i1 = 0;
       if (i) {
          int i2 = 1;
          if (i == i2) {
             VerticalViewPager tf = this.f;
             if (tf != null && tf.j() > i2) {
             label_0024 :
                if (!this.R.c()) {
                   i2 = this.getHeight();
                   p0.translate((float)this.getPaddingLeft(), (this.r * (float)i2));
                   this.R.i(((this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight()), i2);
                   i1 = i1 | this.R.a(p0);
                   p0.restoreToCount(p0.save());
                }
                if (!this.S.c()) {
                   i2 = this.getHeight();
                   int i3 = (this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight();
                   p0.rotate(180.00f);
                   p0.translate((float)((- i3) - this.getPaddingLeft()), ((- (this.s + 0x3f800000)) * (float)i2));
                   this.S.i(i3, i2);
                   i1 = i1 | this.S.a(p0);
                   p0.restoreToCount(p0.save());
                }
             }
          }
          this.R.b();
          this.S.b();
       }else {
          goto label_0024 ;
       }
       if (i1) {
          i0.j0(this);
       }
       return;
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       VerticalViewPager to = this.o;
       if (to != null && to.isStateful()) {
          to.setState(this.getDrawableState());
       }
       return;
    }
    public final void e(boolean p0){
       int i = (this.e1 == 2)? 1: 0;
       if (i) {
          this.setScrollingCacheEnabled(false);
          this.k.abortAnimation();
          int scrollY = this.getScrollY();
          int currX = this.k.getCurrX();
          int currY = this.k.getCurrY();
          if (this.getScrollX() != currX || scrollY != currY) {
             this.scrollTo(currX, currY);
          }
       }
       this.x = false;
       int i1 = 0;
       while (i1 < this.c.size()) {
          VerticalViewPager$e uoe = this.c.get(i1);
          if (uoe.c != null) {
             uoe.c = false;
             i = 1;
          }
          i1 = i1 + 1;
       }
       if (i) {
          if (p0) {
             i0.k0(this, this.d1);
          }else {
             this.d1.run();
          }
       }
       return;
    }
    public void f(){
       int i3;
       int i = this.f.j();
       this.b = i;
       VerticalViewPager verticalView = (this.c.size() < ((this.y * 2) + 1) && this.c.size() < i)? 1: null;
       VerticalViewPager tg = this.g;
       int i1 = 0;
       VerticalViewPager$LayoutParams layoutParams = null;
       while (i1 < this.c.size()) {
          VerticalViewPager$e uoe = this.c.get(i1);
          int i2 = this.f.k(uoe);
          if (i2 != -1) {
             if (i2 == -2) {
                this.c.remove(i1);
                i1 = i1 - 1;
                if (!layoutParams) {
                   this.f.x(this);
                   layoutParams = 1;
                }
                this.f.h(this, uoe.b, uoe.a);
                verticalView = this.g;
                if (verticalView == uoe.b) {
                   tg = this.V0;
                   if (tg < null || tg >= i) {
                      i3 = i - 1;
                      i3 = Math.max(0, Math.min(verticalView, i3));
                   }
                }
             }else {
                VerticalViewPager$e b = uoe.b;
                if (b != i2) {
                   if (b == this.g) {
                      i3 = i2;
                   }
                   uoe.b = i2;
                }
             }
             verticalView = 1;
          }
          i1 = i1 + 1;
       }
       if (layoutParams) {
          this.f.i(this);
       }
       Collections.sort(this.c, VerticalViewPager.i1);
       if (verticalView != null) {
          i = this.getChildCount();
          int i4 = 0;
          while (i4 < i) {
             VerticalViewPager$LayoutParams layoutParams1 = this.getChildAt(i4).getLayoutParams();
             if (layoutParams1.a == null) {
                layoutParams1.c = 0;
             }
             i4 = i4 + 1;
          }
          this.K(tg, 0, 1);
          this.requestLayout();
       }
       return;
    }
    public int g(int p0,float p1,int p2,int p3){
       float f;
       if (Math.abs(p3) > this.N && Math.abs(p2) > this.L) {
          if (p2 <= 0) {
             p0++;
          }
       }else if(p0 >= this.g){
          f = 0.40f;
       }else {
          f = 0x3f19999a;
       }
       p0 = (int)(((float)p0 + p1) + f);
       if (this.c.size() > 0) {
          VerticalViewPager tc = this.c;
          p0 = Math.max(this.c.get(0).b, Math.min(p0, tc.get((tc.size() - 1)).b));
       }
       return p0;
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return new VerticalViewPager$LayoutParams();
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return new VerticalViewPager$LayoutParams(this.getContext(), p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return this.generateDefaultLayoutParams();
    }
    public a getAdapter(){
       return this.f;
    }
    public int getChildDrawingOrder(int p0,int p1){
       if (this.b1 == 2) {
          p0--;
          p1 = p0 - p1;
       }
       return this.c1.get(p1).getLayoutParams().f;
    }
    public final int getClientHeight(){
       return ((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom());
    }
    public int getCurrentItem(){
       return this.g;
    }
    public Interpolator getInterpolator(){
       return VerticalViewPager.j1;
    }
    public int getMaxSettleDuration(){
       return 600;
    }
    public int getMeasureChildCount(){
       return this.getChildCount();
    }
    public int getOffscreenPageLimit(){
       return this.y;
    }
    public int getPageMargin(){
       return this.n;
    }
    public final void i(){
       this.z = false;
       this.A = false;
       VerticalViewPager tK = this.K;
       if (tK != null) {
          tK.recycle();
          this.K = null;
       }
       return;
    }
    public final Rect j(Rect p0,View p1){
       if (p0 == null) {
          p0 = new Rect();
       }
       if (p1 == null) {
          p0.set(0, 0, 0, 0);
          return p0;
       }else {
          p0.left = p1.getLeft();
          p0.right = p1.getRight();
          p0.top = p1.getTop();
          p0.bottom = p1.getBottom();
          ViewParent parent = p1.getParent();
          while (parent instanceof ViewGroup && parent != this) {
             int i = p0.left + parent.getLeft();
             p0.left = i;
             i = p0.right + parent.getRight();
             p0.right = i;
             i = p0.top + parent.getTop();
             p0.top = i;
             i = p0.bottom + parent.getBottom();
             p0.bottom = i;
             parent = parent.getParent();
          }
          return p0;
       }
    }
    public View k(int p0){
       return this.getChildAt(p0);
    }
    public final int l(View p0){
       int i;
       VerticalViewPager$e uoe = this.o(p0);
       uoe = (uoe != null)? uoe.b: -1;
       return uoe;
    }
    public final float m(MotionEvent p0,int p1){
       if (p1 != -1 && p0.getPointerCount() > p1) {
          return q.f(p0, p1);
       }
       return p0.getX();
    }
    public final float n(MotionEvent p0,int p1){
       if (p1 != -1 && p0.getPointerCount() > p1) {
          return q.g(p0, p1);
       }
       return p0.getY();
    }
    public VerticalViewPager$e o(View p0){
       VerticalViewPager$e uoe;
       int i = 0;
       while (true) {
          if (i >= this.c.size()) {
             return null;
          }
          uoe = this.c.get(i);
          if (this.f.p(p0, uoe.a)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return uoe;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.T = true;
    }
    public void onDetachedFromWindow(){
       this.removeCallbacks(this.d1);
       super.onDetachedFromWindow();
    }
    public void onDraw(Canvas p0){
       float f2;
       float f3;
       float f5;
       float f6;
       VerticalViewPager verticalView = this;
       super.onDraw(p0);
       if (verticalView.n > null && (verticalView.o != null && (verticalView.c.size() > 0 && verticalView.f != null))) {
          int scrollY = this.getScrollY();
          int height = this.getHeight();
          float f = (float)height;
          float f1 = (float)verticalView.n / f;
          int i = 0;
          VerticalViewPager$e uoe = verticalView.c.get(i);
          VerticalViewPager$e e = uoe.e;
          int i1 = verticalView.c.size();
          VerticalViewPager$e b = uoe.b;
          VerticalViewPager$e b1 = verticalView.c.get((i1 - 1)).b;
          while (b < b1) {
             VerticalViewPager$e b2 = uoe.b;
             while (b > b2 && i < i1) {
                i = i + 1;
                uoe = verticalView.c.get(i);
             }
             if (b == b2) {
                e = uoe.e;
                b2 = uoe.d;
                f2 = e + b2;
                f2 = f2 * f;
                f3 = e + b2;
                f3 = f3 + f1;
             }else {
                f6 = verticalView.f.m(b);
                f2 = e + f6;
                f2 = f2 * f;
                f6 = f6 + f1;
                f3 = e + f6;
             }
             VerticalViewPager n = verticalView.n;
             float f4 = (float)n + f2;
             if (f4 - (float)scrollY > 0) {
                f5 = f1;
                f6 = (float)n + f2;
                f6 = f6 + 0x3f000000;
                verticalView.o.setBounds(verticalView.p, (int)f2, verticalView.q, (int)f6);
                verticalView.o.draw(p0);
             }else {
                f5 = f1;
             }
             int i2 = scrollY + height;
             if (f2 - (float)i2 <= 0) {
                b = b + 1;
                f1 = f5;
             }
          }
       }
    label_00a6 :
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       VerticalViewPager k;
       float k1;
       VerticalViewPager verticalView = this;
       MotionEvent motionEvent = p0;
       int i = p0.getAction() & 0x00ff;
       int i1 = -1;
       if (i == 3 || i == 1) {
          verticalView.z = false;
          verticalView.A = false;
          verticalView.J = i1;
          k = verticalView.K;
          if (k != null) {
             k.recycle();
             verticalView.K = null;
          }
          return false;
       }else if(i){
          if (verticalView.z != null) {
             return true;
          }else if(verticalView.A != null){
             return false;
          }
       }
       VerticalViewPager verticalView1 = 2;
       if (i) {
          if (i != verticalView1) {
             if (i == 6) {
                this.x(p0);
             }
          }else {
             k = verticalView.J;
             if (k != i1) {
                i = q.a(motionEvent, k);
                float f = this.n(motionEvent, i);
                float f1 = f - verticalView.G;
                float f2 = Math.abs(f1);
                float f3 = this.m(motionEvent, i);
                float f4 = Math.abs((f3 - verticalView.H));
                k = null;
                if (v14 = f1 - k) {
                   verticalView1 = verticalView.G;
                   k = (verticalView1 - (float)verticalView.D >= 0 || (v14 > 0 || (verticalView1 - (float)(this.getHeight() - verticalView.D) > 0 && f1 - k < 0)))? 1: null;
                   if (!k && this.d(this, false, (int)f1, (int)f3, (int)f)) {
                      verticalView.F = f3;
                      verticalView.G = f;
                      verticalView.A = true;
                      return false;
                   }
                }
             label_0088 :
                k = verticalView.E;
                if (f2 - (float)k > 0 && f2 - f4 > 0) {
                   verticalView.z = true;
                   this.G(true);
                   this.setScrollState(true);
                   k = verticalView.I;
                   f1 = (float)verticalView.E;
                   k1 = (v14 > 0)? k + f1: k - f1;
                   verticalView.G = k1;
                   verticalView.F = f3;
                   this.setScrollingCacheEnabled(true);
                }else if(f4 - (float)k > 0){
                   verticalView.A = true;
                }
                if (verticalView.z != null && this.B(f)) {
                   i0.j0(this);
                }
             }
          }
       }else {
          k1 = p0.getX();
          verticalView.H = k1;
          verticalView.F = k1;
          k1 = p0.getY();
          verticalView.I = k1;
          verticalView.G = k1;
          verticalView.J = q.e(motionEvent, false);
          verticalView.A = false;
          verticalView.k.computeScrollOffset();
          if (verticalView.e1 == verticalView1 && Math.abs((verticalView.k.getFinalY() - verticalView.k.getCurrY())) > verticalView.O) {
             verticalView.k.abortAnimation();
             verticalView.x = false;
             this.C();
             verticalView.z = true;
             this.G(true);
             this.setScrollState(true);
          }else {
             this.e(false);
             verticalView.z = false;
          }
       }
       if (verticalView.K == null) {
          verticalView.K = VelocityTracker.obtain();
       }
       verticalView.K.addMovement(motionEvent);
       return verticalView.z;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i4;
       ViewGroup viewGroup = this;
       int childCount = this.getChildCount();
       int i = p3 - p1;
       int i1 = p4 - p2;
       int paddingLeft = this.getPaddingLeft();
       int paddingTop = this.getPaddingTop();
       int paddingRight = this.getPaddingRight();
       int paddingBotto = this.getPaddingBottom();
       int scrollY = this.getScrollY();
       int i2 = 0;
       int i3 = 0;
       VerticalViewPager$LayoutParams layoutParams = 8;
       while (i2 < childCount) {
          View childAt = viewGroup.getChildAt(i2);
          if (childAt.getVisibility() != layoutParams) {
             layoutParams = childAt.getLayoutParams();
             if (layoutParams.a != null) {
                layoutParams = layoutParams.b;
                i4 = layoutParams & 0x07;
                int i5 = layoutParams & 0x70;
                if (i4 != 1) {
                   if (i4 != 3) {
                      if (i4 != 5) {
                         i4 = paddingLeft;
                      }else {
                         i4 = i - paddingRight;
                         i4 = i4 - childAt.getMeasuredWidth();
                         paddingRight = paddingRight + childAt.getMeasuredWidth();
                      label_0068 :
                         i4 = paddingLeft;
                         paddingLeft = i4;
                      }
                   }else {
                      i4 = childAt.getMeasuredWidth() + paddingLeft;
                   }
                }else {
                   i4 = i - childAt.getMeasuredWidth();
                   i4 = i4 / 2;
                   i4 = Math.max(i4, paddingLeft);
                   goto label_0068 ;
                }
                if (i5 != 16) {
                   if (i5 != 48) {
                      if (i5 != 80) {
                         i5 = paddingTop;
                      }else {
                         i5 = i1 - paddingBotto;
                         i5 = i5 - childAt.getMeasuredHeight();
                         paddingBotto = paddingBotto + childAt.getMeasuredHeight();
                      label_009a :
                         i5 = paddingTop;
                         paddingTop = i5;
                      }
                   }else {
                      i5 = childAt.getMeasuredHeight() + paddingTop;
                   }
                }else {
                   i5 = i1 - childAt.getMeasuredHeight();
                   i5 = i5 / 2;
                   i5 = Math.max(i5, paddingTop);
                   goto label_009a ;
                }
                paddingTop = paddingTop + scrollY;
                int i6 = childAt.getMeasuredWidth() + paddingLeft;
                int i7 = paddingTop + childAt.getMeasuredHeight();
                childAt.layout(paddingLeft, paddingTop, i6, i7);
                i3 = i3 + 1;
                paddingTop = i5;
                paddingLeft = i4;
             }
          }
          i2 = i2 + 1;
       }
       i1 = (i1 - paddingTop) - paddingBotto;
       childCount = this.getMeasureChildCount();
       paddingBotto = 0;
       while (paddingBotto < childCount) {
          View view = viewGroup.k(paddingBotto);
          if (view.getVisibility() != layoutParams) {
             VerticalViewPager$LayoutParams layoutParams1 = view.getLayoutParams();
             if (layoutParams1.a == null) {
                VerticalViewPager$e uoe = viewGroup.o(view);
                if (uoe != null) {
                   float f = (float)i1;
                   float f1 = uoe.e * f;
                   i2 = (int)f1 + paddingTop;
                   if (layoutParams1.d != null) {
                      layoutParams1.d = false;
                      i4 = i - paddingLeft;
                      i4 = i4 - paddingRight;
                      f = f * layoutParams1.c;
                      viewGroup.u(view, View$MeasureSpec.makeMeasureSpec(i4, 0x40000000), View$MeasureSpec.makeMeasureSpec((int)f, 0x40000000));
                   }
                   viewGroup.t(view, paddingLeft, i2);
                }
             }
          }
          paddingBotto = paddingBotto + 1;
       }
       viewGroup.p = paddingLeft;
       viewGroup.q = i - paddingRight;
       viewGroup.W = i3;
       if (viewGroup.T != null) {
          this.H(viewGroup.g, false, 0, false, false);
       }
       viewGroup.T = false;
       return;
    }
    public void onMeasure(int p0,int p1){
       int i5;
       int i = 0;
       this.setMeasuredDimension(ViewGroup.getDefaultSize(i, p0), ViewGroup.getDefaultSize(i, p1));
       p0 = this.getMeasuredHeight();
       this.D = Math.min((p0 / 10), this.C);
       p1 = (this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight();
       p0 = (p0 - this.getPaddingTop()) - this.getPaddingBottom();
       int childCount = this.getChildCount();
       int i1 = 0;
       VerticalViewPager$LayoutParams layoutParams = 8;
       boolean b = true;
       int i2 = 0x40000000;
       while (i1 < childCount) {
          View childAt = this.getChildAt(i1);
          if (childAt.getVisibility() != layoutParams) {
             layoutParams = childAt.getLayoutParams();
             if (layoutParams != null && layoutParams.a != null) {
                VerticalViewPager$LayoutParams b1 = layoutParams.b;
                int i3 = b1 & 0x07;
                int i4 = b1 & 0x70;
                i4 = (i4 == 48 || i4 == 80)? 1: 0;
                if (i3 != 3 && i3 != 5) {
                   b = false;
                }
                i3 = Integer.MIN_VALUE;
                if (i4) {
                   i3 = 0x40000000;
                }else if(b){
                   i5 = 0x40000000;
                label_007c :
                   ViewGroup$LayoutParams width = layoutParams.width;
                   if (width != -2) {
                      if (width == -1) {
                         width = p1;
                      }
                      i3 = 0x40000000;
                   }else {
                      width = p1;
                   }
                   ViewGroup$LayoutParams height = layoutParams.height;
                   if (height != -2) {
                      if (height == -1) {
                         height = p0;
                      }
                   }else {
                      height = p0;
                      i2 = i5;
                   }
                   childAt.measure(View$MeasureSpec.makeMeasureSpec(width, i3), View$MeasureSpec.makeMeasureSpec(height, i2));
                   if (i4) {
                      p0 = p0 - childAt.getMeasuredHeight();
                   }else if(b){
                      p1 = p1 - childAt.getMeasuredWidth();
                   }
                }
                i5 = Integer.MIN_VALUE;
                goto label_007c ;
             }
          }
          i1 = i1 + 1;
       }
       this.t = View$MeasureSpec.makeMeasureSpec(p1, i2);
       this.u = View$MeasureSpec.makeMeasureSpec(p0, i2);
       this.v = b;
       this.C();
       this.v = i;
       p1 = this.getMeasureChildCount();
       while (i < p1) {
          View view = this.k(i);
          if (view.getVisibility() != layoutParams) {
             VerticalViewPager$LayoutParams layoutParams1 = view.getLayoutParams();
             if (layoutParams1 == null || layoutParams1.a == null) {
                float f = (float)p0 * layoutParams1.c;
                this.u(view, this.t, View$MeasureSpec.makeMeasureSpec((int)f, i2));
             }
          }
          i = i + 1;
       }
       return;
    }
    public boolean onRequestFocusInDescendants(int p0,Rect p1){
       int childCount = this.getChildCount();
       int i = p0 & 0x02;
       int i1 = -1;
       if (i) {
          i1 = childCount;
          childCount = 0;
          i = 1;
       }else {
          childCount = childCount - 1;
          i = -1;
       }
       while (true) {
          if (childCount == i1) {
             return false;
          }
          View childAt = this.getChildAt(childCount);
          if (!childAt.getVisibility()) {
             VerticalViewPager$e uoe = this.o(childAt);
             if (uoe != null && (uoe.b == this.g && childAt.requestFocus(p0, p1))) {
                break ;
             }
          }
          childCount = childCount + i;
       }
       return true;
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (!p0 instanceof VerticalViewPager$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.getSuperState());
          VerticalViewPager tf = this.f;
          if (tf != null) {
             tf.s(p0.c, p0.d);
             this.K(p0.b, false, true);
          }else {
             this.h = p0.b;
             this.i = p0.c;
             this.j = p0.d;
          }
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       VerticalViewPager$SavedState savedState = new VerticalViewPager$SavedState(super.onSaveInstanceState());
       savedState.b = this.g;
       VerticalViewPager tf = this.f;
       if (tf != null) {
          savedState.c = tf.u();
       }
       return savedState;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       if (p1 != p3) {
          this.E(p1, p3, this.n, this.n);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       float f2;
       if (this.P != null) {
          return true;
       }
       boolean b = false;
       if (!p0.getAction() && p0.getEdgeFlags()) {
          return b;
       }
       VerticalViewPager tf = this.f;
       if (tf == null || !tf.j()) {
          return b;
       }
       if (this.K == null) {
          this.K = VelocityTracker.obtain();
       }
       this.K.addMovement(p0);
       int i = p0.getAction() & 0x00ff;
       if (i) {
          int i1 = -1;
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   if (i != 0.00f) {
                      if (i == 6) {
                         this.x(p0);
                         this.G = this.n(p0, q.a(p0, this.J));
                      }
                   }else {
                      i = q.b(p0);
                      this.G = this.n(p0, i);
                      this.J = q.e(p0, i);
                   }
                }else if(this.z != null){
                   this.H(this.g, true, 0, false, false);
                   this.J = i1;
                   this.i();
                   b = this.R.h() | this.S.h();
                }
             }else if(this.z == null){
                i = q.a(p0, this.J);
                float f = this.n(p0, i);
                float f1 = Math.abs((f - this.G));
                f2 = this.m(p0, i);
                float f3 = Math.abs((f2 - this.F));
                if (f1 - (float)this.E > 0 && f1 - f3 > 0) {
                   this.z = true;
                   this.G(true);
                   VerticalViewPager tI = this.I;
                   f1 = ((f - tI) > 0)? tI + (float)this.E: tI - (float)this.E;
                   this.G = f1;
                   this.F = f2;
                   this.setScrollState(true);
                   this.setScrollingCacheEnabled(true);
                   ViewParent parent = this.getParent();
                   if (parent != null) {
                      parent.requestDisallowInterceptTouchEvent(true);
                   }
                }
             }
             if (this.z != null) {
                b = b | this.B(this.n(p0, q.a(p0, this.J)));
             }
          }else if(this.z != null){
             tf = this.K;
             tf.computeCurrentVelocity(1000, (float)this.M);
             int i2 = (int)h0.b(tf, this.J);
             this.x = true;
             VerticalViewPager$e uoe = this.p();
             this.M(this.g(uoe.b, ((((float)this.getScrollY() / (float)this.getClientHeight()) - uoe.e) / uoe.d), i2, (int)(this.n(p0, q.a(p0, this.J)) - this.I)), true, true, i2, true);
             this.J = i1;
             this.i();
             b = this.R.h() | this.S.h();
          }
          this.U0 = System.currentTimeMillis();
       }else {
          this.k.abortAnimation();
          this.x = b;
          this.C();
          f2 = p0.getX();
          this.H = f2;
          this.F = f2;
          f2 = p0.getY();
          this.I = f2;
          this.G = f2;
          this.J = q.e(p0, b);
       }
       if (b) {
          i0.j0(this);
       }
       return true;
    }
    public final VerticalViewPager$e p(){
       VerticalViewPager$e uoe1;
       int clientHeight = this.getClientHeight();
       float f = 0;
       float f1 = (clientHeight > 0)? (float)this.getScrollY() / (float)clientHeight: 0;
       float f2 = (clientHeight > 0)? (float)this.n / (float)clientHeight: 0;
       VerticalViewPager$e uoe = null;
       float f3 = 0;
       int i = -1;
       int i1 = 0;
       int i2 = 1;
       while (true) {
          if (i1 >= this.c.size()) {
             return uoe;
          }
          uoe1 = this.c.get(i1);
          if (!i2) {
             i = i + 1;
             if (uoe1.b != i) {
                uoe1 = this.d;
                f = f + f3;
                f = f + f2;
                uoe1.e = f;
                uoe1.b = i;
                uoe1.d = this.f.m(i);
                i1 = i1 - 1;
             }
          }
          f = uoe1.e;
          f3 = uoe1.d + f;
          f3 = f3 + f2;
          if (i2 || f1 - f >= 0) {
             if (f1 - f3 >= 0) {
                clientHeight = this.c.size() - 1;
                if (i1 != clientHeight) {
                   i = uoe1.b;
                   f3 = uoe1.d;
                   i1 = i1 + 1;
                   uoe = uoe1;
                   i2 = 0;
                }
             }
             break ;
          }else {
             return uoe;
          }
       }
       return uoe1;
    }
    public VerticalViewPager$e q(int p0){
       VerticalViewPager$e uoe;
       int i = 0;
       while (true) {
          if (i >= this.c.size()) {
             return null;
          }
          uoe = this.c.get(i);
          if (uoe.b == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return uoe;
    }
    public void r(){
       this.setWillNotDraw(false);
       this.setDescendantFocusability(0x40000);
       this.setFocusable(true);
       Context context = this.getContext();
       this.k = new Scroller(context, this.getInterpolator());
       ViewConfiguration viewConfigur = ViewConfiguration.get(context);
       DisplayMetrics density = c.c(context.getResources()).density;
       this.E = j0.d(viewConfigur);
       this.L = (int)(400.00f * density);
       this.M = viewConfigur.getScaledMaximumFlingVelocity();
       this.R = new c(context);
       this.S = new c(context);
       this.N = (int)(25.00f * density);
       this.O = (int)(2.00f * density);
       this.C = (int)(density * 16.00f);
       i0.s0(this, new VerticalViewPager$f(this));
       if (!i0.z(this)) {
          i0.D0(this, true);
       }
       return;
    }
    public void removeView(View p0){
       if (this.v != null) {
          this.removeViewInLayout(p0);
       }else {
          super.removeView(p0);
       }
       return;
    }
    public boolean s(int p0){
       boolean b = false;
       if (this.f == null) {
          return b;
       }
       int clientHeight = this.getClientHeight();
       int scrollY = this.getScrollY();
       if (p0 < 0) {
          if (scrollY > (int)((float)clientHeight * this.r)) {
             b = true;
          }
          return b;
       }else if(p0 > 0 && scrollY < (int)((float)clientHeight * this.s)){
          b = true;
       }
       return b;
    }
    public void setAdapter(a p0){
       VerticalViewPager tf = this.f;
       int i = 1;
       if (tf != null) {
          tf.y(this.l);
          this.f.x(this);
          for (int i1 = 0; i1 < this.c.size(); i1 = i1 + 1) {
             VerticalViewPager$e uoe = this.c.get(i1);
             this.f.h(this, uoe.b, uoe.a);
          }
          this.f.i(this);
          this.c.clear();
          i1 = 0;
          while (i1 < this.getChildCount()) {
             if (this.getChildAt(i1).getLayoutParams().a == null) {
                this.removeViewAt(i1);
                i1 = i1 - 1;
             }
             i1 = i1 + i;
          }
          this.g = 0;
          this.scrollTo(0, 0);
       }
       tf = this.f;
       this.f = p0;
       this.b = 0;
       if (p0 != null) {
          if (this.l == null) {
             this.l = new VerticalViewPager$h(this);
          }
          this.f.r(this.l);
          this.x = false;
          VerticalViewPager tT = this.T;
          this.T = i;
          this.b = this.f.j();
          if (this.h >= null) {
             this.f.s(this.i, this.j);
             this.K(this.h, 0, i);
             this.h = -1;
             Parcelable parcelable = null;
             this.i = parcelable;
             this.j = parcelable;
          }else if(tT == null){
             this.C();
          }else {
             this.requestLayout();
          }
       }
       VerticalViewPager tY0 = this.Y0;
       if (tY0 != null && tf != p0) {
          tY0.a(tf, p0);
       }
       return;
    }
    public void setChildrenDrawingOrderEnabledCompat(boolean p0){
       int i = 1;
       if (this.a1 == null) {
          try{
             Class[] uClassArray = new Class[i];
             uClassArray[0] = Boolean.TYPE;
             this.a1 = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", uClassArray);
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
       try{
          Object[] objArray = new Object[i];
          objArray[0] = Boolean.valueOf(p0);
          this.a1.invoke(this, objArray);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void setCurrentItem(int p0){
       this.x = false;
       this.K(p0, (this.T ^ 0x01), false);
    }
    public void setEnableCorrectOffset(boolean p0){
       this.f1 = p0;
    }
    public void setOffscreenPageLimit(int p0){
       if (p0 < 1) {
          p0 = 1;
       }
       if (p0 != this.y) {
          this.y = p0;
          this.C();
       }
       return;
    }
    public void setOnAdapterChangeListener(VerticalViewPager$g p0){
       this.Y0 = p0;
    }
    public void setPageMargin(int p0){
       VerticalViewPager tn = this.n;
       this.n = p0;
       this.E(this.getHeight(), this.getHeight(), p0, tn);
       this.requestLayout();
    }
    public void setPageMarginDrawable(int p0){
       this.setPageMarginDrawable(this.getContext().getResources().getDrawable(p0));
    }
    public void setPageMarginDrawable(Drawable p0){
       this.o = p0;
       if (p0 != null) {
          this.refreshDrawableState();
       }
       boolean b = (p0 == null)? true: false;
       this.setWillNotDraw(b);
       this.invalidate();
       return;
    }
    public void setScrollState(int p0){
       VerticalViewPager verticalView;
       int childCount;
       if (this.e1 == p0) {
          return;
       }
       this.e1 = p0;
       int i = 0;
       if (this.Z0 != null) {
          verticalView = (p0)? 1: null;
          childCount = this.getChildCount();
          for (int i1 = 0; i1 < childCount; i1 = i1 + 1) {
             int i2 = (verticalView)? 2: 0;
             i0.G0(this.getChildAt(i1), i2, null);
          }
       }
       verticalView = this.W0;
       if (verticalView != null) {
          ViewPager$i[] oiArray = new ViewPager$i[i];
          ViewPager$i[] oiArray1 = verticalView.toArray(oiArray);
          childCount = oiArray1.length;
          while (i < childCount) {
             object oobject = oiArray1[i];
             if (oobject != null) {
                oobject.onPageScrollStateChanged(p0);
             }
             i = i + 1;
          }
       }
       verticalView = this.X0;
       if (verticalView != null) {
          verticalView.onPageScrollStateChanged(p0);
       }
       return;
    }
    public final void setScrollingCacheEnabled(boolean p0){
       if (this.w != p0) {
          this.w = p0;
       }
       return;
    }
    public void setTargetItemPosition(int p0){
       this.V0 = p0;
    }
    public void t(View p0,int p1,int p2){
       p0.layout(p1, p2, (p0.getMeasuredWidth() + p1), (p0.getMeasuredHeight() + p2));
    }
    public void u(View p0,int p1,int p2){
       p0.measure(p1, p2);
    }
    public void v(int p0,float p1,int p2){
       int scrollY;
       int paddingTop;
       int paddingBotto;
       int i = 0;
       if (this.W > null) {
          scrollY = this.getScrollY();
          paddingTop = this.getPaddingTop();
          paddingBotto = this.getPaddingBottom();
          int height = this.getHeight();
          int childCount = this.getChildCount();
          int i1 = 0;
          while (i1 < childCount) {
             View childAt = this.getChildAt(i1);
             VerticalViewPager$LayoutParams layoutParams = childAt.getLayoutParams();
             if (layoutParams.a != null) {
                int i2 = layoutParams.b & 0x70;
                if (i2 != 16) {
                   if (i2 != 48) {
                      if (i2 != 80) {
                         i2 = paddingTop;
                      }else {
                         i2 = height - paddingBotto;
                         i2 = i2 - childAt.getMeasuredHeight();
                         paddingBotto = paddingBotto + childAt.getMeasuredHeight();
                      label_005c :
                         i2 = paddingTop;
                         paddingTop = i2;
                      }
                   }else {
                      i2 = childAt.getHeight() + paddingTop;
                   }
                }else {
                   i2 = height - childAt.getMeasuredHeight();
                   i2 = i2 / 2;
                   i2 = Math.max(i2, paddingTop);
                   goto label_005c ;
                }
                paddingTop = paddingTop + scrollY;
                paddingTop = paddingTop - childAt.getTop();
                if (paddingTop) {
                   childAt.offsetTopAndBottom(paddingTop);
                }
                paddingTop = i2;
             }
             i1 = i1 + 1;
          }
       }
       VerticalViewPager tW0 = this.W0;
       if (tW0 != null) {
          ViewPager$i[] oiArray = new ViewPager$i[i];
          ViewPager$i[] oiArray1 = tW0.toArray(oiArray);
          paddingTop = oiArray1.length;
          paddingBotto = 0;
          while (paddingBotto < paddingTop) {
             object oobject = oiArray1[paddingBotto];
             if (oobject != null) {
                oobject.onPageScrolled(p0, p1, p2);
             }
             paddingBotto = paddingBotto + 1;
          }
       }
       tW0 = this.X0;
       if (tW0 != null) {
          tW0.onPageScrolled(p0, p1, p2);
       }
       if (this.Z0 != null) {
          p0 = this.getScrollY();
          int childCount1 = this.getChildCount();
          while (i < childCount1) {
             View childAt1 = this.getChildAt(i);
             if (childAt1.getLayoutParams().a == null) {
                scrollY = childAt1.getTop() - p0;
                float f = (float)scrollY / (float)this.getClientHeight();
                this.Z0.a(childAt1, f);
             }
             i = i + 1;
          }
       }
       this.V = true;
       return;
    }
    public boolean verifyDrawable(Drawable p0){
       boolean b = (super.verifyDrawable(p0) || p0 == this.o)? true: false;
       return b;
    }
    public void w(){
    }
    public final void x(MotionEvent p0){
       int i = q.b(p0);
       if (q.e(p0, i) == this.J) {
          i = (!i)? 1: 0;
          this.G = this.n(p0, i);
          this.J = q.e(p0, i);
          VerticalViewPager tK = this.K;
          if (tK != null) {
             tK.clear();
          }
       }
       return;
    }
    public boolean y(){
       VerticalViewPager tf = this.f;
       if (tf == null || this.g >= (tf.j() - 1)) {
          return false;
       }
       this.I((this.g + 1), 1);
       return 1;
    }
    public final boolean z(int p0){
       if (!this.c.size()) {
          this.V = false;
          this.v(false, 0, false);
          if (this.V != null) {
             return false;
          }
          throw new IllegalStateException("onPageScrolled did not call superclass implementation");
       }else {
          VerticalViewPager$e uoe = this.p();
          int clientHeight = this.getClientHeight();
          VerticalViewPager tn = this.n;
          int i = clientHeight + tn;
          float f = (float)clientHeight;
          float f1 = (float)tn / f;
          float f2 = (float)p0 / f;
          f2 = (f2 - uoe.e) / (uoe.d + f1);
          this.V = false;
          this.v(uoe.b, f2, (int)((float)i * f2));
          if (this.V != null) {
             return true;
          }
          throw new IllegalStateException("onPageScrolled did not call superclass implementation");
       }
    }
}
