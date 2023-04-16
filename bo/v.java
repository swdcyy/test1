package bo.v;
import java.lang.Runnable;
import com.kuaishou.aegon.NetworkStateHelper;
import java.lang.Object;

public final class v implements Runnable	// class@000326
{
    public final NetworkStateHelper b;

    public void v(NetworkStateHelper p0){
       this.b = p0;
    }
    public final void run(){
       this.b.nativeOnCreated();
    }
}
