package com.kwai.robust.NativeHelper;
import java.lang.String;
import java.lang.System;
import java.lang.Object;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;

public class NativeHelper	// class@0013eb
{

    static {
       System.loadLibrary("robust");
    }
    public void NativeHelper(){
       super();
    }
    public static Object InvokeNonVirtual(Class p0,Method p1,Object p2,Object[] p3){
       try{
          return NativeHelper.nativeInvokeNonVirtual(p0, p1, p2, p3);
       }catch(java.lang.reflect.InvocationTargetException e0){
          Throwable tarException = e0.getTargetException();
          if (tarException != null) {
             throw tarException;
          }
          throw e0;
       }
    }
    public static Object InvokeNonVirtual(Method p0,Object p1,Object[] p2){
       return NativeHelper.InvokeNonVirtual(p0.getDeclaringClass(), p0, p1, p2);
    }
    public static native Object nativeInvokeNonVirtual(Class p0,Method p1,Object p2,Object[] p3);
}
