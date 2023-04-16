package com.google.common.collect.n$a;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.n;
import java.util.Iterator;
import java.util.Set;
import java.lang.Object;

public class n$a extends AbstractIterator	// class@0018c2
{
    public final Iterator d;
    public final Iterator e;
    public final n f;

    public void n$a(n p0){
       this.f = p0;
       super();
       this.d = p0.b.iterator();
       this.e = p0.c.iterator();
    }
    public Object a(){
       Object obj;
       if (this.d.hasNext()) {
          return this.d.next();
       }
       while (true) {
          if (this.e.hasNext()) {
             obj = this.e.next();
             if (!this.f.b.contains(obj)) {
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
