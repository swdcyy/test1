package co.i;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.aegon.diagnostic.DiagnosticManager;

public final class i implements Runnable	// class@000329
{
    public final String[] b;

    public void i(String[] p0){
       this.b = p0;
    }
    public final void run(){
       DiagnosticManager.lambda$setMonitoredHosts$1(this.b);
    }
}
