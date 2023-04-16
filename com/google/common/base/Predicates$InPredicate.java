package com.google.common.base.Predicates$InPredicate;
import ok.o;
import java.io.Serializable;
import java.util.Collection;
import java.lang.Object;
import ok.n;
import com.google.common.base.Predicates$a;
import java.lang.String;
import java.lang.StringBuilder;

public class Predicates$InPredicate implements o, Serializable	// class@001722
{
    public final Collection target;
    public static final long serialVersionUID;

    public void Predicates$InPredicate(Collection p0){
       super();
       n.j(p0);
       this.target = p0;
    }
    public void Predicates$InPredicate(Collection p0,Predicates$a p1){
       super(p0);
    }
    public boolean apply(Object p0){
       try{
          return this.target.contains(p0);
       }catch(java.lang.NullPointerException e0){
          return false;
       }catch(java.lang.ClassCastException e0){
       }
    }
    public boolean equals(Object p0){
       if (p0 instanceof Predicates$InPredicate) {
          return this.target.equals(p0.target);
       }
       return false;
    }
    public int hashCode(){
       return this.target.hashCode();
    }
    public String toString(){
       return "Predicates.in\("+this.target+"\)";
    }
}
