package com.google.common.collect.Cut$AboveValue;
import com.google.common.collect.Cut;
import java.lang.Comparable;
import java.lang.Object;
import ok.n;
import qk.i;
import java.lang.StringBuilder;
import com.google.common.collect.Range;
import java.lang.String;
import com.google.common.collect.BoundType;
import com.google.common.collect.Cut$a;
import java.lang.Enum;
import java.lang.AssertionError;

public final class Cut$AboveValue extends Cut	// class@0017b8
{
    public static final long serialVersionUID;

    public void Cut$AboveValue(Comparable p0){
       n.j(p0);
       super(p0);
    }
    public Cut canonical(i p0){
       Comparable uComparable = this.leastValueAbove(p0);
       Cut uCut = (uComparable != null)? Cut.belowValue(uComparable): Cut.aboveAll();
       return uCut;
    }
    public int compareTo(Object p0){
       return super.compareTo(p0);
    }
    public void describeAsLowerBound(StringBuilder p0){
       p0+'('+this.endpoint;
    }
    public void describeAsUpperBound(StringBuilder p0){
       p0+this.endpoint+']';
    }
    public Comparable greatestValueBelow(i p0){
       return this.endpoint;
    }
    public int hashCode(){
       return (~ this.endpoint.hashCode());
    }
    public boolean isLessThan(Comparable p0){
       boolean b = (Range.compareOrThrow(this.endpoint, p0) < 0)? true: false;
       return b;
    }
    public Comparable leastValueAbove(i p0){
       return p0.c(this.endpoint);
    }
    public String toString(){
       return "/"+this.endpoint+"\\";
    }
    public BoundType typeAsLowerBound(){
       return BoundType.OPEN;
    }
    public BoundType typeAsUpperBound(){
       return BoundType.CLOSED;
    }
    public Cut withLowerBoundType(BoundType p0,i p1){
       int i = Cut$a.a[p0.ordinal()];
       if (i != 1) {
          if (i == 2) {
             return this;
          }else {
             throw new AssertionError();
          }
       }else {
          Comparable uComparable = p1.c(this.endpoint);
          Cut uCut = (uComparable == null)? Cut.belowAll(): Cut.belowValue(uComparable);
          return uCut;
       }
    }
    public Cut withUpperBoundType(BoundType p0,i p1){
       int i = Cut$a.a[p0.ordinal()];
       if (i == 1) {
          return this;
       }
       if (i != 2) {
          throw new AssertionError();
       }
       Comparable uComparable = p1.c(this.endpoint);
       Cut uCut = (uComparable == null)? Cut.aboveAll(): Cut.belowValue(uComparable);
       return uCut;
    }
}
