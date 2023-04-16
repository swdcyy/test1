package com.google.common.collect.AbstractMapBasedMultimap$e$a;
import java.util.Iterator;
import com.google.common.collect.AbstractMapBasedMultimap$e;
import java.lang.Object;
import java.util.Map$Entry;
import qk.g;
import java.util.Collection;
import com.google.common.collect.AbstractMapBasedMultimap;

public class AbstractMapBasedMultimap$e$a implements Iterator	// class@001792
{
    public Map$Entry b;
    public final Iterator c;
    public final AbstractMapBasedMultimap$e d;

    public void AbstractMapBasedMultimap$e$a(AbstractMapBasedMultimap$e p0,Iterator p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public boolean hasNext(){
       return this.c.hasNext();
    }
    public Object next(){
       Map$Entry uEntry = this.c.next();
       this.b = uEntry;
       return uEntry.getKey();
    }
    public void remove(){
       boolean b = (this.b != null)? true: false;
       g.c(b);
       Collection value = this.b.getValue();
       this.c.remove();
       AbstractMapBasedMultimap$e c = this.d.c;
       c.totalSize = c.totalSize - value.size();
       value.clear();
       this.b = null;
       return;
    }
}
