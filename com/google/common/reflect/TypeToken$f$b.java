package com.google.common.reflect.TypeToken$f$b;
import com.google.common.reflect.TypeToken$f;
import com.google.common.reflect.TypeToken$a;
import java.lang.Object;
import java.lang.Iterable;
import java.lang.Class;
import java.util.List;
import java.util.Arrays;

public final class TypeToken$f$b extends TypeToken$f	// class@0018fc
{

    public void TypeToken$f$b(){
       super(null);
    }
    public Iterable c(Object p0){
       return Arrays.asList(p0.getInterfaces());
    }
    public Class d(Object p0){
       return p0;
    }
    public Object e(Object p0){
       return p0.getSuperclass();
    }
}
