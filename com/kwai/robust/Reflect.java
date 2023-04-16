package com.kwai.robust.Reflect;
import java.lang.Class;
import java.lang.Object;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.String;
import com.kwai.robust.Reflect$JavaApiWrapper;
import com.kwai.robust.Reflect$ReflectException;
import java.lang.Throwable;
import java.lang.ClassLoader;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Short;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Double;
import java.lang.Float;
import java.lang.Character;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.Void;
import java.lang.StringBuilder;
import com.kwai.robust.Reflect$b;
import java.util.Map;
import com.kwai.robust.Reflect$a;
import java.lang.System;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.NoSuchMethodException;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Arrays;

public class Reflect	// class@001400
{
    public final Object object;
    public final Class type;

    public void Reflect(Class p0){
       super(p0, p0);
    }
    public void Reflect(Class p0,Object p1){
       super();
       this.type = p0;
       this.object = p1;
    }
    public static AccessibleObject accessible(AccessibleObject p0){
       if (p0 == null) {
          return null;
       }
       if (p0 instanceof Member) {
          Member member = p0;
          if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
             return p0;
          }
       }
       if (!p0.isAccessible()) {
          p0.setAccessible(true);
       }
       return p0;
    }
    public static Class forName(String p0){
       try{
          return Reflect$JavaApiWrapper.forName(p0);
       }catch(java.lang.Exception e1){
          throw new Reflect$ReflectException(e1);
       }
    }
    public static Class forName(String p0,ClassLoader p1){
       boolean b = true;
       try{
          return Reflect$JavaApiWrapper.forName(p0, b, p1);
       }catch(java.lang.Exception e1){
          throw new Reflect$ReflectException(e1);
       }
    }
    public static Object initValue(Class p0){
       Boolean fALSE;
       if (p0 == Boolean.TYPE) {
          fALSE = Boolean.FALSE;
       }else if(p0 == Byte.TYPE){
          fALSE = Byte.valueOf(0);
       }else if(p0 == Short.TYPE){
          fALSE = Short.valueOf(0);
       }else if(p0 == Integer.TYPE){
          fALSE = Integer.valueOf(0);
       }else if(p0 == Long.TYPE){
          fALSE = Long.valueOf(0);
       }else if(p0 == Double.TYPE){
          fALSE = Double.valueOf(0);
       }else if(p0 == Float.TYPE){
          fALSE = Float.valueOf(0);
       }else if(p0 == Character.TYPE){
          fALSE = Character.valueOf(0);
       }else {
          fALSE = null;
       }
       return fALSE;
    }
    public static Reflect on(Class p0){
       return Reflect.onClass(p0);
    }
    public static Reflect on(Class p0,Object p1){
       return new Reflect(p0, p1);
    }
    public static Reflect on(Object p0){
       Class uClass = (p0 == null)? Object.class: p0.getClass();
       return new Reflect(uClass, p0);
    }
    public static Reflect on(String p0){
       return Reflect.onClass(p0);
    }
    public static Reflect on(String p0,ClassLoader p1){
       return Reflect.onClass(p0, p1);
    }
    public static Reflect on(Constructor p0,Object[] p1){
       try{
          return Reflect.on(p0.getDeclaringClass(), Reflect.accessible(p0).newInstance(p1));
       }catch(java.lang.Exception e1){
          throw new Reflect$ReflectException(e1);
       }
    }
    public static Reflect on(Method p0,Object p1,Object[] p2){
       try{
          Reflect.accessible(p0);
          if (p0.getReturnType() != Void.TYPE) {
             return Reflect.on(p0.invoke(p1, p2));
          }
          p0.invoke(p1, p2);
          return Reflect.on(p1);
       }catch(java.lang.Exception e2){
          throw new Reflect$ReflectException(e2);
       }
    }
    public static Reflect onClass(Class p0){
       return new Reflect(p0);
    }
    public static Reflect onClass(String p0){
       return Reflect.onClass(Reflect.forName(p0));
    }
    public static Reflect onClass(String p0,ClassLoader p1){
       return Reflect.onClass(Reflect.forName(p0, p1));
    }
    public static String property(String p0){
       int i = p0.length();
       if (!i) {
          return "";
       }
       if (i == 1) {
          return p0.toLowerCase();
       }
       return (p0.substring(0, 1)).toLowerCase()+p0.substring(1);
    }
    public static Class[] types(Object[] p0){
       int i = 0;
       if (p0 == null) {
          Class[] uClassArray = new Class[i];
          return uClassArray;
       }else {
          Class[] uClassArray1 = new Class[p0.length];
          for (; i < p0.length; i = i + 1) {
             object oobject = p0[i];
             Reflect$b uob = (oobject == null)? Reflect$b.class: oobject.getClass();
             uClassArray1[i] = uob;
          }
          return uClassArray1;
       }
    }
    public static Object unwrap(Object p0){
       if (p0 instanceof Reflect) {
          p0 = p0.get();
       }
       return p0;
    }
    public static Class wrapper(Class p0){
       Void void;
       if (p0 == null) {
          return null;
       }
       if (p0.isPrimitive()) {
          if (Boolean.TYPE == p0) {
             return Boolean.class;
          }else if(Integer.TYPE == p0){
             return Integer.class;
          }else if(Long.TYPE == p0){
             return Long.class;
          }else if(Short.TYPE == p0){
             return Short.class;
          }else if(Byte.TYPE == p0){
             return Byte.class;
          }else if(Double.TYPE == p0){
             return Double.class;
          }else if(Float.TYPE == p0){
             return Float.class;
          }else if(Character.TYPE == p0){
             return Character.class;
          }else if(Void.TYPE == p0){
             void = Void.class;
          }
       }
       return void;
    }
    public Object as(Class p0){
       Class[] uClassArray = new Class[0];
       return this.as(p0, uClassArray);
    }
    public Object as(Class p0,Class[] p1){
       Class[] uClassArray = new Class[(p1.length + 1)];
       uClassArray[0] = p0;
       System.arraycopy(p1, 0, uClassArray, 1, p1.length);
       return Proxy.newProxyInstance(p0.getClassLoader(), uClassArray, new Reflect$a(this, this.object instanceof Map));
    }
    public Reflect call(String p0){
       Object[] objArray = new Object[0];
       return this.call(p0, objArray);
    }
    public Reflect call(String p0,Class[] p1){
       Object[] objArray = new Object[0];
       return this.call(p0, p1, objArray);
    }
    public Reflect call(String p0,Class[] p1,Object[] p2){
       try{
          return Reflect.on(this.exactMethod(p0, p1), this.object, p2);
       }catch(java.lang.NoSuchMethodException e0){
          try{
             return Reflect.on(this.similarMethod(p0, p1), this.object, p2);
          }catch(java.lang.NoSuchMethodException e3){
             throw new Reflect$ReflectException(e3);
          }
       }
    }
    public Reflect call(String p0,Object[] p1){
       return this.call(p0, Reflect.types(p1), p1);
    }
    public Reflect create(){
       Object[] objArray = new Object[0];
       return this.create(objArray);
    }
    public Reflect create(Class[] p0,Object[] p1){
       try{
          return Reflect.on(Reflect$JavaApiWrapper.getDeclaredConstructor(this.type(), p0), p1);
       }catch(java.lang.NoSuchMethodException e0){
          Constructor[] declaredCons = Reflect$JavaApiWrapper.getDeclaredConstructors(this.type());
          int len = declaredCons.length;
          int i = 0;
       label_0018 :
          if (i >= len) {
             throw new Reflect$ReflectException(e0);
          }
          object oobject = declaredCons[i];
          if (this.match(oobject.getParameterTypes(), p0)) {
             return Reflect.on(oobject, p1);
          }
          i = i + 1;
          goto label_0018 ;
       }
    }
    public Reflect create(Object[] p0){
       return this.create(Reflect.types(p0), p0);
    }
    public boolean equals(Object p0){
       if (p0 instanceof Reflect) {
          return this.object.equals(p0.get());
       }
       return false;
    }
    public final Method exactMethod(String p0,Class[] p1){
       Class uClass = this.type();
       try{
          return Reflect$JavaApiWrapper.getMethod(uClass, p0, p1);
       }catch(java.lang.NoSuchMethodException e0){
          try{
             return Reflect$JavaApiWrapper.getDeclaredMethod(e0, p0, p1);
          }catch(java.lang.NoSuchMethodException e0){
             uClass = e0.getSuperclass();
             if (uClass != null) {
                return Reflect$JavaApiWrapper.getDeclaredMethod(e0, p0, p1);
             }
             throw new NoSuchMethodException();
          }
       }
    }
    public Reflect field(String p0){
       try{
          Field uField = this.field0(p0);
          uField.setAccessible(true);
          Class type = uField.getType();
          return Reflect.on(type, uField.get(this.object));
       }catch(java.lang.Exception e3){
          throw new Reflect$ReflectException(e3);
       }
    }
    public final Field field0(String p0){
       Class uClass = this.type();
       try{
          return Reflect.accessible(Reflect$JavaApiWrapper.getField(uClass, p0));
       }catch(java.lang.NoSuchFieldException e1){
          try{
          label_0010 :
             return Reflect.accessible(Reflect$JavaApiWrapper.getDeclaredField(uClass, p0));
          }catch(java.lang.NoSuchFieldException e0){
             uClass = e0.getSuperclass();
             if (uClass != null) {
             label_0010 :
                return Reflect.accessible(Reflect$JavaApiWrapper.getDeclaredField(uClass, p0));
             }
             throw new Reflect$ReflectException(e1);
          }
       }
    }
    public Map fields(){
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Class uClass = this.type();
       do {
          Field[] declaredFiel = Reflect$JavaApiWrapper.getDeclaredFields(uClass);
          int len = declaredFiel.length;
          int i = 0;
          while (i < len) {
             object oobject = declaredFiel[i];
             int i1 = (this.type != this.object)? 1: 0;
             i1 = i1 ^ Modifier.isStatic(oobject.getModifiers());
             if (i1) {
                String name = oobject.getName();
                if (!linkedHashMa.containsKey(name)) {
                   linkedHashMa.put(name, this.field(name));
                }
             }
             i = i + 1;
          }
          uClass = uClass.getSuperclass();
       } while (uClass == null);
       return linkedHashMa;
    }
    public Object get(){
       return this.object;
    }
    public Object get(String p0){
       return this.field(p0).get();
    }
    public int hashCode(){
       return this.object.hashCode();
    }
    public final boolean isSimilarSignature(Method p0,String p1,Class[] p2){
       boolean b = ((p0.getName()).equals(p1) && this.match(p0.getParameterTypes(), p2))? true: false;
       return b;
    }
    public final boolean match(Class[] p0,Class[] p1){
       if (p0.length != p1.length) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p1.length) {
             return true;
          }
          if (p1[i] == Reflect$b.class || Reflect.wrapper(p0[i]).isAssignableFrom(Reflect.wrapper(p1[i]))) {
             i = i + 1;
          }else {
             break ;
          }
       }
       return false;
    }
    public Reflect set(String p0,Object p1){
       try{
          Field uField = this.field0(p0);
          boolean b = true;
          uField.setAccessible(b);
          int i = 16;
          if ((uField.getModifiers() & i) == i) {
             try{
                Field declaredFiel = Reflect$JavaApiWrapper.getDeclaredField(Field.class, "modifiers");
                declaredFiel.setAccessible(b);
                declaredFiel.setInt(uField, (uField.getModifiers() & 0xef));
             }catch(java.lang.NoSuchFieldException e0){
             }
          }
          uField.set(this.object, Reflect.unwrap(p1));
          return this;
       }catch(java.lang.Exception e4){
          throw new Reflect$ReflectException(e4);
       }
    }
    public final Method similarMethod(String p0,Class[] p1){
       object oobject;
       Class uClass = this.type();
       Method[] methods = Reflect$JavaApiWrapper.getMethods(uClass);
       int len = methods.length;
       int i = 0;
       while (true) {
          if (i < len) {
             oobject = methods[i];
             if (this.isSimilarSignature(oobject, p0, p1)) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             do {
                methods = Reflect$JavaApiWrapper.getDeclaredMethods(uClass);
                len = methods.length;
                i = 0;
                while (true) {
                   if (i < len) {
                      oobject = methods[i];
                      if (this.isSimilarSignature(oobject, p0, p1)) {
                         return oobject;
                      }
                      i = i + 1;
                   }else {
                      uClass = uClass.getSuperclass();
                      if (uClass == null) {
                      label_0034 :
                         throw new NoSuchMethodException("No similar method "+p0+" with params "+Arrays.toString(p1)+" could be found on type "+this.type()+".");
                      }
                      continue ;
                   }
                }
             } while (uClass != null);
          }
       }
       return oobject;
    }
    public String toString(){
       return String.valueOf(this.object);
    }
    public Class type(){
       return this.type;
    }
}
