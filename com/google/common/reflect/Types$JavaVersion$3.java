package com.google.common.reflect.Types$JavaVersion$3;
import com.google.common.reflect.Types$JavaVersion;
import java.lang.String;
import com.google.common.reflect.Types$a;
import java.lang.reflect.Type;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.AssertionError;

public final class Types$JavaVersion$3 extends Types$JavaVersion	// class@001907
{

    public void Types$JavaVersion$3(String p0,int p1){
       super(p0, p1, null);
    }
    public Type newArrayType(Type p0){
       return Types$JavaVersion.JAVA7.newArrayType(p0);
    }
    public String typeName(Type p0){
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return Type.class.getMethod("getTypeName", uClassArray).invoke(p0, objArray);
       }catch(java.lang.NoSuchMethodException e0){
          throw new AssertionError("Type.getTypeName should be available in Java 8");
       }catch(java.lang.reflect.InvocationTargetException e5){
       }catch(java.lang.IllegalAccessException e5){
       }
       throw new RuntimeException(e5);
    }
    public Type usedInGenericType(Type p0){
       return Types$JavaVersion.JAVA7.usedInGenericType(p0);
    }
}
