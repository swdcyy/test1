package com.frog.engine.utils.JavaCalls;
import java.util.HashMap;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Byte;
import java.lang.Character;
import java.lang.Short;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Long;
import java.lang.Double;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Throwable;
import java.lang.RuntimeException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.lang.NoSuchMethodException;
import java.lang.reflect.Field;
import java.lang.NoSuchFieldException;
import com.frog.engine.utils.JavaCalls$JavaParam;
import java.lang.reflect.Constructor;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class JavaCalls	// class@001572
{
    public static final Map PRIMITIVE_MAP;

    static {
       HashMap hashMap = new HashMap();
       JavaCalls.PRIMITIVE_MAP = hashMap;
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
    public void JavaCalls(){
       super();
    }
    public static Object callMethod(Object p0,String p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, JavaCalls.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JavaCalls.callMethodOrThrow(p0, p1, p2);
    }
    public static Object callMethodOrThrow(Object p0,String p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, JavaCalls.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JavaCalls.getDeclaredMethod(p0.getClass(), p1, JavaCalls.getParameterTypes(p2)).invoke(p0, JavaCalls.getParameters(p2));
    }
    public static Object callStaticMethod(String p0,String p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, JavaCalls.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JavaCalls.callStaticMethodOrThrow(Class.forName(p0), p1, p2);
    }
    public static Object callStaticMethodOrThrow(Class p0,String p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, JavaCalls.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JavaCalls.getDeclaredMethod(p0, p1, JavaCalls.getParameterTypes(p2)).invoke(null, JavaCalls.getParameters(p2));
    }
    public static Object callStaticMethodOrThrow(String p0,String p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, JavaCalls.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JavaCalls.callStaticMethodOrThrow(Class.forName(p0), p1, p2);
    }
    public static boolean compareClassLists(Class[] p0,Class[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, JavaCalls.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == null) {
          if (p1 != null && p1.length) {
             b = false;
          }
          return b;
       }else if(p1 == null){
          if (p0.length) {
             b = false;
          }
          return b;
       }else if(p0.length != p1.length){
          return false;
       }else {
          int i = 0;
          while (true) {
             if (i >= p0.length) {
                return b;
             }
             if (!p0[i].isAssignableFrom(p1[i])) {
                Map pRIMITIVE_MA = JavaCalls.PRIMITIVE_MAP;
                if (!pRIMITIVE_MA.containsKey(p0[i]) || !pRIMITIVE_MA.get(p0[i]).equals(pRIMITIVE_MA.get(p1[i]))) {
                   break ;
                }
             }
             i = i + 1;
          }
          return false;
       }
    }
    public static Method findMethodByName(Method[] p0,String p1,Class[] p2){
       object oobject;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, JavaCalls.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p1, "Method name must not be null.");
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return null;
          }
          oobject = p0[i];
          if ((oobject.getName()).equals(p1) && JavaCalls.compareClassLists(oobject.getParameterTypes(), p2)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static Method getDeclaredMethod(Class p0,String p1,Class[] p2){
       Method obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, JavaCalls.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = JavaCalls.findMethodByName(p0.getDeclaredMethods(), p1, p2);
       if (obj == null) {
          if (p0.getSuperclass() != null) {
             return JavaCalls.getDeclaredMethod(p0.getSuperclass(), p1, p2);
          }
          throw new NoSuchMethodException();
       }else {
          obj.setAccessible(true);
          return obj;
       }
    }
    public static Object getDefaultValue(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JavaCalls.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!Integer.TYPE.equals(p0) && (!Integer.class.equals(p0) && (!Byte.TYPE.equals(p0) && (!Byte.class.equals(p0) && (!Short.TYPE.equals(p0) && (!Short.class.equals(p0) && (!Long.TYPE.equals(p0) && (!Long.class.equals(p0) && (!Double.TYPE.equals(p0) && (!Double.class.equals(p0) && (Float.TYPE.equals(p0) || Float.class.equals(p0)))))))))))) {
          return Integer.valueOf(0);
       }
       if (Boolean.TYPE.equals(p0) || Boolean.class.equals(p0)) {
          return Boolean.FALSE;
       }
       if (Character.TYPE.equals(p0) || Character.class.equals(p0)) {
          return Character.valueOf(0);
       }
       return null;
    }
    public static Object getField(Object p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, JavaCalls.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JavaCalls.getFieldOrThrow(p0, p1);
    }
    public static Object getFieldOrThrow(Object p0,String p1){
       Field uField = null;
       Class obj = PatchProxy.applyTwoRefs(p0, p1, uField, JavaCalls.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getClass();
       while (true) {
          if (uField == null) {
             try{
                uField = obj.getDeclaredField(p1);
                uField.setAccessible(true);
             }catch(java.lang.NoSuchFieldException e0){
                obj = e0.getSuperclass();
             }
          }else {
             uField.setAccessible(true);
             return uField.get(p0);
          }
       }
       throw new NoSuchFieldException();
    }
    public static Class[] getParameterTypes(Object[] p0){
       Class uClass;
       Class[] uClassArray = null;
       Class[] obj = PatchProxy.applyOneRefs(p0, uClassArray, JavaCalls.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.length > 0) {
          obj = new Class[p0.length];
          int i = 0;
          while (i < p0.length) {
             object oobject = p0[i];
             if (oobject != null && oobject instanceof JavaCalls$JavaParam) {
                obj[i] = oobject.clazz;
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
    public static Object[] getParameters(Object[] p0){
       Object[] objArray;
       if (p0 != null && p0.length > 0) {
          objArray = new Object[p0.length];
          int i = 0;
          while (i < p0.length) {
             object oobject = p0[i];
             objArray[i] = (oobject != null && oobject instanceof JavaCalls$JavaParam)? oobject.obj: oobject;
             i = i + 1;
          }
       }else {
          objArray = null;
       }
       return objArray;
    }
    public static Object getStaticField(Class p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, JavaCalls.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JavaCalls.getStaticFieldOrThrow(p0, p1);
    }
    public static Object getStaticField(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, JavaCalls.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JavaCalls.getStaticFieldOrThrow(p0, p1);
    }
    public static Object getStaticFieldOrThrow(Class p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, JavaCalls.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Field declaredFiel = p0.getDeclaredField(p1);
       declaredFiel.setAccessible(true);
       return declaredFiel.get(null);
    }
    public static Object getStaticFieldOrThrow(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, JavaCalls.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JavaCalls.getStaticFieldOrThrow(Class.forName(p0), p1);
    }
    public static Object newEmptyInstance(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JavaCalls.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JavaCalls.newEmptyInstanceOrThrow(p0);
    }
    public static Object newEmptyInstanceOrThrow(Class p0){
       Constructor[] obj = PatchProxy.applyOneRefs(p0, null, JavaCalls.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getDeclaredConstructors();
       if (obj == null || !obj.length) {
          throw new IllegalArgumentException("Can\'t get even one available constructor for "+p0);
       }
       int i = 0;
       object oobject = obj[i];
       oobject.setAccessible(true);
       Class[] parameterTyp = oobject.getParameterTypes();
       if (parameterTyp == null || !parameterTyp.length) {
          Object[] objArray = new Object[i];
          return oobject.newInstance(objArray);
       }else {
          Object[] objArray1 = new Object[parameterTyp.length];
          for (; i < parameterTyp.length; i++) {
             objArray1[i] = JavaCalls.getDefaultValue(parameterTyp[i]);
          }
          return oobject.newInstance(objArray1);
       }
    }
    public static Object newInstance(Class p0,Object[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, JavaCalls.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JavaCalls.newInstanceOrThrow(p0, p1);
    }
    public static Object newInstance(String p0,Object[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, JavaCalls.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JavaCalls.newInstanceOrThrow(p0, p1);
    }
    public static Object newInstanceOrThrow(Class p0,Object[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, JavaCalls.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getConstructor(JavaCalls.getParameterTypes(p1)).newInstance(JavaCalls.getParameters(p1));
    }
    public static Object newInstanceOrThrow(String p0,Object[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, JavaCalls.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JavaCalls.newInstanceOrThrow(Class.forName(p0), JavaCalls.getParameters(p1));
    }
    public static void setField(Object p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, JavaCalls.class, "3")) {
          return;
       }
       JavaCalls.setFieldOrThrow(p0, p1, p2);
       return;
    }
    public static void setFieldOrThrow(Object p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, JavaCalls.class, "4")) {
          return;
       }
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
             return;
          }
       }
       throw new NoSuchFieldException();
    }
    public static void setStaticField(Class p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, JavaCalls.class, "5")) {
          return;
       }
       JavaCalls.setStaticFieldOrThrow(p0, p1, p2);
       return;
    }
    public static void setStaticFieldOrThrow(Class p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, JavaCalls.class, "6")) {
          return;
       }
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
             return;
          }
       }
       throw new NoSuchFieldException();
    }
    public static RuntimeException wrapToRuntime(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JavaCalls.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof RuntimeException) {
          return p0;
       }
       return new RuntimeException(p0);
    }
}
