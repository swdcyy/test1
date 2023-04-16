package com.google.common.graph.Traverser$b$e;
import com.google.common.collect.AbstractIterator;
import com.google.common.graph.Traverser$b;
import java.lang.Object;
import com.google.common.graph.Traverser$Order;
import java.util.ArrayDeque;
import java.util.HashSet;
import com.google.common.graph.Traverser$b$e$a;
import java.util.Deque;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import rk.f0;

public final class Traverser$b$e extends AbstractIterator	// class@0018df
{
    public final Deque d;
    public final Set e;
    public final Traverser$Order f;
    public final Traverser$b g;

    public void Traverser$b$e(Traverser$b p0,Object p1,Traverser$Order p2){
       this.g = p0;
       super();
       ArrayDeque uArrayDeque = new ArrayDeque();
       this.d = uArrayDeque;
       this.e = new HashSet();
       uArrayDeque.push(this.c(p1));
       this.f = p2;
    }
    public Object a(){
       Traverser$b$e$a first;
       while (true) {
          if (this.d.isEmpty()) {
             this.b();
             return null;
          }else {
             first = this.d.getFirst();
             int i = 1;
             int i1 = first.b.hasNext() ^ i;
             if (this.e.add(first.a) && (this.f != Traverser$Order.PREORDER && (!i1 || this.f != Traverser$Order.POSTORDER))) {
                i = 0;
             }
             if (i1) {
                this.d.pop();
             }else {
                Object obj = first.b.next();
                if (!this.e.contains(obj)) {
                   this.d.push(this.c(obj));
                }
             }
             if (i) {
                break ;
             }
          }
       }
       return first.a;
    }
    public Traverser$b$e$a c(Object p0){
       return new Traverser$b$e$a(this, p0, this.g.a.b(p0));
    }
}
