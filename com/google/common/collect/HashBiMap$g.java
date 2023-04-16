package com.google.common.collect.HashBiMap$g;
import java.util.AbstractSet;
import com.google.common.collect.HashBiMap;
import java.lang.Object;
import java.util.Iterator;
import com.google.common.collect.HashBiMap$g$a;

public abstract class HashBiMap$g extends AbstractSet	// class@0017d0
{
    public final HashBiMap b;

    public void HashBiMap$g(HashBiMap p0){
       super();
       this.b = p0;
    }
    public abstract Object b(int p0);
    public void clear(){
       this.b.clear();
    }
    public Iterator iterator(){
       return new HashBiMap$g$a(this);
    }
    public int size(){
       return this.b.size;
    }
}
