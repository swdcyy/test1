package com.google.common.collect.AbstractMapBasedMultimap$d;
import java.util.Iterator;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.lang.Object;
import java.util.Set;
import java.util.Map;
import com.google.common.collect.Iterators;
import java.util.Map$Entry;
import java.util.Collection;

public abstract class AbstractMapBasedMultimap$d implements Iterator	// class@001791
{
    public final Iterator b;
    public Object c;
    public Collection d;
    public Iterator e;
    public final AbstractMapBasedMultimap f;

    public void AbstractMapBasedMultimap$d(AbstractMapBasedMultimap p0){
       this.f = p0;
       super();
       this.b = p0.map.entrySet().iterator();
       this.c = null;
       this.d = null;
       this.e = Iterators.j();
    }
    public abstract Object a(Object p0,Object p1);
    public boolean hasNext(){
       boolean b = (this.b.hasNext() || this.e.hasNext())? true: false;
       return b;
    }
    public Object next(){
       if (!this.e.hasNext()) {
          Map$Entry uEntry = this.b.next();
          this.c = uEntry.getKey();
          Collection value = uEntry.getValue();
          this.d = value;
          this.e = value.iterator();
       }
       return this.a(this.c, this.e.next());
    }
    public void remove(){
       this.e.remove();
       if (this.d.isEmpty()) {
          this.b.remove();
       }
       AbstractMapBasedMultimap$d tf = this.f;
       tf.totalSize = tf.totalSize - 1;
       return;
    }
}
