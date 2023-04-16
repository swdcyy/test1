package com.google.common.collect.HashMultimap;
import com.google.common.collect.HashMultimapGwtSerializationDependencies;
import java.util.Map;
import qk.j0;
import ok.n;
import qk.g0;
import java.util.Set;
import com.google.common.collect.AbstractSetMultimap;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.lang.Object;
import com.google.common.collect.a;
import java.util.Collection;
import com.google.common.collect.CompactHashSet;
import com.google.common.collect.k;
import java.lang.Iterable;
import java.io.ObjectInputStream;
import com.google.common.collect.m;
import java.lang.String;
import java.io.ObjectOutputStream;

public final class HashMultimap extends HashMultimapGwtSerializationDependencies	// class@0017d2
{
    public int expectedValuesPerKey;
    public static final long serialVersionUID;

    public void HashMultimap(){
       super(12, 2);
    }
    public void HashMultimap(int p0,int p1){
       super(j0.a(p0));
       this.expectedValuesPerKey = 2;
       boolean b = (p1 >= 0)? true: false;
       n.b(b);
       this.expectedValuesPerKey = p1;
       return;
    }
    public void HashMultimap(g0 p0){
       super(j0.a(p0.keySet().size()));
       this.expectedValuesPerKey = 2;
       this.putAll(p0);
    }
    public static HashMultimap create(){
       return new HashMultimap();
    }
    public static HashMultimap create(int p0,int p1){
       return new HashMultimap(p0, p1);
    }
    public static HashMultimap create(g0 p0){
       return new HashMultimap(p0);
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
    public Set createCollection(){
       return CompactHashSet.createWithExpectedSize(this.expectedValuesPerKey);
    }
    public Set entries(){
       return super.entries();
    }
    public boolean equals(Object p0){
       return super.equals(p0);
    }
    public Set get(Object p0){
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
       this.expectedValuesPerKey = 2;
       this.setMap(j0.a(12));
       m.b(this, p0, m.c(p0));
    }
    public boolean remove(Object p0,Object p1){
       return super.remove(p0, p1);
    }
    public Set removeAll(Object p0){
       return super.removeAll(p0);
    }
    public Set replaceValues(Object p0,Iterable p1){
       return super.replaceValues(p0, p1);
    }
    public int size(){
       return super.size();
    }
    public String toString(){
       return super.toString();
    }
    public Collection values(){
       return super.values();
    }
    public final void writeObject(ObjectOutputStream p0){
       p0.defaultWriteObject();
       m.d(this, p0);
    }
}
