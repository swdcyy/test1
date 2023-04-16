package apb.k;
import java.lang.Runnable;
import apb.m;
import java.lang.Object;

public final class k implements Runnable	// class@0002ad
{
    public final m b;
    public final boolean c;
    public final boolean d;

    public void k(m p0,boolean p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.d9(this.c, this.d);
    }
}
