package g0.d;
import java.lang.Runnable;
import java.lang.Object;
import android.os.Process;

public final class d implements Runnable	// class@002023
{
    public final Runnable b;

    public void d(Runnable p0){
       this.b = p0;
    }
    public final void run(){
       Process.setThreadPriority(10);
       this.b.run();
    }
}
