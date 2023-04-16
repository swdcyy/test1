package c00.a;
import java.lang.Runnable;
import tx4.i;
import tx4.u;
import java.lang.Object;

public final class a implements Runnable	// class@0002dc
{
    public final i b;
    public final u c;

    public void a(i p0,u p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.b(this.c);
    }
}
