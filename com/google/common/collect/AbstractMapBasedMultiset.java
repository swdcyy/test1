package com.google.common.collect.AbstractMapBasedMultiset;
import java.io.Serializable;
import com.google.common.collect.b;
import java.lang.Object;
import java.lang.String;
import ok.n;
import com.google.common.collect.l;
import com.google.common.collect.k;
import java.util.Arrays;
import java.util.Iterator;
import com.google.common.collect.AbstractMapBasedMultiset$a;
import com.google.common.collect.AbstractMapBasedMultiset$b;
import com.google.common.collect.Multisets$d;
import java.util.Set;
import java.io.ObjectInputStream;
import com.google.common.collect.m;
import qk.g;
import java.util.Objects;
import qk.w;
import com.google.common.primitives.Ints;
import java.io.ObjectOutputStream;
import com.google.common.collect.k$a;

public abstract class AbstractMapBasedMultiset extends b implements Serializable	// class@0017a2
{
    public l backingMap;
    public long size;
    public static final long serialVersionUID;

    public void AbstractMapBasedMultiset(int p0){
       super();
       this.init(p0);
    }
    public final int add(Object p0,int p1){
       if (!p1) {
          return this.count(p0);
       }
       AbstractMapBasedMultiset uAbstractMap = 1;
       int b = (p1 > 0)? true: false;
       n.d(b, "occurrences cannot be negative: %s", p1);
       b = this.backingMap.j(p0);
       if (b == -1) {
          this.backingMap.n(p0, p1);
          this.size = this.size + (long)p1;
          return 0;
       }else {
          int i = this.backingMap.h(b);
          long l = (long)p1;
          long l1 = (long)i + l;
          if (l1 - 0x7fffffff > 0) {
             uAbstractMap = false;
          }
          n.e(uAbstractMap, "too many occurrences: %s", l1);
          this.backingMap.s(b, (int)l1);
          this.size = this.size + l;
          return i;
       }
    }
    public void addTo(k p0){
       n.j(p0);
       for (int i = this.backingMap.b(); i >= 0; i = this.backingMap.m(i)) {
          p0.add(this.backingMap.f(i), this.backingMap.h(i));
       }
       return;
    }
    public final void clear(){
       AbstractMapBasedMultiset tbackingMap = this.backingMap;
       tbackingMap.d = tbackingMap.d + 1;
       Arrays.fill(tbackingMap.a, 0, tbackingMap.c, null);
       Arrays.fill(tbackingMap.b, 0, tbackingMap.c, 0);
       Arrays.fill(tbackingMap.e, -1);
       Arrays.fill(tbackingMap.f, -1);
       tbackingMap.c = 0;
       this.size = 0;
    }
    public final int count(Object p0){
       return this.backingMap.c(p0);
    }
    public final int distinctElements(){
       return this.backingMap.t();
    }
    public final Iterator elementIterator(){
       return new AbstractMapBasedMultiset$a(this);
    }
    public final Iterator entryIterator(){
       return new AbstractMapBasedMultiset$b(this);
    }
    public abstract void init(int p0);
    public final Iterator iterator(){
       return new Multisets$d(this, this.entrySet().iterator());
    }
    public final void readObject(ObjectInputStream p0){
       p0.defaultReadObject();
       int i = m.c(p0);
       this.init(3);
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.add(p0.readObject(), p0.readInt());
       }
       return;
    }
    public final int remove(Object p0,int p1){
       if (!p1) {
          return this.count(p0);
       }
       int i = 0;
       boolean b = (p1 > 0)? true: false;
       n.d(b, "occurrences cannot be negative: %s", p1);
       int i1 = this.backingMap.j(p0);
       if (i1 == -1) {
          return i;
       }else {
          i = this.backingMap.h(i1);
          if (i > p1) {
             this.backingMap.s(i1, (i - p1));
          }else {
             this.backingMap.p(i1);
             p1 = i;
          }
          this.size = this.size - (long)p1;
          return i;
       }
    }
    public final int setCount(Object p0,int p1){
       int i;
       g.b(p1, "count");
       AbstractMapBasedMultiset tbackingMap = this.backingMap;
       if (!p1) {
          Objects.requireNonNull(tbackingMap);
          i = tbackingMap.o(p0, w.c(p0));
       }else {
          i = tbackingMap.n(p0, p1);
       }
       this.size = this.size + (long)(p1 - i);
       return i;
    }
    public final boolean setCount(Object p0,int p1,int p2){
       g.b(p1, "oldCount");
       g.b(p2, "newCount");
       int i = this.backingMap.j(p0);
       boolean b = false;
       if (i == -1) {
          if (p1) {
             return b;
          }else if(p2 > 0){
             this.backingMap.n(p0, p2);
             this.size = this.size + (long)p2;
          }
          return true;
       }else if(this.backingMap.h(i) != p1){
          return b;
       }else if(!p2){
          this.backingMap.p(i);
          this.size = this.size - (long)p1;
       }else {
          this.backingMap.s(i, p2);
          this.size = this.size + (long)(p2 - p1);
       }
       return true;
    }
    public final int size(){
       return Ints.d(this.size);
    }
    public final void writeObject(ObjectOutputStream p0){
       p0.defaultWriteObject();
       p0.writeInt(this.entrySet().size());
       Iterator iterator = this.entrySet().iterator();
       while (iterator.hasNext()) {
          k$a uoa = iterator.next();
          p0.writeObject(uoa.getElement());
          p0.writeInt(uoa.getCount());
       }
       return;
    }
}
