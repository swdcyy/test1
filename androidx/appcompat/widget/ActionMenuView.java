package androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.view.menu.e$b;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.LinearLayoutCompat;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.ActionMenuView$LayoutParams;
import android.view.View$MeasureSpec;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat$LayoutParams;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView$a;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import java.lang.Long;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j$a;
import androidx.appcompat.view.menu.e$a;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.h;
import android.view.MenuItem;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView$c;
import androidx.appcompat.widget.ActionMenuView$b;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.view.menu.j;
import android.graphics.drawable.Drawable;
import android.content.res.Configuration;
import w0.b0;
import androidx.appcompat.widget.ActionMenuView$d;
import android.view.ContextThemeWrapper;

public class ActionMenuView extends LinearLayoutCompat implements e$b, k	// class@0005d5
{
    public int A;
    public ActionMenuView$d B;
    public e q;
    public Context r;
    public int s;
    public boolean t;
    public ActionMenuPresenter u;
    public j$a v;
    public e$a w;
    public boolean x;
    public int y;
    public int z;

    public void ActionMenuView(Context p0){
       super(p0, null);
    }
    public void ActionMenuView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.setBaselineAligned(false);
       DisplayMetrics density = c.c(p0.getResources()).density;
       this.z = (int)(56.00f * density);
       this.A = (int)(density * 4.00f);
       this.r = p0;
       this.s = 0;
    }
    public static int L(View p0,int p1,int p2,int p3,int p4){
       ActionMenuView$LayoutParams layoutParams = p0.getLayoutParams();
       p3 = View$MeasureSpec.makeMeasureSpec((View$MeasureSpec.getSize(p3) - p4), View$MeasureSpec.getMode(p3));
       ActionMenuItemView uActionMenuI = (p0 instanceof ActionMenuItemView)? p0: null;
       boolean b = false;
       uActionMenuI = (uActionMenuI && uActionMenuI.p())? 1: 0;
       int i = 2;
       if (p2 > 0 && (!uActionMenuI || p2 >= i)) {
          p0.measure(View$MeasureSpec.makeMeasureSpec((p2 * p1), Integer.MIN_VALUE), p3);
          p2 = p0.getMeasuredWidth();
          int i1 = p2 / p1;
          if (p2 % p1) {
             i1 = i1 + 1;
          }
          if (!uActionMenuI || i1 >= i) {
             i = i1;
          }
       }else {
          i = 0;
       }
       if (layoutParams.c == null && uActionMenuI) {
          b = true;
       }
       layoutParams.f = b;
       layoutParams.d = i;
       p0.measure(View$MeasureSpec.makeMeasureSpec((p1 * i), 0x40000000), p3);
       return i;
    }
    public void B(){
       ActionMenuView tu = this.u;
       if (tu != null) {
          tu.u();
       }
       return;
    }
    public ActionMenuView$LayoutParams C(){
       ActionMenuView$LayoutParams layoutParams = new ActionMenuView$LayoutParams(-2, -2);
       layoutParams.b = 16;
       return layoutParams;
    }
    public ActionMenuView$LayoutParams D(AttributeSet p0){
       return new ActionMenuView$LayoutParams(this.getContext(), p0);
    }
    public ActionMenuView$LayoutParams E(ViewGroup$LayoutParams p0){
       if (p0 == null) {
          return this.C();
       }
       ActionMenuView$LayoutParams layoutParams = (p0 instanceof ActionMenuView$LayoutParams)? new ActionMenuView$LayoutParams(p0): new ActionMenuView$LayoutParams(p0);
       if (layoutParams.b <= null) {
          layoutParams.b = 16;
       }
       return layoutParams;
    }
    public ActionMenuView$LayoutParams F(){
       ActionMenuView$LayoutParams layoutParams = this.C();
       layoutParams.c = true;
       return layoutParams;
    }
    public boolean G(int p0){
       boolean b = false;
       if (!p0) {
          return b;
       }
       View childAt = this.getChildAt((p0 - 1));
       View childAt1 = this.getChildAt(p0);
       if (p0 < this.getChildCount() && childAt instanceof ActionMenuView$a) {
          b = b | childAt.g();
       }
       if (p0 > 0 && childAt1 instanceof ActionMenuView$a) {
          b = b | childAt1.b();
       }
       return b;
    }
    public boolean H(){
       ActionMenuView tu = this.u;
       boolean b = (tu != null && tu.x())? true: false;
       return b;
    }
    public boolean I(){
       ActionMenuView tu = this.u;
       boolean b = (tu != null && tu.z())? true: false;
       return b;
    }
    public boolean J(){
       ActionMenuView tu = this.u;
       boolean b = (tu != null && tu.A())? true: false;
       return b;
    }
    public boolean K(){
       return this.t;
    }
    public final void M(int p0,int p1){
       int i12;
       int i13;
       ActionMenuView$LayoutParams layoutParams;
       long l1;
       int i14;
       ViewGroup$LayoutParams layoutParams2;
       int i16;
       long l4;
       ViewGroup$LayoutParams layoutParams3;
       int i17;
       int i18;
       ActionMenuView uActionMenuV = this;
       int mode = View$MeasureSpec.getMode(p1);
       int size = View$MeasureSpec.getSize(p1);
       int i = this.getPaddingTop() + this.getPaddingBottom();
       int childMeasure = ViewGroup.getChildMeasureSpec(p1, i, -2);
       int i1 = View$MeasureSpec.getSize(p0) - (this.getPaddingLeft() + this.getPaddingRight());
       ActionMenuView z = uActionMenuV.z;
       int i2 = i1 / z;
       int i3 = i1 % z;
       int i4 = 0;
       if (!i2) {
          uActionMenuV.setMeasuredDimension(i1, i4);
          return;
       }else {
          int i5 = z + (i3 / i2);
          i3 = this.getChildCount();
          int i6 = 0;
          int i7 = 0;
          int i8 = 0;
          boolean i9 = 0;
          int i10 = 0;
          int i11 = 0;
          long l = 0;
          while (i7 < i3) {
             View childAt = uActionMenuV.getChildAt(i7);
             i12 = size;
             if (childAt.getVisibility() != 8) {
                v3 = childAt instanceof ActionMenuItemView;
                i9 = i9 + 1;
                if (size) {
                   i13 = i9;
                   i9 = 0;
                   childAt.setPadding(uActionMenuV.A, i9, uActionMenuV.A, i9);
                }else {
                   i13 = i9;
                   i9 = false;
                }
                layoutParams = childAt.getLayoutParams();
                layoutParams.h = i9;
                layoutParams.e = i9;
                layoutParams.d = i9;
                layoutParams.f = i9;
                layoutParams.leftMargin = i9;
                layoutParams.rightMargin = i9;
                size = (size && childAt.p())? true: false;
                layoutParams.g = size;
                size = (layoutParams.c != null)? 1: i2;
                size = ActionMenuView.L(childAt, i5, size, childMeasure, i);
                i10 = Math.max(i10, size);
                if (layoutParams.f != null) {
                   i11 = i11 + 1;
                }
                if (layoutParams.c != null) {
                   i8 = 1;
                }
                i2 = i2 - size;
                i6 = Math.max(i6, childAt.getMeasuredHeight());
                i4 = 1;
                if (size == i4) {
                   size = i4 << i7;
                   l1 = l | (long)size;
                   l = l1;
                   i6 = i6;
                }else {
                   i14 = i6;
                }
                i9 = i13;
             }
             i7 = i7 + 1;
             size = i12;
             i4 = 0;
          }
          i12 = size;
          ActionMenuView$LayoutParams layoutParams1 = 2;
          i = (i8 && i9 == layoutParams1)? 1: 0;
          View view = null;
          while (true) {
             if (i11 > 0 && i2 > 0) {
                size = 0;
                i14 = 0;
                long l2 = Integer.MAX_VALUE;
                long l3 = 0;
                while (i14 < i3) {
                   int i15 = view;
                   layoutParams2 = uActionMenuV.getChildAt(i14).getLayoutParams();
                   i16 = i6;
                   if (layoutParams2.f != null) {
                      layoutParams = layoutParams2.d;
                      if (layoutParams < l2) {
                         l3 = 1 << i14;
                         l2 = layoutParams;
                         size = 1;
                      }else {
                         l4 = 1;
                         if (layoutParams == l2) {
                            l1 = l4 << i14;
                            l1 = l3 | l1;
                            size = size + 1;
                            l3 = l1;
                         }
                      }
                   }
                   i14 = i14 + 1;
                   i6 = i16;
                   view = i15;
                }
                layoutParams3 = view;
                i16 = i6;
                l = l | l3;
                if (size > i2) {
                   i14 = mode;
                   i17 = i1;
                label_0179 :
                   mode = 1;
                   View view1 = (!i8 && i9 == mode)? 1: null;
                   if (i2 > 0 && (l - null && (i2 >= (i9 - mode) && (view1 || i10 > mode)))) {
                      float f = (float)Long.bitCount(l);
                      if (!view1) {
                         float f1 = 0x3f000000;
                         if ((l & 1) && uActionMenuV.getChildAt(0).getLayoutParams().g == null) {
                            f = f - f1;
                         }
                         i1 = i3 - 1;
                         if ((l & (long)(1 << i1)) && uActionMenuV.getChildAt(i1).getLayoutParams().g == null) {
                            f = f - f1;
                         }
                      }else {
                         i9 = 0;
                      }
                      mode = (f > 0)? (int)((float)(i2 * i5) / f): 0;
                      view = layoutParams3;
                      i1 = 0;
                      while (i1 < i3) {
                         i = 1 << i1;
                         l2 = l & (long)i;
                         if (!l2) {
                            i2 = 2;
                         }else {
                            View childAt1 = uActionMenuV.getChildAt(i1);
                            ActionMenuView$LayoutParams layoutParams4 = childAt1.getLayoutParams();
                            if (childAt1 instanceof ActionMenuItemView) {
                               layoutParams4.e = mode;
                               layoutParams4.h = true;
                               if (!i1 && layoutParams4.g == null) {
                                  size = - mode;
                                  size = size / 2;
                                  layoutParams4.leftMargin = size;
                               }else {
                                  i2 = 2;
                               }
                               size = 1;
                            }else {
                               i2 = 2;
                               if (layoutParams4.c != null) {
                                  layoutParams4.e = mode;
                                  layoutParams4.h = true;
                                  i4 = - mode;
                                  i4 = i4 / i2;
                                  layoutParams4.rightMargin = i4;
                               }else if(i1){
                                  i6 = mode / 2;
                                  layoutParams4.leftMargin = i6;
                               }
                               i6 = i3 - 1;
                               if (i1 != i6) {
                                  i6 = mode / 2;
                                  layoutParams4.rightMargin = i6;
                               }
                            }
                            i4 = 1;
                         }
                         i1 = i1 + 1;
                      }
                   }else {
                      view = layoutParams3;
                   }
                   if (view != null) {
                      i4 = 0;
                      while (i4 < i3) {
                         view1 = uActionMenuV.getChildAt(i4);
                         layoutParams1 = view1.getLayoutParams();
                         if (layoutParams1.h != null) {
                            i = layoutParams1.d * i5;
                            i = i + layoutParams1.e;
                            view1.measure(View$MeasureSpec.makeMeasureSpec(i, 0x40000000), childMeasure);
                         }
                         i4 = i4 + 1;
                      }
                   }
                   size = (i14 != 0x40000000)? i16: i12;
                }else {
                   i7 = l2 + 1;
                   size = 0;
                   while (size < i3) {
                      view = uActionMenuV.getChildAt(size);
                      ActionMenuView$LayoutParams layoutParams5 = view.getLayoutParams();
                      i17 = i1;
                      i1 = 1 << size;
                      i14 = mode;
                      long l5 = (long)i1;
                      l4 = l3 & l5;
                      if (!l4) {
                         if (layoutParams5.d == i7) {
                            l = l | l5;
                         }
                         i18 = i;
                      }else if(i && (layoutParams5.g != null && i2 == 1)){
                         ActionMenuView a = uActionMenuV.A;
                         mode = a + i5;
                         i18 = i;
                         view.setPadding(mode, 0, a, 0);
                      }else {
                         i18 = i;
                      }
                      i1 = 1;
                      mode = layoutParams5.d + i1;
                      layoutParams5.d = mode;
                      layoutParams5.h = i1;
                      i2 = i2 - 1;
                      size = size + 1;
                      mode = i14;
                      i1 = i17;
                      i = i18;
                   }
                   i6 = i16;
                   layoutParams2 = 1;
                }
             }else {
                i14 = mode;
                i17 = i1;
                layoutParams3 = view;
                i16 = i6;
                goto label_0179 ;
             }
          }
          uActionMenuV.setMeasuredDimension(i17, size);
          return;
       }
    }
    public e N(){
       return this.q;
    }
    public void O(j$a p0,e$a p1){
       this.v = p0;
       this.w = p1;
    }
    public boolean P(){
       ActionMenuView tu = this.u;
       boolean b = (tu != null && tu.G())? true: false;
       return b;
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       return p0 instanceof ActionMenuView$LayoutParams;
    }
    public void d(e p0){
       this.q = p0;
    }
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent p0){
       return false;
    }
    public boolean g(h p0){
       return this.q.N(p0, 0);
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return this.C();
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.D(p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return this.E(p0);
    }
    public Menu getMenu(){
       if (this.q == null) {
          Context context = this.getContext();
          e uoe = new e(context);
          this.q = uoe;
          uoe.V(new ActionMenuView$c(this));
          ActionMenuPresenter uActionMenuP = new ActionMenuPresenter(context);
          this.u = uActionMenuP;
          uActionMenuP.F(true);
          ActionMenuView tu = this.u;
          ActionMenuView tv = this.v;
          if (tv == null) {
             tv = new ActionMenuView$b();
          }
          tu.l(tv);
          this.q.c(this.u, this.r);
          this.u.D(this);
       }
       return this.q;
    }
    public Drawable getOverflowIcon(){
       this.getMenu();
       return this.u.w();
    }
    public int getPopupTheme(){
       return this.s;
    }
    public int getWindowAnimations(){
       return 0;
    }
    public void onConfigurationChanged(Configuration p0){
       super.onConfigurationChanged(p0);
       ActionMenuView tu = this.u;
       if (tu != null) {
          tu.e(false);
          if (this.u.A()) {
             this.u.x();
             this.u.G();
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.B();
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i6;
       int i7;
       int i9;
       View childAt2;
       ActionMenuView$LayoutParams layoutParams1;
       int i10;
       ActionMenuView uActionMenuV = this;
       if (uActionMenuV.x == null) {
          super.onLayout(p0, p1, p2, p3, p4);
          return;
       }else {
          int childCount = this.getChildCount();
          int i = (p4 - p2) / 2;
          int dividerWidth = this.getDividerWidth();
          int i1 = p3 - p1;
          int i2 = (i1 - this.getPaddingRight()) - this.getPaddingLeft();
          boolean b = b0.b(this);
          int i3 = 0;
          int i4 = 0;
          int i5 = 0;
          ActionMenuView$LayoutParams layoutParams = 8;
          ViewGroup$MarginLayoutParams marginLayout = 1;
          while (i3 < childCount) {
             View childAt = uActionMenuV.getChildAt(i3);
             if (childAt.getVisibility() != layoutParams) {
                layoutParams = childAt.getLayoutParams();
                if (layoutParams.c != null) {
                   i4 = childAt.getMeasuredWidth();
                   if (uActionMenuV.G(i3)) {
                      i4 = i4 + dividerWidth;
                   }
                   int measuredHeig = childAt.getMeasuredHeight();
                   if (b) {
                      i6 = this.getPaddingLeft() + layoutParams.leftMargin;
                      i7 = i6 + i4;
                   }else {
                      i6 = this.getWidth() - this.getPaddingRight();
                      i7 = i6 - layoutParams.rightMargin;
                      i6 = i7 - i4;
                   }
                   int i8 = measuredHeig / 2;
                   i9 = i - i8;
                   measuredHeig = measuredHeig + i9;
                   childAt.layout(i6, i9, i7, measuredHeig);
                   i2 = i2 - i4;
                   i4 = 1;
                }else {
                   i9 = childAt.getMeasuredWidth() + layoutParams.leftMargin;
                   i9 = i9 + layoutParams.rightMargin;
                   i2 = i2 - i9;
                   uActionMenuV.G(i3);
                   i5 = i5 + 1;
                }
             }
             i3 = i3 + 1;
          }
          if (childCount == marginLayout && !i4) {
             View childAt1 = uActionMenuV.getChildAt(0);
             dividerWidth = childAt1.getMeasuredWidth();
             i2 = childAt1.getMeasuredHeight();
             i1 = (i1 / 2) - (dividerWidth / 2);
             i = i - (i2 / 2);
             childAt1.layout(i1, i, (dividerWidth + i1), (i2 + i));
             return;
          }else {
             i5 = i5 - (i4 ^ 0x01);
             dividerWidth = (i5 > 0)? i2 / i5: 0;
             dividerWidth = Math.max(0, dividerWidth);
             if (b) {
                i2 = this.getWidth() - this.getPaddingRight();
                i9 = 0;
                while (i9 < childCount) {
                   childAt2 = uActionMenuV.getChildAt(i9);
                   layoutParams1 = childAt2.getLayoutParams();
                   if (childAt2.getVisibility() != layoutParams && layoutParams1.c == null) {
                      i2 = i2 - layoutParams1.rightMargin;
                      i3 = childAt2.getMeasuredWidth();
                      i4 = childAt2.getMeasuredHeight();
                      i5 = i4 / 2;
                      i5 = i - i5;
                      i10 = i2 - i3;
                      i4 = i4 + i5;
                      childAt2.layout(i10, i5, i2, i4);
                      i3 = i3 + layoutParams1.leftMargin;
                      i3 = i3 + dividerWidth;
                      i2 = i2 - i3;
                   }
                   i9 = i9 + 1;
                }
             }else {
                i2 = this.getPaddingLeft();
                i9 = 0;
                while (i9 < childCount) {
                   childAt2 = uActionMenuV.getChildAt(i9);
                   layoutParams1 = childAt2.getLayoutParams();
                   if (childAt2.getVisibility() != layoutParams && layoutParams1.c == null) {
                      i2 = i2 + layoutParams1.leftMargin;
                      i3 = childAt2.getMeasuredWidth();
                      i4 = childAt2.getMeasuredHeight();
                      i5 = i4 / 2;
                      i5 = i - i5;
                      i10 = i2 + i3;
                      i4 = i4 + i5;
                      childAt2.layout(i2, i5, i10, i4);
                      i3 = i3 + layoutParams1.rightMargin;
                      i3 = i3 + dividerWidth;
                      i2 = i2 + i3;
                   }
                   i9 = i9 + 1;
                }
             }
             return;
          }
       }
    }
    public void onMeasure(int p0,int p1){
       ActionMenuView tx = this.x;
       boolean b = true;
       int b1 = (View$MeasureSpec.getMode(p0) == 0x40000000)? true: false;
       this.x = b1;
       if (tx != b1) {
          this.y = 0;
       }
       int size = View$MeasureSpec.getSize(p0);
       if (this.x != null) {
          ActionMenuView tq = this.q;
          if (tq != null && size != this.y) {
             this.y = size;
             tq.M(b);
          }
       }
       size = this.getChildCount();
       if (this.x != null && size > 0) {
          this.M(p0, p1);
       }else {
          for (b1 = 0; b1 < size; b1 = b1 + 1) {
             ActionMenuView$LayoutParams layoutParams = this.getChildAt(b1).getLayoutParams();
             layoutParams.rightMargin = 0;
             layoutParams.leftMargin = 0;
          }
          super.onMeasure(p0, p1);
       }
       return;
    }
    public LinearLayoutCompat$LayoutParams q(){
       return this.C();
    }
    public LinearLayoutCompat$LayoutParams r(AttributeSet p0){
       return this.D(p0);
    }
    public LinearLayoutCompat$LayoutParams s(ViewGroup$LayoutParams p0){
       return this.E(p0);
    }
    public void setExpandedActionViewsExclusive(boolean p0){
       this.u.C(p0);
    }
    public void setOnMenuItemClickListener(ActionMenuView$d p0){
       this.B = p0;
    }
    public void setOverflowIcon(Drawable p0){
       this.getMenu();
       this.u.E(p0);
    }
    public void setOverflowReserved(boolean p0){
       this.t = p0;
    }
    public void setPopupTheme(int p0){
       if (this.s != p0) {
          this.s = p0;
          this.r = (!p0)? this.getContext(): new ContextThemeWrapper(this.getContext(), p0);
       }
    label_001a :
       return;
    }
    public void setPresenter(ActionMenuPresenter p0){
       this.u = p0;
       p0.D(this);
    }
}
