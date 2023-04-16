package bp6.e0;
import java.lang.Runnable;
import qo6.s1;
import java.util.List;
import java.lang.Object;
import java.lang.String;

public final class e0 implements Runnable	// class@00050e
{
    public final s1 b;
    public final List c;
    public final int d;

    public void e0(s1 p0,List p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.a(this.c, "online_status", this.d);
    }
}
