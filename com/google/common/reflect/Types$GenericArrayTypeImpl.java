package com.google.common.reflect.Types$GenericArrayTypeImpl;
import java.lang.reflect.GenericArrayType;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.Object;
import com.google.common.reflect.Types$JavaVersion;
import ok.k;
import java.lang.String;
import java.lang.StringBuilder;
import com.google.common.reflect.Types;

public final class Types$GenericArrayTypeImpl implements GenericArrayType, Serializable	// class@001904
{
    public final Type componentType;
    public static final long serialVersionUID;

    public void Types$GenericArrayTypeImpl(Type p0){
       super();
       this.componentType = Types$JavaVersion.CURRENT.usedInGenericType(p0);
    }
    public boolean equals(Object p0){
       if (p0 instanceof GenericArrayType) {
          return k.a(this.getGenericComponentType(), p0.getGenericComponentType());
       }
       return false;
    }
    public Type getGenericComponentType(){
       return this.componentType;
    }
    public int hashCode(){
       return this.componentType.hashCode();
    }
    public String toString(){
       return Types.k(this.componentType)+"[]";
    }
}
