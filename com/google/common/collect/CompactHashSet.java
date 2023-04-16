package com.google.common.collect.CompactHashSet;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;
import java.util.Arrays;
import qk.w;
import ok.k;
import java.lang.Math;
import java.lang.IllegalStateException;
import java.lang.String;
import ok.n;
import java.util.Iterator;
import com.google.common.collect.CompactHashSet$a;
import java.io.ObjectInputStream;
import qk.h0;
import java.lang.System;
import java.lang.Integer;
import java.io.ObjectOutputStream;

public class CompactHashSet extends AbstractSet implements Serializable	// class@0017b3
{
    public int[] b;
    public int c;
    public int d;
    public Object[] elements;
    public long[] entries;
    public float loadFactor;
    public int modCount;

    public void CompactHashSet(){
       super();
       this.init(3, 0x3f800000);
    }
    public void CompactHashSet(int p0){
       super();
       this.init(p0, 0x3f800000);
    }
    public static int b(long p0){
       return (int)p0;
    }
    public static CompactHashSet create(){
       return new CompactHashSet();
    }
    public static CompactHashSet create(Collection p0){
       CompactHashSet uCompactHash = CompactHashSet.createWithExpectedSize(p0.size());
       uCompactHash.addAll(p0);
       return uCompactHash;
    }
    public static CompactHashSet create(Object[] p0){
       CompactHashSet uCompactHash = CompactHashSet.createWithExpectedSize(p0.length);
       Collections.addAll(uCompactHash, p0);
       return uCompactHash;
    }
    public static CompactHashSet createWithExpectedSize(int p0){
       return new CompactHashSet(p0);
    }
    public static int getHash(long p0){
       return (int)(p0 >> 32);
    }
    public static int[] l(int p0){
       int[] ointArray = new int[p0];
       Arrays.fill(ointArray, -1);
       return ointArray;
    }
    public static long n(long p0,int p1){
       return ((p0 & 0xffffffff00000000) | ((long)p1 & 0xffffffff));
    }
    public boolean add(Object p0){
       CompactHashSet tentries = this.entries;
       CompactHashSet telements = this.elements;
       int i = w.c(p0);
       int i1 = this.d() & i;
       CompactHashSet td = this.d;
       CompactHashSet tb = this.b;
       int i2 = tb[i1];
       long l = -1;
       if (i2 == l) {
          tb[i1] = td;
       }else {
          while (true) {
             long l1 = tentries[i2];
             if (CompactHashSet.getHash(l1) == i && k.a(p0, telements[i2])) {
                return false;
             }
             i1 = CompactHashSet.b(l1);
             if (i1 == l) {
                tentries[i2] = CompactHashSet.n(l1, td);
             }else {
                i2 = i1;
             }
          }
       }
       int i3 = Integer.MAX_VALUE;
       if (td != i3) {
          int i4 = td + 1;
          i1 = this.entries.length;
          if (i4 > i1) {
             i2 = Math.max(1, (i1 >> 1)) + i1;
             if (i2 >= 0) {
                i3 = i2;
             }
             if (i3 != i1) {
                this.resizeEntries(i3);
             }
          }
          this.insertEntry(td, p0, i);
          this.d = i4;
          if (td >= this.c) {
             this.m((this.b.length * 2));
          }
          this.modCount = this.modCount + 1;
          return 1;
       }else {
          throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
       }
    }
    public int adjustAfterRemove(int p0,int p1){
       p0--;
       return p0;
    }
    public void clear(){
       this.modCount = this.modCount + 1;
       Arrays.fill(this.elements, 0, this.d, null);
       Arrays.fill(this.b, -1);
       Arrays.fill(this.entries, -1);
       this.d = 0;
    }
    public boolean contains(Object p0){
       int i = w.c(p0);
       int i1 = this.b[(this.d() & i)];
       while (true) {
          if (i1 == -1) {
             return false;
          }
          long l = this.entries[i1];
          if (CompactHashSet.getHash(l) == i && k.a(p0, this.elements[i1])) {
             break ;
          }else {
             i1 = CompactHashSet.b(l);
          }
       }
       return true;
    }
    public final int d(){
       return (this.b.length - 1);
    }
    public int firstEntryIndex(){
       int i = (this.isEmpty())? -1: 0;
       return i;
    }
    public int getSuccessor(int p0){
       p0++;
       if (p0 < this.d) {
       }else {
          p0 = -1;
       }
       return p0;
    }
    public void init(int p0,float p1){
       int b = false;
       boolean b1 = (p0 >= 0)? true: false;
       n.c(b1, "Initial capacity must be non-negative");
       if (p1 > 0) {
          b = true;
       }
       n.c(b, "Illegal load factor");
       b = w.a(p0, (double)p1);
       this.b = CompactHashSet.l(b);
       this.loadFactor = p1;
       Object[] objArray = new Object[p0];
       this.elements = objArray;
       long[] olongArray = new long[p0];
       Arrays.fill(olongArray, -1);
       this.entries = olongArray;
       this.c = Math.max(1, (int)((float)b * p1));
       return;
    }
    public void insertEntry(int p0,Object p1,int p2){
       this.entries[p0] = ((long)p2 << 32) | 0xffffffff;
       p2[p0] = p1;
    }
    public boolean isEmpty(){
       boolean b = (this.d == null)? true: false;
       return b;
    }
    public Iterator iterator(){
       return new CompactHashSet$a(this);
    }
    public final void m(int p0){
       if (this.b.length >= 0x40000000) {
          this.c = Integer.MAX_VALUE;
          return;
       }else {
          int i = (int)((float)p0 * this.loadFactor) + 1;
          int[] ointArray = CompactHashSet.l(p0);
          CompactHashSet tentries = this.entries;
          int i1 = ointArray.length - 1;
          for (int i2 = 0; i2 < this.d; i2 = i2 + 1) {
             int hash = CompactHashSet.getHash(tentries[i2]);
             int i3 = hash & i1;
             int i4 = ointArray[i3];
             ointArray[i3] = i2;
             long l = (long)hash << 32;
             long l1 = (long)i4 & 0xffffffff;
             l = l | l1;
             tentries[i2] = l;
          }
          this.c = i;
          this.b = ointArray;
          return;
       }
    }
    public void moveEntry(int p0){
       int i = this.size() - 1;
       long l = -1;
       object oobject = null;
       if (p0 < i) {
          CompactHashSet telements = this.elements;
          telements[p0] = telements[i];
          telements[i] = oobject;
          CompactHashSet tentries = this.entries;
          long l1 = tentries[i];
          tentries[p0] = l1;
          tentries[i] = l;
          int i1 = CompactHashSet.getHash(l1) & this.d();
          CompactHashSet tb = this.b;
          int i2 = tb[i1];
          if (i2 == i) {
             tb[i1] = p0;
          }else {
             l1 = this.entries[i2];
             i1 = CompactHashSet.b(l1);
             while (i1 != i) {
                i2 = i1;
             }
             this.entries[i2] = CompactHashSet.n(l1, p0);
          }
       }else {
          this.elements[p0] = oobject;
          this.entries[p0] = l;
       }
       return;
    }
    public final void readObject(ObjectInputStream p0){
       p0.defaultReadObject();
       this.init(3, 0x3f800000);
       int i = p0.readInt();
       i = i - 1;
       while (i >= 0) {
          this.add(p0.readObject());
       }
       return;
    }
    public boolean remove(Object p0){
       return this.remove(p0, w.c(p0));
    }
    public boolean remove(Object p0,int p1){
       int i = this.d() & p1;
       int i1 = this.b[i];
       boolean b = false;
       if (i1 == -1) {
          return b;
       }
       int i2 = -1;
       while (true) {
          if (CompactHashSet.getHash(this.entries[i1]) == p1 && k.a(p0, this.elements[i1])) {
             if (i2 == -1) {
                p0[i] = CompactHashSet.b(this.entries[i1]);
                break ;
             }else {
                p0 = this.entries;
                p0[i2] = CompactHashSet.n(p0[i2], CompactHashSet.b(p0[i1]));
                break ;
             }
          }else {
             i2 = CompactHashSet.b(this.entries[i1]);
             if (i2 == -1) {
                return b;
             }
             i2 = i1;
             i1 = i2;
          }
       }
       this.moveEntry(i1);
       this.d = this.d - 1;
       this.modCount = this.modCount + 1;
       return 1;
    }
    public void resizeEntries(int p0){
       this.elements = Arrays.copyOf(this.elements, p0);
       CompactHashSet tentries = this.entries;
       int len = tentries.length;
       long[] olongArray = Arrays.copyOf(tentries, p0);
       if (p0 > len) {
          Arrays.fill(olongArray, len, p0, -1);
       }
       this.entries = olongArray;
       return;
    }
    public int size(){
       return this.d;
    }
    public Object[] toArray(){
       return Arrays.copyOf(this.elements, this.d);
    }
    public Object[] toArray(Object[] p0){
       CompactHashSet telements = this.elements;
       CompactHashSet td = this.d;
       n.m(0, (0 + td), telements.length);
       if (p0.length < td) {
          p0 = h0.d(p0, td);
       }else if(p0.length > td){
          p0[td] = null;
       }
       System.arraycopy(telements, 0, p0, 0, td);
       return p0;
    }
    public void trimToSize(){
       CompactHashSet td = this.d;
       if (td < this.entries.length) {
          this.resizeEntries(td);
       }
       int i = Math.max(1, Integer.highestOneBit((int)((float)td / this.loadFactor)));
       if (i < -172017461051714940000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.00f && ((double)td / (double)i) - (double)this.loadFactor > 0) {
          i = i << 1;
       }
       if (i < this.b.length) {
          this.m(i);
       }
       return;
    }
    public final void writeObject(ObjectOutputStream p0){
       p0.defaultWriteObject();
       p0.writeInt(this.d);
       Iterator iterator = this.iterator();
       while (iterator.hasNext()) {
          p0.writeObject(iterator.next());
       }
       return;
    }
}
