package co.e;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.aegon.diagnostic.DiagnosticManager;

public final class e implements Runnable	// class@000325
{
    public final String b;

    public void e(String p0){
       this.b = p0;
    }
    public final void run(){
       DiagnosticManager.lambda$setDialTestConfig$3(this.b);
    }
}
