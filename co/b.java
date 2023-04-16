package co.b;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.aegon.diagnostic.DiagnosticManager;

public final class b implements Runnable	// class@000322
{
    public final int b;

    public void b(int p0){
       this.b = p0;
    }
    public final void run(){
       DiagnosticManager.lambda$setDomainStatisticsTimeRange$5(this.b);
    }
}
