package a0.u;
import java.lang.Runnable;
import aegon.chrome.base.TraceEvent$b;
import java.lang.Object;

public final class u implements Runnable	// class@000035
{
    public final TraceEvent$b b;

    public void u(TraceEvent$b p0){
       this.b = p0;
    }
    public final void run(){
       this.b.c();
    }
}
