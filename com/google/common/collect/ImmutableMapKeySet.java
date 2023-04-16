package com.google.common.collect.ImmutableMapKeySet;
import com.google.common.collect.ImmutableSet$Indexed;
import com.google.common.collect.ImmutableMap;
import java.lang.Object;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map$Entry;
import java.util.Iterator;
import qk.t0;
import java.util.Map;

public final class ImmutableMapKeySet extends ImmutableSet$Indexed	// class@0017e7
{
    public final ImmutableMap map;

    public void ImmutableMapKeySet(ImmutableMap p0){
       super();
       this.map = p0;
    }
    public boolean contains(Object p0){
       return this.map.containsKey(p0);
    }
    public Object get(int p0){
       return this.map.entrySet().asList().get(p0).getKey();
    }
    public boolean isPartialView(){
       return true;
    }
    public Iterator iterator(){
       return this.iterator();
    }
    public t0 iterator(){
       return this.map.keyIterator();
    }
    public int size(){
       return this.map.size();
    }
}
