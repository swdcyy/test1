package com.google.common.collect.AbstractMapBasedMultimap$f;
import java.util.NavigableMap;
import com.google.common.collect.AbstractMapBasedMultimap$i;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.SortedMap;
import java.util.Set;
import java.util.NavigableSet;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.common.collect.AbstractMapBasedMultimap$c;
import java.util.SortedSet;
import com.google.common.collect.AbstractMapBasedMultimap$g;
import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Maps;
import com.google.common.collect.Maps$t;

public class AbstractMapBasedMultimap$f extends AbstractMapBasedMultimap$i implements NavigableMap	// class@001794
{
    public final AbstractMapBasedMultimap i;

    public void AbstractMapBasedMultimap$f(AbstractMapBasedMultimap p0,NavigableMap p1){
       this.i = p0;
       super(p0, p1);
    }
    public Set c(){
       return this.j();
    }
    public Map$Entry ceilingEntry(Object p0){
       p0 = this.n().ceilingEntry(p0);
       p0 = (p0 == null)? null: this.f(p0);
       return p0;
    }
    public Object ceilingKey(Object p0){
       return this.n().ceilingKey(p0);
    }
    public NavigableSet descendingKeySet(){
       return this.descendingMap().navigableKeySet();
    }
    public NavigableMap descendingMap(){
       return new AbstractMapBasedMultimap$f(this.i, this.n().descendingMap());
    }
    public Map$Entry firstEntry(){
       Map$Entry uEntry = this.n().firstEntry();
       uEntry = (uEntry == null)? null: this.f(uEntry);
       return uEntry;
    }
    public Map$Entry floorEntry(Object p0){
       p0 = this.n().floorEntry(p0);
       p0 = (p0 == null)? null: this.f(p0);
       return p0;
    }
    public Object floorKey(Object p0){
       return this.n().floorKey(p0);
    }
    public SortedSet g(){
       return this.j();
    }
    public SortedSet h(){
       return this.k();
    }
    public NavigableMap headMap(Object p0,boolean p1){
       return new AbstractMapBasedMultimap$f(this.i, this.n().headMap(p0, p1));
    }
    public SortedMap headMap(Object p0){
       return this.headMap(p0, false);
    }
    public Map$Entry higherEntry(Object p0){
       p0 = this.n().higherEntry(p0);
       p0 = (p0 == null)? null: this.f(p0);
       return p0;
    }
    public Object higherKey(Object p0){
       return this.n().higherKey(p0);
    }
    public SortedMap i(){
       return this.n();
    }
    public NavigableSet j(){
       return new AbstractMapBasedMultimap$g(this.i, this.n());
    }
    public NavigableSet k(){
       return super.h();
    }
    public Set keySet(){
       return this.k();
    }
    public Map$Entry lastEntry(){
       Map$Entry uEntry = this.n().lastEntry();
       uEntry = (uEntry == null)? null: this.f(uEntry);
       return uEntry;
    }
    public Map$Entry lowerEntry(Object p0){
       p0 = this.n().lowerEntry(p0);
       p0 = (p0 == null)? null: this.f(p0);
       return p0;
    }
    public Object lowerKey(Object p0){
       return this.n().lowerKey(p0);
    }
    public Map$Entry m(Iterator p0){
       if (!p0.hasNext()) {
          return null;
       }
       Map$Entry uEntry = p0.next();
       Collection uCollection = this.i.createCollection();
       uCollection.addAll(uEntry.getValue());
       p0.remove();
       p0 = uEntry.getKey();
       return Maps.k(p0, this.i.unmodifiableCollectionSubclass(uCollection));
    }
    public NavigableMap n(){
       return super.i();
    }
    public NavigableSet navigableKeySet(){
       return this.k();
    }
    public Map$Entry pollFirstEntry(){
       return this.m(this.entrySet().iterator());
    }
    public Map$Entry pollLastEntry(){
       return this.m(this.descendingMap().entrySet().iterator());
    }
    public NavigableMap subMap(Object p0,boolean p1,Object p2,boolean p3){
       return new AbstractMapBasedMultimap$f(this.i, this.n().subMap(p0, p1, p2, p3));
    }
    public SortedMap subMap(Object p0,Object p1){
       return this.subMap(p0, true, p1, false);
    }
    public NavigableMap tailMap(Object p0,boolean p1){
       return new AbstractMapBasedMultimap$f(this.i, this.n().tailMap(p0, p1));
    }
    public SortedMap tailMap(Object p0){
       return this.tailMap(p0, true);
    }
}
