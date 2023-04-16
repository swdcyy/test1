package com.google.common.reflect.b$b;
import com.google.common.reflect.b;
import java.lang.reflect.Method;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.Type;
import java.lang.annotation.Annotation;
import java.lang.Object;
import com.google.common.reflect.a;
import java.lang.reflect.Modifier;
import java.lang.Class;

public class b$b extends b	// class@001916
{
    public final Method d;

    public void b$b(Method p0){
       super(p0);
       this.d = p0;
    }
    public final TypeVariable[] getTypeParameters(){
       return this.d.getTypeParameters();
    }
    public Type[] h0(){
       return this.d.getGenericExceptionTypes();
    }
    public Type[] i0(){
       return this.d.getGenericParameterTypes();
    }
    public Type j0(){
       return this.d.getGenericReturnType();
    }
    public final Annotation[][] k0(){
       return this.d.getParameterAnnotations();
    }
    public final Object l0(Object p0,Object[] p1){
       return this.d.invoke(p0, p1);
    }
    public final boolean m0(){
       boolean b = (!Modifier.isFinal(this.getModifiers()) && (!Modifier.isPrivate(this.getModifiers()) && (!Modifier.isStatic(this.getModifiers()) && !Modifier.isFinal(this.getDeclaringClass().getModifiers()))))? true: false;
       return b;
    }
    public final boolean n0(){
       return this.d.isVarArgs();
    }
}
