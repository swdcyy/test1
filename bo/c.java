package bo.c;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;

public final class c implements Runnable	// class@000314
{
    public final boolean b;

    public void c(boolean p0){
       this.b = p0;
    }
    public final void run(){
       Aegon.nativeCleanNetworkStatus(this.b);
    }
}
