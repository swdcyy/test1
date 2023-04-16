package com.google.common.cache.LocalCache$c0$b;
import qk.d;
import com.google.common.cache.LocalCache$c0;
import com.google.common.cache.d;
import java.lang.Object;

public class LocalCache$c0$b extends d	// class@001757
{
    public final LocalCache$c0 c;

    public void LocalCache$c0$b(LocalCache$c0 p0,d p1){
       this.c = p0;
       super(p1);
    }
    public Object a(Object p0){
       p0 = p0.getNextInWriteQueue();
       if (p0 == this.c.b) {
          p0 = null;
       }
       return p0;
    }
}
