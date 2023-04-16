package androidx.appcompat.widget.LinearLayoutCompat;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import w0.x;
import android.content.res.TypedArray;
import android.view.View;
import a2.i0;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.LinearLayoutCompat$LayoutParams;
import java.lang.RuntimeException;
import java.lang.String;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Canvas;
import w0.b0;
import android.view.View$MeasureSpec;
import android.view.accessibility.AccessibilityEvent;
import java.lang.CharSequence;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Math;
import a2.g;

public class LinearLayoutCompat extends ViewGroup	// class@000604
{
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;
    public boolean i;
    public int[] j;
    public int[] k;
    public Drawable l;
    public int m;
    public int n;
    public int o;
    public int p;

    public void LinearLayoutCompat(Context p0){
       super(p0, null);
    }
    public void LinearLayoutCompat(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LinearLayoutCompat(Context p0,AttributeSet p1,int p2){
       int[] p2;
       super(p0, p1, p2);
       this.b = true;
       this.c = -1;
       this.d = 0;
       this.f = 0x800033;
       p2 = c$b.p2;
       x ox = x.v(p0, p1, p2, p2, 0);
       i0.q0(this, p0, p2, p1, ox.r(), p2, 0);
       boolean i = ox.k(true, -1);
       if (i >= 0) {
          this.setOrientation(i);
       }
       i = ox.k(0, -1);
       if (i >= 0) {
          this.setGravity(i);
       }
       i = ox.a(2, true);
       if (!i) {
          this.setBaselineAligned(i);
       }
       this.h = ox.i(4, 0xbf800000);
       this.c = ox.k(3, -1);
       this.i = ox.a(7, 0);
       this.setDividerDrawable(ox.g(5));
       this.o = ox.k(8, 0);
       this.p = ox.f(6, 0);
       ox.w();
       return;
    }
    private void A(View p0,int p1,int p2,int p3,int p4){
       p0.layout(p1, p2, (p3 + p1), (p4 + p2));
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       return p0 instanceof LinearLayoutCompat$LayoutParams;
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return this.q();
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.r(p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return this.s(p0);
    }
    public int getBaseline(){
       if (this.c < null) {
          return super.getBaseline();
       }
       LinearLayoutCompat tc = this.c;
       if (this.getChildCount() <= tc) {
          throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
       }
       View childAt = this.getChildAt(tc);
       int baseline = childAt.getBaseline();
       int i = -1;
       if (baseline == i) {
          if (this.c == null) {
             return i;
          }else {
             throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline.");
          }
       }else {
          LinearLayoutCompat td = this.d;
          if (this.e == 1) {
             int i1 = this.f & 0x70;
             if (i1 != 48) {
                if (i1 != 16) {
                   if (i1 == 80) {
                      td = ((this.getBottom() - this.getTop()) - this.getPaddingBottom()) - this.g;
                   }
                }else {
                   td = td + (((((this.getBottom() - this.getTop()) - this.getPaddingTop()) - this.getPaddingBottom()) - this.g) / 2);
                }
             }
          }
          return ((td + childAt.getLayoutParams().topMargin) + baseline);
       }
    }
    public int getBaselineAlignedChildIndex(){
       return this.c;
    }
    public Drawable getDividerDrawable(){
       return this.l;
    }
    public int getDividerPadding(){
       return this.p;
    }
    public int getDividerWidth(){
       return this.m;
    }
    public int getGravity(){
       return this.f;
    }
    public int getOrientation(){
       return this.e;
    }
    public int getShowDividers(){
       return this.o;
    }
    public int getVirtualChildCount(){
       return this.getChildCount();
    }
    public float getWeightSum(){
       return this.h;
    }
    public void h(Canvas p0){
       int i1;
       LinearLayoutCompat tm;
       int virtualChild = this.getVirtualChildCount();
       boolean b = b0.b(this);
       int i = 0;
       while (i < virtualChild) {
          View view = this.t(i);
          if (view != null && (view.getVisibility() != 8 && this.u(i))) {
             LinearLayoutCompat$LayoutParams layoutParams = view.getLayoutParams();
             if (b) {
                i1 = view.getRight() + layoutParams.rightMargin;
             }else {
                i1 = view.getLeft() - layoutParams.leftMargin;
                i1 = i1 - this.m;
             }
             this.n(p0, i1);
          }
       label_003c :
          i = i + 1;
       }
       if (this.u(virtualChild)) {
          View view1 = this.t((virtualChild - 1));
          if (view1 == null) {
             if (b) {
                virtualChild = this.getPaddingLeft();
             }else {
                virtualChild = this.getWidth() - this.getPaddingRight();
                tm = this.m;
             label_0071 :
                virtualChild = virtualChild - tm;
             }
          }else {
             LinearLayoutCompat$LayoutParams layoutParams1 = view1.getLayoutParams();
             if (b) {
                virtualChild = view1.getLeft() - layoutParams1.leftMargin;
                tm = this.m;
                goto label_0071 ;
             }else {
                virtualChild = view1.getRight() + layoutParams1.rightMargin;
             }
          }
          this.n(p0, virtualChild);
       }
       return;
    }
    public void l(Canvas p0){
       int virtualChild = this.getVirtualChildCount();
       int i = 0;
       while (i < virtualChild) {
          View view = this.t(i);
          if (view != null && (view.getVisibility() != 8 && this.u(i))) {
             int i1 = view.getTop() - view.getLayoutParams().topMargin;
             i1 = i1 - this.n;
             this.m(p0, i1);
          }
       label_002e :
          i = i + 1;
       }
       if (this.u(virtualChild)) {
          View view1 = this.t((virtualChild - 1));
          virtualChild = (view1 == null)? (this.getHeight() - this.getPaddingBottom()) - this.n: view1.getBottom() + view1.getLayoutParams().bottomMargin;
          this.m(p0, virtualChild);
       }
       return;
    }
    public void m(Canvas p0,int p1){
       this.l.setBounds((this.getPaddingLeft() + this.p), p1, ((this.getWidth() - this.getPaddingRight()) - this.p), (this.n + p1));
       this.l.draw(p0);
    }
    public void n(Canvas p0,int p1){
       this.l.setBounds(p1, (this.getPaddingTop() + this.p), (this.m + p1), ((this.getHeight() - this.getPaddingBottom()) - this.p));
       this.l.draw(p0);
    }
    public final void o(int p0,int p1){
       int i = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0x40000000);
       int i1 = 0;
       while (i1 < p0) {
          View view = this.t(i1);
          if (view.getVisibility() != 8) {
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             if (layoutParams.height == -1) {
                ViewGroup$MarginLayoutParams width = layoutParams.width;
                layoutParams.width = view.getMeasuredWidth();
                this.measureChildWithMargins(view, p1, 0, i, 0);
                layoutParams.width = width;
             }
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (this.l == null) {
          return;
       }
       if (this.e == 1) {
          this.l(p0);
       }else {
          this.h(p0);
       }
       return;
    }
    public void onInitializeAccessibilityEvent(AccessibilityEvent p0){
       super.onInitializeAccessibilityEvent(p0);
       p0.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo p0){
       super.onInitializeAccessibilityNodeInfo(p0);
       p0.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (this.e == 1) {
          this.w(p1, p2, p3, p4);
       }else {
          this.v(p1, p2, p3, p4);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (this.e == 1) {
          this.z(p0, p1);
       }else {
          this.y(p0, p1);
       }
       return;
    }
    public final void p(int p0,int p1){
       int i = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000);
       int i1 = 0;
       while (i1 < p0) {
          View view = this.t(i1);
          if (view.getVisibility() != 8) {
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             if (layoutParams.width == -1) {
                ViewGroup$MarginLayoutParams height = layoutParams.height;
                layoutParams.height = view.getMeasuredHeight();
                this.measureChildWithMargins(view, i, 0, p1, 0);
                layoutParams.height = height;
             }
          }
          i1 = i1 + 1;
       }
       return;
    }
    public LinearLayoutCompat$LayoutParams q(){
       LinearLayoutCompat te = this.e;
       if (te == null) {
          return new LinearLayoutCompat$LayoutParams(-2, -2);
       }
       if (te == 1) {
          return new LinearLayoutCompat$LayoutParams(-1, -2);
       }
       return null;
    }
    public LinearLayoutCompat$LayoutParams r(AttributeSet p0){
       return new LinearLayoutCompat$LayoutParams(this.getContext(), p0);
    }
    public LinearLayoutCompat$LayoutParams s(ViewGroup$LayoutParams p0){
       return new LinearLayoutCompat$LayoutParams(p0);
    }
    public void setBaselineAligned(boolean p0){
       this.b = p0;
    }
    public void setBaselineAlignedChildIndex(int p0){
       if (p0 < 0 || p0 >= this.getChildCount()) {
          throw new IllegalArgumentException("base aligned child index out of range \(0, "+this.getChildCount()+"\)");
       }
       this.c = p0;
       return;
    }
    public void setDividerDrawable(Drawable p0){
       if (p0 == this.l) {
          return;
       }
       this.l = p0;
       boolean b = false;
       if (p0 != null) {
          this.m = p0.getIntrinsicWidth();
          this.n = p0.getIntrinsicHeight();
       }else {
          this.m = b;
          this.n = b;
       }
       if (p0 == null) {
          b = true;
       }
       this.setWillNotDraw(b);
       this.requestLayout();
       return;
    }
    public void setDividerPadding(int p0){
       this.p = p0;
    }
    public void setGravity(int p0){
       if (this.f != p0) {
          if (!(0x800007 & p0)) {
             p0 = p0 | 0x800003;
          }
          if (!(p0 & 0x70)) {
             p0 = p0 | 0x30;
          }
          this.f = p0;
          this.requestLayout();
       }
       return;
    }
    public void setHorizontalGravity(int p0){
       p0 = p0 & 0x800007;
       LinearLayoutCompat tf = this.f;
       if ((0x800007 & tf) != p0) {
          this.f = p0 | (-8388616 & tf);
          this.requestLayout();
       }
       return;
    }
    public void setMeasureWithLargestChildEnabled(boolean p0){
       this.i = p0;
    }
    public void setOrientation(int p0){
       if (this.e != p0) {
          this.e = p0;
          this.requestLayout();
       }
       return;
    }
    public void setShowDividers(int p0){
       if (p0 != this.o) {
          this.requestLayout();
       }
       this.o = p0;
       return;
    }
    public void setVerticalGravity(int p0){
       p0 = p0 & 0x70;
       LinearLayoutCompat tf = this.f;
       if ((tf & 0x70) != p0) {
          this.f = p0 | (tf & 0x8f);
          this.requestLayout();
       }
       return;
    }
    public void setWeightSum(float p0){
       this.h = Math.max(0, p0);
    }
    public boolean shouldDelayChildPressedState(){
       return false;
    }
    public View t(int p0){
       return this.getChildAt(p0);
    }
    public boolean u(int p0){
       boolean b = false;
       if (!p0) {
          if (this.o & 1) {
             b = true;
          }
          return b;
       }else if(p0 == this.getChildCount()){
          if (this.o & 0x04) {
             b = true;
          }
          return b;
       }else if(this.o & 0x02){
          p0 = p0 - 1;
          while (p0 >= 0) {
             if (this.getChildAt(p0).getVisibility() != 8) {
                b = true;
                break ;
             }
             p0--;
          }
       }
       return b;
    }
    public void v(int p0,int p1,int p2,int p3){
       int i6;
       int i7;
       int i9;
       int i10;
       int i11;
       int i12;
       int i13;
       LinearLayoutCompat linearLayout = this;
       int b = b0.b(this);
       int paddingTop = this.getPaddingTop();
       int i = p3 - p1;
       int i1 = i - this.getPaddingBottom();
       int i2 = (i - paddingTop) - this.getPaddingBottom();
       int virtualChild = this.getVirtualChildCount();
       LinearLayoutCompat f = linearLayout.f;
       int i3 = 0x800007 & f;
       int i4 = f & 0x70;
       LinearLayoutCompat b1 = linearLayout.b;
       LinearLayoutCompat j = linearLayout.j;
       LinearLayoutCompat k = linearLayout.k;
       i = g.b(i3, i0.B(this));
       int i5 = 2;
       if (i != 1) {
          i = (i != 5)? this.getPaddingLeft(): ((this.getPaddingLeft() + p2) - p0) - linearLayout.g;
       }else {
          i = this.getPaddingLeft() + (((p2 - p0) - linearLayout.g) / i5);
       }
       if (b) {
          i6 = virtualChild - 1;
          i7 = -1;
       }else {
          i6 = 0;
          i7 = 1;
       }
       int i8 = 0;
       while (i8 < virtualChild) {
          b = i7 * i8;
          b = i6 + b;
          View view = linearLayout.t(b);
          if (view == null) {
             i = i + 0;
          }else if(view.getVisibility() != 8){
             i5 = view.getMeasuredWidth();
             int measuredHeig = view.getMeasuredHeight();
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             i12 = i8;
             if (b1 != null) {
                i9 = virtualChild;
                if (layoutParams.height != -1) {
                   virtualChild = view.getBaseline();
                label_00a1 :
                   LinearLayoutCompat$LayoutParams b2 = layoutParams.b;
                   if (b2 < null) {
                      b2 = i4;
                   }
                   i8 = b2 & 0x70;
                   i10 = i4;
                   if (i8 != 16) {
                      if (i8 != 48) {
                         if (i8 != 80) {
                            i8 = paddingTop;
                            ViewGroup$LayoutParams layoutParams1 = -1;
                         }else {
                            i8 = i1 - measuredHeig;
                            i8 = i8 - layoutParams.bottomMargin;
                            if (virtualChild != -1) {
                               i13 = view.getMeasuredHeight() - virtualChild;
                               i11 = k[2] - i13;
                               i8 = i8 - i11;
                            }
                         }
                      }else {
                         i8 = layoutParams.topMargin + paddingTop;
                         if (virtualChild != -1) {
                            i11 = j[1] - virtualChild;
                            i8 = i8 + i11;
                         }
                      }
                      i13 = 1;
                   }else {
                      i8 = i2 - measuredHeig;
                      i8 = i8 / 2;
                      i8 = i8 + paddingTop;
                      i8 = i8 + layoutParams.topMargin;
                      i8 = i8 - layoutParams.bottomMargin;
                   }
                   if (linearLayout.u(b)) {
                      i = i + linearLayout.m;
                   }
                   virtualChild = i + layoutParams.leftMargin;
                   i11 = virtualChild + 0;
                   i3 = i11;
                   this.A(view, i3, i8, i5, measuredHeig);
                   i5 = i5 + layoutParams.rightMargin;
                   i5 = i5 + 0;
                   virtualChild = virtualChild + i5;
                   i8 = i12 + 0;
                   i = virtualChild;
                label_011e :
                   i8 = i8 + 1;
                   virtualChild = i9;
                   i4 = i10;
                   i5 = 2;
                }
             }else {
                i9 = virtualChild;
             }
             virtualChild = -1;
             goto label_00a1 ;
          }else {
             i12 = i8;
          }
          i9 = virtualChild;
          i10 = i4;
          i11 = -1;
          goto label_011e ;
       }
       return;
    }
    public void w(int p0,int p1,int p2,int p3){
       ViewGroup$MarginLayoutParams rightMargin;
       LinearLayoutCompat linearLayout = this;
       int paddingLeft = this.getPaddingLeft();
       int i = p2 - p0;
       int i1 = i - this.getPaddingRight();
       int i2 = (i - paddingLeft) - this.getPaddingRight();
       int virtualChild = this.getVirtualChildCount();
       LinearLayoutCompat f = linearLayout.f;
       int i3 = f & 0x70;
       int i4 = f & 0x800007;
       if (i3 != 16) {
          i = (i3 != 80)? this.getPaddingTop(): ((this.getPaddingTop() + p3) - p1) - linearLayout.g;
       }else {
          i = this.getPaddingTop() + (((p3 - p1) - linearLayout.g) / 2);
       }
       for (int i5 = 0; i5 < virtualChild; i5 = i5 + 1) {
          View view = linearLayout.t(i5);
          int i6 = 1;
          if (view == null) {
             i = i + 0;
          }else if(view.getVisibility() != 8){
             int measuredWidt = view.getMeasuredWidth();
             int measuredHeig = view.getMeasuredHeight();
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             LinearLayoutCompat$LayoutParams b = layoutParams.b;
             if (b < null) {
                b = i4;
             }
             int i7 = g.b(b, i0.B(this)) & 0x07;
             if (i7 != i6) {
                if (i7 != 5) {
                   i7 = layoutParams.leftMargin + paddingLeft;
                label_0094 :
                   if (linearLayout.u(i5)) {
                      i = i + linearLayout.n;
                   }
                   int i8 = i + layoutParams.topMargin;
                   int i9 = i8 + 0;
                   this.A(view, i7, i9, measuredWidt, measuredHeig);
                   measuredHeig = measuredHeig + layoutParams.bottomMargin;
                   measuredHeig = measuredHeig + 0;
                   i8 = i8 + measuredHeig;
                   i5 = i5 + 0;
                   i = i8;
                }else {
                   i7 = i1 - measuredWidt;
                   rightMargin = layoutParams.rightMargin;
                }
             }else {
                i7 = i2 - measuredWidt;
                i7 = i7 / 2;
                i7 = i7 + paddingLeft;
                i7 = i7 + layoutParams.leftMargin;
                rightMargin = layoutParams.rightMargin;
             }
             i7 = i7 - rightMargin;
             goto label_0094 ;
          }
       }
       return;
    }
    public void x(View p0,int p1,int p2,int p3,int p4,int p5){
       this.measureChildWithMargins(p0, p2, p3, p4, p5);
    }
    public void y(int p0,int p1){
       int i13;
       LinearLayoutCompat linearLayout3;
       LinearLayoutCompat linearLayout4;
       LinearLayoutCompat$LayoutParams a;
       int i14;
       int i15;
       View view1;
       int i16;
       int i17;
       int baseline;
       LinearLayoutCompat g;
       LinearLayoutCompat g1;
       float f3;
       LinearLayoutCompat linearLayout = this;
       int i = p0;
       int i1 = 0;
       linearLayout.g = i1;
       int virtualChild = this.getVirtualChildCount();
       int mode = View$MeasureSpec.getMode(p0);
       int mode1 = View$MeasureSpec.getMode(p1);
       int i2 = 4;
       if (linearLayout.j == null || linearLayout.k == null) {
          int[] ointArray = new int[i2];
          linearLayout.j = ointArray;
          ointArray = new int[i2];
          linearLayout.k = ointArray;
       }
       LinearLayoutCompat j = linearLayout.j;
       LinearLayoutCompat k = linearLayout.k;
       int i3 = -1;
       j[3] = i3;
       j[2] = i3;
       j[1] = i3;
       j[i1] = i3;
       k[3] = i3;
       k[2] = i3;
       k[1] = i3;
       k[i1] = i3;
       LinearLayoutCompat b = linearLayout.b;
       LinearLayoutCompat i4 = linearLayout.i;
       ViewGroup$MarginLayoutParams marginLayout = 0x40000000;
       int i5 = (mode == marginLayout)? 1: 0;
       float f = 0;
       int i6 = 0;
       i2 = 0;
       int i7 = 0;
       int i8 = 0;
       int i9 = 0;
       float f1 = 0;
       int i10 = 0;
       int i11 = 1;
       int i12 = 0;
       LinearLayoutCompat linearLayout1 = k;
       LinearLayoutCompat linearLayout2 = 8;
       while (i6 < virtualChild) {
          View view = linearLayout.t(i6);
          if (view == null) {
             i3 = linearLayout.g + i1;
             linearLayout.g = i3;
          }else if(view.getVisibility() == linearLayout2){
             i6 = i6 + 0;
          }else if(linearLayout.u(i6)){
             i3 = linearLayout.g + linearLayout.m;
             linearLayout.g = i3;
          }
          ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
          a = layoutParams.a;
          float f2 = f + a;
          if (mode == marginLayout && (layoutParams.width == null && a > 0)) {
             if (i5) {
                i3 = layoutParams.leftMargin + layoutParams.rightMargin;
                i14 = linearLayout.g + i3;
                linearLayout.g = i14;
             }else {
                g = linearLayout.g;
                i13 = layoutParams.leftMargin + g;
                i13 = i13 + layoutParams.rightMargin;
                linearLayout.g = Math.max(g, i13);
             }
             if (b != null) {
                view.measure(View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(0, 0));
                i15 = i6;
                linearLayout3 = i4;
                linearLayout4 = b;
                view1 = view;
                i16 = -2;
             }else {
                i15 = i6;
                linearLayout3 = i4;
                linearLayout4 = b;
                view1 = view;
                i6 = 0x40000000;
                f1 = Float.MIN_VALUE;
                i16 = -2;
             label_0159 :
                if (mode1 != i6 && layoutParams.height == -1) {
                   i14 = 1;
                   i12 = 1;
                }else {
                   i14 = 0;
                }
                i13 = layoutParams.topMargin + layoutParams.bottomMargin;
                i17 = view1.getMeasuredHeight() + i13;
                i10 = View.combineMeasuredStates(i10, view1.getMeasuredState());
                if (linearLayout4 != null) {
                   baseline = view1.getBaseline();
                   if (baseline != -1) {
                      a = layoutParams.b;
                      if (a < null) {
                         linearLayout2 = linearLayout.f;
                      }
                      i3 = linearLayout2 & 0x70;
                      i3 = i3 >> 4;
                      i3 = i3 & 0xfe;
                      i3 = i3 >> 1;
                      j[i3] = Math.max(j[i3], baseline);
                      baseline = i17 - baseline;
                      linearLayout1[i3] = Math.max(linearLayout1[i3], baseline);
                   }
                }
                i7 = Math.max(i7, i17);
                i11 = (i11 && layoutParams.height == -1)? 1: 0;
                if (layoutParams.a > 0) {
                   if (!i14) {
                      i13 = i17;
                   }
                   i9 = Math.max(i9, i13);
                }else {
                   i1 = i9;
                   if (!i14) {
                      i13 = i17;
                   }
                   i8 = Math.max(i8, i13);
                   i9 = i1;
                }
                i14 = i15 + 0;
                i13 = i14;
                f = f2;
             label_01d8 :
                i13 = i13 + 1;
                i6 = i13;
                k = linearLayout1;
                i4 = linearLayout3;
                b = linearLayout4;
                i13 = 0x40000000;
                i1 = 0;
             }
          }else if(layoutParams.width == null && a > 0){
             layoutParams.width = -2;
             i13 = 0;
          }else {
             i13 = Integer.MIN_VALUE;
          }
          LinearLayoutCompat linearLayout5 = (!f2)? linearLayout.g: 0;
          i15 = i6;
          linearLayout3 = i4;
          linearLayout4 = b;
          view1 = view;
          this.x(view, i15, p0, linearLayout5, p1, 0);
          i14 = i13;
          if (i14 != Integer.MIN_VALUE) {
             layoutParams.width = i14;
          }
          i14 = view1.getMeasuredWidth();
          if (i5) {
             i13 = layoutParams.leftMargin + i14;
             i13 = i13 + layoutParams.rightMargin;
             i13 = i13 + 0;
             i6 = linearLayout.g + i13;
             linearLayout.g = i6;
          }else {
             g1 = linearLayout.g;
             i13 = g1 + i14;
             i13 = i13 + layoutParams.leftMargin;
             i13 = i13 + layoutParams.rightMargin;
             i13 = i13 + 0;
             linearLayout.g = Math.max(g1, i13);
          }
          if (linearLayout3 != null) {
             i2 = Math.max(i14, i2);
          }
          i6 = 0x40000000;
          goto label_0159 ;
          i13 = i6;
          linearLayout3 = i4;
          linearLayout4 = b;
          i6 = 0x40000000;
          goto label_01d8 ;
       }
       linearLayout3 = i4;
       linearLayout4 = b;
       baseline = i7;
       i17 = i8;
       i1 = i9;
       int i18 = i10;
       if (linearLayout.g > null && linearLayout.u(virtualChild)) {
          linearLayout.g = linearLayout.g + linearLayout.m;
       }
       LinearLayoutCompat linearLayout6 = -1;
       if (j[1] == linearLayout6 && (j[0] == linearLayout6 && (j[2] != linearLayout6 || j[3] != linearLayout6))) {
          i9 = i18;
          i6 = Math.max(baseline, (Math.max(j[3], Math.max(j[0], Math.max(j[1], j[2]))) + Math.max(linearLayout1[3], Math.max(linearLayout1[0], Math.max(linearLayout1[1], linearLayout1[2])))));
       }else {
          i6 = baseline;
          i9 = i18;
       }
       if (linearLayout3 != null && (mode == Integer.MIN_VALUE || !mode)) {
          i13 = 0;
          linearLayout.g = i13;
          baseline = 0;
          while (baseline < virtualChild) {
             View view2 = linearLayout.t(baseline);
             if (view2 == null) {
                i3 = linearLayout.g + i13;
                linearLayout.g = i3;
             }else if(view2.getVisibility() == 8){
                baseline = baseline + 0;
             }else {
                LinearLayoutCompat$LayoutParams layoutParams1 = view2.getLayoutParams();
                if (i5) {
                   i18 = layoutParams1.leftMargin + i2;
                   i18 = i18 + layoutParams1.rightMargin;
                   i18 = i18 + 0;
                   i3 = linearLayout.g + i18;
                   linearLayout.g = i3;
                }else {
                   linearLayout2 = linearLayout.g;
                   i18 = linearLayout2 + i2;
                   i18 = i18 + layoutParams1.leftMargin;
                   i18 = i18 + layoutParams1.rightMargin;
                   i18 = i18 + 0;
                   linearLayout.g = Math.max(linearLayout2, i18);
                }
             }
             baseline = baseline + 1;
             i13 = 0;
          }
       }
       i13 = linearLayout.g + (this.getPaddingLeft() + this.getPaddingRight());
       linearLayout.g = i13;
       i13 = View.resolveSizeAndState(Math.max(i13, this.getSuggestedMinimumWidth()), i, 0);
       baseline = (0xffffff & i13) - linearLayout.g;
       if (f1 || (baseline && f > 0)) {
          g1 = linearLayout.h;
          if (g1 > 0) {
             g = g1;
          }
          i6 = -1;
          j[3] = i6;
          j[2] = i6;
          j[1] = i6;
          j[0] = i6;
          linearLayout1[3] = i6;
          linearLayout1[2] = i6;
          linearLayout1[1] = i6;
          linearLayout1[0] = i6;
          linearLayout.g = 0;
          i18 = i17;
          int i19 = i9;
          i17 = -1;
          i1 = 0;
          while (i1 < virtualChild) {
             View view3 = linearLayout.t(i1);
             if (view3 == null || view3.getVisibility() == 8) {
                i3 = baseline;
                i10 = virtualChild;
                baseline = p1;
             }else {
                LinearLayoutCompat$LayoutParams layoutParams2 = view3.getLayoutParams();
                a = layoutParams2.a;
                if (a > 0) {
                   f3 = (float)baseline * a;
                   f3 = f3 / g;
                   i = (int)f3;
                   f = g - a;
                   baseline = baseline - i;
                   i3 = this.getPaddingTop() + this.getPaddingBottom();
                   float f4 = f;
                   i3 = i3 + layoutParams2.topMargin;
                   i3 = i3 + layoutParams2.bottomMargin;
                   int i20 = baseline;
                   i10 = virtualChild;
                   i14 = ViewGroup.getChildMeasureSpec(p1, i3, layoutParams2.height);
                   if (layoutParams2.width == null) {
                      i3 = 0x40000000;
                      if (mode == i3) {
                         if (i <= 0) {
                            i = 0;
                         }
                         view3.measure(View$MeasureSpec.makeMeasureSpec(i, i3), i14);
                      label_039e :
                         i14 = view3.getMeasuredState() & 0xff000000;
                         i19 = View.combineMeasuredStates(i19, i14);
                         f = f4;
                         i3 = i20;
                      }
                   }else {
                      i3 = 0x40000000;
                   }
                   i = view3.getMeasuredWidth() + i;
                   if (i < 0) {
                      i = 0;
                   }
                   view3.measure(View$MeasureSpec.makeMeasureSpec(i, i3), i14);
                   goto label_039e ;
                }else {
                   i3 = baseline;
                   i10 = virtualChild;
                   baseline = p1;
                }
                if (i5) {
                   i9 = view3.getMeasuredWidth() + layoutParams2.leftMargin;
                   i9 = i9 + layoutParams2.rightMargin;
                   i9 = i9 + 0;
                   i = linearLayout.g + i9;
                   linearLayout.g = i;
                   f1 = f;
                }else {
                   LinearLayoutCompat g2 = linearLayout.g;
                   i9 = g2 + view3.getMeasuredWidth();
                   i9 = i9 + layoutParams2.leftMargin;
                   i9 = i9 + layoutParams2.rightMargin;
                   f1 = f;
                   i14 = i9 + 0;
                   linearLayout.g = Math.max(g2, i14);
                }
                i14 = (mode1 != 0x40000000 && layoutParams2.height == -1)? 1: 0;
                i = layoutParams2.topMargin + layoutParams2.bottomMargin;
                virtualChild = view3.getMeasuredHeight() + i;
                i17 = Math.max(i17, virtualChild);
                if (!i14) {
                   i = virtualChild;
                }
                i14 = Math.max(i18, i);
                if (i11) {
                   f3 = -1;
                   if (layoutParams2.height == f3) {
                      i18 = 1;
                   label_0417 :
                      if (linearLayout4 != null) {
                         i2 = view3.getBaseline();
                         if (i2 != f3) {
                            layoutParams2 = layoutParams2.b;
                            if (layoutParams2 < null) {
                               g1 = linearLayout.f;
                            }
                            i6 = g1 & 0x70;
                            i6 = i6 >> 4;
                            i6 = i6 & 0xfe;
                            i6 = i6 >> 1;
                            j[i6] = Math.max(j[i6], i2);
                            virtualChild = virtualChild - i2;
                            linearLayout1[i6] = Math.max(linearLayout1[i6], virtualChild);
                         }
                      }
                      i11 = i18;
                      i18 = i14;
                      f = f1;
                   }
                }else {
                   f3 = -1;
                }
                i18 = 0;
                goto label_0417 ;
             }
             i1 = i1 + 1;
             baseline = i3;
             virtualChild = i10;
             i6 = -1;
          }
          baseline = p1;
          i10 = virtualChild;
          linearLayout.g = linearLayout.g + (this.getPaddingLeft() + this.getPaddingRight());
          i6 = -1;
          i6 = (j[1] == i6 && (j[0] == i6 && (j[2] != i6 || j[3] != i6)))? Math.max(i17, (Math.max(j[3], Math.max(j[0], Math.max(j[1], j[2]))) + Math.max(linearLayout1[3], Math.max(linearLayout1[0], Math.max(linearLayout1[1], linearLayout1[2]))))): i17;
          i14 = i18;
          i9 = i19;
       }else {
          i14 = Math.max(i17, i1);
          if (linearLayout3 != null && mode != 0x40000000) {
             i1 = 0;
             while (i1 < virtualChild) {
                View view4 = linearLayout.t(i1);
                if (view4 == null || (view4.getVisibility() != 8 && view4.getLayoutParams().a > 0)) {
                   baseline = 0x40000000;
                   view4.measure(View$MeasureSpec.makeMeasureSpec(i2, baseline), View$MeasureSpec.makeMeasureSpec(view4.getMeasuredHeight(), baseline));
                }
             label_030a :
                i1 = i1 + 1;
             }
          }
          baseline = p1;
          i10 = virtualChild;
       }
       if (i11 || mode1 == 0x40000000) {
          i14 = i6;
       }
       linearLayout.setMeasuredDimension(((i9 & 0xff000000) | i13), View.resolveSizeAndState(Math.max((i14 + (this.getPaddingTop() + this.getPaddingBottom())), this.getSuggestedMinimumHeight()), baseline, (i9 << 16)));
       if (i12) {
          linearLayout.o(i10, p0);
       }
       return;
    }
    public void z(int p0,int p1){
       int i8;
       int i9;
       LinearLayoutCompat g;
       int i10;
       ViewGroup$MarginLayoutParams marginLayout2;
       int i11;
       int i12;
       int i13;
       int i14;
       LinearLayoutCompat$LayoutParams layoutParams1;
       int i15;
       int i16;
       int i17;
       int i18;
       LinearLayoutCompat g2;
       int i20;
       float f3;
       ViewGroup$MarginLayoutParams marginLayout6;
       ViewGroup$MarginLayoutParams marginLayout7;
       LinearLayoutCompat linearLayout = this;
       int i = 0;
       linearLayout.g = i;
       int virtualChild = this.getVirtualChildCount();
       int mode = View$MeasureSpec.getMode(p0);
       int mode1 = View$MeasureSpec.getMode(p1);
       LinearLayoutCompat c = linearLayout.c;
       LinearLayoutCompat i1 = linearLayout.i;
       float f = 0;
       ViewGroup$MarginLayoutParams marginLayout = null;
       int i2 = 0;
       LinearLayoutCompat linearLayout1 = null;
       ViewGroup$MarginLayoutParams marginLayout1 = null;
       int i3 = 0;
       int i4 = 0;
       int i5 = 1;
       int i6 = 0;
       int i7 = 0;
       while (true) {
          if (i3 < virtualChild) {
             View view = linearLayout.t(i3);
             if (view == null) {
                i8 = linearLayout.g + i;
                linearLayout.g = i8;
             }else if(view.getVisibility() == 8){
                i3 = i3 + 0;
             }else if(linearLayout.u(i3)){
                i8 = linearLayout.g + linearLayout.n;
                linearLayout.g = i8;
             }
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             LinearLayoutCompat$LayoutParams a = layoutParams.a;
             float f1 = f + a;
             if (mode1 == 0x40000000 && (layoutParams.height == null && a > 0)) {
                g = linearLayout.g;
                i8 = layoutParams.topMargin + g;
                i8 = i8 + layoutParams.bottomMargin;
                linearLayout.g = Math.max(g, i8);
                i10 = i2;
                marginLayout2 = marginLayout1;
                i11 = i3;
                i9 = virtualChild;
                i12 = i7;
                i13 = marginLayout;
                i4 = 1;
                i7 = mode1;
             }else {
                ViewGroup$MarginLayoutParams marginLayout3 = marginLayout;
                if (layoutParams.height == null && a > 0) {
                   layoutParams.height = -2;
                   a = 0;
                }else {
                   a = Integer.MIN_VALUE;
                }
                LinearLayoutCompat linearLayout2 = (!f1)? linearLayout.g: null;
                i13 = marginLayout3;
                i10 = i2;
                i16 = linearLayout1;
                i9 = virtualChild;
                i12 = i7;
                i7 = mode1;
                mode1 = a;
                marginLayout2 = marginLayout1;
                i11 = i3;
                this.x(view, i3, p0, 0, p1, linearLayout2);
                if (mode1 != Integer.MIN_VALUE) {
                   layoutParams.height = mode1;
                }
                i14 = view.getMeasuredHeight();
                LinearLayoutCompat g1 = linearLayout.g;
                i2 = g1 + i14;
                i2 = i2 + layoutParams.topMargin;
                i2 = i2 + layoutParams.bottomMargin;
                i2 = i2 + 0;
                linearLayout.g = Math.max(g1, i2);
                if (i1 != null) {
                   linearLayout1 = Math.max(i14, i16);
                }else {
                   linearLayout1 = i16;
                }
             }
             if (c >= null) {
                i14 = i11;
                i3 = i14 + 1;
                if (c == i3) {
                   linearLayout.d = linearLayout.g;
                }
             }else {
                i14 = i11;
             }
             if (i14 >= c || layoutParams.a <= 0) {
                if (mode != 0x40000000) {
                   layoutParams1 = -1;
                   if (layoutParams.width == layoutParams1) {
                      marginLayout = 1;
                      i6 = 1;
                   label_0124 :
                      i8 = layoutParams.leftMargin + layoutParams.rightMargin;
                      i15 = view.getMeasuredWidth() + i8;
                      i3 = Math.max(i10, i15);
                      i16 = View.combineMeasuredStates(i13, view.getMeasuredState());
                      i5 = (i5 && layoutParams.width == layoutParams1)? 1: 0;
                      if (layoutParams.a > 0) {
                         if (!marginLayout) {
                            i8 = i15;
                         }
                         i8 = Math.max(i12, i8);
                         marginLayout1 = marginLayout2;
                      }else if(marginLayout){
                         i8 = i15;
                      }
                      i15 = Math.max(marginLayout2, i8);
                      i8 = i12;
                      i14 = i14 + 0;
                      i2 = i3;
                      marginLayout = i16;
                      i3 = i14;
                      f = f1;
                   label_016c :
                      i3 = i3 + 1;
                      mode1 = i7;
                      virtualChild = i9;
                      i = 0;
                      i7 = i8;
                   }
                }else {
                   layoutParams1 = -1;
                }
                marginLayout = 0;
                goto label_0124 ;
             }else {
                throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex.");
             }
             i9 = virtualChild;
             i8 = i7;
             i7 = mode1;
             goto label_016c ;
          }else {
             i3 = i2;
             i16 = linearLayout1;
             ViewGroup$MarginLayoutParams marginLayout4 = marginLayout1;
             i9 = virtualChild;
             i12 = i7;
             LinearLayoutCompat linearLayout3 = Integer.MIN_VALUE;
             i7 = mode1;
             ViewGroup$MarginLayoutParams marginLayout5 = marginLayout;
             if (linearLayout.g > null) {
                i17 = i9;
                if (linearLayout.u(i17)) {
                   linearLayout.g = linearLayout.g + linearLayout.n;
                }
             }else {
                i17 = i9;
             }
             i8 = i7;
             if (i1 != null && (i8 == linearLayout3 || !i8)) {
                i15 = 0;
                linearLayout.g = i15;
                virtualChild = 0;
                while (virtualChild < i17) {
                   View view1 = linearLayout.t(virtualChild);
                   if (view1 == null) {
                      i18 = linearLayout.g + i15;
                      linearLayout.g = i18;
                   }else if(view1.getVisibility() == 8){
                      virtualChild = virtualChild + 0;
                   }else {
                      layoutParams1 = view1.getLayoutParams();
                      g2 = linearLayout.g;
                      i18 = g2 + i16;
                      i18 = i18 + layoutParams1.topMargin;
                      i18 = i18 + layoutParams1.bottomMargin;
                      i18 = i18 + 0;
                      linearLayout.g = Math.max(g2, i18);
                   }
                   virtualChild = virtualChild + 1;
                   i15 = 0;
                }
             }
             int i19 = linearLayout.g + (this.getPaddingTop() + this.getPaddingBottom());
             linearLayout.g = i19;
             i2 = p1;
             i15 = i12;
             i19 = View.resolveSizeAndState(Math.max(i19, this.getSuggestedMinimumHeight()), i2, 0);
             i12 = (0xffffff & i19) - linearLayout.g;
             if (i4 || (i12 && f > 0)) {
                g2 = linearLayout.h;
                if (g2 > 0) {
                   g = g2;
                }
                linearLayout.g = 0;
                i15 = 0;
                while (i15 < i17) {
                   View view2 = linearLayout.t(i15);
                   if (view2.getVisibility() == 8) {
                      i9 = i8;
                      i18 = i12;
                      i12 = p0;
                   }else {
                      LinearLayoutCompat$LayoutParams layoutParams2 = view2.getLayoutParams();
                      LinearLayoutCompat$LayoutParams a1 = layoutParams2.a;
                      if (a1 > 0) {
                         float f2 = (float)i12 * a1;
                         f2 = f2 / g;
                         i18 = (int)f2;
                         f = g - a1;
                         i12 = i12 - i18;
                         i20 = this.getPaddingLeft() + this.getPaddingRight();
                         f3 = f;
                         i20 = i20 + layoutParams2.leftMargin;
                         i20 = i20 + layoutParams2.rightMargin;
                         i7 = i12;
                         i14 = ViewGroup.getChildMeasureSpec(p0, i20, layoutParams2.width);
                         if (layoutParams2.height == null) {
                            i20 = 0x40000000;
                            if (i8 == i20) {
                               if (i18 <= 0) {
                                  i18 = 0;
                               }
                               view2.measure(i14, View$MeasureSpec.makeMeasureSpec(i18, i20));
                            label_02c9 :
                               i14 = view2.getMeasuredState() & 0xff00;
                               marginLayout5 = View.combineMeasuredStates(marginLayout5, i14);
                               f = f3;
                               i18 = i7;
                            }
                         }else {
                            i20 = 0x40000000;
                         }
                         i18 = view2.getMeasuredHeight() + i18;
                         if (i18 < 0) {
                            i18 = 0;
                         }
                         view2.measure(i14, View$MeasureSpec.makeMeasureSpec(i18, i20));
                         goto label_02c9 ;
                      }else {
                         i18 = i12;
                         i12 = p0;
                      }
                      f3 = f;
                      i20 = layoutParams2.leftMargin + layoutParams2.rightMargin;
                      i14 = view2.getMeasuredWidth() + i20;
                      i3 = Math.max(i3, i14);
                      i7 = i14;
                      if (mode != 0x40000000) {
                         i9 = i8;
                         marginLayout6 = -1;
                         if (layoutParams2.width == marginLayout6) {
                            i14 = 1;
                         label_02fe :
                            if (!i14) {
                               i20 = i7;
                            }
                            i14 = Math.max(marginLayout4, i20);
                            i = (i5 && layoutParams2.width == marginLayout6)? 1: 0;
                            i1 = linearLayout.g;
                            i16 = view2.getMeasuredHeight() + i1;
                            i16 = i16 + layoutParams2.topMargin;
                            i16 = i16 + layoutParams2.bottomMargin;
                            i16 = i16 + 0;
                            linearLayout.g = Math.max(i1, i16);
                            i5 = i;
                            marginLayout4 = i14;
                            f = f3;
                         }
                      }else {
                         i9 = i8;
                         marginLayout6 = -1;
                      }
                      i14 = 0;
                      goto label_02fe ;
                   }
                   i15 = i15 + 1;
                   i12 = i18;
                   i8 = i9;
                }
                i12 = p0;
                linearLayout.g = linearLayout.g + (this.getPaddingTop() + this.getPaddingBottom());
                marginLayout7 = marginLayout4;
             }else {
                marginLayout7 = Math.max(marginLayout4, i15);
                if (i1 != null && i8 != 0x40000000) {
                   i = 0;
                   while (i < i17) {
                      View view3 = linearLayout.t(i);
                      if (view3 == null || (view3.getVisibility() != 8 && view3.getLayoutParams().a > 0)) {
                         i12 = 0x40000000;
                         view3.measure(View$MeasureSpec.makeMeasureSpec(view3.getMeasuredWidth(), i12), View$MeasureSpec.makeMeasureSpec(i16, i12));
                      }
                   label_024b :
                      i = i + 1;
                   }
                }
                i12 = p0;
             }
             if (i5 || mode == 0x40000000) {
                marginLayout7 = i3;
             }
             linearLayout.setMeasuredDimension(View.resolveSizeAndState(Math.max((marginLayout7 + (this.getPaddingLeft() + this.getPaddingRight())), this.getSuggestedMinimumWidth()), i12, marginLayout5), i19);
             if (i6) {
                linearLayout.p(i17, i2);
                break ;
             }
             break ;
          }
       }
       return;
    }
}
