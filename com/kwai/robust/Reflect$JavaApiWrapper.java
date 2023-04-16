package com.kwai.robust.Reflect$JavaApiWrapper;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Boolean;
import java.lang.ClassLoader;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.ClassNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.Exception;
import java.lang.reflect.Constructor;
import java.lang.NoSuchMethodException;
import java.lang.reflect.Field;
import java.lang.NoSuchFieldException;
import java.lang.SecurityException;

public class Reflect$JavaApiWrapper	// class@0013fc
{
    public static final Method forName1;
    public static final Method forName2;
    public static final Method getConstructor;
    public static final Method getConstructors;
    public static final Method getDeclaredConstructor;
    public static final Method getDeclaredConstructors;
    public static final Method getDeclaredField;
    public static final Method getDeclaredFields;
    public static final Method getDeclaredMethod;
    public static final Method getDeclaredMethods;
    public static final Method getField;
    public static final Method getFields;
    public static final Method getMethod;
    public static final Method getMethods;

    static {
       String str = String.class;
       try{
          Class[] uClassArray = new Class[]{str};
          Reflect$JavaApiWrapper.forName1 = Class.class.getDeclaredMethod("forName", uClassArray);
          uClassArray = new Class[]{str,Boolean.TYPE,ClassLoader.class};
          Reflect$JavaApiWrapper.forName2 = Class.class.getDeclaredMethod("forName", uClassArray);
          uClassArray = new Class[]{str};
          Reflect$JavaApiWrapper.getDeclaredField = Class.class.getDeclaredMethod("getDeclaredField", uClassArray);
          uClassArray = new Class[0];
          Reflect$JavaApiWrapper.getDeclaredFields = Class.class.getDeclaredMethod("getDeclaredFields", uClassArray);
          uClassArray = new Class[]{str,Class[].class};
          Reflect$JavaApiWrapper.getDeclaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", uClassArray);
          uClassArray = new Class[0];
          Reflect$JavaApiWrapper.getDeclaredMethods = Class.class.getDeclaredMethod("getDeclaredMethods", uClassArray);
          uClassArray = new Class[]{Class[].class};
          Reflect$JavaApiWrapper.getDeclaredConstructor = Class.class.getDeclaredMethod("getDeclaredConstructor", uClassArray);
          uClassArray = new Class[0];
          Reflect$JavaApiWrapper.getDeclaredConstructors = Class.class.getDeclaredMethod("getDeclaredConstructors", uClassArray);
          uClassArray = new Class[]{str};
          Reflect$JavaApiWrapper.getField = Class.class.getDeclaredMethod("getField", uClassArray);
          uClassArray = new Class[0];
          Reflect$JavaApiWrapper.getFields = Class.class.getDeclaredMethod("getFields", uClassArray);
          uClassArray = new Class[]{str,Class[].class};
          Reflect$JavaApiWrapper.getMethod = Class.class.getDeclaredMethod("getMethod", uClassArray);
          Class[] uClassArray1 = new Class[0];
          Reflect$JavaApiWrapper.getMethods = Class.class.getDeclaredMethod("getMethods", uClassArray1);
          uClassArray1 = new Class[]{Class[].class};
          Reflect$JavaApiWrapper.getConstructor = Class.class.getDeclaredMethod("getConstructor", uClassArray1);
          uClassArray1 = new Class[0];
          Reflect$JavaApiWrapper.getConstructors = Class.class.getDeclaredMethod("getConstructors", uClassArray1);
       }catch(java.lang.NoSuchMethodException e0){
          throw new RuntimeException(e0);
       }
    }
    public void Reflect$JavaApiWrapper(){
       super();
    }
    public static Class forName(String p0){
       try{
          Object[] objArray = new Object[]{p0};
          return Reflect$JavaApiWrapper.forName1.invoke(null, objArray);
       }catch(java.lang.IllegalAccessException e4){
       }catch(java.lang.IllegalArgumentException e4){
       }catch(java.lang.reflect.InvocationTargetException e4){
          throw Reflect$JavaApiWrapper.newException(e4, Reflect$JavaApiWrapper.forName1, ClassNotFoundException.class);
       }
       throw new RuntimeException(e4);
    }
    public static Class forName(String p0,boolean p1,ClassLoader p2){
       try{
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2};
          return Reflect$JavaApiWrapper.forName2.invoke(null, objArray);
       }catch(java.lang.IllegalAccessException e4){
       }catch(java.lang.IllegalArgumentException e4){
       }catch(java.lang.reflect.InvocationTargetException e4){
          throw Reflect$JavaApiWrapper.newException(e4, Reflect$JavaApiWrapper.forName2, ClassNotFoundException.class);
       }
       throw new RuntimeException(e4);
    }
    public static Constructor getConstructor(Class p0,Class[] p1){
       try{
          Object[] objArray = new Object[]{p1};
          return Reflect$JavaApiWrapper.getConstructor.invoke(p0, objArray);
       }catch(java.lang.IllegalAccessException e3){
       }catch(java.lang.IllegalArgumentException e3){
       }catch(java.lang.reflect.InvocationTargetException e3){
          throw Reflect$JavaApiWrapper.newException(e3, Reflect$JavaApiWrapper.getConstructor, NoSuchMethodException.class);
       }
       throw new RuntimeException(e3);
    }
    public static Constructor[] getConstructors(Class p0){
       try{
          Object[] objArray = new Object[0];
          return Reflect$JavaApiWrapper.getConstructors.invoke(p0, objArray);
       }catch(java.lang.IllegalAccessException e2){
       }catch(java.lang.IllegalArgumentException e2){
       }catch(java.lang.Exception e2){
          throw new RuntimeException(e2);
       }
       throw new RuntimeException(e2);
    }
    public static Constructor getDeclaredConstructor(Class p0,Class[] p1){
       try{
          Object[] objArray = new Object[]{p1};
          return Reflect$JavaApiWrapper.getDeclaredConstructor.invoke(p0, objArray);
       }catch(java.lang.IllegalAccessException e3){
       }catch(java.lang.IllegalArgumentException e3){
       }catch(java.lang.reflect.InvocationTargetException e3){
          throw Reflect$JavaApiWrapper.newException(e3, Reflect$JavaApiWrapper.getDeclaredConstructor, NoSuchMethodException.class);
       }
       throw new RuntimeException(e3);
    }
    public static Constructor[] getDeclaredConstructors(Class p0){
       try{
          Object[] objArray = new Object[0];
          return Reflect$JavaApiWrapper.getDeclaredConstructors.invoke(p0, objArray);
       }catch(java.lang.Exception e2){
          throw new RuntimeException(e2);
       }
    }
    public static Field getDeclaredField(Class p0,String p1){
       try{
          Object[] objArray = new Object[]{p1};
          return Reflect$JavaApiWrapper.getDeclaredField.invoke(p0, objArray);
       }catch(java.lang.IllegalAccessException e3){
       }catch(java.lang.IllegalArgumentException e3){
       }catch(java.lang.reflect.InvocationTargetException e3){
          throw Reflect$JavaApiWrapper.newException(e3, Reflect$JavaApiWrapper.getDeclaredField, NoSuchFieldException.class);
       }
       throw new RuntimeException(e3);
    }
    public static Field[] getDeclaredFields(Class p0){
       try{
          Object[] objArray = new Object[0];
          return Reflect$JavaApiWrapper.getDeclaredFields.invoke(p0, objArray);
       }catch(java.lang.IllegalAccessException e2){
       }catch(java.lang.IllegalArgumentException e2){
       }catch(java.lang.Exception e2){
          throw new RuntimeException(e2);
       }
       throw new RuntimeException(e2);
    }
    public static Method getDeclaredMethod(Class p0,String p1,Class[] p2){
       try{
          Object[] objArray = new Object[]{p1,p2};
          return Reflect$JavaApiWrapper.getDeclaredMethod.invoke(p0, objArray);
       }catch(java.lang.IllegalAccessException e3){
       }catch(java.lang.IllegalArgumentException e3){
       }catch(java.lang.reflect.InvocationTargetException e3){
          throw Reflect$JavaApiWrapper.newException(e3, Reflect$JavaApiWrapper.getDeclaredMethod, NoSuchMethodException.class);
       }
       throw new RuntimeException(e3);
    }
    public static Method[] getDeclaredMethods(Class p0){
       try{
          Object[] objArray = new Object[0];
          return Reflect$JavaApiWrapper.getDeclaredMethods.invoke(p0, objArray);
       }catch(java.lang.IllegalAccessException e2){
       }catch(java.lang.IllegalArgumentException e2){
       }catch(java.lang.Exception e2){
          throw new RuntimeException(e2);
       }
       throw new RuntimeException(e2);
    }
    public static Field getField(Class p0,String p1){
       try{
          Object[] objArray = new Object[]{p1};
          return Reflect$JavaApiWrapper.getField.invoke(p0, objArray);
       }catch(java.lang.IllegalAccessException e3){
       }catch(java.lang.IllegalArgumentException e3){
       }catch(java.lang.reflect.InvocationTargetException e3){
          throw Reflect$JavaApiWrapper.newException(e3, Reflect$JavaApiWrapper.getField, NoSuchFieldException.class);
       }
       throw new RuntimeException(e3);
    }
    public static Field[] getFields(Class p0){
       try{
          Object[] objArray = new Object[0];
          return Reflect$JavaApiWrapper.getFields.invoke(p0, objArray);
       }catch(java.lang.IllegalAccessException e2){
       }catch(java.lang.IllegalArgumentException e2){
       }catch(java.lang.Exception e2){
          throw new RuntimeException(e2);
       }
       throw new RuntimeException(e2);
    }
    public static Method getMethod(Class p0,String p1,Class[] p2){
       try{
          Object[] objArray = new Object[]{p1,p2};
          return Reflect$JavaApiWrapper.getMethod.invoke(p0, objArray);
       }catch(java.lang.IllegalAccessException e3){
       }catch(java.lang.IllegalArgumentException e3){
       }catch(java.lang.reflect.InvocationTargetException e3){
          throw Reflect$JavaApiWrapper.newException(e3, Reflect$JavaApiWrapper.getMethod, NoSuchMethodException.class);
       }
       throw new RuntimeException(e3);
    }
    public static Method[] getMethods(Class p0){
       try{
          Object[] objArray = new Object[0];
          return Reflect$JavaApiWrapper.getMethods.invoke(p0, objArray);
       }catch(java.lang.IllegalAccessException e2){
       }catch(java.lang.IllegalArgumentException e2){
       }catch(java.lang.Exception e2){
          throw new RuntimeException(e2);
       }
       throw new RuntimeException(e2);
    }
    public static Exception newException(InvocationTargetException p0,Method p1,Class p2){
       try{
          Throwable tarException = p0.getTargetException();
          if (tarException instanceof ClassNotFoundException) {
             return tarException;
          }
          if (tarException instanceof NoSuchFieldException) {
             return tarException;
          }
          if (tarException instanceof NoSuchMethodException) {
             return tarException;
          }
          if (tarException instanceof SecurityException) {
             return tarException;
          }
          if (tarException instanceof RuntimeException) {
             throw tarException;
          }
          throw new RuntimeException(tarException);
       }catch(java.lang.RuntimeException e0){
          throw e0;
       }catch(java.lang.Exception e0){
          throw new RuntimeException(e0);
       }
    }
}
