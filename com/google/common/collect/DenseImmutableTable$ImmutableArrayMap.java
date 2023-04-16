package com.google.common.collect.DenseImmutableTable$ImmutableArrayMap;
import com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import qk.t0;
import com.google.common.collect.DenseImmutableTable$ImmutableArrayMap$a;
import java.lang.Object;
import java.lang.Integer;
import com.google.common.collect.ImmutableList;
import java.util.List;

public abstract class DenseImmutableTable$ImmutableArrayMap extends ImmutableMap$IteratorBasedImmutableMap	// class@0017c0
{
    public final int size;

    public void DenseImmutableTable$ImmutableArrayMap(int p0){
       super();
       this.size = p0;
    }
    public ImmutableSet createKeySet(){
       ImmutableMap immutableMap = (this.size == this.keyToIndex().size())? 1: null;
       ImmutableSet immutableSet = (immutableMap)? this.keyToIndex().keySet(): super.createKeySet();
       return immutableSet;
    }
    public t0 entryIterator(){
       return new DenseImmutableTable$ImmutableArrayMap$a(this);
    }
    public Object get(Object p0){
       p0 = this.keyToIndex().get(p0);
       p0 = (p0 == null)? null: this.getValue(p0.intValue());
       return p0;
    }
    public Object getKey(int p0){
       return this.keyToIndex().keySet().asList().get(p0);
    }
    public abstract Object getValue(int p0);
    public abstract ImmutableMap keyToIndex();
    public int size(){
       return this.size;
    }
}
