package com.google.common.collect.StandardTable$d;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.StandardTable;
import java.lang.Object;
import ok.x;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import qk.t0;
import com.google.common.collect.Iterators;
import java.util.Map$Entry;
import java.util.Set;

public class StandardTable$d extends AbstractIterator	// class@001886
{
    public final Map d;
    public final Iterator e;
    public Iterator f;
    public final StandardTable g;

    public void StandardTable$d(StandardTable p0){
       this.g = p0;
       super();
       this.d = p0.factory.get();
       this.e = p0.backingMap.values().iterator();
       this.f = Iterators.h();
    }
    public Object a(){
       while (true) {
          if (this.f.hasNext()) {
             Map$Entry uEntry = this.f.next();
             if (!this.d.containsKey(uEntry.getKey())) {
                this.d.put(uEntry.getKey(), uEntry.getValue());
                return uEntry.getKey();
             }
          }else if(this.e.hasNext()){
             this.f = this.e.next().entrySet().iterator();
          }else {
             break ;
          }
       }
       this.b();
       return null;
    }
}
