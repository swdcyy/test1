package com.google.common.reflect.Types$JavaVersion$4;
import com.google.common.reflect.Types$JavaVersion;
import java.lang.String;
import com.google.common.reflect.Types$a;
import java.lang.reflect.Type;

public final class Types$JavaVersion$4 extends Types$JavaVersion	// class@001908
{

    public void Types$JavaVersion$4(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean jdkTypeDuplicatesOwnerName(){
       return false;
    }
    public Type newArrayType(Type p0){
       return Types$JavaVersion.JAVA8.newArrayType(p0);
    }
    public String typeName(Type p0){
       return Types$JavaVersion.JAVA8.typeName(p0);
    }
    public Type usedInGenericType(Type p0){
       return Types$JavaVersion.JAVA8.usedInGenericType(p0);
    }
}
