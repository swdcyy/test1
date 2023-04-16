package com.google.common.base.Equivalence$EquivalentToPredicate;
import ok.o;
import java.io.Serializable;
import com.google.common.base.Equivalence;
import java.lang.Object;
import ok.n;
import ok.k;
import java.lang.String;
import java.lang.StringBuilder;

public final class Equivalence$EquivalentToPredicate implements o, Serializable	// class@001714
{
    public final Equivalence equivalence;
    public final Object target;
    public static final long serialVersionUID;

    public void Equivalence$EquivalentToPredicate(Equivalence p0,Object p1){
       super();
       n.j(p0);
       this.equivalence = p0;
       this.target = p1;
    }
    public boolean apply(Object p0){
       return this.equivalence.equivalent(p0, this.target);
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof Equivalence$EquivalentToPredicate) {
          return false;
       }
       if (!this.equivalence.equals(p0.equivalence) || !k.a(this.target, p0.target)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{this.equivalence,this.target};
       return k.b(objArray);
    }
    public String toString(){
       return this.equivalence+".equivalentTo\("+this.target+"\)";
    }
}
