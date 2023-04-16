package com.google.common.base.Predicates$InstanceOfPredicate;
import ok.o;
import java.io.Serializable;
import java.lang.Class;
import java.lang.Object;
import ok.n;
import com.google.common.base.Predicates$a;
import java.lang.String;
import java.lang.StringBuilder;

public class Predicates$InstanceOfPredicate implements o, Serializable	// class@001723
{
    public final Class clazz;
    public static final long serialVersionUID;

    public void Predicates$InstanceOfPredicate(Class p0){
       super();
       n.j(p0);
       this.clazz = p0;
    }
    public void Predicates$InstanceOfPredicate(Class p0,Predicates$a p1){
       super(p0);
    }
    public boolean apply(Object p0){
       return this.clazz.isInstance(p0);
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof Predicates$InstanceOfPredicate && this.clazz == p0.clazz) {
          b = true;
       }
       return b;
    }
    public int hashCode(){
       return this.clazz.hashCode();
    }
    public String toString(){
       return "Predicates.instanceOf\("+this.clazz.getName()+"\)";
    }
}
