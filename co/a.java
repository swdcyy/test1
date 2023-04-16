package co.a;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.aegon.diagnostic.DiagnosticManager;

public final class a implements Runnable	// class@000321
{
    public final int b;

    public void a(int p0){
       this.b = p0;
    }
    public final void run(){
       DiagnosticManager.lambda$setDialUrlSelectionTimeRange$4(this.b);
    }
}
