package com.google.common.reflect.Types$JavaVersion$2;
import com.google.common.reflect.Types$JavaVersion;
import java.lang.String;
import com.google.common.reflect.Types$a;
import java.lang.reflect.Type;
import java.lang.Class;
import com.google.common.reflect.Types;
import com.google.common.reflect.Types$GenericArrayTypeImpl;
import java.lang.Object;
import ok.n;

public final class Types$JavaVersion$2 extends Types$JavaVersion	// class@001906
{

    public void Types$JavaVersion$2(String p0,int p1){
       super(p0, p1, null);
    }
    public Type newArrayType(Type p0){
       if (p0 instanceof Class) {
          return Types.b(p0);
       }
       return new Types$GenericArrayTypeImpl(p0);
    }
    public Type usedInGenericType(Type p0){
       n.j(p0);
       return p0;
    }
}
