package com.google.common.collect.TreeRangeSet$e;
import com.google.common.collect.c;
import com.google.common.collect.Range;
import java.util.NavigableMap;
import java.lang.Object;
import ok.n;
import com.google.common.collect.TreeRangeSet$d;
import java.util.Iterator;
import qk.t0;
import com.google.common.collect.Iterators;
import java.lang.Comparable;
import com.google.common.collect.Cut;
import java.util.Collection;
import com.google.common.collect.BoundType;
import com.google.common.collect.Ordering;
import com.google.common.collect.TreeRangeSet$e$a;
import com.google.common.collect.TreeRangeSet$e$b;
import java.util.Comparator;
import java.util.Map$Entry;
import com.google.common.collect.ImmutableSortedMap;

public final class TreeRangeSet$e extends c	// class@0018a3
{
    public final Range b;
    public final Range c;
    public final NavigableMap d;
    public final NavigableMap e;

    public void TreeRangeSet$e(Range p0,Range p1,NavigableMap p2){
       super();
       n.j(p0);
       this.b = p0;
       n.j(p1);
       this.c = p1;
       n.j(p2);
       this.d = p2;
       this.e = new TreeRangeSet$d(p2);
    }
    public Iterator a(){
       Iterator iterator;
       if (this.c.isEmpty()) {
          return Iterators.h();
       }
       if (this.b.upperBound.isLessThan(this.c.lowerBound)) {
          return Iterators.h();
       }
       boolean b = false;
       if (this.b.lowerBound.isLessThan(this.c.lowerBound)) {
          iterator = this.e.tailMap(this.c.lowerBound, b).values().iterator();
       }else {
          TreeRangeSet$e td = this.d;
          Comparable uComparable = this.b.lowerBound.endpoint();
          if (this.b.lowerBoundType() == BoundType.CLOSED) {
             b = true;
          }
          iterator = td.tailMap(uComparable, b).values().iterator();
       }
       return new TreeRangeSet$e$a(this, iterator, Ordering.natural().min(this.b.upperBound, Cut.belowValue(this.c.upperBound)));
    }
    public Iterator c(){
       if (this.c.isEmpty()) {
          return Iterators.h();
       }
       Cut uCut = Ordering.natural().min(this.b.upperBound, Cut.belowValue(this.c.upperBound));
       TreeRangeSet$e td = this.d;
       Comparable uComparable = uCut.endpoint();
       boolean b = (uCut.typeAsUpperBound() == BoundType.CLOSED)? true: false;
       return new TreeRangeSet$e$b(this, td.headMap(uComparable, b).descendingMap().values().iterator());
    }
    public Comparator comparator(){
       return Ordering.natural();
    }
    public boolean containsKey(Object p0){
       boolean b = (this.e(p0) != null)? true: false;
       return b;
    }
    public Range e(Object p0){
       try{
          if (!p0 instanceof Cut || (!this.b.contains(p0) || (p0.compareTo(this.c.lowerBound) >= 0 && p0.compareTo(this.c.upperBound) < 0))) {
             if (p0.equals(this.c.lowerBound)) {
                p0 = this.d.floorEntry(p0);
                p0 = (p0 == null)? null: p0.getValue();
                if (p0 != null && p0.upperBound.compareTo(this.c.lowerBound) > 0) {
                   return p0.intersection(this.c);
                }
             }else {
                p0 = this.d.get(p0);
                if (p0 != null) {
                   return p0.intersection(this.c);
                }
             }
          }
       label_0064 :
          return null;
       }catch(java.lang.ClassCastException e0){
       }
    }
    public final NavigableMap f(Range p0){
       if (!p0.isConnected(this.b)) {
          return ImmutableSortedMap.of();
       }
       return new TreeRangeSet$e(this.b.intersection(p0), this.c, this.d);
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
       return this.f(Range.downTo(p0, BoundType.forBoolean(p1)));
    }
}
