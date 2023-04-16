package com.google.common.reflect.b;
import java.lang.reflect.GenericDeclaration;
import com.google.common.reflect.a;
import java.lang.reflect.AccessibleObject;
import com.google.common.reflect.TypeToken;
import java.lang.Class;
import java.lang.reflect.Type;
import java.lang.annotation.Annotation;
import java.lang.Object;

public abstract class b extends a implements GenericDeclaration	// class@001917
{

    public void b(AccessibleObject p0){
       super(p0);
    }
    public TypeToken g0(){
       return TypeToken.of(this.getDeclaringClass());
    }
    public final Class getDeclaringClass(){
       return super.getDeclaringClass();
    }
    public abstract Type[] h0();
    public abstract Type[] i0();
    public abstract Type j0();
    public abstract Annotation[][] k0();
    public abstract Object l0(Object p0,Object[] p1);
    public abstract boolean m0();
    public abstract boolean n0();
}
