package n61.c;
import java.lang.Runnable;
import n61.d;
import java.lang.Object;

public final class c implements Runnable	// class@0032b2
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       tb.a.run();
       d c = tb.c;
       _monitor_enter(c);
       tb.d = false;
       _monitor_exit(c);
    }
}
