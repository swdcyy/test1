package b65.d;
import java.lang.Runnable;
import com.kwai.camerasdk.Daenerys;
import java.lang.Object;

public final class d implements Runnable	// class@000349
{
    public final Daenerys b;

    public void d(Daenerys p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       tb.nativeExecuteRenderThreadRunnable(tb.c);
    }
}
