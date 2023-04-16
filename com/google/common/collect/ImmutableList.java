package com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.RandomAccess;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList$b;
import com.google.common.collect.RegularImmutableList;
import java.lang.Object;
import qk.h0;
import com.google.common.collect.ImmutableList$a;
import java.lang.String;
import qk.g;
import java.lang.Iterable;
import ok.n;
import java.util.Collection;
import java.util.Iterator;
import com.google.common.collect.ImmutableCollection$b;
import java.lang.System;
import java.lang.Comparable;
import qk.y;
import java.util.Arrays;
import java.util.Comparator;
import java.lang.UnsupportedOperationException;
import java.util.AbstractCollection;
import ok.k;
import com.google.common.collect.Iterators;
import qk.t0;
import qk.u0;
import java.util.ListIterator;
import java.io.ObjectInputStream;
import java.io.InvalidObjectException;
import com.google.common.collect.ImmutableList$ReverseImmutableList;
import com.google.common.collect.ImmutableList$SubList;

public abstract class ImmutableList extends ImmutableCollection implements List, RandomAccess	// class@0004db
{
    public static final u0 c;

    static {
       ImmutableList.c = new ImmutableList$b(RegularImmutableList.EMPTY, 0);
    }
    public void ImmutableList(){
       super();
    }
    public static ImmutableList asImmutableList(Object[] p0){
       return ImmutableList.asImmutableList(p0, p0.length);
    }
    public static ImmutableList asImmutableList(Object[] p0,int p1){
       if (!p1) {
          return ImmutableList.of();
       }
       return new RegularImmutableList(p0, p1);
    }
    public static ImmutableList b(Object[] p0){
       h0.b(p0);
       return ImmutableList.asImmutableList(p0);
    }
    public static ImmutableList$a builder(){
       return new ImmutableList$a();
    }
    public static ImmutableList$a builderWithExpectedSize(int p0){
       g.b(p0, "expectedSize");
       return new ImmutableList$a(p0);
    }
    public static ImmutableList copyOf(Iterable p0){
       n.j(p0);
       ImmutableList immutableLis = (p0 instanceof Collection)? ImmutableList.copyOf(p0): ImmutableList.copyOf(p0.iterator());
       return immutableLis;
    }
    public static ImmutableList copyOf(Collection p0){
       if (!p0 instanceof ImmutableCollection) {
          return ImmutableList.b(p0.toArray());
       }
       ImmutableList immutableLis = p0.asList();
       if (immutableLis.isPartialView()) {
          immutableLis = ImmutableList.asImmutableList(immutableLis.toArray());
       }
       return immutableLis;
    }
    public static ImmutableList copyOf(Iterator p0){
       if (!p0.hasNext()) {
          return ImmutableList.of();
       }
       Object obj = p0.next();
       if (!p0.hasNext()) {
          return ImmutableList.of(obj);
       }
       ImmutableList$a uoa = new ImmutableList$a();
       uoa.h(obj);
       uoa.c(p0);
       return uoa.i();
    }
    public static ImmutableList copyOf(Object[] p0){
       ImmutableList immutableLis = (!p0.length)? ImmutableList.of(): ImmutableList.b(p0.clone());
       return immutableLis;
    }
    public static ImmutableList of(){
       return RegularImmutableList.EMPTY;
    }
    public static ImmutableList of(Object p0){
       Object[] objArray = new Object[]{p0};
       return ImmutableList.b(objArray);
    }
    public static ImmutableList of(Object p0,Object p1){
       Object[] objArray = new Object[]{p0,p1};
       return ImmutableList.b(objArray);
    }
    public static ImmutableList of(Object p0,Object p1,Object p2){
       Object[] objArray = new Object[]{p0,p1,p2};
       return ImmutableList.b(objArray);
    }
    public static ImmutableList of(Object p0,Object p1,Object p2,Object p3){
       Object[] objArray = new Object[]{p0,p1,p2,p3};
       return ImmutableList.b(objArray);
    }
    public static ImmutableList of(Object p0,Object p1,Object p2,Object p3,Object p4){
       Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
       return ImmutableList.b(objArray);
    }
    public static ImmutableList of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5){
       Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
       return ImmutableList.b(objArray);
    }
    public static ImmutableList of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6){
       Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
       return ImmutableList.b(objArray);
    }
    public static ImmutableList of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7){
       Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,p7};
       return ImmutableList.b(objArray);
    }
    public static ImmutableList of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8){
       Object[] objArray = new Object[9];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       return ImmutableList.b(objArray);
    }
    public static ImmutableList of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9){
       Object[] objArray = new Object[10];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       objArray[9] = p9;
       return ImmutableList.b(objArray);
    }
    public static ImmutableList of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9,Object p10){
       Object[] objArray = new Object[11];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       objArray[9] = p9;
       objArray[10] = p10;
       return ImmutableList.b(objArray);
    }
    public static ImmutableList of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9,Object p10,Object p11,Object[] p12){
       Object obj = p12;
       int i = 1;
       boolean b = (obj.length <= 0x7ffffff3)? true: false;
       n.c(b, "the total number of elements must fit in an int");
       Object[] objArray = new Object[(obj.length + 12)];
       objArray[0] = p0;
       objArray[i] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       objArray[6] = p6;
       objArray[7] = p7;
       objArray[8] = p8;
       objArray[9] = p9;
       objArray[10] = p10;
       objArray[11] = p11;
       System.arraycopy(obj, 0, objArray, 12, obj.length);
       return ImmutableList.b(objArray);
    }
    public static ImmutableList sortedCopyOf(Iterable p0){
       Comparable[] uComparableA = new Comparable[0];
       Comparable[] uComparableA1 = y.w(p0, uComparableA);
       h0.b(uComparableA1);
       Arrays.sort(uComparableA1);
       return ImmutableList.asImmutableList(uComparableA1);
    }
    public static ImmutableList sortedCopyOf(Comparator p0,Iterable p1){
       n.j(p0);
       Object[] objArray = y.u(p1);
       h0.b(objArray);
       Arrays.sort(objArray, p0);
       return ImmutableList.asImmutableList(objArray);
    }
    public final void add(int p0,Object p1){
       throw new UnsupportedOperationException();
    }
    public final boolean addAll(int p0,Collection p1){
       throw new UnsupportedOperationException();
    }
    public final ImmutableList asList(){
       return this;
    }
    public boolean contains(Object p0){
       boolean b = (this.indexOf(p0) >= 0)? true: false;
       return b;
    }
    public int copyIntoArray(Object[] p0,int p1){
       int i = this.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          int i2 = p1 + i1;
          p0[i2] = this.get(i1);
       }
       return (p1 + i);
    }
    public boolean equals(Object p0){
       n.j(this);
       boolean b = false;
       if (p0 == this) {
       label_0007 :
          b = true;
       }else if(!p0 instanceof List){
          int i = this.size();
          if (i == p0.size()) {
             if (p0 instanceof RandomAccess) {
                int i1 = 0;
                while (true) {
                   if (i1 < i) {
                      if (k.a(this.get(i1), p0.get(i1))) {
                         i1 = i1 + 1;
                      }
                   }else {
                      goto label_0007 ;
                   }
                }
             }else {
                b = Iterators.g(this.iterator(), p0.iterator());
             }
          }
       }
       return b;
    }
    public int hashCode(){
       int i = this.size();
       int i1 = 1;
       for (int i2 = 0; i2 < i; i2 = i2 + 1) {
          i1 = i1 * 31;
          i1 = i1 + this.get(i2).hashCode();
          i1 = ~ i1;
          i1 = ~ i1;
       }
       return i1;
    }
    public int indexOf(Object p0){
       int i = -1;
       if (p0 == null) {
       }else {
          int i1 = this.size();
          int i2 = 0;
          while (i2 < i1) {
             if (p0.equals(this.get(i2))) {
                i = i2;
                break ;
             }
             i2 = i2 + 1;
          }
       }
       return i;
    }
    public Iterator iterator(){
       return this.iterator();
    }
    public t0 iterator(){
       return this.listIterator();
    }
    public int lastIndexOf(Object p0){
       int i = -1;
       if (p0 == null) {
       }else {
          int i1 = this.size() + i;
          while (i1 >= 0) {
             if (p0.equals(this.get(i1))) {
                i = i1;
                break ;
             }
             i1 = i1 - 1;
          }
       }
       return i;
    }
    public ListIterator listIterator(){
       return this.listIterator();
    }
    public ListIterator listIterator(int p0){
       return this.listIterator(p0);
    }
    public u0 listIterator(){
       return this.listIterator(0);
    }
    public u0 listIterator(int p0){
       n.l(p0, this.size());
       if (this.isEmpty()) {
          return ImmutableList.c;
       }
       return new ImmutableList$b(this, p0);
    }
    public final void readObject(ObjectInputStream p0){
       throw new InvalidObjectException("Use SerializedForm");
    }
    public final Object remove(int p0){
       throw new UnsupportedOperationException();
    }
    public ImmutableList reverse(){
       ImmutableList immutableLis = (this.size() <= 1)? this: new ImmutableList$ReverseImmutableList(this);
       return immutableLis;
    }
    public final Object set(int p0,Object p1){
       throw new UnsupportedOperationException();
    }
    public ImmutableList subList(int p0,int p1){
       n.m(p0, p1, this.size());
       int i = p1 - p0;
       if (i == this.size()) {
          return this;
       }
       if (!i) {
          return ImmutableList.of();
       }
       return this.subListUnchecked(p0, p1);
    }
    public List subList(int p0,int p1){
       return this.subList(p0, p1);
    }
    public ImmutableList subListUnchecked(int p0,int p1){
       return new ImmutableList$SubList(this, p0, (p1 - p0));
    }
}
