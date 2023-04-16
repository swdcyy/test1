package com.google.common.collect.HashBiMap;
import qk.f;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.lang.Object;
import ok.n;
import java.lang.AssertionError;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.Set;
import com.google.common.collect.HashBiMap$c;
import ok.k;
import qk.w;
import com.google.common.collect.ImmutableCollection$b;
import qk.g;
import com.google.common.collect.HashBiMap$Inverse;
import com.google.common.collect.HashBiMap$e;
import java.io.ObjectInputStream;
import com.google.common.collect.m;
import java.lang.IllegalArgumentException;
import java.util.Collection;
import com.google.common.collect.HashBiMap$f;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Map$Entry;

public final class HashBiMap extends AbstractMap implements f, Serializable	// class@0017d1
{
    public int[] b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int f;
    public int firstInInsertionOrder;
    public int[] g;
    public Set h;
    public Set i;
    public f inverse;
    public Set j;
    public Object[] keys;
    public int modCount;
    public int[] nextInInsertionOrder;
    public int size;
    public Object[] values;

    public void HashBiMap(int p0){
       super();
       this.init(p0);
    }
    public static int[] c(int p0){
       int[] ointArray = new int[p0];
       Arrays.fill(ointArray, -1);
       return ointArray;
    }
    public static HashBiMap create(){
       return HashBiMap.create(16);
    }
    public static HashBiMap create(int p0){
       return new HashBiMap(p0);
    }
    public static HashBiMap create(Map p0){
       HashBiMap hashBiMap = HashBiMap.create(p0.size());
       hashBiMap.putAll(p0);
       return hashBiMap;
    }
    public static int[] h(int[] p0,int p1){
       p0 = Arrays.copyOf(p0, p1);
       Arrays.fill(p0, p0.length, p1, -1);
       return p0;
    }
    public final int a(int p0){
       return (p0 & (this.b.length - 1));
    }
    public void clear(){
       Arrays.fill(this.keys, 0, this.size, null);
       Arrays.fill(this.values, 0, this.size, null);
       Arrays.fill(this.b, -1);
       Arrays.fill(this.c, -1);
       Arrays.fill(this.d, 0, this.size, -1);
       Arrays.fill(this.e, 0, this.size, -1);
       Arrays.fill(this.g, 0, this.size, -1);
       Arrays.fill(this.nextInInsertionOrder, 0, this.size, -1);
       this.size = 0;
       this.firstInInsertionOrder = -2;
       this.f = -2;
       this.modCount = this.modCount + 1;
    }
    public boolean containsKey(Object p0){
       boolean b = (this.findEntryByKey(p0) != -1)? true: false;
       return b;
    }
    public boolean containsValue(Object p0){
       boolean b = (this.findEntryByValue(p0) != -1)? true: false;
       return b;
    }
    public final void e(int p0,int p1){
       int i = -1;
       int b = (p0 != i)? true: false;
       n.b(b);
       p1 = this.a(p1);
       HashBiMap tb = this.b;
       if (tb[p1] == p0) {
          HashBiMap td = this.d;
          tb[p1] = td[p0];
          td[p0] = i;
          return;
       }else {
          p1 = tb[p1];
          b = this.d[p1];
          while (true) {
             b = p1;
             p1 = b;
             if (p1 == i) {
                throw new AssertionError("Expected to find entry with key "+this.keys[p0]);
             }
             if (p1 == p0) {
                break ;
             }else {
                b = this.d[p1];
             }
          }
          HashBiMap td1 = this.d;
          td1[b] = td1[p0];
          td1[p0] = i;
          return;
       }
    }
    public Set entrySet(){
       HashBiMap tj = this.j;
       if (tj == null) {
          tj = new HashBiMap$c(this);
          this.j = tj;
       }
       return tj;
    }
    public final void f(int p0,int p1){
       int i = -1;
       int b = (p0 != i)? true: false;
       n.b(b);
       p1 = this.a(p1);
       HashBiMap tc = this.c;
       if (tc[p1] == p0) {
          HashBiMap te = this.e;
          tc[p1] = te[p0];
          te[p0] = i;
          return;
       }else {
          p1 = tc[p1];
          b = this.e[p1];
          while (true) {
             b = p1;
             p1 = b;
             if (p1 == i) {
                throw new AssertionError("Expected to find entry with value "+this.values[p0]);
             }
             if (p1 == p0) {
                break ;
             }else {
                b = this.e[p1];
             }
          }
          HashBiMap te1 = this.e;
          te1[b] = te1[p0];
          te1[p0] = i;
          return;
       }
    }
    public int findEntry(Object p0,int p1,int[] p2,int[] p3,Object[] p4){
       p1 = p2[this.a(p1)];
       while (true) {
          object oobject = -1;
          if (p1 == oobject) {
             return oobject;
          }
          if (k.a(p4[p1], p0)) {
             break ;
          }else {
             p1 = p3[p1];
          }
       }
       return p1;
    }
    public int findEntryByKey(Object p0){
       return this.findEntryByKey(p0, w.c(p0));
    }
    public int findEntryByKey(Object p0,int p1){
       return this.findEntry(p0, p1, this.b, this.d, this.keys);
    }
    public int findEntryByValue(Object p0){
       return this.findEntryByValue(p0, w.c(p0));
    }
    public int findEntryByValue(Object p0,int p1){
       return this.findEntry(p0, p1, this.c, this.e, this.values);
    }
    public Object forcePut(Object p0,Object p1){
       return this.put(p0, p1, true);
    }
    public final void g(int p0){
       int i;
       HashBiMap td = this.d;
       if (td.length < p0) {
          i = ImmutableCollection$b.e(td.length, p0);
          this.keys = Arrays.copyOf(this.keys, i);
          this.values = Arrays.copyOf(this.values, i);
          this.d = HashBiMap.h(this.d, i);
          this.e = HashBiMap.h(this.e, i);
          this.g = HashBiMap.h(this.g, i);
          this.nextInInsertionOrder = HashBiMap.h(this.nextInInsertionOrder, i);
       }
       if (this.b.length < p0) {
          p0 = w.a(p0, 0x3ff0000000000000);
          this.b = HashBiMap.c(p0);
          this.c = HashBiMap.c(p0);
          for (p0 = 0; p0 < this.size; p0++) {
             i = this.a(w.c(this.keys[p0]));
             HashBiMap tb = this.b;
             this.d[p0] = tb[i];
             tb[i] = p0;
             i = this.a(w.c(this.values[p0]));
             tb = this.c;
             this.e[p0] = tb[i];
             tb[i] = p0;
          }
       }
       return;
    }
    public Object get(Object p0){
       int i = this.findEntryByKey(p0);
       i = (i == -1)? null: this.values[i];
       return i;
    }
    public Object getInverse(Object p0){
       int i = this.findEntryByValue(p0);
       i = (i == -1)? null: this.keys[i];
       return i;
    }
    public final void i(int p0,int p1){
       boolean b = (p0 != -1)? true: false;
       n.b(b);
       p1 = this.a(p1);
       HashBiMap tb = this.b;
       this.d[p0] = tb[p1];
       tb[p1] = p0;
       return;
    }
    public void init(int p0){
       g.b(p0, "expectedSize");
       int i = w.a(p0, 0x3ff0000000000000);
       this.size = 0;
       Object[] objArray = new Object[p0];
       this.keys = objArray;
       objArray = new Object[p0];
       this.values = objArray;
       this.b = HashBiMap.c(i);
       this.c = HashBiMap.c(i);
       this.d = HashBiMap.c(p0);
       this.e = HashBiMap.c(p0);
       this.firstInInsertionOrder = -2;
       this.f = -2;
       this.g = HashBiMap.c(p0);
       this.nextInInsertionOrder = HashBiMap.c(p0);
    }
    public f inverse(){
       HashBiMap tinverse = this.inverse;
       if (tinverse == null) {
          tinverse = new HashBiMap$Inverse(this);
          this.inverse = tinverse;
       }
       return tinverse;
    }
    public final void j(int p0,int p1){
       boolean b = (p0 != -1)? true: false;
       n.b(b);
       p1 = this.a(p1);
       HashBiMap tc = this.c;
       this.e[p0] = tc[p1];
       tc[p1] = p0;
       return;
    }
    public final void k(int p0,int p1,int p2){
       int i = -1;
       int b = (p0 != i)? true: false;
       n.b(b);
       this.e(p0, p1);
       this.f(p0, p2);
       this.m(this.g[p0], this.nextInInsertionOrder[p0]);
       p1 = this.size - 1;
       if (p1 != p0) {
          this.m(this.g[p1], p0);
          this.m(p0, this.nextInInsertionOrder[p1]);
          HashBiMap tkeys = this.keys;
          object oobject = tkeys[p1];
          HashBiMap tvalues = this.values;
          object oobject1 = tvalues[p1];
          tkeys[p0] = oobject;
          tvalues[p0] = oobject1;
          tkeys = this.a(w.c(oobject));
          HashBiMap tb = this.b;
          if (tb[tkeys] == p1) {
             tb[tkeys] = p0;
          }else {
             tkeys = tb[tkeys];
             b = this.d[tkeys];
             b = tkeys;
             tkeys = b;
             while (tkeys != p1) {
                b = this.d[tkeys];
             }
             tkeys[b] = p0;
          }
          tkeys = this.d;
          tkeys[p0] = tkeys[p1];
          tkeys[p1] = i;
          tkeys = this.a(w.c(oobject1));
          tb = this.c;
          if (tb[tkeys] == p1) {
             tb[tkeys] = p0;
          }else {
             tkeys = tb[tkeys];
             b = this.e[tkeys];
             b = tkeys;
             tkeys = b;
             while (tkeys != p1) {
                b = this.e[tkeys];
             }
             tkeys[b] = p0;
          }
          tkeys = this.e;
          tkeys[p0] = tkeys[p1];
          tkeys[p1] = i;
       }
       HashBiMap tsize = this.size;
       p0[(tsize - 1)] = null;
       p0[(tsize - 1)] = null;
       this.size = tsize - 1;
       this.modCount = this.modCount + 1;
       return;
    }
    public Set keySet(){
       HashBiMap th = this.h;
       if (th == null) {
          th = new HashBiMap$e(this);
          this.h = th;
       }
       return th;
    }
    public final void m(int p0,int p1){
       int i = -2;
       if (p0 == i) {
          this.firstInInsertionOrder = p1;
       }else {
          this.nextInInsertionOrder[p0] = p1;
       }
       if (p1 == i) {
          this.f = p0;
       }else {
          this.g[p1] = p0;
       }
       return;
    }
    public Object put(Object p0,Object p1){
       return this.put(p0, p1, false);
    }
    public Object put(Object p0,Object p1,boolean p2){
       int i = w.c(p0);
       int i1 = this.findEntryByKey(p0, i);
       HashBiMap hashBiMap = -1;
       if (i1 != hashBiMap) {
          p0 = this.values[i1];
          if (k.a(p0, p1)) {
             return p1;
          }else {
             this.replaceValueInEntry(i1, p1, p2);
             return p0;
          }
       }else {
          i1 = w.c(p1);
          int i2 = this.findEntryByValue(p1, i1);
          if (p2) {
             if (i2 != hashBiMap) {
                this.removeEntryValueHashKnown(i2, i1);
             }
          }else if(i2 == hashBiMap){
             p2 = true;
          }else {
             p2 = false;
          }
          n.g(p2, "Value already present: %s", p1);
          this.g((this.size + 1));
          hashBiMap = this.size;
          p2[hashBiMap] = p0;
          p0[hashBiMap] = p1;
          this.i(hashBiMap, i);
          this.j(this.size, i1);
          this.m(this.f, this.size);
          this.m(this.size, -2);
          this.size = this.size + 1;
          this.modCount = this.modCount + 1;
          return null;
       }
    }
    public Object putInverse(Object p0,Object p1,boolean p2){
       int i4;
       int i = w.c(p0);
       int i1 = this.findEntryByValue(p0, i);
       HashBiMap hashBiMap = -1;
       if (i1 != hashBiMap) {
          p0 = this.keys[i1];
          if (k.a(p0, p1)) {
             return p1;
          }else {
             this.replaceKeyInEntry(i1, p1, p2);
             return p0;
          }
       }else {
          HashBiMap tf = this.f;
          int i2 = w.c(p1);
          int i3 = this.findEntryByKey(p1, i2);
          if (p2) {
             if (i3 != hashBiMap) {
                tf = this.g[i3];
                this.removeEntryKeyHashKnown(i3, i2);
             }
          }else if(i3 == hashBiMap){
             p2 = true;
          }else {
             p2 = false;
          }
          n.g(p2, "Key already present: %s", p1);
          this.g((this.size + 1));
          hashBiMap = this.size;
          p2[hashBiMap] = p1;
          p1[hashBiMap] = p0;
          this.i(hashBiMap, i2);
          this.j(this.size, i);
          p0 = (tf == -2)? this.firstInInsertionOrder: this.nextInInsertionOrder[tf];
          this.m(tf, this.size);
          this.m(this.size, p0);
          this.size = this.size + 1;
          this.modCount = this.modCount + 1;
          return null;
       }
    }
    public final void readObject(ObjectInputStream p0){
       p0.defaultReadObject();
       int i = m.c(p0);
       this.init(16);
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.put(p0.readObject(), p0.readObject());
       }
       return;
    }
    public Object remove(Object p0){
       int i = w.c(p0);
       int i1 = this.findEntryByKey(p0, i);
       if (i1 == -1) {
          return null;
       }
       this.removeEntryKeyHashKnown(i1, i);
       return this.values[i1];
    }
    public void removeEntry(int p0){
       this.removeEntryKeyHashKnown(p0, w.c(this.keys[p0]));
    }
    public void removeEntryKeyHashKnown(int p0,int p1){
       this.k(p0, p1, w.c(this.values[p0]));
    }
    public void removeEntryValueHashKnown(int p0,int p1){
       this.k(p0, w.c(this.keys[p0]), p1);
    }
    public Object removeInverse(Object p0){
       int i = w.c(p0);
       int i1 = this.findEntryByValue(p0, i);
       if (i1 == -1) {
          return null;
       }
       this.removeEntryValueHashKnown(i1, i);
       return this.keys[i1];
    }
    public void replaceKeyInEntry(int p0,Object p1,boolean p2){
       int i = -1;
       int b = (p0 != i)? true: false;
       n.b(b);
       b = w.c(p1);
       int i1 = this.findEntryByKey(p1, b);
       HashBiMap tf = this.f;
       int i2 = -2;
       if (i1 != i) {
          if (p2) {
             tf = this.g[i1];
             i2 = this.nextInInsertionOrder[i1];
             this.removeEntryKeyHashKnown(i1, b);
             if (p0 == this.size) {
                p0 = i1;
             }
          }else {
             throw new IllegalArgumentException("Key already present in map: "+p1);
          }
       }
       if (tf == p0) {
          tf = this.g[p0];
       }else if(tf == this.size){
          tf = i1;
       }
       if (i2 == p0) {
          i1 = this.nextInInsertionOrder[p0];
       }else if(i2 == this.size){
          i1 = i2;
       }
       this.m(this.g[p0], this.nextInInsertionOrder[p0]);
       this.e(p0, w.c(this.keys[p0]));
       p2[p0] = p1;
       this.i(p0, w.c(p1));
       this.m(tf, p0);
       this.m(p0, i1);
       return;
    }
    public void replaceValueInEntry(int p0,Object p1,boolean p2){
       int i = -1;
       int b = (p0 != i)? true: false;
       n.b(b);
       b = w.c(p1);
       int i1 = this.findEntryByValue(p1, b);
       if (i1 != i) {
          if (p2) {
             this.removeEntryValueHashKnown(i1, b);
             if (p0 == this.size) {
                p0 = i1;
             }
          }else {
             throw new IllegalArgumentException("Value already present in map: "+p1);
          }
       }
       this.f(p0, w.c(this.values[p0]));
       p2[p0] = p1;
       this.j(p0, b);
       return;
    }
    public int size(){
       return this.size;
    }
    public Collection values(){
       return this.values();
    }
    public Set values(){
       HashBiMap ti = this.i;
       if (ti == null) {
          ti = new HashBiMap$f(this);
          this.i = ti;
       }
       return ti;
    }
    public final void writeObject(ObjectOutputStream p0){
       p0.defaultWriteObject();
       p0.writeInt(this.size());
       Iterator iterator = this.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          p0.writeObject(uEntry.getKey());
          p0.writeObject(uEntry.getValue());
       }
       return;
    }
}
