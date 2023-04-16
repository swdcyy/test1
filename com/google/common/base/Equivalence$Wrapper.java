package com.google.common.base.Equivalence$Wrapper;
import java.io.Serializable;
import com.google.common.base.Equivalence;
import java.lang.Object;
import com.google.common.base.Equivalence$a;
import ok.n;
import java.lang.String;
import java.lang.StringBuilder;

public final class Equivalence$Wrapper implements Serializable	// class@001716
{
    public final Equivalence equivalence;
    public final Object reference;
    public static final long serialVersionUID;

    public void Equivalence$Wrapper(Equivalence p0,Object p1,Equivalence$a p2){
       super();
       n.j(p0);
       this.equivalence = p0;
       this.reference = p1;
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof Equivalence$Wrapper && this.equivalence.equals(p0.equivalence)) {
          return this.equivalence.equivalent(this.reference, p0.reference);
       }
       return false;
    }
    public Object get(){
       return this.reference;
    }
    public int hashCode(){
       return this.equivalence.hash(this.reference);
    }
    public String toString(){
       return this.equivalence+".wrap\("+this.reference+"\)";
    }
}
