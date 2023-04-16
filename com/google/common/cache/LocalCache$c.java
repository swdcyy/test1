package com.google.common.cache.LocalCache$c;
import java.util.AbstractSet;
import com.google.common.cache.LocalCache;
import java.util.concurrent.ConcurrentMap;
import java.lang.Object;
import java.util.Collection;
import java.util.ArrayList;

public abstract class LocalCache$c extends AbstractSet	// class@001759
{
    public final ConcurrentMap b;
    public final LocalCache c;

    public void LocalCache$c(LocalCache p0,ConcurrentMap p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void clear(){
       this.b.clear();
    }
    public boolean isEmpty(){
       return this.b.isEmpty();
    }
    public int size(){
       return this.b.size();
    }
    public Object[] toArray(){
       return LocalCache.A(this).toArray();
    }
    public Object[] toArray(Object[] p0){
       return LocalCache.A(this).toArray(p0);
    }
}
