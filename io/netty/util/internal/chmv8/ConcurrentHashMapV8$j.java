package io.netty.util.internal.chmv8.ConcurrentHashMapV8$j;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$f;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$z;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$b;
import java.lang.Object;
import java.util.Objects;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$q;

public final class ConcurrentHashMapV8$j extends ConcurrentHashMapV8$z implements ConcurrentHashMapV8$f	// class@001157
{
    public final ConcurrentHashMapV8 h;
    public long i;

    public void ConcurrentHashMapV8$j(ConcurrentHashMapV8$r[] p0,int p1,int p2,int p3,long p4,ConcurrentHashMapV8 p5){
       super(p0, p1, p2, p3);
       this.h = p5;
       this.i = p4;
    }
    public long a(){
       return this.i;
    }
    public void b(ConcurrentHashMapV8$b p0){
       Objects.requireNonNull(p0);
       ConcurrentHashMapV8$r or = this.e();
       while (or != null) {
          p0.apply(new ConcurrentHashMapV8$q(or.c, or.d, this.h));
       }
       return;
    }
    public ConcurrentHashMapV8$f c(){
       ConcurrentHashMapV8$f uof;
       ConcurrentHashMapV8$z te = this.e;
       ConcurrentHashMapV8$z tf = this.f;
       long l = 1;
       int i = (te + tf) >> 1;
       if (i <= te) {
          uof = null;
       }else {
          this.f = i;
          long l1 = this.i >> l;
          this.i = l1;
          ConcurrentHashMapV8$j oj = new ConcurrentHashMapV8$j(this.b, this.g, i, tf, l1, this.h);
       }
       return uof;
    }
    public boolean d(ConcurrentHashMapV8$b p0){
       Objects.requireNonNull(p0);
       ConcurrentHashMapV8$r or = this.e();
       if (or == null) {
          return false;
       }
       p0.apply(new ConcurrentHashMapV8$q(or.c, or.d, this.h));
       return true;
    }
}
