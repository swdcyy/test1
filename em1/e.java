package em1.e;
import java.lang.Runnable;
import em1.q;
import java.util.List;
import java.lang.Object;

public final class e implements Runnable	// class@0021b5
{
    public final q b;
    public final List c;

    public void e(q p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.z(this.c);
    }
}
