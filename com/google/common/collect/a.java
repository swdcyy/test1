package com.google.common.collect.a;
import qk.g0;
import java.lang.Object;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import com.google.common.collect.k;
import java.lang.Iterable;
import ok.n;
import com.google.common.collect.Iterators;
import java.util.Map$Entry;
import java.lang.String;
import com.google.common.collect.Maps;

public abstract class a implements g0	// class@000525
{
    public Collection b;
    public Set c;
    public k d;
    public Collection e;
    public Map f;

    public void a(){
       super();
    }
    public Map asMap(){
       a tf = this.f;
       if (tf == null) {
          tf = this.createAsMap();
          this.f = tf;
       }
       return tf;
    }
    public boolean containsEntry(Object p0,Object p1){
       p0 = this.asMap().get(p0);
       boolean b = (p0 != null && p0.contains(p1))? true: false;
       return b;
    }
    public boolean containsValue(Object p0){
       Iterator iterator = this.asMap().values().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (iterator.next().contains(p0)) {
             break ;
          }
       }
       return true;
    }
    public abstract Map createAsMap();
    public abstract Collection createEntries();
    public abstract Set createKeySet();
    public abstract k createKeys();
    public abstract Collection createValues();
    public Collection entries(){
       a tb = this.b;
       if (tb == null) {
          tb = this.createEntries();
          this.b = tb;
       }
       return tb;
    }
    public abstract Iterator entryIterator();
    public boolean equals(Object p0){
       boolean b;
       if (p0 == this) {
          b = true;
       }else if(p0 instanceof g0){
          b = this.asMap().equals(p0.asMap());
       }else {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return this.asMap().hashCode();
    }
    public boolean isEmpty(){
       boolean b = (!this.size())? true: false;
       return b;
    }
    public Set keySet(){
       a tc = this.c;
       if (tc == null) {
          tc = this.createKeySet();
          this.c = tc;
       }
       return tc;
    }
    public k keys(){
       a td = this.d;
       if (td == null) {
          td = this.createKeys();
          this.d = td;
       }
       return td;
    }
    public boolean put(Object p0,Object p1){
       return this.get(p0).add(p1);
    }
    public boolean putAll(Object p0,Iterable p1){
       n.j(p1);
       boolean b = true;
       if (p1 instanceof Collection) {
          if (p1.isEmpty() || !this.get(p0).addAll(p1)) {
             b = false;
          }
          return b;
       }else {
          Iterator iterator = p1.iterator();
          if (!iterator.hasNext() || !Iterators.a(this.get(p0), iterator)) {
             b = false;
          }
          return b;
       }
    }
    public boolean putAll(g0 p0){
       Iterator iterator = p0.entries().iterator();
       int i = 0;
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          i = i | this.put(key, uEntry.getValue());
       }
       return i;
    }
    public boolean remove(Object p0,Object p1){
       p0 = this.asMap().get(p0);
       boolean b = (p0 != null && p0.remove(p1))? true: false;
       return b;
    }
    public Collection replaceValues(Object p0,Iterable p1){
       n.j(p1);
       this.putAll(p0, p1);
       return this.removeAll(p0);
    }
    public String toString(){
       return this.asMap().toString();
    }
    public Iterator valueIterator(){
       return Maps.E(this.entries().iterator());
    }
    public Collection values(){
       a te = this.e;
       if (te == null) {
          te = this.createValues();
          this.e = te;
       }
       return te;
    }
}
