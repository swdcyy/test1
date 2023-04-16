package com.kuaishou.webkit.internal.ReflectHelper;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.Method;
import android.os.Build$VERSION;
import java.lang.Class;
import java.lang.StringBuilder;
import com.kuaishou.webkit.internal.Logger;
import java.lang.Integer;
import java.lang.Long;
import android.content.Context;
import android.content.pm.ApplicationInfo;

public class ReflectHelper	// class@001321
{
    public static Object sVmRuntime;
    public static Method setHiddenApiExemptions;
    public static int unsealed;

    public void ReflectHelper(){
       super();
    }
    public static boolean exempt(String p0){
       String[] stringArray = new String[]{p0};
       return ReflectHelper.exempt(stringArray);
    }
    public static boolean exempt(String[] p0){
       ReflectHelper.initReflect();
       Object sVmRuntime = ReflectHelper.sVmRuntime;
       if (sVmRuntime != null) {
          Method setHiddenApi = ReflectHelper.setHiddenApiExemptions;
          if (setHiddenApi != null) {
             Object[] objArray = new Object[]{p0};
             setHiddenApi.invoke(sVmRuntime, objArray);
             return 1;
          }
       }
       return false;
    }
    public static boolean exemptAll(){
       String[] stringArray = new String[]{"L"};
       return ReflectHelper.exempt(stringArray);
    }
    public static void initReflect(){
       String str = String.class;
       if (ReflectHelper.setHiddenApiExemptions != null && ReflectHelper.sVmRuntime != null) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 28) {
          Class[] uClassArray = new Class[]{str};
          Class[] uClassArray1 = new Class[]{str,Class[].class};
          Method declaredMeth = Class.class.getDeclaredMethod("getDeclaredMethod", uClassArray1);
          Object[] objArray = new Object[]{"dalvik.system.VMRuntime"};
          Class uClass = Class.class.getDeclaredMethod("forName", uClassArray).invoke(null, objArray);
          objArray = new Object[]{"getRuntime",null};
          Method method = declaredMeth.invoke(uClass, objArray);
          Object[] objArray1 = new Object[]{"setHiddenApiExemptions",uClassArray1};
          uClassArray1 = new Class[]{String[].class};
          ReflectHelper.setHiddenApiExemptions = declaredMeth.invoke(uClass, objArray1);
          Object[] objArray2 = new Object[0];
          ReflectHelper.sVmRuntime = method.invoke(null, objArray2);
       }
       return;
    }
    public static boolean needsUnseal(){
       Class[] uClassArray;
       String str = "android.graphics.RecordingCanvas";
       boolean b = false;
       try{
          int sDK_INT = Build$VERSION.SDK_INT;
          if (sDK_INT < 28) {
             return b;
          }
          if (sDK_INT >= 31) {
             uClassArray = new Class[]{Integer.TYPE};
             Class.forName(str).getMethod("drawWebViewFunctor", uClassArray);
          }else {
             uClassArray = new Class[]{Long.TYPE};
             Class.forName(str).getMethod("callDrawGLFunction2", uClassArray);
          }
          return b;
       }catch(java.lang.NoSuchMethodException e0){
          return 1;
       }catch(java.lang.Exception e0){
       }
    }
    public static void unseal(Context p0){
       if (Build$VERSION.SDK_INT < 28) {
          return;
       }
       if (ReflectHelper.exemptAll()) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ApplicationInfo applicationI = p0.getApplicationInfo();
       _monitor_enter(ReflectHelper.class);
       if (ReflectHelper.unsealed != -9999) {
          _monitor_exit(ReflectHelper.class);
          return;
       }else {
          ReflectHelper.unsealed = 0;
          Class[] uClassArray = new Class[]{Integer.TYPE};
          Object[] objArray = new Object[]{Integer.valueOf(0)};
          ApplicationInfo.class.getDeclaredMethod("setHiddenApiEnforcementPolicy", uClassArray).invoke(applicationI, objArray);
          _monitor_exit(ReflectHelper.class);
          return;
       }
    }
}
