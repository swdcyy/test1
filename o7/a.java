package o7.a;
import java.lang.Runnable;
import com.android.kwai.foundation.network.IRpcService$Callback;
import java.lang.Object;
import com.android.kwai.foundation.network.core.AbsRpcDelegate;

public final class a implements Runnable	// class@001fb2
{
    public final IRpcService$Callback b;
    public final Object c;

    public void a(IRpcService$Callback p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       AbsRpcDelegate.a(this.b, this.c);
    }
}
