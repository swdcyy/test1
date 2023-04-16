package com.google.common.cache.LocalCache$t;
import java.util.AbstractCollection;
import com.google.common.cache.LocalCache;
import java.util.concurrent.ConcurrentMap;
import java.lang.Object;
import java.util.Iterator;
import com.google.common.cache.LocalCache$r;
import java.util.Collection;
import java.util.ArrayList;

public final class LocalCache$t extends AbstractCollection	// class@00176e
{
    public final ConcurrentMap b;
    public final LocalCache c;

    public void LocalCache$t(LocalCache p0,ConcurrentMap p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void clear(){
       this.b.clear();
    }
    public boolean contains(Object p0){
       return this.b.containsValue(p0);
    }
    public boolean isEmpty(){
       return this.b.isEmpty();
    }
    public Iterator iterator(){
       return new LocalCache$r(this.c);
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
