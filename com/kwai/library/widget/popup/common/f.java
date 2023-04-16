package com.kwai.library.widget.popup.common.f;
import android.os.Handler;
import android.os.Looper;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.app.Activity;
import android.view.View;
import android.content.Context;
import android.view.WindowManager;
import java.lang.Exception;
import java.lang.Runnable;
import android.view.ViewTreeObserver;
import com.kwai.library.widget.popup.common.f$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.EditText;
import com.kwai.library.widget.popup.common.f$b;
import com.kwai.library.widget.popup.common.f$c;
import android.view.WindowManager$LayoutParams;
import android.view.Window;
import android.view.ViewGroup$LayoutParams;
import java.lang.RuntimeException;
import android.util.DisplayMetrics;
import cw9.c;
import java.util.List;
import o07.q;
import androidx.fragment.app.DialogFragment;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import androidx.fragment.app.c;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.graphics.drawable.Drawable;
import com.kwai.library.widget.popup.common.SystemBarInfo;
import android.os.Build$VERSION;
import java.lang.String;
import com.kwai.library.widget.popup.common.e;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Integer;
import java.lang.CharSequence;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.utility.n;
import a2.u0;
import a2.i0;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.graphics.Insets;
import android.os.IBinder;
import android.view.inputmethod.InputMethodManager;

public final class f	// class@00099b
{
    public static final Handler a;

    static {
       f.a = new Handler(Looper.getMainLooper());
    }
    public static boolean A(){
       boolean b = (f.j().getConfiguration().orientation == 2)? true: false;
       return b;
    }
    public static boolean B(){
       boolean b = (Looper.getMainLooper() == Looper.myLooper())? true: false;
       return b;
    }
    public static boolean C(Activity p0,View p1){
       if (f.z(p0)) {
          return true;
       }
       try{
          p0.getWindowManager().removeViewImmediate(p1);
          return true;
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
          return false;
       }
    }
    public static void D(Runnable p0){
       if (f.B()) {
          p0.run();
       }else {
          f.a.post(p0);
       }
       return;
    }
    public static void E(Runnable p0,long p1){
       f.a.postDelayed(p0, p1);
    }
    public static void F(View p0,Runnable p1){
       if (p0 != null && p1 != null) {
          ViewTreeObserver viewTreeObse = p0.getViewTreeObserver();
          if (viewTreeObse != null) {
             viewTreeObse.addOnGlobalLayoutListener(new f$a(p0, p1, false));
          }
       }
       return;
    }
    public static void G(View p0,Runnable p1){
       if (p0 != null) {
          if (p0.getWidth() > 0 && p0.getHeight() > 0) {
             p1.run();
             return;
          }else {
             ViewTreeObserver viewTreeObse = p0.getViewTreeObserver();
             if (viewTreeObse != null) {
                viewTreeObse.addOnGlobalLayoutListener(new f$a(p0, p1, true));
             }
          }
       }
       return;
    }
    public static void H(EditText p0){
       f.I(p0, 0);
    }
    public static void I(EditText p0,long p1){
       f.E(new f$b(p0), p1);
    }
    public static boolean a(Activity p0,View p1,int p2,f$c p3){
       WindowManager$LayoutParams layoutParams = new WindowManager$LayoutParams();
       layoutParams.copyFrom(p0.getWindow().getAttributes());
       layoutParams.width = -1;
       layoutParams.height = -1;
       layoutParams.type = 2;
       layoutParams.format = -3;
       layoutParams.gravity = 17;
       if (p2) {
          layoutParams.flags = p2 | layoutParams.flags;
       }
       if (p3 != null) {
          p3.a(layoutParams);
       }
       try{
          p0.getWindowManager().addView(p1, layoutParams);
          return true;
       }catch(java.lang.RuntimeException e2){
          e2.printStackTrace();
          return false;
       }
    }
    public static int b(float p0){
       return (int)((p0 * c.c(f.j()).density) + 0x3f000000);
    }
    public static DialogFragment c(List p0,q p1,boolean p2){
       DialogFragment uDialogFragm;
       if (p0 == null) {
          return null;
       }
       int i = p0.size() - 1;
       while (true) {
          if (i < 0) {
             return null;
          }
          Fragment uFragment = p0.get(i);
          if (uFragment.getLifecycle().getCurrentState() == Lifecycle$State.RESUMED && (p1 == null || !p1.a(uFragment))) {
             if (p2 && uFragment.getHost() != null) {
                uDialogFragm = f.c(uFragment.getChildFragmentManager().getFragments(), p1, 1);
                if (uDialogFragm != null) {
                   break ;
                }
             }
             if (uFragment instanceof DialogFragment) {
                return uFragment;
             }
          }
       label_0045 :
          i = i - 1;
       }
       return uDialogFragm;
    }
    public static ViewGroup d(DialogFragment p0){
       View view = p0.getView();
       ViewGroup parent = (view != null && view.getParent() != null)? view.getParent(): null;
       return parent;
    }
    public static int e(int p0){
       return c.b(f.j(), p0);
    }
    public static Drawable f(int p0){
       return f.j().getDrawable(p0);
    }
    public static Drawable g(int p0){
       try{
          return f.f(p0);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return null;
       }
    }
    public static int h(Activity p0){
       SystemBarInfo systemBarInf = f.i(p0);
       if (systemBarInf.mIsExist == null) {
          return 0;
       }
       systemBarInf = systemBarInf.mHeight;
       if (systemBarInf == null && Build$VERSION.SDK_INT >= 23) {
          return f.s(p0);
       }
       if (systemBarInf <= null) {
          int i = f.e(f.j().getIdentifier("navigation_bar_height", "dimen", "android"));
       }
       return systemBarInf;
    }
    public static SystemBarInfo i(Activity p0){
       SystemBarInfo systemBarInf = new SystemBarInfo();
       ViewGroup decorView = p0.getWindow().getDecorView();
       int childCount = decorView.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i1 < childCount) {
          View childAt = decorView.getChildAt(i1);
          if (childAt.getId() == 0x1020030) {
             if (childAt.isShown()) {
                systemBarInf.mIsExist = true;
                if (f.A()) {
                   if (!childAt.getVisibility()) {
                      i = childAt.getWidth();
                   }
                   systemBarInf.mHeight = i;
                }else if(!childAt.getVisibility()){
                   i = childAt.getHeight();
                }
                systemBarInf.mHeight = i;
             }
             i = 1;
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       if (!i) {
          View view = decorView.findViewById(0x1020030);
          if (view != null && view.isShown()) {
             systemBarInf.mIsExist = true;
          }
       }
       return systemBarInf;
    }
    public static Resources j(){
       return e.b().getResources();
    }
    public static int k(Activity p0){
       SystemBarInfo systemBarInf = f.l(p0);
       int i = 0;
       if (systemBarInf.mIsExist == null) {
          return i;
       }
       systemBarInf = systemBarInf.mHeight;
       if (systemBarInf > null) {
          return systemBarInf;
       }
       if (systemBarInf == null && Build$VERSION.SDK_INT >= 23) {
          return f.t(p0);
       }
       String str = "status_bar_height";
       int identifier = f.j().getIdentifier(str, "dimen", "android");
       if (identifier > 0) {
          i = f.e(identifier);
       }else {
          Class uClass = Class.forName("com.android.internal.R$dimen");
          Field field = uClass.getField(str);
          field.setAccessible(true);
          i = f.e(Integer.parseInt(field.get(uClass.newInstance()).toString()));
       }
       if (i <= 0) {
          i = f.b(25.00f);
       }
       return i;
    }
    public static SystemBarInfo l(Activity p0){
       SystemBarInfo systemBarInf = new SystemBarInfo();
       ViewGroup decorView = p0.getWindow().getDecorView();
       int childCount = decorView.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i1 < childCount) {
          View childAt = decorView.getChildAt(i1);
          if (childAt.getId() == 0x102002f) {
             systemBarInf.mIsExist = true;
             if (!childAt.getVisibility()) {
                i = childAt.getHeight();
             }
             systemBarInf.mHeight = i;
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return systemBarInf;
    }
    public static String m(int p0,Object[] p1){
       return f.j().getString(p0, p1);
    }
    public static String n(int p0,Object[] p1){
       try{
          return f.m(p0, p1);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return null;
       }
    }
    public static CharSequence o(int p0){
       return f.j().getText(p0);
    }
    public static CharSequence p(int p0){
       try{
          return f.o(p0);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return null;
       }
    }
    public static DialogFragment q(q p0){
       Context uContext = e.b();
       if (!uContext instanceof FragmentActivity) {
          return null;
       }
       List fragments = uContext.getSupportFragmentManager().getFragments();
       if (f.B()) {
          return f.c(fragments, p0, true);
       }
       return f.c(fragments, p0, false);
    }
    public static int r(Activity p0){
       return p0.getWindow().getDecorView().getHeight();
    }
    public static int s(Activity p0){
       View view = n.f(p0);
       if (view == null) {
          view = p0.getWindow().getDecorView();
       }
       try{
          int i = 0;
          if (view != null && view.isAttachedToWindow()) {
             u0 ou0 = i0.J(view);
             if (ou0 != null) {
                i = ou0.h();
             }
          }
          return i;
       }catch(java.lang.Exception e0){
       }
    }
    public static int t(Activity p0){
       if (Build$VERSION.SDK_INT >= 30) {
          return f.u(p0);
       }
       View view = n.f(p0);
       if (view != null && view.isAttachedToWindow()) {
          try{
             u0 ou0 = i0.J(view);
             if (ou0 != null) {
                return ou0.k();
             }
          }catch(java.lang.Exception e0){
          }
       }
       return 0;
    }
    public static int u(Activity p0){
       View view = n.f(p0);
       if (view != null && view.isAttachedToWindow()) {
          try{
             WindowInsets rootWindowIn = view.getRootWindowInsets();
             if (rootWindowIn != null) {
                rootWindowIn.getSystemWindowInsetTop();
                return rootWindowIn.getInsets(WindowInsets$Type.statusBars()).top;
             }
          }catch(java.lang.Exception e0){
          }
       }
       return 0;
    }
    public static int v(Activity p0){
       return p0.getWindow().getDecorView().getWidth();
    }
    public static boolean w(){
       Activity uActivity = e.c();
       if (uActivity != null) {
          View currentFocus = uActivity.getCurrentFocus();
          if (currentFocus != null) {
             return f.x(currentFocus.getWindowToken());
          }
       }
       return false;
    }
    public static boolean x(IBinder p0){
       if (p0 == null) {
          return false;
       }
       InputMethodManager systemServic = e.b().getSystemService("input_method");
       if (systemServic != null) {
          return systemServic.hideSoftInputFromWindow(p0, false);
       }
       return false;
    }
    public static boolean y(Window p0){
       View currentFocus = p0.getCurrentFocus();
       if (currentFocus != null) {
          return f.x(currentFocus.getWindowToken());
       }
       return false;
    }
    public static boolean z(Context p0){
       boolean b = (p0 instanceof Activity && (p0.isFinishing() || p0.isDestroyed()))? true: false;
       return b;
    }
}
