package jc9.p;
import java.lang.Runnable;
import jc9.b0;
import java.lang.Object;
import hc9.e;

public final class p implements Runnable	// class@002948
{
    public final b0 b;
    public final Object c;

    public void p(b0 p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.e.c(this.c, 0);
    }
}
