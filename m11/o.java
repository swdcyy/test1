package m11.o;
import java.lang.Runnable;
import m11.p;
import java.lang.Object;

public final class o implements Runnable	// class@003108
{
    public final p b;

    public void o(p p0){
       this.b = p0;
    }
    public final void run(){
       p.a(this.b);
    }
}
