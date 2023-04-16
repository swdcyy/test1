package com.google.common.reflect.TypeToken$a;
import com.google.common.reflect.b$b;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import com.google.common.reflect.a;

public class TypeToken$a extends b$b	// class@0018f6
{
    public final TypeToken e;

    public void TypeToken$a(TypeToken p0,Method p1){
       this.e = p0;
       super(p1);
    }
    public TypeToken g0(){
       return this.e;
    }
    public Type[] h0(){
       return this.e.resolveInPlace(this.d.getGenericExceptionTypes());
    }
    public Type[] i0(){
       return this.e.resolveInPlace(this.d.getGenericParameterTypes());
    }
    public Type j0(){
       return this.e.resolveType(this.d.getGenericReturnType()).getType();
    }
    public String toString(){
       return this.g0()+"."+super.toString();
    }
}
