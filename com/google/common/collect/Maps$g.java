package com.google.common.collect.Maps$g;
import com.google.common.collect.o$e;
import java.util.Map;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.common.collect.Maps;
import ok.k;
import java.util.Set;
import java.util.Collection;
import ok.n;
import java.util.Iterator;
import com.google.common.collect.o;
import java.util.HashSet;

public abstract class Maps$g extends o$e	// class@0004fd
{

    public void Maps$g(){
       super();
    }
    public abstract Map b();
    public void clear(){
       this.b().clear();
    }
    public boolean contains(Object p0){
       boolean b = false;
       if (p0 instanceof Map$Entry) {
          Object key = p0.getKey();
          Object obj = Maps.y(this.b(), key);
          if (k.a(obj, p0.getValue()) && (obj != null || this.b().containsKey(key))) {
             b = true;
          }
       }
       return b;
    }
    public boolean isEmpty(){
       return this.b().isEmpty();
    }
    public boolean remove(Object p0){
       if (this.contains(p0)) {
          return this.b().keySet().remove(p0.getKey());
       }
       return false;
    }
    public boolean removeAll(Collection p0){
       try{
          n.j(p0);
          return super.removeAll(p0);
       }catch(java.lang.UnsupportedOperationException e0){
          return o.n(this, p0.iterator());
       }
    }
    public boolean retainAll(Collection p0){
       try{
          n.j(p0);
          return super.retainAll(p0);
       }catch(java.lang.UnsupportedOperationException e0){
          HashSet hashSet = o.l(p0.size());
          Iterator iterator = p0.iterator();
       label_0017 :
          if (!iterator.hasNext()) {
             return this.b().keySet().retainAll(hashSet);
          }
          Object obj = iterator.next();
          if (this.contains(obj)) {
             hashSet.add(obj.getKey());
             goto label_0017 ;
          }else {
             goto label_0017 ;
          }
       }
    }
    public int size(){
       return this.b().size();
    }
}
