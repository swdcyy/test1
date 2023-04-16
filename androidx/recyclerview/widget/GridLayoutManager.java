package androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.GridLayoutManager$a;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView$LayoutManager$Properties;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.LinearLayoutManager$c;
import androidx.recyclerview.widget.LinearLayoutManager$b;
import androidx.recyclerview.widget.s;
import android.view.View;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.GridLayoutManager$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import java.lang.Object;
import java.util.Arrays;
import androidx.recyclerview.widget.LinearLayoutManager$a;
import java.lang.UnsupportedOperationException;
import androidx.recyclerview.widget.RecyclerView$LayoutManager$c;
import java.lang.Math;
import androidx.recyclerview.widget.GridLayoutManager$b;
import b2.d;
import b2.d$c;
import androidx.recyclerview.widget.RecyclerView;

public class GridLayoutManager extends LinearLayoutManager	// class@000872
{
    public boolean r;
    public int s;
    public int[] t;
    public View[] u;
    public final SparseIntArray v;
    public final SparseIntArray w;
    public GridLayoutManager$b x;
    public final Rect y;
    public boolean z;

    public void GridLayoutManager(Context p0,int p1){
       super(p0);
       this.r = false;
       this.s = -1;
       this.v = new SparseIntArray();
       this.w = new SparseIntArray();
       this.x = new GridLayoutManager$a();
       this.y = new Rect();
       this.setSpanCount(p1);
    }
    public void GridLayoutManager(Context p0,int p1,int p2,boolean p3){
       super(p0, p2, p3);
       this.r = false;
       this.s = -1;
       this.v = new SparseIntArray();
       this.w = new SparseIntArray();
       this.x = new GridLayoutManager$a();
       this.y = new Rect();
       this.setSpanCount(p1);
    }
    public void GridLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
       this.r = false;
       this.s = -1;
       this.v = new SparseIntArray();
       this.w = new SparseIntArray();
       this.x = new GridLayoutManager$a();
       this.y = new Rect();
       this.setSpanCount(RecyclerView$LayoutManager.getProperties(p0, p1, p2, p3).spanCount);
    }
    public static int[] Z0(int[] p0,int p1,int p2){
       int i4;
       int i = 1;
       if (p0 != null && (p0.length != (p1 + 1) || p0[(p0.length - i)] != p2)) {
          p0 = new int[(p1 + 1)];
       }
       int i1 = 0;
       p0[i1] = i1;
       int i2 = p2 / p1;
       p2 = p2 % p1;
       int i3 = 0;
       for (; i <= p1; i = i + 1) {
          i1 = i1 + p2;
          if (i1 > 0) {
             i4 = p1 - i1;
             if (i4 < p2) {
                i4 = i2 + 1;
                i1 = i1 - p1;
             label_0027 :
                i3 = i3 + i4;
                p0[i] = i3;
             }
          }
          i4 = i2;
          goto label_0027 ;
       }
       return p0;
    }
    public void D0(RecyclerView$t p0,RecyclerView$y p1,LinearLayoutManager$c p2,LinearLayoutManager$b p3){
       LinearLayoutManager$c d;
       int i3;
       int i6;
       object oobject1;
       int childMeasure;
       int b2;
       LinearLayoutManager$c b3;
       int i8;
       GridLayoutManager$LayoutParams layoutParams1;
       LinearLayoutManager$c uoc1;
       int i9;
       LinearLayoutManager linearLayout = this;
       RecyclerView$t ot = p0;
       RecyclerView$y oy = p1;
       LinearLayoutManager$c uoc = p2;
       LinearLayoutManager$b uob = p3;
       int i = linearLayout.d.m();
       int b = false;
       Rect rect = (i != 0x40000000)? 1: null;
       int i1 = (this.getChildCount() > 0)? linearLayout.t[linearLayout.s]: 0;
       if (rect) {
          this.n1();
       }
       boolean b1 = (uoc.e == true)? true: false;
       GridLayoutManager s = linearLayout.s;
       if (!b1) {
          s = linearLayout.h1(ot, oy, uoc.d) + linearLayout.i1(ot, oy, uoc.d);
       }
       int i2 = 0;
       while (true) {
          if (i2 < linearLayout.s && (uoc.c(oy) && s > 0)) {
             d = uoc.d;
             i3 = linearLayout.i1(ot, oy, d);
             if (i3 <= linearLayout.s) {
                s = s - i3;
                if (s < 0) {
                label_009d :
                   if (!i2) {
                      uob.b = true;
                      return;
                   }else {
                      float f = 0;
                      linearLayout.W0(ot, oy, i2, b1);
                      int i4 = 0;
                      int i5 = 0;
                      while (i4 < i2) {
                         object oobject = linearLayout.u[i4];
                         if (uoc.l == null) {
                            if (b1) {
                               linearLayout.addView(oobject);
                            }else {
                               linearLayout.addView(oobject, b);
                            }
                         }else if(b1){
                            linearLayout.addDisappearingView(oobject);
                         }else {
                            linearLayout.addDisappearingView(oobject, b);
                         }
                         linearLayout.calculateItemDecorationsForChild(oobject, linearLayout.y);
                         linearLayout.l1(oobject, i, b);
                         i6 = linearLayout.d.e(oobject);
                         if (i6 > i5) {
                            i5 = i6;
                         }
                         float f1 = (float)linearLayout.d.f(oobject) * 0x3f800000;
                         f1 = f1 / (float)oobject.getLayoutParams().b;
                         if (f1 - f > 0) {
                            f = f1;
                         }
                         i4 = i4 + 1;
                         b = false;
                      }
                      if (rect) {
                         linearLayout.k1(f, i1);
                         i4 = 0;
                         i5 = 0;
                         while (i4 < i2) {
                            oobject1 = linearLayout.u[i4];
                            linearLayout.l1(oobject1, 0x40000000, true);
                            i = linearLayout.d.e(oobject1);
                            if (i > i5) {
                               i5 = i;
                            }
                            i4 = i4 + 1;
                         }
                      }
                      i4 = 0;
                      while (i4 < i2) {
                         oobject1 = linearLayout.u[i4];
                         if (linearLayout.d.e(oobject1) != i5) {
                            GridLayoutManager$LayoutParams layoutParams = oobject1.getLayoutParams();
                            RecyclerView$LayoutParams mDecorInsets = layoutParams.mDecorInsets;
                            int i7 = mDecorInsets.top + mDecorInsets.bottom;
                            i7 = i7 + layoutParams.topMargin;
                            i7 = i7 + layoutParams.bottomMargin;
                            i1 = mDecorInsets.left + mDecorInsets.right;
                            i1 = i1 + layoutParams.leftMargin;
                            i1 = i1 + layoutParams.rightMargin;
                            b = linearLayout.f1(layoutParams.a, layoutParams.b);
                            if (linearLayout.b == true) {
                               b1 = 0x40000000;
                               childMeasure = RecyclerView$LayoutManager.getChildMeasureSpec(b, b1, i1, layoutParams.width, false);
                               b = i5 - i7;
                               b = View$MeasureSpec.makeMeasureSpec(b, b1);
                            }else {
                               b1 = 0x40000000;
                               i1 = i5 - i1;
                               b = RecyclerView$LayoutManager.getChildMeasureSpec(b, b1, i7, layoutParams.height, false);
                               childMeasure = View$MeasureSpec.makeMeasureSpec(i1, b1);
                            }
                            linearLayout.measureChildWithDecorationsAndMargin(oobject1, childMeasure, b, true);
                         }else {
                            b2 = false;
                         }
                         i4 = i4 + 1;
                      }
                      b2 = 0;
                      uob.a = i5;
                      GridLayoutManager gridLayoutMa = -1;
                      if (linearLayout.b == true) {
                         if (uoc.f == gridLayoutMa) {
                            b3 = uoc.b;
                            i5 = b3 - i5;
                         }else {
                            b3 = uoc.b;
                            uoc1 = b3;
                            b3 = i5 + b3;
                         }
                         i8 = i5;
                         layoutParams1 = null;
                         uoc1 = b3;
                         i4 = false;
                      }else if(uoc.f == gridLayoutMa){
                         b3 = uoc.b;
                         i5 = b3 - i5;
                         layoutParams1 = b3;
                         i4 = i5;
                      }else {
                         b3 = uoc.b;
                         i5 = i5 + b3;
                         layoutParams1 = i5;
                      }
                      uoc1 = 0;
                      i8 = null;
                      while (b2 < i2) {
                         object oobject2 = linearLayout.u[b2];
                         ViewGroup$LayoutParams layoutParams2 = oobject2.getLayoutParams();
                         if (linearLayout.b == true) {
                            if (this.isLayoutRTL()) {
                               childMeasure = linearLayout.s - layoutParams2.a;
                               i4 = this.getPaddingLeft() + linearLayout.t[childMeasure];
                               i = i4 - linearLayout.d.f(oobject2);
                            }else {
                               i = linearLayout.t[layoutParams2.a] + this.getPaddingLeft();
                               i4 = linearLayout.d.f(oobject2) + i;
                            }
                            i9 = i4;
                            d = uoc1;
                            i3 = i8;
                            b1 = i;
                         }else {
                            i5 = this.getPaddingTop() + linearLayout.t[layoutParams2.a];
                            i8 = linearLayout.d.f(oobject2) + i5;
                            b1 = i4;
                            i3 = i5;
                            i6 = i8;
                            i9 = layoutParams1;
                         }
                         this.layoutDecoratedWithMargins(oobject2, b1, i3, i9, d);
                         if (layoutParams2.isItemRemoved() || layoutParams2.isItemChanged()) {
                            uob.c = true;
                         }
                         i4 = uob.d | oobject2.hasFocusable();
                         uob.d = i4;
                         b2 = b2 + 1;
                         i4 = b1;
                         uoc1 = d;
                         i8 = i3;
                         layoutParams1 = i9;
                      }
                      Arrays.fill(linearLayout.u, null);
                      return;
                   }
                }else {
                   View view = uoc.d(ot);
                   if (view == null) {
                      goto label_009d ;
                   }else {
                      linearLayout.u[i2] = view;
                      i2 = i2 + 1;
                      GridLayoutManager gridLayoutMa1 = 0x40000000;
                   }
                }
             }else {
                break ;
             }
          }else {
             goto label_009d ;
          }
       }
       throw new IllegalArgumentException("Item at position "+d+" requires "+i3+" spans but GridLayoutManager has only "+linearLayout.s+" spans.");
    }
    public void F0(RecyclerView$t p0,RecyclerView$y p1,LinearLayoutManager$a p2,int p3){
       this.n1();
       if (p1.c() > 0 && !p1.g()) {
          this.d1(p0, p1, p2, p3);
       }
       this.e1();
       return;
    }
    public void N0(boolean p0){
       if (p0) {
          throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
       }
       super.N0(false);
       return;
    }
    public void O(RecyclerView$y p0,LinearLayoutManager$c p1,RecyclerView$LayoutManager$c p2){
       GridLayoutManager ts = this.s;
       for (int i = 0; i < this.s && (p1.c(p0) && ts > 0); i = i + 1) {
          LinearLayoutManager$c d = p1.d;
          p2.a(d, Math.max(0, p1.g));
          ts = ts - this.x.f(d);
          int i1 = p1.d + p1.e;
          p1.d = i1;
       }
       return;
    }
    public final void W0(RecyclerView$t p0,RecyclerView$y p1,int p2,boolean p3){
       int i2;
       int i = 0;
       int i1 = -1;
       if (p3) {
          i1 = p2;
          p2 = 0;
          i2 = 1;
       }else {
          p2--;
          i2 = -1;
       }
       while (p2 != i1) {
          object oobject = this.u[p2];
          GridLayoutManager$LayoutParams layoutParams = oobject.getLayoutParams();
          int i3 = this.i1(p0, p1, this.getPosition(oobject));
          layoutParams.b = i3;
          layoutParams.a = i;
          i = i + i3;
          p2 = p2 + i2;
       }
       return;
    }
    public final void X0(){
       int childCount = this.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          GridLayoutManager$LayoutParams layoutParams = this.getChildAt(i).getLayoutParams();
          int viewLayoutPo = layoutParams.getViewLayoutPosition();
          this.v.put(viewLayoutPo, layoutParams.b());
          this.w.put(viewLayoutPo, layoutParams.a());
       }
       return;
    }
    public final void Y0(int p0){
       this.t = GridLayoutManager.Z0(this.t, this.s, p0);
    }
    public View Z(RecyclerView$t p0,RecyclerView$y p1,boolean p2,boolean p3){
       int childCount = this.getChildCount();
       int i = -1;
       int i1 = 1;
       if (p3) {
          childCount = this.getChildCount() - i1;
          i1 = -1;
       }else {
          i = childCount;
          childCount = 0;
       }
       int i2 = p1.c();
       this.ensureLayoutState();
       int i3 = this.d.n();
       int i4 = this.d.i();
       View view = null;
       int i5 = view;
       while (true) {
          if (childCount != i) {
             View childAt = this.getChildAt(childCount);
             int position = this.getPosition(childAt);
             if (position < 0 || (position < i2 && !this.h1(p0, p1, position))) {
                if (childAt.getLayoutParams().isItemRemoved()) {
                   if (i5 == null) {
                      i5 = childAt;
                   }
                }else if(this.d.g(childAt) >= i4 || this.d.d(childAt) < i3){
                   if (view == null) {
                      view = childAt;
                   }
                }else {
                   return childAt;
                }
             }
             childCount = childCount + i1;
          }else if(view != null){
             view = i5;
             break ;
          }
          break ;
       }
       return view;
    }
    public final void a1(){
       this.v.clear();
       this.w.clear();
    }
    public final int b1(RecyclerView$y p0){
       int i = 0;
       if (this.getChildCount() && p0.c()) {
          this.ensureLayoutState();
          boolean b = this.k();
          View view = this.T((b ^ 0x01), true);
          View view1 = this.S((b ^ 0x01), true);
          if (view != null && view1 != null) {
             int i1 = this.x.b(this.getPosition(view), this.s);
             int i2 = this.x.b(this.getPosition(view1), this.s);
             int i3 = Math.min(i1, i2);
             i1 = Math.max(i1, i2);
             int i4 = this.x.b((p0.c() - true), this.s) + true;
             i4 = (this.g != null)? Math.max(i, ((i4 - i1) - true)): Math.max(i, i3);
             if (!b) {
                return i4;
             }else {
                return Math.round((((float)i4 * ((float)Math.abs((this.d.d(view1) - this.d.g(view))) / (float)((this.x.b(this.getPosition(view1), this.s) - this.x.b(this.getPosition(view), this.s)) + true))) + (float)(this.d.n() - this.d.g(view))));
             }
          }
       }
       return i;
    }
    public final int c1(RecyclerView$y p0){
       int i = 0;
       if (this.getChildCount() && p0.c()) {
          this.ensureLayoutState();
          View view = this.T((this.k() ^ 1), 1);
          View view1 = this.S((this.k() ^ 1), 1);
          if (view != null && view1 != null) {
             if (!this.k()) {
                return (this.x.b((p0.c() - 1), this.s) + 1);
             }else {
                return (int)(((float)(this.d.d(view1) - this.d.g(view)) / (float)((this.x.b(this.getPosition(view1), this.s) - this.x.b(this.getPosition(view), this.s)) + 1)) * (float)(this.x.b((p0.c() - 1), this.s) + 1));
             }
          }
       }
       return i;
    }
    public boolean checkLayoutParams(RecyclerView$LayoutParams p0){
       return p0 instanceof GridLayoutManager$LayoutParams;
    }
    public int computeHorizontalScrollOffset(RecyclerView$y p0){
       if (this.z != null) {
          return this.b1(p0);
       }
       return super.computeHorizontalScrollOffset(p0);
    }
    public int computeHorizontalScrollRange(RecyclerView$y p0){
       if (this.z != null) {
          return this.c1(p0);
       }
       return super.computeHorizontalScrollRange(p0);
    }
    public int computeVerticalScrollOffset(RecyclerView$y p0){
       if (this.z != null) {
          return this.b1(p0);
       }
       return super.computeVerticalScrollOffset(p0);
    }
    public int computeVerticalScrollRange(RecyclerView$y p0){
       if (this.z != null) {
          return this.c1(p0);
       }
       return super.computeVerticalScrollRange(p0);
    }
    public final void d1(RecyclerView$t p0,RecyclerView$y p1,LinearLayoutManager$a p2,int p3){
       int i = 1;
       LinearLayoutManager$a uoa = (p3 == i)? 1: null;
       int i1 = this.h1(p0, p1, p2.b);
       if (uoa) {
          while (i1 > 0) {
             uoa = p2.b;
             if (uoa > null) {
                uoa--;
                p2.b = uoa;
                i1 = this.h1(p0, p1, uoa);
             }
          }
       }else {
          uoa = p1.c() - i;
          LinearLayoutManager$a b = p2.b;
          while (b < uoa) {
             int i2 = b + 1;
             int i3 = this.h1(p0, p1, i2);
             if (i3 > i1) {
                b = i2;
                i1 = i3;
             }else {
                break ;
             }
          }
          p2.b = b;
       }
       return;
    }
    public final void e1(){
       GridLayoutManager tu = this.u;
       if (tu == null || tu.length != this.s) {
          View[] viewArray = new View[this.s];
          this.u = viewArray;
       }
       return;
    }
    public int f1(int p0,int p1){
       GridLayoutManager tt;
       if (this.b == 1 && this.isLayoutRTL()) {
          tt = this.t;
          GridLayoutManager ts = this.s;
          return (tt[(ts - p0)] - tt[((ts - p0) - p1)]);
       }else {
          tt = this.t;
          return (tt[(p1 + p0)] - tt[p0]);
       }
    }
    public final int g1(RecyclerView$t p0,RecyclerView$y p1,int p2){
       if (!p1.g()) {
          return this.x.b(p2, this.s);
       }
       int i = p0.f(p2);
       if (i == -1) {
          return 0;
       }
       return this.x.b(i, this.s);
    }
    public RecyclerView$LayoutParams generateDefaultLayoutParams(){
       if (this.b == null) {
          return new GridLayoutManager$LayoutParams(-2, -1);
       }
       return new GridLayoutManager$LayoutParams(-1, -2);
    }
    public RecyclerView$LayoutParams generateLayoutParams(Context p0,AttributeSet p1){
       return new GridLayoutManager$LayoutParams(p0, p1);
    }
    public RecyclerView$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       if (p0 instanceof ViewGroup$MarginLayoutParams) {
          return new GridLayoutManager$LayoutParams(p0);
       }
       return new GridLayoutManager$LayoutParams(p0);
    }
    public int getColumnCountForAccessibility(RecyclerView$t p0,RecyclerView$y p1){
       if (this.b == 1) {
          return this.s;
       }
       if (p1.c() < 1) {
          return 0;
       }
       return (this.g1(p0, p1, (p1.c() - 1)) + 1);
    }
    public int getRowCountForAccessibility(RecyclerView$t p0,RecyclerView$y p1){
       if (this.b == null) {
          return this.s;
       }
       if (p1.c() < 1) {
          return 0;
       }
       return (this.g1(p0, p1, (p1.c() - 1)) + 1);
    }
    public int getSpanCount(){
       return this.s;
    }
    public final int h1(RecyclerView$t p0,RecyclerView$y p1,int p2){
       if (!p1.g()) {
          return this.x.c(p2, this.s);
       }
       int i = this.w.get(p2, -1);
       if (i != -1) {
          return i;
       }
       int i1 = p0.f(p2);
       if (i1 == -1) {
          return 0;
       }
       return this.x.c(i1, this.s);
    }
    public final int i1(RecyclerView$t p0,RecyclerView$y p1,int p2){
       if (!p1.g()) {
          return this.x.f(p2);
       }
       int i = this.v.get(p2, -1);
       if (i != -1) {
          return i;
       }
       int i1 = p0.f(p2);
       if (i1 == -1) {
          return 1;
       }
       return this.x.f(i1);
    }
    public GridLayoutManager$b j1(){
       return this.x;
    }
    public final void k1(float p0,int p1){
       this.Y0(Math.max(Math.round((p0 * (float)this.s)), p1));
    }
    public final void l1(View p0,int p1,boolean p2){
       int childMeasure;
       GridLayoutManager$LayoutParams layoutParams = p0.getLayoutParams();
       RecyclerView$LayoutParams mDecorInsets = layoutParams.mDecorInsets;
       int i = ((mDecorInsets.top + mDecorInsets.bottom) + layoutParams.topMargin) + layoutParams.bottomMargin;
       int i1 = ((mDecorInsets.left + mDecorInsets.right) + layoutParams.leftMargin) + layoutParams.rightMargin;
       int i2 = this.f1(layoutParams.a, layoutParams.b);
       if (this.b == true) {
          p1 = RecyclerView$LayoutManager.getChildMeasureSpec(i2, p1, i1, layoutParams.width, false);
          childMeasure = RecyclerView$LayoutManager.getChildMeasureSpec(this.d.o(), this.getHeightMode(), i, layoutParams.height, true);
       }else {
          childMeasure = RecyclerView$LayoutManager.getChildMeasureSpec(i2, p1, i, layoutParams.height, false);
          p1 = RecyclerView$LayoutManager.getChildMeasureSpec(this.d.o(), this.getWidthMode(), i1, layoutParams.width, true);
       }
       this.measureChildWithDecorationsAndMargin(p0, p1, childMeasure, p2);
       return;
    }
    public void m1(GridLayoutManager$b p0){
       this.x = p0;
    }
    public final void measureChildWithDecorationsAndMargin(View p0,int p1,int p2,boolean p3){
       RecyclerView$LayoutParams layoutParams = p0.getLayoutParams();
       p3 = (p3)? this.shouldReMeasureChild(p0, p1, p2, layoutParams): this.shouldMeasureChild(p0, p1, p2, layoutParams);
       if (p3) {
          p0.measure(p1, p2);
       }
       return;
    }
    public final void n1(){
       int i;
       int paddingLeft;
       if (this.getOrientation() == 1) {
          i = this.getWidth() - this.getPaddingRight();
          paddingLeft = this.getPaddingLeft();
       }else {
          i = this.getHeight() - this.getPaddingBottom();
          paddingLeft = this.getPaddingTop();
       }
       this.Y0((i - paddingLeft));
       return;
    }
    public View onFocusSearchFailed(View p0,int p1,RecyclerView$t p2,RecyclerView$y p3){
       boolean i3;
       int i4;
       View view3;
       View view4;
       int i12;
       int i13;
       GridLayoutManager$LayoutParams layoutParams1;
       LinearLayoutManager linearLayout = this;
       RecyclerView$t ot = p2;
       RecyclerView$y oy = p3;
       View view = this.findContainingItemView(p0);
       View view1 = null;
       if (view == null) {
          return view1;
       }
       GridLayoutManager$LayoutParams layoutParams = view.getLayoutParams();
       GridLayoutManager$LayoutParams a = layoutParams.a;
       int i = layoutParams.b + a;
       if (super.onFocusSearchFailed(p0, p1, p2, p3) == null) {
          return view1;
       }
       int i1 = 1;
       int i2 = (linearLayout.convertFocusDirectionToLayoutDirection(p1) == i1)? 1: 0;
       i2 = (i2 != linearLayout.g)? 1: 0;
       if (i2) {
          i2 = this.getChildCount() - i1;
          i3 = -1;
          i4 = -1;
       }else {
          i3 = this.getChildCount();
          i2 = 0;
          i4 = 1;
       }
       int i5 = (linearLayout.b == i1 && this.isLayoutRTL())? 1: 0;
       int i6 = linearLayout.g1(ot, oy, i2);
       int i7 = i2;
       int i8 = 0;
       int i9 = -1;
       int i10 = -1;
       int i11 = 0;
       View view2 = view1;
       while (true) {
          if (i7 != i3) {
             i1 = linearLayout.g1(ot, oy, i7);
             View childAt = linearLayout.getChildAt(i7);
             if (childAt == view) {
             label_0149 :
                view3 = view2;
                if (view1 == null) {
                   view1 = view3;
                   break ;
                }
                break ;
             }else if(childAt.hasFocusable() && i1 != i6){
                if (view1 != null) {
                   goto label_0149 ;
                }else {
                   view4 = view;
                   view3 = view2;
                   i12 = i8;
                   i13 = i3;
                   layoutParams1 = i10;
                   i8 = i11;
                label_0135 :
                   i10 = layoutParams1;
                   i11 = i8;
                   i8 = i12;
                   view2 = view3;
                }
             }else {
                GridLayoutManager$LayoutParams layoutParams2 = childAt.getLayoutParams();
                GridLayoutManager$LayoutParams a1 = layoutParams2.a;
                view4 = view;
                int i14 = layoutParams2.b + a1;
                if (childAt.hasFocusable() && (a1 == a && i14 == i)) {
                   return childAt;
                }else if(!childAt.hasFocusable() || (view1 == null || (!childAt.hasFocusable() && view2 == null))){
                   view3 = view2;
                }else {
                   view3 = view2;
                   i2 = Math.min(i14, i) - Math.max(a1, a);
                   if (childAt.hasFocusable()) {
                      if (i2 <= i8) {
                         if (i2 == i8) {
                            layoutParams1 = (a1 > i9)? 1: 0;
                            if (i5 != layoutParams1) {
                            label_00fc :
                               i12 = i8;
                               i13 = i3;
                            label_0100 :
                               layoutParams1 = i10;
                               i8 = i11;
                            label_0104 :
                               i3 = false;
                            label_0105 :
                               if (i3) {
                                  if (childAt.hasFocusable()) {
                                     int i15 = Math.min(i14, i) - Math.max(a1, a);
                                     i9 = layoutParams2.a;
                                     i10 = layoutParams1;
                                     i11 = i8;
                                     view2 = view3;
                                     view1 = childAt;
                                     i8 = i15;
                                  }else {
                                     i11 = Math.min(i14, i) - Math.max(a1, a);
                                     i10 = layoutParams2.a;
                                     i8 = i12;
                                     view2 = childAt;
                                  }
                               }else {
                                  goto label_0135 ;
                               }
                            }
                         }else {
                            goto label_00fc ;
                         }
                      }
                   }else if(view1 == null){
                      i12 = i8;
                      i13 = i3;
                      i3 = true;
                      if (linearLayout.isViewPartiallyVisible(childAt, false, i3)) {
                         i8 = i11;
                         if (i2 > i8) {
                            layoutParams1 = i10;
                            goto label_0105 ;
                         }else if(i2 == i8){
                            layoutParams1 = i10;
                            if (a1 <= layoutParams1) {
                               i3 = false;
                            }
                            if (i5 == i3) {
                            label_00b8 :
                               i3 = true;
                               goto label_0105 ;
                            }else {
                               goto label_0104 ;
                            }
                         }else {
                            layoutParams1 = i10;
                            goto label_0104 ;
                         }
                      }else {
                         goto label_0100 ;
                      }
                   }else {
                      goto label_00fc ;
                   }
                }
                i12 = i8;
                i13 = i3;
                layoutParams1 = i10;
                i8 = i11;
                goto label_00b8 ;
             }
             i7 = i7 + i4;
             ot = p2;
             oy = p3;
             view = view4;
             i3 = i13;
             i1 = 1;
          }else {
             goto label_0149 ;
          }
       }
       return view1;
    }
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView$t p0,RecyclerView$y p1,View p2,d p3){
       ViewGroup$LayoutParams layoutParams = p2.getLayoutParams();
       if (!layoutParams instanceof GridLayoutManager$LayoutParams) {
          super.onInitializeAccessibilityNodeInfoForItem(p2, p3);
          return;
       }else {
          int i = this.g1(p0, p1, layoutParams.getViewLayoutPosition());
          if (this.b == null) {
             p3.d0(d$c.b(layoutParams.a(), layoutParams.b(), i, 1, false, false));
          }else {
             p3.d0(d$c.b(i, 1, layoutParams.a(), layoutParams.b(), false, false));
          }
          return;
       }
    }
    public void onItemsAdded(RecyclerView p0,int p1,int p2){
       this.x.h();
       this.x.g();
    }
    public void onItemsChanged(RecyclerView p0){
       this.x.h();
       this.x.g();
    }
    public void onItemsMoved(RecyclerView p0,int p1,int p2,int p3){
       this.x.h();
       this.x.g();
    }
    public void onItemsRemoved(RecyclerView p0,int p1,int p2){
       this.x.h();
       this.x.g();
    }
    public void onItemsUpdated(RecyclerView p0,int p1,int p2,Object p3){
       this.x.h();
       this.x.g();
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       if (p1.g()) {
          this.X0();
       }
       super.onLayoutChildren(p0, p1);
       this.a1();
       return;
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       super.onLayoutCompleted(p0);
       this.r = false;
    }
    public int scrollHorizontallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       this.n1();
       this.e1();
       return super.scrollHorizontallyBy(p0, p1, p2);
    }
    public int scrollVerticallyBy(int p0,RecyclerView$t p1,RecyclerView$y p2){
       this.n1();
       this.e1();
       return super.scrollVerticallyBy(p0, p1, p2);
    }
    public void setMeasuredDimension(Rect p0,int p1,int p2){
       int i2;
       if (this.t == null) {
          super.setMeasuredDimension(p0, p1, p2);
       }
       int i = this.getPaddingLeft() + this.getPaddingRight();
       int i1 = this.getPaddingTop() + this.getPaddingBottom();
       if (this.b == 1) {
          i2 = RecyclerView$LayoutManager.chooseSize(p2, (p0.height() + i1), this.getMinimumHeight());
          GridLayoutManager tt = this.t;
          p1 = RecyclerView$LayoutManager.chooseSize(p1, (tt[(tt.length - 1)] + i), this.getMinimumWidth());
       }else {
          p1 = RecyclerView$LayoutManager.chooseSize(p1, (p0.width() + i), this.getMinimumWidth());
          GridLayoutManager tt1 = this.t;
          i2 = RecyclerView$LayoutManager.chooseSize(p2, (tt1[(tt1.length - 1)] + i1), this.getMinimumHeight());
       }
       this.setMeasuredDimension(p1, i2);
       return;
    }
    public void setSpanCount(int p0){
       if (p0 == this.s) {
          return;
       }
       boolean b = true;
       this.r = b;
       if (p0 < b) {
          throw new IllegalArgumentException("Span count should be at least 1. Provided "+p0);
       }
       this.s = p0;
       this.x.h();
       this.requestLayout();
       return;
    }
    public boolean supportsPredictiveItemAnimations(){
       boolean b = (this.m == null && this.r == null)? true: false;
       return b;
    }
}
