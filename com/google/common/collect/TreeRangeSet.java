package com.google.common.collect.TreeRangeSet;
import java.io.Serializable;
import qk.c;
import java.util.NavigableMap;
import com.google.common.collect.TreeRangeSet$a;
import java.util.TreeMap;
import java.lang.Iterable;
import qk.k0;
import com.google.common.collect.Range;
import java.lang.Object;
import ok.n;
import java.util.Map$Entry;
import com.google.common.collect.Cut;
import java.util.SortedMap;
import java.util.Set;
import com.google.common.collect.TreeRangeSet$b;
import java.util.Collection;
import com.google.common.collect.TreeRangeSet$Complement;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import com.google.common.collect.TreeRangeSet$SubRangeSet;

public class TreeRangeSet extends c implements Serializable	// class@0018a4
{
    public Set b;
    public Set c;
    public k0 d;
    public final NavigableMap rangesByLowerBound;

    public void TreeRangeSet(NavigableMap p0){
       super();
       this.rangesByLowerBound = p0;
    }
    public void TreeRangeSet(NavigableMap p0,TreeRangeSet$a p1){
       super(p0);
    }
    public static TreeRangeSet create(){
       return new TreeRangeSet(new TreeMap());
    }
    public static TreeRangeSet create(Iterable p0){
       TreeRangeSet treeRangeSet = TreeRangeSet.create();
       treeRangeSet.addAll(p0);
       return treeRangeSet;
    }
    public static TreeRangeSet create(k0 p0){
       TreeRangeSet treeRangeSet = TreeRangeSet.create();
       treeRangeSet.addAll(p0);
       return treeRangeSet;
    }
    public final void a(Range p0){
       if (p0.isEmpty()) {
          this.rangesByLowerBound.remove(p0.lowerBound);
       }else {
          this.rangesByLowerBound.put(p0.lowerBound, p0);
       }
       return;
    }
    public void add(Range p0){
       Range value;
       n.j(p0);
       if (p0.isEmpty()) {
          return;
       }
       Range lowerBound = p0.lowerBound;
       p0 = p0.upperBound;
       Map$Entry uEntry = this.rangesByLowerBound.lowerEntry(lowerBound);
       if (uEntry != null) {
          value = uEntry.getValue();
          if (value.upperBound.compareTo(lowerBound) >= 0) {
             if (value.upperBound.compareTo(p0) >= 0) {
                p0 = value.upperBound;
             }
             lowerBound = value.lowerBound;
          }
       }
       uEntry = this.rangesByLowerBound.floorEntry(p0);
       if (uEntry != null) {
          value = uEntry.getValue();
          if (value.upperBound.compareTo(p0) >= 0) {
             p0 = value.upperBound;
          }
       }
       this.rangesByLowerBound.subMap(lowerBound, p0).clear();
       this.a(Range.create(lowerBound, p0));
       return;
    }
    public void addAll(Iterable p0){
       super.addAll(p0);
    }
    public void addAll(k0 p0){
       super.addAll(p0);
    }
    public Set asDescendingSetOfRanges(){
       TreeRangeSet tc = this.c;
       if (tc == null) {
          tc = new TreeRangeSet$b(this, this.rangesByLowerBound.descendingMap().values());
          this.c = tc;
       }
       return tc;
    }
    public Set asRanges(){
       TreeRangeSet tb = this.b;
       if (tb == null) {
          tb = new TreeRangeSet$b(this, this.rangesByLowerBound.values());
          this.b = tb;
       }
       return tb;
    }
    public void clear(){
       super.clear();
    }
    public k0 complement(){
       TreeRangeSet td = this.d;
       if (td == null) {
          td = new TreeRangeSet$Complement(this);
          this.d = td;
       }
       return td;
    }
    public boolean contains(Comparable p0){
       return super.contains(p0);
    }
    public boolean encloses(Range p0){
       n.j(p0);
       Map$Entry uEntry = this.rangesByLowerBound.floorEntry(p0.lowerBound);
       boolean b = (uEntry != null && uEntry.getValue().encloses(p0))? true: false;
       return b;
    }
    public boolean enclosesAll(Iterable p0){
       return super.enclosesAll(p0);
    }
    public boolean enclosesAll(k0 p0){
       return super.enclosesAll(p0);
    }
    public boolean equals(Object p0){
       return super.equals(p0);
    }
    public boolean intersects(Range p0){
       n.j(p0);
       Map$Entry uEntry = this.rangesByLowerBound.ceilingEntry(p0.lowerBound);
       boolean b = true;
       if (uEntry != null && (uEntry.getValue().isConnected(p0) && !uEntry.getValue().intersection(p0).isEmpty())) {
          return b;
       }
       uEntry = this.rangesByLowerBound.lowerEntry(p0.lowerBound);
       if (uEntry == null || (!uEntry.getValue().isConnected(p0) || uEntry.getValue().intersection(p0).isEmpty())) {
          b = false;
       }
       return b;
    }
    public boolean isEmpty(){
       return super.isEmpty();
    }
    public Range rangeContaining(Comparable p0){
       n.j(p0);
       Map$Entry uEntry = this.rangesByLowerBound.floorEntry(Cut.belowValue(p0));
       if (uEntry != null && uEntry.getValue().contains(p0)) {
          return uEntry.getValue();
       }
       return null;
    }
    public Range rangeEnclosing(Range p0){
       n.j(p0);
       Map$Entry uEntry = this.rangesByLowerBound.floorEntry(p0.lowerBound);
       p0 = (uEntry != null && uEntry.getValue().encloses(p0))? uEntry.getValue(): null;
       return p0;
    }
    public void remove(Range p0){
       Range value;
       n.j(p0);
       if (p0.isEmpty()) {
          return;
       }
       Map$Entry uEntry = this.rangesByLowerBound.lowerEntry(p0.lowerBound);
       if (uEntry != null) {
          value = uEntry.getValue();
          if (value.upperBound.compareTo(p0.lowerBound) >= 0) {
             if (p0.hasUpperBound() && value.upperBound.compareTo(p0.upperBound) >= 0) {
                this.a(Range.create(p0.upperBound, value.upperBound));
             }
             this.a(Range.create(value.lowerBound, p0.lowerBound));
          }
       }
       uEntry = this.rangesByLowerBound.floorEntry(p0.upperBound);
       if (uEntry != null) {
          value = uEntry.getValue();
          if (p0.hasUpperBound() && value.upperBound.compareTo(p0.upperBound) >= 0) {
             this.a(Range.create(p0.upperBound, value.upperBound));
          }
       }
       this.rangesByLowerBound.subMap(p0.lowerBound, p0.upperBound).clear();
       return;
    }
    public void removeAll(Iterable p0){
       super.removeAll(p0);
    }
    public void removeAll(k0 p0){
       super.removeAll(p0);
    }
    public Range span(){
       Map$Entry uEntry = this.rangesByLowerBound.firstEntry();
       Map$Entry uEntry1 = this.rangesByLowerBound.lastEntry();
       if (uEntry != null) {
          return Range.create(uEntry.getValue().lowerBound, uEntry1.getValue().upperBound);
       }
       throw new NoSuchElementException();
    }
    public k0 subRangeSet(Range p0){
       k0 ok0 = (p0.equals(Range.all()))? this: new TreeRangeSet$SubRangeSet(this, p0);
       return ok0;
    }
}
