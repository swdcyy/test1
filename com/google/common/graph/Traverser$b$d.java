package com.google.common.graph.Traverser$b$d;
import qk.t0;
import com.google.common.graph.Traverser$b;
import java.lang.Object;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.lang.Iterable;
import rk.f0;
import java.util.Iterator;

public final class Traverser$b$d extends t0	// class@0018dd
{
    public final Queue b;
    public final Set c;
    public final Traverser$b d;

    public void Traverser$b$d(Traverser$b p0,Object p1){
       this.d = p0;
       super();
       ArrayDeque uArrayDeque = new ArrayDeque();
       this.b = uArrayDeque;
       HashSet hashSet = new HashSet();
       this.c = hashSet;
       uArrayDeque.add(p1);
       hashSet.add(p1);
    }
    public boolean hasNext(){
       return (this.b.isEmpty() ^ 0x01);
    }
    public Object next(){
       Object obj = this.b.remove();
       Iterator iterator = this.d.a.b(obj).iterator();
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          if (this.c.add(obj1)) {
             this.b.add(obj1);
          }
       }
       return obj;
    }
}
