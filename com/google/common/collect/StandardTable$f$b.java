package com.google.common.collect.StandardTable$f$b;
import com.google.common.collect.Maps$s;
import com.google.common.collect.StandardTable$f;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import com.google.common.collect.Maps$t;
import java.util.Iterator;
import java.util.Map$Entry;
import com.google.common.collect.StandardTable;
import java.util.Collection;
import ok.n;
import java.util.ArrayList;
import com.google.common.collect.Lists;

public class StandardTable$f$b extends Maps$s	// class@00188a
{
    public final StandardTable$f c;

    public void StandardTable$f$b(StandardTable$f p0){
       this.c = p0;
       super(p0);
    }
    public boolean remove(Object p0){
       Map$Entry uEntry;
       Iterator iterator = this.c.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          uEntry = iterator.next();
          if (uEntry.getValue().equals(p0)) {
             break ;
          }
       }
       this.c.e.removeColumn(uEntry.getKey());
       return true;
    }
    public boolean removeAll(Collection p0){
       n.j(p0);
       Iterator iterator = Lists.d(this.c.e.columnKeySet().iterator()).iterator();
       StandardTable$f$b uof$b = null;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (p0.contains(this.c.e.column(obj))) {
             this.c.e.removeColumn(obj);
             uof$b = true;
          }
       }
       return uof$b;
    }
    public boolean retainAll(Collection p0){
       n.j(p0);
       Iterator iterator = Lists.d(this.c.e.columnKeySet().iterator()).iterator();
       StandardTable$f$b uof$b = null;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (!p0.contains(this.c.e.column(obj))) {
             this.c.e.removeColumn(obj);
             uof$b = true;
          }
       }
       return uof$b;
    }
}
