package co.g;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.aegon.diagnostic.DiagnosticManager;

public final class g implements Runnable	// class@000327
{
    public final int[] b;

    public void g(int[] p0){
       this.b = p0;
    }
    public final void run(){
       DiagnosticManager.lambda$setAttentionErrorCodes$7(this.b);
    }
}
