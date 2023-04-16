package com.google.common.collect.Maps$k;
import com.google.common.collect.Maps$s;
import java.util.Map;
import ok.o;
import java.lang.Object;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import ok.k;
import java.util.Collection;
import java.util.ArrayList;
import com.google.common.collect.Lists;

public final class Maps$k extends Maps$s	// class@00184b
{
    public final Map c;
    public final o d;

    public void Maps$k(Map p0,Map p1,o p2){
       super(p0);
       this.c = p1;
       this.d = p2;
    }
    public boolean remove(Object p0){
       Iterator iterator = this.c.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          Map$Entry uEntry = iterator.next();
          if (this.d.apply(uEntry) && k.a(uEntry.getValue(), p0)) {
             break ;
          }
       }
       iterator.remove();
       return true;
    }
    public boolean removeAll(Collection p0){
       Iterator iterator = this.c.entrySet().iterator();
       boolean b = false;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (this.d.apply(uEntry) && p0.contains(uEntry.getValue())) {
             iterator.remove();
             b = true;
          }
       }
       return b;
    }
    public boolean retainAll(Collection p0){
       Iterator iterator = this.c.entrySet().iterator();
       boolean b = false;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (this.d.apply(uEntry) && !p0.contains(uEntry.getValue())) {
             iterator.remove();
             b = true;
          }
       }
       return b;
    }
    public Object[] toArray(){
       return Lists.d(this.iterator()).toArray();
    }
    public Object[] toArray(Object[] p0){
       return Lists.d(this.iterator()).toArray(p0);
    }
}
