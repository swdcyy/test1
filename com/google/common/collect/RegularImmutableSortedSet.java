package com.google.common.collect.RegularImmutableSortedSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.Comparator;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import com.google.common.collect.k;
import java.util.Set;
import java.lang.Iterable;
import qk.o0;
import qk.t0;
import java.util.Iterator;
import java.util.AbstractCollection;
import java.util.NoSuchElementException;
import ok.n;
import com.google.common.collect.ImmutableCollection;

public final class RegularImmutableSortedSet extends ImmutableSortedSet	// class@001876
{
    public final ImmutableList elements;
    public static final RegularImmutableSortedSet NATURAL_EMPTY_SET;

    static {
       RegularImmutableSortedSet.NATURAL_EMPTY_SET = new RegularImmutableSortedSet(ImmutableList.of(), Ordering.natural());
    }
    public void RegularImmutableSortedSet(ImmutableList p0,Comparator p1){
       super(p1);
       this.elements = p0;
    }
    public ImmutableList asList(){
       return this.elements;
    }
    public Object ceiling(Object p0){
       int i = this.tailIndex(p0, true);
       i = (i == this.size())? null: this.elements.get(i);
       return i;
    }
    public boolean contains(Object p0){
       try{
          boolean b = false;
          if (p0 != null && Collections.binarySearch(this.elements, p0, this.unsafeComparator()) >= 0) {
             b = true;
          }
       label_0011 :
          return e0;
       }catch(java.lang.ClassCastException e0){
       }
    }
    public boolean containsAll(Collection p0){
       Set set;
       if (p0 instanceof k) {
          set = p0.elementSet();
       }
       if (!o0.b(this.comparator(), set) || set.size() <= 1) {
          return super.containsAll(set);
       }else {
          t0 ot0 = this.iterator();
          Iterator iterator = set.iterator();
          if (!ot0.hasNext()) {
             return false;
          }else {
             Object obj = iterator.next();
             Object obj1 = ot0.next();
             try{
                while (true) {
                   int i = this.unsafeCompare(obj1, obj);
                   if (i < 0) {
                      if (!ot0.hasNext()) {
                         return false;
                      }else {
                         obj1 = ot0.next();
                      }
                   }else if(!i){
                      if (!iterator.hasNext()) {
                         return true;
                      }else {
                         obj = iterator.next();
                      }
                   }else if(i > 0){
                      break ;
                   }
                }
                return false;
             }catch(java.lang.NullPointerException e0){
             }catch(java.lang.ClassCastException e0){
             }
          }
       }
    }
    public int copyIntoArray(Object[] p0,int p1){
       return this.elements.copyIntoArray(p0, p1);
    }
    public ImmutableSortedSet createDescendingSet(){
       Comparator uComparator = Collections.reverseOrder(this.comparator);
       RegularImmutableSortedSet regularImmut = (this.isEmpty())? ImmutableSortedSet.emptySet(uComparator): new RegularImmutableSortedSet(this.elements.reverse(), uComparator);
       return regularImmut;
    }
    public Iterator descendingIterator(){
       return this.descendingIterator();
    }
    public t0 descendingIterator(){
       return this.elements.reverse().iterator();
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof Set) {
          return false;
       }
       if (this.size() != p0.size()) {
          return false;
       }
       if (this.isEmpty()) {
          return true;
       }
       if (!o0.b(this.comparator, p0)) {
          return this.containsAll(p0);
       }
       p0 = p0.iterator();
       try{
          t0 ot0 = this.iterator();
          while (true) {
             if (!ot0.hasNext()) {
                return true;
             }
             Object obj = ot0.next();
             Object obj1 = p0.next();
             if (obj1 == null || this.unsafeCompare(obj, obj1)) {
                break ;
             }
          }
          return false;
       }catch(java.lang.ClassCastException e0){
          return false;
       }catch(java.util.NoSuchElementException e0){
       }
    }
    public Object first(){
       if (!this.isEmpty()) {
          return this.elements.get(0);
       }
       throw new NoSuchElementException();
    }
    public Object floor(Object p0){
       int i = this.headIndex(p0, true) - true;
       i = (i == -1)? null: this.elements.get(i);
       return i;
    }
    public RegularImmutableSortedSet getSubSet(int p0,int p1){
       if (!p0 && p1 == this.size()) {
          return this;
       }
       if (p0 < p1) {
          return new RegularImmutableSortedSet(this.elements.subList(p0, p1), this.comparator);
       }
       return ImmutableSortedSet.emptySet(this.comparator);
    }
    public int headIndex(Object p0,boolean p1){
       n.j(p0);
       int i = Collections.binarySearch(this.elements, p0, this.comparator());
       if (i < 0) {
          return (~ i);
       }
       if (p1) {
          i++;
       }
       return i;
    }
    public ImmutableSortedSet headSetImpl(Object p0,boolean p1){
       return this.getSubSet(0, this.headIndex(p0, p1));
    }
    public Object higher(Object p0){
       int i = this.tailIndex(p0, false);
       i = (i == this.size())? null: this.elements.get(i);
       return i;
    }
    public int indexOf(Object p0){
       int i = -1;
       if (p0 == null) {
          return i;
       }
       try{
          int i1 = Collections.binarySearch(this.elements, p0, this.unsafeComparator());
          if (i1 >= 0) {
             i = i1;
          }
          return e0;
       }catch(java.lang.ClassCastException e0){
       }
    }
    public boolean isPartialView(){
       return this.elements.isPartialView();
    }
    public Iterator iterator(){
       return this.iterator();
    }
    public t0 iterator(){
       return this.elements.iterator();
    }
    public Object last(){
       if (!this.isEmpty()) {
          return this.elements.get((this.size() - 1));
       }
       throw new NoSuchElementException();
    }
    public Object lower(Object p0){
       int i = this.headIndex(p0, false) - 1;
       i = (i == -1)? null: this.elements.get(i);
       return i;
    }
    public int size(){
       return this.elements.size();
    }
    public ImmutableSortedSet subSetImpl(Object p0,boolean p1,Object p2,boolean p3){
       return this.tailSetImpl(p0, p1).headSetImpl(p2, p3);
    }
    public int tailIndex(Object p0,boolean p1){
       n.j(p0);
       int i = Collections.binarySearch(this.elements, p0, this.comparator());
       if (i < 0) {
          return (~ i);
       }
       if (!p1) {
          i++;
       }
       return i;
    }
    public ImmutableSortedSet tailSetImpl(Object p0,boolean p1){
       return this.getSubSet(this.tailIndex(p0, p1), this.size());
    }
    public Comparator unsafeComparator(){
       return this.comparator;
    }
}
