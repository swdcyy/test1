package com.google.common.cache.LocalCache$i;
import com.google.common.cache.LocalCache$h;
import com.google.common.cache.LocalCache;
import java.lang.Object;
import com.google.common.cache.LocalCache$d0;

public final class LocalCache$i extends LocalCache$h	// class@001762
{
    public final LocalCache j;

    public void LocalCache$i(LocalCache p0){
       this.j = p0;
       super(p0);
    }
    public Object next(){
       return this.c().getKey();
    }
}
