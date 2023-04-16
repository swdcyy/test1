package bo.g;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.aegon.Aegon;

public final class g implements Runnable	// class@000318
{
    public final int b;

    public void g(int p0){
       this.b = p0;
    }
    public final void run(){
       Aegon.nativeSetMaxThreadLimit(this.b);
    }
}
