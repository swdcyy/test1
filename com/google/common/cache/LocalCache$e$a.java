package com.google.common.cache.LocalCache$e$a;
import com.google.common.cache.LocalCache$d;
import com.google.common.cache.LocalCache$e;
import com.google.common.cache.d;

public class LocalCache$e$a extends LocalCache$d	// class@00175c
{
    public d b;
    public d c;
    public final LocalCache$e d;

    public void LocalCache$e$a(LocalCache$e p0){
       this.d = p0;
       super();
       this.b = this;
       this.c = this;
    }
    public long getAccessTime(){
       return Long.MAX_VALUE;
    }
    public d getNextInAccessQueue(){
       return this.b;
    }
    public d getPreviousInAccessQueue(){
       return this.c;
    }
    public void setAccessTime(long p0){
    }
    public void setNextInAccessQueue(d p0){
       this.b = p0;
    }
    public void setPreviousInAccessQueue(d p0){
       this.c = p0;
    }
}
