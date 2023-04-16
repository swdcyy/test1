package com.google.common.base.Predicates$IsEqualToPredicate;
import ok.o;
import java.io.Serializable;
import java.lang.Object;
import com.google.common.base.Predicates$a;
import java.lang.String;
import java.lang.StringBuilder;

public class Predicates$IsEqualToPredicate implements o, Serializable	// class@001724
{
    public final Object target;
    public static final long serialVersionUID;

    public void Predicates$IsEqualToPredicate(Object p0){
       super();
       this.target = p0;
    }
    public void Predicates$IsEqualToPredicate(Object p0,Predicates$a p1){
       super(p0);
    }
    public boolean apply(Object p0){
       return this.target.equals(p0);
    }
    public boolean equals(Object p0){
       if (p0 instanceof Predicates$IsEqualToPredicate) {
          return this.target.equals(p0.target);
       }
       return false;
    }
    public int hashCode(){
       return this.target.hashCode();
    }
    public String toString(){
       return "Predicates.equalTo\("+this.target+"\)";
    }
}
