package com.kuaishou.webkit.internal.loader.DexOptimizer;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.os.IBinder;
import android.content.pm.PackageManager;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.os.Binder;
import android.os.Parcel;
import java.io.FileDescriptor;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.NoSuchMethodException;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Arrays;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.ClassLoader;
import com.kuaishou.webkit.internal.loader.DexOptimizer$1;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import android.content.ContextWrapper;
import java.io.File;
import com.kuaishou.webkit.internal.loader.DexOptimizer$OptimizeCallback;
import android.os.Build$VERSION;
import java.io.IOException;
import java.lang.Exception;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import java.lang.RuntimeException;
import com.kuaishou.webkit.internal.Logger;
import android.os.SystemClock;

public final class DexOptimizer	// class@001334
{
    public static final long[] CHECK_VDEX_DELAY_SEQ;
    public static final ResultReceiver sEmptyResultReceiver;
    public static final Handler sHandler;
    public static final IBinder[] sPMSBinderProxy;
    public static final PackageManager[] sSynchronizedPMCache;

    static {
       DexOptimizer.CHECK_VDEX_DELAY_SEQ = new long[4]{1000,2000,4000,8000};
       Handler handler = new Handler(Looper.getMainLooper());
       DexOptimizer.sHandler = handler;
       DexOptimizer.sEmptyResultReceiver = new ResultReceiver(handler);
       IBinder[] iBinderArray = new IBinder[]{null};
       DexOptimizer.sPMSBinderProxy = iBinderArray;
       PackageManager[] packageManag = new PackageManager[]{null};
       DexOptimizer.sSynchronizedPMCache = packageManag;
    }
    public void DexOptimizer(){
       super();
    }
    public static void executePMSShellCommand(Context p0,String[] p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeFileDescriptor(FileDescriptor.in);
       parcel.writeFileDescriptor(FileDescriptor.out);
       parcel.writeFileDescriptor(FileDescriptor.err);
       parcel.writeStringArray(p1);
       parcel.writeStrongBinder(null);
       DexOptimizer.sEmptyResultReceiver.writeToParcel(parcel, 0);
       DexOptimizer.getPMSBinderProxy(p0).transact(0x5f434d44, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       Binder.restoreCallingIdentity(Binder.clearCallingIdentity());
    }
    public static Constructor findConstructor(Class p0,Class[] p1){
       Class uClass = p0;
    label_0001 :
       if (uClass == null) {
          throw new NoSuchMethodException("Constructor with parameters "+Arrays.asList(p1)+" not found in "+p0);
       }
       try{
          Constructor declaredCons = uClass.getDeclaredConstructor(p1);
          if (!declaredCons.isAccessible()) {
             declaredCons.setAccessible(true);
          }
          return declaredCons;
       }catch(java.lang.NoSuchMethodException e0){
          uClass = e0.getSuperclass();
          goto label_0001 ;
       }
    }
    public static Method findMethod(Class p0,String p1,Class[] p2){
       if (p0 == null) {
          throw new NoSuchMethodException("Method "+p1+" with parameters "+Arrays.asList(p2)+" not found in "+p0);
       }
       try{
          Method declaredMeth = p0.getDeclaredMethod(p1, p2);
          if (!declaredMeth.isAccessible()) {
             declaredMeth.setAccessible(true);
          }
          return declaredMeth;
       }catch(java.lang.NoSuchMethodException e0){
          p0 = p0.getSuperclass();
          goto label_0000 ;
       }
    }
    public static IBinder getPMSBinderProxy(Context p0){
       IBinder[] sPMSBinderPr = DexOptimizer.sPMSBinderProxy;
       _monitor_enter(sPMSBinderPr);
       int i = 0;
       object oobject = sPMSBinderPr[i];
       if (oobject != null && oobject.isBinderAlive()) {
          _monitor_exit(sPMSBinderPr);
          return oobject;
       }else {
          Class[] uClassArray = new Class[]{String.class};
          Object[] objArray = new Object[]{"package"};
          sPMSBinderPr[i] = DexOptimizer.findMethod(Class.forName("android.os.ServiceManager"), "getService", uClassArray).invoke(null, objArray);
          _monitor_exit(sPMSBinderPr);
          return sPMSBinderPr[i];
       }
    }
    public static final PackageManager getSynchronizedPackageManager(Context p0){
       PackageManager[] sSynchronize = DexOptimizer.sSynchronizedPMCache;
       _monitor_enter(sSynchronize);
       int i = 0;
       try{
          if (sSynchronize[i] != null) {
             IBinder[] sPMSBinderPr = DexOptimizer.sPMSBinderProxy;
             _monitor_enter(sPMSBinderPr);
             if (sPMSBinderPr[i] != null && sPMSBinderPr[i].isBinderAlive()) {
                _monitor_exit(sPMSBinderPr);
                _monitor_exit(sSynchronize);
                return sSynchronize[i];
             }else {
                _monitor_exit(sPMSBinderPr);
             }
          }
          IBinder pMSBinderPro = DexOptimizer.getPMSBinderProxy(p0);
          Class[] uClassArray = new Class[]{IBinder.class};
          Object[] objArray = new Object[]{Proxy.newProxyInstance(p0.getClassLoader(), pMSBinderPro.getClass().getInterfaces(), new DexOptimizer$1(pMSBinderPro))};
          Object obj = DexOptimizer.findMethod(Class.forName("android.content.pm.IPackageManager$Stub"), "asInterface", uClassArray).invoke(null, objArray);
          Class uClass = Class.forName("android.app.ApplicationPackageManager");
          if (p0 instanceof ContextWrapper) {
             p0 = p0.getBaseContext();
          }
          Class[] uClassArray1 = new Class[]{p0.getClass(),Class.forName("android.content.pm.IPackageManager")};
          Object[] objArray1 = new Object[]{p0,obj};
          PackageManager packageManag = DexOptimizer.findConstructor(uClass, uClassArray1).newInstance(objArray1);
          sSynchronize[i] = packageManag;
          _monitor_exit(sSynchronize);
          return packageManag;
       }catch(java.lang.reflect.InvocationTargetException e9){
          throw new IllegalStateException(e9.getTargetException());
       }
    }
    public static final boolean isLegalFile(File p0){
       boolean b = (p0 != null && (p0.exists() && (p0.canRead() && (p0.isFile() && p0.length() > 0))))? true: false;
       return b;
    }
    public static void optimize(Context p0,String p1,DexOptimizer$OptimizeCallback p2){
       File uFile;
       try{
          if (p2 != null) {
             p2.onStarted(p1);
          label_0005 :
             int sDK_INT = Build$VERSION.SDK_INT;
             if (sDK_INT < 29) {
                if (p2 != null) {
                   p2.onSkipped(p1, "Not API 29, 30 and newer device.");
                }
                return;
             }else if(p1 == null){
                uFile = null;
             }else {
                uFile = new File(p1);
             }
             if (!DexOptimizer.isLegalFile(uFile)) {
                if (p2 != null) {
                   p2.onFailed(p1, new IOException("dex file "+p1+" is not exist!"));
                }
                return;
             }else {
                String str = DexOptimizer.optimizePathFor(uFile);
                File uFile1 = new File(str);
                if (uFile1.exists()) {
                   p2.onSkipped(p1, "Odex file "+str+" already exists.");
                   return;
                }else {
                   String str1 = str.substring(0, str.lastIndexOf(".odex"))+".vdex";
                   if (sDK_INT < 31 && (sDK_INT != 30 || !Build$VERSION.PREVIEW_SDK_INT)) {
                      DexOptimizer.triggerPMDexOptOnDemand(p0, p1, uFile1, p2);
                      if (new File(str1).exists()) {
                         p2.onVdexGen(p1, str1);
                      }
                   }else {
                      DexOptimizer.triggerPMDexOptOnDemand(p0, p1, uFile1, p2);
                      DexOptimizer.waitUntilVdexGeneratedOrTimeout(p1, str1, p2);
                   }
                   if (p2 != null) {
                      p2.onSucceeded(p1, str);
                   }
                }
             }
          }else {
             goto label_0005 ;
          }
       }catch(java.lang.Exception e6){
          if (p2) {
             p2.onFailed(p1, e6);
          }
       }
       return;
    }
    public static String optimizePathFor(File p0){
       try{
          String sCurrentInst = KsWebViewUtils.getsCurrentInstructionSet();
          File parentFile = p0.getParentFile();
          String name = p0.getName();
          int i = name.lastIndexOf(46);
          if (i > 0) {
             name = name.substring(0, i);
          }
          return parentFile.getAbsolutePath()+"/"+"oat"+"/"+sCurrentInst+"/"+name+".odex";
       }catch(java.lang.Exception e4){
          throw new RuntimeException("getCurrentInstructionSet failed.", e4);
       }
    }
    public static void performDexOptSecondary(Context p0){
       Logger.i("DexOptimizer", "Start trigger performDexOptSecondary.");
       String[] stringArray = new String[]{"compile","-f","--secondary-dex","-m","speed-profile",p0.getPackageName()};
       DexOptimizer.executePMSShellCommand(p0, stringArray);
       Logger.i("DexOptimizer", "performDexOptSecondary done.");
    }
    public static void reconcileSecondaryDexFiles(Context p0){
       Logger.i("DexOptimizer", "Start trigger reconcileSecondaryDexFiles.");
       String[] stringArray = new String[]{"reconcile-secondary-dex-files","com.kuaishou.webview"};
       DexOptimizer.executePMSShellCommand(p0, stringArray);
       Logger.i("DexOptimizer", "reconcileSecondaryDexFiles done.");
    }
    public static void registerDexModule(Context p0,String p1){
       String str = "Start registerDexModule.";
       try{
          Logger.i("DexOptimizer", str);
          PackageManager synchronized = DexOptimizer.getSynchronizedPackageManager(p0);
          Class[] uClassArray = new Class[]{String.class,Class.forName("android.content.pm.PackageManager$DexModuleRegisterCallback")};
          Object[] objArray = new Object[]{p1,null};
          DexOptimizer.findMethod(synchronized.getClass(), "registerDexModule", uClassArray).invoke(synchronized, objArray);
          Logger.i("DexOptimizer", "registerDexModule done.");
          return;
       }catch(java.lang.reflect.InvocationTargetException e8){
          throw new IllegalStateException(e8.getTargetException());
       }
    }
    public static boolean triggerPMDexOpt(Context p0,String p1,File p2,DexOptimizer$OptimizeCallback p3,int p4){
       String str = "DexOptimizer";
       try{
          DexOptimizer.reconcileSecondaryDexFiles(p0);
       }catch(java.lang.Exception e1){
          Logger.e(str, "Fail to call reconcileSecondaryDexFiles, caused by:"+e1);
       }
       boolean b = true;
       try{
          DexOptimizer.registerDexModule(p0, p1);
          if (p2.exists()) {
             p3.onOdexGen(p1, p2.getAbsolutePath()+" generated by registerDexModule, tried "+p4+" time\(s\).");
             return b;
          }
       }catch(java.lang.Exception e2){
          Logger.e(str, "Fail to call registerDexModule, caused by:"+e2);
       }
       try{
          DexOptimizer.performDexOptSecondary(p0);
       }catch(java.lang.Exception e5){
          Logger.e(str, "Fail to call performDexOptSecondary, caused by:"+e5);
       }
       if (p2.exists()) {
          p3.onOdexGen(p1, p2.getAbsolutePath()+" generated by performDexOptSecondary, tried "+p4+"time\(s\).");
          return b;
       }else {
          Logger.w(str, "No odex file was generated, wait 5000ms for retry.");
          SystemClock.sleep(5000);
          if (p2.exists()) {
             p3.onOdexGen(p1, p2.getAbsolutePath()+" generated by performDexOptSecondary, wait "+5000+" ms, tried "+p4+"time\(s\).");
             return b;
          }else {
             return false;
          }
       }
    }
    public static void triggerPMDexOptOnDemand(Context p0,String p1,File p2,DexOptimizer$OptimizeCallback p3){
       int i = 0;
       while (true) {
          if (i >= 2) {
             throw new IllegalStateException("Dexopt was triggered 2 times, but no odex file was generated.");
          }
          i = i + 1;
          if (DexOptimizer.triggerPMDexOpt(p0, p1, p2, p3, i)) {
             break ;
          }
       }
       return;
    }
    public static void waitUntilVdexGeneratedOrTimeout(String p0,String p1,DexOptimizer$OptimizeCallback p2){
       File uFile = new File(p1);
       int i = 0;
       String str = "Vdex ";
       while (!uFile.exists()) {
          long[] cHECK_VDEX_D = DexOptimizer.CHECK_VDEX_DELAY_SEQ;
          if (i < cHECK_VDEX_D.length) {
             Logger.w("DexOptimizer", str+p1+" does not exist,  wait for "+cHECK_VDEX_D[i]+"ms for retry.");
             int i1 = i + 1;
             SystemClock.sleep(cHECK_VDEX_D[i]);
             i = i1;
          }else if(uFile.exists()){
             p2.onVdexGen(p0, p1);
             Logger.i("DexOptimizer", str+p1+" was found.");
          }else {
             Logger.w("DexOptimizer", str+p1+" does not exist after waiting "+DexOptimizer.CHECK_VDEX_DELAY_SEQ.length+" times.");
          }
          return;
       }
    }
}
