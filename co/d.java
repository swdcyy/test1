package co.d;
import java.lang.Runnable;
import com.kuaishou.aegon.diagnostic.DiagnosticResult;
import java.lang.Object;
import com.kuaishou.aegon.diagnostic.DiagnosticManager;

public final class d implements Runnable	// class@000324
{
    public final DiagnosticResult b;

    public void d(DiagnosticResult p0){
       this.b = p0;
    }
    public final void run(){
       DiagnosticManager.lambda$onDiagnoseFinished$8(this.b);
    }
}
