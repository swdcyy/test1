package com.google.common.collect.o$d;
import java.util.SortedSet;
import com.google.common.collect.o$c;
import ok.o;
import java.util.Set;
import java.util.Comparator;
import com.google.common.collect.e$a;
import java.lang.Object;
import java.util.Iterator;
import java.util.Collection;
import ok.n;
import java.util.NoSuchElementException;

public class o$d extends o$c implements SortedSet	// class@0018c9
{

    public void o$d(SortedSet p0,o p1){
       super(p0, p1);
    }
    public Comparator comparator(){
       return this.b.comparator();
    }
    public Object first(){
       Object obj;
       Iterator iterator = this.b.iterator();
       e$a tc = this.c;
       n.j(iterator);
       n.j(tc);
       while (true) {
          if (!iterator.hasNext()) {
             throw new NoSuchElementException();
          }
          obj = iterator.next();
          if (tc.apply(obj)) {
             break ;
          }
       }
       return obj;
    }
    public SortedSet headSet(Object p0){
       return new o$d(this.b.headSet(p0), this.c);
    }
    public Object last(){
       e$a tb = this.b;
       Object obj = tb.last();
       while (!this.c.apply(obj)) {
          tb = tb.headSet(obj);
       }
       return obj;
    }
    public SortedSet subSet(Object p0,Object p1){
       return new o$d(this.b.subSet(p0, p1), this.c);
    }
    public SortedSet tailSet(Object p0){
       return new o$d(this.b.tailSet(p0), this.c);
    }
}
