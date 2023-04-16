package com.google.common.base.PairwiseEquivalence;
import java.io.Serializable;
import com.google.common.base.Equivalence;
import java.lang.Object;
import ok.n;
import java.lang.Iterable;
import java.util.Iterator;
import java.lang.String;
import java.lang.StringBuilder;

public final class PairwiseEquivalence extends Equivalence implements Serializable	// class@00171f
{
    public final Equivalence elementEquivalence;
    public static final long serialVersionUID = 0x1;

    public void PairwiseEquivalence(Equivalence p0){
       super();
       n.j(p0);
       this.elementEquivalence = p0;
    }
    public boolean doEquivalent(Iterable p0,Iterable p1){
       boolean b;
       Iterator iterator = p0.iterator();
       Iterator iterator1 = p1.iterator();
       while (true) {
          b = false;
          if (iterator.hasNext() && iterator1.hasNext()) {
             if (!this.elementEquivalence.equivalent(iterator.next(), iterator1.next())) {
                return b;
             }
             continue ;
          }else if(!iterator.hasNext() && !iterator1.hasNext()){
             b = true;
             break ;
          }
          break ;
       }
       return b;
    }
    public boolean doEquivalent(Object p0,Object p1){
       return this.doEquivalent(p0, p1);
    }
    public int doHash(Iterable p0){
       Iterator iterator = p0.iterator();
       int i = 0x13381;
       while (iterator.hasNext()) {
          i = i * 24943;
          i = i + this.elementEquivalence.hash(iterator.next());
       }
       return i;
    }
    public int doHash(Object p0){
       return this.doHash(p0);
    }
    public boolean equals(Object p0){
       if (p0 instanceof PairwiseEquivalence) {
          return this.elementEquivalence.equals(p0.elementEquivalence);
       }
       return false;
    }
    public int hashCode(){
       return (this.elementEquivalence.hashCode() ^ 0x46a3eb07);
    }
    public String toString(){
       return this.elementEquivalence+".pairwise\(\)";
    }
}
