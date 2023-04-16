package d61.p;
import java.lang.Runnable;
import hf3.a;
import lf3.g;
import java.lang.Object;

public final class p implements Runnable	// class@001f3c
{
    public final a b;
    public final int c;
    public final g d;

    public void p(a p0,int p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.o(this.c, this.d);
    }
}
