package co.f;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.aegon.diagnostic.DiagnosticManager;

public final class f implements Runnable	// class@000326
{
    public final boolean b;

    public void f(boolean p0){
       this.b = p0;
    }
    public final void run(){
       DiagnosticManager.lambda$setEnable$0(this.b);
    }
}
