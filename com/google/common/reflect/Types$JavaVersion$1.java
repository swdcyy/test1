package com.google.common.reflect.Types$JavaVersion$1;
import com.google.common.reflect.Types$JavaVersion;
import java.lang.String;
import com.google.common.reflect.Types$a;
import java.lang.reflect.Type;
import java.lang.reflect.GenericArrayType;
import com.google.common.reflect.Types$GenericArrayTypeImpl;
import java.lang.Object;
import ok.n;
import java.lang.Class;

public final class Types$JavaVersion$1 extends Types$JavaVersion	// class@001905
{

    public void Types$JavaVersion$1(String p0,int p1){
       super(p0, p1, null);
    }
    public GenericArrayType newArrayType(Type p0){
       return new Types$GenericArrayTypeImpl(p0);
    }
    public Type newArrayType(Type p0){
       return this.newArrayType(p0);
    }
    public Type usedInGenericType(Type p0){
       Types$GenericArrayTypeImpl genericArray;
       n.j(p0);
       if (p0 instanceof Class) {
          Class uClass = p0;
          if (uClass.isArray()) {
             genericArray = new Types$GenericArrayTypeImpl(uClass.getComponentType());
          }
       }
       return genericArray;
    }
}
