package com.kwai.android.common.utils.ProcessUtil;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Process;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.Application;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.reflect.Method;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;

public final class ProcessUtil	// class@00099c
{
    public static final ProcessUtil INSTANCE;
    public static String currentProcessName;

    static {
       ProcessUtil.INSTANCE = new ProcessUtil();
    }
    public void ProcessUtil(){
       super();
    }
    public static final String getCurrentProcessName(Context p0){
       if (!TextUtils.isEmpty(ProcessUtil.currentProcessName)) {
          return ProcessUtil.currentProcessName;
       }
       ProcessUtil iNSTANCE = ProcessUtil.INSTANCE;
       String currentProce = iNSTANCE.getCurrentProcessNameByApplication();
       ProcessUtil.currentProcessName = currentProce;
       if (!TextUtils.isEmpty(currentProce)) {
          return ProcessUtil.currentProcessName;
       }
       currentProce = iNSTANCE.getCurrentProcessNameByActivityThread();
       ProcessUtil.currentProcessName = currentProce;
       if (!TextUtils.isEmpty(currentProce)) {
          return ProcessUtil.currentProcessName;
       }
       String currentProce1 = iNSTANCE.getCurrentProcessNameByActivityManager(p0);
       ProcessUtil.currentProcessName = currentProce1;
       return currentProce1;
    }
    public final String getCurrentProcessNameByActivityManager(Context p0){
       int i = Process.myPid();
       String systemServic = (p0 != null)? p0.getSystemService("activity"): null;
       if (!systemServic instanceof ActivityManager) {
          systemServic = null;
       }
       if (systemServic != null) {
          List runningAppPr = systemServic.getRunningAppProcesses();
          if (runningAppPr != null) {
             Iterator iterator = runningAppPr.iterator();
             while (iterator.hasNext()) {
                ActivityManager$RunningAppProcessInfo runningAppPr1 = iterator.next();
                if (runningAppPr1.pid == i) {
                   return runningAppPr1.processName;
                }
             }
          }
       }
       return null;
    }
    public final String getCurrentProcessNameByActivityThread(){
       Object obj = null;
       Class[] uClassArray = new Class[false];
       Method declaredMeth = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", uClassArray);
       a.o(declaredMeth, "declaredMethod");
       declaredMeth.setAccessible(true);
       Object[] objArray = new Object[false];
       Object obj1 = declaredMeth.invoke(obj, objArray);
       if (obj1 instanceof String) {
          obj = obj1;
       }
       return obj;
    }
    public final String getCurrentProcessNameByApplication(){
       String processName = (Build$VERSION.SDK_INT >= 28)? Application.getProcessName(): null;
       return processName;
    }
}
