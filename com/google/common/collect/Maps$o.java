package com.google.common.collect.Maps$o;
import java.util.NavigableSet;
import com.google.common.collect.Maps$p;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.Map;
import java.lang.Object;
import java.util.Iterator;
import java.util.SortedSet;
import com.google.common.collect.Maps$m;
import java.util.Map$Entry;
import com.google.common.collect.Maps;

public class Maps$o extends Maps$p implements NavigableSet	// class@001850
{

    public void Maps$o(NavigableMap p0){
       super(p0);
    }
    public Map b(){
       return this.l();
    }
    public Object ceiling(Object p0){
       return this.l().ceilingKey(p0);
    }
    public SortedMap d(){
       return this.l();
    }
    public Iterator descendingIterator(){
       return this.descendingSet().iterator();
    }
    public NavigableSet descendingSet(){
       return this.l().descendingKeySet();
    }
    public Object floor(Object p0){
       return this.l().floorKey(p0);
    }
    public NavigableSet headSet(Object p0,boolean p1){
       return this.l().headMap(p0, p1).navigableKeySet();
    }
    public SortedSet headSet(Object p0){
       return this.headSet(p0, false);
    }
    public Object higher(Object p0){
       return this.l().higherKey(p0);
    }
    public NavigableMap l(){
       return this.b;
    }
    public Object lower(Object p0){
       return this.l().lowerKey(p0);
    }
    public Object pollFirst(){
       return Maps.o(this.l().pollFirstEntry());
    }
    public Object pollLast(){
       return Maps.o(this.l().pollLastEntry());
    }
    public NavigableSet subSet(Object p0,boolean p1,Object p2,boolean p3){
       return this.l().subMap(p0, p1, p2, p3).navigableKeySet();
    }
    public SortedSet subSet(Object p0,Object p1){
       return this.subSet(p0, true, p1, false);
    }
    public NavigableSet tailSet(Object p0,boolean p1){
       return this.l().tailMap(p0, p1).navigableKeySet();
    }
    public SortedSet tailSet(Object p0){
       return this.tailSet(p0, true);
    }
}
