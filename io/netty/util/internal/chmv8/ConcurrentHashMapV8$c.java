package io.netty.util.internal.chmv8.ConcurrentHashMapV8$c;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$z;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import java.lang.Object;
import java.lang.IllegalStateException;

public class ConcurrentHashMapV8$c extends ConcurrentHashMapV8$z	// class@00114f
{
    public final ConcurrentHashMapV8 h;
    public ConcurrentHashMapV8$r i;

    public void ConcurrentHashMapV8$c(ConcurrentHashMapV8$r[] p0,int p1,int p2,int p3,ConcurrentHashMapV8 p4){
       super(p0, p1, p2, p3);
       this.h = p4;
       this.e();
    }
    public final boolean hasMoreElements(){
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public final boolean hasNext(){
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public final void remove(){
       ConcurrentHashMapV8$c ti = this.i;
       if (ti == null) {
          throw new IllegalStateException();
       }
       this.i = null;
       this.h.replaceNode(ti.c, null, null);
       return;
    }
}
