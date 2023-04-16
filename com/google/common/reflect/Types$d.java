package com.google.common.reflect.Types$d;
import java.lang.reflect.GenericDeclaration;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Object;
import com.google.common.reflect.Types;
import ok.n;
import com.google.common.collect.ImmutableList;
import com.google.common.reflect.Types$c;
import java.lang.Class;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import com.google.common.reflect.Types$e;
import java.lang.reflect.TypeVariable;

public final class Types$d	// class@001911
{
    public final GenericDeclaration a;
    public final String b;
    public final ImmutableList c;

    public void Types$d(GenericDeclaration p0,String p1,Type[] p2){
       super();
       Types.a(p2, "bound for type variable");
       n.j(p0);
       this.a = p0;
       n.j(p1);
       this.b = p1;
       this.c = ImmutableList.copyOf(p2);
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (Types$c.a) {
          if (p0 != null && (Proxy.isProxyClass(p0.getClass()) && Proxy.getInvocationHandler(p0) instanceof Types$e)) {
             p0 = Proxy.getInvocationHandler(p0).b;
             if (!(this.b).equals(p0.b) || (!this.a.equals(p0.a) || !this.c.equals(p0.c))) {
                b = false;
             }
             return b;
          }else {
             return false;
          }
       }else if(p0 instanceof TypeVariable){
          if (!(this.b).equals(p0.getName()) || !this.a.equals(p0.getGenericDeclaration())) {
             b = false;
          }
          return b;
       }else {
          return false;
       }
    }
    public int hashCode(){
       return (this.a.hashCode() ^ (this.b).hashCode());
    }
    public String toString(){
       return this.b;
    }
}
