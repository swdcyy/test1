package com.loc.fm;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.reflect.InvocationTargetException;
import java.lang.Throwable;
import com.loc.fj;
import java.lang.reflect.Field;

public final class fm	// class@001432
{

    public static Object a(Class p0,String p1,Object[] p2,Class[] p3){
       Method declaredMeth = p0.getDeclaredMethod(p1, p3);
       if (!declaredMeth.isAccessible()) {
          declaredMeth.setAccessible(true);
       }
       return declaredMeth.invoke(null, p2);
    }
    public static Object a(Object p0,Class p1,String p2,Object[] p3){
       Class[] uClassArray = new Class[p3.length];
       int len = p3.length;
       int i = 0;
       while (i < len) {
          uClassArray[i] = p3[i].getClass();
          if (uClassArray[i] == Integer.class) {
             uClassArray[i] = Integer.TYPE;
          }
          if (uClassArray[i] == Boolean.class) {
             uClassArray[i] = Boolean.TYPE;
          }
          if (uClassArray[i] == Double.class) {
             uClassArray[i] = Double.TYPE;
          }
          i = i + 1;
       }
       Method declaredMeth = p1.getDeclaredMethod(p2, uClassArray);
       if (!declaredMeth.isAccessible()) {
          declaredMeth.setAccessible(true);
       }
       Object obj = declaredMeth.invoke(p0, p3);
       return obj;
    }
    public static Object a(Object p0,String p1,Object[] p2){
       p0 = fm.a(p0, p0.getClass(), p1, p2);
       return p0;
    }
    public static Object a(String p0,String p1){
       Class uClass = Class.forName(p0);
       Field field = uClass.getField(p1);
       field.setAccessible(true);
       return field.get(uClass);
    }
    public static Object a(String p0,String p1,Object[] p2,Class[] p3){
       return fm.a(Class.forName(p0), p1, p2, p3);
    }
    public static int b(Object p0,String p1,Object[] p2){
       return fm.a(p0, p1, p2).intValue();
    }
    public static int b(String p0,String p1){
       return fm.a(p0, p1).intValue();
    }
}
