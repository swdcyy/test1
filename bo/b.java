package bo.b;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;

public final class b implements Runnable	// class@0002a1
{
    public final boolean b;

    public void b(boolean p0){
       this.b = p0;
    }
    public final void run(){
       Aegon.nativeSetDebug(this.b);
    }
}
