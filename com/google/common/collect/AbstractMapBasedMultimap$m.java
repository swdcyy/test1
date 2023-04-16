package com.google.common.collect.AbstractMapBasedMultimap$m;
import java.util.Set;
import com.google.common.collect.AbstractMapBasedMultimap$k;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.lang.Object;
import java.util.Collection;
import com.google.common.collect.o;

public class AbstractMapBasedMultimap$m extends AbstractMapBasedMultimap$k implements Set	// class@00179d
{
    public final AbstractMapBasedMultimap g;

    public void AbstractMapBasedMultimap$m(AbstractMapBasedMultimap p0,Object p1,Set p2){
       this.g = p0;
       super(p0, p1, p2, null);
    }
    public boolean removeAll(Collection p0){
       if (p0.isEmpty()) {
          return false;
       }
       int i = this.size();
       boolean b = o.m(this.c, p0);
       if (b) {
          AbstractMapBasedMultimap$m tg = this.g;
          tg.totalSize = tg.totalSize + (this.c.size() - i);
          this.n();
       }
       return b;
    }
}
