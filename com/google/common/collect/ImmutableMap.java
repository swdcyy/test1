package com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.io.Serializable;
import java.util.Map$Entry;
import java.lang.Object;
import com.google.common.collect.ImmutableMap$b;
import java.lang.String;
import qk.g;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Iterable;
import java.util.Collection;
import java.util.SortedMap;
import java.util.Set;
import java.util.AbstractMap$SimpleImmutableEntry;
import com.google.common.collect.RegularImmutableMap;
import java.lang.UnsupportedOperationException;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.o;
import qk.t0;
import com.google.common.collect.ImmutableMap$a;
import com.google.common.collect.ImmutableMap$SerializedForm;

public abstract class ImmutableMap implements Map, Serializable	// class@0004e0
{
    public ImmutableSet b;
    public ImmutableSet c;
    public ImmutableCollection d;
    public ImmutableSetMultimap e;
    public static final Map$Entry[] EMPTY_ENTRY_ARRAY;

    static {
       Map$Entry[] uEntryArray = new Map$Entry[0];
       ImmutableMap.EMPTY_ENTRY_ARRAY = uEntryArray;
    }
    public void ImmutableMap(){
       super();
    }
    public static ImmutableMap$b builder(){
       return new ImmutableMap$b();
    }
    public static ImmutableMap$b builderWithExpectedSize(int p0){
       g.b(p0, "expectedSize");
       return new ImmutableMap$b(p0);
    }
    public static void checkNoConflict(boolean p0,String p1,Map$Entry p2,Map$Entry p3){
       if (p0) {
          return;
       }
       throw new IllegalArgumentException("Multiple entries with same "+p1+": "+p2+" and "+p3);
    }
    public static ImmutableMap copyOf(Iterable p0){
       int i = (p0 instanceof Collection)? p0.size(): 4;
       ImmutableMap$b uob = new ImmutableMap$b(i);
       uob.e(p0);
       return uob.a();
    }
    public static ImmutableMap copyOf(Map p0){
       if (p0 instanceof ImmutableMap && !p0 instanceof SortedMap) {
          ImmutableMap immutableMap = p0;
          if (!immutableMap.isPartialView()) {
             return immutableMap;
          }
       }
       return ImmutableMap.copyOf(p0.entrySet());
    }
    public static Map$Entry entryOf(Object p0,Object p1){
       g.a(p0, p1);
       return new AbstractMap$SimpleImmutableEntry(p0, p1);
    }
    public static ImmutableMap of(){
       return RegularImmutableMap.EMPTY;
    }
    public static ImmutableMap of(Object p0,Object p1){
       g.a(p0, p1);
       Object[] objArray = new Object[]{p0,p1};
       return RegularImmutableMap.create(1, objArray);
    }
    public static ImmutableMap of(Object p0,Object p1,Object p2,Object p3){
       g.a(p0, p1);
       g.a(p2, p3);
       Object[] objArray = new Object[]{p0,p1,p2,p3};
       return RegularImmutableMap.create(2, objArray);
    }
    public static ImmutableMap of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5){
       g.a(p0, p1);
       g.a(p2, p3);
       g.a(p4, p5);
       Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
       return RegularImmutableMap.create(3, objArray);
    }
    public static ImmutableMap of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7){
       g.a(p0, p1);
       g.a(p2, p3);
       g.a(p4, p5);
       g.a(p6, p7);
       Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6,p7};
       return RegularImmutableMap.create(4, objArray);
    }
    public static ImmutableMap of(Object p0,Object p1,Object p2,Object p3,Object p4,Object p5,Object p6,Object p7,Object p8,Object p9){
       g.a(p0, p1);
       g.a(p2, p3);
       g.a(p4, p5);
       g.a(p6, p7);
       g.a(p8, p9);
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
       return RegularImmutableMap.create(5, objArray);
    }
    public final void clear(){
       throw new UnsupportedOperationException();
    }
    public boolean containsKey(Object p0){
       boolean b = (this.get(p0) != null)? true: false;
       return b;
    }
    public boolean containsValue(Object p0){
       return this.values().contains(p0);
    }
    public abstract ImmutableSet createEntrySet();
    public abstract ImmutableSet createKeySet();
    public abstract ImmutableCollection createValues();
    public ImmutableSet entrySet(){
       ImmutableMap tb = this.b;
       if (tb == null) {
          tb = this.createEntrySet();
          this.b = tb;
       }
       return tb;
    }
    public Set entrySet(){
       return this.entrySet();
    }
    public boolean equals(Object p0){
       return Maps.f(this, p0);
    }
    public abstract Object get(Object p0);
    public final Object getOrDefault(Object p0,Object p1){
       p0 = this.get(p0);
       if (p0 != null) {
          p1 = p0;
       }
       return p1;
    }
    public int hashCode(){
       return o.d(this.entrySet());
    }
    public boolean isEmpty(){
       boolean b = (!this.size())? true: false;
       return b;
    }
    public boolean isHashCodeFast(){
       return false;
    }
    public abstract boolean isPartialView();
    public t0 keyIterator(){
       return new ImmutableMap$a(this, this.entrySet().iterator());
    }
    public ImmutableSet keySet(){
       ImmutableMap tc = this.c;
       if (tc == null) {
          tc = this.createKeySet();
          this.c = tc;
       }
       return tc;
    }
    public Set keySet(){
       return this.keySet();
    }
    public final Object put(Object p0,Object p1){
       throw new UnsupportedOperationException();
    }
    public final void putAll(Map p0){
       throw new UnsupportedOperationException();
    }
    public final Object remove(Object p0){
       throw new UnsupportedOperationException();
    }
    public String toString(){
       return Maps.A(this);
    }
    public ImmutableCollection values(){
       ImmutableMap td = this.d;
       if (td == null) {
          td = this.createValues();
          this.d = td;
       }
       return td;
    }
    public Collection values(){
       return this.values();
    }
    public Object writeReplace(){
       return new ImmutableMap$SerializedForm(this);
    }
}
