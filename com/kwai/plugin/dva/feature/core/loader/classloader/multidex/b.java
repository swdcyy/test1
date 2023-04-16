package com.kwai.plugin.dva.feature.core.loader.classloader.multidex.b;
import java.util.HashSet;
import java.lang.String;
import java.lang.System;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.StringTokenizer;
import java.lang.Integer;
import android.content.Context;
import com.kwai.plugin.dva.entity.Plugin;
import java.io.File;
import com.kwai.plugin.dva.repository.model.PluginInfo;
import java.util.Set;
import java.lang.ClassLoader;
import com.kwai.plugin.dva.feature.core.loader.classloader.multidex.MultiDexExtractor;
import java.util.List;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.NoSuchFieldException;
import java.lang.StringBuilder;
import java.lang.RuntimeException;
import java.lang.Exception;
import com.kwai.plugin.dva.feature.core.loader.classloader.multidex.b$a;
import java.io.IOException;

public final class b	// class@00131a
{
    public static final Set a;
    public static final boolean b;

    static {
       int b;
       try{
          b.a = new HashSet();
          String property = System.getProperty("java.vm.version");
          String str = null;
          Object obj = PatchProxy.applyOneRefs(property, str, b.class, "5");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(property != null){
             StringTokenizer stringTokeni = new StringTokenizer(property, ".");
             property = (stringTokeni.hasMoreTokens())? stringTokeni.nextToken(): str;
             if (stringTokeni.hasMoreTokens()) {
                str = stringTokeni.nextToken();
             }
             if (property != null && str != null) {
                b = Integer.parseInt(property);
                int i = Integer.parseInt(str);
                if (b > 2 || (b == 2 && i >= 1)) {
                   b = true;
                }
             }
          }
       label_0057 :
          b = false;
       }catch(java.lang.NumberFormatException e0){
       }
          b.b = b;
    }
    public void b(){
       super();
    }
    public static void a(Context p0,Plugin p1,String p2,String p3,boolean p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, uob, "2")) {
             return;
          }
       }
       File uFile = new File(p1.getPluginInfo().apkPath);
       File uFile1 = new File(p1.getPluginInfo().dataDir);
       Set a = b.a;
       _monitor_enter(a);
       if (a.contains(uFile)) {
          _monitor_exit(a);
          return;
       }else {
          a.add(uFile);
          System.getProperty("java.vm.version");
          ClassLoader classLoader = p1.getClassLoader();
          File uFile2 = b.d(p0, uFile1, p2);
          MultiDexExtractor multiDexExtr = new MultiDexExtractor(uFile, uFile2);
          List list = multiDexExtr.f(p0, p3, 0);
          try{
             b.f(classLoader, uFile2, list);
          }catch(java.io.IOException e0){
             if (p4) {
                b.f(classLoader, uFile2, multiDexExtr.f(p0, p3, 1));
             }else {
                throw e0;
             }
          }
          try{
             multiDexExtr.close();
          }catch(java.io.IOException e2){
          }
          if (e2 == null) {
             _monitor_exit(a);
             return;
          }else {
             throw e2;
          }
       }
    }
    public static void b(Object p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "9")) {
          return;
       }
       Field uField = b.c(p0, p1);
       Object[] objArray = uField.get(p0);
       Object[] objArray1 = Array.newInstance(objArray.getClass().getComponentType(), (objArray.length + p2.length));
       System.arraycopy(objArray, 0, objArray1, 0, objArray.length);
       System.arraycopy(p2, 0, objArray1, objArray.length, p2.length);
       uField.set(p0, objArray1);
       return;
    }
    public static Field c(Object p0,String p1){
       Class obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getClass();
    label_0014 :
       if (obj == null) {
          throw new NoSuchFieldException("Field "+p1+" not found in "+p0.getClass());
       }
       try{
          Field declaredFiel = obj.getDeclaredField(p1);
          if (!declaredFiel.isAccessible()) {
             declaredFiel.setAccessible(true);
          }
          return declaredFiel;
       }catch(java.lang.NoSuchFieldException e0){
          obj = e0.getSuperclass();
          goto label_0014 ;
       }
    }
    public static File d(Context p0,File p1,String p2){
       File obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new File(p1, "code_cache");
          b.g(obj);
       }catch(java.io.IOException e0){
          obj = new File(p0.getFilesDir(), "code_cache");
          b.g(obj);
       }
       File uFile = new File(obj, p2);
       b.g(uFile);
       return uFile;
    }
    public static void e(Context p0,Plugin p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "1")) {
          return;
       }
       if (b.b) {
          return;
       }
       try{
          b.a(p0, p1, "secondary-dexes", "", true);
          return;
       }catch(java.lang.Exception e3){
          throw new RuntimeException("MultiDex installation failed \("+e3.getMessage()+"\).");
       }
    }
    public static void f(ClassLoader p0,File p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "6")) {
          return;
       }
       if (!p2.isEmpty()) {
          b$a.a(p0, p2, p1);
       }
       return;
    }
    public static void g(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "11")) {
          return;
       }
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
