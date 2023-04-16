package com.kuaishou.dfp.c.a;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.dfp.c.ae;
import java.lang.Throwable;
import java.lang.reflect.Method;
import java.lang.reflect.AccessibleObject;
import java.lang.Void;
import java.lang.NullPointerException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Short;
import java.lang.Byte;
import java.lang.Double;
import java.lang.Float;
import java.lang.Character;
import l30.c;
import java.lang.NoSuchMethodException;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.lang.Number;
import java.lang.reflect.Field;

public class a	// class@0016e4
{
    public final Object a;
    public final boolean b;

    public void a(Class p0){
       super();
       this.a = p0;
       this.b = true;
    }
    public void a(Object p0){
       super();
       this.a = p0;
       this.b = false;
    }
    public static a a(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(p0);
    }
    public static a b(String p0){
       Class obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = PatchProxy.applyOneRefs(p0, null, a.class, "11");
          if (obj != PatchProxyResult.class) {
          }else {
             obj = Class.forName(p0);
          }
          a uoa = PatchProxy.applyOneRefs(obj, null, a.class, "3");
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = new a(obj);
          }
          return uoa;
       }catch(java.lang.Exception e4){
          throw new ae(e4);
       }
    }
    public static a c(Method p0,Object p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (p0 == null) {
             throw new NullPointerException();
          }
          a.e(p0);
          if (p0.getReturnType() != Void.TYPE) {
             return a.a(p0.invoke(p1, p2));
          }
          p0.invoke(p1, p2);
          return a.a(p1);
       }catch(java.lang.Exception e6){
          throw new ae(e6);
       }
    }
    public static AccessibleObject e(AccessibleObject p0){
       Object obj = null;
       Member obj1 = PatchProxy.applyOneRefs(p0, obj, a.class, "5");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       if (p0 instanceof Member) {
          obj1 = p0;
          if (Modifier.isPublic(obj1.getModifiers()) && Modifier.isPublic(obj1.getDeclaringClass().getModifiers())) {
             return p0;
          }
       }
       if (!p0.isAccessible()) {
          p0.setAccessible(true);
       }
       return p0;
    }
    public static Class g(Class p0){
       Void void;
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
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
    public Object d(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof a && this.a.equals(p0.d()))? true: false;
       return b;
    }
    public final boolean f(Method p0,String p1,Class[] p2){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "23");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if ((p0.getName()).equals(p1)) {
          Class[] parameterTyp = p0.getParameterTypes();
          p1 = PatchProxy.applyTwoRefs(parameterTyp, p2, this, a.class, "27");
          if (p1 != patchProxyRe) {
             b1 = p1.booleanValue();
          }else if(parameterTyp.length == p2.length){
             int i = 0;
             while (true) {
                if (i < p2.length) {
                   if (p2[i] != c.class) {
                      Class uClass = a.g(parameterTyp[i]);
                      Class uClass1 = a.g(p2[i]);
                      if (uClass == null || (uClass1 == null || !uClass.isAssignableFrom(uClass1))) {
                      label_0062 :
                         b1 = false;
                      }
                   }
                   i++;
                }else {
                   b1 = true;
                }
             }
             return b;
          }else {
             goto label_0062 ;
          }
          if (b1) {
             goto label_0067 ;
          }
       }
       b = false;
       goto label_0067 ;
    }
    public final Method h(String p0,Class[] p1){
       object oobject;
       Class obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k();
       Method[] methods = obj.getMethods();
       int len = methods.length;
       int i = 0;
       while (true) {
          if (i < len) {
             oobject = methods[i];
             if (this.f(oobject, p0, p1)) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             do {
                methods = obj.getDeclaredMethods();
                len = methods.length;
                i = 0;
                while (true) {
                   if (i < len) {
                      oobject = methods[i];
                      if (this.f(oobject, p0, p1)) {
                         return oobject;
                      }
                      i = i + 1;
                   }else {
                      obj = obj.getSuperclass();
                      if (obj == null) {
                      label_0043 :
                         throw new NoSuchMethodException("No similar method "+p0+" with params "+Arrays.toString(p1)+" could be found on type "+this.k()+".");
                      }
                      continue ;
                   }
                }
             } while (obj != null);
          }
       }
       return oobject;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, a.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.hashCode();
    }
    public a i(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "16");
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          Field uField = PatchProxy.applyOneRefs(p0, this, uoa, "17");
          if (uField != patchProxyRe) {
          }else {
             Class uClass = this.k();
             try{
                uField = uClass.getField(p0);
             }catch(java.lang.NoSuchFieldException e1){
                try{
                label_0024 :
                   uField = a.e(uClass.getDeclaredField(p0));
                }catch(java.lang.NoSuchFieldException e0){
                   uClass = e0.getSuperclass();
                   if (uClass != null) {
                      goto label_0024 ;
                   }else {
                      throw new ae(uField);
                   }
                }catch(java.lang.Exception e4){
                   throw new ae(this.a.getClass().getName(), e4);
                }
             }
          }
       }catch(java.lang.Exception e4){
       }
    }
    public a j(String p0){
       Object[] objArray;
       a uoa1;
       Class[] uClassArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "19");
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          int i = 0;
          objArray = new Object[i];
          uoa1 = PatchProxy.applyTwoRefs(p0, objArray, this, uoa, "20");
          if (uoa1 != patchProxyRe) {
          }else {
             uClassArray = PatchProxy.applyOneRefs(objArray, null, uoa, "10");
             if (uClassArray != patchProxyRe) {
             }else {
                uClassArray = new Class[i];
             }
             Method method = PatchProxy.applyTwoRefs(p0, uClassArray, this, uoa, "21");
             if (method != patchProxyRe) {
             }else {
                Class uClass = this.k();
                try{
                   method = uClass.getMethod(p0, uClassArray);
                }catch(java.lang.NoSuchMethodException e0){
                   try{
                      method = e0.getDeclaredMethod(p0, uClassArray);
                   }catch(java.lang.NoSuchMethodException e0){
                      uClass = e0.getSuperclass();
                      if (uClass != null) {
                         goto label_003f ;
                      }else {
                         throw new NoSuchMethodException();
                      }
                   }
                }
             }
          }
       }catch(java.lang.NoSuchMethodException e0){
          uoa1 = a.c(this.h(p0, uClassArray), this.a, objArray);
       }
       return uoa1;
    }
    public Class k(){
       Object obj = PatchProxy.apply(null, this, a.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b != null) {
          return this.a;
       }
       return this.a.getClass();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.toString();
    }
}
