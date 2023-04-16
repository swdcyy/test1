package com.kwai.performance.stability.hack.ReflectionHacker;
import java.lang.Object;
import android.os.Build$VERSION;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.lang.String;
import java.lang.System;
import java.lang.Class;
import java.lang.reflect.Method;

public final class ReflectionHacker	// class@000e4a
{
    public static final String TAG = "ReflectionHack";
    public static boolean sInit;
    public static Object sVmRuntime;
    public static Method setHiddenApiExemptions;

    public void ReflectionHacker(){
       super();
    }
    public static boolean belowP(){
       boolean b = (Build$VERSION.SDK_INT < 28)? true: false;
       return b;
    }
    public static boolean belowR(Context p0){
       int sDK_INT = Build$VERSION.SDK_INT;
       boolean b = (sDK_INT != 29 || (Build$VERSION.PREVIEW_SDK_INT && (sDK_INT < 29 || p0.getApplicationInfo().targetSdkVersion < 30)))? true: false;
       return b;
    }
    public static void exemptAboveR(){
       String[] stringArray;
       System.loadLibrary("plt-hack");
       Class[] uClassArray = new Class[0];
       Object[] objArray = new Object[0];
       Object obj = ReflectionHacker.getDeclaredMethodWrapper(Class.forName("dalvik.system.VMRuntime"), "getRuntime", uClassArray).invoke(null, objArray);
       Class[] uClassArray1 = new Class[]{String[].class};
       Object[] objArray1 = new Object[]{stringArray};
       stringArray = new String[]{"L"};
       ReflectionHacker.getDeclaredMethodWrapper(obj.getClass(), "setHiddenApiExemptions", uClassArray1).invoke(obj, objArray1);
    }
    public static void exemptAll(Context p0){
       if (!ReflectionHacker.sInit) {
          ReflectionHacker.sInit = true;
          if (ReflectionHacker.belowR(p0)) {
             String[] stringArray = new String[]{"L"};
             ReflectionHacker.exemptBelowR(stringArray);
          }else {
             ReflectionHacker.exemptAboveR();
          }
       }
       return;
    }
    public static void exemptBelowR(String[] p0){
       Class[] uClassArray = new Class[]{String.class};
       Class[] uClassArray1 = new Class[]{String.class,Class[].class};
       Method declaredMeth = Class.class.getDeclaredMethod("getDeclaredMethod", uClassArray1);
       Object[] objArray = new Object[]{"dalvik.system.VMRuntime"};
       Class uClass = Class.class.getDeclaredMethod("forName", uClassArray).invoke(null, objArray);
       objArray = new Object[]{"getRuntime",null};
       Method method = declaredMeth.invoke(uClass, objArray);
       Object[] objArray1 = new Object[]{"setHiddenApiExemptions",uClassArray1};
       uClassArray1 = new Class[]{String[].class};
       ReflectionHacker.setHiddenApiExemptions = declaredMeth.invoke(uClass, objArray1);
       Object[] objArray2 = new Object[0];
       Object obj = method.invoke(null, objArray2);
       ReflectionHacker.sVmRuntime = obj;
       if (obj != null) {
          Method setHiddenApi = ReflectionHacker.setHiddenApiExemptions;
          if (setHiddenApi != null) {
             objArray = new Object[]{p0};
             setHiddenApi.invoke(obj, objArray);
          }
       }
       return;
    }
    public static native Method getDeclaredMethod(Object p0,String p1,Class[] p2);
    public static Method getDeclaredMethodWrapper(Object p0,String p1,Class[] p2){
       return ReflectionHacker.getDeclaredMethod(p0, p1, p2);
    }
    public static void unseal(Context p0){
       if (ReflectionHacker.belowP()) {
          return;
       }
       ReflectionHacker.exemptAll(p0);
       return;
    }
}
