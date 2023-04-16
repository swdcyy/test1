package com.google.common.collect.AbstractMapBasedMultimap$g;
import java.util.NavigableSet;
import com.google.common.collect.AbstractMapBasedMultimap$j;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.lang.Object;
import java.util.Iterator;
import com.google.common.collect.AbstractMapBasedMultimap$e;
import java.util.SortedSet;
import com.google.common.collect.Iterators;

public class AbstractMapBasedMultimap$g extends AbstractMapBasedMultimap$j implements NavigableSet	// class@001795
{
    public final AbstractMapBasedMultimap e;

    public void AbstractMapBasedMultimap$g(AbstractMapBasedMultimap p0,NavigableMap p1){
       this.e = p0;
       super(p0, p1);
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
       return new AbstractMapBasedMultimap$g(this.e, this.l().descendingMap());
    }
    public Object floor(Object p0){
       return this.l().floorKey(p0);
    }
    public NavigableSet headSet(Object p0,boolean p1){
       return new AbstractMapBasedMultimap$g(this.e, this.l().headMap(p0, p1));
    }
    public SortedSet headSet(Object p0){
       return this.headSet(p0, false);
    }
    public Object higher(Object p0){
       return this.l().higherKey(p0);
    }
    public NavigableMap l(){
       return super.d();
    }
    public Object lower(Object p0){
       return this.l().lowerKey(p0);
    }
    public Object pollFirst(){
       return Iterators.p(this.iterator());
    }
    public Object pollLast(){
       return Iterators.p(this.descendingIterator());
    }
    public NavigableSet subSet(Object p0,boolean p1,Object p2,boolean p3){
       return new AbstractMapBasedMultimap$g(this.e, this.l().subMap(p0, p1, p2, p3));
    }
    public SortedSet subSet(Object p0,Object p1){
       return this.subSet(p0, true, p1, false);
    }
    public NavigableSet tailSet(Object p0,boolean p1){
       return new AbstractMapBasedMultimap$g(this.e, this.l().tailMap(p0, p1));
    }
    public SortedSet tailSet(Object p0){
       return this.tailSet(p0, true);
    }
}
