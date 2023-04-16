package cm6.a;
import java.lang.Runnable;
import cm6.b;
import java.lang.Object;

public final class a implements Runnable	// class@000702
{
    public final b b;
    public final int c;

    public void a(b p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tb = this.b;
       b e = tb.e;
       _monitor_enter(e);
       tb.b(this.c);
       _monitor_exit(e);
    }
}
