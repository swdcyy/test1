package com.google.common.collect.ImmutableSortedSet;
import java.util.NavigableSet;
import qk.n0;
import com.google.common.collect.ImmutableSortedSetFauxverideShim;
import java.util.Comparator;
import java.lang.Object;
import com.google.common.collect.RegularImmutableSortedSet;
import qk.h0;
import java.util.Arrays;
import com.google.common.collect.ImmutableList;
import java.lang.Iterable;
import com.google.common.collect.Ordering;
import java.util.Collection;
import ok.n;
import qk.o0;
import com.google.common.collect.ImmutableCollection;
import qk.y;
import java.util.Iterator;
import com.google.common.collect.ImmutableSortedSet$a;
import java.lang.Comparable;
import java.util.SortedSet;
import java.util.AbstractCollection;
import java.lang.System;
import java.util.Collections;
import qk.t0;
import com.google.common.collect.Iterators;
import java.lang.UnsupportedOperationException;
import java.io.ObjectInputStream;
import java.io.InvalidObjectException;
import java.lang.String;

public abstract class ImmutableSortedSet extends ImmutableSortedSetFauxverideShim implements NavigableSet, n0	// class@001808
{
    public final Comparator comparator;
    public ImmutableSortedSet descendingSet;

    public void ImmutableSortedSet(Comparator p0){
       super();
       this.comparator = p0;
    }
    public static ImmutableSortedSet construct(Comparator p0,int p1,Object[] p2){
       if (!p1) {
          return ImmutableSortedSet.emptySet(p0);
       }
       h0.c(p2, p1);
       Arrays.sort(p2, 0, p1, p0);
       int i = 1;
       int i1 = 1;
       while (i < p1) {
          object oobject = p2[i];
          int i2 = i1 - 1;
          if (p0.compare(oobject, p2[i2])) {
             i2 = i1 + 1;
             p2[i1] = oobject;
             i1 = i2;
          }
          i = i + 1;
       }
       Arrays.fill(p2, i1, p1, null);
       if (i1 < (p2.length / 2)) {
          p2 = Arrays.copyOf(p2, i1);
       }
       return new RegularImmutableSortedSet(ImmutableList.asImmutableList(p2, i1), p0);
    }
    public static ImmutableSortedSet copyOf(Iterable p0){
       return ImmutableSortedSet.copyOf(Ordering.natural(), p0);
    }
    public static ImmutableSortedSet copyOf(Collection p0){
       return ImmutableSortedSet.copyOf(Ordering.natural(), p0);
    }
    public static ImmutableSortedSet copyOf(Comparator p0,Iterable p1){
       n.j(p0);
       if (o0.b(p0, p1) && p1 instanceof ImmutableSortedSet) {
          ImmutableCollection immutableCol = p1;
          if (!immutableCol.isPartialView()) {
             return immutableCol;
          }
       }
       Object[] objArray = y.u(p1);
       return ImmutableSortedSet.construct(p0, objArray.length, objArray);
    }
    public static ImmutableSortedSet copyOf(Comparator p0,Collection p1){
       return ImmutableSortedSet.copyOf(p0, p1);
    }
    public static ImmutableSortedSet copyOf(Comparator p0,Iterator p1){
       ImmutableSortedSet$a uoa = new ImmutableSortedSet$a(p0);
       uoa.m(p1);
       return uoa.n();
    }
    public static ImmutableSortedSet copyOf(Iterator p0){
       return ImmutableSortedSet.copyOf(Ordering.natural(), p0);
    }
    public static ImmutableSortedSet copyOf(Comparable[] p0){
       return ImmutableSortedSet.construct(Ordering.natural(), p0.length, p0.clone());
    }
    public static ImmutableSortedSet copyOfSorted(SortedSet p0){
       Comparator uComparator = o0.a(p0);
       ImmutableList immutableLis = ImmutableList.copyOf(p0);
       if (immutableLis.isEmpty()) {
          return ImmutableSortedSet.emptySet(uComparator);
       }
       return new RegularImmutableSortedSet(immutableLis, uComparator);
    }
    public static RegularImmutableSortedSet emptySet(Comparator p0){
       if (Ordering.natural().equals(p0)) {
          return RegularImmutableSortedSet.NATURAL_EMPTY_SET;
       }
       return new RegularImmutableSortedSet(ImmutableList.of(), p0);
    }
    public static ImmutableSortedSet$a naturalOrder(){
       return new ImmutableSortedSet$a(Ordering.natural());
    }
    public static ImmutableSortedSet of(){
       return RegularImmutableSortedSet.NATURAL_EMPTY_SET;
    }
    public static ImmutableSortedSet of(Comparable p0){
       return new RegularImmutableSortedSet(ImmutableList.of(p0), Ordering.natural());
    }
    public static ImmutableSortedSet of(Comparable p0,Comparable p1){
       Comparable[] uComparableA = new Comparable[]{p0,p1};
       return ImmutableSortedSet.construct(Ordering.natural(), 2, uComparableA);
    }
    public static ImmutableSortedSet of(Comparable p0,Comparable p1,Comparable p2){
       Comparable[] uComparableA = new Comparable[]{p0,p1,p2};
       return ImmutableSortedSet.construct(Ordering.natural(), 3, uComparableA);
    }
    public static ImmutableSortedSet of(Comparable p0,Comparable p1,Comparable p2,Comparable p3){
       Comparable[] uComparableA = new Comparable[]{p0,p1,p2,p3};
       return ImmutableSortedSet.construct(Ordering.natural(), 4, uComparableA);
    }
    public static ImmutableSortedSet of(Comparable p0,Comparable p1,Comparable p2,Comparable p3,Comparable p4){
       Comparable[] uComparableA = new Comparable[]{p0,p1,p2,p3,p4};
       return ImmutableSortedSet.construct(Ordering.natural(), 5, uComparableA);
    }
    public static ImmutableSortedSet of(Comparable p0,Comparable p1,Comparable p2,Comparable p3,Comparable p4,Comparable p5,Comparable[] p6){
       int i = p6.length + 6;
       Comparable[] uComparableA = new Comparable[i];
       uComparableA[0] = p0;
       uComparableA[1] = p1;
       uComparableA[2] = p2;
       uComparableA[3] = p3;
       uComparableA[4] = p4;
       uComparableA[5] = p5;
       System.arraycopy(p6, 0, uComparableA, 6, p6.length);
       return ImmutableSortedSet.construct(Ordering.natural(), i, uComparableA);
    }
    public static ImmutableSortedSet$a orderedBy(Comparator p0){
       return new ImmutableSortedSet$a(p0);
    }
    public static ImmutableSortedSet$a reverseOrder(){
       return new ImmutableSortedSet$a(Collections.reverseOrder());
    }
    public static int unsafeCompare(Comparator p0,Object p1,Object p2){
       return p0.compare(p1, p2);
    }
    public Object ceiling(Object p0){
       return y.j(this.tailSet(p0, true), null);
    }
    public Comparator comparator(){
       return this.comparator;
    }
    public abstract ImmutableSortedSet createDescendingSet();
    public Iterator descendingIterator(){
       return this.descendingIterator();
    }
    public abstract t0 descendingIterator();
    public ImmutableSortedSet descendingSet(){
       ImmutableSortedSet tdescendingS = this.descendingSet;
       if (tdescendingS == null) {
          tdescendingS = this.createDescendingSet();
          this.descendingSet = tdescendingS;
          tdescendingS.descendingSet = this;
       }
       return tdescendingS;
    }
    public NavigableSet descendingSet(){
       return this.descendingSet();
    }
    public Object first(){
       return this.iterator().next();
    }
    public Object floor(Object p0){
       return Iterators.m(this.headSet(p0, true).descendingIterator(), null);
    }
    public ImmutableSortedSet headSet(Object p0){
       return this.headSet(p0, false);
    }
    public ImmutableSortedSet headSet(Object p0,boolean p1){
       n.j(p0);
       return this.headSetImpl(p0, p1);
    }
    public NavigableSet headSet(Object p0,boolean p1){
       return this.headSet(p0, p1);
    }
    public SortedSet headSet(Object p0){
       return this.headSet(p0);
    }
    public abstract ImmutableSortedSet headSetImpl(Object p0,boolean p1);
    public Object higher(Object p0){
       return y.j(this.tailSet(p0, false), null);
    }
    public abstract int indexOf(Object p0);
    public Iterator iterator(){
       return this.iterator();
    }
    public abstract t0 iterator();
    public Object last(){
       return this.descendingIterator().next();
    }
    public Object lower(Object p0){
       return Iterators.m(this.headSet(p0, false).descendingIterator(), null);
    }
    public final Object pollFirst(){
       throw new UnsupportedOperationException();
    }
    public final Object pollLast(){
       throw new UnsupportedOperationException();
    }
    public final void readObject(ObjectInputStream p0){
       throw new InvalidObjectException("Use SerializedForm");
    }
    public ImmutableSortedSet subSet(Object p0,Object p1){
       return this.subSet(p0, true, p1, false);
    }
    public ImmutableSortedSet subSet(Object p0,boolean p1,Object p2,boolean p3){
       n.j(p0);
       n.j(p2);
       boolean b = (this.comparator.compare(p0, p2) <= 0)? true: false;
       n.b(b);
       return this.subSetImpl(p0, p1, p2, p3);
    }
    public NavigableSet subSet(Object p0,boolean p1,Object p2,boolean p3){
       return this.subSet(p0, p1, p2, p3);
    }
    public SortedSet subSet(Object p0,Object p1){
       return this.subSet(p0, p1);
    }
    public abstract ImmutableSortedSet subSetImpl(Object p0,boolean p1,Object p2,boolean p3);
    public ImmutableSortedSet tailSet(Object p0){
       return this.tailSet(p0, true);
    }
    public ImmutableSortedSet tailSet(Object p0,boolean p1){
       n.j(p0);
       return this.tailSetImpl(p0, p1);
    }
    public NavigableSet tailSet(Object p0,boolean p1){
       return this.tailSet(p0, p1);
    }
    public SortedSet tailSet(Object p0){
       return this.tailSet(p0);
    }
    public abstract ImmutableSortedSet tailSetImpl(Object p0,boolean p1);
    public int unsafeCompare(Object p0,Object p1){
       return ImmutableSortedSet.unsafeCompare(this.comparator, p0, p1);
    }
}
