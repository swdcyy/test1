package bp8.d;
import java.lang.Runnable;
import com.tachikoma.core.component.network.Network$b;
import tx4.v;
import com.tkruntime.v8.V8Function;
import java.lang.Object;
import com.tachikoma.core.component.network.Network;

public final class d implements Runnable	// class@000441
{
    public final Network$b b;
    public final v c;
    public final V8Function d;

    public void d(Network$b p0,v p1,V8Function p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.b.onGetError(this.c, this.d);
    }
}
