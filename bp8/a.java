package bp8.a;
import java.lang.Runnable;
import com.tachikoma.core.component.network.Network$a;
import tx4.u;
import com.tkruntime.v8.V8Function;
import java.lang.Object;
import com.tachikoma.core.component.network.Network;

public final class a implements Runnable	// class@00043e
{
    public final Network$a b;
    public final u c;
    public final V8Function d;

    public void a(Network$a p0,u p1,V8Function p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.b.onPostSuccess(this.c, this.d);
    }
}
