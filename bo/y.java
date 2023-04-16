package bo.y;
import java.lang.Runnable;
import com.kuaishou.aegon.NetworkStateHelper;
import java.lang.Object;

public final class y implements Runnable	// class@000329
{
    public final NetworkStateHelper b;
    public final int c;
    public final int d;

    public void y(NetworkStateHelper p0,int p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.nativeOnKwaiConnectionTypeValueUpdate(this.c, this.d);
    }
}
