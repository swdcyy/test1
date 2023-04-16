package com.google.common.collect.n;
import com.google.common.collect.o$f;
import qk.t0;
import com.google.common.collect.n$a;
import java.lang.Object;
import java.util.Set;
import java.util.Iterator;

public final class n extends o$f	// class@0018c3
{
    public final Set b;
    public final Set c;

    public t0 b(){
       return new n$a(this);
    }
    public boolean contains(Object p0){
       boolean b = (this.b.contains(p0) || this.c.contains(p0))? true: false;
       return b;
    }
    public boolean isEmpty(){
       boolean b = (this.b.isEmpty() && this.c.isEmpty())? true: false;
       return b;
    }
    public Iterator iterator(){
       return this.b();
    }
    public int size(){
       int i = this.b.size();
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          if (!this.b.contains(iterator.next())) {
             i = i + 1;
          }
       }
       return i;
    }
}
