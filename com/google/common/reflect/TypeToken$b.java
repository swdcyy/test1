package com.google.common.reflect.TypeToken$b;
import com.google.common.reflect.b$a;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import com.google.common.reflect.b;
import java.lang.Object;
import java.util.Arrays;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.ParameterizedType;
import com.google.common.reflect.Types;
import java.lang.String;
import java.lang.StringBuilder;
import com.google.common.base.a;

public class TypeToken$b extends b$a	// class@0018f7
{
    public final TypeToken e;

    public void TypeToken$b(TypeToken p0,Constructor p1){
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
       int i;
       TypeToken$b te = this.e;
       Type[] genericParam = this.d.getGenericParameterTypes();
       if (genericParam.length > 0) {
          Class declaringCla = this.d.getDeclaringClass();
          if (declaringCla.getEnclosingConstructor() != null) {
          label_003a :
             i = 1;
          }else {
             Method enclosingMet = declaringCla.getEnclosingMethod();
             if (enclosingMet != null) {
                i = Modifier.isStatic(enclosingMet.getModifiers()) ^ 1;
             }else if(declaringCla.getEnclosingClass() != null && !Modifier.isStatic(declaringCla.getModifiers())){
                goto label_003a ;
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
    label_005c :
       return te.resolveInPlace(genericParam);
    }
    public Type j0(){
       TypeToken$b te = this.e;
       Class declaringCla = this.getDeclaringClass();
       TypeVariable[] typeParamete = declaringCla.getTypeParameters();
       if (typeParamete.length > 0) {
          declaringCla = Types.f(declaringCla, typeParamete);
       }
       return te.resolveType(declaringCla).getType();
    }
    public String toString(){
       int i;
       StringBuilder str = this.g0()+"\(";
       a uoa = a.g(", ");
       TypeToken$b te = this.e;
       Type[] genericParam = this.d.getGenericParameterTypes();
       if (genericParam.length > 0) {
          Class declaringCla = this.d.getDeclaringClass();
          if (declaringCla.getEnclosingConstructor() != null) {
          label_0051 :
             i = 1;
          }else {
             Method enclosingMet = declaringCla.getEnclosingMethod();
             if (enclosingMet != null) {
                i = Modifier.isStatic(enclosingMet.getModifiers()) ^ 1;
             }else if(declaringCla.getEnclosingClass() != null && !Modifier.isStatic(declaringCla.getModifiers())){
                goto label_0051 ;
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
    label_0073 :
       return str+uoa.e(te.resolveInPlace(genericParam))+"\)";
    }
}
