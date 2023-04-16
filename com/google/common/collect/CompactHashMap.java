package com.google.common.collect.CompactHashMap;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.lang.Object;
import ok.k;
import java.util.Set;
import com.google.common.collect.CompactHashMap$d;
import com.google.common.collect.CompactHashMap$f;
import java.util.Collection;
import com.google.common.collect.CompactHashMap$h;
import java.util.Iterator;
import com.google.common.collect.CompactHashMap$b;
import qk.w;
import ok.n;
import java.lang.Math;
import com.google.common.collect.CompactHashMap$a;
import java.lang.IllegalStateException;
import java.lang.String;
import java.io.ObjectInputStream;
import java.lang.Integer;
import com.google.common.collect.CompactHashMap$c;
import java.io.ObjectOutputStream;

public class CompactHashMap extends AbstractMap implements Serializable	// class@0004cc
{
    public int[] b;
    public int c;
    public Set d;
    public Set e;
    public long[] entries;
    public Collection f;
    public Object[] keys;
    public float loadFactor;
    public int modCount;
    public int size;
    public Object[] values;

    public void CompactHashMap(){
       super();
       this.init(3, 0x3f800000);
    }
    public void CompactHashMap(int p0){
       super(p0, 0x3f800000);
    }
    public void CompactHashMap(int p0,float p1){
       super();
       this.init(p0, p1);
    }
    public static int a(long p0){
       return (int)(p0 >> 32);
    }
    public static int c(long p0){
       return (int)p0;
    }
    public static CompactHashMap create(){
       return new CompactHashMap();
    }
    public static CompactHashMap createWithExpectedSize(int p0){
       return new CompactHashMap(p0);
    }
    public static int[] f(int p0){
       int[] ointArray = new int[p0];
       Arrays.fill(ointArray, -1);
       return ointArray;
    }
    public static long i(long p0,int p1){
       return ((p0 & 0xffffffff00000000) | ((long)p1 & 0xffffffff));
    }
    public void accessEntry(int p0){
    }
    public int adjustAfterRemove(int p0,int p1){
       p0--;
       return p0;
    }
    public void clear(){
       this.modCount = this.modCount + 1;
       Arrays.fill(this.keys, 0, this.size, null);
       Arrays.fill(this.values, 0, this.size, null);
       Arrays.fill(this.b, -1);
       Arrays.fill(this.entries, -1);
       this.size = 0;
    }
    public boolean containsKey(Object p0){
       boolean b = (this.indexOf(p0) != -1)? true: false;
       return b;
    }
    public boolean containsValue(Object p0){
       int i = 0;
       while (true) {
          if (i >= this.size) {
             return false;
          }
          if (k.a(p0, this.values[i])) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public Set createEntrySet(){
       return new CompactHashMap$d(this);
    }
    public Set createKeySet(){
       return new CompactHashMap$f(this);
    }
    public Collection createValues(){
       return new CompactHashMap$h(this);
    }
    public final int e(){
       return (this.b.length - 1);
    }
    public Set entrySet(){
       CompactHashMap te = this.e;
       if (te == null) {
          te = this.createEntrySet();
          this.e = te;
       }
       return te;
    }
    public Iterator entrySetIterator(){
       return new CompactHashMap$b(this);
    }
    public int firstEntryIndex(){
       int i = (this.isEmpty())? -1: 0;
       return i;
    }
    public final Object g(Object p0,int p1){
       int i = this.e() & p1;
       int i1 = this.b[i];
       Object obj = null;
       long l = -1;
       if (i1 == l) {
          return obj;
       }
       int i2 = -1;
       while (true) {
          if (CompactHashMap.a(this.entries[i1]) == p1 && k.a(p0, this.keys[i1])) {
             p0 = this.values[i1];
             if (i2 == l) {
                p1[i] = CompactHashMap.c(this.entries[i1]);
                break ;
             }else {
                CompactHashMap tentries = this.entries;
                tentries[i2] = CompactHashMap.i(tentries[i2], CompactHashMap.c(tentries[i1]));
                break ;
             }
          }else {
             i2 = CompactHashMap.c(this.entries[i1]);
             if (i2 == l) {
                return obj;
             }
             i2 = i1;
             i1 = i2;
          }
       }
       this.moveLastEntry(i1);
       this.size = this.size - 1;
       this.modCount = this.modCount + 1;
       return p0;
    }
    public Object get(Object p0){
       int i = this.indexOf(p0);
       this.accessEntry(i);
       i = (i == -1)? null: this.values[i];
       return i;
    }
    public int getSuccessor(int p0){
       p0++;
       if (p0 < this.size) {
       }else {
          p0 = -1;
       }
       return p0;
    }
    public final void h(int p0){
       if (this.b.length >= 0x40000000) {
          this.c = Integer.MAX_VALUE;
          return;
       }else {
          int i = (int)((float)p0 * this.loadFactor) + 1;
          int[] ointArray = CompactHashMap.f(p0);
          CompactHashMap tentries = this.entries;
          int i1 = ointArray.length - 1;
          for (int i2 = 0; i2 < this.size; i2 = i2 + 1) {
             int i3 = CompactHashMap.a(tentries[i2]);
             int i4 = i3 & i1;
             int i5 = ointArray[i4];
             ointArray[i4] = i2;
             long l = (long)i3 << 32;
             long l1 = (long)i5 & 0xffffffff;
             l = l | l1;
             tentries[i2] = l;
          }
          this.c = i;
          this.b = ointArray;
          return;
       }
    }
    public int indexOf(Object p0){
       int i = w.c(p0);
       int i1 = this.b[(this.e() & i)];
       while (true) {
          CompactHashMap uCompactHash = -1;
          if (i1 == uCompactHash) {
             return uCompactHash;
          }
          long l = this.entries[i1];
          if (CompactHashMap.a(l) == i && k.a(p0, this.keys[i1])) {
             break ;
          }else {
             i1 = CompactHashMap.c(l);
          }
       }
       return i1;
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
       this.b = CompactHashMap.f(b);
       this.loadFactor = p1;
       Object[] objArray = new Object[p0];
       this.keys = objArray;
       objArray = new Object[p0];
       this.values = objArray;
       long[] olongArray = new long[p0];
       Arrays.fill(olongArray, -1);
       this.entries = olongArray;
       this.c = Math.max(1, (int)((float)b * p1));
       return;
    }
    public void insertEntry(int p0,Object p1,Object p2,int p3){
       this.entries[p0] = ((long)p3 << 32) | 0xffffffff;
       p3[p0] = p1;
       p1[p0] = p2;
    }
    public boolean isEmpty(){
       boolean b = (this.size == null)? true: false;
       return b;
    }
    public Set keySet(){
       CompactHashMap td = this.d;
       if (td == null) {
          td = this.createKeySet();
          this.d = td;
       }
       return td;
    }
    public Iterator keySetIterator(){
       return new CompactHashMap$a(this);
    }
    public void moveLastEntry(int p0){
       int i = this.size() - 1;
       long l = -1;
       object oobject = null;
       if (p0 < i) {
          CompactHashMap tkeys = this.keys;
          tkeys[p0] = tkeys[i];
          CompactHashMap tvalues = this.values;
          tvalues[p0] = tvalues[i];
          tkeys[i] = oobject;
          tvalues[i] = oobject;
          CompactHashMap tentries = this.entries;
          long l1 = tentries[i];
          tentries[p0] = l1;
          tentries[i] = l;
          int i1 = CompactHashMap.a(l1) & this.e();
          CompactHashMap tb = this.b;
          int i2 = tb[i1];
          if (i2 == i) {
             tb[i1] = p0;
          }else {
             l1 = this.entries[i2];
             i1 = CompactHashMap.c(l1);
             while (i1 != i) {
                i2 = i1;
             }
             this.entries[i2] = CompactHashMap.i(l1, p0);
          }
       }else {
          this.keys[p0] = oobject;
          this.values[p0] = oobject;
          this.entries[p0] = l;
       }
       return;
    }
    public Object put(Object p0,Object p1){
       CompactHashMap tentries = this.entries;
       CompactHashMap tkeys = this.keys;
       CompactHashMap tvalues = this.values;
       int i = w.c(p0);
       int i1 = this.e() & i;
       CompactHashMap tsize = this.size;
       CompactHashMap tb = this.b;
       int i2 = tb[i1];
       if (i2 == -1) {
          tb[i1] = tsize;
       }else {
          while (true) {
             long l = tentries[i2];
             if (CompactHashMap.a(l) == i && k.a(p0, tkeys[i2])) {
                p0 = tvalues[i2];
                tvalues[i2] = p1;
                this.accessEntry(i2);
                return p0;
             }else {
                i1 = CompactHashMap.c(l);
                if (i1 == -1) {
                   tentries[i2] = CompactHashMap.i(l, tsize);
                }else {
                   i2 = i1;
                }
             }
          }
       }
       int i3 = Integer.MAX_VALUE;
       if (tsize != i3) {
          int i4 = tsize + 1;
          int len = this.entries.length;
          if (i4 > len) {
             int i5 = Math.max(1, (len >> 1)) + len;
             if (i5 >= 0) {
                i3 = i5;
             }
             if (i3 != len) {
                this.resizeEntries(i3);
             }
          }
          this.insertEntry(tsize, p0, p1, i);
          this.size = i4;
          if (tsize >= this.c) {
             this.h((this.b.length * 2));
          }
          this.modCount = this.modCount + 1;
          return null;
       }else {
          throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
       }
    }
    public final void readObject(ObjectInputStream p0){
       p0.defaultReadObject();
       this.init(3, 0x3f800000);
       int i = p0.readInt();
       i = i - 1;
       while (i >= 0) {
          this.put(p0.readObject(), p0.readObject());
       }
       return;
    }
    public Object remove(Object p0){
       return this.g(p0, w.c(p0));
    }
    public Object removeEntry(int p0){
       return this.g(this.keys[p0], CompactHashMap.a(this.entries[p0]));
    }
    public void resizeEntries(int p0){
       this.keys = Arrays.copyOf(this.keys, p0);
       this.values = Arrays.copyOf(this.values, p0);
       CompactHashMap tentries = this.entries;
       int len = tentries.length;
       long[] olongArray = Arrays.copyOf(tentries, p0);
       if (p0 > len) {
          Arrays.fill(olongArray, len, p0, -1);
       }
       this.entries = olongArray;
       return;
    }
    public int size(){
       return this.size;
    }
    public void trimToSize(){
       CompactHashMap tsize = this.size;
       if (tsize < this.entries.length) {
          this.resizeEntries(tsize);
       }
       int i = Math.max(1, Integer.highestOneBit((int)((float)tsize / this.loadFactor)));
       if (i < -0.00f && ((double)tsize / (double)i) - (double)this.loadFactor > 0) {
          i = i << 1;
       }
       if (i < this.b.length) {
          this.h(i);
       }
       return;
    }
    public Collection values(){
       CompactHashMap tf = this.f;
       if (tf == null) {
          tf = this.createValues();
          this.f = tf;
       }
       return tf;
    }
    public Iterator valuesIterator(){
       return new CompactHashMap$c(this);
    }
    public final void writeObject(ObjectOutputStream p0){
       p0.defaultWriteObject();
       p0.writeInt(this.size);
       for (int i = 0; i < this.size; i = i + 1) {
          p0.writeObject(this.keys[i]);
          p0.writeObject(this.values[i]);
       }
       return;
    }
}
