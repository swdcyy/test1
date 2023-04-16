package com.google.common.collect.ComparatorOrdering;
import java.io.Serializable;
import com.google.common.collect.Ordering;
import java.util.Comparator;
import java.lang.Object;
import ok.n;
import java.lang.String;

public final class ComparatorOrdering extends Ordering implements Serializable	// class@0017b5
{
    public final Comparator comparator;
    public static final long serialVersionUID;

    public void ComparatorOrdering(Comparator p0){
       super();
       n.j(p0);
       this.comparator = p0;
    }
    public int compare(Object p0,Object p1){
       return this.comparator.compare(p0, p1);
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof ComparatorOrdering) {
          return this.comparator.equals(p0.comparator);
       }
       return false;
    }
    public int hashCode(){
       return this.comparator.hashCode();
    }
    public String toString(){
       return this.comparator.toString();
    }
}
