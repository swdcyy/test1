package com.google.android.flexbox.FlexboxLayoutManager;
import qj.a;
import androidx.recyclerview.widget.RecyclerView$x$b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.graphics.Rect;
import android.content.Context;
import java.util.ArrayList;
import com.google.android.flexbox.a;
import com.google.android.flexbox.FlexboxLayoutManager$b;
import com.google.android.flexbox.FlexboxLayoutManager$a;
import android.util.SparseArray;
import com.google.android.flexbox.a$b;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView$LayoutManager$Properties;
import android.view.View$MeasureSpec;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$t;
import java.lang.Math;
import qj.b;
import com.google.android.flexbox.FlexboxLayoutManager$c;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import com.google.android.flexbox.FlexboxLayoutManager$LayoutParams;
import androidx.recyclerview.widget.s;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$y;
import com.google.android.flexbox.FlexboxLayoutManager$SavedState;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.os.Parcelable;
import java.lang.UnsupportedOperationException;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.RecyclerView$x;

public class FlexboxLayoutManager extends RecyclerView$LayoutManager implements a, RecyclerView$x$b	// class@001606
{
    public a$b A;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public List i;
    public final a j;
    public RecyclerView$t k;
    public RecyclerView$y l;
    public FlexboxLayoutManager$c m;
    public FlexboxLayoutManager$b n;
    public s o;
    public s p;
    public FlexboxLayoutManager$SavedState q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public SparseArray w;
    public final Context x;
    public View y;
    public int z;
    public static final Rect B;
    public static final boolean C;

    static {
       FlexboxLayoutManager.B = new Rect();
    }
    public void FlexboxLayoutManager(Context p0){
       super(p0, 0, 1);
    }
    public void FlexboxLayoutManager(Context p0,int p1){
       super(p0, p1, 1);
    }
    public void FlexboxLayoutManager(Context p0,int p1,int p2){
       super();
       this.f = -1;
       this.i = new ArrayList();
       this.j = new a(this);
       this.n = new FlexboxLayoutManager$b(this, null);
       this.r = -1;
       this.s = Integer.MIN_VALUE;
       this.t = Integer.MIN_VALUE;
       this.u = Integer.MIN_VALUE;
       this.w = new SparseArray();
       this.z = -1;
       this.A = new a$b();
       this.setFlexDirection(p1);
       this.setFlexWrap(p2);
       this.setAlignItems(4);
       this.setAutoMeasureEnabled(true);
       this.x = p0;
    }
    public void FlexboxLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super();
       this.f = -1;
       this.i = new ArrayList();
       this.j = new a(this);
       this.n = new FlexboxLayoutManager$b(this, null);
       this.r = -1;
       this.s = Integer.MIN_VALUE;
       this.t = Integer.MIN_VALUE;
       this.u = Integer.MIN_VALUE;
       this.w = new SparseArray();
       this.z = -1;
       this.A = new a$b();
       RecyclerView$LayoutManager$Properties properties = RecyclerView$LayoutManager.getProperties(p0, p1, p2, p3);
       RecyclerView$LayoutManager$Properties orientation = properties.orientation;
       if (orientation != null) {
          if (orientation == 1) {
             if (properties.reverseLayout != null) {
                this.setFlexDirection(3);
             }else {
                this.setFlexDirection(2);
             }
          }
       }else if(properties.reverseLayout != null){
          this.setFlexDirection(1);
       }else {
          this.setFlexDirection(0);
       }
       this.setFlexWrap(1);
       this.setAlignItems(4);
       this.setAutoMeasureEnabled(1);
       this.x = p0;
       return;
    }
    public static boolean isMeasurementUpToDate(int p0,int p1,int p2){
       int mode = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       boolean b = false;
       if (p2 > 0 && p0 != p2) {
          return b;
       }
       if (mode != Integer.MIN_VALUE) {
          if (mode) {
             if (mode != 0x40000000) {
                return b;
             }else if(p1 == p0){
                b = true;
             }
             return b;
          }else {
             return true;
          }
       }else if(p1 >= p0){
          b = true;
       }
       return b;
    }
    private boolean shouldMeasureChild(View p0,int p1,int p2,RecyclerView$LayoutParams p3){
       boolean b = (!p0.isLayoutRequested() && (this.isMeasurementCacheEnabled() && (!FlexboxLayoutManager.isMeasurementUpToDate(p0.getWidth(), p1, p3.width) || !FlexboxLayoutManager.isMeasurementUpToDate(p0.getHeight(), p2, p3.height))))? true: false;
       return b;
    }
    public View A(int p0){
       View view = this.w.get(p0);
       if (view != null) {
          return view;
       }
       return this.k.o(p0);
    }
    public int B(int p0,int p1,int p2){
       return RecyclerView$LayoutManager.getChildMeasureSpec(this.getHeight(), this.getHeightMode(), p1, p2, this.canScrollVertically());
    }
    public View D(int p0){
       return this.A(p0);
    }
    public final int D0(int p0){
       FlexboxLayoutManager$b d;
       int i = 0;
       if (!this.getChildCount() || !p0) {
          return i;
       }
       this.Q();
       int b = this.M();
       FlexboxLayoutManager ty = this.y;
       int width = (b)? ty.getWidth(): ty.getHeight();
       b = (b)? this.getWidth(): this.getHeight();
       if (this.getLayoutDirection() == 1) {
          i = 1;
       }
       if (i) {
          i = Math.abs(p0);
          if (p0 < 0) {
             p0 = - Math.min(((b + this.n.d) - width), i);
          }else {
             d = this.n.d;
             if ((d + p0) > 0) {
             label_004d :
                p0 = - d;
             }
          }
       }else if(p0 > 0){
          p0 = Math.min(((b - this.n.d) - width), p0);
       }else {
          d = this.n.d;
          if ((d + p0) < 0) {
          }
       }
       return p0;
    }
    public boolean E0(){
       return this.g;
    }
    public int F(int p0,int p1,int p2){
       return RecyclerView$LayoutManager.getChildMeasureSpec(this.getWidth(), this.getWidthMode(), p1, p2, this.canScrollHorizontally());
    }
    public final boolean F0(View p0,boolean p1){
       int paddingLeft = this.getPaddingLeft();
       int paddingTop = this.getPaddingTop();
       int i = this.getWidth() - this.getPaddingRight();
       int i1 = this.getHeight() - this.getPaddingBottom();
       int i2 = this.c0(p0);
       int i3 = this.e0(p0);
       int i4 = this.d0(p0);
       int i5 = this.a0(p0);
       boolean b = true;
       int i6 = (paddingLeft <= i2 && i >= i4)? 1: 0;
       paddingLeft = (i2 >= i || i4 >= paddingLeft)? 1: 0;
       i = (paddingTop <= i3 && i1 >= i5)? 1: 0;
       i5 = (i3 >= i1 || i5 >= paddingTop)? 1: 0;
       if (p1) {
          if (!i6 || !i) {
             b = false;
          }
          return b;
       }else if(paddingLeft && i5){
          b = false;
       }
       return b;
    }
    public final int G0(b p0,FlexboxLayoutManager$c p1){
       if (this.M()) {
          return this.H0(p0, p1);
       }
       return this.I0(p0, p1);
    }
    public final int H0(b p0,FlexboxLayoutManager$c p1){
       View view;
       b h;
       float f1;
       float f2;
       float f3;
       ViewGroup$LayoutParams layoutParams1;
       View view1;
       float f7;
       FlexboxLayoutManager uFlexboxLayo = this;
       b uob = p0;
       FlexboxLayoutManager$c uoc = p1;
       int paddingLeft = this.getPaddingLeft();
       int paddingRight = this.getPaddingRight();
       int width = this.getWidth();
       FlexboxLayoutManager$c e = uoc.e;
       if (uoc.i == -1) {
          e = e - uob.g;
       }
       FlexboxLayoutManager$c uoc1 = e;
       FlexboxLayoutManager$c d = uoc.d;
       FlexboxLayoutManager d1 = uFlexboxLayo.d;
       float f = 0;
       int i = 1;
       if (d1 != null) {
          if (d1 != i) {
             view = 0x40000000;
             if (d1 != 2) {
                if (d1 != 3) {
                   if (d1 != 4) {
                      if (d1 == 5) {
                         h = uob.h;
                         f1 = (h != null)? (float)(width - uob.e) / (float)(h + i): 0;
                         f2 = (float)paddingLeft + f1;
                         f3 = (float)(width - paddingRight) - f1;
                      }else {
                         throw new IllegalStateException("Invalid justifyContent is set: "+uFlexboxLayo.d);
                      }
                   }else {
                      h = uob.h;
                      f1 = (h != null)? (float)(width - uob.e) / (float)h: 0;
                      f7 = f1 / view;
                      f2 = (float)paddingLeft + f7;
                      f3 = (float)(width - paddingRight) - f7;
                   }
                }else {
                   f2 = (float)paddingLeft;
                   h = uob.h;
                   f7 = (h != i)? (float)(h - i): 0x3f800000;
                   f1 = (float)(width - uob.e) / f7;
                   f3 = (float)(width - paddingRight);
                }
             }else {
                h = uob.e;
                f2 = (float)paddingLeft + ((float)(width - h) / view);
                f3 = (float)(width - paddingRight) - ((float)(width - h) / view);
             label_00ab :
                f1 = 0;
             }
          }else {
             h = uob.e;
             f1 = 0;
             f3 = (float)(h - paddingLeft);
             f2 = (float)((width - h) + paddingRight);
          }
       }else {
          f2 = (float)paddingLeft;
          f3 = (float)(width - paddingRight);
          goto label_00ab ;
       }
       FlexboxLayoutManager$b d2 = uFlexboxLayo.n.d;
       f2 = f2 - (float)d2;
       f3 = f3 - (float)d2;
       float f4 = Math.max(f1, f);
       FlexboxLayoutManager uFlexboxLayo1 = null;
       int i1 = p0.b();
       FlexboxLayoutManager$c uoc2 = d;
       int i2 = d + i1;
       while (uoc2 < i2) {
          view = uFlexboxLayo.A(uoc2);
          if (view != null) {
             if (uoc.i == i) {
                uFlexboxLayo.calculateItemDecorationsForChild(view, FlexboxLayoutManager.B);
                uFlexboxLayo.addView(view);
             }else {
                uFlexboxLayo.calculateItemDecorationsForChild(view, FlexboxLayoutManager.B);
                uFlexboxLayo.addView(view, uFlexboxLayo1);
                uFlexboxLayo1 = uFlexboxLayo1 + 1;
             }
             int i3 = uFlexboxLayo1;
             uFlexboxLayo1 = uFlexboxLayo.j;
             long l = uFlexboxLayo1.d[uoc2];
             width = uFlexboxLayo1.y(l);
             i2 = uFlexboxLayo.j.x(l);
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             if (uFlexboxLayo.shouldMeasureChild(view, width, i2, layoutParams)) {
                view.measure(width, i2);
             }
             width = layoutParams.leftMargin + uFlexboxLayo.getLeftDecorationWidth(view);
             float f5 = f2 + (float)width;
             paddingLeft = layoutParams.rightMargin + uFlexboxLayo.getRightDecorationWidth(view);
             float f6 = f3 - (float)paddingLeft;
             int i4 = uoc1 + uFlexboxLayo.getTopDecorationHeight(view);
             if (uFlexboxLayo.g != null) {
                i2 = Math.round(f6) - view.getMeasuredWidth();
                int i5 = i4 + view.getMeasuredHeight();
                layoutParams1 = layoutParams;
                view1 = view;
                uFlexboxLayo.j.Q(view, p0, i2, i4, Math.round(f6), i5);
             }else {
                layoutParams1 = layoutParams;
                view1 = view;
                int i6 = Math.round(f5) + view1.getMeasuredWidth();
                int i7 = i4 + view1.getMeasuredHeight();
                uFlexboxLayo.j.Q(view1, p0, Math.round(f5), i4, i6, i7);
             }
             paddingLeft = view1.getMeasuredWidth() + layoutParams1.rightMargin;
             View view2 = view1;
             paddingLeft = paddingLeft + uFlexboxLayo.getRightDecorationWidth(view2);
             f2 = (float)paddingLeft + f4;
             f5 = f5 + f2;
             paddingLeft = view2.getMeasuredWidth() + layoutParams1.leftMargin;
             paddingLeft = paddingLeft + uFlexboxLayo.getLeftDecorationWidth(view2);
             f2 = (float)paddingLeft + f4;
             f6 = f6 - f2;
             uFlexboxLayo1 = i3;
             f2 = f5;
             f3 = f6;
          }
          uoc2 = uoc2 + 1;
          i = 1;
       }
       uoc.c = uoc.c + uFlexboxLayo.m.i;
       return p0.a();
    }
    public void I(int p0,View p1){
       this.w.put(p0, p1);
    }
    public final int I0(b p0,FlexboxLayoutManager$c p1){
       int i;
       int i1;
       View view;
       b h;
       float f1;
       float f2;
       float f3;
       FlexboxLayoutManager$c uoc2;
       float f5;
       long l;
       int i10;
       View view1;
       int i11;
       int i12;
       float f7;
       FlexboxLayoutManager uFlexboxLayo = this;
       b uob = p0;
       FlexboxLayoutManager$c uoc = p1;
       int paddingTop = this.getPaddingTop();
       int paddingBotto = this.getPaddingBottom();
       int height = this.getHeight();
       FlexboxLayoutManager$c e = uoc.e;
       if (uoc.i == -1) {
          b g = uob.g;
          i = e + g;
          i1 = e - g;
       }else {
          i1 = e;
          i = i1;
       }
       FlexboxLayoutManager$c d = uoc.d;
       FlexboxLayoutManager d1 = uFlexboxLayo.d;
       float f = 0;
       int i2 = 1;
       if (d1 != null) {
          if (d1 != i2) {
             view = 0x40000000;
             if (d1 != 2) {
                if (d1 != 3) {
                   if (d1 != 4) {
                      if (d1 == 5) {
                         h = uob.h;
                         f1 = (h != null)? (float)(height - uob.e) / (float)(h + i2): 0;
                         f2 = (float)paddingTop + f1;
                         f3 = (float)(height - paddingBotto) - f1;
                      }else {
                         throw new IllegalStateException("Invalid justifyContent is set: "+uFlexboxLayo.d);
                      }
                   }else {
                      h = uob.h;
                      f1 = (h != null)? (float)(height - uob.e) / (float)h: 0;
                      f7 = f1 / view;
                      f2 = (float)paddingTop + f7;
                      f3 = (float)(height - paddingBotto) - f7;
                   }
                }else {
                   f2 = (float)paddingTop;
                   h = uob.h;
                   f7 = (h != i2)? (float)(h - i2): 0x3f800000;
                   f1 = (float)(height - uob.e) / f7;
                   f3 = (float)(height - paddingBotto);
                }
             }else {
                h = uob.e;
                f2 = (float)paddingTop + ((float)(height - h) / view);
                f3 = (float)(height - paddingBotto) - ((float)(height - h) / view);
             label_00b1 :
                f1 = 0;
             }
          }else {
             h = uob.e;
             f1 = 0;
             f3 = (float)(h - paddingTop);
             f2 = (float)((height - h) + paddingBotto);
          }
       }else {
          f2 = (float)paddingTop;
          f3 = (float)(height - paddingBotto);
          goto label_00b1 ;
       }
       FlexboxLayoutManager$b d2 = uFlexboxLayo.n.d;
       f2 = f2 - (float)d2;
       f3 = f3 - (float)d2;
       float f4 = Math.max(f1, f);
       height = 0;
       int i3 = p0.b();
       FlexboxLayoutManager$c uoc1 = d;
       int i4 = d + i3;
       while (uoc1 < i4) {
          view = uFlexboxLayo.A(uoc1);
          if (view == null) {
             uoc2 = uoc1;
             f5 = f4;
             int i5 = 1;
          }else {
             d1 = uFlexboxLayo.j;
             f5 = f4;
             l = d1.d[uoc1];
             i4 = d1.y(l);
             int i6 = uFlexboxLayo.j.x(l);
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             if (uFlexboxLayo.shouldMeasureChild(view, i4, i6, layoutParams)) {
                view.measure(i4, i6);
             }
             i4 = layoutParams.topMargin + uFlexboxLayo.getTopDecorationHeight(view);
             f4 = f2 + (float)i4;
             paddingTop = layoutParams.rightMargin + uFlexboxLayo.getBottomDecorationHeight(view);
             float f6 = f3 - (float)paddingTop;
             if (uoc.i == 1) {
                uFlexboxLayo.calculateItemDecorationsForChild(view, FlexboxLayoutManager.B);
                uFlexboxLayo.addView(view);
             }else {
                uFlexboxLayo.calculateItemDecorationsForChild(view, FlexboxLayoutManager.B);
                uFlexboxLayo.addView(view, height);
                height = height + 1;
             }
             int i7 = height;
             i6 = i1 + uFlexboxLayo.getLeftDecorationWidth(view);
             int i8 = i - uFlexboxLayo.getRightDecorationWidth(view);
             d1 = uFlexboxLayo.g;
             if (d1 != null) {
                if (uFlexboxLayo.h != null) {
                   i6 = i8 - view.getMeasuredWidth();
                   int i9 = Math.round(f6) - view.getMeasuredHeight();
                   i10 = i9;
                   view1 = view;
                   uoc2 = uoc1;
                   uFlexboxLayo.j.R(view, p0, d1, i6, i10, i8, Math.round(f6));
                }else {
                   view1 = view;
                   uoc2 = uoc1;
                   i6 = i8 - view1.getMeasuredWidth();
                   i11 = Math.round(f4) + view1.getMeasuredHeight();
                   uFlexboxLayo.j.R(view1, p0, d1, i6, Math.round(f4), i8, i11);
                }
             }else {
                view1 = view;
                uoc2 = uoc1;
                if (uFlexboxLayo.h != null) {
                   i10 = Math.round(f6) - view1.getMeasuredHeight();
                   i12 = i6 + view1.getMeasuredWidth();
                   uFlexboxLayo.j.R(view1, p0, d1, i6, i10, i12, Math.round(f6));
                }else {
                   i12 = i6 + view1.getMeasuredWidth();
                   i11 = Math.round(f4) + view1.getMeasuredHeight();
                   uFlexboxLayo.j.R(view1, p0, d1, i6, Math.round(f4), i12, i11);
                }
             }
             paddingTop = view1.getMeasuredHeight() + layoutParams.topMargin;
             View view2 = view1;
             paddingTop = paddingTop + uFlexboxLayo.getBottomDecorationHeight(view2);
             f2 = (float)paddingTop + f5;
             f4 = f4 + f2;
             paddingTop = view2.getMeasuredHeight() + layoutParams.bottomMargin;
             paddingTop = paddingTop + uFlexboxLayo.getTopDecorationHeight(view2);
             f2 = (float)paddingTop + f5;
             f6 = f6 - f2;
             f2 = f4;
             height = i7;
             f3 = f6;
          }
          uoc1 = uoc2 + 1;
          f4 = f5;
          l = 1;
       }
       uoc.c = uoc.c + uFlexboxLayo.m.i;
       return p0.a();
    }
    public final void J0(RecyclerView$t p0,FlexboxLayoutManager$c p1){
       if (p1.j == null) {
          return;
       }
       if (p1.i == -1) {
          this.L0(p0, p1);
       }else {
          this.M0(p0, p1);
       }
       return;
    }
    public final void K0(RecyclerView$t p0,int p1,int p2){
       while (p2 >= p1) {
          this.removeAndRecycleViewAt(p2, p0);
          p2--;
       }
       return;
    }
    public final void L0(RecyclerView$t p0,FlexboxLayoutManager$c p1){
       if (p1.f < null) {
          return;
       }
       this.o.h();
       int childCount = this.getChildCount();
       if (!childCount) {
          return;
       }
       int i = childCount - 1;
       int i1 = this.j.c[this.getPosition(this.getChildAt(i))];
       if (i1 == -1) {
          return;
       }
       b uob = this.i.get(i1);
       int i2 = i;
       while (i2 >= 0) {
          View childAt = this.getChildAt(i2);
          if (this.N(childAt, p1.f)) {
             if (uob.o == this.getPosition(childAt)) {
                if (i1 <= 0) {
                   childCount = i2;
                   break ;
                }else {
                   i1 = i1 + p1.i;
                   uob = this.i.get(i1);
                   childCount = i2;
                }
             }
             i2 = i2 - 1;
          }else {
             break ;
          }
       }
       this.K0(p0, childCount, i);
       return;
    }
    public boolean M(){
       FlexboxLayoutManager tb = this.b;
       boolean b = true;
       if (tb != null && tb != b) {
          b = false;
       }
       return b;
    }
    public final void M0(RecyclerView$t p0,FlexboxLayoutManager$c p1){
       if (p1.f < null) {
          return;
       }
       int childCount = this.getChildCount();
       if (!childCount) {
          return;
       }
       int i = this.j.c[this.getPosition(this.getChildAt(0))];
       if (i == -1) {
          return;
       }
       b uob = this.i.get(i);
       int i1 = 0;
       int i2 = -1;
       while (true) {
          if (i1 < childCount) {
             View childAt = this.getChildAt(i1);
             if (this.O(childAt, p1.f)) {
                if (uob.p == this.getPosition(childAt)) {
                   int i3 = this.i.size() - 1;
                   if (i >= i3) {
                      break ;
                   }else {
                      i = i + p1.i;
                      uob = this.i.get(i);
                      i2 = i1;
                   }
                }
                i1 = i1 + 1;
             }else {
             label_0058 :
                i1 = i2;
                break ;
             }
          }else {
             goto label_0058 ;
          }
       }
       this.K0(p0, 0, i1);
       return;
    }
    public final boolean N(View p0,int p1){
       boolean b = true;
       if (!this.M() && this.g != null) {
          if (this.o.d(p0) > p1) {
             b = false;
          }
          return b;
       }else if(this.o.g(p0) >= (this.o.h() - p1)){
          b = false;
       }
       return b;
    }
    public final void N0(){
       boolean heightMode = (this.M())? this.getHeightMode(): this.getWidthMode();
       FlexboxLayoutManager tm = this.m;
       heightMode = (!heightMode || heightMode == Integer.MIN_VALUE)? true: false;
       tm.b = heightMode;
       return;
    }
    public final boolean O(View p0,int p1){
       boolean b = true;
       if (!this.M() && this.g != null) {
          if ((this.o.h() - this.o.g(p0)) > p1) {
             b = false;
          }
          return b;
       }else if(this.o.d(p0) <= p1){
          b = false;
       }
       return b;
    }
    public final void O0(){
       boolean layoutDirect = this.getLayoutDirection();
       FlexboxLayoutManager tb = this.b;
       boolean b = false;
       if (tb != null) {
          if (tb != true) {
             if (tb != 2) {
                if (tb != 3) {
                   this.g = b;
                   this.h = b;
                }else if(layoutDirect == 1){
                   b = true;
                }
                this.g = b;
                if (this.c == 2) {
                   this.g = b ^ 0x01;
                }
                this.h = true;
             }else if(layoutDirect == 1){
                layoutDirect = true;
             }else {
                layoutDirect = false;
             }
             this.g = layoutDirect;
             if (this.c == 2) {
                this.g = layoutDirect ^ true;
             }
             this.h = b;
          }else if(layoutDirect != 1){
             layoutDirect = true;
          }else {
             layoutDirect = false;
          }
          this.g = layoutDirect;
          if (this.c == 2) {
             b = true;
          }
          this.h = b;
       }else if(layoutDirect == 1){
          layoutDirect = true;
       }else {
          layoutDirect = false;
       }
       this.g = layoutDirect;
       if (this.c == 2) {
          b = true;
       }
       this.h = b;
       return;
    }
    public final void P(){
       this.i.clear();
       this.n.c();
       this.n.d = 0;
    }
    public final boolean P0(RecyclerView$y p0,FlexboxLayoutManager$b p1){
       boolean b = false;
       if (!this.getChildCount()) {
          return b;
       }
       View view = (p1.e != null)? this.U(p0.c()): this.S(p0.c());
       if (view != null) {
          p1.b(view);
          if (!p0.g() && this.supportsPredictiveItemAnimations()) {
             if (this.o.g(view) >= this.o.i() || this.o.d(view) < this.o.n()) {
                b = true;
             }
             if (b) {
                int i = (p1.e != null)? this.o.i(): this.o.n();
                p1.c = i;
             }
          }
       label_0061 :
          return true;
       }else {
          return b;
       }
    }
    public final void Q(){
       if (this.o != null) {
          return;
       }
       if (this.M()) {
          if (this.c == null) {
             this.o = s.a(this);
             this.p = s.c(this);
          }else {
             this.o = s.c(this);
             this.p = s.a(this);
          }
       }else if(this.c == null){
          this.o = s.c(this);
          this.p = s.a(this);
       }else {
          this.o = s.a(this);
          this.p = s.c(this);
       }
       return;
    }
    public final boolean Q0(RecyclerView$y p0,FlexboxLayoutManager$b p1,FlexboxLayoutManager$SavedState p2){
       int i;
       boolean b = false;
       if (!p0.g()) {
          FlexboxLayoutManager tr = this.r;
          if (tr != -1) {
             if (tr < null || tr >= p0.c()) {
                this.r = -1;
                this.s = Integer.MIN_VALUE;
             }else {
                tr = this.r;
                p1.a = tr;
                p1.b = this.j.c[tr];
                tr = this.q;
                if (tr != null && tr.a(p0.c())) {
                   p1.c = this.o.n() + p2.c;
                   p1.g = true;
                   p1.b = -1;
                   return true;
                }else if(this.s == Integer.MIN_VALUE){
                   View view = this.findViewByPosition(this.r);
                   if (view != null) {
                      if (this.o.e(view) > this.o.o()) {
                         p1.a();
                         return true;
                      }else if((this.o.g(view) - this.o.n()) < 0){
                         p1.c = this.o.n();
                         p1.e = b;
                         return true;
                      }else if((this.o.i() - this.o.d(view)) < 0){
                         p1.c = this.o.i();
                         p1.e = true;
                         return true;
                      }else if(p1.e != null){
                         i = this.o.d(view) + this.o.p();
                      }else {
                         i = this.o.g(view);
                      }
                      p1.c = i;
                   }else if(this.getChildCount() > 0){
                      if (this.r < this.getPosition(this.getChildAt(b))) {
                         b = true;
                      }
                      p1.e = b;
                   }
                   p1.a();
                   return true;
                }else if(!this.M() && this.g != null){
                   p1.c = this.s - this.o.j();
                }else {
                   p1.c = this.o.n() + this.s;
                }
                return true;
             }
          }
       }
       return b;
    }
    public final int R(RecyclerView$t p0,RecyclerView$y p1,FlexboxLayoutManager$c p2){
       int i1;
       int i2;
       FlexboxLayoutManager$c f = p2.f;
       if (f != Integer.MIN_VALUE) {
          FlexboxLayoutManager$c a = p2.a;
          if (a < null) {
             p2.f = f + a;
          }
          this.J0(p0, p2);
       }
       f = p2.a;
       int i = 0;
       int b = this.M();
       for (FlexboxLayoutManager$c uoc = f; uoc > 0 || (this.m.b != null && p2.a(p1, this.i)); uoc = uoc - uob.a()) {
          b uob = this.i.get(p2.c);
          p2.d = uob.o;
          i = i + this.G0(uob, p2);
          if (!b && this.g != null) {
             i1 = uob.a() * p2.i;
             i2 = p2.e - i1;
             p2.e = i2;
          }else {
             i1 = uob.a() * p2.i;
             i2 = p2.e + i1;
             p2.e = i2;
          }
       }
       int i3 = p2.a - i;
       p2.a = i3;
       FlexboxLayoutManager$c f1 = p2.f;
       if (f1 != Integer.MIN_VALUE) {
          b = f1 + i;
          p2.f = b;
          if (i3 < 0) {
             p2.f = b + i3;
          }
          this.J0(p0, p2);
       }
       return (f - p2.a);
    }
    public final void R0(RecyclerView$y p0,FlexboxLayoutManager$b p1){
       if (this.Q0(p0, p1, this.q)) {
          return;
       }
       if (this.P0(p0, p1)) {
          return;
       }
       p1.a();
       p1.a = 0;
       p1.b = 0;
       return;
    }
    public final View S(int p0){
       View view = this.X(0, this.getChildCount(), p0);
       View view1 = null;
       if (view == null) {
          return view1;
       }
       int i = this.j.c[this.getPosition(view)];
       if (i == -1) {
          return view1;
       }
       return this.T(view, this.i.get(i));
    }
    public final void S0(int p0){
       if (p0 >= this.c()) {
          return;
       }
       int childCount = this.getChildCount();
       this.j.t(childCount);
       this.j.u(childCount);
       this.j.s(childCount);
       if (p0 >= this.j.c.length) {
          return;
       }
       this.z = p0;
       View view = this.b0();
       if (view == null) {
          return;
       }
       this.r = this.getPosition(view);
       this.s = (!this.M() && this.g != null)? this.o.d(view) + this.o.j(): this.o.g(view) - this.o.n();
       return;
    }
    public final View T(View p0,b p1){
       boolean b = this.M();
       p1 = p1.h;
       int i = 1;
       while (i < p1) {
          View childAt = this.getChildAt(i);
          if (childAt != null && childAt.getVisibility() != 8) {
             if (this.g != null && !b) {
                if (this.o.d(p0) >= this.o.d(childAt)) {
                label_003c :
                   i = i + 1;
                }
             }else if(this.o.g(p0) > this.o.g(childAt)){
             }
             p0 = childAt;
             goto label_003c ;
          }
       }
       return p0;
    }
    public final void T0(int p0){
       FlexboxLayoutManager tt;
       DisplayMetrics heightPixels;
       int i = View$MeasureSpec.makeMeasureSpec(this.getWidth(), this.getWidthMode());
       int i1 = View$MeasureSpec.makeMeasureSpec(this.getHeight(), this.getHeightMode());
       int width = this.getWidth();
       int height = this.getHeight();
       int i2 = 1;
       FlexboxLayoutManager$b uob = Integer.MIN_VALUE;
       if (this.M()) {
          tt = this.t;
          if (tt == uob || tt == width) {
             i2 = 0;
          }
          tt = this.m;
          if (tt.b != null) {
             heightPixels = c.c(this.x.getResources()).heightPixels;
          }else {
             heightPixels = tt.a;
          }
       }else {
          tt = this.u;
          if (tt == uob || tt == height) {
             i2 = 0;
          }
          tt = this.m;
          if (tt.b != null) {
             heightPixels = c.c(this.x.getResources()).widthPixels;
          }else {
             heightPixels = tt.a;
          }
       }
       DisplayMetrics uDisplayMetr = heightPixels;
       this.t = width;
       this.u = height;
       FlexboxLayoutManager tz = this.z;
       FlexboxLayoutManager uFlexboxLayo = -1;
       if (tz == uFlexboxLayo && (this.r != uFlexboxLayo || i2)) {
          if (this.n.e != null) {
             return;
          }else {
             this.i.clear();
             this.A.a();
             if (this.M()) {
                this.j.e(this.A, i, i1, uDisplayMetr, this.n.a, this.i);
             }else {
                this.j.h(this.A, i, i1, uDisplayMetr, this.n.a, this.i);
             }
             this.i = this.A.a;
             this.j.p(i, i1);
             this.j.X();
             FlexboxLayoutManager tn = this.n;
             i = this.j.c[tn.a];
             tn.b = i;
             tn.c = i;
          }
       }else if(tz != uFlexboxLayo){
          width = Math.min(tz, this.n.a);
       }else {
          FlexboxLayoutManager$b a = this.n.a;
       }
       int i3 = width;
       this.A.a();
       if (this.M()) {
          if (this.i.size() > 0) {
             this.j.j(this.i, i3);
             this.j.b(this.A, i, i1, uDisplayMetr, i3, this.n.a, this.i);
          }else {
             this.j.s(p0);
             this.j.d(this.A, i, i1, uDisplayMetr, 0, this.i);
          }
       }else if(this.i.size() > 0){
          this.j.j(this.i, i3);
          this.j.b(this.A, i1, i, uDisplayMetr, i3, this.n.a, this.i);
       }else {
          this.j.s(p0);
          this.j.g(this.A, i, i1, uDisplayMetr, 0, this.i);
       }
       this.i = this.A.a;
       this.j.q(i, i1, i3);
       this.j.Y(i3);
       return;
    }
    public final View U(int p0){
       View view = this.X((this.getChildCount() - 1), -1, p0);
       if (view == null) {
          return null;
       }
       return this.V(view, this.i.get(this.j.c[this.getPosition(view)]));
    }
    public final void U0(int p0,int p1){
       View childAt;
       FlexboxLayoutManager tm1;
       this.m.i = p0;
       int b = this.M();
       int i = View$MeasureSpec.makeMeasureSpec(this.getWidth(), this.getWidthMode());
       int i1 = View$MeasureSpec.makeMeasureSpec(this.getHeight(), this.getHeightMode());
       int i2 = 0;
       int i3 = 1;
       FlexboxLayoutManager uFlexboxLayo = (!b && this.g != null)? 1: null;
       int i4 = -1;
       if (p0 == i3) {
          childAt = this.getChildAt((this.getChildCount() - i3));
          this.m.e = this.o.d(childAt);
          int position = this.getPosition(childAt);
          childAt = this.V(childAt, this.i.get(this.j.c[position]));
          FlexboxLayoutManager tm = this.m;
          tm.h = i3;
          position = position + i3;
          tm.d = position;
          a c = this.j.c;
          tm.c = (c.length <= position)? i4: c[position];
          if (uFlexboxLayo) {
             tm.e = this.o.g(childAt);
             this.m.f = (- this.o.g(childAt)) + this.o.n();
             tm1 = this.m;
             FlexboxLayoutManager$c f = tm1.f;
             if (f >= null) {
                i2 = f;
             }
             tm1.f = i2;
          }else {
             tm.e = this.o.d(childAt);
             this.m.f = this.o.d(childAt) - this.o.i();
          }
          FlexboxLayoutManager$c c1 = this.m.c;
          if (c1 == i4 || (c1 > (this.i.size() - i3) && this.m.d <= this.getFlexItemCount())) {
             position = p1 - this.m.f;
             this.A.a();
             if (position > 0) {
                if (b) {
                   this.j.d(this.A, i, i1, position, this.m.d, this.i);
                }else {
                   this.j.g(this.A, i, i1, position, this.m.d, this.i);
                }
                this.j.q(i, i1, this.m.d);
                this.j.Y(this.m.d);
             }
          }
       }else {
          childAt = this.getChildAt(i2);
          this.m.e = this.o.g(childAt);
          b = this.getPosition(childAt);
          childAt = this.T(childAt, this.i.get(this.j.c[b]));
          FlexboxLayoutManager tm2 = this.m;
          tm2.h = i3;
          i1 = this.j.c[b];
          if (i1 == i4) {
             i1 = 0;
          }
          if (i1 > 0) {
             this.m.d = b - this.i.get((i1 - 1)).b();
          }else {
             tm2.d = i4;
          }
          FlexboxLayoutManager tm3 = this.m;
          i1 = (i1 > 0)? i1 - i3: 0;
          tm3.c = i1;
          if (uFlexboxLayo != null) {
             tm3.e = this.o.d(childAt);
             this.m.f = this.o.d(childAt) - this.o.i();
             tm1 = this.m;
             FlexboxLayoutManager$c f1 = tm1.f;
             if (f1 >= null) {
                i2 = f1;
             }
             tm1.f = i2;
          }else {
             tm3.e = this.o.g(childAt);
             this.m.f = (- this.o.g(childAt)) + this.o.n();
          }
       }
    label_0197 :
       tm1 = this.m;
       tm1.a = p1 - tm1.f;
       return;
    }
    public final View V(View p0,b p1){
       boolean b = this.M();
       int i = this.getChildCount() - 2;
       int i1 = (this.getChildCount() - p1.h) - 1;
       while (i > i1) {
          View childAt = this.getChildAt(i);
          if (childAt != null && childAt.getVisibility() != 8) {
             if (this.g != null && !b) {
                if (this.o.g(p0) <= this.o.g(childAt)) {
                label_0048 :
                   i = i - 1;
                }
             }else if(this.o.d(p0) < this.o.d(childAt)){
             }
             p0 = childAt;
             goto label_0048 ;
          }
       }
       return p0;
    }
    public final void V0(FlexboxLayoutManager$b p0,boolean p1,boolean p2){
       if (p2) {
          this.N0();
       }else {
          p2.b = false;
       }
       p2.a = (!this.M() && this.g != null)? p0.c - this.getPaddingRight(): this.o.i() - p0.c;
       FlexboxLayoutManager tm = this.m;
       tm.d = p0.a;
       tm.h = 1;
       tm.i = 1;
       tm.e = p0.c;
       tm.f = Integer.MIN_VALUE;
       tm.c = p0.b;
       if (p1 && this.i.size() > 1) {
          FlexboxLayoutManager$b b = p0.b;
          if (b >= null && b < (this.i.size() - 1)) {
             FlexboxLayoutManager tm1 = this.m;
             tm1.c = tm1.c + 1;
             tm1.d = tm1.d + this.i.get(p0.b).b();
          }
       }
       return;
    }
    public final View W(int p0,int p1,boolean p2){
       View childAt;
       int i = (p1 > p0)? 1: -1;
       while (true) {
          if (p0 == p1) {
             return null;
          }
          childAt = this.getChildAt(p0);
          if (this.F0(childAt, p2)) {
             break ;
          }else {
             p0 = p0 + i;
          }
       }
       return childAt;
    }
    public final void W0(FlexboxLayoutManager$b p0,boolean p1,boolean p2){
       if (p2) {
          this.N0();
       }else {
          p2.b = false;
       }
       p2.a = (!this.M() && this.g != null)? (this.y.getWidth() - p0.c) - this.o.n(): p0.c - this.o.n();
       FlexboxLayoutManager tm = this.m;
       tm.d = p0.a;
       tm.h = 1;
       tm.i = -1;
       tm.e = p0.c;
       tm.f = Integer.MIN_VALUE;
       FlexboxLayoutManager$b b = p0.b;
       tm.c = b;
       if (p1 && b > null) {
          p0 = p0.b;
          if (this.i.size() > p0) {
             FlexboxLayoutManager tm1 = this.m;
             tm1.c = tm1.c - 1;
             tm1.d = tm1.d - this.i.get(p0).b();
          }
       }
       return;
    }
    public final View X(int p0,int p1,int p2){
       this.Q();
       this.ensureLayoutState();
       int i = this.o.n();
       int i1 = this.o.i();
       int i2 = (p1 > p0)? 1: -1;
       View view = null;
       int i3 = view;
       while (true) {
          if (p0 != p1) {
             View childAt = this.getChildAt(p0);
             int position = this.getPosition(childAt);
             if (position >= 0 && position < p2) {
                if (childAt.getLayoutParams().isItemRemoved()) {
                   if (i3 == null) {
                      i3 = childAt;
                   }
                }else if(this.o.g(childAt) < i || this.o.d(childAt) > i1){
                   if (view == null) {
                      view = childAt;
                   }
                }else {
                   return childAt;
                }
             }
             p0 = p0 + i2;
          }else if(view != null){
             view = i3;
             break ;
          }
          break ;
       }
       return view;
    }
    public final int Y(int p0,RecyclerView$t p1,RecyclerView$y p2,boolean p3){
       int i;
       int i1;
       FlexboxLayoutManager uFlexboxLayo = (!this.M() && this.g != null)? 1: null;
       if (uFlexboxLayo) {
          i = p0 - this.o.n();
          if (i > 0) {
             i1 = this.g0(i, p1, p2);
          }else {
             return 0;
          }
       }else {
          i = this.o.i() - p0;
          if (i > 0) {
             i1 = - this.g0((- i), p1, p2);
          }else {
             return 0;
          }
       }
       p0 = p0 + i1;
       if (p3) {
          int i2 = this.o.i() - p0;
          if (i2 > 0) {
             this.o.t(i2);
             return (i2 + i1);
          }
       }
       return i1;
    }
    public final int Z(int p0,RecyclerView$t p1,RecyclerView$y p2,boolean p3){
       int i;
       int i1;
       if (!this.M() && this.g != null) {
          i = this.o.i() - p0;
          if (i > 0) {
             i1 = this.g0((- i), p1, p2);
          }else {
             return 0;
          }
       }else {
          i = p0 - this.o.n();
          if (i > 0) {
             i1 = - this.g0(i, p1, p2);
          }else {
             return 0;
          }
       }
       p0 = p0 + i1;
       if (p3) {
          p0 = p0 - this.o.n();
          if (p0 > 0) {
             this.o.t((- p0));
             i1 = i1 - p0;
          }
       }
       return i1;
    }
    public final int a0(View p0){
       return (this.getDecoratedBottom(p0) + p0.getLayoutParams().bottomMargin);
    }
    public final View b0(){
       return this.getChildAt(0);
    }
    public int c(){
       int i = -1;
       View view = this.W((this.getChildCount() - 1), i, false);
       if (view == null) {
       }else {
          i = this.getPosition(view);
       }
       return i;
    }
    public final int c0(View p0){
       return (this.getDecoratedLeft(p0) - p0.getLayoutParams().leftMargin);
    }
    public boolean canScrollHorizontally(){
       if (this.c == null) {
          return this.M();
       }
       boolean b = false;
       if (this.M()) {
          int width = this.getWidth();
          FlexboxLayoutManager ty = this.y;
          int width1 = (ty != null)? ty.getWidth(): 0;
          if (width <= width1) {
          label_0021 :
             return b;
          }
       }
       b = true;
       goto label_0021 ;
    }
    public boolean canScrollVertically(){
       int i = 1;
       if (this.c == null) {
          return (this.M() ^ i);
       }
       if (!this.M()) {
          int height = this.getHeight();
          FlexboxLayoutManager ty = this.y;
          int height1 = (ty != null)? ty.getHeight(): 0;
          if (height <= height1) {
             i = false;
          }
       }
       return i;
    }
    public boolean checkLayoutParams(RecyclerView$LayoutParams p0){
       return p0 instanceof FlexboxLayoutManager$LayoutParams;
    }
    public int computeHorizontalScrollExtent(RecyclerView$y p0){
       return this.computeScrollExtent(p0);
    }
    public int computeHorizontalScrollOffset(RecyclerView$y p0){
       return this.computeScrollOffset(p0);
    }
    public int computeHorizontalScrollRange(RecyclerView$y p0){
       return this.computeScrollRange(p0);
    }
    public final int computeScrollExtent(RecyclerView$y p0){
       if (!this.getChildCount()) {
          return 0;
       }
       int i = p0.c();
       this.Q();
       View view = this.S(i);
       View view1 = this.U(i);
       if (p0.c() && (view == null || view1 == null)) {
          return 0;
       }
       return Math.min(this.o.o(), (this.o.d(view1) - this.o.g(view)));
    }
    public final int computeScrollOffset(RecyclerView$y p0){
       int i = 0;
       if (!this.getChildCount()) {
          return i;
       }
       int i1 = p0.c();
       View view = this.S(i1);
       View view1 = this.U(i1);
       if (!p0.c() || (view != null && view1 != null)) {
          int position = this.getPosition(view1);
          i1 = Math.abs((this.o.d(view1) - this.o.g(view)));
          a c = this.j.c;
          int i2 = c[this.getPosition(view)];
          if (i2 && i2 != -1) {
             return Math.round((((float)i2 * ((float)i1 / (float)((c[position] - i2) + 1))) + (float)(this.o.n() - this.o.g(view))));
          }
       }
    label_0063 :
       return i;
    }
    public final int computeScrollRange(RecyclerView$y p0){
       int i = 0;
       if (!this.getChildCount()) {
          return i;
       }
       int i1 = p0.c();
       View view = this.S(i1);
       View view1 = this.U(i1);
       if (p0.c() && (view == null || view1 == null)) {
          return i;
       }
       return (int)(((float)Math.abs((this.o.d(view1) - this.o.g(view))) / (float)((this.c() - this.i0()) + 1)) * (float)p0.c());
    }
    public PointF computeScrollVectorForPosition(int p0){
       if (!this.getChildCount()) {
          return null;
       }
       p0 = (p0 < this.getPosition(this.getChildAt(0)))? -1: 1;
       if (this.M()) {
          return new PointF(0, (float)p0);
       }else {
          return new PointF((float)p0, 0);
       }
    }
    public int computeVerticalScrollExtent(RecyclerView$y p0){
       return this.computeScrollExtent(p0);
    }
    public int computeVerticalScrollOffset(RecyclerView$y p0){
       return this.computeScrollOffset(p0);
    }
    public int computeVerticalScrollRange(RecyclerView$y p0){
       return this.computeScrollRange(p0);
    }
    public final int d0(View p0){
       return (this.getDecoratedRight(p0) + p0.getLayoutParams().rightMargin);
    }
    public final int e0(View p0){
       return (this.getDecoratedTop(p0) - p0.getLayoutParams().topMargin);
    }
    public final void ensureLayoutState(){
       if (this.m == null) {
          this.m = new FlexboxLayoutManager$c(null);
       }
       return;
    }
    public int f0(int p0){
       return this.j.c[p0];
    }
    public final int g0(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (!this.getChildCount() || !p0) {
          return 0;
       }
       this.Q();
       boolean b = true;
       this.m.j = b;
       int i = (!this.M() && this.g != null)? 1: 0;
       if (i) {
          if (p0 >= 0) {
          label_0025 :
             b = -1;
          }
       }else if(p0 > 0){
       }
       int i1 = Math.abs(p0);
       this.U0(b, i1);
       FlexboxLayoutManager tm = this.m;
       int i2 = tm.f + this.R(p1, p2, tm);
       if (i2 < 0) {
          return 0;
       }else if(i){
          if (i1 > i2) {
             p0 = (- b) * i2;
          }
       }else if(i1 > i2){
          p0 = b * i2;
       }
       this.o.t((- p0));
       p1.g = p0;
       return p0;
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       return new FlexboxLayoutManager$LayoutParams(-2, -2);
    }
    public RecyclerView$LayoutParams generateLayoutParams(Context p0,AttributeSet p1){
       return new FlexboxLayoutManager$LayoutParams(p0, p1);
    }
    public int getAlignContent(){
       return 5;
    }
    public int getAlignItems(){
       return this.e;
    }
    public int getFlexDirection(){
       return this.b;
    }
    public int getFlexItemCount(){
       return this.l.c();
    }
    public List getFlexLines(){
       ArrayList uArrayList = new ArrayList(this.i.size());
       int i = this.i.size();
       int i1 = 0;
       while (i1 < i) {
          b uob = this.i.get(i1);
          if (uob.b()) {
             uArrayList.add(uob);
          }
          i1 = i1 + 1;
       }
       return uArrayList;
    }
    public List getFlexLinesInternal(){
       return this.i;
    }
    public int getFlexWrap(){
       return this.c;
    }
    public int getJustifyContent(){
       return this.d;
    }
    public int getLargestMainSize(){
       int i = 0;
       if (!this.i.size()) {
          return i;
       }
       int i1 = Integer.MIN_VALUE;
       int i2 = this.i.size();
       for (; i < i2; i = i + 1) {
          i1 = Math.max(i1, this.i.get(i).e);
       }
       return i1;
    }
    public int getMaxLine(){
       return this.f;
    }
    public int getSumOfCrossSize(){
       int i = this.i.size();
       int i2 = 0;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          i2 = i2 + this.i.get(i1).g;
       }
       return i2;
    }
    public int i0(){
       View view = this.W(0, this.getChildCount(), 0);
       int i = (view == null)? -1: this.getPosition(view);
       return i;
    }
    public void j(b p0){
    }
    public int l(View p0){
       int topDecoratio;
       int bottomDecora;
       if (this.M()) {
          topDecoratio = this.getTopDecorationHeight(p0);
          bottomDecora = this.getBottomDecorationHeight(p0);
       }else {
          topDecoratio = this.getLeftDecorationWidth(p0);
          bottomDecora = this.getRightDecorationWidth(p0);
       }
       return (topDecoratio + bottomDecora);
    }
    public void o(View p0,int p1,int p2,b p3){
       this.calculateItemDecorationsForChild(p0, FlexboxLayoutManager.B);
       if (this.M()) {
          p1 = this.getLeftDecorationWidth(p0) + this.getRightDecorationWidth(p0);
          p3.e = p3.e + p1;
          p3.f = p3.f + p1;
       }else {
          p1 = this.getTopDecorationHeight(p0) + this.getBottomDecorationHeight(p0);
          p3.e = p3.e + p1;
          p3.f = p3.f + p1;
       }
       return;
    }
    public void onAdapterChanged(RecyclerView$Adapter p0,RecyclerView$Adapter p1){
       this.removeAllViews();
    }
    public void onAttachedToWindow(RecyclerView p0){
       super.onAttachedToWindow(p0);
       this.y = p0.getParent();
    }
    public void onDetachedFromWindow(RecyclerView p0,RecyclerView$t p1){
       super.onDetachedFromWindow(p0, p1);
       if (this.v != null) {
          this.removeAndRecycleAllViews(p1);
          p1.c();
       }
       return;
    }
    public void onItemsAdded(RecyclerView p0,int p1,int p2){
       super.onItemsAdded(p0, p1, p2);
       this.S0(p1);
    }
    public void onItemsMoved(RecyclerView p0,int p1,int p2,int p3){
       super.onItemsMoved(p0, p1, p2, p3);
       this.S0(Math.min(p1, p2));
    }
    public void onItemsRemoved(RecyclerView p0,int p1,int p2){
       super.onItemsRemoved(p0, p1, p2);
       this.S0(p1);
    }
    public void onItemsUpdated(RecyclerView p0,int p1,int p2){
       super.onItemsUpdated(p0, p1, p2);
       this.S0(p1);
    }
    public void onItemsUpdated(RecyclerView p0,int p1,int p2,Object p3){
       super.onItemsUpdated(p0, p1, p2, p3);
       this.S0(p1);
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       FlexboxLayoutManager$c e;
       FlexboxLayoutManager$c e1;
       this.k = p0;
       this.l = p1;
       int i = p1.c();
       if (!i && p1.g()) {
          return;
       }
       this.O0();
       this.Q();
       this.ensureLayoutState();
       this.j.t(i);
       this.j.u(i);
       this.j.s(i);
       this.m.j = false;
       FlexboxLayoutManager tq = this.q;
       if (tq != null && tq.a(i)) {
          this.r = this.q.b;
       }
       tq = this.n;
       if (tq.f != null && (this.r != -1 || this.q != null)) {
          tq.c();
          this.R0(p1, this.n);
          this.n.f = true;
       }
       this.detachAndScrapAttachedViews(p0);
       tq = this.n;
       if (tq.e != null) {
          this.W0(tq, false, true);
       }else {
          this.V0(tq, false, true);
       }
       this.T0(i);
       if (this.n.e != null) {
          this.R(p0, p1, this.m);
          e = this.m.e;
          this.V0(this.n, true, false);
          this.R(p0, p1, this.m);
          e1 = this.m.e;
       }else {
          this.R(p0, p1, this.m);
          e1 = this.m.e;
          this.W0(this.n, true, false);
          this.R(p0, p1, this.m);
          e = this.m.e;
       }
       if (this.getChildCount() > 0) {
          if (this.n.e != null) {
             this.Z((e + this.Y(e1, p0, p1, true)), p0, p1, false);
          }else {
             this.Y((e1 + this.Z(e, p0, p1, true)), p0, p1, false);
          }
       }
       return;
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       super.onLayoutCompleted(p0);
       this.q = null;
       this.r = -1;
       this.s = Integer.MIN_VALUE;
       this.z = -1;
       this.n.c();
       this.w.clear();
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (p0 instanceof FlexboxLayoutManager$SavedState) {
          this.q = p0;
          this.requestLayout();
       }
       return;
    }
    public Parcelable onSaveInstanceState(){
       FlexboxLayoutManager tq = this.q;
       if (tq != null) {
          return new FlexboxLayoutManager$SavedState(tq, null);
       }
       FlexboxLayoutManager$SavedState savedState = new FlexboxLayoutManager$SavedState();
       if (this.getChildCount() > 0) {
          View view = this.b0();
          savedState.b = this.getPosition(view);
          savedState.c = this.o.g(view) - this.o.n();
       }else {
          savedState.b();
       }
       return savedState;
    }
    public int p(View p0,int p1,int p2){
       int rightDecorat;
       if (this.M()) {
          p1 = this.getLeftDecorationWidth(p0);
          rightDecorat = this.getRightDecorationWidth(p0);
       }else {
          p1 = this.getTopDecorationHeight(p0);
          rightDecorat = this.getBottomDecorationHeight(p0);
       }
       return (p1 + rightDecorat);
    }
    public int scrollHorizontallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (!this.M() || (this.c == null && this.M())) {
          this.w.clear();
          return this.g0(p0, p1, p2);
       }else {
          p0 = this.D0(p0);
          FlexboxLayoutManager tn = this.n;
          tn.d = tn.d + p0;
          this.p.t((- p0));
          return p0;
       }
    }
    public void scrollToPosition(int p0){
       this.r = p0;
       this.s = Integer.MIN_VALUE;
       FlexboxLayoutManager tq = this.q;
       if (tq != null) {
          tq.b();
       }
       this.requestLayout();
       return;
    }
    public int scrollVerticallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       if (this.M() || (this.c == null && !this.M())) {
          this.w.clear();
          return this.g0(p0, p1, p2);
       }else {
          p0 = this.D0(p0);
          FlexboxLayoutManager tn = this.n;
          tn.d = tn.d + p0;
          this.p.t((- p0));
          return p0;
       }
    }
    public void setAlignContent(int p0){
       throw new UnsupportedOperationException("Setting the alignContent in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to use this attribute.");
    }
    public void setAlignItems(int p0){
       FlexboxLayoutManager te = this.e;
       if (te != p0) {
          if (te == 4 || p0 == 4) {
             this.removeAllViews();
             this.P();
          }
          this.e = p0;
          this.requestLayout();
       }
       return;
    }
    public void setFlexDirection(int p0){
       if (this.b != p0) {
          this.removeAllViews();
          this.b = p0;
          this.o = null;
          this.p = null;
          this.P();
          this.requestLayout();
       }
       return;
    }
    public void setFlexLines(List p0){
       this.i = p0;
    }
    public void setFlexWrap(int p0){
       if (p0 == 2) {
          throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
       }
       FlexboxLayoutManager tc = this.c;
       if (tc != p0) {
          if (tc == null || !p0) {
             this.removeAllViews();
             this.P();
          }
          this.c = p0;
          this.o = null;
          this.p = null;
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
       if (this.f != p0) {
          this.f = p0;
          this.requestLayout();
       }
       return;
    }
    public void smoothScrollToPosition(RecyclerView p0,RecyclerView$y p1,int p2){
       o oo = new o(p0.getContext());
       oo.p(p2);
       this.startSmoothScroll(oo);
    }
}
