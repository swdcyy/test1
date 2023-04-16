package com.google.common.collect.NullsLastOrdering;
import java.io.Serializable;
import com.google.common.collect.Ordering;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class NullsLastOrdering extends Ordering implements Serializable	// class@001865
{
    public final Ordering ordering;
    public static final long serialVersionUID;

    public void NullsLastOrdering(Ordering p0){
       super();
       this.ordering = p0;
    }
    public int compare(Object p0,Object p1){
       if (p0 == p1) {
          return 0;
       }
       if (p0 == null) {
          return 1;
       }
       if (p1 == null) {
          return -1;
       }
       return this.ordering.compare(p0, p1);
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof NullsLastOrdering) {
          return this.ordering.equals(p0.ordering);
       }
       return false;
    }
    public int hashCode(){
       return (this.ordering.hashCode() ^ -921210296);
    }
    public Ordering nullsFirst(){
       return this.ordering.nullsFirst();
    }
    public Ordering nullsLast(){
       return this;
    }
    public Ordering reverse(){
       return this.ordering.reverse().nullsFirst();
    }
    public String toString(){
       return this.ordering+".nullsLast\(\)";
    }
}
