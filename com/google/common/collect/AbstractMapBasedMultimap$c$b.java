package com.google.common.collect.AbstractMapBasedMultimap$c$b;
import java.util.Iterator;
import com.google.common.collect.AbstractMapBasedMultimap$c;
import java.lang.Object;
import java.util.Set;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Collection;
import qk.g;
import com.google.common.collect.AbstractMapBasedMultimap;

public class AbstractMapBasedMultimap$c$b implements Iterator	// class@00178f
{
    public final Iterator b;
    public Collection c;
    public final AbstractMapBasedMultimap$c d;

    public void AbstractMapBasedMultimap$c$b(AbstractMapBasedMultimap$c p0){
       this.d = p0;
       super();
       this.b = p0.e.entrySet().iterator();
    }
    public boolean hasNext(){
       return this.b.hasNext();
    }
    public Object next(){
       Map$Entry uEntry = this.b.next();
       this.c = uEntry.getValue();
       return this.d.f(uEntry);
    }
    public void remove(){
       boolean b = (this.c != null)? true: false;
       g.c(b);
       this.b.remove();
       AbstractMapBasedMultimap$c f = this.d.f;
       f.totalSize = f.totalSize - this.c.size();
       this.c.clear();
       this.c = null;
       return;
    }
}
