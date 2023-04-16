package com.google.common.collect.Maps$i$b;
import com.google.common.collect.Maps$m;
import com.google.common.collect.Maps$i;
import java.util.Map;
import java.lang.Object;
import com.google.common.collect.Maps$d;
import java.util.Collection;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import ok.o;
import java.util.ArrayList;
import com.google.common.collect.Lists;

public class Maps$i$b extends Maps$m	// class@001848
{
    public final Maps$i c;

    public void Maps$i$b(Maps$i p0){
       this.c = p0;
       super(p0);
    }
    public boolean remove(Object p0){
       if (!this.c.containsKey(p0)) {
          return false;
       }
       this.c.e.remove(p0);
       return true;
    }
    public boolean removeAll(Collection p0){
       Maps$i$b tc = this.c;
       Maps$d f = tc.f;
       Iterator iterator = tc.e.entrySet().iterator();
       boolean b = false;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (f.apply(uEntry) && p0.contains(uEntry.getKey())) {
             iterator.remove();
             b = true;
          }
       }
       return b;
    }
    public boolean retainAll(Collection p0){
       Maps$i$b tc = this.c;
       Maps$d f = tc.f;
       Iterator iterator = tc.e.entrySet().iterator();
       boolean b = false;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (f.apply(uEntry) && !p0.contains(uEntry.getKey())) {
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
