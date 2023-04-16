package com.google.common.collect.Maps$s;
import java.util.AbstractCollection;
import java.util.Map;
import java.lang.Object;
import ok.n;
import java.util.Iterator;
import java.util.Set;
import com.google.common.collect.Maps;
import java.util.Map$Entry;
import ok.k;
import java.util.Collection;
import java.util.HashSet;
import com.google.common.collect.o;

public class Maps$s extends AbstractCollection	// class@001854
{
    public final Map b;

    public void Maps$s(Map p0){
       super();
       n.j(p0);
       this.b = p0;
    }
    public final Map b(){
       return this.b;
    }
    public void clear(){
       this.b().clear();
    }
    public boolean contains(Object p0){
       return this.b().containsValue(p0);
    }
    public boolean isEmpty(){
       return this.b().isEmpty();
    }
    public Iterator iterator(){
       return Maps.E(this.b().entrySet().iterator());
    }
    public boolean remove(Object p0){
       boolean b;
       try{
          b = super.remove(p0);
          return b;
       }catch(java.lang.UnsupportedOperationException e0){
          Iterator iterator = this.b().entrySet().iterator();
       label_0011 :
          if (!iterator.hasNext()) {
             return false;
          }
          Map$Entry uEntry = iterator.next();
          if (k.a(b, uEntry.getValue())) {
             this.b().remove(uEntry.getKey());
             return true;
          }else {
             goto label_0011 ;
          }
       }
    }
    public boolean removeAll(Collection p0){
       try{
          n.j(p0);
          return super.removeAll(p0);
       }catch(java.lang.UnsupportedOperationException e0){
          HashSet hashSet = o.h();
          Iterator iterator = this.b().entrySet().iterator();
       label_001b :
          if (!iterator.hasNext()) {
             return this.b().keySet().removeAll(hashSet);
          }
          Map$Entry uEntry = iterator.next();
          if (p0.contains(uEntry.getValue())) {
             hashSet.add(uEntry.getKey());
             goto label_001b ;
          }else {
             goto label_001b ;
          }
       }
    }
    public boolean retainAll(Collection p0){
       try{
          n.j(p0);
          return super.retainAll(p0);
       }catch(java.lang.UnsupportedOperationException e0){
          HashSet hashSet = o.h();
          Iterator iterator = this.b().entrySet().iterator();
       label_001b :
          if (!iterator.hasNext()) {
             return this.b().keySet().retainAll(hashSet);
          }
          Map$Entry uEntry = iterator.next();
          if (p0.contains(uEntry.getValue())) {
             hashSet.add(uEntry.getKey());
             goto label_001b ;
          }else {
             goto label_001b ;
          }
       }
    }
    public int size(){
       return this.b().size();
    }
}
