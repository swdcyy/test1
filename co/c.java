package co.c;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.aegon.diagnostic.DiagnosticManager;

public final class c implements Runnable	// class@000323
{
    public final int b;

    public void c(int p0){
       this.b = p0;
    }
    public final void run(){
       DiagnosticManager.lambda$setMinimalIntervalPerDomainSec$6(this.b);
    }
}
