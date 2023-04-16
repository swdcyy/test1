package com.google.common.collect.AbstractMapBasedMultimap$k$a;
import java.util.Iterator;
import com.google.common.collect.AbstractMapBasedMultimap$k;
import java.lang.Object;
import java.util.Collection;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.ConcurrentModificationException;

public class AbstractMapBasedMultimap$k$a implements Iterator	// class@001799
{
    public final Iterator b;
    public final Collection c;
    public final AbstractMapBasedMultimap$k d;

    public void AbstractMapBasedMultimap$k$a(AbstractMapBasedMultimap$k p0){
       this.d = p0;
       super();
       p0 = p0.c;
       this.c = p0;
       this.b = AbstractMapBasedMultimap.iteratorOrListIterator(p0);
    }
    public void AbstractMapBasedMultimap$k$a(AbstractMapBasedMultimap$k p0,Iterator p1){
       this.d = p0;
       super();
       this.c = p0.c;
       this.b = p1;
    }
    public void a(){
       this.d.m();
       if (this.d.c == this.c) {
          return;
       }
       throw new ConcurrentModificationException();
    }
    public boolean hasNext(){
       this.a();
       return this.b.hasNext();
    }
    public Object next(){
       this.a();
       return this.b.next();
    }
    public void remove(){
       this.b.remove();
       AbstractMapBasedMultimap$k$a td = this.d;
       AbstractMapBasedMultimap$k f = td.f;
       f.totalSize = f.totalSize - 1;
       td.n();
    }
}
