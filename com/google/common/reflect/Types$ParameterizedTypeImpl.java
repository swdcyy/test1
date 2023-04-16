package com.google.common.reflect.Types$ParameterizedTypeImpl;
import java.lang.reflect.ParameterizedType;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.Class;
import java.lang.Object;
import ok.n;
import java.lang.reflect.TypeVariable;
import java.lang.String;
import com.google.common.reflect.Types;
import com.google.common.reflect.Types$JavaVersion;
import com.google.common.collect.ImmutableList;
import ok.k;
import java.util.Arrays;
import java.util.Collection;
import java.lang.StringBuilder;
import java.lang.Iterable;
import ok.h;
import qk.y;
import com.google.common.base.a;

public final class Types$ParameterizedTypeImpl implements ParameterizedType, Serializable	// class@00190c
{
    public final ImmutableList argumentsList;
    public final Type ownerType;
    public final Class rawType;
    public static final long serialVersionUID;

    public void Types$ParameterizedTypeImpl(Type p0,Class p1,Type[] p2){
       super();
       n.j(p1);
       boolean b = (p2.length == p1.getTypeParameters().length)? true: false;
       n.b(b);
       Types.a(p2, "type parameter");
       this.ownerType = p0;
       this.rawType = p1;
       this.argumentsList = Types$JavaVersion.CURRENT.usedInGenericType(p2);
       return;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof ParameterizedType) {
          return b;
       }
       if (this.getRawType().equals(p0.getRawType()) && (k.a(this.getOwnerType(), p0.getOwnerType()) && Arrays.equals(this.getActualTypeArguments(), p0.getActualTypeArguments()))) {
          b = true;
       }
    label_0033 :
       return b;
    }
    public Type[] getActualTypeArguments(){
       return Types.j(this.argumentsList);
    }
    public Type getOwnerType(){
       return this.ownerType;
    }
    public Type getRawType(){
       return this.rawType;
    }
    public int hashCode(){
       Types$ParameterizedTypeImpl townerType = this.ownerType;
       int i = (townerType == null)? 0: townerType.hashCode();
       return ((i ^ this.argumentsList.hashCode()) ^ this.rawType.hashCode());
    }
    public String toString(){
       StringBuilder str = "";
       if (this.ownerType != null) {
          Types$JavaVersion cURRENT = Types$JavaVersion.CURRENT;
          if (cURRENT.jdkTypeDuplicatesOwnerName()) {
             str = str+cURRENT.typeName(this.ownerType)+'.';
          }
       }
       return str+this.rawType.getName()+'<'+Types.b.c(y.x(this.argumentsList, Types.a))+'>';
    }
}
