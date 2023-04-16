package com.google.common.collect.c;
import java.util.NavigableMap;
import com.google.common.collect.Maps$l;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.common.collect.Maps;
import java.util.NavigableSet;
import com.google.common.collect.Maps$f;
import com.google.common.collect.c$a;
import com.google.common.collect.Iterators;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.Set;
import com.google.common.collect.Maps$o;

public abstract class c extends Maps$l implements NavigableMap	// class@0018ae
{

    public void c(){
       super();
    }
    public abstract Iterator c();
    public Map$Entry ceilingEntry(Object p0){
       return this.tailMap(p0, true).firstEntry();
    }
    public Object ceilingKey(Object p0){
       return Maps.o(this.ceilingEntry(p0));
    }
    public NavigableSet descendingKeySet(){
       return this.descendingMap().navigableKeySet();
    }
    public NavigableMap descendingMap(){
       return new c$a(this);
    }
    public Map$Entry firstEntry(){
       return Iterators.m(this.a(), null);
    }
    public Object firstKey(){
       Map$Entry uEntry = this.firstEntry();
       if (uEntry != null) {
          return uEntry.getKey();
       }
       throw new NoSuchElementException();
    }
    public Map$Entry floorEntry(Object p0){
       return this.headMap(p0, true).lastEntry();
    }
    public Object floorKey(Object p0){
       return Maps.o(this.floorEntry(p0));
    }
    public abstract Object get(Object p0);
    public SortedMap headMap(Object p0){
       return this.headMap(p0, false);
    }
    public Map$Entry higherEntry(Object p0){
       return this.tailMap(p0, false).firstEntry();
    }
    public Object higherKey(Object p0){
       return Maps.o(this.higherEntry(p0));
    }
    public Set keySet(){
       return this.navigableKeySet();
    }
    public Map$Entry lastEntry(){
       return Iterators.m(this.c(), null);
    }
    public Object lastKey(){
       Map$Entry uEntry = this.lastEntry();
       if (uEntry != null) {
          return uEntry.getKey();
       }
       throw new NoSuchElementException();
    }
    public Map$Entry lowerEntry(Object p0){
       return this.headMap(p0, false).lastEntry();
    }
    public Object lowerKey(Object p0){
       return Maps.o(this.lowerEntry(p0));
    }
    public NavigableSet navigableKeySet(){
       return new Maps$o(this);
    }
    public Map$Entry pollFirstEntry(){
       return Iterators.p(this.a());
    }
    public Map$Entry pollLastEntry(){
       return Iterators.p(this.c());
    }
    public SortedMap subMap(Object p0,Object p1){
       return this.subMap(p0, true, p1, false);
    }
    public SortedMap tailMap(Object p0){
       return this.tailMap(p0, true);
    }
}
