package io.netty.util.internal.chmv8.ConcurrentHashMapV8$o;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$f;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$z;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$r;
import io.netty.util.internal.chmv8.ConcurrentHashMapV8$b;
import java.lang.Object;
import java.util.Objects;

public final class ConcurrentHashMapV8$o extends ConcurrentHashMapV8$z implements ConcurrentHashMapV8$f	// class@00115c
{
    public long h;

    public void ConcurrentHashMapV8$o(ConcurrentHashMapV8$r[] p0,int p1,int p2,int p3,long p4){
       super(p0, p1, p2, p3);
       this.h = p4;
    }
    public long a(){
       return this.h;
    }
    public void b(ConcurrentHashMapV8$b p0){
       Objects.requireNonNull(p0);
       ConcurrentHashMapV8$r or = this.e();
       while (or != null) {
          p0.apply(or.c);
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
          long l1 = this.h >> l;
          this.h = l1;
          ConcurrentHashMapV8$o oo = new ConcurrentHashMapV8$o(this.b, this.g, i, tf, l1);
       }
       return uof;
    }
    public boolean d(ConcurrentHashMapV8$b p0){
       Objects.requireNonNull(p0);
       ConcurrentHashMapV8$r or = this.e();
       if (or == null) {
          return false;
       }
       p0.apply(or.c);
       return true;
    }
}
