package bo.w;
import java.lang.Runnable;
import com.kuaishou.aegon.NetworkStateHelper;
import java.lang.Object;

public final class w implements Runnable	// class@0002ad
{
    public final NetworkStateHelper b;

    public void w(NetworkStateHelper p0){
       this.b = p0;
    }
    public final void run(){
       this.b.nativeOnSignalStrengthChanged();
    }
}
