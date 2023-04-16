package com.google.common.collect.Cut$BelowAll;
import com.google.common.collect.Cut;
import java.lang.Comparable;
import qk.i;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.AssertionError;
import java.lang.IllegalStateException;
import java.lang.System;
import com.google.common.collect.BoundType;

public final class Cut$BelowAll extends Cut	// class@0017b9
{
    public static final Cut$BelowAll INSTANCE;
    public static final long serialVersionUID;

    static {
       Cut$BelowAll.INSTANCE = new Cut$BelowAll();
    }
    public void Cut$BelowAll(){
       super(null);
    }
    public Cut canonical(i p0){
       try{
          p0.b();
          throw null;
       }catch(java.util.NoSuchElementException e0){
          return e0;
       }
    }
    public int compareTo(Cut p0){
       int i = (p0 == this)? 0: -1;
       return i;
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public void describeAsLowerBound(StringBuilder p0){
       p0+"\(-¡Þ";
    }
    public void describeAsUpperBound(StringBuilder p0){
       throw new AssertionError();
    }
    public Comparable endpoint(){
       throw new IllegalStateException("range unbounded on this side");
    }
    public Comparable greatestValueBelow(i p0){
       throw new AssertionError();
    }
    public int hashCode(){
       return System.identityHashCode(this);
    }
    public boolean isLessThan(Comparable p0){
       return true;
    }
    public Comparable leastValueAbove(i p0){
       p0.b();
       throw null;
    }
    public final Object readResolve(){
       return Cut$BelowAll.INSTANCE;
    }
    public String toString(){
       return "-¡Þ";
    }
    public BoundType typeAsLowerBound(){
       throw new IllegalStateException();
    }
    public BoundType typeAsUpperBound(){
       throw new AssertionError("this statement should be unreachable");
    }
    public Cut withLowerBoundType(BoundType p0,i p1){
       throw new IllegalStateException();
    }
    public Cut withUpperBoundType(BoundType p0,i p1){
       throw new AssertionError("this statement should be unreachable");
    }
}
