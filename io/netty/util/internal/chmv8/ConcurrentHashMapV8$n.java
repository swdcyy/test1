package io.netty.util.internal.chmv8.ConcurrentHashMapV8$n;
import java.util.Iterator;
import java.util.Enumeration;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$c;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import java.lang.Object;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$z;
import java.util.NoSuchElementException;

public final class ConcurrentHashMapV8$n extends ConcurrentHashMapV8$c implements Iterator, Enumeration	// class@00115b
{

    public void ConcurrentHashMapV8$n(ConcurrentHashMapV8$r[] p0,int p1,int p2,int p3,ConcurrentHashMapV8 p4){
       super(p0, p1, p2, p3, p4);
    }
    public final Object next(){
       ConcurrentHashMapV8$z tc = this.c;
       if (tc == null) {
          throw new NoSuchElementException();
       }
       this.i = tc;
       this.e();
       return tc.c;
    }
    public final Object nextElement(){
       return this.next();
    }
}
