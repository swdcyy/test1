package com.google.common.collect.Multimaps$c;
import com.google.common.collect.b;
import qk.g0;
import java.lang.Object;
import java.util.Map;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.lang.AssertionError;
import java.util.Set;
import com.google.common.collect.Multimaps$c$a;
import java.lang.String;
import qk.g;

public class Multimaps$c extends b	// class@00185b
{
    public final g0 d;

    public void Multimaps$c(g0 p0){
       super();
       this.d = p0;
    }
    public void clear(){
       this.d.clear();
    }
    public boolean contains(Object p0){
       return this.d.containsKey(p0);
    }
    public int count(Object p0){
       p0 = Maps.y(this.d.asMap(), p0);
       int i = (p0 == null)? 0: p0.size();
       return i;
    }
    public int distinctElements(){
       return this.d.asMap().size();
    }
    public Iterator elementIterator(){
       throw new AssertionError("should never be called");
    }
    public Set elementSet(){
       return this.d.keySet();
    }
    public Iterator entryIterator(){
       return new Multimaps$c$a(this, this.d.asMap().entrySet().iterator());
    }
    public Iterator iterator(){
       return Maps.n(this.d.entries().iterator());
    }
    public int remove(Object p0,int p1){
       g.b(p1, "occurrences");
       if (!p1) {
          return this.count(p0);
       }
       p0 = Maps.y(this.d.asMap(), p0);
       int i = 0;
       if (p0 == null) {
          return i;
       }
       int i1 = p0.size();
       if (p1 >= i1) {
          p0.clear();
       }else {
          p0 = p0.iterator();
          for (; i < p1; i = i + 1) {
             p0.next();
             p0.remove();
          }
       }
       return i1;
    }
    public int size(){
       return this.d.size();
    }
}
