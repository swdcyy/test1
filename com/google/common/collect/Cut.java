package com.google.common.collect.Cut;
import java.lang.Comparable;
import java.io.Serializable;
import java.lang.Object;
import com.google.common.collect.Cut$AboveAll;
import com.google.common.collect.Cut$AboveValue;
import com.google.common.collect.Cut$BelowAll;
import com.google.common.collect.Cut$BelowValue;
import qk.i;
import com.google.common.collect.Range;
import vk.a;
import java.lang.StringBuilder;
import com.google.common.collect.BoundType;

public abstract class Cut implements Comparable, Serializable	// class@0017bc
{
    public final Comparable endpoint;
    public static final long serialVersionUID;

    public void Cut(Comparable p0){
       super();
       this.endpoint = p0;
    }
    public static Cut aboveAll(){
       return Cut$AboveAll.INSTANCE;
    }
    public static Cut aboveValue(Comparable p0){
       return new Cut$AboveValue(p0);
    }
    public static Cut belowAll(){
       return Cut$BelowAll.INSTANCE;
    }
    public static Cut belowValue(Comparable p0){
       return new Cut$BelowValue(p0);
    }
    public Cut canonical(i p0){
       return this;
    }
    public int compareTo(Cut p0){
       if (p0 == Cut.belowAll()) {
          return 1;
       }
       if (p0 == Cut.aboveAll()) {
          return -1;
       }
       int i = Range.compareOrThrow(this.endpoint, p0.endpoint);
       if (i) {
          return i;
       }
       return a.a(this instanceof Cut$AboveValue, p0 instanceof Cut$AboveValue);
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public abstract void describeAsLowerBound(StringBuilder p0);
    public abstract void describeAsUpperBound(StringBuilder p0);
    public Comparable endpoint(){
       return this.endpoint;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof Cut) {
          try{
             if (!this.compareTo(p0)) {
                b = true;
             }
          }catch(java.lang.ClassCastException e0){
          }
       }
       return b;
    }
    public abstract Comparable greatestValueBelow(i p0);
    public abstract int hashCode();
    public abstract boolean isLessThan(Comparable p0);
    public abstract Comparable leastValueAbove(i p0);
    public abstract BoundType typeAsLowerBound();
    public abstract BoundType typeAsUpperBound();
    public abstract Cut withLowerBoundType(BoundType p0,i p1);
    public abstract Cut withUpperBoundType(BoundType p0,i p1);
}
