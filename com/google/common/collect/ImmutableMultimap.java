package com.google.common.collect.ImmutableMultimap;
import java.io.Serializable;
import com.google.common.collect.a;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap$c;
import java.util.Map;
import java.lang.UnsupportedOperationException;
import java.lang.Object;
import java.lang.AssertionError;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMultimap$EntryCollection;
import java.util.Collection;
import java.util.Set;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableMultimap$Keys;
import com.google.common.collect.k;
import com.google.common.collect.ImmutableMultimap$Values;
import java.util.Iterator;
import qk.t0;
import com.google.common.collect.ImmutableMultimap$a;
import com.google.common.collect.ImmutableSet;
import java.lang.Iterable;
import qk.g0;
import java.lang.String;
import com.google.common.collect.ImmutableMultimap$b;

public abstract class ImmutableMultimap extends a implements Serializable	// class@0017f2
{
    public final ImmutableMap map;
    public final int size;
    public static final long serialVersionUID;

    public void ImmutableMultimap(ImmutableMap p0,int p1){
       super();
       this.map = p0;
       this.size = p1;
    }
    public static ImmutableMultimap$c builder(){
       return new ImmutableMultimap$c();
    }
    public ImmutableMap asMap(){
       return this.map;
    }
    public Map asMap(){
       return this.asMap();
    }
    public void clear(){
       throw new UnsupportedOperationException();
    }
    public boolean containsEntry(Object p0,Object p1){
       return super.containsEntry(p0, p1);
    }
    public boolean containsKey(Object p0){
       return this.map.containsKey(p0);
    }
    public boolean containsValue(Object p0){
       boolean b = (p0 != null && super.containsValue(p0))? true: false;
       return b;
    }
    public Map createAsMap(){
       throw new AssertionError("should never be called");
    }
    public ImmutableCollection createEntries(){
       return new ImmutableMultimap$EntryCollection(this);
    }
    public Collection createEntries(){
       return this.createEntries();
    }
    public Set createKeySet(){
       throw new AssertionError("unreachable");
    }
    public ImmutableMultiset createKeys(){
       return new ImmutableMultimap$Keys(this);
    }
    public k createKeys(){
       return this.createKeys();
    }
    public ImmutableCollection createValues(){
       return new ImmutableMultimap$Values(this);
    }
    public Collection createValues(){
       return this.createValues();
    }
    public ImmutableCollection entries(){
       return super.entries();
    }
    public Collection entries(){
       return this.entries();
    }
    public Iterator entryIterator(){
       return this.entryIterator();
    }
    public t0 entryIterator(){
       return new ImmutableMultimap$a(this);
    }
    public boolean equals(Object p0){
       return super.equals(p0);
    }
    public abstract ImmutableCollection get(Object p0);
    public Collection get(Object p0){
       return this.get(p0);
    }
    public int hashCode(){
       return super.hashCode();
    }
    public abstract ImmutableMultimap inverse();
    public boolean isEmpty(){
       return super.isEmpty();
    }
    public boolean isPartialView(){
       return this.map.isPartialView();
    }
    public ImmutableSet keySet(){
       return this.map.keySet();
    }
    public Set keySet(){
       return this.keySet();
    }
    public ImmutableMultiset keys(){
       return super.keys();
    }
    public k keys(){
       return this.keys();
    }
    public boolean put(Object p0,Object p1){
       throw new UnsupportedOperationException();
    }
    public boolean putAll(Object p0,Iterable p1){
       throw new UnsupportedOperationException();
    }
    public boolean putAll(g0 p0){
       throw new UnsupportedOperationException();
    }
    public boolean remove(Object p0,Object p1){
       throw new UnsupportedOperationException();
    }
    public ImmutableCollection removeAll(Object p0){
       throw new UnsupportedOperationException();
    }
    public Collection removeAll(Object p0){
       return this.removeAll(p0);
    }
    public ImmutableCollection replaceValues(Object p0,Iterable p1){
       throw new UnsupportedOperationException();
    }
    public Collection replaceValues(Object p0,Iterable p1){
       return this.replaceValues(p0, p1);
    }
    public int size(){
       return this.size;
    }
    public String toString(){
       return super.toString();
    }
    public Iterator valueIterator(){
       return this.valueIterator();
    }
    public t0 valueIterator(){
       return new ImmutableMultimap$b(this);
    }
    public ImmutableCollection values(){
       return super.values();
    }
    public Collection values(){
       return this.values();
    }
}
