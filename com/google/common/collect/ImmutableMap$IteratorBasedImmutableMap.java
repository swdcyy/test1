package com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap$1EntrySetImpl;
import com.google.common.collect.ImmutableMapKeySet;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMapValues;
import qk.t0;
import java.util.Set;
import java.util.Collection;

public abstract class ImmutableMap$IteratorBasedImmutableMap extends ImmutableMap	// class@0017e1
{

    public void ImmutableMap$IteratorBasedImmutableMap(){
       super();
    }
    public ImmutableSet createEntrySet(){
       return new ImmutableMap$IteratorBasedImmutableMap$1EntrySetImpl(this);
    }
    public ImmutableSet createKeySet(){
       return new ImmutableMapKeySet(this);
    }
    public ImmutableCollection createValues(){
       return new ImmutableMapValues(this);
    }
    public abstract t0 entryIterator();
    public Set entrySet(){
       return super.entrySet();
    }
    public Set keySet(){
       return super.keySet();
    }
    public Collection values(){
       return super.values();
    }
}
