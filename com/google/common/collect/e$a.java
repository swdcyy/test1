package com.google.common.collect.e$a;
import java.util.AbstractCollection;
import java.util.Collection;
import ok.o;
import java.lang.Object;
import ok.n;
import java.util.Iterator;
import java.lang.Iterable;
import qk.y;
import com.google.common.collect.e;
import qk.t0;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import com.google.common.collect.Lists;

public class e$a extends AbstractCollection	// class@0018b3
{
    public final Collection b;
    public final o c;

    public void e$a(Collection p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public boolean add(Object p0){
       n.b(this.c.apply(p0));
       return this.b.add(p0);
    }
    public boolean addAll(Collection p0){
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          n.b(this.c.apply(iterator.next()));
       }
       return this.b.addAll(p0);
    }
    public void clear(){
       y.q(this.b, this.c);
    }
    public boolean contains(Object p0){
       if (e.e(this.b, p0)) {
          return this.c.apply(p0);
       }
       return false;
    }
    public boolean containsAll(Collection p0){
       return e.b(this, p0);
    }
    public boolean isEmpty(){
       return (y.c(this.b, this.c) ^ 0x01);
    }
    public Iterator iterator(){
       return Iterators.k(this.b.iterator(), this.c);
    }
    public boolean remove(Object p0){
       boolean b = (this.contains(p0) && this.b.remove(p0))? true: false;
       return b;
    }
    public boolean removeAll(Collection p0){
       Iterator iterator = this.b.iterator();
       boolean b = false;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (this.c.apply(obj) && p0.contains(obj)) {
             iterator.remove();
             b = true;
          }
       }
       return b;
    }
    public boolean retainAll(Collection p0){
       Iterator iterator = this.b.iterator();
       boolean b = false;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (this.c.apply(obj) && !p0.contains(obj)) {
             iterator.remove();
             b = true;
          }
       }
       return b;
    }
    public int size(){
       Iterator iterator = this.b.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          if (this.c.apply(iterator.next())) {
             i = i + 1;
          }
       }
       return i;
    }
    public Object[] toArray(){
       return Lists.d(this.iterator()).toArray();
    }
    public Object[] toArray(Object[] p0){
       return Lists.d(this.iterator()).toArray(p0);
    }
}
