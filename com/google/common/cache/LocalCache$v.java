package com.google.common.cache.LocalCache$v;
import com.google.common.cache.LocalCache$w;
import java.lang.ref.ReferenceQueue;
import java.lang.Object;
import com.google.common.cache.d;
import com.google.common.cache.LocalCache;

public final class LocalCache$v extends LocalCache$w	// class@001770
{
    public long e;
    public d f;
    public d g;
    public long h;
    public d i;
    public d j;

    public void LocalCache$v(ReferenceQueue p0,Object p1,int p2,d p3){
       super(p0, p1, p2, p3);
       this.e = Long.MAX_VALUE;
       this.f = LocalCache.o();
       this.g = LocalCache.o();
       this.h = Long.MAX_VALUE;
       this.i = LocalCache.o();
       this.j = LocalCache.o();
    }
    public long getAccessTime(){
       return this.e;
    }
    public d getNextInAccessQueue(){
       return this.f;
    }
    public d getNextInWriteQueue(){
       return this.i;
    }
    public d getPreviousInAccessQueue(){
       return this.g;
    }
    public d getPreviousInWriteQueue(){
       return this.j;
    }
    public long getWriteTime(){
       return this.h;
    }
    public void setAccessTime(long p0){
       this.e = p0;
    }
    public void setNextInAccessQueue(d p0){
       this.f = p0;
    }
    public void setNextInWriteQueue(d p0){
       this.i = p0;
    }
    public void setPreviousInAccessQueue(d p0){
       this.g = p0;
    }
    public void setPreviousInWriteQueue(d p0){
       this.j = p0;
    }
    public void setWriteTime(long p0){
       this.h = p0;
    }
}
