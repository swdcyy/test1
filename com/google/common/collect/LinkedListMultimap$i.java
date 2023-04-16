package com.google.common.collect.LinkedListMultimap$i;
import java.util.ListIterator;
import com.google.common.collect.LinkedListMultimap;
import java.lang.Object;
import java.util.Map;
import com.google.common.collect.LinkedListMultimap$f;
import ok.n;
import com.google.common.collect.LinkedListMultimap$g;
import qk.g;

public class LinkedListMultimap$i implements ListIterator	// class@0004ee
{
    public final Object b;
    public int c;
    public LinkedListMultimap$g d;
    public LinkedListMultimap$g e;
    public LinkedListMultimap$g f;
    public final LinkedListMultimap g;

    public void LinkedListMultimap$i(LinkedListMultimap p0,Object p1){
       this.g = p0;
       super();
       this.b = p1;
       LinkedListMultimap$f uof = p0.keyToKeyList.get(p1);
       LinkedListMultimap$g og = (uof == null)? null: uof.a;
       this.d = og;
       return;
    }
    public void LinkedListMultimap$i(LinkedListMultimap p0,Object p1,int p2){
       LinkedListMultimap$g og;
       int i1;
       this.g = p0;
       super();
       LinkedListMultimap$f uof = p0.keyToKeyList.get(p1);
       int i = (uof == null)? 0: uof.c;
       n.l(p2, i);
       if (p2 >= (i / 2)) {
          og = (uof == null)? null: uof.b;
          this.f = og;
          this.c = i;
          i1 = p2 + 1;
          while (p2 < i) {
             this.previous();
             p2 = i1;
          }
       }else if(uof == null){
          og = null;
       }else {
          uof = uof.a;
       }
       this.d = og;
       i1 = p2 - 1;
       while (p2 > 0) {
          this.next();
          p2 = i1;
       }
       this.b = p1;
       this.e = null;
       return;
    }
    public void add(Object p0){
       this.f = this.g.addNode(this.b, p0, this.d);
       this.c = this.c + 1;
       this.e = null;
    }
    public boolean hasNext(){
       boolean b = (this.d != null)? true: false;
       return b;
    }
    public boolean hasPrevious(){
       boolean b = (this.f != null)? true: false;
       return b;
    }
    public Object next(){
       LinkedListMultimap.checkElement(this.d);
       LinkedListMultimap$i td = this.d;
       this.e = td;
       this.f = td;
       this.d = td.f;
       this.c = this.c + 1;
       return td.c;
    }
    public int nextIndex(){
       return this.c;
    }
    public Object previous(){
       LinkedListMultimap.checkElement(this.f);
       LinkedListMultimap$i tf = this.f;
       this.e = tf;
       this.d = tf;
       this.f = tf.g;
       this.c = this.c - 1;
       return tf.c;
    }
    public int previousIndex(){
       return (this.c - 1);
    }
    public void remove(){
       int i = 1;
       boolean b = (this.e != null)? true: false;
       g.c(b);
       LinkedListMultimap$i te = this.e;
       if (te != this.d) {
          this.f = te.g;
          this.c = this.c - i;
       }else {
          this.d = te.f;
       }
       this.g.removeNode(te);
       this.e = null;
       return;
    }
    public void set(Object p0){
       boolean b = (this.e != null)? true: false;
       n.n(b);
       this.e.c = p0;
       return;
    }
}
