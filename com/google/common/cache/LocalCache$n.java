package com.google.common.cache.LocalCache$n;
import com.google.common.cache.LocalCache$o;
import java.lang.Object;
import com.google.common.cache.d;
import com.google.common.cache.LocalCache;

public final class LocalCache$n extends LocalCache$o	// class@001768
{
    public long f;
    public d g;
    public d h;
    public long i;
    public d j;
    public d k;

    public void LocalCache$n(Object p0,int p1,d p2){
       super(p0, p1, p2);
       this.f = Long.MAX_VALUE;
       this.g = LocalCache.o();
       this.h = LocalCache.o();
       this.i = Long.MAX_VALUE;
       this.j = LocalCache.o();
       this.k = LocalCache.o();
    }
    public long getAccessTime(){
       return this.f;
    }
    public d getNextInAccessQueue(){
       return this.g;
    }
    public d getNextInWriteQueue(){
       return this.j;
    }
    public d getPreviousInAccessQueue(){
       return this.h;
    }
    public d getPreviousInWriteQueue(){
       return this.k;
    }
    public long getWriteTime(){
       return this.i;
    }
    public void setAccessTime(long p0){
       this.f = p0;
    }
    public void setNextInAccessQueue(d p0){
       this.g = p0;
    }
    public void setNextInWriteQueue(d p0){
       this.j = p0;
    }
    public void setPreviousInAccessQueue(d p0){
       this.h = p0;
    }
    public void setPreviousInWriteQueue(d p0){
       this.k = p0;
    }
    public void setWriteTime(long p0){
       this.i = p0;
    }
}
