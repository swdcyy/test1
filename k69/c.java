package k69.c;
import java.lang.Runnable;
import k69.e;
import java.lang.Object;

public final class c implements Runnable	// class@002b42
{
    public final e b;
    public final Object c;

    public void c(e p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.d(this.c);
    }
}
