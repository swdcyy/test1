package com.google.common.reflect.TypeToken$c;
import wk.d;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.WildcardType;

public class TypeToken$c extends d	// class@0018f8
{
    public final TypeToken b;

    public void TypeToken$c(TypeToken p0){
       this.b = p0;
       super();
    }
    public void c(GenericArrayType p0){
       Type[] typeArray = new Type[]{p0.getGenericComponentType()};
       this.a(typeArray);
    }
    public void d(ParameterizedType p0){
       this.a(p0.getActualTypeArguments());
       Type[] typeArray = new Type[]{p0.getOwnerType()};
       this.a(typeArray);
    }
    public void e(TypeVariable p0){
       throw new IllegalArgumentException(this.b.runtimeType+"contains a type variable and is not safe for the operation");
    }
    public void f(WildcardType p0){
       this.a(p0.getLowerBounds());
       this.a(p0.getUpperBounds());
    }
}
