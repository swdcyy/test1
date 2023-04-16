package com.google.common.collect.AbstractMapBasedMultiset$c;
import java.util.Iterator;
import com.google.common.collect.AbstractMapBasedMultiset;
import java.lang.Object;
import com.google.common.collect.l;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import qk.g;
import java.util.Objects;

public abstract class AbstractMapBasedMultiset$c implements Iterator	// class@0017a1
{
    public int b;
    public int c;
    public int d;
    public final AbstractMapBasedMultiset e;

    public void AbstractMapBasedMultiset$c(AbstractMapBasedMultiset p0){
       this.e = p0;
       super();
       this.b = p0.backingMap.b();
       this.c = -1;
       this.d = p0.backingMap.d;
    }
    public final void a(){
       if (this.e.backingMap.d == this.d) {
          return;
       }
       throw new ConcurrentModificationException();
    }
    public abstract Object b(int p0);
    public boolean hasNext(){
       this.a();
       boolean b = (this.b >= null)? true: false;
       return b;
    }
    public Object next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       AbstractMapBasedMultiset$c tb = this.b;
       this.c = tb;
       this.b = this.e.backingMap.m(tb);
       return this.b(this.b);
    }
    public void remove(){
       this.a();
       boolean b = (this.c != -1)? true: false;
       g.c(b);
       AbstractMapBasedMultiset$c te = this.e;
       te.size = te.size - (long)te.backingMap.p(this.c);
       Objects.requireNonNull(this.e.backingMap);
       this.b = this.b - 1;
       this.c = -1;
       this.d = this.e.backingMap.d;
       return;
    }
}
