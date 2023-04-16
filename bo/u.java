package bo.u;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.aegon.NetworkActivationHelper;

public final class u implements Runnable	// class@0002ac
{
    public final int b;

    public void u(int p0){
       this.b = p0;
    }
    public final void run(){
       NetworkActivationHelper.nativeUpdateProcessNetwork(this.b);
    }
}
