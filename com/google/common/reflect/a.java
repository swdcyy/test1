package com.google.common.reflect.a;
import java.lang.reflect.Member;
import java.lang.reflect.AccessibleObject;
import java.lang.Object;
import ok.n;
import com.google.common.reflect.TypeToken;
import java.lang.Class;
import java.lang.annotation.Annotation;
import java.lang.String;

public class a extends AccessibleObject implements Member	// class@001914
{
    public final AccessibleObject b;
    public final Member c;

    public void a(AccessibleObject p0){
       super();
       n.j(p0);
       this.b = p0;
       this.c = p0;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof a && (this.g0().equals(p0.g0()) && this.c.equals(p0.c))) {
          b = true;
       }
    label_0020 :
       return b;
    }
    public TypeToken g0(){
       return TypeToken.of(this.getDeclaringClass());
    }
    public final Annotation getAnnotation(Class p0){
       return this.b.getAnnotation(p0);
    }
    public final Annotation[] getAnnotations(){
       return this.b.getAnnotations();
    }
    public final Annotation[] getDeclaredAnnotations(){
       return this.b.getDeclaredAnnotations();
    }
    public Class getDeclaringClass(){
       return this.c.getDeclaringClass();
    }
    public final int getModifiers(){
       return this.c.getModifiers();
    }
    public final String getName(){
       return this.c.getName();
    }
    public int hashCode(){
       return this.c.hashCode();
    }
    public final boolean isAccessible(){
       return this.b.isAccessible();
    }
    public final boolean isAnnotationPresent(Class p0){
       return this.b.isAnnotationPresent(p0);
    }
    public final boolean isSynthetic(){
       return this.c.isSynthetic();
    }
    public final void setAccessible(boolean p0){
       this.b.setAccessible(p0);
    }
    public String toString(){
       return this.c.toString();
    }
}
