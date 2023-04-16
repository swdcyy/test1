package com.kwai.performance.stability.hack.a;
import java.util.HashMap;
import java.lang.Boolean;
import java.lang.Object;
import java.util.Map;
import java.lang.Byte;
import java.lang.Character;
import java.lang.Short;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Long;
import java.lang.Double;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Throwable;
import java.lang.RuntimeException;
import java.util.Objects;
import java.lang.NoSuchMethodException;
import java.lang.reflect.Field;
import java.lang.NoSuchFieldException;
import com.kwai.performance.stability.hack.a$a;

public class a	// class@001222
{
    public static final Map a;

    static {
       HashMap hashMap = new HashMap();
       a.a = hashMap;
       Class tYPE = Boolean.TYPE;
       hashMap.put(Boolean.class, tYPE);
       hashMap.put(Byte.class, Byte.TYPE);
       hashMap.put(Character.class, Character.TYPE);
       hashMap.put(Short.class, Short.TYPE);
       Class tYPE1 = Integer.TYPE;
       hashMap.put(Integer.class, tYPE1);
       Class tYPE2 = Float.TYPE;
       hashMap.put(Float.class, tYPE2);
       Class tYPE3 = Long.TYPE;
       hashMap.put(Long.class, tYPE3);
       hashMap.put(Double.class, Double.TYPE);
       hashMap.put(tYPE, tYPE);
       hashMap.put(Byte.TYPE, Byte.TYPE);
       hashMap.put(Character.TYPE, Character.TYPE);
       hashMap.put(Short.TYPE, Short.TYPE);
       hashMap.put(tYPE1, tYPE1);
       hashMap.put(tYPE2, tYPE2);
       hashMap.put(tYPE3, tYPE3);
       hashMap.put(Double.TYPE, Double.TYPE);
    }
    public static Object a(Object p0,String p1,Object[] p2){
       return a.b(p0.getClass(), p1, a.d(p2)).invoke(p0, a.e(p2));
    }
    public static Method b(Class p0,String p1,Class[] p2){
       object oobject;
       String str;
       Map a;
       Method[] declaredMeth = p0.getDeclaredMethods();
       Objects.requireNonNull(p1, "Method name must not be null.");
       int len = declaredMeth.length;
       int i = 0;
       while (true) {
          if (i < len) {
             oobject = declaredMeth[i];
             if ((oobject.getName()).equals(p1)) {
                Class[] parameterTyp = oobject.getParameterTypes();
                if (parameterTyp == null) {
                   if (p2 == null || !p2.length) {
                   label_0063 :
                      str = 1;
                   }
                }else if(p2 == null){
                   if (!parameterTyp.length) {
                      goto label_0063 ;
                   }
                }else if(parameterTyp.length != p2.length){
                   int i1 = 0;
                   while (true) {
                      if (i1 < parameterTyp.length) {
                         if (!parameterTyp[i1].isAssignableFrom(p2[i1])) {
                            a = a.a;
                            if (a.containsKey(parameterTyp[i1]) && a.get(parameterTyp[i1]).equals(a.get(p2[i1]))) {
                            }
                         }else {
                         }
                      }else {
                         goto label_0063 ;
                      }
                   }
                   if (str) {
                   label_006b :
                      if (oobject == null) {
                         if (p0.getSuperclass() != null) {
                         }else {
                            throw new NoSuchMethodException();
                         }
                      }else {
                         oobject.setAccessible(true);
                         return oobject;
                      }
                   }
                }
                str = null;
                goto label_0064 ;
             }
             i = i + 1;
          }else {
             oobject = null;
             goto label_006b ;
          }
       }
       return a.b(p0.getSuperclass(), p1, p2);
    }
    public static Object c(Object p0,String p1){
       Class class = p0.getClass();
       Field uField = null;
       while (true) {
          if (uField == null) {
             try{
                uField = class.getDeclaredField(p1);
                uField.setAccessible(true);
             }catch(java.lang.NoSuchFieldException e0){
                class = e0.getSuperclass();
             }
          }else {
             uField.setAccessible(true);
             return uField.get(p0);
          }
       }
       throw new NoSuchFieldException();
    }
    public static Class[] d(Object[] p0){
       Class[] uClassArray = null;
       if (p0 != null && p0.length > 0) {
          Class[] uClassArray1 = new Class[p0.length];
          int i = 0;
          while (i < p0.length) {
             object oobject = p0[i];
             if (oobject != null && oobject instanceof a$a) {
                uClassArray1[i] = oobject.a;
             }else if(oobject == null){
                oobject = uClassArray;
             }else {
                Class class = oobject.getClass();
             }
             uClassArray1[i] = oobject;
             i = i + 1;
          }
          uClassArray = uClassArray1;
       }
       return uClassArray;
    }
    public static Object[] e(Object[] p0){
       Object[] objArray;
       if (p0 != null && p0.length > 0) {
          objArray = new Object[p0.length];
          int i = 0;
          while (i < p0.length) {
             object oobject = p0[i];
             objArray[i] = (oobject != null && oobject instanceof a$a)? oobject.b: oobject;
             i = i + 1;
          }
       }else {
          objArray = null;
       }
       return objArray;
    }
    public static RuntimeException f(Throwable p0){
       if (p0 instanceof RuntimeException) {
          return p0;
       }
       return new RuntimeException(p0);
    }
}
