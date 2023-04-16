package com.google.common.collect.ReverseNaturalOrdering;
import java.io.Serializable;
import com.google.common.collect.Ordering;
import java.lang.Comparable;
import java.lang.Object;
import ok.n;
import com.google.common.collect.NaturalOrdering;
import java.lang.Iterable;
import java.util.Iterator;
import java.lang.String;

public final class ReverseNaturalOrdering extends Ordering implements Serializable	// class@00187b
{
    public static final ReverseNaturalOrdering INSTANCE;
    public static final long serialVersionUID;

    static {
       ReverseNaturalOrdering.INSTANCE = new ReverseNaturalOrdering();
    }
    public void ReverseNaturalOrdering(){
       super();
    }
    public int compare(Comparable p0,Comparable p1){
       n.j(p0);
       if (p0 == p1) {
          return 0;
       }
       return p1.compareTo(p0);
    }
    public int compare(Object p0,Object p1){
       return this.compare(p0, p1);
    }
    public Comparable max(Comparable p0,Comparable p1){
       return NaturalOrdering.INSTANCE.min(p0, p1);
    }
    public Comparable max(Comparable p0,Comparable p1,Comparable p2,Comparable[] p3){
       return NaturalOrdering.INSTANCE.min(p0, p1, p2, p3);
    }
    public Comparable max(Iterable p0){
       return NaturalOrdering.INSTANCE.min(p0);
    }
    public Comparable max(Iterator p0){
       return NaturalOrdering.INSTANCE.min(p0);
    }
    public Object max(Iterable p0){
       return this.max(p0);
    }
    public Object max(Object p0,Object p1){
       return this.max(p0, p1);
    }
    public Object max(Object p0,Object p1,Object p2,Object[] p3){
       return this.max(p0, p1, p2, p3);
    }
    public Object max(Iterator p0){
       return this.max(p0);
    }
    public Comparable min(Comparable p0,Comparable p1){
       return NaturalOrdering.INSTANCE.max(p0, p1);
    }
    public Comparable min(Comparable p0,Comparable p1,Comparable p2,Comparable[] p3){
       return NaturalOrdering.INSTANCE.max(p0, p1, p2, p3);
    }
    public Comparable min(Iterable p0){
       return NaturalOrdering.INSTANCE.max(p0);
    }
    public Comparable min(Iterator p0){
       return NaturalOrdering.INSTANCE.max(p0);
    }
    public Object min(Iterable p0){
       return this.min(p0);
    }
    public Object min(Object p0,Object p1){
       return this.min(p0, p1);
    }
    public Object min(Object p0,Object p1,Object p2,Object[] p3){
       return this.min(p0, p1, p2, p3);
    }
    public Object min(Iterator p0){
       return this.min(p0);
    }
    public final Object readResolve(){
       return ReverseNaturalOrdering.INSTANCE;
    }
    public Ordering reverse(){
       return Ordering.natural();
    }
    public String toString(){
       return "Ordering.natural\(\).reverse\(\)";
    }
}
