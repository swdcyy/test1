package com.google.common.reflect.TypeToken$f$a;
import com.google.common.reflect.TypeToken$f;
import com.google.common.reflect.TypeToken$a;
import java.lang.Object;
import java.lang.Iterable;
import com.google.common.reflect.TypeToken;
import com.google.common.collect.ImmutableList;
import java.lang.Class;

public final class TypeToken$f$a extends TypeToken$f	// class@0018fb
{

    public void TypeToken$f$a(){
       super(null);
    }
    public Iterable c(Object p0){
       return p0.getGenericInterfaces();
    }
    public Class d(Object p0){
       return p0.getRawType();
    }
    public Object e(Object p0){
       return p0.getGenericSuperclass();
    }
}
