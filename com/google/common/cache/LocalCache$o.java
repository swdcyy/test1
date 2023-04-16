package com.google.common.cache.LocalCache$o;
import com.google.common.cache.LocalCache$d;
import java.lang.Object;
import com.google.common.cache.d;
import com.google.common.cache.LocalCache$s;
import com.google.common.cache.LocalCache;

public class LocalCache$o extends LocalCache$d	// class@001769
{
    public final Object b;
    public final int c;
    public final d d;
    public LocalCache$s e;

    public void LocalCache$o(Object p0,int p1,d p2){
       super();
       this.e = LocalCache.B();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public int getHash(){
       return this.c;
    }
    public Object getKey(){
       return this.b;
    }
    public d getNext(){
       return this.d;
    }
    public LocalCache$s getValueReference(){
       return this.e;
    }
    public void setValueReference(LocalCache$s p0){
       this.e = p0;
    }
}
