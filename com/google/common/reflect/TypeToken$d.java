package com.google.common.reflect.TypeToken$d;
import wk.d;
import com.google.common.reflect.TypeToken;
import com.google.common.collect.ImmutableSet$a;
import java.lang.Class;
import java.lang.Object;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import com.google.common.reflect.Types;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

public class TypeToken$d extends d	// class@0018f9
{
    public final ImmutableSet$a b;
    public final TypeToken c;

    public void TypeToken$d(TypeToken p0,ImmutableSet$a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void b(Class p0){
       this.b.h(p0);
    }
    public void c(GenericArrayType p0){
       this.b.h(Types.b(TypeToken.of(p0.getGenericComponentType()).getRawType()));
    }
    public void d(ParameterizedType p0){
       this.b.h(p0.getRawType());
    }
    public void e(TypeVariable p0){
       this.a(p0.getBounds());
    }
    public void f(WildcardType p0){
       this.a(p0.getUpperBounds());
    }
}
