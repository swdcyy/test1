package com.google.common.collect.Iterators$f;
import qk.i0;
import java.util.Iterator;
import java.lang.Object;
import ok.n;

public class Iterators$f implements i0	// class@001813
{
    public final Iterator b;
    public boolean c;
    public Object d;

    public void Iterators$f(Iterator p0){
       super();
       n.j(p0);
       this.b = p0;
    }
    public boolean hasNext(){
       boolean b = (this.c != null || this.b.hasNext())? true: false;
       return b;
    }
    public Object next(){
       if (this.c == null) {
          return this.b.next();
       }
       Iterators$f td = this.d;
       this.c = false;
       this.d = null;
       return td;
    }
    public Object peek(){
       if (this.c == null) {
          this.d = this.b.next();
          this.c = true;
       }
       return this.d;
    }
    public void remove(){
       n.o((this.c ^ 0x01), "Can\'t remove after you\'ve peeked at next");
       this.b.remove();
    }
}
