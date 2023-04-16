package com.kwai.feature.post.api.util.g;
import lnc.a1;
import java.lang.Object;
import android.view.Window;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.utility.n;
import android.content.Intent;
import ekd.j0;
import android.content.Context;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import sm6.b;
import java.lang.Boolean;
import java.lang.Math;
import o56.c;
import o56.a;
import android.app.Application;
import android.graphics.Point;
import android.view.View;
import lnc.p3;
import java.lang.Throwable;
import w46.b;
import android.view.ViewParent;
import qka.a;
import android.os.Build$VERSION;
import com.yxcorp.utility.RomUtils;
import java.lang.reflect.Method;
import android.view.MotionEvent;
import com.yxcorp.utility.j;
import lnc.i1;
import java.lang.Runnable;
import android.view.ViewTreeObserver;
import com.kwai.feature.post.api.util.g$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import q46.s;
import android.view.View$OnTouchListener;
import android.os.Looper;
import ekd.i;
import ekd.o0;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public final class g	// class@001464
{
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static int e;
    public static boolean f;

    static {
       g.a = a1.e(71.00f);
       g.b = a1.e(82.00f);
       g.c = a1.e(60.00f);
       g.d = a1.e(16.00f);
       g.e = a1.e(88.00f);
       g.f = false;
    }
    public void g(){
       super();
    }
    public static void A(Window p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, og, "25")) {
          return;
       }
       p0.setNavigationBarColor(p1);
       return;
    }
    public static void a(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g.class, "17")) {
          return;
       }
       Window window = p0.getWindow();
       window.clearFlags(1024);
       window.addFlags(2048);
       g.v(p0);
       return;
    }
    public static float b(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       try{
          if (g.k(p0)) {
             return ((float)n.k(p0) / (float)n.j(p0));
          }
       }catch(java.lang.Exception e0){
       }
       try{
          if (p0 != null && (p0.getIntent() != null && j0.g(p0.getIntent(), e0))) {
             return p0.getIntent().getFloatExtra(e0, g.e());
          }else {
             return g.e();
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static int c(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = n.w(p0);
       int i1 = n.j(p0);
       Log.g("PostViewUtils", "hasNavigationBar realScreenHeight:"+i+",displayScreenHeight:"+i1);
       return (i - i1);
    }
    public static float d(int p0,Activity p1,boolean p2){
       Object obj1;
       int i = p0;
       Object obj = p1;
       if (PatchProxy.isSupport(g.class)) {
          obj1 = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), null, g.class, "10");
          if (obj1 != PatchProxyResult.class) {
             return obj1.floatValue();
          }
       }
       float f = 0;
       obj1 = null;
       float f1 = 0x3f100000;
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i != 5) {
                      return f1;
                   }else {
                      int[] ointArray = PatchProxy.applyOneRefs(obj, obj1, b.class, "24");
                      if (ointArray != PatchProxyResult.class) {
                      }else {
                         ointArray = new int[]{n.k(p1),Math.max(0, b.h(5, obj, n.j(p1)))};
                      }
                      if (ointArray[1]) {
                         f = ((float)ointArray[0] * 0x3f800000) / (float)ointArray[1];
                      }
                      return f;
                   }
                }else {
                   return g.b(p1);
                }
             }else {
                return 0x3f800000;
             }
          }else {
             return 0x3f400000;
          }
       }else if(p2){
          Object obj2 = PatchProxy.applyOneRefs(obj, obj1, b.class, "26");
          if (obj2 != PatchProxyResult.class) {
          }else {
             int i1 = n.k(p1);
             int i2 = n.j(p1);
             if (PatchProxy.isSupport(b.class)) {
                obj2 = PatchProxy.applyThreeRefs(Integer.valueOf(i1), Integer.valueOf(i2), p1, null, b.class, "27");
                if (obj2 != PatchProxyResult.class) {
                }
             }
             obj2 = new int[]{i1,Math.max(0, b.h(1, obj, i2))};
          }
          if (obj2[1]) {
             f = ((float)obj2[0] * 0x3f800000) / (float)obj2[1];
          }
          return f;
       }else {
          return f1;
       }
    }
    public static float e(){
       Point obj = PatchProxy.apply(null, null, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = n.s(a.a().a());
       return ((float)obj.x / (float)obj.y);
    }
    public static int f(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       float f = g.b(p0);
       if (f - 0x3f100000 >= 0) {
          return 1;
       }
       if (f - 0x3f000000 >= 0) {
          return 2;
       }
       if (f - 0x3eec4ec5 > 0) {
          return 3;
       }
       return 4;
    }
    public static int g(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (g.j(p0)) {
          return g.d;
       }
       return n.A(p0);
    }
    public static View h(Window p0){
       View decorView;
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          decorView = p0.getDecorView();
       }catch(java.lang.Exception e0){
          p3.D().e("PostViewUtils", "getWindowRootView error", e0);
       }
       if (decorView != null) {
          return decorView;
       }
       View view = p0.findViewById(0x1020002);
       while (view != null && view.getParent() instanceof View) {
          view = view.getParent();
       }
       return view;
    }
    public static boolean i(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (g.c(p0) > 0)? true: false;
       return b;
    }
    public static boolean j(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (b.t(p0)) {
          if (n.p(p0.getWindow().getDecorView())[1] > 0) {
             b = true;
          }
          return b;
       }else if(!a.a() || n.p(p0.getWindow().getDecorView())[1] > 0){
          b = true;
       }
       return b;
    }
    public static boolean k(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.getWindow() != null && (p0.getWindow().isActive() && (p0.getWindow().peekDecorView() != null && (n.f(p0) != null && (n.k(p0) > 0 && n.j(p0) > 0))))))? true: false;
       return b;
    }
    public static boolean l(Activity p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, g.class, "14");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       boolean b = false;
       if (p0 != null && (Build$VERSION.SDK_INT >= 29 && RomUtils.q())) {
          try{
             Method method = p0.getClass().getMethod("getWindowingMode", obj);
             method.setAccessible(true);
             if (method.invoke(p0, obj).intValue() == 5) {
                b = true;
             }
             return b;
          }catch(java.lang.NoSuchMethodException e4){
          }catch(java.lang.IllegalAccessException e4){
          }catch(java.lang.reflect.InvocationTargetException e4){
          }
       label_0050 :
          return b;
       }else {
          goto label_0050 ;
       }
    }
    public static boolean m(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          if (Build$VERSION.SDK_INT >= 24 && (p0 != null && p0.isInMultiWindowMode())) {
             b = true;
          }
       label_0024 :
          return e0;
       }catch(java.lang.RuntimeException e0){
       }
    }
    public static boolean n(Activity p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, og, "12");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       Object obj2 = PatchProxy.applyOneRefs(p0, obj, og, "13");
       boolean b = true;
       if (obj2 != patchProxyRe) {
          b1 = obj2.booleanValue();
       }else if(RomUtils.w() && g.m(p0)){
          b1 = true;
       }else {
          b1 = false;
       }
       if (!b1 && !g.l(p0)) {
          b = false;
       }
       return b;
    }
    public static boolean o(){
       Object obj = PatchProxy.apply(null, null, g.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (g.p() ^ 0x01);
    }
    public static boolean p(){
       Object obj = PatchProxy.apply(null, null, g.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (0x3f000000 - g.e() <= 0 && (g.e() - 0x3f100000 <= 0 && !a.a()))? true: false;
       return b;
    }
    public static boolean q(MotionEvent p0,View p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, g.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p1 == null) {
          return b;
       }
       int[] ointArray = n.p(p1);
       int i = ointArray[b];
       int i1 = p1.getWidth() + i;
       int i2 = ointArray[1];
       int i3 = p1.getHeight() + i2;
       if (p0.getRawX() - (float)i >= 0 && (p0.getRawX() - (float)i1 <= 0 && (p0.getRawY() - (float)i2 >= 0 && p0.getRawY() - (float)i3 <= 0))) {
          b = true;
       }
    label_0050 :
       return b;
    }
    public static j r(Window p0,j p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, og, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 == null) {
          i1.a("PostViewUtils", "refreshImmersiveStatus with empty window");
          return p1;
       }else if(p1 == null){
          p1 = new j(p0);
       }
       Object obj1 = PatchProxy.apply(null, null, og, "3");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): a.a() ^ 0x01;
       if (!b) {
          p1.b();
          g.w(p0, 0xff000000);
          return p1;
       }else {
          p1.a();
          return p1;
       }
    }
    public static boolean s(View p0,Activity p1,Runnable p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, g.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!n.j(p1)) {
          p0.getViewTreeObserver().addOnGlobalLayoutListener(new g$a(p1, p0, p2));
          Log.g("PostViewUtils", "runAfterActivityHeightValid activity height is 0");
          return false;
       }else {
          Log.g("PostViewUtils", "runAfterActivityHeightValid activity height is valid");
          return true;
       }
    }
    public static void t(View[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g.class, "35")) {
          return;
       }
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          oobject.setOnTouchListener(new s(oobject));
       }
       return;
    }
    public static void u(Activity p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, g.class, "6")) {
          return;
       }
       if (Looper.getMainLooper() != Looper.myLooper()) {
          return;
       }
       if (p0 != null && (p0.getWindow() != null && (p0.getWindow().peekDecorView() != null && (n.f(p0) != null && (n.k(p0) > 0 && n.j(p0) > 0))))) {
          p1.putExtra("screen_ratio", ((float)n.k(p0) / (float)n.j(p0)));
       }
    label_004b :
       return;
    }
    public static void v(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g.class, "36")) {
          return;
       }
       Window window = p0.getWindow();
       window.clearFlags(0x4000000);
       window.addFlags(Integer.MIN_VALUE);
       View view = g.h(window);
       if (view != null) {
          view.setSystemUiVisibility(1280);
       }
       if (RomUtils.q()) {
          i.f(p0, false);
       }else if(RomUtils.o()){
          o0.c(p0, false);
       }
       window.setStatusBarColor(false);
       return;
    }
    public static void w(Window p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, og, "5")) {
          return;
       }
       p0.addFlags(Integer.MIN_VALUE);
       p0.setStatusBarColor(p1);
       return;
    }
    public static void x(View p0,int p1,int p2,boolean p3){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), null, g.class, "19")) {
          return;
       }
       if (!p0.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
       if (p1 >= 0) {
          layoutParams.topMargin = (p3)? layoutParams.topMargin + p1: p1;
       }
    label_003c :
       if (p2 >= 0) {
          layoutParams.bottomMargin = (p3)? layoutParams.bottomMargin + p2: p2;
       }
    label_0048 :
       p0.setLayoutParams(layoutParams);
       return;
    }
    public static void y(View p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, g.class, "34")) {
          return;
       }
       if (g.f) {
          return;
       }
       if (p0 != null) {
          int[] ointArray = new int[2];
          p0.getLocationOnScreen(ointArray);
          if (((n.j(p1) - ointArray[1]) - p0.getHeight()) > 0) {
             g.e = (n.j(p1) - ointArray[1]) - p0.getHeight();
          }
       }else {
          int i = a1.d(R.dimen.arg_RES_7f07013b);
          if (b.t(p1)) {
             i = b.e(p1);
          }
          g.e = b.q(p1) + i;
       }
       return;
    }
    public static void z(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g.class, "24")) {
          return;
       }
       p0.setNavigationBarColor(0xff000000);
       return;
    }
}
