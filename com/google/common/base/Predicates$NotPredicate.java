package com.google.common.base.Predicates$NotPredicate;
import ok.o;
import java.io.Serializable;
import java.lang.Object;
import ok.n;
import java.lang.String;
import java.lang.StringBuilder;

public class Predicates$NotPredicate implements o, Serializable	// class@001725
{
    public final o predicate;
    public static final long serialVersionUID;

    public void Predicates$NotPredicate(o p0){
       super();
       n.j(p0);
       this.predicate = p0;
    }
    public boolean apply(Object p0){
       return (this.predicate.apply(p0) ^ 0x01);
    }
    public boolean equals(Object p0){
       if (p0 instanceof Predicates$NotPredicate) {
          return this.predicate.equals(p0.predicate);
       }
       return false;
    }
    public int hashCode(){
       return (~ this.predicate.hashCode());
    }
    public String toString(){
       return "Predicates.not\("+this.predicate+"\)";
    }
}
