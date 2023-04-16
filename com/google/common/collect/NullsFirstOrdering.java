package com.google.common.collect.NullsFirstOrdering;
import java.io.Serializable;
import com.google.common.collect.Ordering;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class NullsFirstOrdering extends Ordering implements Serializable	// class@001864
{
    public final Ordering ordering;
    public static final long serialVersionUID;

    public void NullsFirstOrdering(Ordering p0){
       super();
       this.ordering = p0;
    }
    public int compare(Object p0,Object p1){
       if (p0 == p1) {
          return 0;
       }
       if (p0 == null) {
          return -1;
       }
       if (p1 == null) {
          return 1;
       }
       return this.ordering.compare(p0, p1);
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof NullsFirstOrdering) {
          return this.ordering.equals(p0.ordering);
       }
       return false;
    }
    public int hashCode(){
       return (this.ordering.hashCode() ^ 0x39153a74);
    }
    public Ordering nullsFirst(){
       return this;
    }
    public Ordering nullsLast(){
       return this.ordering.nullsLast();
    }
    public Ordering reverse(){
       return this.ordering.reverse().nullsLast();
    }
    public String toString(){
       return this.ordering+".nullsFirst\(\)";
    }
}
