package bo.h;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;

public final class h implements Runnable	// class@0002a5
{
    public final long b;
    public final boolean c;

    public void h(long p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       Aegon.nativeSetLoggingCallback(this.b, this.c);
    }
}
