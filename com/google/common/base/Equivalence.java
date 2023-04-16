package com.google.common.base.Equivalence;
import java.lang.Object;
import com.google.common.base.Equivalence$Equals;
import com.google.common.base.Equivalence$Identity;
import ok.o;
import com.google.common.base.Equivalence$EquivalentToPredicate;
import ok.h;
import com.google.common.base.FunctionalEquivalence;
import com.google.common.base.PairwiseEquivalence;
import com.google.common.base.Equivalence$Wrapper;
import com.google.common.base.Equivalence$a;

public abstract class Equivalence	// class@001718
{

    public void Equivalence(){
       super();
    }
    public static Equivalence equals(){
       return Equivalence$Equals.INSTANCE;
    }
    public static Equivalence identity(){
       return Equivalence$Identity.INSTANCE;
    }
    public abstract boolean doEquivalent(Object p0,Object p1);
    public abstract int doHash(Object p0);
    public final boolean equivalent(Object p0,Object p1){
       if (p0 == p1) {
          return true;
       }
       if (p0 == null || p1 == null) {
          return false;
       }
       return this.doEquivalent(p0, p1);
    }
    public final o equivalentTo(Object p0){
       return new Equivalence$EquivalentToPredicate(this, p0);
    }
    public final int hash(Object p0){
       if (p0 == null) {
          return 0;
       }
       return this.doHash(p0);
    }
    public final Equivalence onResultOf(h p0){
       return new FunctionalEquivalence(p0, this);
    }
    public final Equivalence pairwise(){
       return new PairwiseEquivalence(this);
    }
    public final Equivalence$Wrapper wrap(Object p0){
       return new Equivalence$Wrapper(this, p0, null);
    }
}
