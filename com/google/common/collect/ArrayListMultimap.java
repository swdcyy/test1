package com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ArrayListMultimapGwtSerializationDependencies;
import java.util.Map;
import qk.j0;
import java.lang.String;
import qk.g;
import qk.g0;
import java.util.Set;
import com.google.common.collect.AbstractListMultimap;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.lang.Object;
import com.google.common.collect.a;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.k;
import java.lang.Iterable;
import java.io.ObjectInputStream;
import com.google.common.collect.m;
import com.google.common.collect.CompactHashMap;
import java.util.Iterator;
import java.io.ObjectOutputStream;

public final class ArrayListMultimap extends ArrayListMultimapGwtSerializationDependencies	// class@0017a5
{
    public int expectedValuesPerKey;
    public static final long serialVersionUID;

    public void ArrayListMultimap(){
       super(12, 3);
    }
    public void ArrayListMultimap(int p0,int p1){
       super(j0.a(p0));
       g.b(p1, "expectedValuesPerKey");
       this.expectedValuesPerKey = p1;
    }
    public void ArrayListMultimap(g0 p0){
       int i = p0.keySet().size();
       ArrayListMultimap expectedValu = (p0 instanceof ArrayListMultimap)? p0.expectedValuesPerKey: 3;
       super(i, expectedValu);
       this.putAll(p0);
       return;
    }
    public static ArrayListMultimap create(){
       return new ArrayListMultimap();
    }
    public static ArrayListMultimap create(int p0,int p1){
       return new ArrayListMultimap(p0, p1);
    }
    public static ArrayListMultimap create(g0 p0){
       return new ArrayListMultimap(p0);
    }
    public Map asMap(){
       return super.asMap();
    }
    public void clear(){
       super.clear();
    }
    public boolean containsEntry(Object p0,Object p1){
       return super.containsEntry(p0, p1);
    }
    public boolean containsKey(Object p0){
       return super.containsKey(p0);
    }
    public boolean containsValue(Object p0){
       return super.containsValue(p0);
    }
    public Collection createCollection(){
       return this.createCollection();
    }
    public List createCollection(){
       return new ArrayList(this.expectedValuesPerKey);
    }
    public Collection entries(){
       return super.entries();
    }
    public boolean equals(Object p0){
       return super.equals(p0);
    }
    public List get(Object p0){
       return super.get(p0);
    }
    public int hashCode(){
       return super.hashCode();
    }
    public boolean isEmpty(){
       return super.isEmpty();
    }
    public Set keySet(){
       return super.keySet();
    }
    public k keys(){
       return super.keys();
    }
    public boolean put(Object p0,Object p1){
       return super.put(p0, p1);
    }
    public boolean putAll(Object p0,Iterable p1){
       return super.putAll(p0, p1);
    }
    public boolean putAll(g0 p0){
       return super.putAll(p0);
    }
    public final void readObject(ObjectInputStream p0){
       p0.defaultReadObject();
       this.expectedValuesPerKey = 3;
       this.setMap(CompactHashMap.create());
       m.b(this, p0, m.c(p0));
    }
    public boolean remove(Object p0,Object p1){
       return super.remove(p0, p1);
    }
    public List removeAll(Object p0){
       return super.removeAll(p0);
    }
    public List replaceValues(Object p0,Iterable p1){
       return super.replaceValues(p0, p1);
    }
    public int size(){
       return super.size();
    }
    public String toString(){
       return super.toString();
    }
    public void trimToSize(){
       Iterator iterator = this.backingMap().values().iterator();
       while (iterator.hasNext()) {
          iterator.next().trimToSize();
       }
       return;
    }
    public Collection values(){
       return super.values();
    }
    public final void writeObject(ObjectOutputStream p0){
       p0.defaultWriteObject();
       m.d(this, p0);
    }
}
