package an1.a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.highfrequency.textdescription.HighFluencyAnimHandler;
import java.lang.Integer;
import java.util.Deque;
import java.lang.Object;
import z1.a;

public final class a implements Runnable	// class@0000e4
{
    public final HighFluencyAnimHandler b;
    public final Integer c;
    public final Deque d;
    public final Deque e;

    public void a(HighFluencyAnimHandler p0,Integer p1,Integer p2,Deque p3,Deque p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p3;
       this.e = p4;
    }
    public final void run(){
       a tb = this.b;
       tb.b.accept(this.c);
       tb.a(this.d, this.e);
    }
}
