package bo.x;
import java.lang.Runnable;
import com.kuaishou.aegon.NetworkStateHelper;
import java.lang.Object;

public final class x implements Runnable	// class@0002ae
{
    public final NetworkStateHelper b;
    public final int c;
    public final int d;

    public void x(NetworkStateHelper p0,int p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.nativeOnSignalStrengthValueUpdate(this.c, this.d);
    }
}
