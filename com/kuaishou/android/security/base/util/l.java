package com.kuaishou.android.security.base.util.l;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Constructor;
import java.lang.reflect.AccessibleObject;
import com.kuaishou.android.security.base.util.l$c;
import java.lang.Throwable;
import java.lang.reflect.Method;
import java.lang.Void;
import java.lang.NullPointerException;
import java.lang.ClassLoader;
import java.lang.StringBuilder;
import java.lang.reflect.Modifier;
import java.lang.reflect.Member;
import com.kuaishou.android.security.base.util.l$b;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Short;
import java.lang.Byte;
import java.lang.Double;
import java.lang.Float;
import java.lang.Character;
import java.lang.reflect.Field;
import java.util.Map;
import com.kuaishou.android.security.base.util.l$a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.NoSuchMethodException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.lang.Number;

public class l	// class@000f29
{
    public final Object a;
    public final boolean b;

    public void l(Class p0){
       super();
       this.a = p0;
       this.b = true;
    }
    public void l(Object p0){
       super();
       this.a = p0;
       this.b = false;
    }
    public static l a(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new l(p0);
    }
    public static l a(Constructor p0,Object[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, l.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (l.a(p0) != null) {
             return l.a(l.a(p0).newInstance(p1));
          }
          return null;
       }catch(java.lang.Exception e3){
          throw new l$c(e3);
       }
    }
    public static l a(Method p0,Object p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, l.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (p0 == null) {
             throw new NullPointerException();
          }
          l.a(p0);
          if (p0.getReturnType() != Void.TYPE) {
             return l.a(p0.invoke(p1, p2));
          }
          p0.invoke(p1, p2);
          return l.a(p1);
       }catch(java.lang.Exception e6){
          throw new l$c(e6);
       }
    }
    public static Class a(String p0,ClassLoader p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, l.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = true;
       try{
          return Class.forName(p0, b, p1);
       }catch(java.lang.Exception e3){
          throw new l$c(e3);
       }
    }
    public static Object a(l p0){
       return p0.a;
    }
    public static String a(String p0){
       return l.h(p0);
    }
    public static String a(Method p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, l.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StringBuilder(40)+Modifier.toString(p0.getModifiers())+" "+p0.getReturnType().getName()+" "+p0.getName()+"\(";
       Class[] parameterTyp = p0.getParameterTypes();
       int len = parameterTyp.length;
       for (int i = 0; i < len; i = i + 1) {
          obj = obj+parameterTyp[i].getName()+", ";
       }
       if (parameterTyp.length > 0) {
          obj.delete((obj.length() - 2), obj.length());
       }
       return obj+"\)";
    }
    public static AccessibleObject a(AccessibleObject p0){
       Object obj = null;
       Member obj1 = PatchProxy.applyOneRefs(p0, obj, l.class, "5");
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
    public static l b(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new l(p0);
    }
    public static l b(String p0,ClassLoader p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.b(l.a(p0, p1));
    }
    public static Object b(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof l) {
          p0 = p0.c();
       }
       return p0;
    }
    public static Class[] b(Object[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (p0 == null) {
          Class[] uClassArray = new Class[i];
          return uClassArray;
       }else {
          Class[] uClassArray1 = new Class[p0.length];
          for (; i < p0.length; i = i + 1) {
             object oobject = p0[i];
             l$b uob = (oobject == null)? l$b.class: oobject.getClass();
             uClassArray1[i] = uob;
          }
          return uClassArray1;
       }
    }
    public static Class c(Class p0){
       Void void;
       Object obj = PatchProxy.applyOneRefs(p0, null, l.class, "13");
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
    public static Class e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return Class.forName(p0);
       }catch(java.lang.Exception e3){
          throw new l$c(e3);
       }
    }
    public static l g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return l.b(l.e(p0));
    }
    public static String h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = p0.length();
       if (!i) {
          return "";
       }
       if (i == 1) {
          return p0.toLowerCase();
       }
       return (p0.substring(0, 1)).toLowerCase()+p0.substring(1);
    }
    public l a(){
       Object[] obj = PatchProxy.apply(null, this, l.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[0];
       return this.a(obj);
    }
    public l a(String p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          Field uField = this.d(p0);
          if (uField != null) {
             uField.setAccessible(true);
          }
          if (uField != null) {
             uField.set(this.a, l.b(p1));
          }
          return this;
       }catch(java.lang.Exception e3){
          throw new l$c(e3);
       }
    }
    public l a(String p0,Object[] p1){
       Class[] obj = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = l.b(p1);
       try{
          return l.a(this.a(p0, obj), this.a, p1);
       }catch(java.lang.NoSuchMethodException e0){
          try{
             return l.a(this.b(p0, e0), this.a, p1);
          }catch(java.lang.NoSuchMethodException e4){
             throw new l$c(e4);
          }
       }
    }
    public l a(Object[] p0){
       Class[] obj = PatchProxy.applyOneRefs(p0, this, l.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = l.b(p0);
       try{
          return l.a(this.d().getDeclaredConstructor(obj), p0);
       }catch(java.lang.NoSuchMethodException e1){
          Constructor[] declaredCons = this.d().getDeclaredConstructors();
          int len = declaredCons.length;
          int i = 0;
       label_002b :
          if (i >= len) {
             throw new l$c(e1);
          }
          object oobject = declaredCons[i];
          if (this.a(oobject.getParameterTypes(), obj)) {
             return l.a(oobject, p0);
          }
          i = i + 1;
          goto label_002b ;
       }
    }
    public Object a(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class[] uClassArray = new Class[]{p0};
       return Proxy.newProxyInstance(p0.getClassLoader(), uClassArray, new l$a(this, this.a instanceof Map));
    }
    public Method a(String p0,Class[] p1){
       Class obj = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d();
       try{
          return obj.getMethod(p0, p1);
       }catch(java.lang.NoSuchMethodException e0){
          try{
             return e0.getDeclaredMethod(p0, p1);
          }catch(java.lang.NoSuchMethodException e0){
             obj = e0.getSuperclass();
             if (obj != null) {
                return e0.getDeclaredMethod(p0, p1);
             }
             throw new NoSuchMethodException();
          }
       }
    }
    public final boolean a(Method p0,String p1,Class[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, l.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = ((p0.getName()).equals(p1) && this.a(p0.getParameterTypes(), p2))? true: false;
       return b;
    }
    public final boolean a(Class[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (p0.length > 0 && p0[i].isAssignableFrom(Object[].class)) {
          i = true;
       }
       return i;
    }
    public final boolean a(Class[] p0,Class[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.length != p1.length) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p1.length) {
             return true;
          }
          if (p1[i] != l$b.class) {
             Class uClass = l.c(p0[i]);
             Class uClass1 = l.c(p1[i]);
             if (uClass == null || (uClass1 == null || !uClass.isAssignableFrom(uClass1))) {
                break ;
             }
          }
          i = i + 1;
       }
       return false;
    }
    public l b(String p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, l.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[0];
       return this.a(p0, obj);
    }
    public l b(String p0,Object[] p1){
       Class[] obj = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = l.b(p1);
       Method method = null;
       Method[] declaredMeth = this.d().getDeclaredMethods();
       int len = declaredMeth.length;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 1;
       while (i1 < len) {
          object oobject = declaredMeth[i1];
          if (this.a(oobject, p0, obj)) {
             i2 = 2;
             method = oobject;
             break ;
          }else if(this.b(oobject, p0, obj)){
             method = oobject;
             i2 = 1;
          }else if((oobject.getName()).equals(p0) && (!oobject.getParameterTypes().length && !i2)){
             method = oobject;
          }
          i1 = i1 + 1;
       }
       if (method != null) {
          if (!i2) {
             p1 = new Object[i];
          }
          if (i2 == i3) {
             Object[] objArray = new Object[i3];
             objArray[i] = p1;
             p1 = objArray;
          }
          return l.a(method, this.a, p1);
       }else {
          throw new l$c("no method found for "+p0, new NoSuchMethodException("No best method "+p0+" with params "+Arrays.toString(obj)+" could be found on type "+this.d()+"."));
       }
    }
    public final Method b(String p0,Class[] p1){
       object oobject;
       Class obj = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d();
       Method[] methods = obj.getMethods();
       int len = methods.length;
       int i = 0;
       while (true) {
          if (i < len) {
             oobject = methods[i];
             if (this.a(oobject, p0, p1)) {
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
                      if (this.a(oobject, p0, p1)) {
                         return oobject;
                      }
                      i = i + 1;
                   }else {
                      obj = obj.getSuperclass();
                      if (obj == null) {
                      label_0043 :
                         throw new NoSuchMethodException("No similar method "+p0+" with params "+Arrays.toString(p1)+" could be found on type "+this.d()+".");
                      }
                      continue ;
                   }
                }
             } while (obj != null);
          }
       }
       return oobject;
    }
    public Map b(){
       LinkedHashMap obj = PatchProxy.apply(null, this, l.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedHashMap();
       Class uClass = this.d();
       do {
          Field[] declaredFiel = uClass.getDeclaredFields();
          int len = declaredFiel.length;
          int i = 0;
          while (i < len) {
             object oobject = declaredFiel[i];
             int i1 = this.b ^ 0x01;
             i1 = i1 ^ Modifier.isStatic(oobject.getModifiers());
             if (i1) {
                String name = oobject.getName();
                if (!obj.containsKey(name)) {
                   obj.put(name, this.c(name));
                }
             }
             i = i + 1;
          }
          uClass = uClass.getSuperclass();
       } while (uClass == null);
       return obj;
    }
    public final boolean b(Method p0,String p1,Class[] p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, l.class, "19");
       if (p2 != PatchProxyResult.class) {
          return p2.booleanValue();
       }
       boolean b = ((p0.getName()).equals(p1) && this.a(p0.getParameterTypes()))? true: false;
       return b;
    }
    public l c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          Field uField = this.d(p0);
          if (uField != null) {
             return l.a(uField.get(this.a));
          }
          return null;
       }catch(java.lang.Exception e3){
          throw new l$c(this.a.getClass().getName(), e3);
       }
    }
    public Object c(){
       return this.a;
    }
    public Class d(){
       Object obj = PatchProxy.apply(null, this, l.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b != null) {
          return this.a;
       }
       return this.a.getClass();
    }
    public final Field d(String p0){
       Class obj = PatchProxy.applyOneRefs(p0, this, l.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d();
       try{
          return obj.getField(p0);
       }catch(java.lang.NoSuchFieldException e1){
          try{
          label_0019 :
             return l.a(obj.getDeclaredField(p0));
          }catch(java.lang.NoSuchFieldException e0){
             obj = e0.getSuperclass();
             if (obj != null) {
             label_0019 :
                return l.a(obj.getDeclaredField(p0));
             }
             throw new l$c(e1);
          }
       }
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof l && this.a.equals(p0.c()))? true: false;
       return b;
    }
    public Object f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c(p0).c();
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, l.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.hashCode();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, l.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.toString();
    }
}
