package com.google.common.base.FunctionalEquivalence;
import java.io.Serializable;
import com.google.common.base.Equivalence;
import ok.h;
import java.lang.Object;
import ok.n;
import ok.k;
import java.lang.String;
import java.lang.StringBuilder;

public final class FunctionalEquivalence extends Equivalence implements Serializable	// class@001719
{
    public final h function;
    public final Equivalence resultEquivalence;
    public static final long serialVersionUID;

    public void FunctionalEquivalence(h p0,Equivalence p1){
       super();
       n.j(p0);
       this.function = p0;
       n.j(p1);
       this.resultEquivalence = p1;
    }
    public boolean doEquivalent(Object p0,Object p1){
       return this.resultEquivalence.equivalent(this.function.apply(p0), this.function.apply(p1));
    }
    public int doHash(Object p0){
       return this.resultEquivalence.hash(this.function.apply(p0));
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof FunctionalEquivalence) {
          return false;
       }
       if (!this.function.equals(p0.function) || !this.resultEquivalence.equals(p0.resultEquivalence)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{this.function,this.resultEquivalence};
       return k.b(objArray);
    }
    public String toString(){
       return this.resultEquivalence+".onResultOf\("+this.function+"\)";
    }
}
