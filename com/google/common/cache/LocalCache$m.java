package com.google.common.cache.LocalCache$m;
import com.google.common.cache.LocalCache$o;
import java.lang.Object;
import com.google.common.cache.d;
import com.google.common.cache.LocalCache;

public final class LocalCache$m extends LocalCache$o	// class@001767
{
    public long f;
    public d g;
    public d h;

    public void LocalCache$m(Object p0,int p1,d p2){
       super(p0, p1, p2);
       this.f = Long.MAX_VALUE;
       this.g = LocalCache.o();
       this.h = LocalCache.o();
    }
    public long getAccessTime(){
       return this.f;
    }
    public d getNextInAccessQueue(){
       return this.g;
    }
    public d getPreviousInAccessQueue(){
       return this.h;
    }
    public void setAccessTime(long p0){
       this.f = p0;
    }
    public void setNextInAccessQueue(d p0){
       this.g = p0;
    }
    public void setPreviousInAccessQueue(d p0){
       this.h = p0;
    }
}
