package com.google.common.cache.LocalCache$u;
import com.google.common.cache.LocalCache$w;
import java.lang.ref.ReferenceQueue;
import java.lang.Object;
import com.google.common.cache.d;
import com.google.common.cache.LocalCache;

public final class LocalCache$u extends LocalCache$w	// class@00176f
{
    public long e;
    public d f;
    public d g;

    public void LocalCache$u(ReferenceQueue p0,Object p1,int p2,d p3){
       super(p0, p1, p2, p3);
       this.e = Long.MAX_VALUE;
       this.f = LocalCache.o();
       this.g = LocalCache.o();
    }
    public long getAccessTime(){
       return this.e;
    }
    public d getNextInAccessQueue(){
       return this.f;
    }
    public d getPreviousInAccessQueue(){
       return this.g;
    }
    public void setAccessTime(long p0){
       this.e = p0;
    }
    public void setNextInAccessQueue(d p0){
       this.f = p0;
    }
    public void setPreviousInAccessQueue(d p0){
       this.g = p0;
    }
}
