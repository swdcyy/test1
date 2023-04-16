package com.google.common.collect.StandardTable$c;
import com.google.common.collect.Maps$t;
import com.google.common.collect.StandardTable;
import java.lang.Object;
import ok.n;
import java.util.Set;
import com.google.common.collect.StandardTable$c$a;
import com.google.common.collect.StandardTable$c$c;
import java.util.Collection;
import com.google.common.collect.StandardTable$c$d;
import ok.o;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.common.collect.Maps;

public class StandardTable$c extends Maps$t	// class@001885
{
    public final Object e;
    public final StandardTable f;

    public void StandardTable$c(StandardTable p0,Object p1){
       this.f = p0;
       super();
       n.j(p1);
       this.e = p1;
    }
    public Set a(){
       return new StandardTable$c$a(this);
    }
    public Set c(){
       return new StandardTable$c$c(this);
    }
    public boolean containsKey(Object p0){
       return this.f.contains(p0, this.e);
    }
    public Collection e(){
       return new StandardTable$c$d(this);
    }
    public boolean f(o p0){
       Iterator iterator = this.f.backingMap.entrySet().iterator();
       StandardTable$c uoc = null;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Map value = uEntry.getValue();
          Object obj = value.get(this.e);
          if (obj != null && p0.apply(Maps.k(uEntry.getKey(), obj))) {
             value.remove(this.e);
             uoc = true;
             if (value.isEmpty()) {
                iterator.remove();
             }
          }
       }
       return uoc;
    }
    public Object get(Object p0){
       return this.f.get(p0, this.e);
    }
    public Object put(Object p0,Object p1){
       return this.f.put(p0, this.e, p1);
    }
    public Object remove(Object p0){
       return this.f.remove(p0, this.e);
    }
}
