package com.meizu.cloud.pushsdk.b.b.c;
import java.util.HashMap;
import com.meizu.cloud.pushsdk.b.b.a;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import com.meizu.cloud.pushsdk.b.b.d;
import java.lang.reflect.Method;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Short;
import java.lang.Byte;
import java.lang.Double;
import java.lang.Float;
import java.lang.Character;
import java.lang.Void;
import java.lang.NoSuchMethodException;
import java.util.Arrays;
import com.meizu.cloud.pushsdk.b.b.c$a;

public class c	// class@0014a1
{
    public final a b;
    public final String c;
    public Class[] d;
    public static final HashMap a;

    static {
       c.a = new HashMap();
    }
    public void c(a p0,String p1,Class[] p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public d a(Object p0,Object[] p1){
       d uod;
       try{
          uod = new d();
          String str = this.b();
          Method method = c.a.get(str);
          if (method == null) {
             if (this.d.length == p1.length) {
                method = this.b.a().getMethod(this.c, this.d);
             }else if(p1.length > 0){
                Class[] uClassArray = new Class[p1.length];
                this.d = uClassArray;
                for (int i = 0; i < p1.length; i = i + 1) {
                   this.d[i] = p1[i].getClass();
                }
             }
             method = this.a();
             c.a.put(str, method);
          }
          method.setAccessible(true);
          uod.b = method.invoke(p0, p1);
          uod.a = true;
       }catch(java.lang.Exception e6){
          DebugLogger.d("ReflectMethod", "invoke exception, "+e6.getMessage());
       }
       return uod;
    }
    public d a(Object[] p0){
       try{
          return this.a(this.b.a(), p0);
       }catch(java.lang.ClassNotFoundException e0){
          return new d();
       }
    }
    public final Class a(Class p0){
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
    public final Method a(){
       object oobject;
       Class uClass = this.b.a();
       Method[] methods = uClass.getMethods();
       int len = methods.length;
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i1 < len) {
             oobject = methods[i1];
             if (this.a(oobject, this.c, this.d)) {
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             methods = uClass.getDeclaredMethods();
             len = methods.length;
             while (true) {
                if (i >= len) {
                   throw new NoSuchMethodException("No similar method "+this.c+" with params "+Arrays.toString(this.d)+" could be found on type "+uClass);
                }
                object oobject1 = methods[i];
                if (this.a(oobject1, this.c, this.d)) {
                   return oobject1;
                }
                i = i + 1;
             }
          }
       }
       return oobject;
    }
    public final boolean a(Method p0,String p1,Class[] p2){
       boolean b = ((p0.getName()).equals(p1) && this.a(p0.getParameterTypes(), p2))? true: false;
       return b;
    }
    public final boolean a(Class[] p0,Class[] p1){
       if (p0.length != p1.length) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p1.length) {
             return true;
          }
          if (p1[i] == c$a.class || this.a(p0[i]).isAssignableFrom(this.a(p1[i]))) {
             i = i + 1;
          }else {
             break ;
          }
       }
       return false;
    }
    public final String b(){
       StringBuilder str = this.b.a().getName()+this.c;
       c td = this.d;
       int len = td.length;
       for (int i = 0; i < len; i = i + 1) {
          str = str+td[i].getName();
       }
       return str;
    }
}
