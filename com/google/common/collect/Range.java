package com.google.common.collect.Range;
import ok.o;
import com.google.common.collect.RangeGwtSerializationDependencies;
import com.google.common.collect.Cut;
import java.lang.Object;
import ok.n;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Iterable;
import java.util.SortedSet;
import java.lang.Comparable;
import com.google.common.collect.BoundType;
import com.google.common.collect.Range$a;
import java.lang.Enum;
import java.lang.AssertionError;
import java.util.Comparator;
import com.google.common.collect.Ordering;
import java.util.Iterator;
import ok.h;
import com.google.common.collect.Range$b;
import com.google.common.collect.Range$RangeLexOrdering;
import com.google.common.collect.Range$c;
import qk.i;
import java.util.Collection;

public final class Range extends RangeGwtSerializationDependencies implements o	// class@00186c
{
    public final Cut lowerBound;
    public final Cut upperBound;
    public static final Range b;
    public static final long serialVersionUID;

    static {
       Range.b = new Range(Cut.belowAll(), Cut.aboveAll());
    }
    public void Range(Cut p0,Cut p1){
       super();
       n.j(p0);
       this.lowerBound = p0;
       n.j(p1);
       this.upperBound = p1;
       if (p0.compareTo(p1) <= 0 && (p0 != Cut.aboveAll() && p1 != Cut.belowAll())) {
          return;
       }
       throw new IllegalArgumentException("Invalid range: "+Range.b(p0, p1));
    }
    public static SortedSet a(Iterable p0){
       return p0;
    }
    public static Range all(){
       return Range.b;
    }
    public static Range atLeast(Comparable p0){
       return Range.create(Cut.belowValue(p0), Cut.aboveAll());
    }
    public static Range atMost(Comparable p0){
       return Range.create(Cut.belowAll(), Cut.aboveValue(p0));
    }
    public static String b(Cut p0,Cut p1){
       StringBuilder str = new StringBuilder(16);
       p0.describeAsLowerBound(str);
       str = str+"..";
       p1.describeAsUpperBound(str);
       return str;
    }
    public static Range closed(Comparable p0,Comparable p1){
       return Range.create(Cut.belowValue(p0), Cut.aboveValue(p1));
    }
    public static Range closedOpen(Comparable p0,Comparable p1){
       return Range.create(Cut.belowValue(p0), Cut.belowValue(p1));
    }
    public static int compareOrThrow(Comparable p0,Comparable p1){
       return p0.compareTo(p1);
    }
    public static Range create(Cut p0,Cut p1){
       return new Range(p0, p1);
    }
    public static Range downTo(Comparable p0,BoundType p1){
       int i = Range$a.a[p1.ordinal()];
       if (i == 1) {
          return Range.greaterThan(p0);
       }
       if (i == 2) {
          return Range.atLeast(p0);
       }
       throw new AssertionError();
    }
    public static Range encloseAll(Iterable p0){
       n.j(p0);
       if (p0 instanceof SortedSet) {
          SortedSet sortedSet = Range.a(p0);
          Comparator uComparator = sortedSet.comparator();
          if (Ordering.natural().equals(uComparator) || uComparator == null) {
             return Range.closed(sortedSet.first(), sortedSet.last());
          }
       }
       Iterator iterator = p0.iterator();
       Comparable uComparable = iterator.next();
       n.j(uComparable);
       Comparable uComparable1 = uComparable;
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          n.j(obj);
          uComparable = Ordering.natural().min(uComparable, obj);
          uComparable1 = Ordering.natural().max(uComparable1, obj);
       }
       return Range.closed(uComparable, uComparable1);
    }
    public static Range greaterThan(Comparable p0){
       return Range.create(Cut.aboveValue(p0), Cut.aboveAll());
    }
    public static Range lessThan(Comparable p0){
       return Range.create(Cut.belowAll(), Cut.belowValue(p0));
    }
    public static h lowerBoundFn(){
       return Range$b.b;
    }
    public static Range open(Comparable p0,Comparable p1){
       return Range.create(Cut.aboveValue(p0), Cut.belowValue(p1));
    }
    public static Range openClosed(Comparable p0,Comparable p1){
       return Range.create(Cut.aboveValue(p0), Cut.aboveValue(p1));
    }
    public static Range range(Comparable p0,BoundType p1,Comparable p2,BoundType p3){
       n.j(p1);
       n.j(p3);
       BoundType oPEN = BoundType.OPEN;
       Cut uCut = (p1 == oPEN)? Cut.aboveValue(p0): Cut.belowValue(p0);
       Cut uCut1 = (p3 == oPEN)? Cut.belowValue(p2): Cut.aboveValue(p2);
       return Range.create(uCut, uCut1);
    }
    public static Ordering rangeLexOrdering(){
       return Range$RangeLexOrdering.INSTANCE;
    }
    public static Range singleton(Comparable p0){
       return Range.closed(p0, p0);
    }
    public static Range upTo(Comparable p0,BoundType p1){
       int i = Range$a.a[p1.ordinal()];
       if (i == 1) {
          return Range.lessThan(p0);
       }
       if (i == 2) {
          return Range.atMost(p0);
       }
       throw new AssertionError();
    }
    public static h upperBoundFn(){
       return Range$c.b;
    }
    public boolean apply(Comparable p0){
       return this.contains(p0);
    }
    public boolean apply(Object p0){
       return this.apply(p0);
    }
    public Range canonical(i p0){
       n.j(p0);
       Cut uCut = this.lowerBound.canonical(p0);
       Cut uCut1 = this.upperBound.canonical(p0);
       Range range = (uCut == this.lowerBound && uCut1 == this.upperBound)? this: Range.create(uCut, uCut1);
       return range;
    }
    public boolean contains(Comparable p0){
       n.j(p0);
       boolean b = (this.lowerBound.isLessThan(p0) && !this.upperBound.isLessThan(p0))? true: false;
       return b;
    }
    public boolean containsAll(Iterable p0){
       boolean b = true;
       boolean b1 = (p0 instanceof Collection)? p0.isEmpty(): p0.iterator().hasNext() ^ b;
       if (b1) {
          return b;
       }else if(p0 instanceof SortedSet){
          SortedSet sortedSet = Range.a(p0);
          Comparator uComparator = sortedSet.comparator();
          if (Ordering.natural().equals(uComparator) || uComparator == null) {
             if (!this.contains(sortedSet.first()) || !this.contains(sortedSet.last())) {
                b = false;
             }
             return b;
          }
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return b;
          }
          if (!this.contains(iterator.next())) {
             break ;
          }
       }
       return false;
    }
    public boolean encloses(Range p0){
       boolean b = (this.lowerBound.compareTo(p0.lowerBound) <= 0 && this.upperBound.compareTo(p0.upperBound) >= 0)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof Range && (this.lowerBound.equals(p0.lowerBound) && this.upperBound.equals(p0.upperBound))) {
          b = true;
       }
    label_001c :
       return b;
    }
    public boolean hasLowerBound(){
       boolean b = (this.lowerBound != Cut.belowAll())? true: false;
       return b;
    }
    public boolean hasUpperBound(){
       boolean b = (this.upperBound != Cut.aboveAll())? true: false;
       return b;
    }
    public int hashCode(){
       return ((this.lowerBound.hashCode() * 31) + this.upperBound.hashCode());
    }
    public Range intersection(Range p0){
       int i = this.lowerBound.compareTo(p0.lowerBound);
       int i1 = this.upperBound.compareTo(p0.upperBound);
       if (i >= 0 && i1 <= 0) {
          return this;
       }
       if (i <= 0 && i1 >= 0) {
          return p0;
       }
       Range tlowerBound = (i >= 0)? this.lowerBound: p0.lowerBound;
       p0 = (i1 <= 0)? this.upperBound: p0.upperBound;
       return Range.create(tlowerBound, p0);
    }
    public boolean isConnected(Range p0){
       boolean b = (this.lowerBound.compareTo(p0.upperBound) <= 0 && p0.lowerBound.compareTo(this.upperBound) <= 0)? true: false;
       return b;
    }
    public boolean isEmpty(){
       return this.lowerBound.equals(this.upperBound);
    }
    public BoundType lowerBoundType(){
       return this.lowerBound.typeAsLowerBound();
    }
    public Comparable lowerEndpoint(){
       return this.lowerBound.endpoint();
    }
    public Object readResolve(){
       if (this.equals(Range.b)) {
          return Range.all();
       }
       return this;
    }
    public Range span(Range p0){
       int i = this.lowerBound.compareTo(p0.lowerBound);
       int i1 = this.upperBound.compareTo(p0.upperBound);
       if (i <= 0 && i1 >= 0) {
          return this;
       }
       if (i >= 0 && i1 <= 0) {
          return p0;
       }
       Range tlowerBound = (i <= 0)? this.lowerBound: p0.lowerBound;
       p0 = (i1 >= 0)? this.upperBound: p0.upperBound;
       return Range.create(tlowerBound, p0);
    }
    public String toString(){
       return Range.b(this.lowerBound, this.upperBound);
    }
    public BoundType upperBoundType(){
       return this.upperBound.typeAsUpperBound();
    }
    public Comparable upperEndpoint(){
       return this.upperBound.endpoint();
    }
}
