package com.google.common.collect.Iterators$e;
import java.util.Iterator;
import java.lang.Object;
import qk.t0;
import com.google.common.collect.Iterators;
import ok.n;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import qk.g;

public class Iterators$e implements Iterator	// class@001812
{
    public Iterator b;
    public Iterator c;
    public Iterator d;
    public Deque e;

    public void Iterators$e(Iterator p0){
       super();
       this.c = Iterators.h();
       n.j(p0);
       this.d = p0;
    }
    public boolean hasNext(){
       Iterator iterator;
       while (true) {
          Iterators$e tc = this.c;
          n.j(tc);
          if (tc.hasNext()) {
          label_0078 :
             return true;
          }
          while (true) {
             tc = this.d;
             if (tc == null || !tc.hasNext()) {
                tc = this.e;
                if (tc != null && !tc.isEmpty()) {
                   this.d = this.e.removeFirst();
                }else {
                   iterator = null;
                label_0031 :
                   this.d = iterator;
                   if (iterator == null) {
                      break ;
                   }else {
                      iterator = iterator.next();
                      this.c = iterator;
                      if (iterator instanceof Iterators$e) {
                         this.c = iterator.c;
                         if (this.e == null) {
                            this.e = new ArrayDeque();
                         }
                         this.e.addFirst(this.d);
                         if (iterator.e != null) {
                            while (!iterator.e.isEmpty()) {
                               this.e.addFirst(iterator.e.removeLast());
                            }
                         }
                         this.d = iterator.d;
                      }else {
                         continue ;
                      }
                   }
                }
             }else {
                iterator = this.d;
                goto label_0031 ;
             }
          }
          return false;
       }
    }
    public Object next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       Iterators$e tc = this.c;
       this.b = tc;
       return tc.next();
    }
    public void remove(){
       boolean b = (this.b != null)? true: false;
       g.c(b);
       this.b.remove();
       this.b = null;
       return;
    }
}
