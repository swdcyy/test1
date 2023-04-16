package com.google.common.collect.o$b$a;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.o$b;
import java.util.Iterator;
import java.util.Set;
import java.lang.Object;

public class o$b$a extends AbstractIterator	// class@0018c6
{
    public final Iterator d;
    public final o$b e;

    public void o$b$a(o$b p0){
       this.e = p0;
       super();
       this.d = p0.b.iterator();
    }
    public Object a(){
       Object obj;
       while (true) {
          if (this.d.hasNext()) {
             obj = this.d.next();
             if (!this.e.c.contains(obj)) {
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
