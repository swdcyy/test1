package io.netty.util.internal.chmv8.ConcurrentHashMapV8$i;
import java.util.Iterator;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$c;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import java.lang.Object;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$z;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$q;
import java.util.NoSuchElementException;

public final class ConcurrentHashMapV8$i extends ConcurrentHashMapV8$c implements Iterator	// class@001156
{

    public void ConcurrentHashMapV8$i(ConcurrentHashMapV8$r[] p0,int p1,int p2,int p3,ConcurrentHashMapV8 p4){
       super(p0, p1, p2, p3, p4);
    }
    public Object next(){
       ConcurrentHashMapV8$z tc = this.c;
       if (tc == null) {
          throw new NoSuchElementException();
       }
       this.i = tc;
       this.e();
       return new ConcurrentHashMapV8$q(tc.c, tc.d, this.h);
    }
}
