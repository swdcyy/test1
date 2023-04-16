package com.google.common.collect.LinkedListMultimap$e;
import java.util.Iterator;
import com.google.common.collect.LinkedListMultimap;
import java.lang.Object;
import java.util.Set;
import java.util.HashSet;
import com.google.common.collect.o;
import java.util.ConcurrentModificationException;
import com.google.common.collect.LinkedListMultimap$g;
import qk.g;

public class LinkedListMultimap$e implements Iterator	// class@0004ea
{
    public final Set b;
    public LinkedListMultimap$g c;
    public LinkedListMultimap$g d;
    public int e;
    public final LinkedListMultimap f;

    public void LinkedListMultimap$e(LinkedListMultimap p0){
       this.f = p0;
       super();
       this.b = o.l(p0.keySet().size());
       this.c = p0.head;
       this.e = p0.modCount;
    }
    public final void a(){
       if (this.f.modCount == this.e) {
          return;
       }
       throw new ConcurrentModificationException();
    }
    public boolean hasNext(){
       this.a();
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public Object next(){
       LinkedListMultimap$g d;
       this.a();
       LinkedListMultimap.checkElement(this.c);
       LinkedListMultimap$e tc = this.c;
       this.d = tc;
       this.b.add(tc.b);
       do {
          d = this.c.d;
          this.c = d;
       } while (d == null || this.b.add(d.b));
       return this.d.b;
    }
    public void remove(){
       this.a();
       boolean b = (this.d != null)? true: false;
       g.c(b);
       this.f.removeAllNodes(this.d.b);
       this.d = null;
       this.e = this.f.modCount;
       return;
    }
}
