package g2.a;
import a2.a;
import android.graphics.Rect;
import g2.a$a;
import g2.a$b;
import android.view.View;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import android.view.accessibility.AccessibilityManager;
import a2.i0;
import java.lang.IllegalArgumentException;
import android.view.ViewParent;
import androidx.collection.SparseArrayCompat;
import b2.d;
import g2.b$b;
import g2.b$a;
import g2.b;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import a2.l0;
import b2.e;
import g2.a$c;
import java.util.List;
import java.lang.CharSequence;
import java.lang.RuntimeException;
import android.view.accessibility.AccessibilityRecord;
import b2.f;
import java.util.ArrayList;
import java.lang.Integer;
import android.view.MotionEvent;
import android.view.KeyEvent;

public abstract class a extends a	// class@002035
{
    public final Rect d;
    public final Rect e;
    public final Rect f;
    public final int[] g;
    public final AccessibilityManager h;
    public final View i;
    public a$c j;
    public int k;
    public int l;
    public int m;
    public static final Rect n;
    public static final b$a o;
    public static final b$b p;

    static {
       a.n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
       a.o = new a$a();
       a.p = new a$b();
    }
    public void a(View p0){
       super();
       this.d = new Rect();
       this.e = new Rect();
       this.f = new Rect();
       int[] ointArray = new int[2];
       this.g = ointArray;
       int i = Integer.MIN_VALUE;
       this.k = i;
       this.l = i;
       this.m = i;
       if (p0 == null) {
          throw new IllegalArgumentException("View may not be null");
       }
       this.i = p0;
       this.h = p0.getContext().getSystemService("accessibility");
       p0.setFocusable(true);
       if (!i0.z(p0)) {
          i0.D0(p0, true);
       }
       return;
    }
    public static int B(int p0){
       if (p0 == 19) {
          return 33;
       }
       if (p0 == 21) {
          return 17;
       }
       if (p0 != 22) {
          return 130;
       }
       return 66;
    }
    public static Rect z(View p0,int p1,Rect p2){
       int width = p0.getWidth();
       int height = p0.getHeight();
       if (p1 != 17) {
          if (p1 != 33) {
             if (p1 != 66) {
                if (p1 == 130) {
                   p2.set(0, -1, width, -1);
                }else {
                   throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
             }else {
                p2.set(-1, 0, -1, height);
             }
          }else {
             p2.set(0, height, width, height);
          }
       }else {
          p2.set(width, 0, width, height);
       }
       return p2;
    }
    public final boolean A(Rect p0){
       boolean b = false;
       if (p0 != null && !p0.isEmpty()) {
          if (this.i.getWindowVisibility()) {
             return b;
          }else {
             ViewParent parent = this.i.getParent();
             while (true) {
                if (parent instanceof View) {
                   if (parent.getAlpha() <= 0 || parent.getVisibility()) {
                      return b;
                   }else {
                      parent = parent.getParent();
                   }
                }else if(parent != null){
                   b = true;
                   break ;
                }
             }
          }
       }
       return b;
    }
    public final boolean C(int p0,Rect p1){
       d uod1;
       boolean b;
       d uod2;
       SparseArrayCompat sparseArrayC = this.v();
       a tl = this.l;
       int i = Integer.MIN_VALUE;
       tl = (tl == i)? 0: sparseArrayC.get(tl);
       d uod = tl;
       int i1 = 1;
       if (p0 != i1 && p0 != 2) {
          if (p0 != 17 && (p0 != 33 && (p0 == 66 || p0 == 130))) {
             Rect rect = new Rect();
             tl = this.l;
             if (tl != i) {
                this.w(tl, rect);
             }else if(p1 != null){
                rect.set(p1);
             }else {
                a.z(this.i, p0, rect);
             }
             uod1 = b.c(sparseArrayC, a.p, a.o, uod, rect, p0);
          }else {
             throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
          }
       }else if(i0.B(this.i) == i1){
          b = true;
       }else {
          b = false;
       }
       uod1 = b.d(sparseArrayC, a.p, a.o, uod, p0, b, false);
       if (uod1 != null) {
          i = sparseArrayC.keyAt(sparseArrayC.indexOfValue(uod1));
       }
       return this.M(i);
    }
    public d D(int p0){
       if (p0 == -1) {
          return this.s();
       }
       return this.r(p0);
    }
    public final void E(boolean p0,int p1,Rect p2){
       a tl = this.l;
       if (tl != Integer.MIN_VALUE) {
          this.m(tl);
       }
       if (p0) {
          this.C(p1, p2);
       }
       return;
    }
    public abstract boolean F(int p0,int p1,Bundle p2);
    public void G(d p0){
    }
    public abstract void H(int p0,d p1);
    public boolean I(int p0,int p1,Bundle p2){
       if (p0 != -1) {
          return this.J(p0, p1, p2);
       }
       return this.K(p1, p2);
    }
    public final boolean J(int p0,int p1,Bundle p2){
       if (p1 == 1) {
          return this.M(p0);
       }
       if (p1 == 2) {
          return this.m(p0);
       }
       if (p1 == 64) {
          return this.L(p0);
       }
       if (p1 != 128) {
          return this.F(p0, p1, p2);
       }
       return this.l(p0);
    }
    public final boolean K(int p0,Bundle p1){
       return i0.i0(this.i, p0, p1);
    }
    public final boolean L(int p0){
       boolean b = false;
       if (this.h.isEnabled() && this.h.isTouchExplorationEnabled()) {
          a tk = this.k;
          if (tk != p0) {
             if (tk != Integer.MIN_VALUE) {
                this.l(tk);
             }
             this.k = p0;
             this.i.invalidate();
             this.N(p0, 0x8000);
             return true;
          }
       }
       return b;
    }
    public final boolean M(int p0){
       boolean b = false;
       if (!this.i.isFocused() && !this.i.requestFocus()) {
          return b;
       }
       a tl = this.l;
       if (tl == p0) {
          return b;
       }
       if (tl != Integer.MIN_VALUE) {
          this.m(tl);
       }
       this.l = p0;
       this.N(p0, 8);
       return true;
    }
    public final boolean N(int p0,int p1){
       if (p0 == Integer.MIN_VALUE || !this.h.isEnabled()) {
          return false;
       }
       ViewParent parent = this.i.getParent();
       if (parent == null) {
          return false;
       }
       return l0.h(parent, this.i, this.o(p0, p1));
    }
    public final void O(int p0){
       a tm = this.m;
       if (tm == p0) {
          return;
       }
       this.m = p0;
       this.N(p0, 128);
       this.N(tm, 256);
       return;
    }
    public e b(View p0){
       if (this.j == null) {
          this.j = new a$c(this);
       }
       return this.j;
    }
    public void f(View p0,d p1){
       super.f(p0, p1);
       this.G(p1);
    }
    public final boolean l(int p0){
       if (this.k != p0) {
          return false;
       }
       this.k = Integer.MIN_VALUE;
       this.i.invalidate();
       this.N(p0, 0x10000);
       return true;
    }
    public final boolean m(int p0){
       if (this.l != p0) {
          return false;
       }
       this.l = Integer.MIN_VALUE;
       this.N(p0, 8);
       return true;
    }
    public final boolean n(){
       a tl = this.l;
       boolean b = (tl != Integer.MIN_VALUE && this.F(tl, 16, null))? true: false;
       return b;
    }
    public final AccessibilityEvent o(int p0,int p1){
       if (p0 != -1) {
          return this.p(p0, p1);
       }
       return this.q(p1);
    }
    public void onInitializeAccessibilityEvent(View p0,AccessibilityEvent p1){
       super.onInitializeAccessibilityEvent(p0, p1);
    }
    public final AccessibilityEvent p(int p0,int p1){
       AccessibilityEvent uAccessibili = AccessibilityEvent.obtain(p1);
       d uod = this.D(p0);
       uAccessibili.getText().add(uod.w());
       uAccessibili.setContentDescription(uod.q());
       uAccessibili.setScrollable(uod.J());
       uAccessibili.setPassword(uod.I());
       uAccessibili.setEnabled(uod.E());
       uAccessibili.setChecked(uod.C());
       if (uAccessibili.getText().isEmpty() && uAccessibili.getContentDescription() == null) {
          throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId\(\)");
       }
       uAccessibili.setClassName(uod.o());
       f.g(uAccessibili, this.i, p0);
       uAccessibili.setPackageName(this.i.getContext().getPackageName());
       return uAccessibili;
    }
    public final AccessibilityEvent q(int p0){
       AccessibilityEvent uAccessibili = AccessibilityEvent.obtain(p0);
       this.i.onInitializeAccessibilityEvent(uAccessibili);
       return uAccessibili;
    }
    public final d r(int p0){
       d uod = d.M();
       uod.h0(true);
       uod.j0(true);
       uod.a0("android.view.View");
       Rect n = a.n;
       uod.V(n);
       uod.W(n);
       uod.r0(this.i);
       this.H(p0, uod);
       if (uod.w() == null && uod.q() == null) {
          throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId\(\)");
       }
       uod.l(this.e);
       if (this.e.equals(n)) {
          throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId\(\)");
       }
       int i = uod.k();
       if (i & 0x40) {
          throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId\(\)");
       }
       int i1 = 128;
       if (i & i1) {
          throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId\(\)");
       }
       uod.p0(this.i.getContext().getPackageName());
       uod.A0(this.i, p0);
       if (this.k == p0) {
          uod.T(true);
          uod.a(i1);
       }else {
          uod.T(0);
          uod.a(64);
       }
       boolean b = (this.l == p0)? true: false;
       if (b) {
          uod.a(2);
       }else if(uod.F()){
          uod.a(true);
       }
       uod.k0(b);
       this.i.getLocationOnScreen(this.g);
       uod.m(this.d);
       if (this.d.equals(n)) {
          uod.l(this.d);
          int i2 = -1;
          if (uod.b != i2) {
             d uod1 = d.M();
             d b1 = uod.b;
             while (b1 != i2) {
                uod1.s0(this.i, i2);
                uod1.V(a.n);
                this.H(b1, uod1);
                uod1.l(this.e);
                a te = this.e;
                this.d.offset(te.left, te.top);
                b1 = uod1.b;
             }
             uod1.Q();
          }
          this.d.offset((this.g[0] - this.i.getScrollX()), (this.g[1] - this.i.getScrollY()));
       }
       if (this.i.getLocalVisibleRect(this.f)) {
          this.f.offset((this.g[0] - this.i.getScrollX()), (this.g[1] - this.i.getScrollY()));
          if (this.d.intersect(this.f)) {
             uod.W(this.d);
             if (this.A(this.d)) {
                uod.E0(true);
             }
          }
       }
       return uod;
    }
    public final d s(){
       d uod = d.N(this.i);
       i0.g0(this.i, uod);
       ArrayList uArrayList = new ArrayList();
       this.y(uArrayList);
       if (uod.n() > 0 && uArrayList.size() > 0) {
          throw new RuntimeException("Views cannot have both real and virtual children");
       }
       int i1 = uArrayList.size();
       for (int i = 0; i < i1; i = i + 1) {
          uod.d(this.i, uArrayList.get(i).intValue());
       }
       return uod;
    }
    public final boolean t(MotionEvent p0){
       boolean b = true;
       if (this.h.isEnabled() && this.h.isTouchExplorationEnabled()) {
          int action = p0.getAction();
          if (action != 7 && action != 9) {
             if (action != 10) {
                return false;
             }else if(this.m != Integer.MIN_VALUE){
                this.O(Integer.MIN_VALUE);
                return b;
             }else {
                return false;
             }
          }else {
             int i = this.x(p0.getX(), p0.getY());
             this.O(i);
             if (i != Integer.MIN_VALUE) {
             label_0041 :
                return b;
             }
          }
       }
       b = false;
       goto label_0041 ;
    }
    public final boolean u(KeyEvent p0){
       int i = 0;
       if (p0.getAction() != 1) {
          int keyCode = p0.getKeyCode();
          if (keyCode != 61) {
             if (keyCode != 66) {
                switch (keyCode){
                    case 19:
                    case 21:
                    case 22:
                    case 20:
                      if (p0.hasNoModifiers()) {
                         keyCode = a.B(keyCode);
                         int i1 = p0.getRepeatCount() + 1;
                         int i2 = 0;
                         while (i < i1 && this.C(keyCode, null)) {
                            i = i + 1;
                            i2 = 1;
                         }
                         i = i2;
                      }
                      break;
                    case 23:
                      break;
                    default:
                }
             }
             if (p0.hasNoModifiers() && !p0.getRepeatCount()) {
                this.n();
                i = true;
             }
          }else if(p0.hasNoModifiers()){
             i = this.C(2, null);
          }else if(p0.hasModifiers(1)){
             i = this.C(1, null);
          }
       }
       return i;
    }
    public final SparseArrayCompat v(){
       ArrayList uArrayList = new ArrayList();
       this.y(uArrayList);
       SparseArrayCompat sparseArrayC = new SparseArrayCompat();
       for (int i = 0; i < uArrayList.size(); i = i + 1) {
          sparseArrayC.put(i, this.r(i));
       }
       return sparseArrayC;
    }
    public final void w(int p0,Rect p1){
       this.D(p0).l(p1);
    }
    public abstract int x(float p0,float p1);
    public abstract void y(List p0);
}
