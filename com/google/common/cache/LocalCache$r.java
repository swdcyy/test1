package com.google.common.cache.LocalCache$r;
import com.google.common.cache.LocalCache$h;
import com.google.common.cache.LocalCache;
import java.lang.Object;
import com.google.common.cache.LocalCache$d0;

public final class LocalCache$r extends LocalCache$h	// class@00176c
{
    public final LocalCache j;

    public void LocalCache$r(LocalCache p0){
       this.j = p0;
       super(p0);
    }
    public Object next(){
       return this.c().getValue();
    }
}
