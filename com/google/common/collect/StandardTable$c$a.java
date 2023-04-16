package com.google.common.collect.StandardTable$c$a;
import com.google.common.collect.o$e;
import com.google.common.collect.StandardTable$c;
import ok.o;
import com.google.common.base.Predicates;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.common.collect.StandardTable;
import java.util.Iterator;
import com.google.common.collect.StandardTable$c$b;
import java.util.Collection;
import java.util.Map;

public class StandardTable$c$a extends o$e	// class@001881
{
    public final StandardTable$c b;

    public void StandardTable$c$a(StandardTable$c p0){
       this.b = p0;
       super();
    }
    public void clear(){
       this.b.f(Predicates.a());
    }
    public boolean contains(Object p0){
       if (p0 instanceof Map$Entry) {
          return this.b.f.containsMapping(p0.getKey(), this.b.e, p0.getValue());
       }
       return false;
    }
    public boolean isEmpty(){
       StandardTable$c$a tb = this.b;
       return (tb.f.containsColumn(tb.e) ^ 0x01);
    }
    public Iterator iterator(){
       return new StandardTable$c$b(this.b);
    }
    public boolean remove(Object p0){
       if (p0 instanceof Map$Entry) {
          return this.b.f.removeMapping(p0.getKey(), this.b.e, p0.getValue());
       }
       return false;
    }
    public boolean retainAll(Collection p0){
       return this.b.f(Predicates.g(Predicates.e(p0)));
    }
    public int size(){
       Iterator iterator = this.b.f.backingMap.values().iterator();
       int i = 0;
       while (iterator.hasNext()) {
          if (iterator.next().containsKey(this.b.e)) {
             i = i + 1;
          }
       }
       return i;
    }
}
