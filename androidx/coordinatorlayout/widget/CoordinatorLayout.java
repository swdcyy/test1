package androidx.coordinatorlayout.widget.CoordinatorLayout;
import a2.v;
import android.view.ViewGroup;
import java.lang.Package;
import java.lang.Class;
import java.lang.String;
import androidx.coordinatorlayout.widget.CoordinatorLayout$f;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.ThreadLocal;
import z1.g;
import java.util.ArrayList;
import k1.a;
import a2.y;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.drawable.Drawable;
import androidx.coordinatorlayout.widget.CoordinatorLayout$d;
import android.view.ViewGroup$OnHierarchyChangeListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.lang.Object;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Constructor;
import java.lang.ClassLoader;
import java.lang.RuntimeException;
import java.lang.Throwable;
import android.graphics.Rect;
import z1.f;
import java.util.List;
import android.view.View;
import java.util.Comparator;
import java.util.Collections;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import a2.i0;
import a2.u0;
import a2.g;
import java.lang.Math;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import android.view.MotionEvent;
import android.os.SystemClock;
import java.util.Collection;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import z1.d;
import androidx.coordinatorlayout.widget.CoordinatorLayout$a;
import a2.z;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Region$Op;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import android.view.View$MeasureSpec;
import android.os.Parcelable;
import androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState;
import androidx.customview.view.AbsSavedState;
import android.util.SparseArray;
import android.graphics.drawable.Drawable$Callback;
import androidx.core.graphics.drawable.a;
import android.graphics.drawable.ColorDrawable;
import androidx.core.content.ContextCompat;
import k1.b;
import androidx.coordinatorlayout.widget.CoordinatorLayout$b;
import androidx.coordinatorlayout.widget.CoordinatorLayout$c;
import java.lang.annotation.Annotation;

public class CoordinatorLayout extends ViewGroup implements v	// class@0006ce
{
    public final List b;
    public final a c;
    public final List d;
    public final List e;
    public final int[] f;
    public Paint g;
    public boolean h;
    public boolean i;
    public int[] j;
    public View k;
    public View l;
    public CoordinatorLayout$e m;
    public boolean n;
    public u0 o;
    public boolean p;
    public Drawable q;
    public ViewGroup$OnHierarchyChangeListener r;
    public z s;
    public final y t;
    public static final String u;
    public static final Class[] v;
    public static final ThreadLocal w;
    public static final Comparator x;
    public static final f y;

    static {
       Package package = CoordinatorLayout.class.getPackage();
       String name = (package != null)? package.getName(): null;
       CoordinatorLayout.u = name;
       CoordinatorLayout.x = new CoordinatorLayout$f();
       Class[] uClassArray = new Class[]{Context.class,AttributeSet.class};
       CoordinatorLayout.v = uClassArray;
       CoordinatorLayout.w = new ThreadLocal();
       CoordinatorLayout.y = new g(12);
    }
    public void CoordinatorLayout(Context p0){
       super(p0, null);
    }
    public void CoordinatorLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f040257);
    }
    public void CoordinatorLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new ArrayList();
       this.c = new a();
       this.d = new ArrayList();
       this.e = new ArrayList();
       int[] ointArray = new int[2];
       this.f = ointArray;
       this.t = new y(this);
       int i = 0;
       TypedArray typedArray = (!p2)? p0.obtainStyledAttributes(p1, c$b.d0, i, R.style.arg_RES_7f1104e7): p0.obtainStyledAttributes(p1, c$b.d0, p2, i);
       p2 = typedArray.getResourceId(i, i);
       if (p2) {
          Resources resources = p0.getResources();
          this.j = resources.getIntArray(p2);
          DisplayMetrics density = c.c(resources).density;
          p2 = this.j.length;
          for (; i < p2; i = i + 1) {
             CoordinatorLayout tj = this.j;
             float f = (float)tj[i] * density;
             tj[i] = (int)f;
          }
       }
       this.q = typedArray.getDrawable(1);
       typedArray.recycle();
       this.Y();
       super.setOnHierarchyChangeListener(new CoordinatorLayout$d(this));
       return;
    }
    public static CoordinatorLayout$Behavior L(Context p0,AttributeSet p1,String p2){
       if (TextUtils.isEmpty(p2)) {
          return null;
       }
       if (p2.startsWith(".")) {
          p2 = p0.getPackageName()+p2;
       }else {
          int i = 46;
          if (p2.indexOf(i) < 0) {
             String u = CoordinatorLayout.u;
             if (!TextUtils.isEmpty(u)) {
                p2 = u+i+p2;
             }
          }
       }
       try{
          ThreadLocal w = CoordinatorLayout.w;
          Map map = w.get();
          if (map == null) {
             map = new HashMap();
             w.set(map);
          }
          Constructor uConstructor = map.get(p2);
          if (uConstructor == null) {
             uConstructor = p0.getClassLoader().loadClass(p2).getConstructor(CoordinatorLayout.v);
             uConstructor.setAccessible(true);
             map.put(p2, uConstructor);
          }
          Object[] objArray = new Object[]{p0,p1};
          return uConstructor.newInstance(objArray);
       }catch(java.lang.Exception e4){
          throw new RuntimeException("Could not inflate Behavior subclass "+p2, e4);
       }
    }
    public static void P(Rect p0){
       p0.setEmpty();
       CoordinatorLayout.y.a(p0);
    }
    public static int S(int p0){
       if (!p0) {
          p0 = 17;
       }
       return p0;
    }
    public static int T(int p0){
       if (!(p0 & 0x07)) {
          p0 = p0 | 0x800003;
       }
       if (!(p0 & 0x70)) {
          p0 = p0 | 0x30;
       }
       return p0;
    }
    public static int U(int p0){
       if (!p0) {
          p0 = 0x800035;
       }
       return p0;
    }
    public static Rect g(){
       Rect rect = CoordinatorLayout.y.q();
       if (rect == null) {
          rect = new Rect();
       }
       return rect;
    }
    public static int i(int p0,int p1,int p2){
       if (p0 < p1) {
          return p1;
       }
       if (p0 > p2) {
          return p2;
       }
       return p0;
    }
    public final void A(List p0){
       p0.clear();
       boolean b = this.isChildrenDrawingOrderEnabled();
       int childCount = this.getChildCount();
       for (int i = childCount - 1; i >= 0; i = i - 1) {
          int childDrawing = (b)? this.getChildDrawingOrder(childCount, i): i;
          p0.add(this.getChildAt(childDrawing));
       }
       Comparator x = CoordinatorLayout.x;
       if (x != null) {
          Collections.sort(p0, x);
       }
       return;
    }
    public final boolean B(View p0){
       return this.c.j(p0);
    }
    public boolean C(View p0,int p1,int p2){
       Rect rect = CoordinatorLayout.g();
       this.u(p0, rect);
       CoordinatorLayout.P(rect);
       return rect.contains(p1, p2);
    }
    public final void D(View p0,int p1){
       CoordinatorLayout$LayoutParams layoutParams = p0.getLayoutParams();
       Rect rect = CoordinatorLayout.g();
       rect.set((this.getPaddingLeft() + layoutParams.leftMargin), (this.getPaddingTop() + layoutParams.topMargin), ((this.getWidth() - this.getPaddingRight()) - layoutParams.rightMargin), ((this.getHeight() - this.getPaddingBottom()) - layoutParams.bottomMargin));
       if (this.o != null && (i0.y(this) && !i0.y(p0))) {
          rect.left = rect.left + this.o.i();
          rect.top = rect.top + this.o.k();
          rect.right = rect.right - this.o.j();
          rect.bottom = rect.bottom - this.o.h();
       }
    label_006f :
       Rect rect1 = CoordinatorLayout.g();
       g.a(CoordinatorLayout.T(layoutParams.c), p0.getMeasuredWidth(), p0.getMeasuredHeight(), rect, rect1, p1);
       p0.layout(rect1.left, rect1.top, rect1.right, rect1.bottom);
       CoordinatorLayout.P(rect);
       CoordinatorLayout.P(rect1);
       return;
    }
    public final void E(View p0,View p1,int p2){
       Rect rect = CoordinatorLayout.g();
       Rect rect1 = CoordinatorLayout.g();
       this.u(p1, rect);
       this.v(p0, p2, rect, rect1);
       p0.layout(rect1.left, rect1.top, rect1.right, rect1.bottom);
       CoordinatorLayout.P(rect);
       CoordinatorLayout.P(rect1);
    }
    public final void F(View p0,int p1,int p2){
       CoordinatorLayout$LayoutParams layoutParams = p0.getLayoutParams();
       int i = g.b(CoordinatorLayout.U(layoutParams.c), p2);
       int i1 = i & 0x07;
       i = i & 0x70;
       int width = this.getWidth();
       int height = this.getHeight();
       int measuredWidt = p0.getMeasuredWidth();
       int measuredHeig = p0.getMeasuredHeight();
       if (p2 == 1) {
          p1 = width - p1;
       }
       p1 = this.x(p1) - measuredWidt;
       if (i1 != 1) {
          if (i1 == 5) {
             p1 = p1 + measuredWidt;
          }
       }else {
          p1 = p1 + (measuredWidt / 2);
       }
       i1 = 0;
       if (i != 16) {
          if (i == 80) {
             i1 = measuredHeig + 0;
          }
       }else {
          i1 = i1 + (measuredHeig / 2);
       }
       p1 = Math.max((this.getPaddingLeft() + layoutParams.leftMargin), Math.min(p1, (((width - this.getPaddingRight()) - measuredWidt) - layoutParams.rightMargin)));
       p2 = Math.max((this.getPaddingTop() + layoutParams.topMargin), Math.min(i1, (((height - this.getPaddingBottom()) - measuredHeig) - layoutParams.bottomMargin)));
       p0.layout(p1, p2, (measuredWidt + p1), (measuredHeig + p2));
       return;
    }
    public final void G(View p0,Rect p1,int p2){
       int i1;
       int i2;
       if (!i0.Y(p0)) {
          return;
       }
       if (p0.getWidth() > 0 && p0.getHeight() > 0) {
          CoordinatorLayout$LayoutParams layoutParams = p0.getLayoutParams();
          CoordinatorLayout$Behavior uBehavior = layoutParams.f();
          Rect rect = CoordinatorLayout.g();
          Rect rect1 = CoordinatorLayout.g();
          rect1.set(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom());
          if (uBehavior != null && uBehavior.getInsetDodgeRect(this, p0, rect)) {
             if (!rect1.contains(rect)) {
                throw new IllegalArgumentException("Rect should be within the child\'s bounds. Rect:"+rect.toShortString()+" | Bounds:"+rect1.toShortString());
             }
          }else {
             rect.set(rect1);
          }
          CoordinatorLayout.P(rect1);
          if (rect.isEmpty()) {
             CoordinatorLayout.P(rect);
             return;
          }else {
             p2 = g.b(layoutParams.h, p2);
             int i = 1;
             if ((p2 & 0x30) == 48) {
                i1 = (rect.top - layoutParams.topMargin) - layoutParams.j;
                rect1 = p1.top;
                if (i1 < rect1) {
                   this.W(p0, (rect1 - i1));
                   i1 = 1;
                label_00a1 :
                   if ((p2 & 0x50) == 80) {
                      i2 = ((this.getHeight() - rect.bottom) - layoutParams.bottomMargin) + layoutParams.j;
                      Rect bottom = p1.bottom;
                      if (i2 < bottom) {
                         this.W(p0, (i2 - bottom));
                         i1 = 1;
                      }
                   }
                   if (!i1) {
                      this.W(p0, 0);
                   }
                   if ((p2 & 0x03) == 3) {
                      i1 = (rect.left - layoutParams.leftMargin) - layoutParams.i;
                      rect1 = p1.left;
                      if (i1 < rect1) {
                         this.V(p0, (rect1 - i1));
                         i1 = 1;
                      label_00da :
                         i2 = 5;
                         if ((p2 & i2) == i2) {
                            p2 = ((this.getWidth() - rect.right) - layoutParams.rightMargin) + layoutParams.i;
                            p1 = p1.right;
                            if (p2 < p1) {
                               this.V(p0, (p2 - p1));
                            label_00f5 :
                               if (!i) {
                                  this.V(p0, 0);
                               }
                               CoordinatorLayout.P(rect);
                            }
                         }
                         i = i1;
                         goto label_00f5 ;
                      }
                   }
                   i1 = 0;
                   goto label_00da ;
                }
             }
             i1 = 0;
             goto label_00a1 ;
          }
       }
       return;
    }
    public void H(View p0,int p1){
       CoordinatorLayout uCoordinator = this;
       View view = p0;
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams.k != null) {
          Rect rect = CoordinatorLayout.g();
          Rect rect1 = CoordinatorLayout.g();
          Rect rect2 = CoordinatorLayout.g();
          uCoordinator.u(layoutParams.k, rect);
          boolean b = false;
          uCoordinator.q(view, b, rect1);
          int measuredWidt = p0.getMeasuredWidth();
          int measuredHeig = p0.getMeasuredHeight();
          p1 = measuredHeig;
          this.w(p0, p1, rect, rect2, layoutParams, measuredWidt, measuredHeig);
          if (rect2.left != rect1.left || rect2.top != rect1.top) {
             b = true;
          }
          uCoordinator.j(layoutParams, rect2, measuredWidt, p1);
          int i = rect2.left - rect1.left;
          int i1 = rect2.top - rect1.top;
          if (i) {
             i0.d0(view, i);
          }
          if (i1) {
             i0.e0(view, i1);
          }
          if (b) {
             CoordinatorLayout$Behavior i2 = layoutParams.f();
             if (i2 != null) {
                i2.onDependentViewChanged(uCoordinator, view, layoutParams.k);
             }
          }
          CoordinatorLayout.P(rect);
          CoordinatorLayout.P(rect1);
          CoordinatorLayout.P(rect2);
       }
       return;
    }
    public final void I(int p0){
       int i5;
       int i6;
       CoordinatorLayout uCoordinator = this;
       int i = p0;
       int i1 = i0.B(this);
       int i2 = uCoordinator.b.size();
       Rect rect = CoordinatorLayout.g();
       Rect rect1 = CoordinatorLayout.g();
       Rect rect2 = CoordinatorLayout.g();
       int i3 = 0;
       while (i3 < i2) {
          View view = uCoordinator.b.get(i3);
          CoordinatorLayout$LayoutParams layoutParams = view.getLayoutParams();
          if (i || view.getVisibility() != 8) {
             boolean i4 = 0;
             while (i4 < i3) {
                if (layoutParams.l == uCoordinator.b.get(i4)) {
                   uCoordinator.H(view, i1);
                }
                i4 = i4 + 1;
             }
             i4 = true;
             uCoordinator.q(view, i4, rect1);
             if (layoutParams.g != null && !rect1.isEmpty()) {
                i5 = g.b(layoutParams.g, i1);
                i6 = i5 & 0x70;
                if (i6 != 48) {
                   if (i6 == 80) {
                      int i7 = this.getHeight() - rect1.top;
                      rect.bottom = Math.max(rect.bottom, i7);
                   }
                }else {
                   rect.top = Math.max(rect.top, rect1.bottom);
                }
                i5 = i5 & 0x07;
                if (i5 != 3) {
                   if (i5 == 5) {
                      i6 = this.getWidth() - rect1.left;
                      rect.right = Math.max(rect.right, i6);
                   }
                }else {
                   rect.left = Math.max(rect.left, rect1.right);
                }
             }
          label_00a9 :
             if (layoutParams.h != null && !view.getVisibility()) {
                uCoordinator.G(view, rect, i1);
             }
             layoutParams = 2;
             if (i != layoutParams) {
                uCoordinator.y(view, rect2);
                if (!rect2.equals(rect1)) {
                   uCoordinator.O(view, rect1);
                }
             }
             i5 = i3 + 1;
             while (i5 < i2) {
                View view1 = uCoordinator.b.get(i5);
                CoordinatorLayout$LayoutParams layoutParams1 = view1.getLayoutParams();
                CoordinatorLayout$Behavior uBehavior = layoutParams1.f();
                if (uBehavior != null && uBehavior.layoutDependsOn(uCoordinator, view1, view)) {
                   if (!i && layoutParams1.g()) {
                      layoutParams1.k();
                   }else if(i != layoutParams){
                      i6 = uBehavior.onDependentViewChanged(uCoordinator, view1, view);
                   }else {
                      uBehavior.onDependentViewRemoved(uCoordinator, view1, view);
                      i6 = true;
                   }
                   if (i == i4) {
                      layoutParams1.p(i6);
                   }
                }
                i5 = i5 + 1;
             }
          }
          i3 = i3 + 1;
       }
       CoordinatorLayout.P(rect);
       CoordinatorLayout.P(rect1);
       CoordinatorLayout.P(rect2);
       return;
    }
    public void J(View p0,int p1){
       CoordinatorLayout$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams.a()) {
          throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
       }
       CoordinatorLayout$LayoutParams k = layoutParams.k;
       if (k != null) {
          this.E(p0, k, p1);
       }else {
          layoutParams = layoutParams.e;
          if (layoutParams >= null) {
             this.F(p0, layoutParams, p1);
          }else {
             this.D(p0, p1);
          }
       }
       return;
    }
    public void K(View p0,int p1,int p2,int p3,int p4){
       this.measureChildWithMargins(p0, p1, p2, p3, p4);
    }
    public final boolean M(MotionEvent p0,int p1){
       CoordinatorLayout uCoordinator = this;
       MotionEvent motionEvent = p0;
       int i = p1;
       int actionMasked = p0.getActionMasked();
       CoordinatorLayout d = uCoordinator.d;
       uCoordinator.A(d);
       int i1 = d.size();
       MotionEvent motionEvent1 = null;
       int i2 = 0;
       boolean b = false;
       boolean b1 = false;
       while (i2 < i1) {
          View view = d.get(i2);
          CoordinatorLayout$LayoutParams layoutParams = view.getLayoutParams();
          CoordinatorLayout$Behavior uBehavior = layoutParams.f();
          if (b || (b1 && actionMasked)) {
             if (uBehavior != null) {
                if (motionEvent1 == null) {
                   long l = SystemClock.uptimeMillis();
                   motionEvent1 = MotionEvent.obtain(l, l, 3, 0, 0, 0);
                }
                if (i) {
                   if (i == 1) {
                      uBehavior.onTouchEvent(uCoordinator, view, motionEvent1);
                   }
                }else {
                   uBehavior.onInterceptTouchEvent(uCoordinator, view, motionEvent1);
                }
             }
          }else if(!b && uBehavior != null){
             if (i) {
                if (i == 1) {
                   b = uBehavior.onTouchEvent(uCoordinator, view, motionEvent);
                }
             }else {
                b = uBehavior.onInterceptTouchEvent(uCoordinator, view, motionEvent);
             }
             if (b) {
                uCoordinator.k = view;
             }
          }
       label_006a :
          b1 = layoutParams.c();
          boolean b2 = layoutParams.i(uCoordinator, view);
          b1 = (b2 && !b1)? true: false;
          if (b2 && !b1) {
             break ;
          }
       label_007e :
          i2 = i2 + 1;
       }
       d.clear();
       return b;
    }
    public final void N(){
       this.b.clear();
       this.c.c();
       int childCount = this.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          CoordinatorLayout$LayoutParams layoutParams = this.z(childAt);
          layoutParams.d(this, childAt);
          this.c.b(childAt);
          int i1 = 0;
          while (i1 < childCount) {
             if (i1 != i) {
                View childAt1 = this.getChildAt(i1);
                if (layoutParams.b(this, childAt, childAt1)) {
                   if (!this.c.d(childAt1)) {
                      this.c.b(childAt1);
                   }
                   this.c.a(childAt1, childAt);
                }
             }
             i1 = i1 + 1;
          }
          i = i + 1;
       }
       this.b.addAll(this.c.i());
       Collections.reverse(this.b);
       return;
    }
    public void O(View p0,Rect p1){
       p0.getLayoutParams().q(p1);
    }
    public void Q(){
       if (this.i != null && this.m != null) {
          this.getViewTreeObserver().removeOnPreDrawListener(this.m);
       }
       this.n = false;
       return;
    }
    public final void R(boolean p0){
       int childCount = this.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          CoordinatorLayout$Behavior uBehavior = childAt.getLayoutParams().f();
          if (uBehavior != null) {
             long l = SystemClock.uptimeMillis();
             MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0, 0, 0);
             if (p0) {
                uBehavior.onInterceptTouchEvent(this, childAt, motionEvent);
             }else {
                uBehavior.onTouchEvent(this, childAt, motionEvent);
             }
             motionEvent.recycle();
          }
          i = i + 1;
       }
       for (int i1 = 0; i1 < childCount; i1++) {
          this.getChildAt(i1).getLayoutParams().m();
       }
       this.k = null;
       this.h = false;
       return;
    }
    public final void V(View p0,int p1){
       CoordinatorLayout$LayoutParams layoutParams = p0.getLayoutParams();
       CoordinatorLayout$LayoutParams i = layoutParams.i;
       if (i != p1) {
          i0.d0(p0, (p1 - i));
          layoutParams.i = p1;
       }
       return;
    }
    public final void W(View p0,int p1){
       CoordinatorLayout$LayoutParams layoutParams = p0.getLayoutParams();
       CoordinatorLayout$LayoutParams j = layoutParams.j;
       if (j != p1) {
          i0.e0(p0, (p1 - j));
          layoutParams.j = p1;
       }
       return;
    }
    public final u0 X(u0 p0){
       if (!d.a(this.o, p0)) {
          this.o = p0;
          boolean b = true;
          boolean b1 = (p0 != null && p0.k() > 0)? true: false;
          this.p = b1;
          if (b1 || this.getBackground() != null) {
             b = false;
          }
          this.setWillNotDraw(b);
          p0 = this.k(p0);
          this.requestLayout();
       }
       return p0;
    }
    public final void Y(){
       if (i0.y(this)) {
          if (this.s == null) {
             this.s = new CoordinatorLayout$a(this);
          }
          i0.I0(this, this.s);
          this.setSystemUiVisibility(1280);
       }else {
          i0.I0(this, null);
       }
       return;
    }
    public boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       boolean b = (p0 instanceof CoordinatorLayout$LayoutParams && super.checkLayoutParams(p0))? true: false;
       return b;
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       CoordinatorLayout$LayoutParams layoutParams = p1.getLayoutParams();
       CoordinatorLayout$LayoutParams a = layoutParams.a;
       if (a != null) {
          float scrimOpacity = a.getScrimOpacity(this, p1);
          if (scrimOpacity > 0) {
             if (this.g == null) {
                this.g = new Paint();
             }
             this.g.setColor(layoutParams.a.getScrimColor(this, p1));
             this.g.setAlpha(CoordinatorLayout.i(Math.round((scrimOpacity * 0x437f0000)), 0, 255));
             int i = p0.save();
             if (p1.isOpaque()) {
                p0.clipRect((float)p1.getLeft(), (float)p1.getTop(), (float)p1.getRight(), (float)p1.getBottom(), Region$Op.DIFFERENCE);
             }
             p0.drawRect((float)this.getPaddingLeft(), (float)this.getPaddingTop(), (float)(this.getWidth() - this.getPaddingRight()), (float)(this.getHeight() - this.getPaddingBottom()), this.g);
             p0.restoreToCount(i);
          }
       }
       return super.drawChild(p0, p1, p2);
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       int[] drawableStat = this.getDrawableState();
       CoordinatorLayout tq = this.q;
       int i = 0;
       if (tq != null && tq.isStateful()) {
          i = i | tq.setState(drawableStat);
       }
       if (i) {
          this.invalidate();
       }
       return;
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return this.n();
    }
    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return this.o(p0);
    }
    public ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return this.p(p0);
    }
    public final List getDependencySortedChildren(){
       this.N();
       return Collections.unmodifiableList(this.b);
    }
    public final u0 getLastWindowInsets(){
       return this.o;
    }
    public int getNestedScrollAxes(){
       return this.t.a();
    }
    public Drawable getStatusBarBackground(){
       return this.q;
    }
    public int getSuggestedMinimumHeight(){
       return Math.max(super.getSuggestedMinimumHeight(), (this.getPaddingTop() + this.getPaddingBottom()));
    }
    public int getSuggestedMinimumWidth(){
       return Math.max(super.getSuggestedMinimumWidth(), (this.getPaddingLeft() + this.getPaddingRight()));
    }
    public void h(){
       if (this.i != null) {
          if (this.m == null) {
             this.m = new CoordinatorLayout$e(this);
          }
          this.getViewTreeObserver().addOnPreDrawListener(this.m);
       }
       this.n = true;
       return;
    }
    public final void j(CoordinatorLayout$LayoutParams p0,Rect p1,int p2,int p3){
       int i = Math.max((this.getPaddingLeft() + p0.leftMargin), Math.min(p1.left, (((this.getWidth() - this.getPaddingRight()) - p2) - p0.rightMargin)));
       int i1 = Math.max((this.getPaddingTop() + p0.topMargin), Math.min(p1.top, (((this.getHeight() - this.getPaddingBottom()) - p3) - p0.bottomMargin)));
       p1.set(i, i1, (p2 + i), (p3 + i1));
    }
    public final u0 k(u0 p0){
       if (p0.o()) {
          return p0;
       }
       int i = 0;
       int childCount = this.getChildCount();
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          if (i0.y(childAt)) {
             CoordinatorLayout$Behavior uBehavior = childAt.getLayoutParams().f();
             if (uBehavior != null) {
                p0 = uBehavior.onApplyWindowInsets(this, childAt, p0);
                if (p0.o()) {
                   break ;
                }
             }
          }
          i = i + 1;
       }
       return p0;
    }
    public void l(View p0){
       List list = this.c.g(p0);
       if (list != null && !list.isEmpty()) {
          int i = 0;
          while (i < list.size()) {
             View view = list.get(i);
             CoordinatorLayout$Behavior uBehavior = view.getLayoutParams().f();
             if (uBehavior != null) {
                uBehavior.onDependentViewChanged(this, view, p0);
             }
             i = i + 1;
          }
       }
       return;
    }
    public void m(){
       int childCount = this.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i1 < childCount) {
          if (this.B(this.getChildAt(i1))) {
             i = 1;
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       if (i != this.n) {
          if (i) {
             this.h();
          }else {
             this.Q();
          }
       }
       return;
    }
    public CoordinatorLayout$LayoutParams n(){
       return new CoordinatorLayout$LayoutParams(-2, -2);
    }
    public CoordinatorLayout$LayoutParams o(AttributeSet p0){
       return new CoordinatorLayout$LayoutParams(this.getContext(), p0);
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.R(false);
       if (this.n != null) {
          if (this.m == null) {
             this.m = new CoordinatorLayout$e(this);
          }
          this.getViewTreeObserver().addOnPreDrawListener(this.m);
       }
       if (this.o == null && i0.y(this)) {
          i0.p0(this);
       }
       this.i = true;
       return;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.R(false);
       if (this.n != null && this.m != null) {
          this.getViewTreeObserver().removeOnPreDrawListener(this.m);
       }
       CoordinatorLayout tl = this.l;
       if (tl != null) {
          this.onStopNestedScroll(tl);
       }
       this.i = false;
       return;
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       if (this.p != null && this.q != null) {
          CoordinatorLayout to = this.o;
          int i = (to != null)? to.k(): 0;
          if (i > 0) {
             this.q.setBounds(0, 0, this.getWidth(), i);
             this.q.draw(p0);
          }
       }
    label_0026 :
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       int actionMasked = p0.getActionMasked();
       if (!actionMasked) {
          this.R(true);
       }
       boolean b = this.M(p0, 0);
       if (actionMasked == 1 || actionMasked == 3) {
          this.R(true);
       }
       return b;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = i0.B(this);
       p1 = this.b.size();
       p2 = 0;
       while (p2 < p1) {
          View view = this.b.get(p2);
          if (view.getVisibility() != 8) {
             CoordinatorLayout$Behavior uBehavior = view.getLayoutParams().f();
             if (uBehavior == null || !uBehavior.onLayoutChild(this, view, i)) {
                this.J(view, i);
             }
          }
          p2++;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       int i9;
       int i10;
       int i11;
       int i12;
       int i13;
       int i14;
       CoordinatorLayout uCoordinator2;
       int i15;
       ViewGroup$LayoutParams layoutParams1;
       int i16;
       int i17;
       CoordinatorLayout uCoordinator = this;
       this.N();
       this.m();
       int paddingLeft = this.getPaddingLeft();
       int paddingTop = this.getPaddingTop();
       int paddingRight = this.getPaddingRight();
       int paddingBotto = this.getPaddingBottom();
       int i = i0.B(this);
       int i1 = (i == 1)? 1: 0;
       int mode = View$MeasureSpec.getMode(p0);
       int size = View$MeasureSpec.getSize(p0);
       int mode1 = View$MeasureSpec.getMode(p1);
       int size1 = View$MeasureSpec.getSize(p1);
       int i2 = paddingLeft + paddingRight;
       int i3 = paddingTop + paddingBotto;
       paddingTop = this.getSuggestedMinimumWidth();
       paddingBotto = this.getSuggestedMinimumHeight();
       int i4 = (uCoordinator.o != null && i0.y(this))? 1: 0;
       int i5 = uCoordinator.b.size();
       int i6 = paddingTop;
       int i7 = paddingBotto;
       CoordinatorLayout uCoordinator1 = null;
       for (int i8 = 0; i8 < i5; i5 = i10) {
          Object obj = uCoordinator.b.get(i8);
          if (obj.getVisibility() == 8) {
             i9 = i8;
             i10 = i5;
             i11 = paddingLeft;
          }else {
             ViewGroup$LayoutParams layoutParams = obj.getLayoutParams();
             CoordinatorLayout$LayoutParams e = layoutParams.e;
             if (e >= null && mode) {
                paddingTop = uCoordinator.x(e);
                i12 = g.b(CoordinatorLayout.U(layoutParams.c), i) & 0x07;
                i9 = uCoordinator1;
                if (i12 != 3 || i1) {
                   i13 = 5;
                   if (i12 != i13 || !i1) {
                      if (i12 != i13 || (!i1 || (i12 == 3 && i1))) {
                         paddingTop = paddingTop - paddingLeft;
                         i14 = Math.max(0, paddingTop);
                      }else {
                      label_00bc :
                         i14 = 0;
                      }
                   }
                }
                i13 = size - paddingRight;
                i13 = i13 - paddingTop;
                i14 = Math.max(0, i13);
                uCoordinator2 = null;
             }else {
                i9 = uCoordinator1;
                goto label_00bc ;
             }
             if (i4 && !i0.y(obj)) {
                paddingTop = uCoordinator.o.i() + uCoordinator.o.j();
                i13 = uCoordinator.o.k() + uCoordinator.o.h();
                paddingTop = size - paddingTop;
                i13 = size1 - i13;
                i12 = View$MeasureSpec.makeMeasureSpec(paddingTop, mode);
                i15 = View$MeasureSpec.makeMeasureSpec(i13, mode1);
             }else {
                i12 = p0;
                i15 = p1;
             }
             CoordinatorLayout$Behavior uBehavior = layoutParams.f();
             if (uBehavior != null) {
                layoutParams1 = layoutParams;
                i16 = i9;
                i9 = i8;
                i17 = i7;
                i11 = paddingLeft;
                paddingLeft = i6;
                i10 = i5;
                if (uBehavior.onMeasureChild(this, obj, i12, i14, i15, 0)) {
                label_0137 :
                   paddingTop = i2 + obj.getMeasuredWidth();
                   layoutParams = layoutParams1;
                   paddingTop = paddingTop + layoutParams.leftMargin;
                   paddingTop = paddingTop + layoutParams.rightMargin;
                   i13 = i3 + obj.getMeasuredHeight();
                   i13 = i13 + layoutParams.topMargin;
                   i13 = i13 + layoutParams.bottomMargin;
                   paddingBotto = Math.max(i17, i13);
                   i13 = View.combineMeasuredStates(i16, obj.getMeasuredState());
                   i6 = Math.max(paddingLeft, paddingTop);
                   i7 = paddingBotto;
                }
             }else {
                layoutParams1 = layoutParams;
                i17 = i7;
                i10 = i5;
                i11 = paddingLeft;
                i16 = i9;
                i9 = i8;
                paddingLeft = i6;
             }
             this.K(obj, i12, i14, i15, 0);
             goto label_0137 ;
          }
          i8 = i9 + 1;
          paddingLeft = i11;
       }
       uCoordinator2 = uCoordinator1;
       uCoordinator.setMeasuredDimension(View.resolveSizeAndState(i6, p0, (0xff000000 & uCoordinator2)), View.resolveSizeAndState(i7, p1, (uCoordinator2 << 16)));
       return;
    }
    public boolean onNestedFling(View p0,float p1,float p2,boolean p3){
       int childCount = this.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          if (childAt.getVisibility() != 8) {
             CoordinatorLayout$LayoutParams layoutParams = childAt.getLayoutParams();
             if (layoutParams.j(0)) {
                CoordinatorLayout$Behavior uBehavior = layoutParams.f();
                if (uBehavior != null) {
                   i1 = i1 | uBehavior.onNestedFling(this, childAt, p0, p1, p2, p3);
                }
             }
          }
          i = i + 1;
       }
       if (i1) {
          this.I(1);
       }
       return i1;
    }
    public boolean onNestedPreFling(View p0,float p1,float p2){
       int childCount = this.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          if (childAt.getVisibility() != 8) {
             CoordinatorLayout$LayoutParams layoutParams = childAt.getLayoutParams();
             if (layoutParams.j(0)) {
                CoordinatorLayout$Behavior uBehavior = layoutParams.f();
                if (uBehavior != null) {
                   i1 = i1 | uBehavior.onNestedPreFling(this, childAt, p0, p1, p2);
                }
             }
          }
          i = i + 1;
       }
       return i1;
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3){
       this.onNestedPreScroll(p0, p1, p2, p3, 0);
    }
    public void onNestedPreScroll(View p0,int p1,int p2,int[] p3,int p4){
       ViewGroup viewGroup = this;
       int childCount = this.getChildCount();
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (i1 < childCount) {
          View childAt = viewGroup.getChildAt(i1);
          if (childAt.getVisibility() == 8) {
             int i4 = p4;
          }else {
             CoordinatorLayout$LayoutParams layoutParams = childAt.getLayoutParams();
             if (layoutParams.j(p4)) {
                CoordinatorLayout$Behavior uBehavior = layoutParams.f();
                if (uBehavior != null) {
                   CoordinatorLayout f = viewGroup.f;
                   f[1] = 0;
                   f[0] = 0;
                   uBehavior.onNestedPreScroll(this, childAt, p0, p1, p2, f, p4);
                   CoordinatorLayout f1 = viewGroup.f;
                   i = (p1 > 0)? Math.max(i2, f1[0]): Math.min(i2, f1[0]);
                   i2 = i;
                   f1 = viewGroup.f;
                   i = (p2 > 0)? Math.max(i3, f1[1]): Math.min(i3, f1[1]);
                   i3 = i;
                   i = 1;
                }
             }
          }
          i1 = i1 + 1;
       }
       p3[0] = i2;
       p3[1] = i3;
       if (i != null) {
          viewGroup.I(1);
       }
       return;
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4){
       this.onNestedScroll(p0, p1, p2, p3, p4, 0);
    }
    public void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5){
       int childCount = this.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i1 < childCount) {
          View childAt = this.getChildAt(i1);
          if (childAt.getVisibility() == 8) {
             int i2 = p5;
          }else {
             CoordinatorLayout$LayoutParams layoutParams = childAt.getLayoutParams();
             if (layoutParams.j(p5)) {
                CoordinatorLayout$Behavior uBehavior = layoutParams.f();
                if (uBehavior != null) {
                   uBehavior.onNestedScroll(this, childAt, p0, p1, p2, p3, p4, p5);
                   i = 1;
                }
             }
          }
          i1 = i1 + 1;
       }
       if (i) {
          this.I(1);
       }
       return;
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2){
       this.onNestedScrollAccepted(p0, p1, p2, 0);
    }
    public void onNestedScrollAccepted(View p0,View p1,int p2,int p3){
       this.t.c(p0, p1, p2, p3);
       this.l = p1;
       int childCount = this.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          CoordinatorLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          if (layoutParams.j(p3)) {
             CoordinatorLayout$Behavior uBehavior = layoutParams.f();
             if (uBehavior != null) {
                uBehavior.onNestedScrollAccepted(this, childAt, p0, p1, p2, p3);
             }
          }
          i = i + 1;
       }
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (!p0 instanceof CoordinatorLayout$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.a());
          CoordinatorLayout$SavedState d = p0.d;
          int i = 0;
          int childCount = this.getChildCount();
          while (i < childCount) {
             View childAt = this.getChildAt(i);
             int id = childAt.getId();
             CoordinatorLayout$Behavior uBehavior = this.z(childAt).f();
             if (id != -1 && uBehavior != null) {
                Parcelable parcelable = d.get(id);
                if (parcelable != null) {
                   uBehavior.onRestoreInstanceState(this, childAt, parcelable);
                }
             }
             i = i + 1;
          }
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       CoordinatorLayout$SavedState savedState = new CoordinatorLayout$SavedState(super.onSaveInstanceState());
       SparseArray sparseArray = new SparseArray();
       int childCount = this.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          int id = childAt.getId();
          CoordinatorLayout$Behavior uBehavior = childAt.getLayoutParams().f();
          if (id != -1 && uBehavior != null) {
             Parcelable parcelable = uBehavior.onSaveInstanceState(this, childAt);
             if (parcelable != null) {
                sparseArray.append(id, parcelable);
             }
          }
          i = i + 1;
       }
       savedState.d = sparseArray;
       return savedState;
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       return this.onStartNestedScroll(p0, p1, p2, 0);
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2,int p3){
       int i = p3;
       int childCount = this.getChildCount();
       int i1 = 0;
       int i2 = 0;
       while (i1 < childCount) {
          View childAt = this.getChildAt(i1);
          if (childAt.getVisibility() != 8) {
             ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
             CoordinatorLayout$Behavior uBehavior = layoutParams.f();
             if (uBehavior != null) {
                boolean b = uBehavior.onStartNestedScroll(this, childAt, p0, p1, p2, p3);
                i2 = i2 | b;
                layoutParams.r(i, b);
             }else {
                layoutParams.r(i, false);
             }
          }
          i1 = i1 + 1;
       }
       return i2;
    }
    public void onStopNestedScroll(View p0){
       this.onStopNestedScroll(p0, 0);
    }
    public void onStopNestedScroll(View p0,int p1){
       this.t.e(p0, p1);
       int childCount = this.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          CoordinatorLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          if (layoutParams.j(p1)) {
             CoordinatorLayout$Behavior uBehavior = layoutParams.f();
             if (uBehavior != null) {
                uBehavior.onStopNestedScroll(this, childAt, p0, p1);
             }
             layoutParams.l(p1);
             layoutParams.k();
          }
          i = i + 1;
       }
       this.l = null;
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b;
       boolean b1;
       CoordinatorLayout uCoordinator = this;
       MotionEvent motionEvent = p0;
       int actionMasked = p0.getActionMasked();
       if (uCoordinator.k == null) {
          b = uCoordinator.M(motionEvent, 1);
          if (!b) {
          label_002b :
             b1 = 0;
          label_002c :
             MotionEvent motionEvent1 = null;
             if (uCoordinator.k == null) {
                b1 = b1 | super.onTouchEvent(p0);
             }else if(b){
                long l = SystemClock.uptimeMillis();
                motionEvent1 = MotionEvent.obtain(l, l, 3, 0, 0, 0);
                super.onTouchEvent(motionEvent1);
             }
             if (motionEvent1 != null) {
                motionEvent1.recycle();
             }
             if (actionMasked == 1 || actionMasked == 3) {
                uCoordinator.R(false);
             }
             return b1;
          }
       }else {
          b = false;
       }
       CoordinatorLayout$Behavior uBehavior = uCoordinator.k.getLayoutParams().f();
       if (uBehavior != null) {
          b1 = uBehavior.onTouchEvent(uCoordinator, uCoordinator.k, motionEvent);
          goto label_002c ;
       }else {
          goto label_002b ;
       }
    }
    public CoordinatorLayout$LayoutParams p(ViewGroup$LayoutParams p0){
       if (p0 instanceof CoordinatorLayout$LayoutParams) {
          return new CoordinatorLayout$LayoutParams(p0);
       }
       if (p0 instanceof ViewGroup$MarginLayoutParams) {
          return new CoordinatorLayout$LayoutParams(p0);
       }
       return new CoordinatorLayout$LayoutParams(p0);
    }
    public void q(View p0,boolean p1,Rect p2){
       if (p0.isLayoutRequested() || p0.getVisibility() == 8) {
          p2.setEmpty();
          return;
       }else if(p1){
          this.u(p0, p2);
       }else {
          p2.set(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom());
       }
       return;
    }
    public boolean requestChildRectangleOnScreen(View p0,Rect p1,boolean p2){
       CoordinatorLayout$Behavior uBehavior = p0.getLayoutParams().f();
       if (uBehavior != null && uBehavior.onRequestChildRectangleOnScreen(this, p0, p1, p2)) {
          return true;
       }
       return super.requestChildRectangleOnScreen(p0, p1, p2);
    }
    public void requestDisallowInterceptTouchEvent(boolean p0){
       super.requestDisallowInterceptTouchEvent(p0);
       if (p0 && this.h == null) {
          this.R(false);
          this.h = true;
       }
       return;
    }
    public List s(View p0){
       List list = this.c.h(p0);
       this.e.clear();
       if (list != null) {
          this.e.addAll(list);
       }
       return this.e;
    }
    public void setFitsSystemWindows(boolean p0){
       super.setFitsSystemWindows(p0);
       this.Y();
    }
    public void setOnHierarchyChangeListener(ViewGroup$OnHierarchyChangeListener p0){
       this.r = p0;
    }
    public void setStatusBarBackground(Drawable p0){
       CoordinatorLayout tq = this.q;
       if (tq != p0) {
          Drawable$Callback uCallback = null;
          if (tq != null) {
             tq.setCallback(uCallback);
          }
          if (p0 != null) {
             uCallback = p0.mutate();
          }
          this.q = uCallback;
          if (uCallback != null) {
             if (uCallback.isStateful()) {
                this.q.setState(this.getDrawableState());
             }
             a.m(this.q, i0.B(this));
             CoordinatorLayout tq1 = this.q;
             boolean b = (!this.getVisibility())? true: false;
             tq1.setVisible(b, false);
             this.q.setCallback(this);
          }
          i0.j0(this);
       }
       return;
    }
    public void setStatusBarBackgroundColor(int p0){
       this.setStatusBarBackground(new ColorDrawable(p0));
    }
    public void setStatusBarBackgroundResource(int p0){
       Drawable drawable = (p0)? ContextCompat.getDrawable(this.getContext(), p0): null;
       this.setStatusBarBackground(drawable);
       return;
    }
    public void setVisibility(int p0){
       super.setVisibility(p0);
       boolean b = (!p0)? true: false;
       CoordinatorLayout tq = this.q;
       if (tq != null && tq.isVisible() != b) {
          this.q.setVisible(b, false);
       }
       return;
    }
    public List t(View p0){
       List list = this.c.g(p0);
       this.e.clear();
       if (list != null) {
          this.e.addAll(list);
       }
       return this.e;
    }
    public void u(View p0,Rect p1){
       b.a(this, p0, p1);
    }
    public void v(View p0,int p1,Rect p2,Rect p3){
       CoordinatorLayout$LayoutParams layoutParams = p0.getLayoutParams();
       int measuredWidt = p0.getMeasuredWidth();
       int measuredHeig = p0.getMeasuredHeight();
       this.w(p0, p1, p2, p3, layoutParams, measuredWidt, measuredHeig);
       this.j(layoutParams, p3, measuredWidt, measuredHeig);
    }
    public boolean verifyDrawable(Drawable p0){
       boolean b = (super.verifyDrawable(p0) || p0 == this.q)? true: false;
       return b;
    }
    public final void w(View p0,int p1,Rect p2,Rect p3,CoordinatorLayout$LayoutParams p4,int p5,int p6){
       Rect left;
       Rect top;
       int i = g.b(CoordinatorLayout.S(p4.c), p1);
       p1 = g.b(CoordinatorLayout.T(p4.d), p1);
       int i1 = i & 0x07;
       i = i & 0x70;
       int i2 = p1 & 0x07;
       p1 = p1 & 0x70;
       if (i2 != 1) {
          left = (i2 != 5)? p2.left: p2.right;
       }else {
          left = p2.left + (p2.width() / 2);
       }
       if (p1 != 16) {
          top = (p1 != 80)? p2.top: p2.bottom;
       }else {
          p1 = p2.top + (p2.height() / 2);
       }
       if (i1 != 1) {
          if (i1 != 5) {
             left = left - p5;
          }
       }else {
          left = left - (p5 / 2);
       }
       if (i != 16) {
          if (i != 80) {
             top = top - p6;
          }
       }else {
          top = top - (p6 / 2);
       }
       p3.set(left, top, (p5 + left), (p6 + top));
       return;
    }
    public final int x(int p0){
       CoordinatorLayout tj = this.j;
       if (tj == null) {
          "No keylines defined for "+this+" - attempted index lookup "+p0;
          return 0;
       }else if(p0 < 0 || p0 >= tj.length){
          "Keyline index "+p0+" out of range for "+this;
          return 0;
       }else {
          return tj[p0];
       }
    }
    public void y(View p0,Rect p1){
       p1.set(p0.getLayoutParams().h());
    }
    public CoordinatorLayout$LayoutParams z(View p0){
       CoordinatorLayout$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams.b == null) {
          if (p0 instanceof CoordinatorLayout$b) {
             layoutParams.o(p0.getBehavior());
             layoutParams.b = true;
          }else {
             CoordinatorLayout$c uoc = null;
             for (Class class = p0.getClass(); class != null; class = class.getSuperclass()) {
                uoc = class.getAnnotation(CoordinatorLayout$c.class);
                if (uoc == null) {
                }else if(uoc != null){
                   try{
                      Class[] uClassArray = new Class[0];
                      Object[] objArray = new Object[0];
                      layoutParams.o(uoc.value().getDeclaredConstructor(uClassArray).newInstance(objArray));
                   }catch(java.lang.Exception e0){
                      uoc.value().getName();
                   }
                }
             }
          }
       }
       return layoutParams;
    }
}
