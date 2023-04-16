package m02.b1;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import java.lang.Object;

public final class b1 implements Runnable	// class@0030ac
{
    public final LivePlayLoader b;

    public void b1(LivePlayLoader p0){
       this.b = p0;
    }
    public final void run(){
       this.b.a();
    }
}
