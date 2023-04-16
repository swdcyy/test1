package co.h;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.aegon.diagnostic.DiagnosticManager;

public final class h implements Runnable	// class@000328
{
    public final String[] b;

    public void h(String[] p0){
       this.b = p0;
    }
    public final void run(){
       DiagnosticManager.lambda$setExcludedHosts$2(this.b);
    }
}
