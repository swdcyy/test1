package bc2.s;
import java.lang.Runnable;
import bc2.t;
import java.lang.String;
import java.lang.Object;
import bc2.o;
import z1.a;

public final class s implements Runnable	// class@0003de
{
    public final t b;
    public final String c;

    public void s(t p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       s tb = this.b;
       tb.i(new o(tb, this.c));
    }
}
