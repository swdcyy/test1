package com.google.common.collect.Maps$d;
import com.google.common.collect.Maps$t;
import java.util.Map;
import ok.o;
import java.lang.Object;
import java.util.Collection;
import com.google.common.collect.Maps$k;
import java.util.Map$Entry;
import com.google.common.collect.Maps;
import java.util.Set;
import ok.n;
import java.util.Iterator;

public abstract class Maps$d extends Maps$t	// class@001840
{
    public final Map e;
    public final o f;

    public void Maps$d(Map p0,o p1){
       super();
       this.e = p0;
       this.f = p1;
    }
    public boolean containsKey(Object p0){
       boolean b = (this.e.containsKey(p0) && this.f(p0, this.e.get(p0)))? true: false;
       return b;
    }
    public Collection e(){
       return new Maps$k(this, this.e, this.f);
    }
    public boolean f(Object p0,Object p1){
       return this.f.apply(Maps.k(p0, p1));
    }
    public Object get(Object p0){
       Object obj = this.e.get(p0);
       if (obj == null || !this.f(p0, obj)) {
          obj = null;
       }
       return obj;
    }
    public boolean isEmpty(){
       return this.entrySet().isEmpty();
    }
    public Object put(Object p0,Object p1){
       n.b(this.f(p0, p1));
       return this.e.put(p0, p1);
    }
    public void putAll(Map p0){
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          n.b(this.f(key, uEntry.getValue()));
       }
       this.e.putAll(p0);
       return;
    }
    public Object remove(Object p0){
       p0 = (this.containsKey(p0))? this.e.remove(p0): null;
       return p0;
    }
}
