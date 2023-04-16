package com.google.common.collect.b;
import com.google.common.collect.k;
import java.util.AbstractCollection;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.util.Collection;
import ok.n;
import java.lang.Iterable;
import com.google.common.collect.Multisets;
import com.google.common.collect.AbstractMapBasedMultiset;
import java.util.Set;
import java.util.Iterator;
import com.google.common.collect.k$a;
import com.google.common.collect.Iterators;
import com.google.common.collect.b$a;
import com.google.common.collect.b$b;
import java.lang.String;
import qk.g;

public abstract class b extends AbstractCollection implements k	// class@0018ac
{
    public Set b;
    public Set c;

    public void b(){
       super();
    }
    public int add(Object p0,int p1){
       throw new UnsupportedOperationException();
    }
    public final boolean add(Object p0){
       this.add(p0, 1);
       return 1;
    }
    public final boolean addAll(Collection p0){
       n.j(this);
       n.j(p0);
       boolean b = false;
       if (p0 instanceof k) {
          k ok = Multisets.a(p0);
          if (ok instanceof AbstractMapBasedMultiset) {
             if (!ok.isEmpty()) {
                ok.addTo(this);
             }
          }else if(ok.isEmpty()){
             Iterator iterator = ok.entrySet().iterator();
             while (iterator.hasNext()) {
                k$a uoa = iterator.next();
                Object element = uoa.getElement();
                this.add(element, uoa.getCount());
             }
          }
          b = true;
       }else if(p0.isEmpty()){
          b = Iterators.a(this, p0.iterator());
       }
       return b;
    }
    public abstract void clear();
    public boolean contains(Object p0){
       boolean b = (this.count(p0) > 0)? true: false;
       return b;
    }
    public Set createElementSet(){
       return new b$a(this);
    }
    public Set createEntrySet(){
       return new b$b(this);
    }
    public abstract int distinctElements();
    public abstract Iterator elementIterator();
    public Set elementSet(){
       b tb = this.b;
       if (tb == null) {
          tb = this.createElementSet();
          this.b = tb;
       }
       return tb;
    }
    public abstract Iterator entryIterator();
    public Set entrySet(){
       b tc = this.c;
       if (tc == null) {
          tc = this.createEntrySet();
          this.c = tc;
       }
       return tc;
    }
    public final boolean equals(Object p0){
       return Multisets.b(this, p0);
    }
    public final int hashCode(){
       return this.entrySet().hashCode();
    }
    public boolean isEmpty(){
       return this.entrySet().isEmpty();
    }
    public int remove(Object p0,int p1){
       throw new UnsupportedOperationException();
    }
    public final boolean remove(Object p0){
       int i = 1;
       if (this.remove(p0, i) > 0) {
       }else {
          i = false;
       }
       return i;
    }
    public final boolean removeAll(Collection p0){
       Set set;
       if (p0 instanceof k) {
          set = p0.elementSet();
       }
       return this.elementSet().removeAll(set);
    }
    public final boolean retainAll(Collection p0){
       Set set;
       n.j(p0);
       if (p0 instanceof k) {
          set = p0.elementSet();
       }
       return this.elementSet().retainAll(set);
    }
    public int setCount(Object p0,int p1){
       g.b(p1, "count");
       int i = this.count(p0);
       p1 = p1 - i;
       if (p1 > 0) {
          this.add(p0, p1);
       }else if(p1 < 0){
          this.remove(p0, (- p1));
       }
       return i;
    }
    public boolean setCount(Object p0,int p1,int p2){
       boolean b;
       g.b(p1, "oldCount");
       g.b(p2, "newCount");
       if (this.count(p0) == p1) {
          this.setCount(p0, p2);
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public final String toString(){
       return this.entrySet().toString();
    }
}
