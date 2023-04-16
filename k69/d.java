package k69.d;
import java.lang.Runnable;
import k69.e;
import java.lang.Object;

public final class d implements Runnable	// class@002b43
{
    public final e b;
    public final Object c;

    public void d(e p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.c(this.c);
    }
}
