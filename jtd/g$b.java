package jtd.g$b;
import jtd.d;
import msd.l;
import kotlin.coroutines.CoroutineContext;
import java.lang.Object;
import jtd.e;
import asd.c;
import ftd.z1;
import kotlin.coroutines.CoroutineContext$b;
import jtd.f;
import jtd.g$b$a;
import csd.b;
import qrd.l1;

public final class g$b implements d	// class@00173b
{
    public final d a;
    public final int b;
    public final l c;
    public final CoroutineContext d;

    public void g$b(d p0,int p1,l p2,CoroutineContext p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public Object b(e p0,c p1){
       p0 = f.o(f.K0(this.c.invoke(f.o(f.K0(this.a, p1.getContext().minusKey(z1.p0)), this.b)), this.d), this.b).b(new g$b$a(p0), p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
}
