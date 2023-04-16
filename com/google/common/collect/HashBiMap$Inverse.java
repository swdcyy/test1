package com.google.common.collect.HashBiMap$Inverse;
import qk.f;
import java.io.Serializable;
import java.util.AbstractMap;
import com.google.common.collect.HashBiMap;
import java.lang.Object;
import java.util.Set;
import com.google.common.collect.HashBiMap$d;
import java.io.ObjectInputStream;
import java.util.Collection;

public class HashBiMap$Inverse extends AbstractMap implements f, Serializable	// class@0017c8
{
    public Set b;
    public final HashBiMap forward;

    public void HashBiMap$Inverse(HashBiMap p0){
       super();
       this.forward = p0;
    }
    public void clear(){
       this.forward.clear();
    }
    public boolean containsKey(Object p0){
       return this.forward.containsValue(p0);
    }
    public boolean containsValue(Object p0){
       return this.forward.containsKey(p0);
    }
    public Set entrySet(){
       HashBiMap$Inverse tb = this.b;
       if (tb == null) {
          tb = new HashBiMap$d(this.forward);
          this.b = tb;
       }
       return tb;
    }
    public Object forcePut(Object p0,Object p1){
       return this.forward.putInverse(p0, p1, true);
    }
    public Object get(Object p0){
       return this.forward.getInverse(p0);
    }
    public f inverse(){
       return this.forward;
    }
    public Set keySet(){
       return this.forward.values();
    }
    public Object put(Object p0,Object p1){
       return this.forward.putInverse(p0, p1, false);
    }
    public final void readObject(ObjectInputStream p0){
       p0.defaultReadObject();
       p0.inverse = this;
    }
    public Object remove(Object p0){
       return this.forward.removeInverse(p0);
    }
    public int size(){
       return this.forward.size;
    }
    public Collection values(){
       return this.values();
    }
    public Set values(){
       return this.forward.keySet();
    }
}
