package bo.d;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;

public final class d implements Runnable	// class@0002a2
{
    public final boolean b;

    public void d(boolean p0){
       this.b = p0;
    }
    public final void run(){
       Aegon.nativeSetLoggingCallback(0, this.b);
    }
}
