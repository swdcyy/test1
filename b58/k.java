package b58.k;
import java.lang.Runnable;
import com.mini.engine.EngineCallback;
import java.lang.Object;

public final class k implements Runnable	// class@000305
{
    public final EngineCallback b;

    public void k(EngineCallback p0){
       this.b = p0;
    }
    public final void run(){
       this.b.success();
    }
}
