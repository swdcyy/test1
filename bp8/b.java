package bp8.b;
import java.lang.Runnable;
import com.tachikoma.core.component.network.Network$a;
import tx4.v;
import com.tkruntime.v8.V8Function;
import java.lang.Object;
import com.tachikoma.core.component.network.Network;

public final class b implements Runnable	// class@00043f
{
    public final Network$a b;
    public final v c;
    public final V8Function d;

    public void b(Network$a p0,v p1,V8Function p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.b.onPostError(this.c, this.d);
    }
}
