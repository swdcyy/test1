package com.google.common.collect.AbstractMapBasedMultimap$e;
import com.google.common.collect.Maps$m;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Map;
import java.util.Iterator;
import com.google.common.collect.Iterators;
import java.util.Collection;
import java.util.Set;
import java.lang.Object;
import com.google.common.collect.AbstractMapBasedMultimap$e$a;

public class AbstractMapBasedMultimap$e extends Maps$m	// class@001793
{
    public final AbstractMapBasedMultimap c;

    public void AbstractMapBasedMultimap$e(AbstractMapBasedMultimap p0,Map p1){
       this.c = p0;
       super(p1);
    }
    public void clear(){
       Iterators.d(this.iterator());
    }
    public boolean containsAll(Collection p0){
       return this.b().keySet().containsAll(p0);
    }
    public boolean equals(Object p0){
       boolean b = (this == p0 || this.b().keySet().equals(p0))? true: false;
       return b;
    }
    public int hashCode(){
       return this.b().keySet().hashCode();
    }
    public Iterator iterator(){
       return new AbstractMapBasedMultimap$e$a(this, this.b().entrySet().iterator());
    }
    public boolean remove(Object p0){
       int i;
       p0 = this.b().remove(p0);
       boolean b = false;
       if (p0 != null) {
          i = p0.size();
          p0.clear();
          p0 = this.c;
          p0.totalSize = p0.totalSize - i;
       }else {
          i = 0;
       }
       if (i > 0) {
          b = true;
       }
       return b;
    }
}
