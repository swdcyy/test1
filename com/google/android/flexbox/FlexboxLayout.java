package com.google.android.flexbox.FlexboxLayout;
import qj.a;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.flexbox.a;
import java.util.ArrayList;
import com.google.android.flexbox.a$b;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.Object;
import java.util.List;
import qj.b;
import android.view.ViewGroup$LayoutParams;
import android.util.SparseIntArray;
import android.graphics.Canvas;
import java.lang.Math;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Iterator;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import a2.i0;
import android.view.View$MeasureSpec;
import java.lang.IllegalArgumentException;

public class FlexboxLayout extends ViewGroup implements a	// class@0015fe
{
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public Drawable h;
    public Drawable i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int[] n;
    public SparseIntArray o;
    public a p;
    public List q;
    public a$b r;

    public void FlexboxLayout(Context p0){
       super(p0, null);
    }
    public void FlexboxLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void FlexboxLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = -1;
       this.p = new a(this);
       this.q = new ArrayList();
       this.r = new a$b();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.J0, p2, 0);
       this.b = typedArray.getInt(5, 0);
       this.c = typedArray.getInt(6, 0);
       this.d = typedArray.getInt(7, 0);
       this.e = typedArray.getInt(1, 0);
       this.f = typedArray.getInt(0, 0);
       this.g = typedArray.getInt(8, -1);
       Drawable drawable = typedArray.getDrawable(2);
       if (drawable != null) {
          this.setDividerDrawableHorizontal(drawable);
          this.setDividerDrawableVertical(drawable);
       }
       drawable = typedArray.getDrawable(3);
       if (drawable != null) {
          this.setDividerDrawableHorizontal(drawable);
       }
       drawable = typedArray.getDrawable(4);
       if (drawable != null) {
          this.setDividerDrawableVertical(drawable);
       }
       int intx = typedArray.getInt(9, 0);
       if (intx) {
          this.k = intx;
          this.j = intx;
       }
       intx = typedArray.getInt(11, 0);
       if (intx) {
          this.k = intx;
       }
       intx = typedArray.getInt(10, 0);
       if (intx) {
          this.j = intx;
       }
       typedArray.recycle();
       return;
    }
    public View A(int p0){
       return this.getChildAt(p0);
    }
    public int B(int p0,int p1,int p2){
       return ViewGroup.getChildMeasureSpec(p0, p1, p2);
    }
    public View D(int p0){
       return this.h(p0);
    }
    public int F(int p0,int p1,int p2){
       return ViewGroup.getChildMeasureSpec(p0, p1, p2);
    }
    public void I(int p0,View p1){
    }
    public boolean M(){
       FlexboxLayout tb = this.b;
       boolean b = true;
       if (tb != null && tb != b) {
          b = false;
       }
       return b;
    }
    public final boolean a(int p0){
       int i = 0;
       while (true) {
          if (i >= p0) {
             return true;
          }
          if (this.q.get(i).c() > 0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (this.o == null) {
          this.o = new SparseIntArray(this.getChildCount());
       }
       this.n = this.p.n(p0, p1, p2, this.o);
       super.addView(p0, p1, p2);
       return;
    }
    public final boolean b(int p0,int p1){
       int i = 1;
       while (true) {
          if (i > p1) {
             return true;
          }
          int i1 = p0 - i;
          View view = this.h(i1);
          if (view != null && view.getVisibility() != 8) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public final void c(Canvas p0,boolean p1,boolean p2){
       int paddingLeft = this.getPaddingLeft();
       int i = Math.max(0, ((this.getWidth() - this.getPaddingRight()) - paddingLeft));
       int i1 = this.q.size();
       int i2 = 0;
       while (i2 < i1) {
          b uob = this.q.get(i2);
          int i3 = 0;
          while (i3 < uob.h) {
             int i4 = uob.o + i3;
             View view = this.h(i4);
             if (view != null && view.getVisibility() != 8) {
                FlexboxLayout$LayoutParams layoutParams = view.getLayoutParams();
                if (this.i(i4, i3)) {
                   if (p1) {
                      i4 = view.getRight() + layoutParams.rightMargin;
                   }else {
                      i4 = view.getLeft() - layoutParams.leftMargin;
                      i4 = i4 - this.m;
                   }
                   this.f(p0, i4, uob.b, uob.g);
                }
                i4 = uob.h - 1;
                if (i3 == i4) {
                   i4 = this.k & 0x04;
                   if (i4 > 0) {
                      if (p1) {
                         i4 = view.getLeft() - layoutParams.leftMargin;
                         i4 = i4 - this.m;
                      }else {
                         i4 = view.getRight() + layoutParams.rightMargin;
                      }
                      this.f(p0, i4, uob.b, uob.g);
                   }
                }
             }
          label_0089 :
             i3 = i3 + 1;
          }
          if (this.k(i2)) {
             b d = (p2)? uob.d: uob.b - this.l;
             this.e(p0, paddingLeft, d, i);
          }
          if (this.m(i2)) {
             i3 = this.j & 0x04;
             if (i3 > 0) {
                int i5 = (p2)? uob.b - this.l: uob.d;
                this.e(p0, paddingLeft, i5, i);
             }
          }
          i2 = i2 + 1;
       }
       return;
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       return p0 instanceof FlexboxLayout$LayoutParams;
    }
    public final void d(Canvas p0,boolean p1,boolean p2){
       int paddingTop = this.getPaddingTop();
       int i = Math.max(0, ((this.getHeight() - this.getPaddingBottom()) - paddingTop));
       int i1 = this.q.size();
       int i2 = 0;
       while (i2 < i1) {
          b uob = this.q.get(i2);
          int i3 = 0;
          while (i3 < uob.h) {
             int i4 = uob.o + i3;
             View view = this.h(i4);
             if (view != null && view.getVisibility() != 8) {
                FlexboxLayout$LayoutParams layoutParams = view.getLayoutParams();
                if (this.i(i4, i3)) {
                   if (p2) {
                      i4 = view.getBottom() + layoutParams.bottomMargin;
                   }else {
                      i4 = view.getTop() - layoutParams.topMargin;
                      i4 = i4 - this.l;
                   }
                   this.e(p0, uob.a, i4, uob.g);
                }
                i4 = uob.h - 1;
                if (i3 == i4) {
                   i4 = this.j & 0x04;
                   if (i4 > 0) {
                      if (p2) {
                         i4 = view.getTop() - layoutParams.topMargin;
                         i4 = i4 - this.l;
                      }else {
                         i4 = view.getBottom() + layoutParams.bottomMargin;
                      }
                      this.e(p0, uob.a, i4, uob.g);
                   }
                }
             }
          label_0089 :
             i3 = i3 + 1;
          }
          if (this.k(i2)) {
             b c = (p1)? uob.c: uob.a - this.m;
             this.f(p0, c, paddingTop, i);
          }
          if (this.m(i2)) {
             i3 = this.k & 0x04;
             if (i3 > 0) {
                int i5 = (p1)? uob.a - this.m: uob.c;
                this.f(p0, i5, paddingTop, i);
             }
          }
          i2 = i2 + 1;
       }
       return;
    }
    public final void e(Canvas p0,int p1,int p2,int p3){
       FlexboxLayout th = this.h;
       if (th == null) {
          return;
       }
       th.setBounds(p1, p2, (p3 + p1), (this.l + p2));
       this.h.draw(p0);
       return;
    }
    public final void f(Canvas p0,int p1,int p2,int p3){
       FlexboxLayout ti = this.i;
       if (ti == null) {
          return;
       }
       ti.setBounds(p1, p2, (this.m + p1), (p3 + p2));
       this.i.draw(p0);
       return;
    }
    public FlexboxLayout$LayoutParams g(AttributeSet p0){
       return new FlexboxLayout$LayoutParams(this.getContext(), p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.g(p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       if (p0 instanceof FlexboxLayout$LayoutParams) {
          return new FlexboxLayout$LayoutParams(p0);
       }
       if (p0 instanceof ViewGroup$MarginLayoutParams) {
          return new FlexboxLayout$LayoutParams(p0);
       }
       return new FlexboxLayout$LayoutParams(p0);
    }
    public int getAlignContent(){
       return this.f;
    }
    public int getAlignItems(){
       return this.e;
    }
    public Drawable getDividerDrawableHorizontal(){
       return this.h;
    }
    public Drawable getDividerDrawableVertical(){
       return this.i;
    }
    public int getFlexDirection(){
       return this.b;
    }
    public int getFlexItemCount(){
       return this.getChildCount();
    }
    public List getFlexLines(){
       ArrayList uArrayList = new ArrayList(this.q.size());
       Iterator iterator = this.q.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (!uob.c()) {
             continue ;
          }else {
             uArrayList.add(uob);
          }
       }
       return uArrayList;
    }
    public List getFlexLinesInternal(){
       return this.q;
    }
    public int getFlexWrap(){
       return this.c;
    }
    public int getJustifyContent(){
       return this.d;
    }
    public int getLargestMainSize(){
       Iterator iterator = this.q.iterator();
       int i = Integer.MIN_VALUE;
       while (iterator.hasNext()) {
          i = Math.max(i, iterator.next().e);
       }
       return i;
    }
    public int getMaxLine(){
       return this.g;
    }
    public int getShowDividerHorizontal(){
       return this.j;
    }
    public int getShowDividerVertical(){
       return this.k;
    }
    public int getSumOfCrossSize(){
       FlexboxLayout tl;
       int i = this.q.size();
       int i2 = 0;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          b uob = this.q.get(i1);
          if (this.k(i1)) {
             tl = (this.M())? this.l: this.m;
             i2 = i2 + tl;
          }
          if (this.m(i1)) {
             tl = (this.M())? this.l: this.m;
             i2 = i2 + tl;
          }
          i2 = i2 + uob.g;
       }
       return i2;
    }
    public View h(int p0){
       if (p0 >= 0) {
          FlexboxLayout tn = this.n;
          if (p0 < tn.length) {
             return this.getChildAt(tn[p0]);
          }
       }
       return null;
    }
    public final boolean i(int p0,int p1){
       boolean b = false;
       if (this.b(p0, p1)) {
          if (this.M()) {
             if (this.k & 1) {
                b = true;
             }
             return b;
          }else if(this.j & 1){
             b = true;
          }
          return b;
       }else if(this.M()){
          if (this.k & 0x02) {
             b = true;
          }
          return b;
       }else if(this.j & 0x02){
          b = true;
       }
       return b;
    }
    public void j(b p0){
       FlexboxLayout tm;
       if (this.M()) {
          if ((this.k & 0x04) > 0) {
             tm = this.m;
             p0.e = p0.e + tm;
             p0.f = p0.f + tm;
          }
       }else if((this.j & 0x04) > 0){
          tm = this.l;
          p0.e = p0.e + tm;
          p0.f = p0.f + tm;
       }
       return;
    }
    public final boolean k(int p0){
       boolean b = false;
       if (p0 >= 0 && p0 < this.q.size()) {
          if (this.a(p0)) {
             if (this.M()) {
                if (this.j & 1) {
                   b = true;
                }
                return b;
             }else if(this.k & 1){
                b = true;
             }
             return b;
          }else if(this.M()){
             if (this.j & 0x02) {
                b = true;
             }
             return b;
          }else if(this.k & 0x02){
             b = true;
          }
       }
       return b;
    }
    public int l(View p0){
       return 0;
    }
    public final boolean m(int p0){
       boolean b = false;
       if (p0 >= 0 && p0 < this.q.size()) {
          p0 = p0 + 1;
          while (true) {
             if (p0 < this.q.size()) {
                if (this.q.get(p0).c() > 0) {
                   return b;
                }else {
                   p0++;
                }
             }else if(this.M()){
                if (this.j & 0x04) {
                   b = true;
                }
                return b;
             }else if(this.k & 0x04){
                b = true;
                break ;
             }
          }
       }
       return b;
    }
    public final void n(boolean p0,int p1,int p2,int p3,int p4){
       FlexboxLayout l;
       int i8;
       int i9;
       float f1;
       float f2;
       float f3;
       int i10;
       int i11;
       FlexboxLayout uFlexboxLayo1;
       float f5;
       FlexboxLayout uFlexboxLayo2;
       ViewGroup$LayoutParams layoutParams1;
       int i13;
       FlexboxLayout uFlexboxLayo = this;
       int paddingLeft = this.getPaddingLeft();
       int paddingRight = this.getPaddingRight();
       int i = p3 - p1;
       int i1 = (p4 - p2) - this.getPaddingBottom();
       int paddingTop = this.getPaddingTop();
       int i2 = uFlexboxLayo.q.size();
       int i3 = 0;
       while (true) {
          if (i3 >= i2) {
             return;
          }
          b uob = uFlexboxLayo.q.get(i3);
          if (uFlexboxLayo.k(i3)) {
             l = uFlexboxLayo.l;
             i1 = i1 - l;
             paddingTop = paddingTop + l;
          }
          l = uFlexboxLayo.d;
          int i4 = 4;
          int i5 = 2;
          float f = 0;
          int i6 = 1;
          if (l != null) {
             if (l != i6) {
                int i7 = 0x40000000;
                if (l != i5) {
                   if (l != 3) {
                      if (l != i4) {
                         if (l == 5) {
                            i8 = uob.c();
                            if (i8) {
                               i9 = i - uob.e;
                               i8 = i8 + 1;
                               f1 = (float)i9 / (float)i8;
                            }else {
                               f1 = 0;
                            }
                            f2 = (float)paddingLeft + f1;
                            i7 = i - paddingRight;
                            f3 = (float)i7 - f1;
                         }else {
                            break ;
                         }
                      }else {
                         i8 = uob.c();
                         if (i8) {
                            i9 = i - uob.e;
                            f1 = (float)i9 / (float)i8;
                         }else {
                            f1 = 0;
                         }
                         f3 = f1 / i7;
                         f2 = (float)paddingLeft + f3;
                         i5 = i - paddingRight;
                         f3 = (float)i5 - f3;
                      }
                   }else {
                      f2 = (float)paddingLeft;
                      i9 = uob.c();
                      if (i9 != i6) {
                         i9 = i9 - 1;
                         f1 = (float)i9;
                      }else {
                         f1 = 0x3f800000;
                      }
                      i7 = i - uob.e;
                      f1 = (float)i7 / f1;
                      i7 = i - paddingRight;
                      f3 = (float)i7;
                   }
                }else {
                   b e = uob.e;
                   i5 = i - e;
                   float f6 = (float)i5 / i7;
                   f2 = (float)paddingLeft + f6;
                   i5 = i - paddingRight;
                   i9 = i - e;
                   f1 = (float)i9 / i7;
                   f3 = (float)i5 - f1;
                label_00ca :
                   f1 = 0;
                }
             }else {
                b e1 = uob.e;
                i9 = i - e1;
                i9 = i9 + paddingRight;
                i8 = e1 - paddingLeft;
                f3 = (float)i8;
                f2 = (float)i9;
                goto label_00ca ;
             }
          }else {
             f2 = (float)paddingLeft;
             i9 = i - paddingRight;
             f3 = (float)i9;
             goto label_00ca ;
          }
          float f4 = Math.max(f1, f);
          i5 = 0;
          while (i5 < uob.h) {
             i9 = uob.o + i5;
             View view = uFlexboxLayo.h(i9);
             if (view == null || view.getVisibility() == 8) {
                i10 = paddingLeft;
                i11 = i5;
                int i12 = 4;
             }else {
                ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                f2 = f2 + (float)layoutParams.leftMargin;
                f3 = f3 - (float)layoutParams.rightMargin;
                if (uFlexboxLayo.i(i9, i5)) {
                   l = uFlexboxLayo.m;
                   f = (float)l;
                   f2 = f2 + f;
                   f3 = f3 - f;
                   uFlexboxLayo1 = l;
                   f5 = f3;
                }else {
                   f5 = f3;
                   uFlexboxLayo1 = null;
                }
                i9 = uob.h - i6;
                if (i5 == i9) {
                   i9 = uFlexboxLayo.k & 0x04;
                   if (i9 > 0) {
                      uFlexboxLayo2 = uFlexboxLayo.m;
                   label_0120 :
                      if (uFlexboxLayo.c == 2) {
                         if (p0) {
                            i11 = Math.round(f5) - view.getMeasuredWidth();
                            i10 = i1 - view.getMeasuredHeight();
                            i6 = i11;
                            i11 = i5;
                            i5 = i10;
                            i10 = paddingLeft;
                            layoutParams1 = layoutParams;
                            uFlexboxLayo.p.Q(view, uob, i6, i5, Math.round(f5), i1);
                         }else {
                            i10 = paddingLeft;
                            i11 = i5;
                            layoutParams1 = layoutParams;
                            i5 = i1 - view.getMeasuredHeight();
                            i4 = Math.round(f2) + view.getMeasuredWidth();
                            uFlexboxLayo.p.Q(view, uob, Math.round(f2), i5, i4, i1);
                         }
                      }else {
                         i10 = paddingLeft;
                         i11 = i5;
                         layoutParams1 = layoutParams;
                         if (p0) {
                            i6 = Math.round(f5) - view.getMeasuredWidth();
                            i13 = paddingTop + view.getMeasuredHeight();
                            uFlexboxLayo.p.Q(view, uob, i6, paddingTop, Math.round(f5), i13);
                         }else {
                            i4 = Math.round(f2) + view.getMeasuredWidth();
                            i13 = paddingTop + view.getMeasuredHeight();
                            uFlexboxLayo.p.Q(view, uob, Math.round(f2), paddingTop, i4, i13);
                         }
                      }
                      f1 = (float)view.getMeasuredWidth() + f4;
                      f1 = f1 + (float)layoutParams1.rightMargin;
                      f2 = f2 + f1;
                      f1 = (float)view.getMeasuredWidth() + f4;
                      f1 = f1 + (float)layoutParams1.leftMargin;
                      f5 = f5 - f1;
                      if (p0) {
                         uob.d(view, uFlexboxLayo2, 0, uFlexboxLayo1, 0);
                      }else {
                         uob.d(view, uFlexboxLayo1, 0, uFlexboxLayo2, 0);
                      }
                      f3 = f5;
                   }
                }else {
                   i13 = 4;
                }
                uFlexboxLayo2 = null;
                goto label_0120 ;
             }
             i5 = i11 + 1;
             paddingLeft = i10;
             i6 = 1;
             i4 = 4;
          }
          b g = uob.g;
          paddingTop = paddingTop + g;
          i1 = i1 - g;
          i3 = i3 + 1;
          paddingLeft = paddingLeft;
       }
       throw new IllegalStateException("Invalid justifyContent is set: "+uFlexboxLayo.d);
    }
    public void o(View p0,int p1,int p2,b p3){
       FlexboxLayout tm;
       if (this.i(p1, p2)) {
          if (this.M()) {
             tm = this.m;
             p3.e = p3.e + tm;
             p3.f = p3.f + tm;
          }else {
             tm = this.l;
             p3.e = p3.e + tm;
             p3.f = p3.f + tm;
          }
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (this.i == null && this.h == null) {
          return;
       }
       if (this.j == null && this.k == null) {
          return;
       }
       boolean i = i0.B(this);
       FlexboxLayout tb = this.b;
       int i1 = 0;
       boolean b = true;
       if (tb != null) {
          if (tb != b) {
             if (tb != 2) {
                if (tb == 3) {
                   if (i == b) {
                      i1 = 1;
                   }
                   if (this.c == 2) {
                      i1 = i1 ^ 0x01;
                   }
                   this.d(p0, i1, b);
                }
             }else if(i == b){
                b = 0;
             }
             if (this.c == 2) {
                b = b ^ 0x01;
             }
             this.d(p0, b, i1);
          }else if(i != b){
             i = true;
          }else {
             i = false;
          }
          if (this.c == 2) {
             i1 = true;
          }
          this.c(p0, i, i1);
       }else if(i == b){
          i = true;
       }else {
          i = false;
       }
       if (this.c == 2) {
          i1 = true;
       }
       this.c(p0, i, i1);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       boolean i4;
       int i = i0.B(this);
       FlexboxLayout tb = this.b;
       int i1 = 0;
       int i2 = 1;
       if (tb != null) {
          if (tb != i2) {
             int i3 = 2;
             if (tb != i3) {
                if (tb == 3) {
                   if (i == i2) {
                      i1 = 1;
                   }
                   i4 = (this.c == i3)? i1 ^ 0x01: i1;
                   this.q(i4, true, p1, p2, p3, p4);
                }else {
                   throw new IllegalStateException("Invalid flex direction is set: "+this.b);
                }
             }else if(i == i2){
                i1 = 1;
             }
             i4 = (this.c == i3)? i1 ^ 0x01: i1;
             this.q(i4, false, p1, p2, p3, p4);
          }else if(i != i2){
             i4 = true;
          }else {
             i4 = false;
          }
          this.n(i4, p1, p2, p3, p4);
       }else if(i == i2){
          i4 = true;
       }else {
          i4 = false;
       }
       this.n(i4, p1, p2, p3, p4);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (this.o == null) {
          this.o = new SparseIntArray(this.getChildCount());
       }
       if (this.p.O(this.o)) {
          this.n = this.p.m(this.o);
       }
       FlexboxLayout tb = this.b;
       if (tb != null && tb != 1) {
          if (tb == 2 || tb == 3) {
             this.s(p0, p1);
          }else {
             throw new IllegalStateException("Invalid value for the flex direction is set: "+this.b);
          }
       }else {
          this.r(p0, p1);
       }
       return;
    }
    public int p(View p0,int p1,int p2){
       FlexboxLayout tm;
       int i = 0;
       if (this.M()) {
          if (this.i(p1, p2)) {
             i = i + this.m;
          }
          if ((this.k & 0x04) > 0) {
             tm = this.m;
          label_002a :
             i = i + tm;
          }
       }else if(this.i(p1, p2)){
          i = i + this.l;
       }
       if ((this.j & 0x04) > 0) {
          tm = this.l;
          goto label_002a ;
       }
       return i;
    }
    public final void q(boolean p0,boolean p1,int p2,int p3,int p4,int p5){
       FlexboxLayout m;
       int i7;
       int i8;
       float f1;
       float f2;
       float f3;
       float f4;
       int i10;
       float f6;
       FlexboxLayout uFlexboxLayo1;
       float f7;
       FlexboxLayout uFlexboxLayo2;
       int i12;
       ViewGroup$LayoutParams layoutParams1;
       int i14;
       b g;
       int i15;
       FlexboxLayout uFlexboxLayo = this;
       int paddingTop = this.getPaddingTop();
       int paddingBotto = this.getPaddingBottom();
       int paddingLeft = this.getPaddingLeft();
       int i = p5 - p3;
       int i1 = (p4 - p2) - this.getPaddingRight();
       int i2 = uFlexboxLayo.q.size();
       int i3 = 0;
       while (true) {
          if (i3 >= i2) {
             return;
          }
          b uob = uFlexboxLayo.q.get(i3);
          if (uFlexboxLayo.k(i3)) {
             m = uFlexboxLayo.m;
             paddingLeft = paddingLeft + m;
             i1 = i1 - m;
          }
          m = uFlexboxLayo.d;
          int i4 = 4;
          float f = 0;
          int i5 = 1;
          if (m != null) {
             if (m != i5) {
                int i6 = 0x40000000;
                if (m != 2) {
                   if (m != 3) {
                      if (m != i4) {
                         if (m == 5) {
                            i7 = uob.c();
                            if (i7) {
                               i8 = i - uob.e;
                               i7 = i7 + 1;
                               f1 = (float)i8 / (float)i7;
                            }else {
                               f1 = 0;
                            }
                            f2 = (float)paddingTop + f1;
                            i6 = i - paddingBotto;
                            f3 = (float)i6 - f1;
                         }else {
                            break ;
                         }
                      }else {
                         i7 = uob.c();
                         if (i7) {
                            i8 = i - uob.e;
                            f1 = (float)i8 / (float)i7;
                         }else {
                            f1 = 0;
                         }
                         f3 = f1 / i6;
                         f2 = (float)paddingTop + f3;
                         i15 = i - paddingBotto;
                         f3 = (float)i15 - f3;
                      }
                   }else {
                      f2 = (float)paddingTop;
                      i15 = uob.c();
                      if (i15 != i5) {
                         i15 = i15 - 1;
                         f4 = (float)i15;
                      }else {
                         f4 = 0x3f800000;
                      }
                      i8 = i - uob.e;
                      f1 = (float)i8 / f4;
                      i15 = i - paddingBotto;
                      f3 = (float)i15;
                   }
                }else {
                   b e = uob.e;
                   i8 = i - e;
                   f1 = (float)i8 / i6;
                   f4 = (float)paddingTop + f1;
                   i8 = i - paddingBotto;
                   i7 = i - e;
                   f2 = (float)i7 / i6;
                   f3 = (float)i8 - f2;
                   f2 = f4;
                label_00c8 :
                   f1 = 0;
                }
             }else {
                g = uob.e;
                i7 = i - g;
                i7 = i7 + paddingBotto;
                f2 = (float)i7;
                i15 = g - paddingTop;
             label_00c7 :
                f3 = (float)i15;
                goto label_00c8 ;
             }
          }else {
             f2 = (float)paddingTop;
             i15 = i - paddingBotto;
             goto label_00c7 ;
          }
          f4 = Math.max(f1, f);
          i8 = 0;
          while (i8 < uob.h) {
             int i9 = uob.o + i8;
             View view = uFlexboxLayo.h(i9);
             if (view == null || view.getVisibility() == 8) {
                i10 = i8;
                int i11 = 4;
             }else {
                ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                f2 = f2 + (float)layoutParams.topMargin;
                f3 = f3 - (float)layoutParams.bottomMargin;
                if (uFlexboxLayo.i(i9, i8)) {
                   FlexboxLayout l = uFlexboxLayo.l;
                   float f5 = (float)l;
                   f2 = f2 + f5;
                   f3 = f3 - f5;
                   f6 = f2;
                   uFlexboxLayo1 = l;
                   f7 = f3;
                }else {
                   f6 = f2;
                   f7 = f3;
                   uFlexboxLayo1 = null;
                }
                i7 = uob.h - 1;
                if (i8 == i7) {
                   i7 = uFlexboxLayo.j & 0x04;
                   if (i7 > 0) {
                      uFlexboxLayo2 = uFlexboxLayo.l;
                   label_0123 :
                      if (p0) {
                         if (p1) {
                            i12 = i1 - view.getMeasuredWidth();
                            int i13 = Math.round(f7) - view.getMeasuredHeight();
                            i10 = i8;
                            i5 = i12;
                            layoutParams1 = layoutParams;
                            uFlexboxLayo.p.R(view, uob, true, i5, i13, i1, Math.round(f7));
                         }else {
                            i10 = i8;
                            layoutParams1 = layoutParams;
                            i5 = i1 - view.getMeasuredWidth();
                            i12 = Math.round(f6) + view.getMeasuredHeight();
                            uFlexboxLayo.p.R(view, uob, true, i5, Math.round(f6), i1, i12);
                         }
                      }else {
                         i10 = i8;
                         layoutParams1 = layoutParams;
                         if (p1) {
                            i4 = Math.round(f7) - view.getMeasuredHeight();
                            i14 = paddingLeft + view.getMeasuredWidth();
                            uFlexboxLayo.p.R(view, uob, false, paddingLeft, i4, i14, Math.round(f7));
                         }else {
                            i14 = paddingLeft + view.getMeasuredWidth();
                            i12 = Math.round(f6) + view.getMeasuredHeight();
                            uFlexboxLayo.p.R(view, uob, false, paddingLeft, Math.round(f6), i14, i12);
                         }
                      }
                      f2 = (float)view.getMeasuredHeight() + f4;
                      ViewGroup$LayoutParams layoutParams2 = layoutParams1;
                      f2 = f2 + (float)layoutParams2.bottomMargin;
                      f6 = f6 + f2;
                      f2 = (float)view.getMeasuredHeight() + f4;
                      f2 = f2 + (float)layoutParams2.topMargin;
                      f7 = f7 - f2;
                      if (p1) {
                         uob.d(view, 0, uFlexboxLayo2, 0, uFlexboxLayo1);
                      }else {
                         uob.d(view, 0, uFlexboxLayo1, 0, uFlexboxLayo2);
                      }
                      f2 = f6;
                      f3 = f7;
                   }
                }else {
                   i14 = 4;
                }
                uFlexboxLayo2 = null;
                goto label_0123 ;
             }
             i8 = i10 + 1;
             i4 = 4;
          }
          g = uob.g;
          paddingLeft = paddingLeft + g;
          i1 = i1 - g;
          i3 = i3 + 1;
       }
       throw new IllegalStateException("Invalid justifyContent is set: "+uFlexboxLayo.d);
    }
    public final void r(int p0,int p1){
       int i3;
       this.q.clear();
       this.r.a();
       this.p.c(this.r, p0, p1);
       this.q = this.r.a;
       this.p.p(p0, p1);
       if (this.e == 3) {
          Iterator iterator = this.q.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             int i = Integer.MIN_VALUE;
             int i1 = 0;
             while (i1 < uob.h) {
                int i2 = uob.o + i1;
                View view = this.h(i2);
                if (view != null && view.getVisibility() != 8) {
                   FlexboxLayout$LayoutParams layoutParams = view.getLayoutParams();
                   if (this.c != 2) {
                      i3 = uob.l - view.getBaseline();
                      i2 = view.getMeasuredHeight() + Math.max(i3, layoutParams.topMargin);
                      i2 = i2 + layoutParams.bottomMargin;
                      i = Math.max(i, i2);
                   }else {
                      i3 = uob.l - view.getMeasuredHeight();
                      i3 = i3 + view.getBaseline();
                      i2 = view.getMeasuredHeight() + layoutParams.topMargin;
                      i2 = i2 + Math.max(i3, layoutParams.bottomMargin);
                      i = Math.max(i, i2);
                   }
                }
                i1 = i1 + 1;
             }
             uob.g = i;
          }
       }
       this.p.o(p0, p1, (this.getPaddingTop() + this.getPaddingBottom()));
       this.p.X();
       this.t(this.b, p0, p1, this.r.b);
       return;
    }
    public final void s(int p0,int p1){
       this.q.clear();
       this.r.a();
       this.p.f(this.r, p0, p1);
       this.q = this.r.a;
       this.p.p(p0, p1);
       this.p.o(p0, p1, (this.getPaddingLeft() + this.getPaddingRight()));
       this.p.X();
       this.t(this.b, p0, p1, this.r.b);
    }
    public void setAlignContent(int p0){
       if (this.f != p0) {
          this.f = p0;
          this.requestLayout();
       }
       return;
    }
    public void setAlignItems(int p0){
       if (this.e != p0) {
          this.e = p0;
          this.requestLayout();
       }
       return;
    }
    public void setDividerDrawable(Drawable p0){
       this.setDividerDrawableHorizontal(p0);
       this.setDividerDrawableVertical(p0);
    }
    public void setDividerDrawableHorizontal(Drawable p0){
       if (p0 == this.h) {
          return;
       }
       this.h = p0;
       this.l = (p0 != null)? p0.getIntrinsicHeight(): 0;
       this.u();
       this.requestLayout();
       return;
    }
    public void setDividerDrawableVertical(Drawable p0){
       if (p0 == this.i) {
          return;
       }
       this.i = p0;
       this.m = (p0 != null)? p0.getIntrinsicWidth(): 0;
       this.u();
       this.requestLayout();
       return;
    }
    public void setFlexDirection(int p0){
       if (this.b != p0) {
          this.b = p0;
          this.requestLayout();
       }
       return;
    }
    public void setFlexLines(List p0){
       this.q = p0;
    }
    public void setFlexWrap(int p0){
       if (this.c != p0) {
          this.c = p0;
          this.requestLayout();
       }
       return;
    }
    public void setJustifyContent(int p0){
       if (this.d != p0) {
          this.d = p0;
          this.requestLayout();
       }
       return;
    }
    public void setMaxLine(int p0){
       if (this.g != p0) {
          this.g = p0;
          this.requestLayout();
       }
       return;
    }
    public void setShowDivider(int p0){
       this.setShowDividerVertical(p0);
       this.setShowDividerHorizontal(p0);
    }
    public void setShowDividerHorizontal(int p0){
       if (p0 != this.j) {
          this.j = p0;
          this.requestLayout();
       }
       return;
    }
    public void setShowDividerVertical(int p0){
       if (p0 != this.k) {
          this.k = p0;
          this.requestLayout();
       }
       return;
    }
    public final void t(int p0,int p1,int p2,int p3){
       int i;
       int mode = View$MeasureSpec.getMode(p1);
       int size = View$MeasureSpec.getSize(p1);
       int mode1 = View$MeasureSpec.getMode(p2);
       int size1 = View$MeasureSpec.getSize(p2);
       if (p0 && p0 != 1) {
          if (p0 == 2 || p0 == 3) {
             p0 = this.getLargestMainSize();
             i = (this.getSumOfCrossSize() + this.getPaddingLeft()) + this.getPaddingRight();
          }else {
             throw new IllegalArgumentException("Invalid flex direction: "+p0);
          }
       }else {
          p0 = (this.getSumOfCrossSize() + this.getPaddingTop()) + this.getPaddingBottom();
          i = this.getLargestMainSize();
       }
       if (mode != Integer.MIN_VALUE) {
          if (mode) {
             if (mode == 0x40000000) {
                if (size < i) {
                   p3 = View.combineMeasuredStates(p3, 0x1000000);
                }
                p1 = View.resolveSizeAndState(size, p1, p3);
             }else {
                throw new IllegalStateException("Unknown width mode is set: "+mode);
             }
          }else {
             p1 = View.resolveSizeAndState(i, p1, p3);
          }
       }else if(size < i){
          p3 = View.combineMeasuredStates(p3, 0x1000000);
       }else {
          size = i;
       }
       p1 = View.resolveSizeAndState(size, p1, p3);
       if (mode1 != Integer.MIN_VALUE) {
          if (mode1) {
             if (mode1 == 0x40000000) {
                if (size1 < p0) {
                   p3 = View.combineMeasuredStates(p3, 256);
                }
                p0 = View.resolveSizeAndState(size1, p2, p3);
             }else {
                throw new IllegalStateException("Unknown height mode is set: "+mode1);
             }
          }else {
             p0 = View.resolveSizeAndState(p0, p2, p3);
          }
       }else if(size1 < p0){
          p3 = View.combineMeasuredStates(p3, 256);
       }else {
          size1 = p0;
       }
       p0 = View.resolveSizeAndState(size1, p2, p3);
       this.setMeasuredDimension(p1, p0);
       return;
    }
    public final void u(){
       if (this.h == null && this.i == null) {
          this.setWillNotDraw(true);
       }else {
          this.setWillNotDraw(false);
       }
       return;
    }
}
