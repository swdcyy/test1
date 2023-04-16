package com.google.protobuf.SmallSortedMap;
import java.util.AbstractMap;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import com.google.protobuf.SmallSortedMap$1;
import java.lang.Comparable;
import java.lang.Object;
import com.google.protobuf.SmallSortedMap$Entry;
import java.lang.UnsupportedOperationException;
import java.util.Set;
import com.google.protobuf.SmallSortedMap$DescendingEntrySet;
import java.util.ArrayList;
import com.google.protobuf.SmallSortedMap$EntrySet;
import java.util.Map$Entry;
import java.lang.Iterable;
import com.google.protobuf.SmallSortedMap$EmptySet;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.NavigableMap;
import java.util.Iterator;

public class SmallSortedMap extends AbstractMap	// class@0004b2
{
    public List entryList;
    public boolean isImmutable;
    public SmallSortedMap$DescendingEntrySet lazyDescendingEntrySet;
    public SmallSortedMap$EntrySet lazyEntrySet;
    public final int maxArraySize;
    public Map overflowEntries;
    public Map overflowEntriesDescending;

    public void SmallSortedMap(int p0){
       super();
       this.maxArraySize = p0;
       this.entryList = Collections.emptyList();
       this.overflowEntries = Collections.emptyMap();
       this.overflowEntriesDescending = Collections.emptyMap();
    }
    public void SmallSortedMap(int p0,SmallSortedMap$1 p1){
       super(p0);
    }
    public static SmallSortedMap newFieldMap(int p0){
       return new SmallSortedMap$1(p0);
    }
    public static SmallSortedMap newInstanceForTest(int p0){
       return new SmallSortedMap(p0);
    }
    public final int binarySearchInArray(Comparable p0){
       int i1;
       int i2;
       int i = this.entryList.size() - 1;
       if (i >= 0) {
          i1 = p0.compareTo(this.entryList.get(i).getKey());
          if (i1 > 0) {
             return (- (i + 2));
          }else if(!i1){
             return i;
          }
       }
       i1 = 0;
       while (true) {
          if (i1 > i) {
             return (- (i1 + 1));
          }
          i2 = i1 + i;
          i2 = i2 / 2;
          int i3 = p0.compareTo(this.entryList.get(i2).getKey());
          if (i3 < 0) {
             i2 = i2 - 1;
             i = i2;
          }else if(i3 > 0){
             i2 = i2 + 1;
             i1 = i2;
          }else {
             break ;
          }
       }
       return i2;
    }
    public void checkMutable(){
       if (this.isImmutable == null) {
          return;
       }
       throw new UnsupportedOperationException();
    }
    public void clear(){
       this.checkMutable();
       if (!this.entryList.isEmpty()) {
          this.entryList.clear();
       }
       if (!this.overflowEntries.isEmpty()) {
          this.overflowEntries.clear();
       }
       return;
    }
    public boolean containsKey(Object p0){
       boolean b = (this.binarySearchInArray(p0) >= 0 || this.overflowEntries.containsKey(p0))? true: false;
       return b;
    }
    public Set descendingEntrySet(){
       if (this.lazyDescendingEntrySet == null) {
          this.lazyDescendingEntrySet = new SmallSortedMap$DescendingEntrySet(this, null);
       }
       return this.lazyDescendingEntrySet;
    }
    public final void ensureEntryArrayMutable(){
       this.checkMutable();
       if (this.entryList.isEmpty() && !this.entryList instanceof ArrayList) {
          this.entryList = new ArrayList(this.maxArraySize);
       }
       return;
    }
    public Set entrySet(){
       if (this.lazyEntrySet == null) {
          this.lazyEntrySet = new SmallSortedMap$EntrySet(this, null);
       }
       return this.lazyEntrySet;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof SmallSortedMap) {
          return super.equals(p0);
       }
       int i = this.size();
       if (i != p0.size()) {
          return false;
       }
       int numArrayEntr = this.getNumArrayEntries();
       if (numArrayEntr != p0.getNumArrayEntries()) {
          return this.entrySet().equals(p0.entrySet());
       }
       int i1 = 0;
       while (true) {
          if (i1 < numArrayEntr) {
             if (!this.getArrayEntryAt(i1).equals(p0.getArrayEntryAt(i1))) {
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else if(numArrayEntr != i){
             return this.overflowEntries.equals(p0.overflowEntries);
          }else {
             return b;
          }
       }
       return false;
    }
    public Object get(Object p0){
       int i = this.binarySearchInArray(p0);
       if (i >= 0) {
          return this.entryList.get(i).getValue();
       }
       return this.overflowEntries.get(p0);
    }
    public Map$Entry getArrayEntryAt(int p0){
       return this.entryList.get(p0);
    }
    public int getNumArrayEntries(){
       return this.entryList.size();
    }
    public int getNumOverflowEntries(){
       return this.overflowEntries.size();
    }
    public Iterable getOverflowEntries(){
       Iterable iterable = (this.overflowEntries.isEmpty())? SmallSortedMap$EmptySet.iterable(): this.overflowEntries.entrySet();
       return iterable;
    }
    public Iterable getOverflowEntriesDescending(){
       Iterable iterable = (this.overflowEntriesDescending.isEmpty())? SmallSortedMap$EmptySet.iterable(): this.overflowEntriesDescending.entrySet();
       return iterable;
    }
    public final SortedMap getOverflowEntriesMutable(){
       this.checkMutable();
       if (this.overflowEntries.isEmpty() && !this.overflowEntries instanceof TreeMap) {
          TreeMap treeMap = new TreeMap();
          this.overflowEntries = treeMap;
          this.overflowEntriesDescending = treeMap.descendingMap();
       }
       return this.overflowEntries;
    }
    public int hashCode(){
       int numArrayEntr = this.getNumArrayEntries();
       int i1 = 0;
       for (int i = 0; i < numArrayEntr; i = i + 1) {
          i1 = i1 + this.entryList.get(i).hashCode();
       }
       if (this.getNumOverflowEntries() > 0) {
          i1 = i1 + this.overflowEntries.hashCode();
       }
       return i1;
    }
    public boolean isImmutable(){
       return this.isImmutable;
    }
    public void makeImmutable(){
       if (this.isImmutable == null) {
          Map map = (this.overflowEntries.isEmpty())? Collections.emptyMap(): Collections.unmodifiableMap(this.overflowEntries);
          this.overflowEntries = map;
          map = (this.overflowEntriesDescending.isEmpty())? Collections.emptyMap(): Collections.unmodifiableMap(this.overflowEntriesDescending);
          this.overflowEntriesDescending = map;
          this.isImmutable = true;
       }
       return;
    }
    public Object put(Comparable p0,Object p1){
       this.checkMutable();
       int i = this.binarySearchInArray(p0);
       if (i >= 0) {
          return this.entryList.get(i).setValue(p1);
       }
       this.ensureEntryArrayMutable();
       i = - (i + 1);
       if (i >= this.maxArraySize) {
          return this.getOverflowEntriesMutable().put(p0, p1);
       }
       SmallSortedMap tmaxArraySiz = this.maxArraySize;
       if (this.entryList.size() == tmaxArraySiz) {
          SmallSortedMap$Entry uEntry = this.entryList.remove((tmaxArraySiz - 1));
          Comparable key = uEntry.getKey();
          this.getOverflowEntriesMutable().put(key, uEntry.getValue());
       }
       this.entryList.add(i, new SmallSortedMap$Entry(this, p0, p1));
       return null;
    }
    public Object put(Object p0,Object p1){
       return this.put(p0, p1);
    }
    public Object remove(Object p0){
       this.checkMutable();
       int i = this.binarySearchInArray(p0);
       if (i >= 0) {
          return this.removeArrayEntryAt(i);
       }
       if (this.overflowEntries.isEmpty()) {
          return null;
       }
       return this.overflowEntries.remove(p0);
    }
    public Object removeArrayEntryAt(int p0){
       this.checkMutable();
       Object value = this.entryList.remove(p0).getValue();
       if (!this.overflowEntries.isEmpty()) {
          Iterator iterator = this.getOverflowEntriesMutable().entrySet().iterator();
          this.entryList.add(new SmallSortedMap$Entry(this, iterator.next()));
          iterator.remove();
       }
       return value;
    }
    public int size(){
       return (this.entryList.size() + this.overflowEntries.size());
    }
}
