package com.google.common.cache.LocalCache$y;
import com.google.common.cache.LocalCache$w;
import java.lang.ref.ReferenceQueue;
import java.lang.Object;
import com.google.common.cache.d;
import com.google.common.cache.LocalCache;

public final class LocalCache$y extends LocalCache$w	// class@001773
{
    public long e;
    public d f;
    public d g;

    public void LocalCache$y(ReferenceQueue p0,Object p1,int p2,d p3){
       super(p0, p1, p2, p3);
       this.e = Long.MAX_VALUE;
       this.f = LocalCache.o();
       this.g = LocalCache.o();
    }
    public d getNextInWriteQueue(){
       return this.f;
    }
    public d getPreviousInWriteQueue(){
       return this.g;
    }
    public long getWriteTime(){
       return this.e;
    }
    public void setNextInWriteQueue(d p0){
       this.f = p0;
    }
    public void setPreviousInWriteQueue(d p0){
       this.g = p0;
    }
    public void setWriteTime(long p0){
       this.e = p0;
    }
}
