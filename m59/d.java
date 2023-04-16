package m59.d;
import java.lang.Runnable;
import m59.o;
import java.lang.String;
import java.lang.Object;

public final class d implements Runnable	// class@002dff
{
    public final o b;
    public final String c;

    public void d(o p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       o.C(this.b, this.c);
    }
}
