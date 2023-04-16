package com.google.common.collect.StandardTable$e;
import com.google.common.collect.StandardTable$i;
import com.google.common.collect.StandardTable;
import com.google.common.collect.StandardTable$a;
import java.lang.Object;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import ok.n;
import com.google.common.collect.Iterators;

public class StandardTable$e extends StandardTable$i	// class@001887
{
    public final StandardTable c;

    public void StandardTable$e(StandardTable p0){
       this.c = p0;
       super(p0, null);
    }
    public boolean contains(Object p0){
       return this.c.containsColumn(p0);
    }
    public Iterator iterator(){
       return this.c.createColumnKeyIterator();
    }
    public boolean remove(Object p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       Iterator iterator = this.c.backingMap.values().iterator();
       while (iterator.hasNext()) {
          Map map = iterator.next();
          if (map.keySet().remove(p0)) {
             b = true;
             if (map.isEmpty()) {
                iterator.remove();
             }
          }
       }
       return b;
    }
    public boolean removeAll(Collection p0){
       n.j(p0);
       Iterator iterator = this.c.backingMap.values().iterator();
       boolean b = false;
       while (iterator.hasNext()) {
          Map map = iterator.next();
          if (Iterators.q(map.keySet().iterator(), p0)) {
             b = true;
             if (map.isEmpty()) {
                iterator.remove();
             }
          }
       }
       return b;
    }
    public boolean retainAll(Collection p0){
       n.j(p0);
       Iterator iterator = this.c.backingMap.values().iterator();
       boolean b = false;
       while (iterator.hasNext()) {
          Map map = iterator.next();
          if (map.keySet().retainAll(p0)) {
             b = true;
             if (map.isEmpty()) {
                iterator.remove();
             }
          }
       }
       return b;
    }
    public int size(){
       return Iterators.r(this.iterator());
    }
}
