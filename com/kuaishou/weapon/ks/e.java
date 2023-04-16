package com.kuaishou.weapon.ks.e;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.NoSuchFieldException;
import java.lang.StringBuilder;
import java.lang.reflect.Method;
import java.lang.NoSuchMethodException;
import java.util.List;
import java.util.Arrays;

public class e	// class@00120a
{

    public void e(){
       super();
    }
    public static Field a(Object p0,String p1){
       Class class = p0.getClass();
    label_0004 :
       if (class == null) {
          throw new NoSuchFieldException("Field "+p1+" not found in "+p0.getClass());
       }
       try{
          Field declaredFiel = class.getDeclaredField(p1);
          if (!declaredFiel.isAccessible()) {
             declaredFiel.setAccessible(true);
          }
          return declaredFiel;
       }catch(java.lang.Exception e0){
          class = e0.getSuperclass();
          goto label_0004 ;
       }
    }
    public static Method a(Object p0,String p1,Class[] p2){
       Class class = p0.getClass();
    label_0004 :
       if (class == null) {
          throw new NoSuchMethodException("Method "+p1+" with parameters "+Arrays.asList(p2)+" not found in "+p0.getClass());
       }
       try{
          Method declaredMeth = class.getDeclaredMethod(p1, p2);
          if (!declaredMeth.isAccessible()) {
             declaredMeth.setAccessible(true);
          }
          return declaredMeth;
       }catch(java.lang.NoSuchMethodException e0){
          class = e0.getSuperclass();
          goto label_0004 ;
       }
    }
    public static boolean a(Class p0,Object p1,Object p2){
       if (p1 == null || p2 == null) {
          return false;
       }
       for (; p0 != null && p0 != Object.class; p0 = p0.getSuperclass()) {
          Field[] declaredFiel = p0.getDeclaredFields();
          int len = declaredFiel.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = declaredFiel[i];
             oobject.setAccessible(true);
             oobject.set(p2, oobject.get(p1));
          }
       }
       return true;
    }
    public static Field b(Object p0,String p1){
       Class class = p0.getClass();
    label_0004 :
       if (class == null) {
          throw new NoSuchFieldException("Field "+p1+" not found in "+p0.getClass());
       }
       try{
          Field declaredFiel = class.getDeclaredField(p1);
          Field declaredFiel1 = Field.class.getDeclaredField("modifiers");
          declaredFiel1.setAccessible(true);
          int i = declaredFiel.getModifiers() & 0xef;
          declaredFiel1.setInt(declaredFiel, i);
          if (!declaredFiel.isAccessible()) {
             declaredFiel.setAccessible(true);
          }
          return declaredFiel;
       }catch(java.lang.Exception e0){
          class = e0.getSuperclass();
          goto label_0004 ;
       }
    }
}
