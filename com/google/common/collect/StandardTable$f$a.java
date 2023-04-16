package com.google.common.collect.StandardTable$f$a;
import com.google.common.collect.StandardTable$i;
import com.google.common.collect.StandardTable$f;
import com.google.common.collect.StandardTable;
import com.google.common.collect.StandardTable$a;
import java.lang.Object;
import java.util.Map$Entry;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import com.google.common.collect.StandardTable$f$a$a;
import ok.h;
import com.google.common.collect.Maps;
import java.util.Collection;
import ok.n;
import com.google.common.collect.o;
import java.util.ArrayList;
import com.google.common.collect.Lists;

public class StandardTable$f$a extends StandardTable$i	// class@001889
{
    public final StandardTable$f c;

    public void StandardTable$f$a(StandardTable$f p0){
       this.c = p0;
       super(p0.e, null);
    }
    public boolean contains(Object p0){
       if (p0 instanceof Map$Entry && this.c.e.containsColumn(p0.getKey())) {
          return this.c.f(p0.getKey()).equals(p0.getValue());
       }
       return false;
    }
    public Iterator iterator(){
       return Maps.b(this.c.e.columnKeySet(), new StandardTable$f$a$a(this));
    }
    public boolean remove(Object p0){
       if (!this.contains(p0)) {
          return false;
       }
       this.c.e.removeColumn(p0.getKey());
       return true;
    }
    public boolean removeAll(Collection p0){
       n.j(p0);
       return o.n(this, p0.iterator());
    }
    public boolean retainAll(Collection p0){
       n.j(p0);
       Iterator iterator = Lists.d(this.c.e.columnKeySet().iterator()).iterator();
       StandardTable$f$a uof$a = null;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (!p0.contains(Maps.k(obj, this.c.e.column(obj)))) {
             this.c.e.removeColumn(obj);
             uof$a = true;
          }
       }
       return uof$a;
    }
    public int size(){
       return this.c.e.columnKeySet().size();
    }
}
