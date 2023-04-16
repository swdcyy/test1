package com.google.common.collect.EvictingQueue;
import java.io.Serializable;
import qk.u;
import java.lang.String;
import ok.n;
import java.util.ArrayDeque;
import java.lang.Object;
import qk.p;
import java.util.Queue;
import java.util.Collection;
import java.lang.Iterable;
import qk.y;

public final class EvictingQueue extends u implements Serializable	// class@0017c6
{
    public final Queue delegate;
    public final int maxSize;
    public static final long serialVersionUID;

    public void EvictingQueue(int p0){
       super();
       boolean b = (p0 >= 0)? true: false;
       n.d(b, "maxSize \(%s\) must >= 0", p0);
       this.delegate = new ArrayDeque(p0);
       this.maxSize = p0;
       return;
    }
    public static EvictingQueue create(int p0){
       return new EvictingQueue(p0);
    }
    public boolean add(Object p0){
       n.j(p0);
       if (this.maxSize == null) {
          return true;
       }
       if (this.size() == this.maxSize) {
          this.delegate.remove();
       }
       this.delegate.add(p0);
       return true;
    }
    public boolean addAll(Collection p0){
       int i = p0.size();
       if (i < this.maxSize) {
          return this.standardAddAll(p0);
       }
       this.clear();
       return y.a(this, y.s(p0, (i - this.maxSize)));
    }
    public boolean contains(Object p0){
       n.j(p0);
       return this.delegate().contains(p0);
    }
    public Object delegate(){
       return this.delegate();
    }
    public Collection delegate(){
       return this.delegate();
    }
    public Queue delegate(){
       return this.delegate;
    }
    public boolean offer(Object p0){
       return this.add(p0);
    }
    public int remainingCapacity(){
       return (this.maxSize - this.size());
    }
    public boolean remove(Object p0){
       n.j(p0);
       return this.delegate().remove(p0);
    }
}
