package com.kwai.robust.IRRuntime;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Exception;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.util.NoSuchElementException;
import java.lang.reflect.Method;
import java.util.Arrays;
import com.kwai.robust.NativeHelper;
import java.lang.reflect.InvocationTargetException;
import java.lang.NoSuchMethodException;
import java.lang.StringBuilder;
import java.lang.reflect.Constructor;

public class IRRuntime	// class@0013ea
{
    public static final String FIELD_NAME_sIsThrowable = "sIsThrowable";
    public static final String FIELD_NAME_sLog = "sLog";
    public static boolean sIsThrowable = true;
    public static boolean sLog;

    public void IRRuntime(){
       super();
    }
    public static Object getField(Object p0,Class p1,String p2,Class p3,Object p4){
       try{
          return IRRuntime.getField(p1, p2, p3).get(p0);
       }catch(java.lang.Exception e4){
          if (IRRuntime.sLog) {
             e4.printStackTrace();
          }
          if (!IRRuntime.sIsThrowable) {
             return null;
          }else {
             p4 = new Object[]{p0,p1,p2};
             throw new RuntimeException(String.format("getField receiver:%s, targetClass:%s, fieldName:%s", p4), e4);
          }
       }
    }
    public static Field getField(Class p0,String p1,Class p2){
       Field fieldByName = IRRuntime.getFieldByName(p0, p1, p2);
       if (fieldByName == null) {
          throw new RuntimeException(new NoSuchElementException(p1));
       }
       fieldByName.setAccessible(true);
       return fieldByName;
    }
    public static Field getFieldByName(Class p0,String p1,Class p2){
       if (p0 != null) {
          return p0.getDeclaredField(p1);
       }
       return null;
    }
    public static Method getMethodByName(Class p0,String p1,Class[] p2,Class p3,Class p4){
       object oobject;
       if (p0 == null) {
          return null;
       }
       while (true) {
          if (p0 == null) {
             return null;
          }
          Method[] declaredMeth = p0.getDeclaredMethods();
          int len = declaredMeth.length;
          int i = 0;
          while (true) {
             if (i < len) {
                oobject = declaredMeth[i];
                if ((oobject.getName()).equals(p1) && (Arrays.equals(oobject.getParameterTypes(), p2) && oobject.getReturnType() == p3)) {
                   break ;
                }else {
                   i = i + 1;
                }
             }else {
                p0 = p0.getSuperclass();
             }
          }
          oobject.setAccessible(true);
          return oobject;
       }
    }
    public static Object getStaticField(Class p0,String p1,Class p2,Object p3){
       return IRRuntime.getField(null, p0, p1, p2, p3);
    }
    public static Object invokeInterfaceMethod(Object p0,Object[] p1,Class[] p2,String p3,Class p4,Class p5,Object p6){
       return IRRuntime.invokeVirtualMethod(p0, p1, p2, p3, p4, p5, p6);
    }
    public static Object invokeNonVirtualMethod(Object p0,Object[] p1,Class[] p2,String p3,Class p4,Class p5,Object p6){
       boolean b = true;
       try{
          Method methodByName = IRRuntime.getMethodByName(p5, p3, p2, p4, p5);
          if (!methodByName.isAccessible()) {
             methodByName.setAccessible(b);
          }
          if (p1 == null) {
             p1 = new Object[0];
          }
          return NativeHelper.InvokeNonVirtual(methodByName, p0, p1);
       }catch(java.lang.reflect.InvocationTargetException e1){
          throw e1.getCause();
       }
    }
    public static Object invokeSpecialMethod(Object p0,Object[] p1,Class[] p2,String p3,Class p4,Class p5,Object p6){
       return IRRuntime.invokeVirtualMethod(p0, p1, p2, p3, p4, p5, p6);
    }
    public static Object invokeStaticMethod(Object[] p0,Class[] p1,String p2,Class p3,Class p4,Object p5){
       p5 = null;
       try{
          Method methodByName = IRRuntime.getMethodByName(p4, p2, p1, p3, p4);
          if (methodByName != null) {
             return methodByName.invoke(p5, p0);
          }
          throw new RuntimeException(new NoSuchMethodException(p2+" in class "+p4.getName()));
       }catch(java.lang.reflect.InvocationTargetException e3){
          throw e3.getCause();
       }
    }
    public static Object invokeVirtualMethod(Object p0,Object[] p1,Class[] p2,String p3,Class p4,Class p5,Object p6){
       try{
          Method methodByName = IRRuntime.getMethodByName(p0.getClass(), p3, p2, p4, p5);
          if (methodByName != null) {
             return methodByName.invoke(p0, p1);
          }
          throw new RuntimeException(new NoSuchMethodException(p3));
       }catch(java.lang.reflect.InvocationTargetException e0){
          throw e0.getCause();
       }
    }
    public static Object newForClass(Object[] p0,Class[] p1,Class p2){
       try{
          Constructor declaredCons = p2.getDeclaredConstructor(p1);
          try{
             declaredCons.setAccessible(true);
             return p2.cast(declaredCons.newInstance(p0));
          }catch(java.lang.reflect.InvocationTargetException e4){
             throw e4.getCause();
          }
       }catch(java.lang.NoSuchMethodException e4){
          throw new RuntimeException(e4);
       }
    }
    public static void setField(Object p0,Object p1,Class p2,String p3,Class p4,Object p5){
       boolean b = true;
       try{
          Field field = IRRuntime.getField(p2, p3, p4);
          field.setAccessible(b);
          field.set(p0, p1);
       }catch(java.lang.Exception e6){
          if (IRRuntime.sLog) {
             e6.printStackTrace();
          }
          if (!IRRuntime.sIsThrowable) {
          }else {
             Object[] objArray = new Object[4];
             objArray[0] = p0;
             objArray[b] = p1;
             objArray[2] = p2;
             objArray[3] = p3;
             throw new RuntimeException(String.format("setField receiver:%s, value:%s, targetClass:%s, fieldName:%s", objArray), e6);
          }
       }
       return;
    }
    public static void setStaticField(Object p0,Class p1,String p2,Class p3,Object p4){
       IRRuntime.setField(null, p0, p1, p2, p3, p4);
    }
}
