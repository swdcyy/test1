package a1b.b$b;
import java.util.concurrent.Executor;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import a1b.b$a;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b$b implements Executor	// class@000015
{
    public final Handler b;

    public void b$b(){
       super();
       this.b = new Handler(Looper.getMainLooper());
    }
    public void b$b(b$a p0){
       super();
       this.b = new Handler(Looper.getMainLooper());
    }
    public void execute(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       this.b.post(p0);
       return;
    }
}
