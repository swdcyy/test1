package com.google.common.cache.LocalCache$e$b;
import qk.d;
import com.google.common.cache.LocalCache$e;
import com.google.common.cache.d;
import java.lang.Object;

public class LocalCache$e$b extends d	// class@00175d
{
    public final LocalCache$e c;

    public void LocalCache$e$b(LocalCache$e p0,d p1){
       this.c = p0;
       super(p1);
    }
    public Object a(Object p0){
       p0 = p0.getNextInAccessQueue();
       if (p0 == this.c.b) {
          p0 = null;
       }
       return p0;
    }
}
