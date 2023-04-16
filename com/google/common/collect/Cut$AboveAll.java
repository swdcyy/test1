package com.google.common.collect.Cut$AboveAll;
import com.google.common.collect.Cut;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.AssertionError;
import java.lang.String;
import java.lang.IllegalStateException;
import qk.i;
import java.util.Objects;
import java.util.NoSuchElementException;
import java.lang.System;
import com.google.common.collect.BoundType;

public final class Cut$AboveAll extends Cut	// class@0017b7
{
    public static final Cut$AboveAll INSTANCE;
    public static final long serialVersionUID;

    static {
       Cut$AboveAll.INSTANCE = new Cut$AboveAll();
    }
    public void Cut$AboveAll(){
       super(null);
    }
    public int compareTo(Cut p0){
       int i = (p0 == this)? 0: 1;
       return i;
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public void describeAsLowerBound(StringBuilder p0){
       throw new AssertionError();
    }
    public void describeAsUpperBound(StringBuilder p0){
       p0+"+¡Þ\)";
    }
    public Comparable endpoint(){
       throw new IllegalStateException("range unbounded on this side");
    }
    public Comparable greatestValueBelow(i p0){
       Objects.requireNonNull(p0);
       throw new NoSuchElementException();
    }
    public int hashCode(){
       return System.identityHashCode(this);
    }
    public boolean isLessThan(Comparable p0){
       return false;
    }
    public Comparable leastValueAbove(i p0){
       throw new AssertionError();
    }
    public final Object readResolve(){
       return Cut$AboveAll.INSTANCE;
    }
    public String toString(){
       return "+¡Þ";
    }
    public BoundType typeAsLowerBound(){
       throw new AssertionError("this statement should be unreachable");
    }
    public BoundType typeAsUpperBound(){
       throw new IllegalStateException();
    }
    public Cut withLowerBoundType(BoundType p0,i p1){
       throw new AssertionError("this statement should be unreachable");
    }
    public Cut withUpperBoundType(BoundType p0,i p1){
       throw new IllegalStateException();
    }
}
