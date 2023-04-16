package kotlinx.coroutines.JobSupport$d;
import ltd.o$c;
import ltd.o;
import kotlinx.coroutines.JobSupport;
import java.lang.Object;
import ltd.n;

public final class JobSupport$d extends o$c	// class@00192a
{
    public final o d;
    public final JobSupport e;
    public final Object f;

    public void JobSupport$d(o p0,o p1,JobSupport p2,Object p3){
       this.d = p0;
       this.e = p2;
       this.f = p3;
       super(p1);
    }
    public Object h(Object p0){
       return this.j(p0);
    }
    public Object j(o p0){
       p0 = (this.e.y0() == this.f)? 1: null;
       p0 = (p0)? null: n.f();
       return p0;
    }
}
