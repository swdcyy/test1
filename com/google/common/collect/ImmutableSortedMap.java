package com.google.common.collect.ImmutableSortedMap;
import java.util.NavigableMap;
import com.google.common.collect.ImmutableSortedMapFauxverideShim;
import com.google.common.collect.Ordering;
import java.util.Comparator;
import com.google.common.collect.RegularImmutableSortedSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableList;
import java.util.Map;
import java.util.SortedMap;
import java.lang.Object;
import java.util.Set;
import java.lang.Iterable;
import com.google.common.collect.ImmutableMap;
import qk.y;
import java.util.Map$Entry;
import ok.n;
import qk.g;
import com.google.common.collect.ImmutableSortedMap$a;
import java.util.Arrays;
import java.lang.String;
import com.google.common.collect.ImmutableSortedMap$b;
import java.lang.Comparable;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedMap$1EntrySet;
import java.lang.AssertionError;
import com.google.common.collect.ImmutableCollection;
import java.util.NavigableSet;
import java.util.List;
import java.lang.UnsupportedOperationException;
import java.util.AbstractCollection;
import java.util.Collection;
import com.google.common.collect.ImmutableSortedMap$SerializedForm;

public final class ImmutableSortedMap extends ImmutableSortedMapFauxverideShim implements NavigableMap	// class@001805
{
    public ImmutableSortedMap f;
    public final RegularImmutableSortedSet keySet;
    public final ImmutableList valueList;
    public static final Comparator g;
    public static final ImmutableSortedMap h;
    public static final long serialVersionUID;

    static {
       ImmutableSortedMap.g = Ordering.natural();
       ImmutableSortedMap.h = new ImmutableSortedMap(ImmutableSortedSet.emptySet(Ordering.natural()), ImmutableList.of());
    }
    public void ImmutableSortedMap(RegularImmutableSortedSet p0,ImmutableList p1){
       super(p0, p1, null);
    }
    public void ImmutableSortedMap(RegularImmutableSortedSet p0,ImmutableList p1,ImmutableSortedMap p2){
       super();
       this.keySet = p0;
       this.valueList = p1;
       this.f = p2;
    }
    public static ImmutableSortedMap a(Map p0,Comparator p1){
       boolean b = false;
       if (p0 instanceof SortedMap) {
          Comparator uComparator = p0.comparator();
          if (uComparator == null) {
             if (p1 == ImmutableSortedMap.g) {
                b = true;
             }
          }else {
             b = p1.equals(uComparator);
          }
       }
       if (b && p0 instanceof ImmutableSortedMap) {
          ImmutableSortedMap immutableSor = p0;
          if (!immutableSor.isPartialView()) {
             return immutableSor;
          }
       }
       return ImmutableSortedMap.c(p1, b, p0.entrySet());
    }
    public static ImmutableSortedMap c(Comparator p0,boolean p1,Iterable p2){
       Map$Entry[] uEntryArray = y.w(p2, ImmutableMap.EMPTY_ENTRY_ARRAY);
       return ImmutableSortedMap.e(p0, p1, uEntryArray, uEntryArray.length);
    }
    public static ImmutableSortedMap copyOf(Iterable p0){
       return ImmutableSortedMap.copyOf(p0, ImmutableSortedMap.g);
    }
    public static ImmutableSortedMap copyOf(Iterable p0,Comparator p1){
       n.j(p1);
       return ImmutableSortedMap.c(p1, false, p0);
    }
    public static ImmutableSortedMap copyOf(Map p0){
       return ImmutableSortedMap.a(p0, ImmutableSortedMap.g);
    }
    public static ImmutableSortedMap copyOf(Map p0,Comparator p1){
       n.j(p1);
       return ImmutableSortedMap.a(p0, p1);
    }
    public static ImmutableSortedMap copyOfSorted(SortedMap p0){
       Comparator uComparator = p0.comparator();
       if (uComparator == null) {
          uComparator = ImmutableSortedMap.g;
       }
       if (p0 instanceof ImmutableSortedMap) {
          ImmutableSortedMap immutableSor = p0;
          if (!immutableSor.isPartialView()) {
             return immutableSor;
          }
       }
       return ImmutableSortedMap.c(uComparator, true, p0.entrySet());
    }
    public static ImmutableSortedMap e(Comparator p0,boolean p1,Map$Entry[] p2,int p3){
       Object key;
       if (!p3) {
          return ImmutableSortedMap.emptyMap(p0);
       }
       int i = 0;
       if (p3 == 1) {
          return ImmutableSortedMap.of(p0, p2[i].getKey(), p2[i].getValue());
       }
       Object[] objArray = new Object[p3];
       Object[] objArray1 = new Object[p3];
       if (p1) {
          for (; i < p3; i = i + 1) {
             key = p2[i].getKey();
             Object value = p2[i].getValue();
             g.a(key, value);
             objArray[i] = key;
             objArray1[i] = value;
          }
       }else {
          Arrays.sort(p2, i, p3, new ImmutableSortedMap$a(p0));
          key = p2[i].getKey();
          objArray[i] = key;
          objArray1[i] = p2[i].getValue();
          g.a(objArray[i], objArray1[i]);
          int i1 = 1;
          while (i1 < p3) {
             Object key1 = p2[i1].getKey();
             Object value1 = p2[i1].getValue();
             g.a(key1, value1);
             objArray[i1] = key1;
             objArray1[i1] = value1;
             key = (p0.compare(key, key1))? true: false;
             int i2 = i1 - 1;
             ImmutableMap.checkNoConflict(key, "key", p2[i2], p2[i1]);
             i1 = i1 + 1;
             key = key1;
          }
       }
       return new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.asImmutableList(objArray), p0), ImmutableList.asImmutableList(objArray1));
    }
    public static ImmutableSortedMap emptyMap(Comparator p0){
       if (Ordering.natural().equals(p0)) {
          return ImmutableSortedMap.of();
       }
       return new ImmutableSortedMap(ImmutableSortedSet.emptySet(p0), ImmutableList.of());
    }
    public static ImmutableSortedMap g(Map$Entry[] p0){
       return ImmutableSortedMap.e(Ordering.natural(), false, p0, p0.length);
    }
    public static ImmutableSortedMap$b naturalOrder(){
       return new ImmutableSortedMap$b(Ordering.natural());
    }
    public static ImmutableSortedMap of(){
       return ImmutableSortedMap.h;
    }
    public static ImmutableSortedMap of(Comparable p0,Object p1){
       return ImmutableSortedMap.of(Ordering.natural(), p0, p1);
    }
    public static ImmutableSortedMap of(Comparable p0,Object p1,Comparable p2,Object p3){
       Map$Entry[] uEntryArray = new Map$Entry[]{ImmutableMap.entryOf(p0, p1),ImmutableMap.entryOf(p2, p3)};
       return ImmutableSortedMap.g(uEntryArray);
    }
    public static ImmutableSortedMap of(Comparable p0,Object p1,Comparable p2,Object p3,Comparable p4,Object p5){
       Map$Entry[] uEntryArray = new Map$Entry[]{ImmutableMap.entryOf(p0, p1),ImmutableMap.entryOf(p2, p3),ImmutableMap.entryOf(p4, p5)};
       return ImmutableSortedMap.g(uEntryArray);
    }
    public static ImmutableSortedMap of(Comparable p0,Object p1,Comparable p2,Object p3,Comparable p4,Object p5,Comparable p6,Object p7){
       Map$Entry[] uEntryArray = new Map$Entry[]{ImmutableMap.entryOf(p0, p1),ImmutableMap.entryOf(p2, p3),ImmutableMap.entryOf(p4, p5),ImmutableMap.entryOf(p6, p7)};
       return ImmutableSortedMap.g(uEntryArray);
    }
    public static ImmutableSortedMap of(Comparable p0,Object p1,Comparable p2,Object p3,Comparable p4,Object p5,Comparable p6,Object p7,Comparable p8,Object p9){
       Map$Entry[] uEntryArray = new Map$Entry[]{ImmutableMap.entryOf(p0, p1),ImmutableMap.entryOf(p2, p3),ImmutableMap.entryOf(p4, p5),ImmutableMap.entryOf(p6, p7),ImmutableMap.entryOf(p8, p9)};
       return ImmutableSortedMap.g(uEntryArray);
    }
    public static ImmutableSortedMap of(Comparator p0,Object p1,Object p2){
       n.j(p0);
       return new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.of(p1), p0), ImmutableList.of(p2));
    }
    public static ImmutableSortedMap$b orderedBy(Comparator p0){
       return new ImmutableSortedMap$b(p0);
    }
    public static ImmutableSortedMap$b reverseOrder(){
       return new ImmutableSortedMap$b(Ordering.natural().reverse());
    }
    public Map$Entry ceilingEntry(Object p0){
       return this.tailMap(p0, true).firstEntry();
    }
    public Object ceilingKey(Object p0){
       return Maps.o(this.ceilingEntry(p0));
    }
    public Comparator comparator(){
       return this.keySet().comparator();
    }
    public ImmutableSet createEntrySet(){
       ImmutableSet immutableSet = (this.isEmpty())? ImmutableSet.of(): new ImmutableSortedMap$1EntrySet(this);
       return immutableSet;
    }
    public ImmutableSet createKeySet(){
       throw new AssertionError("should never be called");
    }
    public ImmutableCollection createValues(){
       throw new AssertionError("should never be called");
    }
    public ImmutableSortedSet descendingKeySet(){
       return this.keySet.descendingSet();
    }
    public NavigableSet descendingKeySet(){
       return this.descendingKeySet();
    }
    public ImmutableSortedMap descendingMap(){
       ImmutableSortedMap tf = this.f;
       if (tf == null) {
          if (this.isEmpty()) {
             return ImmutableSortedMap.emptyMap(Ordering.from(this.comparator()).reverse());
          }else {
             tf = new ImmutableSortedMap(this.keySet.descendingSet(), this.valueList.reverse(), this);
          }
       }
       return tf;
    }
    public NavigableMap descendingMap(){
       return this.descendingMap();
    }
    public ImmutableSet entrySet(){
       return super.entrySet();
    }
    public Set entrySet(){
       return this.entrySet();
    }
    public final ImmutableSortedMap f(int p0,int p1){
       if (!p0 && p1 == this.size()) {
          return this;
       }
       if (p0 == p1) {
          return ImmutableSortedMap.emptyMap(this.comparator());
       }
       return new ImmutableSortedMap(this.keySet.getSubSet(p0, p1), this.valueList.subList(p0, p1));
    }
    public Map$Entry firstEntry(){
       Map$Entry uEntry = (this.isEmpty())? null: this.entrySet().asList().get(0);
       return uEntry;
    }
    public Object firstKey(){
       return this.keySet().first();
    }
    public Map$Entry floorEntry(Object p0){
       return this.headMap(p0, true).lastEntry();
    }
    public Object floorKey(Object p0){
       return Maps.o(this.floorEntry(p0));
    }
    public Object get(Object p0){
       int i = this.keySet.indexOf(p0);
       i = (i == -1)? null: this.valueList.get(i);
       return i;
    }
    public ImmutableSortedMap headMap(Object p0){
       return this.headMap(p0, false);
    }
    public ImmutableSortedMap headMap(Object p0,boolean p1){
       n.j(p0);
       return this.f(0, this.keySet.headIndex(p0, p1));
    }
    public NavigableMap headMap(Object p0,boolean p1){
       return this.headMap(p0, p1);
    }
    public SortedMap headMap(Object p0){
       return this.headMap(p0);
    }
    public Map$Entry higherEntry(Object p0){
       return this.tailMap(p0, false).firstEntry();
    }
    public Object higherKey(Object p0){
       return Maps.o(this.higherEntry(p0));
    }
    public boolean isPartialView(){
       boolean b = (this.keySet.isPartialView() || this.valueList.isPartialView())? true: false;
       return b;
    }
    public ImmutableSet keySet(){
       return this.keySet();
    }
    public ImmutableSortedSet keySet(){
       return this.keySet;
    }
    public Set keySet(){
       return this.keySet();
    }
    public Map$Entry lastEntry(){
       Map$Entry uEntry = (this.isEmpty())? null: this.entrySet().asList().get((this.size() - 1));
       return uEntry;
    }
    public Object lastKey(){
       return this.keySet().last();
    }
    public Map$Entry lowerEntry(Object p0){
       return this.headMap(p0, false).lastEntry();
    }
    public Object lowerKey(Object p0){
       return Maps.o(this.lowerEntry(p0));
    }
    public ImmutableSortedSet navigableKeySet(){
       return this.keySet;
    }
    public NavigableSet navigableKeySet(){
       return this.navigableKeySet();
    }
    public final Map$Entry pollFirstEntry(){
       throw new UnsupportedOperationException();
    }
    public final Map$Entry pollLastEntry(){
       throw new UnsupportedOperationException();
    }
    public int size(){
       return this.valueList.size();
    }
    public ImmutableSortedMap subMap(Object p0,Object p1){
       return this.subMap(p0, true, p1, false);
    }
    public ImmutableSortedMap subMap(Object p0,boolean p1,Object p2,boolean p3){
       n.j(p0);
       n.j(p2);
       boolean b = (this.comparator().compare(p0, p2) <= 0)? true: false;
       n.h(b, "expected fromKey <= toKey but %s > %s", p0, p2);
       return this.headMap(p2, p3).tailMap(p0, p1);
    }
    public NavigableMap subMap(Object p0,boolean p1,Object p2,boolean p3){
       return this.subMap(p0, p1, p2, p3);
    }
    public SortedMap subMap(Object p0,Object p1){
       return this.subMap(p0, p1);
    }
    public ImmutableSortedMap tailMap(Object p0){
       return this.tailMap(p0, true);
    }
    public ImmutableSortedMap tailMap(Object p0,boolean p1){
       n.j(p0);
       return this.f(this.keySet.tailIndex(p0, p1), this.size());
    }
    public NavigableMap tailMap(Object p0,boolean p1){
       return this.tailMap(p0, p1);
    }
    public SortedMap tailMap(Object p0){
       return this.tailMap(p0);
    }
    public ImmutableCollection values(){
       return this.valueList;
    }
    public Collection values(){
       return this.values();
    }
    public Object writeReplace(){
       return new ImmutableSortedMap$SerializedForm(this);
    }
}
