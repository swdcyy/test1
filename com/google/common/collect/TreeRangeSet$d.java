package com.google.common.collect.TreeRangeSet$d;
import com.google.common.collect.c;
import java.util.NavigableMap;
import com.google.common.collect.Range;
import java.util.Iterator;
import java.util.Collection;
import java.lang.Comparable;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.common.collect.Cut;
import com.google.common.collect.TreeRangeSet$d$a;
import qk.i0;
import com.google.common.collect.Iterators;
import com.google.common.collect.Iterators$f;
import com.google.common.collect.TreeRangeSet$d$b;
import java.util.Comparator;
import com.google.common.collect.Ordering;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.BoundType;
import com.google.common.collect.AbstractIterator;

public final class TreeRangeSet$d extends c	// class@0018a0
{
    public final NavigableMap b;
    public final Range c;

    public void TreeRangeSet$d(NavigableMap p0){
       super();
       this.b = p0;
       this.c = Range.all();
    }
    public void TreeRangeSet$d(NavigableMap p0,Range p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public Iterator a(){
       Iterator iterator;
       if (!this.c.hasLowerBound()) {
          iterator = this.b.values().iterator();
       }else {
          Map$Entry uEntry = this.b.lowerEntry(this.c.lowerEndpoint());
          if (uEntry == null) {
             iterator = this.b.values().iterator();
          }else if(this.c.lowerBound.isLessThan(uEntry.getValue().upperBound)){
             iterator = this.b.tailMap(uEntry.getKey(), true).values().iterator();
          }else {
             iterator = this.b.tailMap(this.c.lowerEndpoint(), true).values().iterator();
          }
       }
       return new TreeRangeSet$d$a(this, iterator);
    }
    public Iterator c(){
       Collection uCollection = (this.c.hasUpperBound())? this.b.headMap(this.c.upperEndpoint(), false).descendingMap().values(): this.b.descendingMap().values();
       Iterators$f uof = Iterators.o(uCollection.iterator());
       if (uof.hasNext() && this.c.upperBound.isLessThan(uof.peek().upperBound)) {
          uof.next();
       }
       return new TreeRangeSet$d$b(this, uof);
    }
    public Comparator comparator(){
       return Ordering.natural();
    }
    public boolean containsKey(Object p0){
       boolean b = (this.e(p0) != null)? true: false;
       return b;
    }
    public Range e(Object p0){
       if (p0 instanceof Cut) {
          try{
             if (!this.c.contains(p0)) {
                return null;
             }else {
                Map$Entry uEntry = this.b.lowerEntry(p0);
                if (uEntry != null && uEntry.getValue().upperBound.equals(p0)) {
                   return uEntry.getValue();
                }
             }
          }catch(java.lang.ClassCastException e0){
          }
       }
       return null;
    }
    public final NavigableMap f(Range p0){
       if (p0.isConnected(this.c)) {
          return new TreeRangeSet$d(this.b, p0.intersection(this.c));
       }
       return ImmutableSortedMap.of();
    }
    public Object get(Object p0){
       return this.e(p0);
    }
    public NavigableMap headMap(Object p0,boolean p1){
       return this.f(Range.upTo(p0, BoundType.forBoolean(p1)));
    }
    public boolean isEmpty(){
       boolean b;
       if (this.c.equals(Range.all())) {
          b = this.b.isEmpty();
       }else if(!this.a().hasNext()){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public int size(){
       if (this.c.equals(Range.all())) {
          return this.b.size();
       }
       return Iterators.r(this.a());
    }
    public NavigableMap subMap(Object p0,boolean p1,Object p2,boolean p3){
       return this.f(Range.range(p0, BoundType.forBoolean(p1), p2, BoundType.forBoolean(p3)));
    }
    public NavigableMap tailMap(Object p0,boolean p1){
       return this.f(Range.downTo(p0, BoundType.forBoolean(p1)));
    }
}
