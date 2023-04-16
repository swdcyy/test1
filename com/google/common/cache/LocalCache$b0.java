package com.google.common.cache.LocalCache$b0;
import com.google.common.cache.LocalCache$x;
import java.lang.ref.ReferenceQueue;
import java.lang.Object;
import com.google.common.cache.d;
import com.google.common.cache.LocalCache$s;

public final class LocalCache$b0 extends LocalCache$x	// class@001754
{
    public final int c;

    public void LocalCache$b0(ReferenceQueue p0,Object p1,d p2,int p3){
       super(p0, p1, p2);
       this.c = p3;
    }
    public int c(){
       return this.c;
    }
    public LocalCache$s e(ReferenceQueue p0,Object p1,d p2){
       return new LocalCache$b0(p0, p1, p2, this.c);
    }
}
