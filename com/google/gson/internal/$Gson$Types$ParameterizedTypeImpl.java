package com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl;
import java.lang.reflect.ParameterizedType;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.Class;
import java.lang.reflect.Modifier;
import bl.a;
import com.google.gson.internal.$Gson$Types;
import java.util.Arrays;
import java.lang.String;
import java.lang.StringBuilder;

public final class $Gson$Types$ParameterizedTypeImpl implements ParameterizedType, Serializable	// class@000563
{
    public final Type ownerType;
    public final Type rawType;
    public final Type[] typeArguments;
    public static final long serialVersionUID;

    public void $Gson$Types$ParameterizedTypeImpl(Type p0,Type p1,Type[] p2){
       super();
       int i = 0;
       if (p1 instanceof Class) {
          Class uClass = p1;
          boolean b = true;
          uClass = (Modifier.isStatic(uClass.getModifiers()) || uClass.getEnclosingClass() == null)? 1: 0;
          if (p0 == null && !uClass) {
             b = false;
          }
          a.a(b);
       }
       p0 = (p0 == null)? null: $Gson$Types.b(p0);
       this.ownerType = p0;
       this.rawType = $Gson$Types.b(p1);
       Type[] typeArray = p2.clone();
       this.typeArguments = typeArray;
       int len = typeArray.length;
       for (; i < len; i = i + 1) {
          a.b(this.typeArguments[i]);
          $Gson$Types.c(this.typeArguments[i]);
          $Gson$Types$ParameterizedTypeImpl ttypeArgumen = this.typeArguments;
          ttypeArgumen[i] = $Gson$Types.b(ttypeArgumen[i]);
       }
       return;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof ParameterizedType && $Gson$Types.d(this, p0))? true: false;
       return b;
    }
    public Type[] getActualTypeArguments(){
       return this.typeArguments.clone();
    }
    public Type getOwnerType(){
       return this.ownerType;
    }
    public Type getRawType(){
       return this.rawType;
    }
    public int hashCode(){
       int i = Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode();
       $Gson$Types$ParameterizedTypeImpl townerType = this.ownerType;
       int i1 = (townerType != null)? townerType.hashCode(): 0;
       return (i ^ i1);
    }
    public String toString(){
       int len = this.typeArguments.length;
       if (!len) {
          return $Gson$Types.l(this.rawType);
       }
       StringBuilder str = new StringBuilder(((len + 1) * 30))+$Gson$Types.l(this.rawType)+"<"+$Gson$Types.l(this.typeArguments[0]);
       for (int i = 1; i < len; i = i + 1) {
          str = str+", "+$Gson$Types.l(this.typeArguments[i]);
       }
       return str+">";
    }
}
