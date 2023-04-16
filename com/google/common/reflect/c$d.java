package com.google.common.reflect.c$d;
import java.lang.reflect.TypeVariable;
import java.lang.Object;
import ok.n;
import java.lang.reflect.Type;
import java.lang.reflect.GenericDeclaration;
import java.lang.String;
import ok.k;

public final class c$d	// class@00191b
{
    public final TypeVariable a;

    public void c$d(TypeVariable p0){
       super();
       n.j(p0);
       this.a = p0;
    }
    public static c$d c(Type p0){
       if (p0 instanceof TypeVariable) {
          return new c$d(p0);
       }
       return null;
    }
    public boolean a(Type p0){
       if (p0 instanceof TypeVariable) {
          return this.b(p0);
       }
       return false;
    }
    public final boolean b(TypeVariable p0){
       boolean b = (this.a.getGenericDeclaration().equals(p0.getGenericDeclaration()) && (this.a.getName()).equals(p0.getName()))? true: false;
       return b;
    }
    public boolean equals(Object p0){
       if (p0 instanceof c$d) {
          return this.b(p0.a);
       }
       return false;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{this.a.getGenericDeclaration(),this.a.getName()};
       return k.b(objArray);
    }
    public String toString(){
       return this.a.toString();
    }
}
