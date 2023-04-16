package com.oasisfeng.condom.CondomProcess;
import java.lang.Object;
import android.app.Application;
import java.lang.String;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.util.HashSet;
import android.content.pm.ActivityInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.ProviderInfo;
import android.content.Context;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import android.app.ActivityManager;
import java.util.List;
import android.os.Process;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import com.oasisfeng.condom.CondomOptions;
import com.oasisfeng.condom.CondomCore;
import java.lang.Exception;
import java.lang.Class;
import android.os.Build$VERSION;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import com.oasisfeng.condom.CondomProcess$CondomProcessActivityManager;
import java.lang.ClassLoader;
import java.lang.IllegalStateException;
import com.oasisfeng.condom.CondomProcess$CondomProcessPackageManager;
import android.content.pm.ApplicationInfo;
import java.lang.Thread;
import com.oasisfeng.condom.CondomProcess$1;
import java.lang.Runnable;

public class CondomProcess	// class@000a92
{
    public static String FULL_TAG = "CondomProcess";
    public static String TAG = "CondomProcess";
    public static final String TAG_INCOMPATIBILITY = "Incompatibility";

    public void CondomProcess(){
       super();
    }
    public static void doValidateProcessNames(Application p0,String[] p1){
       int len;
       int i1;
       object oobject;
       try{
          PackageInfo packageInfo = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 15);
          HashSet hashSet = new HashSet();
          PackageInfo activities = packageInfo.activities;
          int i = 0;
          if (activities != null) {
             len = activities.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                hashSet.add(activities[i1].processName);
             }
          }
          activities = packageInfo.services;
          if (activities != null) {
             len = activities.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                hashSet.add(activities[i1].processName);
             }
          }
          activities = packageInfo.receivers;
          if (activities != null) {
             len = activities.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                hashSet.add(activities[i1].processName);
             }
          }
          packageInfo = packageInfo.providers;
          if (packageInfo != null) {
             int len1 = packageInfo.length;
             for (len = 0; len < len1; len = len + 1) {
                hashSet.add(packageInfo[len].processName);
             }
          }
          int len2 = p1.length;
          while (true) {
             if (i >= len2) {
                return;
             }
             oobject = p1[i];
             if (hashSet.contains(CondomProcess.getFullProcessName(p0, oobject))) {
                i = i + 1;
             }else {
                break ;
             }
          }
          throw new IllegalArgumentException("Process name \""+oobject+"\" is not used by any component in AndroidManifest.xml");
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
       }
    }
    public static String getFullProcessName(Context p0,String p1){
       if (p1.length() > 0 && p1.charAt(0) == ':') {
          p1 = p0.getPackageName()+p1;
       }
       return p1;
    }
    public static String getProcessName(Context p0){
       ActivityManager systemServic = p0.getSystemService("activity");
       if (systemServic == null) {
          return null;
       }
       try{
          List runningAppPr = systemServic.getRunningAppProcesses();
          int i = Process.myPid();
          if (runningAppPr != null) {
             Iterator iterator = runningAppPr.iterator();
             while (iterator.hasNext()) {
                ActivityManager$RunningAppProcessInfo runningAppPr1 = iterator.next();
                if (runningAppPr1.pid == i) {
                   return runningAppPr1.processName;
                }
             }
          }
          return e0;
       }catch(java.lang.SecurityException e0){
       }
    }
    public static void install(Application p0,String p1,CondomOptions p2){
       CondomCore uCondomCore;
       int i = p1.indexOf(58);
       if (i > 0) {
          p1 = p1.substring((i + 1));
       }
       p1 = "Condom:"+p1;
       CondomProcess.FULL_TAG = p1;
       CondomProcess.TAG = CondomCore.asLogTag(p1);
       String tAG = CondomProcess.TAG;
       try{
          uCondomCore = new CondomCore(p0, p2, tAG);
          CondomProcess.installCondomProcessActivityManager(uCondomCore);
          CondomProcess.installCondomProcessPackageManager(uCondomCore);
       }catch(java.lang.Exception e2){
          uCondomCore.logConcern("Incompatibility", e2.getMessage());
       }
       return;
    }
    public static void installCondomProcessActivityManager(CondomCore p0){
       boolean b;
       Class uClass1;
       int i;
       Class[] uClassArray;
       Method declaredMeth;
       Field declaredFiel1;
       Class uClass2;
       Object obj1;
       Object obj2;
       InvocationHandler invocationHa;
       Class[] uClassArray1;
       Class uClass = Class.forName("android.app.ActivityManagerNative");
       Object[] obj = null;
       Field declaredFiel = (Build$VERSION.SDK_INT <= 25)? uClass.getDeclaredField("gDefault"): obj;
    }
    public static void installCondomProcessPackageManager(CondomCore p0){
       Field declaredFiel = Class.forName("android.app.ActivityThread").getDeclaredField("sPackageManager");
       boolean b = true;
       declaredFiel.setAccessible(b);
       Class uClass = Class.forName("android.content.pm.IPackageManager");
       Object obj = declaredFiel.get(null);
       if (Proxy.isProxyClass(obj.getClass())) {
          InvocationHandler invocationHa = Proxy.getInvocationHandler(obj);
          if (invocationHa instanceof CondomProcess$CondomProcessPackageManager) {
             invocationHa.f = p0;
          label_0049 :
             return;
          }
       }
       Class[] uClassArray = new Class[b];
       uClassArray[0] = uClass;
       declaredFiel.set(null, Proxy.newProxyInstance(p0.mBase.getClassLoader(), uClassArray, new CondomProcess$CondomProcessPackageManager(p0, obj)));
       goto label_0049 ;
    }
    public static void installExcept(Application p0,CondomOptions p1,String[] p2){
       if (!p2.length) {
          throw new IllegalArgumentException("At lease one process name must be specified");
       }
       CondomProcess.validateCondomOptions(p1);
       String processName = CondomProcess.getProcessName(p0);
       if (processName == null) {
          return;
       }
       int len = p2.length;
       int i = 0;
       while (true) {
          if (i < len) {
             if (!processName.equals(CondomProcess.getFullProcessName(p0, p2[i]))) {
                CondomProcess.install(p0, processName, p1);
                return;
             }else {
                i = i + 1;
             }
          }else if(p0.getApplicationInfo().flags & 0x02){
             CondomProcess.validateProcessNames(p0, p2);
             break ;
          }
          break ;
       }
       return;
    }
    public static void installExceptDefaultProcess(Application p0){
       CondomProcess.installExceptDefaultProcess(p0, new CondomOptions());
    }
    public static void installExceptDefaultProcess(Application p0,CondomOptions p1){
       CondomProcess.validateCondomOptions(p1);
       String processName = CondomProcess.getProcessName(p0);
       if (processName == null) {
          return;
       }
       if (!processName.equals(p0.getApplicationInfo().processName)) {
          CondomProcess.install(p0, processName, p1);
       }
       return;
    }
    public static void installInCurrentProcess(Application p0,String p1,CondomOptions p2){
       CondomProcess.install(p0, p1, p2);
    }
    public static void validateCondomOptions(CondomOptions p0){
       p0 = p0.mKits;
       if (p0 == null || p0.isEmpty()) {
          return;
       }
       throw new IllegalArgumentException("CondomKit is not yet compatible with CondomProcess. If you really need this, please submit a feature request on GitHub issue tracker, with the use case.");
    }
    public static void validateProcessNames(Application p0,String[] p1){
       Thread thread = new Thread(new CondomProcess$1(p0, p1));
       thread.setPriority(1);
       thread.start();
    }
}
