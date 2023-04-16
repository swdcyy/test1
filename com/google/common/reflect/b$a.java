package com.google.common.reflect.b$a;
import com.google.common.reflect.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.TypeVariable;
import java.lang.Class;
import java.lang.Object;
import java.lang.System;
import java.lang.reflect.Type;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.lang.reflect.ParameterizedType;
import com.google.common.reflect.Types;
import java.lang.annotation.Annotation;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;

public class b$a extends b	// class@001915
{
    public final Constructor d;

    public void b$a(Constructor p0){
       super(p0);
       this.d = p0;
    }
    public final TypeVariable[] getTypeParameters(){
       TypeVariable[] typeParamete = this.getDeclaringClass().getTypeParameters();
       TypeVariable[] typeParamete1 = this.d.getTypeParameters();
       TypeVariable[] typeVariable = new TypeVariable[(typeParamete.length + typeParamete1.length)];
       System.arraycopy(typeParamete, 0, typeVariable, 0, typeParamete.length);
       System.arraycopy(typeParamete1, 0, typeVariable, typeParamete.length, typeParamete1.length);
       return typeVariable;
    }
    public Type[] h0(){
       return this.d.getGenericExceptionTypes();
    }
    public Type[] i0(){
       int i;
       Type[] genericParam = this.d.getGenericParameterTypes();
       if (genericParam.length > 0) {
          Class declaringCla = this.d.getDeclaringClass();
          if (declaringCla.getEnclosingConstructor() != null) {
          label_0038 :
             i = 1;
          }else {
             Method enclosingMet = declaringCla.getEnclosingMethod();
             if (enclosingMet != null) {
                i = Modifier.isStatic(enclosingMet.getModifiers()) ^ 1;
             }else if(declaringCla.getEnclosingClass() != null && !Modifier.isStatic(declaringCla.getModifiers())){
                goto label_0038 ;
             }else {
                i = 0;
             }
          }
          if (i) {
             Class[] parameterTyp = this.d.getParameterTypes();
             if (genericParam.length == parameterTyp.length && parameterTyp[0] == this.getDeclaringClass().getEnclosingClass()) {
                genericParam = Arrays.copyOfRange(genericParam, 1, genericParam.length);
             }
          }
       }
    label_005a :
       return genericParam;
    }
    public Type j0(){
       Class declaringCla = this.getDeclaringClass();
       TypeVariable[] typeParamete = declaringCla.getTypeParameters();
       if (typeParamete.length > 0) {
          declaringCla = Types.f(declaringCla, typeParamete);
       }
       return declaringCla;
    }
    public final Annotation[][] k0(){
       return this.d.getParameterAnnotations();
    }
    public final Object l0(Object p0,Object[] p1){
       try{
          return this.d.newInstance(p1);
       }catch(java.lang.InstantiationException e3){
          throw new RuntimeException(this.d+" failed.", e3);
       }
    }
    public final boolean m0(){
       return false;
    }
    public final boolean n0(){
       return this.d.isVarArgs();
    }
}
