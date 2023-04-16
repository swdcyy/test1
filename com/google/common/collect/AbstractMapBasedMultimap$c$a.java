package com.google.common.collect.AbstractMapBasedMultimap$c$a;
import com.google.common.collect.Maps$g;
import com.google.common.collect.AbstractMapBasedMultimap$c;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import com.google.common.collect.e;
import java.util.Iterator;
import com.google.common.collect.AbstractMapBasedMultimap$c$b;
import java.util.Map$Entry;
import com.google.common.collect.AbstractMapBasedMultimap;

public class AbstractMapBasedMultimap$c$a extends Maps$g	// class@00178e
{
    public final AbstractMapBasedMultimap$c b;

    public void AbstractMapBasedMultimap$c$a(AbstractMapBasedMultimap$c p0){
       this.b = p0;
       super();
    }
    public Map b(){
       return this.b;
    }
    public boolean contains(Object p0){
       return e.e(this.b.e.entrySet(), p0);
    }
    public Iterator iterator(){
       return new AbstractMapBasedMultimap$c$b(this.b);
    }
    public boolean remove(Object p0){
       if (!this.contains(p0)) {
          return false;
       }
       this.b.f.removeValuesForKey(p0.getKey());
       return true;
    }
}
