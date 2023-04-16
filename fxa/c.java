package fxa.c;
import java.lang.Runnable;
import fxa.d;
import fxa.a;
import java.lang.Object;

public final class c implements Runnable	// class@002a4b
{
    public final d b;
    public final a c;

    public void c(d p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.b(this.c);
    }
}
