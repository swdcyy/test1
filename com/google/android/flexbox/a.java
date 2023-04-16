package com.google.android.flexbox.a;
import qj.a;
import java.lang.Object;
import com.google.android.flexbox.FlexItem;
import android.view.View$MeasureSpec;
import android.view.View;
import qj.b;
import android.util.SparseIntArray;
import android.view.ViewGroup$LayoutParams;
import java.lang.Math;
import android.view.ViewGroup$MarginLayoutParams;
import a2.o;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import com.google.android.flexbox.a$c;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Integer;
import com.google.android.flexbox.a$b;
import java.util.ArrayList;
import android.widget.CompoundButton;
import java.util.Arrays;
import com.google.android.flexbox.a$a;
import android.graphics.drawable.Drawable;
import e2.b;

public class a	// class@00160a
{
    public final a a;
    public boolean[] b;
    public int[] c;
    public long[] d;
    public long[] e;
    public static final boolean f;

    public void a(a p0){
       super();
       this.a = p0;
    }
    public final int A(int p0,FlexItem p1,int p2){
       a ta = this.a;
       p0 = ta.F(p0, ((((ta.getPaddingLeft() + this.a.getPaddingRight()) + p1.Y1()) + p1.l2()) + p2), p1.getWidth());
       p2 = View$MeasureSpec.getSize(p0);
       if (p2 > p1.g0()) {
          p0 = View$MeasureSpec.makeMeasureSpec(p1.g0(), View$MeasureSpec.getMode(p0));
       }else if(p2 < p1.s()){
          p0 = View$MeasureSpec.makeMeasureSpec(p1.s(), View$MeasureSpec.getMode(p0));
       }
       return p0;
    }
    public final int B(FlexItem p0,boolean p1){
       if (p1) {
          return p0.X0();
       }
       return p0.l2();
    }
    public final int C(FlexItem p0,boolean p1){
       if (p1) {
          return p0.l2();
       }
       return p0.X0();
    }
    public final int D(FlexItem p0,boolean p1){
       if (p1) {
          return p0.w0();
       }
       return p0.Y1();
    }
    public final int E(FlexItem p0,boolean p1){
       if (p1) {
          return p0.Y1();
       }
       return p0.w0();
    }
    public final int F(FlexItem p0,boolean p1){
       if (p1) {
          return p0.getHeight();
       }
       return p0.getWidth();
    }
    public final int G(FlexItem p0,boolean p1){
       if (p1) {
          return p0.getWidth();
       }
       return p0.getHeight();
    }
    public final int H(boolean p0){
       if (p0) {
          return this.a.getPaddingBottom();
       }
       return this.a.getPaddingEnd();
    }
    public final int I(boolean p0){
       if (p0) {
          return this.a.getPaddingEnd();
       }
       return this.a.getPaddingBottom();
    }
    public final int J(boolean p0){
       if (p0) {
          return this.a.getPaddingTop();
       }
       return this.a.getPaddingStart();
    }
    public final int K(boolean p0){
       if (p0) {
          return this.a.getPaddingStart();
       }
       return this.a.getPaddingTop();
    }
    public final int L(View p0,boolean p1){
       if (p1) {
          return p0.getMeasuredHeight();
       }
       return p0.getMeasuredWidth();
    }
    public final int M(View p0,boolean p1){
       if (p1) {
          return p0.getMeasuredWidth();
       }
       return p0.getMeasuredHeight();
    }
    public final boolean N(int p0,int p1,b p2){
       int i = 1;
       if (p0 != (p1 - i) || !p2.c()) {
          i = false;
       }
       return i;
    }
    public boolean O(SparseIntArray p0){
       int flexItemCoun = this.a.getFlexItemCount();
       if (p0.size() != flexItemCoun) {
          return true;
       }
       int i = 0;
       while (true) {
          if (i >= flexItemCoun) {
             return false;
          }
          View view = this.a.A(i);
          if (view != null && view.getLayoutParams().getOrder() != p0.get(i)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public final boolean P(View p0,int p1,int p2,int p3,int p4,FlexItem p5,int p6,int p7,int p8){
       boolean b = false;
       if (!this.a.getFlexWrap()) {
          return b;
       }
       if (p5.C3()) {
          return true;
       }
       if (!p1) {
          return b;
       }
       p1 = this.a.getMaxLine();
       if (p1 != -1 && p1 <= (p8 + true)) {
          return b;
       }
       int i = this.a.p(p0, p6, p7);
       if (i > 0) {
          p4 = p4 + i;
       }
       if (p2 < (p3 + p4)) {
          b = true;
       }
       return b;
    }
    public void Q(View p0,b p1,int p2,int p3,int p4,int p5){
       int i;
       FlexItem layoutParams = p0.getLayoutParams();
       int alignItems = this.a.getAlignItems();
       if (layoutParams.n3() != -1) {
          alignItems = layoutParams.n3();
       }
       b g = p1.g;
       if (alignItems) {
          if (alignItems != 1) {
             if (alignItems != 2) {
                if (alignItems != 3) {
                   if (alignItems == 4) {
                   label_00c5 :
                      if (this.a.getFlexWrap() != 2) {
                         p0.layout(p2, (p3 + layoutParams.w0()), p4, (p5 + layoutParams.w0()));
                      }else {
                         p0.layout(p2, (p3 - layoutParams.X0()), p4, (p5 - layoutParams.X0()));
                      }
                   }
                }else if(this.a.getFlexWrap() != 2){
                   i = Math.max((p1.l - p0.getBaseline()), layoutParams.w0());
                   p0.layout(p2, (p3 + i), p4, (p5 + i));
                }else {
                   i = Math.max(((p1.l - p0.getMeasuredHeight()) + p0.getBaseline()), layoutParams.X0());
                   p0.layout(p2, (p3 - i), p4, (p5 - i));
                }
             }else {
                int i1 = (((g - p0.getMeasuredHeight()) + layoutParams.w0()) - layoutParams.X0()) / 2;
                if (this.a.getFlexWrap() != 2) {
                   p3 = p3 + i1;
                   p0.layout(p2, p3, p4, (p0.getMeasuredHeight() + p3));
                }else {
                   p3 = p3 - i1;
                   p0.layout(p2, p3, p4, (p0.getMeasuredHeight() + p3));
                }
             }
          }else if(this.a.getFlexWrap() != 2){
             p3 = p3 + g;
             p0.layout(p2, ((p3 - p0.getMeasuredHeight()) - layoutParams.X0()), p4, (p3 - layoutParams.X0()));
          }else {
             p0.layout(p2, (((p3 - g) + p0.getMeasuredHeight()) + layoutParams.w0()), p4, (((p5 - g) + p0.getMeasuredHeight()) + layoutParams.w0()));
          }
       }else {
          goto label_00c5 ;
       }
       return;
    }
    public void R(View p0,b p1,boolean p2,int p3,int p4,int p5,int p6){
       FlexItem layoutParams = p0.getLayoutParams();
       int alignItems = this.a.getAlignItems();
       if (layoutParams.n3() != -1) {
          alignItems = layoutParams.n3();
       }
       p1 = p1.g;
       if (alignItems) {
          if (alignItems != 1) {
             if (alignItems != 2) {
                if (alignItems == 3 || alignItems == 4) {
                label_0083 :
                   if (!p2) {
                      p0.layout((p3 + layoutParams.Y1()), p4, (p5 + layoutParams.Y1()), p6);
                   }else {
                      p0.layout((p3 - layoutParams.l2()), p4, (p5 - layoutParams.l2()), p6);
                   }
                }
             }else {
                ViewGroup$MarginLayoutParams layoutParams1 = p0.getLayoutParams();
                int i = (((p1 - p0.getMeasuredWidth()) + o.b(layoutParams1)) - o.a(layoutParams1)) / 2;
                if (!p2) {
                   p0.layout((p3 + i), p4, (p5 + i), p6);
                }else {
                   p0.layout((p3 - i), p4, (p5 - i), p6);
                }
             }
          }else if(!p2){
             p0.layout((((p3 + p1) - p0.getMeasuredWidth()) - layoutParams.l2()), p4, (((p5 + p1) - p0.getMeasuredWidth()) - layoutParams.l2()), p6);
          }else {
             p0.layout((((p3 - p1) + p0.getMeasuredWidth()) + layoutParams.Y1()), p4, (((p5 - p1) + p0.getMeasuredWidth()) + layoutParams.Y1()), p6);
          }
       }else {
          goto label_0083 ;
       }
       return;
    }
    public long S(int p0,int p1){
       return (((long)p0 & 0xffffffff) | ((long)p1 << 32));
    }
    public final void T(int p0,int p1,b p2,int p3,int p4,boolean p5){
       int i4;
       int measuredWidt;
       a uoa = this;
       b uob = p2;
       int i = p3;
       b e = uob.e;
       b k = uob.k;
       b uob1 = null;
       if (k - uob1 > 0 && i <= e) {
          float f = (float)(e - i) / k;
          uob.e = p4 + uob.f;
          if (!p5) {
             uob.g = Integer.MIN_VALUE;
          }
          int i1 = 0;
          float f1 = 0;
          int i2 = 0;
          float f2 = 0;
          while (i1 < uob.h) {
             int i3 = uob.o + i1;
             View view = uoa.a.D(i3);
             if (view == null || view.getVisibility() == 8) {
                uob1 = e;
                i4 = i1;
             }else {
                FlexItem layoutParams = view.getLayoutParams();
                int flexDirectio = uoa.a.getFlexDirection();
                int i5 = 0x3f800000;
                i4 = 1;
                if (!flexDirectio || flexDirectio == i4) {
                   uob1 = e;
                   i4 = i1;
                   measuredWidt = view.getMeasuredWidth();
                   a e1 = uoa.e;
                   if (e1 != null) {
                      measuredWidt = uoa.y(e1[i3]);
                   }
                   i1 = view.getMeasuredHeight();
                   e1 = uoa.e;
                   int i6 = i4;
                   if (e1 != null) {
                      i1 = uoa.x(e1[i3]);
                   }
                   if (!uoa.b[i3] && layoutParams.n1() > 0) {
                      float f3 = layoutParams.n1() * f;
                      float f4 = (float)measuredWidt - f3;
                      flexDirectio = 1;
                      i1 = uob.h - flexDirectio;
                      i4 = i6;
                      if (i4 == i1) {
                         f4 = f4 + f2;
                         f2 = 0;
                      }
                      i1 = Math.round(f4);
                      if (i1 < layoutParams.s()) {
                         i1 = layoutParams.s();
                         uoa.b[i3] = flexDirectio;
                         f4 = uob.k - layoutParams.n1();
                         uob.k = f4;
                         f1 = Float.MIN_VALUE;
                      }else {
                         f4 = f4 - (float)i1;
                         f2 = f2 + f4;
                         double d = (double)f2;
                         if (d - 0x3ff0000000000000 > 0) {
                            i1 = i1 + 1;
                            f2 = f2 - i5;
                         }else if(d - 0xbff0000000000000 < 0){
                            i1 = i1 - 1;
                            f2 = f2 + i5;
                         }
                      }
                      measuredWidt = uoa.z(p1, layoutParams, uob.m);
                      i1 = View$MeasureSpec.makeMeasureSpec(i1, 0x40000000);
                      view.measure(i1, measuredWidt);
                      uoa.Z(i3, i1, measuredWidt, view);
                      uoa.a.I(i3, view);
                      measuredWidt = view.getMeasuredWidth();
                      i1 = view.getMeasuredHeight();
                   }else {
                      i4 = i6;
                   }
                   i1 = i1 + layoutParams.w0();
                   i1 = i1 + layoutParams.X0();
                   i1 = i1 + uoa.a.l(view);
                   measuredWidt = measuredWidt + layoutParams.Y1();
                   measuredWidt = measuredWidt + layoutParams.l2();
                   i2 = uob.e + measuredWidt;
                   uob.e = i2;
                   measuredWidt = Math.max(i2, i1);
                }else {
                   flexDirectio = view.getMeasuredHeight();
                   a e2 = uoa.e;
                   if (e2 != null) {
                      flexDirectio = uoa.x(e2[i3]);
                   }
                   int measuredWidt1 = view.getMeasuredWidth();
                   a e3 = uoa.e;
                   if (e3 != null) {
                      measuredWidt1 = uoa.y(e3[i3]);
                   }
                   if (!uoa.b[i3] && layoutParams.n1() - uob1 > 0) {
                      float f5 = layoutParams.n1() * f;
                      float f6 = (float)flexDirectio - f5;
                      i4 = 1;
                      measuredWidt1 = uob.h - i4;
                      if (i1 == measuredWidt1) {
                         f6 = f6 + f2;
                         f2 = 0;
                      }
                      measuredWidt1 = Math.round(f6);
                      if (measuredWidt1 < layoutParams.p()) {
                         measuredWidt1 = layoutParams.p();
                         uoa.b[i3] = i4;
                         float f7 = uob.k - layoutParams.n1();
                         uob.k = f7;
                         uob1 = e;
                         i4 = i1;
                         f1 = Float.MIN_VALUE;
                      }else {
                         f6 = f6 - (float)measuredWidt1;
                         f2 = f2 + f6;
                         uob1 = e;
                         i4 = i1;
                         double d1 = (double)f2;
                         if (d1 - 0x3ff0000000000000 > 0) {
                            measuredWidt1 = measuredWidt1 + 1;
                            f2 = f2 - i5;
                         }else if(d1 - 0xbff0000000000000 < 0){
                            measuredWidt1 = measuredWidt1 - 1;
                            f2 = f2 + i5;
                         }
                      }
                      measuredWidt = uoa.A(p0, layoutParams, uob.m);
                      flexDirectio = View$MeasureSpec.makeMeasureSpec(measuredWidt1, 0x40000000);
                      view.measure(measuredWidt, flexDirectio);
                      measuredWidt1 = view.getMeasuredWidth();
                      uoa.Z(i3, measuredWidt, flexDirectio, view);
                      uoa.a.I(i3, view);
                      flexDirectio = view.getMeasuredHeight();
                   }else {
                      uob1 = e;
                      i4 = i1;
                      i1 = p0;
                   }
                   measuredWidt1 = measuredWidt1 + layoutParams.Y1();
                   measuredWidt1 = measuredWidt1 + layoutParams.l2();
                   measuredWidt1 = measuredWidt1 + uoa.a.l(view);
                   measuredWidt = Math.max(i2, measuredWidt1);
                   flexDirectio = flexDirectio + layoutParams.w0();
                   flexDirectio = flexDirectio + layoutParams.X0();
                   i2 = uob.e + flexDirectio;
                   uob.e = i2;
                   flexDirectio = p1;
                }
                uob.g = Math.max(uob.g, measuredWidt);
                i2 = measuredWidt;
             }
             i1 = i4 + 1;
             e = uob1;
             uob1 = null;
          }
          uob1 = e;
          if (f1 && uob1 != uob.e) {
             this.T(p0, p1, p2, p3, p4, true);
          }
       }
    label_020b :
       return;
    }
    public final int[] U(int p0,List p1,SparseIntArray p2){
       Collections.sort(p1);
       p2.clear();
       int[] ointArray = new int[p0];
       Iterator iterator = p1.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          a$c uoc = iterator.next();
          a$c b = uoc.b;
          ointArray[i] = b;
          p2.append(b, uoc.c);
          i = i + 1;
       }
       return ointArray;
    }
    public final void V(View p0,int p1,int p2){
       FlexItem layoutParams = p0.getLayoutParams();
       p1 = Math.min(Math.max((((p1 - layoutParams.Y1()) - layoutParams.l2()) - this.a.l(p0)), layoutParams.s()), layoutParams.g0());
       a te = this.e;
       int i = (te != null)? this.x(te[p2]): p0.getMeasuredHeight();
       i = View$MeasureSpec.makeMeasureSpec(i, 0x40000000);
       p1 = View$MeasureSpec.makeMeasureSpec(p1, 0x40000000);
       p0.measure(p1, i);
       this.Z(p2, p1, i, p0);
       this.a.I(p2, p0);
       return;
    }
    public final void W(View p0,int p1,int p2){
       FlexItem layoutParams = p0.getLayoutParams();
       p1 = Math.min(Math.max((((p1 - layoutParams.w0()) - layoutParams.X0()) - this.a.l(p0)), layoutParams.p()), layoutParams.v());
       a te = this.e;
       int i = (te != null)? this.y(te[p2]): p0.getMeasuredWidth();
       i = View$MeasureSpec.makeMeasureSpec(i, 0x40000000);
       p1 = View$MeasureSpec.makeMeasureSpec(p1, 0x40000000);
       p0.measure(i, p1);
       this.Z(p2, i, p1, p0);
       this.a.I(p2, p0);
       return;
    }
    public void X(){
       this.Y(0);
    }
    public void Y(int p0){
       int i1;
       a uoa = this;
       int i = p0;
       if (i >= uoa.a.getFlexItemCount()) {
          return;
       }
       int flexDirectio = uoa.a.getFlexDirection();
       a uoa1 = 4;
       if (uoa.a.getAlignItems() == uoa1) {
          a c = uoa.c;
          i = (c != null)? c[i]: 0;
          List flexLinesInt = uoa.a.getFlexLinesInternal();
          i1 = flexLinesInt.size();
          while (i < i1) {
             b uob = flexLinesInt.get(i);
             b h = uob.h;
             int i2 = 0;
             while (true) {
                if (i2 < h) {
                   int i3 = uob.o + i2;
                   if (i2 < uoa.a.getFlexItemCount()) {
                      View view = uoa.a.D(i3);
                      if (view != null && view.getVisibility() != 8) {
                         FlexItem layoutParams = view.getLayoutParams();
                         if (layoutParams.n3() == -1 || layoutParams.n3() == uoa1) {
                            if (flexDirectio && flexDirectio != 1) {
                               if (flexDirectio == 2 || flexDirectio == 3) {
                                  uoa.V(view, uob.g, i3);
                               }else {
                                  throw new IllegalArgumentException("Invalid flex direction: "+flexDirectio);
                               }
                            }else {
                               uoa.W(view, uob.g, i3);
                            }
                         }
                      }
                   }
                   i2 = i2 + 1;
                }else {
                   i = i + 1;
                }
             }
          }
       }else {
          Iterator iterator = uoa.a.getFlexLinesInternal().iterator();
          while (iterator.hasNext()) {
             b uob1 = iterator.next();
             Iterator iterator1 = uob1.n.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   Integer integer = iterator1.next();
                   View view1 = uoa.a.D(integer.intValue());
                   if (flexDirectio && flexDirectio != 1) {
                      i1 = 3;
                      if (flexDirectio == 2 || flexDirectio == i1) {
                         uoa.V(view1, uob1.g, integer.intValue());
                      }else {
                         throw new IllegalArgumentException("Invalid flex direction: "+flexDirectio);
                      }
                   }else {
                      uoa.W(view1, uob1.g, integer.intValue());
                   }
                }else {
                   continue ;
                }
             }
          }
       }
       return;
    }
    public final void Z(int p0,int p1,int p2,View p3){
       a td = this.d;
       if (td != null) {
          td[p0] = this.S(p1, p2);
       }
       a te = this.e;
       if (te != null) {
          te[p0] = this.S(p3.getMeasuredWidth(), p3.getMeasuredHeight());
       }
       return;
    }
    public final void a(List p0,b p1,int p2,int p3){
       p1.m = p3;
       this.a.j(p1);
       p1.p = p2;
       p0.add(p1);
    }
    public void b(a$b p0,int p1,int p2,int p3,int p4,int p5,List p6){
       int i13;
       int i14;
       int i15;
       int i17;
       a a;
       View view2;
       a uoa = this;
       int i = p0;
       int i1 = p1;
       int i2 = p2;
       boolean i3 = p5;
       boolean b = uoa.a.M();
       int mode = View$MeasureSpec.getMode(p1);
       int size = View$MeasureSpec.getSize(p1);
       ArrayList uArrayList = (p6 == null)? new ArrayList(): p6;
       i.a = uArrayList;
       int i4 = (i3 == -1)? 1: 0;
       int i5 = uoa.J(b);
       int i6 = uoa.H(b);
       b uob = new b();
       int i7 = p4;
       uob.o = i7;
       int i8 = uoa.I(b) + uoa.K(b);
       uob.e = i8;
       int flexItemCoun = uoa.a.getFlexItemCount();
       int i9 = i4;
       i4 = 0;
       int i10 = 0;
       int i11 = 0;
       int i12 = Integer.MIN_VALUE;
       while (true) {
          if (i7 < flexItemCoun) {
             View view = uoa.a.D(i7);
             if (view == null) {
                if (uoa.N(i7, flexItemCoun, uob)) {
                   uoa.a(uArrayList, uob, i7, i4);
                }
             }else if(view.getVisibility() == 8){
                i15 = 1;
                i17 = uob.i + i15;
                uob.i = i17;
                i17 = uob.h + i15;
                uob.h = i17;
                if (uoa.N(i7, flexItemCoun, uob)) {
                   uoa.a(uArrayList, uob, i7, i4);
                }
             }else if(view instanceof CompoundButton){
                uoa.v(view);
             }
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             int i18 = flexItemCoun;
             if (layoutParams.n3() == 4) {
                uob.n.add(Integer.valueOf(i7));
             }
             flexItemCoun = uoa.G(layoutParams, b);
             if (layoutParams.y3() - 0xbf800000 && mode == 2.00f) {
                float f = (float)size * layoutParams.y3();
                flexItemCoun = Math.round(f);
             }
             if (b) {
                i13 = i8 + uoa.E(layoutParams, true);
                i3 = i13 + uoa.C(layoutParams, true);
                flexItemCoun = uoa.a.F(i1, i3, flexItemCoun);
                i3 = i5 + i6;
                i13 = size;
                size = true;
                i3 = i3 + uoa.D(layoutParams, size);
                i3 = i3 + uoa.B(layoutParams, size);
                i3 = i3 + i4;
                i14 = mode;
                i17 = uoa.a.B(i2, i3, uoa.F(layoutParams, size));
                view.measure(flexItemCoun, i17);
                uoa.Z(i7, flexItemCoun, i17, view);
                mode = flexItemCoun;
                i3 = 0;
             }else {
                i13 = size;
                i14 = mode;
                mode = i5 + i6;
                i3 = false;
                mode = mode + uoa.D(layoutParams, i3);
                mode = mode + uoa.B(layoutParams, i3);
                mode = mode + i4;
                i17 = uoa.a.F(i2, mode, uoa.F(layoutParams, i3));
                mode = uoa.E(layoutParams, i3) + i8;
                mode = mode + uoa.C(layoutParams, i3);
                flexItemCoun = uoa.a.B(i1, mode, flexItemCoun);
                view.measure(i17, flexItemCoun);
                uoa.Z(i7, i17, flexItemCoun, view);
                mode = flexItemCoun;
             }
             uoa.a.I(i7, view);
             uoa.i(view, i7);
             i10 = View.combineMeasuredStates(i10, view.getMeasuredState());
             flexItemCoun = uoa.M(view, b) + uoa.E(layoutParams, b);
             size = uoa.C(layoutParams, b) + flexItemCoun;
             i1 = i4;
             b uob1 = uob;
             int i19 = i8;
             i15 = size;
             size = i7;
             View view1 = view;
             ArrayList uArrayList1 = uArrayList;
             int i16 = size;
             i2 = size;
             int i20 = mode;
             if (this.P(view, i14, i13, uob.e, i15, layoutParams, i16, i11, uArrayList.size())) {
                if (uob1.c() > 0) {
                   if (i2 > 0) {
                      i15 = i2 - 1;
                      uob = uob1;
                   }else {
                      uob = uob1;
                      i15 = 0;
                   }
                   uoa.a(uArrayList1, uob, i15, i1);
                   i4 = uob.g + i1;
                }else {
                   i4 = i1;
                }
                if (b) {
                   if (layoutParams.getHeight() == -1) {
                      a = uoa.a;
                      i8 = a.getPaddingTop() + uoa.a.getPaddingBottom();
                      i8 = i8 + layoutParams.w0();
                      i8 = i8 + layoutParams.X0();
                      i8 = i8 + i4;
                      i15 = p2;
                      i7 = i2;
                      flexItemCoun = a.B(i15, i8, layoutParams.getHeight());
                      view2 = view1;
                      view2.measure(i20, flexItemCoun);
                      uoa.i(view2, i7);
                   }else {
                      i15 = p2;
                      view2 = view1;
                      i7 = i2;
                   }
                }else {
                   i15 = p2;
                   view2 = view1;
                   i7 = i2;
                   int i21 = i20;
                   if (layoutParams.getWidth() == -1) {
                      a = uoa.a;
                      i17 = a.getPaddingLeft() + uoa.a.getPaddingRight();
                      i17 = i17 + layoutParams.Y1();
                      i17 = i17 + layoutParams.l2();
                      i17 = i17 + i4;
                      view2.measure(a.F(i15, i17, layoutParams.getWidth()), i21);
                      uoa.i(view2, i7);
                   }
                }
                uob = new b();
                uob.h = 1;
                i16 = i19;
                uob.e = i16;
                uob.o = i7;
                flexItemCoun = 0;
                i17 = Integer.MIN_VALUE;
             }else {
                i15 = p2;
                view2 = view1;
                i7 = i2;
                uob = uob1;
                i16 = i19;
                i4 = uob.h + 1;
                uob.h = i4;
                i4 = i11 + 1;
                flexItemCoun = i4;
                i4 = i1;
                i17 = i12;
             }
             b q = uob.q;
             i1 = 0;
             mode = (layoutParams.y1() - i1)? 1: 0;
             size = q | mode;
             uob.q = size;
             q = uob.r;
             mode = (layoutParams.n1() - i1)? 1: 0;
             size = q | mode;
             uob.r = size;
             a c = uoa.c;
             if (c != null) {
                c[i7] = uArrayList1.size();
             }
             mode = uoa.M(view2, b) + uoa.E(layoutParams, b);
             mode = mode + uoa.C(layoutParams, b);
             size = uob.e + mode;
             uob.e = size;
             float f1 = uob.j + layoutParams.y1();
             uob.j = f1;
             f1 = uob.k + layoutParams.n1();
             uob.k = f1;
             uoa.a.o(view2, i7, flexItemCoun, uob);
             size = uoa.L(view2, b) + uoa.D(layoutParams, b);
             size = size + uoa.B(layoutParams, b);
             size = size + uoa.a.l(view2);
             i17 = Math.max(i17, size);
             uob.g = Math.max(uob.g, i17);
             if (b) {
                if (uoa.a.getFlexWrap() != 2) {
                   i8 = view2.getBaseline() + layoutParams.w0();
                   uob.l = Math.max(uob.l, i8);
                }else {
                   mode = view2.getMeasuredHeight() - view2.getBaseline();
                   mode = mode + layoutParams.X0();
                   uob.l = Math.max(uob.l, mode);
                }
             }
             i8 = i18;
             if (uoa.N(i7, i8, uob)) {
                uoa.a(uArrayList1, uob, i7, i4);
                i4 = i4 + uob.g;
             }
             size = p5;
             if (size != -1 && uArrayList1.size() > 0) {
                i = uArrayList1.size() - 1;
                if (uArrayList1.get(i).p >= size && (i7 >= size && !i9)) {
                   i4 = - uob.a();
                   i = p3;
                   i9 = 1;
                label_032e :
                   if (i4 > i && i9) {
                      i4 = p0;
                      i17 = i10;
                      break ;
                   }else {
                      i11 = flexItemCoun;
                      i12 = i17;
                   label_033b :
                      i7 = i7 + 1;
                      i1 = p1;
                      flexItemCoun = i8;
                      i2 = i15;
                      i8 = i16;
                      uArrayList = uArrayList1;
                      mode = i14;
                      i3 = size;
                      size = i13;
                   }
                }
             }else {
                i1 = 1;
             }
             i = p3;
             goto label_032e ;
             i13 = size;
             i14 = mode;
             i15 = i2;
             size = i3;
             uArrayList1 = uArrayList;
             i16 = i8;
             i8 = flexItemCoun;
             goto label_033b ;
          }else {
             i17 = i10;
             i4 = p0;
             break ;
          }
       }
       i4.b = i17;
       return;
    }
    public void c(a$b p0,int p1,int p2){
       this.b(p0, p1, p2, Integer.MAX_VALUE, 0, -1, null);
    }
    public void d(a$b p0,int p1,int p2,int p3,int p4,List p5){
       this.b(p0, p1, p2, p3, p4, -1, p5);
    }
    public void e(a$b p0,int p1,int p2,int p3,int p4,List p5){
       this.b(p0, p1, p2, p3, 0, p4, p5);
    }
    public void f(a$b p0,int p1,int p2){
       this.b(p0, p2, p1, Integer.MAX_VALUE, 0, -1, null);
    }
    public void g(a$b p0,int p1,int p2,int p3,int p4,List p5){
       this.b(p0, p2, p1, p3, p4, -1, p5);
    }
    public void h(a$b p0,int p1,int p2,int p3,int p4,List p5){
       this.b(p0, p2, p1, p3, 0, p4, p5);
    }
    public final void i(View p0,int p1){
       int i1;
       FlexItem layoutParams = p0.getLayoutParams();
       int measuredWidt = p0.getMeasuredWidth();
       int measuredHeig = p0.getMeasuredHeight();
       int i = 1;
       if (measuredWidt < layoutParams.s()) {
          measuredWidt = layoutParams.s();
       }else if(measuredWidt > layoutParams.g0()){
          measuredWidt = layoutParams.g0();
       }else {
          i1 = 0;
       label_0027 :
          if (measuredHeig < layoutParams.p()) {
             measuredHeig = layoutParams.p();
          }else if(measuredHeig > layoutParams.v()){
             measuredHeig = layoutParams.v();
          }else {
             i = i1;
          }
          if (i) {
             measuredWidt = View$MeasureSpec.makeMeasureSpec(measuredWidt, 0x40000000);
             int i2 = View$MeasureSpec.makeMeasureSpec(measuredHeig, 0x40000000);
             p0.measure(measuredWidt, i2);
             this.Z(p1, measuredWidt, i2, p0);
             this.a.I(p1, p0);
          }
          return;
       }
       i1 = 1;
       goto label_0027 ;
    }
    public void j(List p0,int p1){
       int i = this.c[p1];
       int i1 = -1;
       if (i == i1) {
          i = 0;
       }
       for (int i2 = p0.size() - 1; i2 >= i; i2 = i2 - 1) {
          p0.remove(i2);
       }
       a tc = this.c;
       i = tc.length - 1;
       if (p1 > i) {
          Arrays.fill(tc, i1);
       }else {
          Arrays.fill(tc, p1, i, i1);
       }
       tc = this.d;
       i = tc.length - 1;
       if (p1 > i) {
          Arrays.fill(tc, 0);
       }else {
          Arrays.fill(tc, p1, i, 0);
       }
       return;
    }
    public final List k(List p0,int p1,int p2){
       ArrayList uArrayList = new ArrayList();
       b uob = new b();
       uob.g = (p1 - p2) / 2;
       p1 = p0.size();
       int i = 0;
       while (i < p1) {
          if (!i) {
             uArrayList.add(uob);
          }
          uArrayList.add(p0.get(i));
          int i1 = p0.size() - 1;
          if (i == i1) {
             uArrayList.add(uob);
          }
          i = i + 1;
       }
       return uArrayList;
    }
    public final List l(int p0){
       ArrayList uArrayList = new ArrayList(p0);
       for (int i = 0; i < p0; i = i + 1) {
          a$c uoc = new a$c(null);
          uoc.c = this.a.A(i).getLayoutParams().getOrder();
          uoc.b = i;
          uArrayList.add(uoc);
       }
       return uArrayList;
    }
    public int[] m(SparseIntArray p0){
       int flexItemCoun = this.a.getFlexItemCount();
       return this.U(flexItemCoun, this.l(flexItemCoun), p0);
    }
    public int[] n(View p0,int p1,ViewGroup$LayoutParams p2,SparseIntArray p3){
       int flexItemCoun = this.a.getFlexItemCount();
       List list = this.l(flexItemCoun);
       a$c uoc = new a$c(null);
       uoc.c = (p0 != null && p2 instanceof FlexItem)? p2.getOrder(): 1;
       if (p1 == -1 || p1 == flexItemCoun) {
          uoc.b = flexItemCoun;
       }else if(p1 < this.a.getFlexItemCount()){
          uoc.b = p1;
          for (; p1 < flexItemCoun; p1++) {
             a$c uoc1 = list.get(p1);
             int i = uoc1.b + 1;
             uoc1.b = i;
          }
       }else {
          uoc.b = flexItemCoun;
       }
       list.add(uoc);
       return this.U((flexItemCoun + 1), list, p3);
    }
    public void o(int p0,int p1,int p2){
       float f;
       int i2;
       ArrayList uArrayList;
       int flexDirectio = this.a.getFlexDirection();
       int i = 3;
       b uob = 2;
       if (flexDirectio && flexDirectio != 1) {
          if (flexDirectio == uob || flexDirectio == i) {
             p1 = View$MeasureSpec.getMode(p0);
             p0 = View$MeasureSpec.getSize(p0);
          }else {
             throw new IllegalArgumentException("Invalid flex direction: "+flexDirectio);
          }
       }else {
          p1 = View$MeasureSpec.getMode(p1);
          p0 = View$MeasureSpec.getSize(p1);
       }
       List flexLinesInt = this.a.getFlexLinesInternal();
       if (p1 == 0x40000000) {
          p1 = this.a.getSumOfCrossSize() + p2;
          int i1 = 0;
          if (flexLinesInt.size() == 1) {
             p1.g = p0 - p2;
          }else if(flexLinesInt.size() >= uob){
             p2 = this.a.getAlignContent();
             if (p2 != 1) {
                if (p2 != uob) {
                   if (p2 != i) {
                      if (p2 != 4) {
                         if (p2 == 5 && p1 < p0) {
                            f = (float)(p0 - p1) / (float)flexLinesInt.size();
                            p1 = flexLinesInt.size();
                            float f1 = 0;
                            for (; i1 < p1; i1 = i1 + 1) {
                               b uob1 = flexLinesInt.get(i1);
                               float f2 = (float)uob1.g + f;
                               i2 = flexLinesInt.size() - 1;
                               if (i1 == i2) {
                                  f2 = f2 + f1;
                                  f1 = 0;
                               }
                               i2 = Math.round(f2);
                               f2 = f2 - (float)i2;
                               f1 = f1 + f2;
                               if (f1 - 0x3f800000 > 0) {
                                  i2 = i2 + 1;
                                  f1 = f1 - 0x3f800000;
                               }else if(f1 - 0xbf800000 < 0){
                                  i2 = i2 - 1;
                                  f1 = f1 + 0x3f800000;
                               }
                               uob1.g = i2;
                            }
                         }
                      }else if(p1 >= p0){
                         this.a.setFlexLines(this.k(flexLinesInt, p0, p1));
                      }else {
                         uArrayList = new ArrayList();
                         b uob2 = new b();
                         uob2.g = (p0 - p1) / (flexLinesInt.size() * 2);
                         Iterator iterator = flexLinesInt.iterator();
                         while (iterator.hasNext()) {
                            uArrayList.add(uob2);
                            uArrayList.add(iterator.next());
                            uArrayList.add(uob2);
                         }
                         this.a.setFlexLines(uArrayList);
                      }
                   }else if(p1 >= p0){
                      f = (float)(p0 - p1) / (float)(flexLinesInt.size() - 1);
                      uArrayList = new ArrayList();
                      p2 = flexLinesInt.size();
                      float f3 = 0;
                      while (i1 < p2) {
                         uArrayList.add(flexLinesInt.get(i1));
                         i2 = flexLinesInt.size() - 1;
                         if (i1 != i2) {
                            b uob3 = new b();
                            int i3 = flexLinesInt.size() - uob;
                            if (i1 == i3) {
                               f3 = f3 + f;
                               uob3.g = Math.round(f3);
                               f3 = 0;
                            }else {
                               uob3.g = Math.round(f);
                            }
                            b g = uob3.g;
                            float f4 = f - (float)g;
                            f3 = f3 + f4;
                            if (f3 - 0x3f800000 > 0) {
                               i3 = g + 1;
                               uob3.g = i3;
                               f3 = f3 - 0x3f800000;
                            }else if(f3 - 0xbf800000 < 0){
                               i3 = g - 1;
                               uob3.g = i3;
                               f3 = f3 + 0x3f800000;
                            }
                            uArrayList.add(uob3);
                         }
                         i1 = i1 + 1;
                      }
                      this.a.setFlexLines(uArrayList);
                   }
                }else {
                   this.a.setFlexLines(this.k(flexLinesInt, p0, p1));
                }
             }else {
                b uob4 = new b();
                uob4.g = p0 - p1;
                flexLinesInt.add(i1, uob4);
             }
          }
       }
       return;
    }
    public void p(int p0,int p1){
       this.q(p0, p1, 0);
    }
    public void q(int p0,int p1,int p2){
       int paddingBotto;
       this.r(this.a.getFlexItemCount());
       if (p2 >= this.a.getFlexItemCount()) {
          return;
       }
       int flexDirectio = this.a.getFlexDirection();
       int flexDirectio1 = this.a.getFlexDirection();
       a uoa = 0x40000000;
       if (flexDirectio1 && flexDirectio1 != 1) {
          if (flexDirectio1 == 2 || flexDirectio1 == 3) {
             flexDirectio1 = View$MeasureSpec.getSize(p1);
             if (View$MeasureSpec.getMode(p1) != uoa) {
                flexDirectio1 = this.a.getLargestMainSize();
             }
             flexDirectio = this.a.getPaddingTop();
             paddingBotto = this.a.getPaddingBottom();
          }else {
             throw new IllegalArgumentException("Invalid flex direction: "+flexDirectio);
          }
       }else {
          flexDirectio1 = View$MeasureSpec.getSize(p0);
          int largestMainS = this.a.getLargestMainSize();
          if (View$MeasureSpec.getMode(p0) != uoa && largestMainS <= flexDirectio1) {
             flexDirectio1 = largestMainS;
          }
          flexDirectio = this.a.getPaddingLeft();
          paddingBotto = this.a.getPaddingRight();
       }
       flexDirectio = flexDirectio + paddingBotto;
       paddingBotto = 0;
       a tc = this.c;
       if (tc != null) {
          paddingBotto = tc[p2];
       }
       List flexLinesInt = this.a.getFlexLinesInternal();
       int i = flexLinesInt.size();
       int i1 = paddingBotto;
       while (i1 < i) {
          Object obj = flexLinesInt.get(i1);
          b e = obj.e;
          if (e < flexDirectio1 && obj.q != null) {
             this.w(p0, p1, obj, flexDirectio1, flexDirectio, false);
          }else if(e > flexDirectio1 && obj.r != null){
             this.T(p0, p1, obj, flexDirectio1, flexDirectio, false);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public final void r(int p0){
       boolean[] uobooleanArr;
       a tb = this.b;
       if (tb == null) {
          if (p0 < 10) {
             p0 = 10;
          }
          uobooleanArr = new boolean[p0];
          this.b = uobooleanArr;
       }else if(tb.length < p0){
          int i = tb.length * 2;
          if (i >= p0) {
             p0 = i;
          }
          uobooleanArr = new boolean[p0];
          this.b = uobooleanArr;
       }else {
          Arrays.fill(tb, false);
       }
       return;
    }
    public void s(int p0){
       a tc = this.c;
       if (tc == null) {
          if (p0 < 10) {
             p0 = 10;
          }
          int[] ointArray = new int[p0];
          this.c = ointArray;
       }else if(tc.length < p0){
          int i = tc.length * 2;
          if (i >= p0) {
             p0 = i;
          }
          this.c = Arrays.copyOf(tc, p0);
       }
       return;
    }
    public void t(int p0){
       a td = this.d;
       if (td == null) {
          if (p0 < 10) {
             p0 = 10;
          }
          long[] olongArray = new long[p0];
          this.d = olongArray;
       }else if(td.length < p0){
          int i = td.length * 2;
          if (i >= p0) {
             p0 = i;
          }
          this.d = Arrays.copyOf(td, p0);
       }
       return;
    }
    public void u(int p0){
       a te = this.e;
       if (te == null) {
          if (p0 < 10) {
             p0 = 10;
          }
          long[] olongArray = new long[p0];
          this.e = olongArray;
       }else if(te.length < p0){
          int i = te.length * 2;
          if (i >= p0) {
             p0 = i;
          }
          this.e = Arrays.copyOf(te, p0);
       }
       return;
    }
    public final void v(CompoundButton p0){
       FlexItem layoutParams = p0.getLayoutParams();
       int i = layoutParams.s();
       int i1 = layoutParams.p();
       Drawable uDrawable = b.a(p0);
       int i2 = 0;
       int i3 = (uDrawable == null)? 0: uDrawable.getMinimumWidth();
       if (uDrawable != null) {
          i2 = uDrawable.getMinimumHeight();
       }
       if (i == -1) {
          i = i3;
       }
       layoutParams.V1(i);
       if (i1 == -1) {
          i1 = i2;
       }
       layoutParams.w1(i1);
       return;
    }
    public final void w(int p0,int p1,b p2,int p3,int p4,boolean p5){
       b uob1;
       int measuredHeig;
       float f4;
       double d1;
       a uoa = this;
       b uob = p2;
       int i = p3;
       b j = uob.j;
       int i1 = 0;
       if (j - i1 > 0) {
          b e = uob.e;
          if (i >= e) {
             float f = (float)(i - e) / j;
             uob.e = p4 + uob.f;
             if (!p5) {
                uob.g = Integer.MIN_VALUE;
             }
             int i2 = 0;
             float f1 = 0;
             int i3 = 0;
             float f2 = 0;
             while (i2 < uob.h) {
                int i4 = uob.o + i2;
                View view = uoa.a.D(i4);
                if (view == null || view.getVisibility() == 8) {
                   uob1 = e;
                }else {
                   FlexItem layoutParams = view.getLayoutParams();
                   int flexDirectio = uoa.a.getFlexDirection();
                   b uob2 = 1;
                   if (!flexDirectio || flexDirectio == uob2) {
                      uob2 = e;
                      i1 = view.getMeasuredWidth();
                      a e1 = uoa.e;
                      if (e1 != null) {
                         i1 = uoa.y(e1[i4]);
                      }
                      measuredHeig = view.getMeasuredHeight();
                      e1 = uoa.e;
                      uob1 = uob2;
                      if (e1 != null) {
                         measuredHeig = uoa.x(e1[i4]);
                      }
                      if (!uoa.b[i4] && layoutParams.y1() > 0) {
                         float f3 = layoutParams.y1() * f;
                         f4 = (float)i1 + f3;
                         flexDirectio = 1;
                         measuredHeig = uob.h - flexDirectio;
                         if (i2 == measuredHeig) {
                            f4 = f4 + f2;
                            f2 = 0;
                         }
                         measuredHeig = Math.round(f4);
                         if (measuredHeig > layoutParams.g0()) {
                            measuredHeig = layoutParams.g0();
                            uoa.b[i4] = flexDirectio;
                            f4 = uob.j - layoutParams.y1();
                            uob.j = f4;
                            f1 = Float.MIN_VALUE;
                         }else {
                            f4 = f4 - (float)measuredHeig;
                            f2 = f2 + f4;
                            double d = (double)f2;
                            d1 = 0x3ff0000000000000;
                            if (d - d1 > 0) {
                               measuredHeig = measuredHeig + 1;
                               d = d - d1;
                            }else if(d - 0xbff0000000000000 < 0){
                               measuredHeig = measuredHeig - 1;
                               d = d + d1;
                            }
                            f2 = (float)d;
                         }
                         i1 = uoa.z(p1, layoutParams, uob.m);
                         measuredHeig = View$MeasureSpec.makeMeasureSpec(measuredHeig, 0x40000000);
                         view.measure(measuredHeig, i1);
                         uoa.Z(i4, measuredHeig, i1, view);
                         uoa.a.I(i4, view);
                         i1 = view.getMeasuredWidth();
                         measuredHeig = view.getMeasuredHeight();
                      }else {
                         flexDirectio = p1;
                      }
                      measuredHeig = measuredHeig + layoutParams.w0();
                      measuredHeig = measuredHeig + layoutParams.X0();
                      measuredHeig = measuredHeig + uoa.a.l(view);
                      i1 = i1 + layoutParams.Y1();
                      i1 = i1 + layoutParams.l2();
                      i3 = uob.e + i1;
                      uob.e = i3;
                      i1 = Math.max(i3, measuredHeig);
                   }else {
                      flexDirectio = view.getMeasuredHeight();
                      a e2 = uoa.e;
                      if (e2 != null) {
                         flexDirectio = uoa.x(e2[i4]);
                      }
                      int measuredWidt = view.getMeasuredWidth();
                      a e3 = uoa.e;
                      if (e3 != null) {
                         measuredWidt = uoa.y(e3[i4]);
                      }
                      if (!uoa.b[i4] && layoutParams.y1() - i1 > 0) {
                         float f5 = layoutParams.y1() * f;
                         float f6 = (float)flexDirectio + f5;
                         int i5 = 1;
                         measuredWidt = uob.h - i5;
                         if (i2 == measuredWidt) {
                            f6 = f6 + f2;
                            f2 = 0;
                         }
                         measuredWidt = Math.round(f6);
                         if (measuredWidt > layoutParams.v()) {
                            measuredWidt = layoutParams.v();
                            uoa.b[i4] = i5;
                            f4 = uob.j - layoutParams.y1();
                            uob.j = f4;
                            uob2 = e;
                            f1 = Float.MIN_VALUE;
                         }else {
                            f6 = f6 - (float)measuredWidt;
                            f2 = f2 + f6;
                            uob2 = e;
                            double d2 = (double)f2;
                            d1 = 0x3ff0000000000000;
                            if (d2 - d1 > 0) {
                               measuredWidt = measuredWidt + 1;
                               d2 = d2 - d1;
                            }else if(d2 - 0xbff0000000000000 < 0){
                               measuredWidt = measuredWidt - 1;
                               d2 = d2 + d1;
                            }
                            f2 = (float)d2;
                         }
                         i1 = uoa.A(p0, layoutParams, uob.m);
                         flexDirectio = View$MeasureSpec.makeMeasureSpec(measuredWidt, 0x40000000);
                         view.measure(i1, flexDirectio);
                         measuredWidt = view.getMeasuredWidth();
                         uoa.Z(i4, i1, flexDirectio, view);
                         uoa.a.I(i4, view);
                         flexDirectio = view.getMeasuredHeight();
                      }else {
                         uob2 = e;
                         measuredHeig = p0;
                      }
                      measuredWidt = measuredWidt + layoutParams.Y1();
                      measuredWidt = measuredWidt + layoutParams.l2();
                      measuredWidt = measuredWidt + uoa.a.l(view);
                      i1 = Math.max(i3, measuredWidt);
                      flexDirectio = flexDirectio + layoutParams.w0();
                      flexDirectio = flexDirectio + layoutParams.X0();
                      i3 = uob.e + flexDirectio;
                      uob.e = i3;
                      uob1 = uob2;
                   }
                   uob.g = Math.max(uob.g, i1);
                   i3 = i1;
                }
                i2 = i2 + 1;
                e = uob1;
                i1 = 0;
             }
             uob1 = e;
             if (f1 && uob1 != uob.e) {
                this.w(p0, p1, p2, p3, p4, true);
             }
          }
       }
       return;
    }
    public int x(long p0){
       return (int)(p0 >> 32);
    }
    public int y(long p0){
       return (int)p0;
    }
    public final int z(int p0,FlexItem p1,int p2){
       a ta = this.a;
       p0 = ta.B(p0, ((((ta.getPaddingTop() + this.a.getPaddingBottom()) + p1.w0()) + p1.X0()) + p2), p1.getHeight());
       p2 = View$MeasureSpec.getSize(p0);
       if (p2 > p1.v()) {
          p0 = View$MeasureSpec.makeMeasureSpec(p1.v(), View$MeasureSpec.getMode(p0));
       }else if(p2 < p1.p()){
          p0 = View$MeasureSpec.makeMeasureSpec(p1.p(), View$MeasureSpec.getMode(p0));
       }
       return p0;
    }
}
