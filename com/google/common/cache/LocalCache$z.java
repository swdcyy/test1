package com.google.common.cache.LocalCache$z;
import com.google.common.cache.LocalCache$l;
import java.lang.ref.ReferenceQueue;
import java.lang.Object;
import com.google.common.cache.d;
import com.google.common.cache.LocalCache$s;

public final class LocalCache$z extends LocalCache$l	// class@001774
{
    public final int c;

    public void LocalCache$z(ReferenceQueue p0,Object p1,d p2,int p3){
       super(p0, p1, p2);
       this.c = p3;
    }
    public int c(){
       return this.c;
    }
    public LocalCache$s e(ReferenceQueue p0,Object p1,d p2){
       return new LocalCache$z(p0, p1, p2, this.c);
    }
}
