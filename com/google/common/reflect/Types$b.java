package com.google.common.reflect.Types$b;
import wk.d;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Class;
import java.lang.Object;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import com.google.common.reflect.Types;
import java.lang.reflect.WildcardType;

public final class Types$b extends d	// class@00190f
{
    public final AtomicReference b;

    public void Types$b(AtomicReference p0){
       this.b = p0;
       super();
    }
    public void b(Class p0){
       this.b.set(p0.getComponentType());
    }
    public void c(GenericArrayType p0){
       this.b.set(p0.getGenericComponentType());
    }
    public void e(TypeVariable p0){
       this.b.set(Types.i(p0.getBounds()));
    }
    public void f(WildcardType p0){
       this.b.set(Types.i(p0.getUpperBounds()));
    }
}
