package com.google.common.collect.Iterators$b;
import com.google.common.collect.AbstractIterator;
import java.util.Iterator;
import ok.o;
import java.lang.Object;

public final class Iterators$b extends AbstractIterator	// class@00180f
{
    public final Iterator d;
    public final o e;

    public void Iterators$b(Iterator p0,o p1){
       this.d = p0;
       this.e = p1;
       super();
    }
    public Object a(){
       Object obj;
       while (true) {
          if (this.d.hasNext()) {
             obj = this.d.next();
             if (this.e.apply(obj)) {
                break ;
             }
          }else {
             this.b();
             return null;
          }
       }
       return obj;
    }
}
