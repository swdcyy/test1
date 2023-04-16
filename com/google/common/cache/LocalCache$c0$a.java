package com.google.common.cache.LocalCache$c0$a;
import com.google.common.cache.LocalCache$d;
import com.google.common.cache.LocalCache$c0;
import com.google.common.cache.d;

public class LocalCache$c0$a extends LocalCache$d	// class@001756
{
    public d b;
    public d c;
    public final LocalCache$c0 d;

    public void LocalCache$c0$a(LocalCache$c0 p0){
       this.d = p0;
       super();
       this.b = this;
       this.c = this;
    }
    public d getNextInWriteQueue(){
       return this.b;
    }
    public d getPreviousInWriteQueue(){
       return this.c;
    }
    public long getWriteTime(){
       return Long.MAX_VALUE;
    }
    public void setNextInWriteQueue(d p0){
       this.b = p0;
    }
    public void setPreviousInWriteQueue(d p0){
       this.c = p0;
    }
    public void setWriteTime(long p0){
    }
}
