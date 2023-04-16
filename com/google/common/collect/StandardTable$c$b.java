package com.google.common.collect.StandardTable$c$b;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.StandardTable$c;
import com.google.common.collect.StandardTable;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.common.collect.q;

public class StandardTable$c$b extends AbstractIterator	// class@001882
{
    public final Iterator d;
    public final StandardTable$c e;

    public void StandardTable$c$b(StandardTable$c p0){
       this.e = p0;
       super();
       this.d = p0.f.backingMap.entrySet().iterator();
    }
    public Object a(){
       q oq;
       while (true) {
          if (this.d.hasNext()) {
             Map$Entry uEntry = this.d.next();
             if (uEntry.getValue().containsKey(this.e.e)) {
                oq = new q(this, uEntry);
                break ;
             }
          }else {
             this.b();
             oq = null;
             break ;
          }
       }
       return oq;
    }
}
