package com.google.common.collect.NaturalOrdering;
import java.io.Serializable;
import com.google.common.collect.Ordering;
import java.lang.Comparable;
import java.lang.Object;
import ok.n;
import com.google.common.collect.ReverseNaturalOrdering;
import java.lang.String;

public final class NaturalOrdering extends Ordering implements Serializable	// class@001863
{
    public Ordering b;
    public Ordering c;
    public static final NaturalOrdering INSTANCE;
    public static final long serialVersionUID;

    static {
       NaturalOrdering.INSTANCE = new NaturalOrdering();
    }
    public void NaturalOrdering(){
       super();
    }
    public int compare(Comparable p0,Comparable p1){
       n.j(p0);
       n.j(p1);
       return p0.compareTo(p1);
    }
    public int compare(Object p0,Object p1){
       return this.compare(p0, p1);
    }
    public Ordering nullsFirst(){
       NaturalOrdering tb = this.b;
       if (tb == null) {
          tb = super.nullsFirst();
          this.b = tb;
       }
       return tb;
    }
    public Ordering nullsLast(){
       NaturalOrdering tc = this.c;
       if (tc == null) {
          tc = super.nullsLast();
          this.c = tc;
       }
       return tc;
    }
    public final Object readResolve(){
       return NaturalOrdering.INSTANCE;
    }
    public Ordering reverse(){
       return ReverseNaturalOrdering.INSTANCE;
    }
    public String toString(){
       return "Ordering.natural\(\)";
    }
}
