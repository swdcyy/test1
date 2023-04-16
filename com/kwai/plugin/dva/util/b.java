package com.kwai.plugin.dva.util.b;
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
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.reflect.Method;
import java.lang.Throwable;
import java.lang.RuntimeException;
import java.lang.reflect.Constructor;
import java.lang.NoSuchMethodException;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Arrays;
import java.lang.reflect.Field;
import java.lang.NoSuchFieldException;
import java.util.Objects;
import com.kwai.plugin.dva.util.b$a;

public class b	// class@000ebb
{
    public static final Map a;

    static {
       HashMap hashMap = new HashMap();
       b.a = hashMap;
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
    public void b(){
       super();
    }
    public static Object a(Object p0,String p1,Object[] p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "9");
       if (obj == patchProxyRe) {
          obj = b.g(p0.getClass(), p1, b.k(p2)).invoke(p0, b.l(p2));
       }
       return obj;
    }
    public static Object b(String p0,String p1,Object[] p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       Class uClass = Class.forName(p0);
       obj = PatchProxy.applyThreeRefs(uClass, p1, p2, null, b.class, "11");
       if (obj == patchProxyRe) {
          obj = b.g(uClass, p1, b.k(p2)).invoke(null, b.l(p2));
       }
       return obj;
    }
    public static Constructor c(Class p0,Class[] p1){
       Constructor obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          try{
             obj = p0.getDeclaredConstructor(p1);
             if (!obj.isAccessible()) {
                obj.setAccessible(true);
             }
             return obj;
          }catch(java.lang.NoSuchMethodException e0){
             p0 = p0.getSuperclass();
             goto label_0010 ;
          }
       }else {
          throw new NoSuchMethodException("Constructor with parameters "+Arrays.asList(p1)+" not found in "+p0);
       }
    }
    public static Field d(Class p0,String p1){
       Class obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0;
    label_0011 :
       if (obj == null) {
          throw new NoSuchFieldException("Field "+p1+" not found in "+p0);
       }
       try{
          Field declaredFiel = obj.getDeclaredField(p1);
          if (!declaredFiel.isAccessible()) {
             declaredFiel.setAccessible(true);
          }
          return declaredFiel;
       }catch(java.lang.NoSuchFieldException e0){
          obj = e0.getSuperclass();
          goto label_0011 ;
       }
    }
    public static Field e(Object p0,String p1){
       Class obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "27");
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
       }catch(java.lang.Exception e0){
          obj = e0.getSuperclass();
          goto label_0014 ;
       }
    }
    public static Method f(Class p0,String p1,Class[] p2){
       Method obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          try{
             obj = p0.getDeclaredMethod(p1, p2);
             if (!obj.isAccessible()) {
                obj.setAccessible(true);
             }
             return obj;
          }catch(java.lang.NoSuchMethodException e0){
             p0 = p0.getSuperclass();
             goto label_0013 ;
          }
       }else {
          throw new NoSuchMethodException("Method "+p1+" with parameters "+Arrays.asList(p2)+" not found in "+p0);
       }
    }
    public static Method g(Class p0,String p1,Class[] p2){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Method[] obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "13");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p0.getDeclaredMethods();
       object oobject = PatchProxy.applyThreeRefs(obj, p1, p2, null, b.class, "14");
       if (oobject != patchProxyRe) {
       }else {
          Objects.requireNonNull(p1, "Method name must not be null.");
          int len = obj.length;
          int i = 0;
          while (true) {
             Object obj1 = null;
             if (i < len) {
                object oobject1 = obj[i];
                if ((oobject1.getName()).equals(p1)) {
                   Class[] parameterTyp = oobject1.getParameterTypes();
                   obj1 = PatchProxy.applyTwoRefs(parameterTyp, p2, obj1, b.class, "15");
                   if (obj1 != patchProxyRe) {
                      b = obj1.booleanValue();
                   }else if(parameterTyp == null){
                      if (p2 == null || !p2.length) {
                      label_009a :
                         b = true;
                      }
                   }else if(p2 == null){
                      if (!parameterTyp.length) {
                         goto label_009a ;
                      }
                   }else if(parameterTyp.length != p2.length){
                      b = 0;
                      while (true) {
                         if (b < parameterTyp.length) {
                            if (!parameterTyp[b].isAssignableFrom(p2[b])) {
                               Map a = b.a;
                               if (a.containsKey(parameterTyp[b]) && a.get(parameterTyp[b]).equals(a.get(p2[b]))) {
                               }
                            }else {
                            }
                         }else {
                            goto label_009a ;
                         }
                      }
                   }
                   b = false;
                   if (b) {
                      oobject = oobject1;
                   }
                }
                i = i + 1;
             }else {
                oobject = obj1;
             }
          }
          return b.g(p0.getSuperclass(), p1, p2);
       }
       if (oobject == null) {
          if (p0.getSuperclass() != null) {
             goto label_00ab ;
          }else {
             throw new NoSuchMethodException();
          }
       }else {
          oobject.setAccessible(true);
          return oobject;
       }
    }
    public static Object h(Object p0,String p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Field uField = null;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, uField, uob, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, uField, uob, "3");
       if (obj1 == patchProxyRe) {
          Class class = p0.getClass();
          while (true) {
             b = true;
             if (uField == null) {
                try{
                   uField = class.getDeclaredField(p1);
                   uField.setAccessible(b);
                }catch(java.lang.NoSuchFieldException e0){
                   class = e0.getSuperclass();
                }
             }else {
                uField.setAccessible(b);
                obj1 = uField.get(p0);
                break ;
             }
          }
       }
       return obj1;
    }
    public static Field i(Object p0,String p1){
       Class obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "2");
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
          Field declaredFiel1 = Field.class.getDeclaredField("modifiers");
          declaredFiel1.setAccessible(true);
          int i = declaredFiel.getModifiers() & 0xef;
          declaredFiel1.setInt(declaredFiel, i);
          if (!declaredFiel.isAccessible()) {
             declaredFiel.setAccessible(true);
          }
          return declaredFiel;
       }catch(java.lang.Exception e0){
          obj = e0.getSuperclass();
          goto label_0014 ;
       }
    }
    public static Method j(Object p0,String p1,Class[] p2){
       Class obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, b.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getClass();
    label_0017 :
       if (obj == null) {
          throw new NoSuchMethodException("Method "+p1+" with parameters "+Arrays.asList(p2)+" not found in "+p0.getClass());
       }
       try{
          Method declaredMeth = obj.getDeclaredMethod(p1, p2);
          if (!declaredMeth.isAccessible()) {
             declaredMeth.setAccessible(true);
          }
          return declaredMeth;
       }catch(java.lang.NoSuchMethodException e0){
          obj = e0.getSuperclass();
          goto label_0017 ;
       }
    }
    public static Class[] k(Object[] p0){
       Class uClass;
       Class[] uClassArray = null;
       Class[] obj = PatchProxy.applyOneRefs(p0, uClassArray, b.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.length > 0) {
          obj = new Class[p0.length];
          int i = 0;
          while (i < p0.length) {
             object oobject = p0[i];
             if (oobject != null && oobject instanceof b$a) {
                obj[i] = oobject.a;
             }else if(oobject == null){
                uClass = uClassArray;
             }else {
                uClass = oobject.getClass();
             }
             obj[i] = uClass;
             i = i + 1;
          }
          uClassArray = obj;
       }
       return uClassArray;
    }
    public static Object[] l(Object[] p0){
       Object[] objArray;
       if (p0 != null && p0.length > 0) {
          objArray = new Object[p0.length];
          int i = 0;
          while (i < p0.length) {
             object oobject = p0[i];
             objArray[i] = (oobject != null && oobject instanceof b$a)? oobject.b: oobject;
             i = i + 1;
          }
       }else {
          objArray = null;
       }
       return objArray;
    }
    public static void m(Object p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "4")) {
          return;
       }
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "5")) {
          Class class = p0.getClass();
          Field uField = null;
          while (true) {
             if (uField == null) {
                try{
                   uField = class.getDeclaredField(p1);
                }catch(java.lang.NoSuchFieldException e0){
                   class = e0.getSuperclass();
                }
             }else {
                uField.setAccessible(true);
                uField.set(p0, p2);
                break ;
             }
          }
       }
       return;
    }
    public static void n(Class p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "6")) {
          return;
       }
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "7")) {
          Field uField = null;
          while (true) {
             if (uField == null) {
                try{
                   uField = p0.getDeclaredField(p1);
                }catch(java.lang.NoSuchFieldException e0){
                   p0 = p0.getSuperclass();
                }
             }else {
                uField.setAccessible(true);
                uField.set(null, p2);
                break ;
             }
          }
       }
       return;
    }
    public static RuntimeException o(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof RuntimeException) {
          return p0;
       }
       return new RuntimeException(p0);
    }
}
