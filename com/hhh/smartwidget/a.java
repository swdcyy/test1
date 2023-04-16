package com.hhh.smartwidget.a;
import android.os.Handler;
import android.os.Looper;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.content.Context;
import hm.a;
import android.app.Activity;
import com.hhh.smartwidget.SystemBarInfo;
import android.view.Window;
import android.view.View;
import android.view.ViewGroup;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import java.lang.Integer;
import java.lang.CharSequence;
import android.os.IBinder;
import android.view.inputmethod.InputMethodManager;
import android.os.Build;
import java.lang.reflect.Method;
import android.content.res.Configuration;
import android.widget.EditText;
import hm.b;
import java.lang.Runnable;

public final class a	// class@000576
{
    public static final Handler a;

    static {
       a.a = new Handler(Looper.getMainLooper());
    }
    public static int a(float p0){
       return (int)((p0 * c.c(a.c()).density) + 0x3f000000);
    }
    public static int b(int p0){
       return c.b(a.c(), p0);
    }
    public static Resources c(){
       return a.b().getResources();
    }
    public static int d(Activity p0){
       int i1;
       SystemBarInfo systemBarInf = new SystemBarInfo();
       ViewGroup decorView = p0.getWindow().getDecorView();
       int childCount = decorView.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = decorView.getChildAt(i);
          if (childAt.getId() == 0x102002f) {
             systemBarInf.b = true;
             systemBarInf.c = childAt.getHeight();
             break ;
          }else {
             i = i + 1;
          }
       }
       SystemBarInfo c = systemBarInf.c;
       if (c > null) {
          return c;
       }
       String str = "status_bar_height";
       int identifier = a.c().getIdentifier(str, "dimen", "android");
       if (identifier > 0) {
          i1 = a.b(identifier);
       }else {
          Class uClass = Class.forName("com.android.internal.R$dimen");
          Field field = uClass.getField(str);
          field.setAccessible(true);
          i1 = a.b(Integer.parseInt(field.get(uClass.newInstance()).toString()));
       }
       if (i1 <= 0) {
          i1 = a.a(25.00f);
       }
       return i1;
    }
    public static CharSequence e(int p0){
       return a.c().getText(p0);
    }
    public static boolean f(IBinder p0){
       if (p0 == null) {
          return false;
       }
       InputMethodManager systemServic = a.b().getSystemService("input_method");
       if (systemServic != null) {
          return systemServic.hideSoftInputFromWindow(p0, false);
       }
       return false;
    }
    public static boolean g(){
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          if (Build.class.getMethod("hasSmartBar", uClassArray) != null) {
             i = true;
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean h(){
       boolean b = (a.c().getConfiguration().orientation == 2)? true: false;
       return b;
    }
    public static boolean i(){
       return (Build.MANUFACTURER).equalsIgnoreCase("Xiaomi");
    }
    public static boolean j(){
       boolean b = (Looper.getMainLooper() == Looper.myLooper())? true: false;
       return b;
    }
    public static void k(EditText p0){
       a.a.postDelayed(new b(p0), 0);
    }
}
