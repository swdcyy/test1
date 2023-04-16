package bp6.z1;
import java.lang.Runnable;
import com.kwai.imsdk.internal.v$d;
import hh0.a$a;
import hh0.a$j;
import java.lang.Object;
import com.kwai.imsdk.internal.v;
import java.util.Iterator;
import java.util.List;
import qo6.n1;

public final class z1 implements Runnable	// class@000561
{
    public final v$d b;
    public final a$a c;
    public final a$j d;

    public void z1(v$d p0,a$a p1,a$j p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       z1 tc = this.c;
       z1 td = this.d;
       Iterator iterator = this.b.a.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(tc, td);
       }
       return;
    }
}
