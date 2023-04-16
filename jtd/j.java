package jtd.j;
import kotlinx.coroutines.flow.AbstractFlow;
import msd.p;
import jtd.e;
import asd.c;
import java.lang.Object;
import csd.b;
import qrd.l1;

public final class j extends AbstractFlow	// class@00173f
{
    public final p a;

    public void j(p p0){
       super();
       this.a = p0;
    }
    public Object c(e p0,c p1){
       p0 = this.a.invoke(p0, p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
}
