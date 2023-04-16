package com.eclipsesource.v8.utils.V8PropertyMap;
import java.util.Map;
import java.lang.Object;
import java.util.Hashtable;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
import java.lang.String;
import java.util.AbstractMap$SimpleEntry;
import java.util.Map$Entry;
import java.util.ArrayList;

public class V8PropertyMap implements Map	// class@001020
{
    public Hashtable map;
    public Set nulls;

    public void V8PropertyMap(){
       super();
       this.map = new Hashtable();
       this.nulls = new HashSet();
    }
    public void clear(){
       this.map.clear();
       this.nulls.clear();
    }
    public boolean containsKey(Object p0){
       boolean b = (this.map.containsKey(p0) || this.nulls.contains(p0))? true: false;
       return b;
    }
    public boolean containsValue(Object p0){
       if (p0 == null && !this.nulls.isEmpty()) {
          return true;
       }
       if (p0 == null) {
          return false;
       }
       return this.map.containsValue(p0);
    }
    public Set entrySet(){
       HashSet hashSet = new HashSet(this.map.entrySet());
       Iterator iterator = this.nulls.iterator();
       while (iterator.hasNext()) {
          hashSet.add(new AbstractMap$SimpleEntry(iterator.next(), null));
       }
       return hashSet;
    }
    public Object get(Object p0){
       if (this.nulls.contains(p0)) {
          return null;
       }
       return this.map.get(p0);
    }
    public boolean isEmpty(){
       boolean b = (this.map.isEmpty() && this.nulls.isEmpty())? true: false;
       return b;
    }
    public Set keySet(){
       HashSet hashSet = new HashSet(this.map.keySet());
       hashSet.addAll(this.nulls);
       return hashSet;
    }
    public Object put(Object p0,Object p1){
       return this.put(p0, p1);
    }
    public Object put(String p0,Object p1){
       if (p1 == null) {
          if (this.map.containsKey(p0)) {
             this.map.remove(p0);
          }
          this.nulls.add(p0);
          return null;
       }else if(this.nulls.contains(p0)){
          this.nulls.remove(p0);
       }
       return this.map.put(p0, p1);
    }
    public void putAll(Map p0){
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          this.put(key, uEntry.getValue());
       }
       return;
    }
    public Object remove(Object p0){
       if (!this.nulls.contains(p0)) {
          return this.map.remove(p0);
       }
       this.nulls.remove(p0);
       return null;
    }
    public int size(){
       return (this.map.size() + this.nulls.size());
    }
    public Collection values(){
       ArrayList uArrayList = new ArrayList(this.map.values());
       for (int i = 0; i < this.nulls.size(); i = i + 1) {
          uArrayList.add(null);
       }
       return uArrayList;
    }
}
