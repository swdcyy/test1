package jc9.q;
import java.lang.Runnable;
import jc9.b0;
import java.lang.Object;
import ad9.i;
import hc9.e;

public final class q implements Runnable	// class@002949
{
    public final b0 b;
    public final Object c;

    public void q(b0 p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       q tb = this.b;
       tb.d.g(false);
       tb.e.d(5, this.c);
    }
}
