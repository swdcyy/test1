package com.kuaishou.weapon.ks.ca;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ca	// class@001204
{

    public void ca(){
       super();
    }
    public static Object a(Class p0,Object p1,String p2){
       Field declaredFiel = p0.getDeclaredField(p2);
       declaredFiel.setAccessible(true);
       return declaredFiel.get(p1);
    }
    public static Object a(Class p0,Object p1,String p2,Object[] p3){
       Class[] uClassArray;
       if (p3 != null) {
          uClassArray = new Class[p3.length];
          for (int i = 0; i < p3.length; i = i + 1) {
             uClassArray[i] = p3[i].getClass();
          }
       }else {
          uClassArray = null;
       }
       Method declaredMeth = p0.getDeclaredMethod(p2, uClassArray);
       declaredMeth.setAccessible(true);
       return declaredMeth.invoke(p1, p3);
    }
    public static Object a(String p0,Object p1,String p2,Object[] p3){
       return ca.a(Class.forName(p0), p1, p2, p3);
    }
    public static Object a(String p0,String p1){
       return ca.a(Class.forName(p0), null, p1);
    }
}
