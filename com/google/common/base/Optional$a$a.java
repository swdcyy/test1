package com.google.common.base.Optional$a$a;
import com.google.common.base.AbstractIterator;
import com.google.common.base.Optional$a;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Object;
import ok.n;
import com.google.common.base.Optional;

public class Optional$a$a extends AbstractIterator	// class@00171c
{
    public final Iterator d;
    public final Optional$a e;

    public void Optional$a$a(Optional$a p0){
       this.e = p0;
       super();
       Iterator iterator = p0.b.iterator();
       n.j(iterator);
       this.d = iterator;
    }
    public Object a(){
       Optional optional;
       while (true) {
          if (this.d.hasNext()) {
             optional = this.d.next();
             if (optional.isPresent()) {
                break ;
             }
          }else {
             this.b();
             return null;
          }
       }
       return optional.get();
    }
}
