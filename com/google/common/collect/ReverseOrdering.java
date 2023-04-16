package com.google.common.collect.ReverseOrdering;
import java.io.Serializable;
import com.google.common.collect.Ordering;
import java.lang.Object;
import ok.n;
import java.lang.Iterable;
import java.util.Iterator;
import java.lang.String;
import java.lang.StringBuilder;

public final class ReverseOrdering extends Ordering implements Serializable	// class@00187c
{
    public final Ordering forwardOrder;
    public static final long serialVersionUID;

    public void ReverseOrdering(Ordering p0){
       super();
       n.j(p0);
       this.forwardOrder = p0;
    }
    public int compare(Object p0,Object p1){
       return this.forwardOrder.compare(p1, p0);
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof ReverseOrdering) {
          return this.forwardOrder.equals(p0.forwardOrder);
       }
       return false;
    }
    public int hashCode(){
       return (- this.forwardOrder.hashCode());
    }
    public Object max(Iterable p0){
       return this.forwardOrder.min(p0);
    }
    public Object max(Object p0,Object p1){
       return this.forwardOrder.min(p0, p1);
    }
    public Object max(Object p0,Object p1,Object p2,Object[] p3){
       return this.forwardOrder.min(p0, p1, p2, p3);
    }
    public Object max(Iterator p0){
       return this.forwardOrder.min(p0);
    }
    public Object min(Iterable p0){
       return this.forwardOrder.max(p0);
    }
    public Object min(Object p0,Object p1){
       return this.forwardOrder.max(p0, p1);
    }
    public Object min(Object p0,Object p1,Object p2,Object[] p3){
       return this.forwardOrder.max(p0, p1, p2, p3);
    }
    public Object min(Iterator p0){
       return this.forwardOrder.max(p0);
    }
    public Ordering reverse(){
       return this.forwardOrder;
    }
    public String toString(){
       return this.forwardOrder+".reverse\(\)";
    }
}
