package com.google.common.collect.TreeRangeSet$c;
import com.google.common.collect.c;
import java.util.NavigableMap;
import com.google.common.collect.Range;
import com.google.common.collect.TreeRangeSet$d;
import java.util.Iterator;
import java.lang.Comparable;
import com.google.common.collect.BoundType;
import java.lang.Object;
import java.util.Collection;
import qk.i0;
import com.google.common.collect.Iterators;
import com.google.common.collect.Cut;
import com.google.common.collect.Iterators$f;
import com.google.common.collect.TreeRangeSet$c$a;
import qk.t0;
import ok.j;
import com.google.common.collect.TreeRangeSet$c$b;
import java.util.Comparator;
import com.google.common.collect.Ordering;
import java.util.Map$Entry;
import com.google.common.collect.ImmutableSortedMap;

public final class TreeRangeSet$c extends c	// class@00189d
{
    public final NavigableMap b;
    public final NavigableMap c;
    public final Range d;

    public void TreeRangeSet$c(NavigableMap p0){
       super(p0, Range.all());
    }
    public void TreeRangeSet$c(NavigableMap p0,Range p1){
       super();
       this.b = p0;
       this.c = new TreeRangeSet$d(p0);
       this.d = p1;
    }
    public Iterator a(){
       Collection uCollection;
       i0 oi01;
       Cut uCut;
       if (this.d.hasLowerBound()) {
          TreeRangeSet$c tc = this.c;
          Comparable uComparable = this.d.lowerEndpoint();
          boolean b = (this.d.lowerBoundType() == BoundType.CLOSED)? true: false;
          uCollection = tc.tailMap(uComparable, b).values();
       }else {
          uCollection = this.c.values();
       }
       i0 oi0 = Iterators.o(uCollection.iterator());
       if (this.d.contains(Cut.belowAll())) {
          oi01 = oi0;
          if (!oi01.hasNext() || oi01.peek().lowerBound != Cut.belowAll()) {
             uCut = Cut.belowAll();
          label_006d :
             return new TreeRangeSet$c$a(this, uCut, oi0);
          }
       }
       oi01 = oi0;
       if (oi01.hasNext()) {
          uCut = oi01.next().upperBound;
          goto label_006d ;
       }else {
          return Iterators.h();
       }
    }
    public Iterator c(){
       Range lowerBound;
       Cut uCut = (this.d.hasUpperBound())? this.d.upperEndpoint(): Cut.aboveAll();
       boolean b = (this.d.hasUpperBound() && this.d.upperBoundType() == BoundType.CLOSED)? true: false;
       Iterators$f uof = Iterators.o(this.c.headMap(uCut, b).descendingMap().values().iterator());
       if (uof.hasNext()) {
          lowerBound = (uof.peek().upperBound == Cut.aboveAll())? uof.next().lowerBound: this.b.higherKey(uof.peek().upperBound);
       }else if(!this.d.contains(Cut.belowAll()) || this.b.containsKey(Cut.belowAll())){
          return Iterators.h();
       }else {
          lowerBound = this.b.higherKey(Cut.belowAll());
       }
       return new TreeRangeSet$c$b(this, j.a(lowerBound, Cut.aboveAll()), uof);
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
             Map$Entry uEntry = this.g(p0, true).firstEntry();
             if (uEntry != null && uEntry.getKey().equals(p0)) {
                return uEntry.getValue();
             }
          }catch(java.lang.ClassCastException e0){
          }
       }
       return null;
    }
    public final NavigableMap f(Range p0){
       if (!this.d.isConnected(p0)) {
          return ImmutableSortedMap.of();
       }
       return new TreeRangeSet$c(this.b, p0.intersection(this.d));
    }
    public NavigableMap g(Cut p0,boolean p1){
       return this.f(Range.downTo(p0, BoundType.forBoolean(p1)));
    }
    public Object get(Object p0){
       return this.e(p0);
    }
    public NavigableMap headMap(Object p0,boolean p1){
       return this.f(Range.upTo(p0, BoundType.forBoolean(p1)));
    }
    public int size(){
       return Iterators.r(this.a());
    }
    public NavigableMap subMap(Object p0,boolean p1,Object p2,boolean p3){
       return this.f(Range.range(p0, BoundType.forBoolean(p1), p2, BoundType.forBoolean(p3)));
    }
    public NavigableMap tailMap(Object p0,boolean p1){
       return this.g(p0, p1);
    }
}
