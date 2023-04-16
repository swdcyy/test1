package com.google.common.collect.Multimaps$b;
import java.util.AbstractCollection;
import qk.g0;
import java.lang.Object;
import java.util.Map$Entry;

public abstract class Multimaps$b extends AbstractCollection	// class@001859
{

    public void Multimaps$b(){
       super();
    }
    public abstract g0 b();
    public void clear(){
       this.b().clear();
    }
    public boolean contains(Object p0){
       if (p0 instanceof Map$Entry) {
          return this.b().containsEntry(p0.getKey(), p0.getValue());
       }
       return false;
    }
    public boolean remove(Object p0){
       if (p0 instanceof Map$Entry) {
          return this.b().remove(p0.getKey(), p0.getValue());
       }
       return false;
    }
    public int size(){
       return this.b().size();
    }
}
