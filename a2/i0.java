package a2.i0;
import java.util.concurrent.atomic.AtomicInteger;
import a2.i0$a;
import a2.i0$f;
import android.view.View;
import android.os.Build$VERSION;
import a2.a;
import android.graphics.Paint;
import android.view.ViewParent;
import a2.z;
import a2.i0$h;
import a2.u0;
import a2.i0$i;
import java.lang.CharSequence;
import a2.i0$g;
import java.lang.Object;
import a2.d0;
import android.view.PointerIcon;
import java.lang.String;
import java.util.List;
import a2.v0;
import a2.i0$k;
import android.content.Context;
import android.content.ContextWrapper;
import android.app.Activity;
import android.view.Window;
import a2.q0;
import a2.r0$b;
import a2.r0;
import android.view.View$AccessibilityDelegate;
import a2.i0$d;
import java.lang.Class;
import a2.r;
import java.lang.Boolean;
import a2.i0$e;
import b2.d$a;
import a2.m0;
import java.util.WeakHashMap;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.Objects;
import android.graphics.Rect;
import android.view.WindowInsets;
import b2.d;
import android.view.accessibility.AccessibilityNodeInfo;
import a2.i0$c;
import android.os.Bundle;
import android.view.KeyEvent;
import a2.i0$m;
import java.lang.Runnable;
import a2.a$a;
import java.lang.reflect.Field;
import b2.g;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import a2.i0$j;
import java.util.ArrayList;
import a2.i0$b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.view.Display;
import android.graphics.drawable.Drawable;
import java.lang.ThreadLocal;
import android.view.ViewGroup;
import java.lang.reflect.Method;

public class i0	// class@00006e
{
    public static i0$f A;
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final AtomicInteger k;
    public static Field l;
    public static boolean m;
    public static Field n;
    public static boolean o;
    public static Method p;
    public static Method q;
    public static boolean r;
    public static WeakHashMap s;
    public static WeakHashMap t;
    public static Method u;
    public static Field v;
    public static boolean w;
    public static ThreadLocal x;
    public static final int[] y;
    public static final b0 z;

    static {
       i0.k = new AtomicInteger(1);
       i0.t = null;
       i0.w = false;
       i0.y = new int[32]{0x7f0a0040,0x7f0a0041,0x7f0a004c,0x7f0a0057,0x7f0a005a,0x7f0a005b,0x7f0a005c,0x7f0a005d,0x7f0a005e,0x7f0a005f,0x7f0a0042,0x7f0a0043,0x7f0a0044,0x7f0a0045,0x7f0a0046,0x7f0a0047,0x7f0a0048,0x7f0a0049,0x7f0a004a,0x7f0a004b,0x7f0a004d,0x7f0a004e,0x7f0a004f,0x7f0a0050,0x7f0a0051,0x7f0a0052,0x7f0a0053,0x7f0a0054,0x7f0a0055,0x7f0a0056,0x7f0a0058,0x7f0a0059};
       i0.z = new i0$a();
       i0.A = new i0$f();
    }
    public static int A(View p0){
       if (Build$VERSION.SDK_INT >= 26) {
          return p0.getImportantForAutofill();
       }
       return 0;
    }
    public static void A0(View p0,float p1){
       p0.setElevation(p1);
    }
    public static int B(View p0){
       return p0.getLayoutDirection();
    }
    public static void B0(View p0,boolean p1){
       p0.setFitsSystemWindows(p1);
    }
    public static int C(View p0){
       return p0.getMinimumHeight();
    }
    public static void C0(View p0,boolean p1){
       p0.setHasTransientState(p1);
    }
    public static int D(View p0){
       return p0.getMinimumWidth();
    }
    public static void D0(View p0,int p1){
       p0.setImportantForAccessibility(p1);
    }
    public static a E(View p0){
       a uoa = i0.m(p0);
       if (uoa == null) {
          uoa = new a();
       }
       i0.s0(p0, uoa);
       return uoa;
    }
    public static void E0(View p0,int p1){
       if (Build$VERSION.SDK_INT >= 26) {
          p0.setImportantForAutofill(p1);
       }
       return;
    }
    public static int F(View p0){
       return p0.getOverScrollMode();
    }
    public static void F0(View p0,Paint p1){
       p0.setLayerPaint(p1);
    }
    public static int G(View p0){
       return p0.getPaddingEnd();
    }
    public static void G0(View p0,int p1,Paint p2){
       p0.setLayerType(p1, null);
    }
    public static int H(View p0){
       return p0.getPaddingStart();
    }
    public static void H0(View p0,boolean p1){
       p0.setNestedScrollingEnabled(p1);
    }
    public static ViewParent I(View p0){
       return p0.getParentForAccessibility();
    }
    public static void I0(View p0,z p1){
       i0$h.d(p0, p1);
    }
    public static u0 J(View p0){
       if (Build$VERSION.SDK_INT >= 23) {
          return i0$i.a(p0);
       }
       return i0$h.c(p0);
    }
    public static void J0(View p0,int p1,int p2,int p3,int p4){
       p0.setPaddingRelative(p1, p2, p3, p4);
    }
    public static final CharSequence K(View p0){
       return i0.T0().d(p0);
    }
    public static void K0(View p0,d0 p1){
       if (Build$VERSION.SDK_INT >= 24) {
          PointerIcon pointerIcon = (p1 != null)? p1.a(): null;
          p0.setPointerIcon(pointerIcon);
       }
       return;
    }
    public static String L(View p0){
       return p0.getTransitionName();
    }
    public static void L0(View p0,int p1,int p2){
       if (Build$VERSION.SDK_INT >= 23) {
          p0.setScrollIndicators(p1, p2);
       }
       return;
    }
    public static float M(View p0){
       return p0.getTranslationX();
    }
    public static void M0(View p0,List p1){
       if (Build$VERSION.SDK_INT >= 29) {
          p0.setSystemGestureExclusionRects(p1);
       }
       return;
    }
    public static float N(View p0){
       return p0.getTranslationY();
    }
    public static void N0(View p0,String p1){
       p0.setTransitionName(p1);
    }
    public static float O(View p0){
       return p0.getTranslationZ();
    }
    public static void O0(View p0,float p1){
       p0.setTranslationZ(p1);
    }
    public static v0 P(View p0){
       v0 ov0;
       if (Build$VERSION.SDK_INT >= 30) {
          return i0$k.a(p0);
       }
       Context context = p0.getContext();
       while (true) {
          ov0 = null;
          if (!context instanceof ContextWrapper) {
             return ov0;
          }
          if (context instanceof Activity) {
             Window window = context.getWindow();
             if (window != null) {
                ov0 = q0.a(window, p0);
                break ;
             }
             break ;
          }else {
             context = context.getBaseContext();
          }
       }
       return ov0;
    }
    public static void P0(View p0){
       if (!i0.z(p0)) {
          i0.D0(p0, 1);
       }
       ViewParent parent = p0.getParent();
       while (parent instanceof View) {
          if (i0.z(parent) == 4) {
             i0.D0(p0, 2);
             break ;
          }
          parent = parent.getParent();
       }
       return;
    }
    public static int Q(View p0){
       return p0.getWindowSystemUiVisibility();
    }
    public static void Q0(View p0,r0$b p1){
       r0.d(p0, p1);
    }
    public static float R(View p0){
       return p0.getZ();
    }
    public static void R0(View p0,float p1){
       p0.setX(p1);
    }
    public static boolean S(View p0){
       boolean b = (i0.n(p0) != null)? true: false;
       return b;
    }
    public static void S0(View p0,float p1){
       p0.setZ(p1);
    }
    public static boolean T(View p0){
       return p0.hasOnClickListeners();
    }
    public static i0$g T0(){
       return new i0$d(0x7f0a3d27, CharSequence.class, 64, 30);
    }
    public static boolean U(View p0){
       return p0.hasOverlappingRendering();
    }
    public static void U0(View p0){
       p0.stopNestedScroll();
    }
    public static boolean V(View p0){
       return p0.hasTransientState();
    }
    public static void V0(View p0,int p1){
       if (p0 instanceof r) {
          p0.stopNestedScroll(p1);
       }else if(!p1){
          i0.U0(p0);
       }
       return;
    }
    public static boolean W(View p0){
       Boolean uBoolean = i0.a().d(p0);
       boolean b = (uBoolean == null)? false: uBoolean.booleanValue();
       return b;
    }
    public static void W0(View p0){
       float translationY = p0.getTranslationY();
       p0.setTranslationY((0x3f800000 + translationY));
       p0.setTranslationY(translationY);
    }
    public static boolean X(View p0){
       return p0.isAttachedToWindow();
    }
    public static boolean Y(View p0){
       return p0.isLaidOut();
    }
    public static boolean Z(View p0){
       return p0.isNestedScrollingEnabled();
    }
    public static i0$g a(){
       return new i0$e(0x7f0a3cc6, Boolean.class, 28);
    }
    public static boolean a0(View p0){
       return p0.isPaddingRelative();
    }
    public static void b(View p0,d$a p1){
       i0.E(p0);
       i0.n0(p1.b(), p0);
       i0.r(p0).add(p1);
       i0.c0(p0, 0);
    }
    public static boolean b0(View p0){
       Boolean uBoolean = i0.r0().d(p0);
       boolean b = (uBoolean == null)? false: uBoolean.booleanValue();
       return b;
    }
    public static m0 c(View p0){
       if (i0.t == null) {
          i0.t = new WeakHashMap();
       }
       m0 om0 = i0.t.get(p0);
       if (om0 == null) {
          om0 = new m0(p0);
          i0.t.put(p0, om0);
       }
       return om0;
    }
    public static void c0(View p0,int p1){
       AccessibilityManager systemServic = p0.getContext().getSystemService("accessibility");
       if (!systemServic.isEnabled()) {
          return;
       }
       CharSequence uCharSequenc = (i0.q(p0) != null && !p0.getVisibility())? 1: null;
       int i = 32;
       if (i0.p(p0) || uCharSequenc) {
          AccessibilityEvent uAccessibili = AccessibilityEvent.obtain();
          if (!uCharSequenc) {
             i = 2048;
          }
          uAccessibili.setEventType(i);
          uAccessibili.setContentChangeTypes(p1);
          if (uCharSequenc) {
             uAccessibili.getText().add(i0.q(p0));
             i0.P0(p0);
          }
          p0.sendAccessibilityEventUnchecked(uAccessibili);
       }else if(p1 == i){
          AccessibilityEvent uAccessibili1 = AccessibilityEvent.obtain();
          p0.onInitializeAccessibilityEvent(uAccessibili1);
          uAccessibili1.setEventType(i);
          uAccessibili1.setContentChangeTypes(p1);
          uAccessibili1.setSource(p0);
          p0.onPopulateAccessibilityEvent(uAccessibili1);
          uAccessibili1.getText().add(i0.q(p0));
          systemServic.sendAccessibilityEvent(uAccessibili1);
       }else if(p0.getParent() != null){
          try{
             p0.getParent().notifySubtreeAccessibilityStateChanged(p0, p0, p1);
          }catch(java.lang.AbstractMethodError e0){
             Objects.requireNonNull(p0.getParent());
          }
       }
    }
    public static boolean d(View p0,int p1){
       return p0.canScrollHorizontally(p1);
    }
    public static void d0(View p0,int p1){
       if (Build$VERSION.SDK_INT >= 23) {
          p0.offsetLeftAndRight(p1);
       }else {
          Rect rect = i0.x();
          int i = 0;
          ViewParent parent = p0.getParent();
          if (parent instanceof View) {
             ViewParent viewParent = parent;
             int left = viewParent.getLeft();
             int top = viewParent.getTop();
             int right = viewParent.getRight();
             rect.set(left, top, right, viewParent.getBottom());
             i = rect.intersects(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom()) ^ 0x01;
          }
          i0.f(p0, p1);
          if (i && rect.intersect(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom())) {
             parent.invalidate(rect);
          }
       }
       return;
    }
    public static boolean e(View p0,int p1){
       return p0.canScrollVertically(p1);
    }
    public static void e0(View p0,int p1){
       if (Build$VERSION.SDK_INT >= 23) {
          p0.offsetTopAndBottom(p1);
       }else {
          Rect rect = i0.x();
          int i = 0;
          ViewParent parent = p0.getParent();
          if (parent instanceof View) {
             ViewParent viewParent = parent;
             int left = viewParent.getLeft();
             int top = viewParent.getTop();
             int right = viewParent.getRight();
             rect.set(left, top, right, viewParent.getBottom());
             i = rect.intersects(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom()) ^ 0x01;
          }
          i0.g(p0, p1);
          if (i && rect.intersect(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom())) {
             parent.invalidate(rect);
          }
       }
       return;
    }
    public static void f(View p0,int p1){
       p0.offsetLeftAndRight(p1);
       if (!p0.getVisibility()) {
          i0.W0(p0);
          ViewParent parent = p0.getParent();
          if (parent instanceof View) {
             i0.W0(parent);
          }
       }
       return;
    }
    public static u0 f0(View p0,u0 p1){
       WindowInsets windowInsets = p1.v();
       if (windowInsets != null) {
          WindowInsets windowInsets1 = p0.onApplyWindowInsets(windowInsets);
          if (!windowInsets1.equals(windowInsets)) {
             return u0.x(windowInsets1, p0);
          }
       }
       return p1;
    }
    public static void g(View p0,int p1){
       p0.offsetTopAndBottom(p1);
       if (!p0.getVisibility()) {
          i0.W0(p0);
          ViewParent parent = p0.getParent();
          if (parent instanceof View) {
             i0.W0(parent);
          }
       }
       return;
    }
    public static void g0(View p0,d p1){
       p0.onInitializeAccessibilityNodeInfo(p1.F0());
    }
    public static u0 h(View p0,u0 p1,Rect p2){
       return i0$h.b(p0, p1, p2);
    }
    public static i0$g h0(){
       return new i0$c(0x7f0a3cc7, CharSequence.class, 8, 28);
    }
    public static u0 i(View p0,u0 p1){
       WindowInsets windowInsets = p1.v();
       if (windowInsets != null) {
          WindowInsets windowInsets1 = p0.dispatchApplyWindowInsets(windowInsets);
          if (!windowInsets1.equals(windowInsets)) {
             return u0.x(windowInsets1, p0);
          }
       }
       return p1;
    }
    public static boolean i0(View p0,int p1,Bundle p2){
       return p0.performAccessibilityAction(p1, p2);
    }
    public static boolean j(View p0,KeyEvent p1){
       if (Build$VERSION.SDK_INT >= 28) {
          return false;
       }
       return i0$m.a(p0).b(p0, p1);
    }
    public static void j0(View p0){
       p0.postInvalidateOnAnimation();
    }
    public static boolean k(View p0,KeyEvent p1){
       if (Build$VERSION.SDK_INT >= 28) {
          return false;
       }
       return i0$m.a(p0).f(p1);
    }
    public static void k0(View p0,Runnable p1){
       p0.postOnAnimation(p1);
    }
    public static int l(){
       return View.generateViewId();
    }
    public static void l0(View p0,Runnable p1,long p2){
       p0.postOnAnimationDelayed(p1, p2);
    }
    public static a m(View p0){
       View$AccessibilityDelegate uAccessibili = i0.n(p0);
       if (uAccessibili == null) {
          return null;
       }
       if (uAccessibili instanceof a$a) {
          return uAccessibili.a;
       }
       return new a(uAccessibili);
    }
    public static void m0(View p0,int p1){
       i0.n0(p1, p0);
       i0.c0(p0, 0);
    }
    public static View$AccessibilityDelegate n(View p0){
       if (Build$VERSION.SDK_INT >= 29) {
          return p0.getAccessibilityDelegate();
       }
       return i0.o(p0);
    }
    public static void n0(int p0,View p1){
       List list = i0.r(p1);
       int i = 0;
       while (i < list.size()) {
          if (list.get(i).b() == p0) {
             list.remove(i);
             break ;
          }else {
             i = i + 1;
          }
       }
       return;
    }
    public static View$AccessibilityDelegate o(View p0){
       if (i0.w) {
          return null;
       }
       if (i0.v == null) {
          Field declaredFiel = View.class.getDeclaredField("mAccessibilityDelegate");
          i0.v = declaredFiel;
          declaredFiel.setAccessible(true);
       }
       p0 = i0.v.get(p0);
       if (p0 instanceof View$AccessibilityDelegate) {
          return p0;
       }else {
          return null;
       }
    }
    public static void o0(View p0,d$a p1,CharSequence p2,g p3){
       if (p3 == null) {
          i0.m0(p0, p1.b());
       }else {
          i0.b(p0, p1.a(null, p3));
       }
       return;
    }
    public static void onInitializeAccessibilityEvent(View p0,AccessibilityEvent p1){
       p0.onInitializeAccessibilityEvent(p1);
    }
    public static void onPopulateAccessibilityEvent(View p0,AccessibilityEvent p1){
       p0.onPopulateAccessibilityEvent(p1);
    }
    public static int p(View p0){
       return p0.getAccessibilityLiveRegion();
    }
    public static void p0(View p0){
       p0.requestApplyInsets();
    }
    public static CharSequence q(View p0){
       return i0.h0().d(p0);
    }
    public static void q0(View p0,Context p1,int[] p2,AttributeSet p3,TypedArray p4,int p5,int p6){
       if (Build$VERSION.SDK_INT >= 29) {
          i0$j.a(p0, p1, p2, p3, p4, p5, p6);
       }
       return;
    }
    public static List r(View p0){
       ArrayList tag = p0.getTag(R.id.tag_accessibility_actions);
       if (tag == null) {
          tag = new ArrayList();
          p0.setTag(R.id.tag_accessibility_actions, tag);
       }
       return tag;
    }
    public static i0$g r0(){
       return new i0$b(0x7f0a3d1c, Boolean.class, 28);
    }
    public static ColorStateList s(View p0){
       return p0.getBackgroundTintList();
    }
    public static void s0(View p0,a p1){
       if (p1 == null && i0.n(p0) instanceof a$a) {
          p1 = new a();
       }
       View$AccessibilityDelegate uAccessibili = (p1 == null)? null: p1.d();
       p0.setAccessibilityDelegate(uAccessibili);
       return;
    }
    public static PorterDuff$Mode t(View p0){
       return p0.getBackgroundTintMode();
    }
    public static void t0(View p0,int p1){
       p0.setAccessibilityLiveRegion(p1);
    }
    public static Rect u(View p0){
       return p0.getClipBounds();
    }
    public static void u0(View p0,float p1){
       p0.setAlpha(p1);
    }
    public static Display v(View p0){
       return p0.getDisplay();
    }
    public static void v0(View p0,Drawable p1){
       p0.setBackground(p1);
    }
    public static float w(View p0){
       return p0.getElevation();
    }
    public static void w0(View p0,ColorStateList p1){
       p0.setBackgroundTintList(p1);
       if (Build$VERSION.SDK_INT == 21) {
          Drawable background = p0.getBackground();
          boolean b = (p0.getBackgroundTintList() != null || p0.getBackgroundTintMode() != null)? true: false;
          if (background != null && b) {
             if (background.isStateful()) {
                background.setState(p0.getDrawableState());
             }
             p0.setBackground(background);
          }
       }
    label_0031 :
       return;
    }
    public static Rect x(){
       if (i0.x == null) {
          i0.x = new ThreadLocal();
       }
       Rect rect = i0.x.get();
       if (rect == null) {
          rect = new Rect();
          i0.x.set(rect);
       }
       rect.setEmpty();
       return rect;
    }
    public static void x0(View p0,PorterDuff$Mode p1){
       p0.setBackgroundTintMode(p1);
       if (Build$VERSION.SDK_INT == 21) {
          Drawable background = p0.getBackground();
          boolean b = (p0.getBackgroundTintList() != null || p0.getBackgroundTintMode() != null)? true: false;
          if (background != null && b) {
             if (background.isStateful()) {
                background.setState(p0.getDrawableState());
             }
             p0.setBackground(background);
          }
       }
    label_0031 :
       return;
    }
    public static boolean y(View p0){
       return p0.getFitsSystemWindows();
    }
    public static void y0(ViewGroup p0,boolean p1){
       Object[] objArray;
       int i = 1;
       if (i0.u == null) {
          try{
             Class[] uClassArray = new Class[i];
             uClassArray[0] = Boolean.TYPE;
             i0.u = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", uClassArray);
             i0.u.setAccessible(i);
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
    public static int z(View p0){
       return p0.getImportantForAccessibility();
    }
    public static void z0(View p0,Rect p1){
       p0.setClipBounds(p1);
    }
}
