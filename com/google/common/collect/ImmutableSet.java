package com.google.common.collect.ImmutableSet;
import java.util.Set;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet$a;
import java.lang.String;
import qk.g;
import java.lang.Math;
import java.lang.Integer;
import java.lang.Object;
import ok.n;
import qk.h0;
import qk.w;
import java.util.Arrays;
import com.google.common.collect.SingletonImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import java.lang.Iterable;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;
import java.lang.System;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o;
import qk.t0;

public abstract class ImmutableSet extends ImmutableCollection implements Set	// class@0004e3
{
    public ImmutableList c;

    public void ImmutableSet(){
       super();
    }
    public static ImmutableSet$a builder(){
       return new ImmutableSet$a();
    }
    public static ImmutableSet$a builderWithExpectedSize(int p0){
       g.b(p0, "expectedSize");
       return new ImmutableSet$a(p0);
    }
    public static int chooseTableSize(int p0){
       p0 = Math.max(p0, 2);
       int i = 1;
       if (p0 < 0x2ccccccc) {
          i = Integer.highestOneBit((p0 - 1)) << 1;
          double d = (double)i * 0x3fe6666666666666;
          while (d - (double)p0 < 0) {
             i = i << 1;
          }
          return i;
       }else if(p0 < 0x40000000){
          i = false;
       }
       n.c(i, "collection too large");
       return 0x40000000;
    }
    public static ImmutableSet construct(int p0,Object[] p1){
       if (!p0) {
          return ImmutableSet.of();
       }
       if (p0 == 1) {
          return ImmutableSet.of(p1[0]);
       }
       int i = ImmutableSet.chooseTableSize(p0);
       Object[] objArray = new Object[i];
       int i1 = i - 1;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       while (i2 < p0) {
          object oobject = p1[i2];
          h0.a(oobject, i2);
          int i5 = oobject.hashCode();
          int i6 = w.b(i5);
          while (true) {
             int i7 = i6 & i1;
             object oobject1 = objArray[i7];
             if (oobject1 == null) {
                i6 = i4 + 1;
                p1[i4] = oobject;
                objArray[i7] = oobject;
                i3 = i3 + i5;
                i4 = i6;
                break ;
             }else if(oobject1.equals(oobject)){
                break ;
             }else {
                i6 = i6 + 1;
             }
          }
          i2 = i2 + 1;
       }
       Arrays.fill(p1, i4, p0, null);
       if (i4 == 1) {
          return new SingletonImmutableSet(p1[0], i3);
       }
       if (ImmutableSet.chooseTableSize(i4) < (i / 2)) {
          return ImmutableSet.construct(i4, p1);
       }
       if (ImmutableSet.shouldTrim(i4, p1.length)) {
          p1 = Arrays.copyOf(p1, i4);
       }
       RegularImmutableSet regularImmut = new RegularImmutableSet(p1, i3, objArray, i1, i4);
       return ImmutableSet.shouldTrim(i4, p1.length);
    }
    public static ImmutableSet copyOf(Iterable p0){
       ImmutableSet immutableSet = (p0 instanceof Collection)? ImmutableSet.copyOf(p0): ImmutableSet.copyOf(p0.iterator());
       return immutableSet;
    }
    public static ImmutableSet copyOf(Collection p0){
       if (p0 instanceof ImmutableSet && !p0 instanceof SortedSet) {
          ImmutableCollection immutableCol = p0;
          if (!immutableCol.isPartialView()) {
             return immutableCol;
          }
       }
       Object[] objArray = p0.toArray();
       return ImmutableSet.construct(objArray.length, objArray);
    }
    public static ImmutableSet copyOf(Iterator p0){
       if (!p0.hasNext()) {
          return ImmutableSet.of();
       }
       Object obj = p0.next();
       if (!p0.hasNext()) {
          return ImmutableSet.of(obj);
       }
       ImmutableSet$a uoa = new ImmutableSet$a();
       uoa.h(obj);
       uoa.j(p0);
       return uoa.k();
    }
    public static ImmutableSet copyOf(Object[] p0){
       int len = p0.length;
       if (!len) {
          return ImmutableSet.of();
       }
       if (len != 1) {
          return ImmutableSet.construct(p0.length, p0.clone());
       }
       return ImmutableSet.of(p0[0]);
    }
    public static ImmutableSet of(){
       return RegularImmutableSet.EMPTY;
    }
    public static ImmutableSet of(Object p0){
       return new SingletonImmutableSet(p0);
    }
    public static ImmutableSet of(Object p0,Object p1){
       Object[] objArray = new Object[]{p0,p1};
       return ImmutableSet.construct(2, objArray);
    }
    public static ImmutableSet of(Object p0,Object p1,Object p2){
       Object[] objArray = new Object[]{p0,p1,p2};
       return ImmutableSet.construct(3, objArray);
    }
    public static ImmutableSet of(Object p0,Object p1,Object p2,Object p3){
       Object[] objArray = new Object[]{p0,p1,p2,p3};
       return ImmutableSet.construct(4, objArray);
    }
    public static ImmutableSet of(Object p0,Object p1,Object p2,Object p3,Object p4){
       Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
       return ImmutableSet.construct(5, objArray);
    }
    public static ImmutableSet of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object[] p6){
       int b = (p6.length <= 0x7ffffff9)? true: false;
       n.c(b, "the total number of elements must fit in an int");
       b = p6.length + 6;
       Object[] objArray = new Object[b];
       objArray[0] = p0;
       objArray[1] = p1;
       objArray[2] = p2;
       objArray[3] = p3;
       objArray[4] = p4;
       objArray[5] = p5;
       System.arraycopy(p6, 0, objArray, 6, p6.length);
       return ImmutableSet.construct(b, objArray);
    }
    public static boolean shouldTrim(int p0,int p1){
       boolean b = (p0 < ((p1 >> 1) + (p1 >> 2)))? true: false;
       return b;
    }
    public ImmutableList asList(){
       ImmutableSet tc = this.c;
       if (tc == null) {
          tc = this.createAsList();
          this.c = tc;
       }
       return tc;
    }
    public ImmutableList createAsList(){
       return ImmutableList.asImmutableList(this.toArray());
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof ImmutableSet && (this.isHashCodeFast() && (p0.isHashCodeFast() && this.hashCode() != p0.hashCode()))) {
          return false;
       }
       return o.b(this, p0);
    }
    public int hashCode(){
       return o.d(this);
    }
    public boolean isHashCodeFast(){
       return false;
    }
    public Iterator iterator(){
       return this.iterator();
    }
    public abstract t0 iterator();
}
