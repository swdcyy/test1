package com.google.common.cache.LocalCache$j;
import com.google.common.cache.LocalCache$c;
import com.google.common.cache.LocalCache;
import java.util.concurrent.ConcurrentMap;
import java.lang.Object;
import java.util.Iterator;
import com.google.common.cache.LocalCache$i;

public final class LocalCache$j extends LocalCache$c	// class@001763
{
    public final LocalCache d;

    public void LocalCache$j(LocalCache p0,ConcurrentMap p1){
       this.d = p0;
       super(p0, p1);
    }
    public boolean contains(Object p0){
       return this.b.containsKey(p0);
    }
    public Iterator iterator(){
       return new LocalCache$i(this.d);
    }
    public boolean remove(Object p0){
       boolean b = (this.b.remove(p0) != null)? true: false;
       return b;
    }
}
