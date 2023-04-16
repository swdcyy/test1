package em1.x;
import java.lang.Runnable;
import em1.a0;
import java.util.List;
import java.lang.Object;
import em1.q;

public final class x implements Runnable	// class@0021ca
{
    public final a0 b;
    public final List c;

    public void x(a0 p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.q(this.c, -1);
    }
}
