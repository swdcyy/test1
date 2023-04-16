package com.google.common.collect.ImmutableMapEntrySet;
import com.google.common.collect.ImmutableSet;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public abstract class ImmutableMapEntrySet extends ImmutableSet	// class@0017e6
{

    public void ImmutableMapEntrySet(){
       super();
    }
    public boolean contains(Object p0){
       boolean b = false;
       if (p0 instanceof Map$Entry) {
          Object obj = this.map().get(p0.getKey());
          if (obj != null && obj.equals(p0.getValue())) {
             b = true;
          }
       }
       return b;
    }
    public int hashCode(){
       return this.map().hashCode();
    }
    public boolean isHashCodeFast(){
       return this.map().isHashCodeFast();
    }
    public boolean isPartialView(){
       return this.map().isPartialView();
    }
    public abstract ImmutableMap map();
    public int size(){
       return this.map().size();
    }
}
