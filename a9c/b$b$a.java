package a9c.b$b$a;
import java.util.concurrent.Executor;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import a9c.b$a;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b$b$a implements Executor	// class@0000ad
{
    public final Handler b;

    public void b$b$a(){
       super();
       this.b = new Handler(Looper.getMainLooper());
    }
    public void b$b$a(b$a p0){
       super();
       this.b = new Handler(Looper.getMainLooper());
    }
    public void execute(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b$a.class, "1")) {
          return;
       }
       this.b.post(p0);
       return;
    }
}
