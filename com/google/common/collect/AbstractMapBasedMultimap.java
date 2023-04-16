package com.google.common.collect.AbstractMapBasedMultimap;
import java.io.Serializable;
import com.google.common.collect.a;
import java.util.Map;
import ok.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.lang.Object;
import com.google.common.collect.AbstractMapBasedMultimap$c;
import qk.m0;
import com.google.common.collect.a$b;
import com.google.common.collect.a$a;
import java.util.Set;
import com.google.common.collect.AbstractMapBasedMultimap$e;
import com.google.common.collect.k;
import com.google.common.collect.Multimaps$c;
import qk.g0;
import java.util.NavigableMap;
import com.google.common.collect.AbstractMapBasedMultimap$f;
import java.util.SortedMap;
import com.google.common.collect.AbstractMapBasedMultimap$i;
import com.google.common.collect.AbstractMapBasedMultimap$g;
import com.google.common.collect.AbstractMapBasedMultimap$j;
import com.google.common.collect.a$c;
import com.google.common.collect.AbstractMapBasedMultimap$b;
import java.lang.AssertionError;
import com.google.common.collect.Maps;
import java.lang.Iterable;
import java.util.Collections;
import com.google.common.collect.AbstractMapBasedMultimap$a;
import com.google.common.collect.AbstractMapBasedMultimap$k;
import java.util.RandomAccess;
import com.google.common.collect.AbstractMapBasedMultimap$h;
import com.google.common.collect.AbstractMapBasedMultimap$l;

public abstract class AbstractMapBasedMultimap extends a implements Serializable	// class@00179e
{
    public Map map;
    public int totalSize;
    public static final long serialVersionUID = 0x21f766b1f568c81d;

    public void AbstractMapBasedMultimap(Map p0){
       super();
       n.b(p0.isEmpty());
       this.map = p0;
    }
    public static Iterator iteratorOrListIterator(Collection p0){
       ListIterator listIterator = (p0 instanceof List)? p0.listIterator(): p0.iterator();
       return listIterator;
    }
    public Map backingMap(){
       return this.map;
    }
    public void clear(){
       Iterator iterator = this.map.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().clear();
       }
       this.map.clear();
       this.totalSize = 0;
       return;
    }
    public boolean containsKey(Object p0){
       return this.map.containsKey(p0);
    }
    public Map createAsMap(){
       return new AbstractMapBasedMultimap$c(this, this.map);
    }
    public abstract Collection createCollection();
    public Collection createCollection(Object p0){
       return this.createCollection();
    }
    public Collection createEntries(){
       if (this instanceof m0) {
          return new a$b(this);
       }
       return new a$a(this);
    }
    public Set createKeySet(){
       return new AbstractMapBasedMultimap$e(this, this.map);
    }
    public k createKeys(){
       return new Multimaps$c(this);
    }
    public final Map createMaybeNavigableAsMap(){
       AbstractMapBasedMultimap tmap = this.map;
       if (tmap instanceof NavigableMap) {
          return new AbstractMapBasedMultimap$f(this, this.map);
       }
       if (tmap instanceof SortedMap) {
          return new AbstractMapBasedMultimap$i(this, this.map);
       }
       return new AbstractMapBasedMultimap$c(this, this.map);
    }
    public final Set createMaybeNavigableKeySet(){
       AbstractMapBasedMultimap tmap = this.map;
       if (tmap instanceof NavigableMap) {
          return new AbstractMapBasedMultimap$g(this, this.map);
       }
       if (tmap instanceof SortedMap) {
          return new AbstractMapBasedMultimap$j(this, this.map);
       }
       return new AbstractMapBasedMultimap$e(this, this.map);
    }
    public Collection createUnmodifiableEmptyCollection(){
       return this.unmodifiableCollectionSubclass(this.createCollection());
    }
    public Collection createValues(){
       return new a$c(this);
    }
    public Collection entries(){
       return super.entries();
    }
    public Iterator entryIterator(){
       return new AbstractMapBasedMultimap$b(this);
    }
    public Collection get(Object p0){
       Collection uCollection = this.map.get(p0);
       if (uCollection == null) {
          uCollection = this.createCollection(p0);
       }
       return this.wrapCollection(p0, uCollection);
    }
    public boolean put(Object p0,Object p1){
       Collection uCollection = this.map.get(p0);
       if (uCollection == null) {
          uCollection = this.createCollection(p0);
          if (!uCollection.add(p1)) {
             throw new AssertionError("New Collection violated the Collection spec");
          }
          this.totalSize = this.totalSize + 1;
          this.map.put(p0, uCollection);
          return 1;
       }else if(uCollection.add(p1)){
          this.totalSize = this.totalSize + 1;
          return 1;
       }else {
          return false;
       }
    }
    public Collection removeAll(Object p0){
       p0 = this.map.remove(p0);
       if (p0 == null) {
          return this.createUnmodifiableEmptyCollection();
       }
       Collection uCollection = this.createCollection();
       uCollection.addAll(p0);
       this.totalSize = this.totalSize - p0.size();
       p0.clear();
       return this.unmodifiableCollectionSubclass(uCollection);
    }
    public void removeValuesForKey(Object p0){
       p0 = Maps.z(this.map, p0);
       if (p0 != null) {
          p0.clear();
          this.totalSize = this.totalSize - p0.size();
       }
       return;
    }
    public Collection replaceValues(Object p0,Iterable p1){
       Iterator iterator = p1.iterator();
       if (!iterator.hasNext()) {
          return this.removeAll(p0);
       }
       Collection uCollection = this.map.get(p0);
       if (uCollection == null) {
          uCollection = this.createCollection(p0);
          this.map.put(p0, uCollection);
       }
       p0 = this.createCollection();
       p0.addAll(uCollection);
       this.totalSize = this.totalSize - uCollection.size();
       uCollection.clear();
       while (iterator.hasNext()) {
          if (uCollection.add(iterator.next())) {
             int i = this.totalSize + 1;
             this.totalSize = i;
          }
       }
       return this.unmodifiableCollectionSubclass(p0);
    }
    public final void setMap(Map p0){
       this.map = p0;
       this.totalSize = 0;
       Iterator iterator = p0.values().iterator();
       while (iterator.hasNext()) {
          Collection uCollection = iterator.next();
          int i = uCollection.isEmpty() ^ 0x01;
          n.b(i);
          i = this.totalSize + uCollection.size();
          this.totalSize = i;
       }
       return;
    }
    public int size(){
       return this.totalSize;
    }
    public Collection unmodifiableCollectionSubclass(Collection p0){
       return Collections.unmodifiableCollection(p0);
    }
    public Iterator valueIterator(){
       return new AbstractMapBasedMultimap$a(this);
    }
    public Collection values(){
       return super.values();
    }
    public Collection wrapCollection(Object p0,Collection p1){
       return new AbstractMapBasedMultimap$k(this, p0, p1, null);
    }
    public final List wrapList(Object p0,List p1,AbstractMapBasedMultimap$k p2){
       AbstractMapBasedMultimap$h oh = (p1 instanceof RandomAccess)? new AbstractMapBasedMultimap$h(this, p0, p1, p2): new AbstractMapBasedMultimap$l(this, p0, p1, p2);
       return oh;
    }
}
