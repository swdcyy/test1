package com.google.common.collect.StandardTable$b;
import java.util.Iterator;
import com.google.common.collect.StandardTable;
import java.lang.Object;
import java.util.Set;
import java.util.Map;
import com.google.common.collect.Iterators;
import java.util.Map$Entry;
import com.google.common.collect.s$a;
import com.google.common.collect.Tables;

public class StandardTable$b implements Iterator	// class@001880
{
    public final Iterator b;
    public Map$Entry c;
    public Iterator d;
    public final StandardTable e;

    public void StandardTable$b(StandardTable p0){
       this.e = p0;
       super();
       this.b = p0.backingMap.entrySet().iterator();
       this.d = Iterators.j();
    }
    public boolean hasNext(){
       boolean b = (this.b.hasNext() || this.d.hasNext())? true: false;
       return b;
    }
    public Object next(){
       Map$Entry uEntry;
       if (!this.d.hasNext()) {
          uEntry = this.b.next();
          this.c = uEntry;
          this.d = uEntry.getValue().entrySet().iterator();
       }
       uEntry = this.d.next();
       Object key = uEntry.getKey();
       return Tables.a(this.c.getKey(), key, uEntry.getValue());
    }
    public void remove(){
       this.d.remove();
       if (this.c.getValue().isEmpty()) {
          this.b.remove();
          this.c = null;
       }
       return;
    }
}
