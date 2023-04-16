package com.google.common.cache.LocalCache$q;
import com.google.common.cache.LocalCache$o;
import java.lang.Object;
import com.google.common.cache.d;
import com.google.common.cache.LocalCache;

public final class LocalCache$q extends LocalCache$o	// class@00176b
{
    public long f;
    public d g;
    public d h;

    public void LocalCache$q(Object p0,int p1,d p2){
       super(p0, p1, p2);
       this.f = Long.MAX_VALUE;
       this.g = LocalCache.o();
       this.h = LocalCache.o();
    }
    public d getNextInWriteQueue(){
       return this.g;
    }
    public d getPreviousInWriteQueue(){
       return this.h;
    }
    public long getWriteTime(){
       return this.f;
    }
    public void setNextInWriteQueue(d p0){
       this.g = p0;
    }
    public void setPreviousInWriteQueue(d p0){
       this.h = p0;
    }
    public void setWriteTime(long p0){
       this.f = p0;
    }
}
