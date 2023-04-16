package jtd.g$a$a;
import jtd.e;
import java.lang.Object;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import ftd.c2;
import csd.b;
import qrd.l1;

public final class g$a$a implements e	// class@001738
{
    public final e b;

    public void g$a$a(e p0){
       this.b = p0;
       super();
    }
    public Object emit(Object p0,c p1){
       c2.B(p1.getContext());
       p0 = this.b.emit(p0, p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
}
