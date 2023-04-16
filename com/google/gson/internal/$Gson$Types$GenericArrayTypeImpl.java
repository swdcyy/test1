package com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl;
import java.lang.reflect.GenericArrayType;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.Object;
import com.google.gson.internal.$Gson$Types;
import java.lang.String;
import java.lang.StringBuilder;

public final class $Gson$Types$GenericArrayTypeImpl implements GenericArrayType, Serializable	// class@000562
{
    public final Type componentType;
    public static final long serialVersionUID;

    public void $Gson$Types$GenericArrayTypeImpl(Type p0){
       super();
       this.componentType = $Gson$Types.b(p0);
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof GenericArrayType && $Gson$Types.d(this, p0))? true: false;
       return b;
    }
    public Type getGenericComponentType(){
       return this.componentType;
    }
    public int hashCode(){
       return this.componentType.hashCode();
    }
    public String toString(){
       return $Gson$Types.l(this.componentType)+"[]";
    }
}
