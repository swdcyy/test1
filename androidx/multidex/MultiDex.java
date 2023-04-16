package androidx.multidex.MultiDex;
import java.util.HashSet;
import java.lang.String;
import java.lang.System;
import java.lang.Object;
import android.content.Context;
import java.io.File;
import java.util.Set;
import java.lang.ClassLoader;
import androidx.multidex.MultiDexExtractor;
import java.util.List;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.reflect.Array;
import java.lang.NoSuchFieldException;
import java.lang.StringBuilder;
import java.lang.reflect.Method;
import java.lang.NoSuchMethodException;
import java.util.Arrays;
import android.content.pm.ApplicationInfo;
import dalvik.system.BaseDexClassLoader;
import java.lang.RuntimeException;
import java.lang.Exception;
import androidx.multidex.MultiDex$V19;
import java.util.StringTokenizer;
import java.lang.Integer;
import java.io.IOException;

public final class MultiDex	// class@000856
{
    public static final boolean IS_VM_MULTIDEX_CAPABLE;
    public static final Set installedApk;

    static {
       MultiDex.installedApk = new HashSet();
       MultiDex.IS_VM_MULTIDEX_CAPABLE = MultiDex.isVMMultidexCapable(System.getProperty("java.vm.version"));
    }
    public void MultiDex(){
       super();
    }
    public static void clearOldDexDir(Context p0){
       File uFile = new File(p0.getFilesDir(), "secondary-dexes");
       if (uFile.isDirectory()) {
          uFile.getPath();
          File[] uFileArray = uFile.listFiles();
          if (uFileArray == null) {
             uFile.getPath();
             return;
          }else {
             int len = uFileArray.length;
             int i = 0;
             while (i < len) {
                object oobject = uFileArray[i];
                oobject.getPath();
                oobject.length();
                if (!oobject.delete()) {
                   oobject.getPath();
                }else {
                   oobject.getPath();
                }
                i = i + 1;
             }
             if (!uFile.delete()) {
                uFile.getPath();
             }else {
                uFile.getPath();
             }
          }
       }
       return;
    }
    public static void doInstallation(Context p0,File p1,File p2,String p3,String p4,boolean p5){
       Set installedApk = MultiDex.installedApk;
       _monitor_enter(installedApk);
       if (installedApk.contains(p1)) {
          _monitor_exit(installedApk);
          return;
       }else {
          installedApk.add(p1);
          System.getProperty("java.vm.version");
          ClassLoader dexClassload = MultiDex.getDexClassloader(p0);
          if (dexClassload == null) {
             _monitor_exit(installedApk);
             return;
          }else {
             MultiDex.clearOldDexDir(p0);
             p2 = MultiDex.getDexDir(p0, p2, p3);
             MultiDexExtractor multiDexExtr = new MultiDexExtractor(p1, p2);
             List list = multiDexExtr.load(p0, p4, false);
             try{
                MultiDex.installSecondaryDexes(dexClassload, p2, list);
             }catch(java.io.IOException e2){
                if (!p5) {
                   throw e2;
                }
                MultiDex.installSecondaryDexes(dexClassload, p2, multiDexExtr.load(p0, p4, true));
             }
             try{
                multiDexExtr.close();
             }catch(java.io.IOException e4){
             }
             if (e4) {
                throw e4;
             }
             _monitor_exit(installedApk);
             return;
          }
       }
    }
    public static void expandFieldArray(Object p0,String p1,Object[] p2){
       Field uField = MultiDex.findField(p0, p1);
       Object[] objArray = uField.get(p0);
       Object[] objArray1 = Array.newInstance(objArray.getClass().getComponentType(), (objArray.length + p2.length));
       System.arraycopy(objArray, 0, objArray1, 0, objArray.length);
       System.arraycopy(p2, 0, objArray1, objArray.length, p2.length);
       uField.set(p0, objArray1);
    }
    public static Field findField(Object p0,String p1){
       Class class = p0.getClass();
    label_0004 :
       if (class == null) {
          throw new NoSuchFieldException("Field "+p1+" not found in "+p0.getClass());
       }
       try{
          Field declaredFiel = class.getDeclaredField(p1);
          if (!declaredFiel.isAccessible()) {
             declaredFiel.setAccessible(true);
          }
          return declaredFiel;
       }catch(java.lang.NoSuchFieldException e0){
          class = e0.getSuperclass();
          goto label_0004 ;
       }
    }
    public static Method findMethod(Object p0,String p1,Class[] p2){
       Class class = p0.getClass();
    label_0004 :
       if (class == null) {
          throw new NoSuchMethodException("Method "+p1+" with parameters "+Arrays.asList(p2)+" not found in "+p0.getClass());
       }
       try{
          Method declaredMeth = class.getDeclaredMethod(p1, p2);
          if (!declaredMeth.isAccessible()) {
             declaredMeth.setAccessible(true);
          }
          return declaredMeth;
       }catch(java.lang.NoSuchMethodException e0){
          class = e0.getSuperclass();
          goto label_0004 ;
       }
    }
    public static ApplicationInfo getApplicationInfo(Context p0){
       try{
          return p0.getApplicationInfo();
       }catch(java.lang.RuntimeException e0){
          return null;
       }
    }
    public static ClassLoader getDexClassloader(Context p0){
       ClassLoader uClassLoader = null;
       try{
          ClassLoader classLoader = p0.getClassLoader();
          if (classLoader instanceof BaseDexClassLoader) {
             return classLoader;
          }
          return e0;
       }catch(java.lang.RuntimeException e0){
       }
    }
    public static File getDexDir(Context p0,File p1,String p2){
       File uFile;
       try{
          uFile = new File(p1, "code_cache");
          MultiDex.mkdirChecked(uFile);
       }catch(java.io.IOException e0){
          uFile = new File(p0.getFilesDir(), "code_cache");
          MultiDex.mkdirChecked(uFile);
       }
       File uFile1 = new File(uFile, p2);
       MultiDex.mkdirChecked(uFile1);
       return uFile1;
    }
    public static void install(Context p0){
       if (MultiDex.IS_VM_MULTIDEX_CAPABLE) {
          return;
       }
       try{
          ApplicationInfo applicationI = MultiDex.getApplicationInfo(p0);
          if (applicationI == null) {
             return;
          }
          MultiDex.doInstallation(p0, new File(applicationI.sourceDir), new File(applicationI.dataDir), "secondary-dexes", "", true);
          return;
       }catch(java.lang.Exception e7){
          throw new RuntimeException("MultiDex installation failed \("+e7.getMessage()+"\).");
       }
    }
    public static void installInstrumentation(Context p0,Context p1){
       if (MultiDex.IS_VM_MULTIDEX_CAPABLE) {
          return;
       }
       try{
          ApplicationInfo applicationI = MultiDex.getApplicationInfo(p0);
          if (applicationI == null) {
             return;
          }
          ApplicationInfo applicationI1 = MultiDex.getApplicationInfo(p1);
          if (applicationI1 == null) {
             return;
          }
          String str = p0.getPackageName()+".";
          File uFile = new File(applicationI1.dataDir);
          MultiDex.doInstallation(p1, new File(applicationI.sourceDir), uFile, str+"secondary-dexes", str, false);
          MultiDex.doInstallation(p1, new File(applicationI1.sourceDir), uFile, "secondary-dexes", "", false);
          return;
       }catch(java.lang.Exception e14){
          throw new RuntimeException("MultiDex installation failed \("+e14.getMessage()+"\).");
       }
    }
    public static void installSecondaryDexes(ClassLoader p0,File p1,List p2){
       if (!p2.isEmpty()) {
          MultiDex$V19.install(p0, p2, p1);
       }
       return;
    }
    public static boolean isVMMultidexCapable(String p0){
       boolean b = false;
       if (p0 != null) {
          StringTokenizer stringTokeni = new StringTokenizer(p0, ".");
          String str = null;
          p0 = (stringTokeni.hasMoreTokens())? stringTokeni.nextToken(): str;
          if (stringTokeni.hasMoreTokens()) {
             str = stringTokeni.nextToken();
          }
          if (p0 != null && str != null) {
             try{
                int i = Integer.parseInt(p0);
                int i1 = Integer.parseInt(str);
                if (i > 2 || (i == 2 && i1 >= 1)) {
                   b = true;
                }
             }catch(java.lang.NumberFormatException e0){
             }
          }
       }
    label_0036 :
       return e0;
    }
    public static void mkdirChecked(File p0){
       p0.mkdir();
       if (p0.isDirectory()) {
          return;
       }
       File parentFile = p0.getParentFile();
       if (parentFile == null) {
          p0.getPath();
       }else {
          p0.getPath();
          parentFile.isDirectory();
          parentFile.isFile();
          parentFile.exists();
          parentFile.canRead();
          parentFile.canWrite();
       }
       throw new IOException("Failed to create directory "+p0.getPath());
    }
}
