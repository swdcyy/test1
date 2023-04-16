package com.google.common.collect.o$a$a;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.o$a;
import java.util.Iterator;
import java.util.Set;
import java.lang.Object;

public class o$a$a extends AbstractIterator	// class@0018c4
{
    public final Iterator d;
    public final o$a e;

    public void o$a$a(o$a p0){
       this.e = p0;
       super();
       this.d = p0.b.iterator();
    }
    public Object a(){
       Object obj;
       while (true) {
          if (this.d.hasNext()) {
             obj = this.d.next();
             if (this.e.c.contains(obj)) {
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
