package com.google.common.collect.Maps$f;
import java.util.NavigableMap;
import qk.r;
import java.lang.Object;
import java.util.Map$Entry;
import java.util.Comparator;
import com.google.common.collect.Ordering;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import com.google.common.collect.h;
import java.util.SortedMap;
import com.google.common.collect.Maps$o;
import java.util.Iterator;
import java.lang.String;
import java.util.Collection;
import com.google.common.collect.Maps$s;

public abstract class Maps$f extends r implements NavigableMap	// class@001843
{
    public Comparator b;
    public Set c;
    public NavigableSet d;

    public void Maps$f(){
       super();
    }
    public Map$Entry ceilingEntry(Object p0){
       return this.t().floorEntry(p0);
    }
    public Object ceilingKey(Object p0){
       return this.t().floorKey(p0);
    }
    public Comparator comparator(){
       Maps$f tb = this.b;
       if (tb == null) {
          Comparator uComparator = this.t().comparator();
          if (uComparator == null) {
             uComparator = Ordering.natural();
          }
          tb = Ordering.from(uComparator).reverse();
          this.b = tb;
       }
       return tb;
    }
    public Object delegate(){
       return this.delegate();
    }
    public final Map delegate(){
       return this.t();
    }
    public NavigableSet descendingKeySet(){
       return this.t().navigableKeySet();
    }
    public NavigableMap descendingMap(){
       return this.t();
    }
    public Set entrySet(){
       Maps$f tc = this.c;
       if (tc == null) {
          tc = new h(this);
          this.c = tc;
       }
       return tc;
    }
    public Map$Entry firstEntry(){
       return this.t().lastEntry();
    }
    public Object firstKey(){
       return this.t().lastKey();
    }
    public Map$Entry floorEntry(Object p0){
       return this.t().ceilingEntry(p0);
    }
    public Object floorKey(Object p0){
       return this.t().ceilingKey(p0);
    }
    public NavigableMap headMap(Object p0,boolean p1){
       return this.t().tailMap(p0, p1).descendingMap();
    }
    public SortedMap headMap(Object p0){
       return this.headMap(p0, false);
    }
    public Map$Entry higherEntry(Object p0){
       return this.t().lowerEntry(p0);
    }
    public Object higherKey(Object p0){
       return this.t().lowerKey(p0);
    }
    public Set keySet(){
       return this.navigableKeySet();
    }
    public Map$Entry lastEntry(){
       return this.t().firstEntry();
    }
    public Object lastKey(){
       return this.t().firstKey();
    }
    public Map$Entry lowerEntry(Object p0){
       return this.t().higherEntry(p0);
    }
    public Object lowerKey(Object p0){
       return this.t().higherKey(p0);
    }
    public NavigableSet navigableKeySet(){
       Maps$f td = this.d;
       if (td == null) {
          td = new Maps$o(this);
          this.d = td;
       }
       return td;
    }
    public Map$Entry pollFirstEntry(){
       return this.t().pollLastEntry();
    }
    public Map$Entry pollLastEntry(){
       return this.t().pollFirstEntry();
    }
    public abstract Iterator q();
    public NavigableMap subMap(Object p0,boolean p1,Object p2,boolean p3){
       return this.t().subMap(p2, p3, p0, p1).descendingMap();
    }
    public SortedMap subMap(Object p0,Object p1){
       return this.subMap(p0, true, p1, false);
    }
    public abstract NavigableMap t();
    public NavigableMap tailMap(Object p0,boolean p1){
       return this.t().headMap(p0, p1).descendingMap();
    }
    public SortedMap tailMap(Object p0){
       return this.tailMap(p0, true);
    }
    public String toString(){
       return this.standardToString();
    }
    public Collection values(){
       return new Maps$s(this);
    }
}
