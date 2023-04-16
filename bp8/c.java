package bp8.c;
import java.lang.Runnable;
import com.tachikoma.core.component.network.Network$b;
import tx4.u;
import com.tkruntime.v8.V8Function;
import java.lang.Object;
import com.tachikoma.core.component.network.Network;

public final class c implements Runnable	// class@000440
{
    public final Network$b b;
    public final u c;
    public final V8Function d;

    public void c(Network$b p0,u p1,V8Function p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.b.onGetSuccess(this.c, this.d);
    }
}
