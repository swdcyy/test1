package com.google.common.collect.o$b;
import com.google.common.collect.o$f;
import java.util.Set;
import com.google.common.collect.n;
import qk.t0;
import com.google.common.collect.o$b$a;
import java.lang.Object;
import java.util.Collection;
import java.util.Iterator;

public final class o$b extends o$f	// class@0018c7
{
    public final Set b;
    public final Set c;

    public void o$b(Set p0,Set p1){
       this.b = p0;
       this.c = p1;
       super(null);
    }
    public t0 b(){
       return new o$b$a(this);
    }
    public boolean contains(Object p0){
       boolean b = (this.b.contains(p0) && !this.c.contains(p0))? true: false;
       return b;
    }
    public boolean isEmpty(){
       return this.c.containsAll(this.b);
    }
    public Iterator iterator(){
       return this.b();
    }
    public int size(){
       Iterator iterator = this.b.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          if (!this.c.contains(iterator.next())) {
             i = i + 1;
          }
       }
       return i;
    }
}
