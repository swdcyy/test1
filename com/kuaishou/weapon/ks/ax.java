package com.kuaishou.weapon.ks.ax;
import java.lang.Object;
import java.lang.ClassLoader;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.StackTraceElement;
import java.lang.CharSequence;
import java.lang.System;
import android.text.TextUtils;
import java.lang.Throwable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ax	// class@0011d5
{

    public void ax(){
       super();
    }
    public boolean a(){
       boolean b = false;
       try{
          Field declaredFiel = ClassLoader.getSystemClassLoader().loadClass("de.robv.android.xposed.XposedBridge").getDeclaredField("disableHooks");
          declaredFiel.setAccessible(true);
          declaredFiel.set(null, Boolean.TRUE);
          return true;
       }catch(java.lang.NoSuchFieldException e0){
          return e0;
       }catch(java.lang.ClassNotFoundException e0){
       }catch(java.lang.IllegalAccessException e0){
       }
    }
    public final boolean a(String p0){
       ClassLoader systemClassL = ClassLoader.getSystemClassLoader();
       if (systemClassL != null) {
          try{
             systemClassL.loadClass(p0).newInstance();
          }catch(java.lang.InstantiationException e0){
          }catch(java.lang.IllegalAccessException e0){
          }catch(java.lang.ClassNotFoundException e0){
             return false;
          }
       }
       return true;
    }
    public boolean b(){
       try{
          throw new Exception("");
       }catch(java.lang.Exception e0){
          StackTraceElement[] stackTrace = e0.getStackTrace();
          int len = stackTrace.length;
          int i = 0;
       label_0010 :
          if (i >= len) {
             return false;
          }
          if ((stackTrace[i].getClassName()).contains("de.robv.android.xposed.XposedBridge")) {
             return true;
          }
          i = i + 1;
          goto label_0010 ;
       }
    }
    public boolean c(){
       return this.a("com.elderdrivers.riru.edxp.config.EdXpConfigGlobal");
    }
    public boolean d(){
       ClassLoader systemClassL = ClassLoader.getSystemClassLoader();
       if (systemClassL != null) {
          try{
             systemClassL.loadClass("de.robv.android.xposed.XposedHelpers").newInstance();
          }catch(java.lang.InstantiationException e0){
             return true;
          }catch(java.lang.IllegalAccessException e0){
          }catch(java.lang.ClassNotFoundException e0){
             return false;
          }
       }
       if (systemClassL != null) {
          try{
             systemClassL.loadClass("de.robv.android.xposed.XposedBridge").newInstance();
          }catch(java.lang.InstantiationException e0){
          }catch(java.lang.IllegalAccessException e0){
          }catch(java.lang.ClassNotFoundException e0){
             return false;
          }
       }
       return true;
    }
    public String e(){
       try{
          return System.getProperty("vxp");
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public boolean f(){
       try{
          String env = System.getenv("CLASSPATH");
          if (!TextUtils.isEmpty(env) && env.contains("XposedBridge")) {
             return true;
          }
          return false;
       }catch(java.lang.Exception e0){
       }
    }
    public boolean g(){
       boolean i = 0;
       try{
          Class[] uClassArray = new Class[i];
          i = Modifier.isNative(Throwable.class.getDeclaredMethod("getStackTrace", uClassArray).getModifiers());
          return e0;
       }catch(java.lang.NoSuchMethodException e0){
       }
    }
}
