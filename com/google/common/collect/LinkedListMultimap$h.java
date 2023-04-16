package com.google.common.collect.LinkedListMultimap$h;
import java.util.ListIterator;
import com.google.common.collect.LinkedListMultimap;
import java.lang.Object;
import ok.n;
import com.google.common.collect.LinkedListMultimap$g;
import java.util.ConcurrentModificationException;
import java.util.Map$Entry;
import java.lang.UnsupportedOperationException;
import qk.g;

public class LinkedListMultimap$h implements ListIterator	// class@00181a
{
    public int b;
    public LinkedListMultimap$g c;
    public LinkedListMultimap$g d;
    public LinkedListMultimap$g e;
    public int f;
    public final LinkedListMultimap g;

    public void LinkedListMultimap$h(LinkedListMultimap p0,int p1){
       int i1;
       this.g = p0;
       super();
       this.f = p0.modCount;
       int i = p0.size();
       n.l(p1, i);
       if (p1 >= (i / 2)) {
          this.e = p0.tail;
          this.b = i;
          i1 = p1 + 1;
          while (p1 < i) {
             this.c();
             p1 = i1;
          }
       }else {
          this.c = p0.head;
          i1 = p1 - 1;
          while (p1 > 0) {
             this.b();
             p1 = i1;
          }
       }
       this.d = null;
       return;
    }
    public final void a(){
       if (this.g.modCount == this.f) {
          return;
       }
       throw new ConcurrentModificationException();
    }
    public void add(Object p0){
       throw new UnsupportedOperationException();
    }
    public LinkedListMultimap$g b(){
       this.a();
       LinkedListMultimap.checkElement(this.c);
       LinkedListMultimap$h tc = this.c;
       this.d = tc;
       this.e = tc;
       this.c = tc.d;
       this.b = this.b + 1;
       return tc;
    }
    public LinkedListMultimap$g c(){
       this.a();
       LinkedListMultimap.checkElement(this.e);
       LinkedListMultimap$h te = this.e;
       this.d = te;
       this.c = te;
       this.e = te.e;
       this.b = this.b - 1;
       return te;
    }
    public boolean hasNext(){
       this.a();
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public boolean hasPrevious(){
       this.a();
       boolean b = (this.e != null)? true: false;
       return b;
    }
    public Object next(){
       return this.b();
    }
    public int nextIndex(){
       return this.b;
    }
    public Object previous(){
       return this.c();
    }
    public int previousIndex(){
       return (this.b - 1);
    }
    public void remove(){
       this.a();
       int i = 1;
       boolean b = (this.d != null)? true: false;
       g.c(b);
       LinkedListMultimap$h td = this.d;
       if (td != this.c) {
          this.e = td.e;
          this.b = this.b - i;
       }else {
          this.c = td.d;
       }
       this.g.removeNode(td);
       this.d = null;
       this.f = this.g.modCount;
       return;
    }
    public void set(Object p0){
       throw new UnsupportedOperationException();
    }
}
