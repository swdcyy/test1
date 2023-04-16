package a58.e$a;
import java.lang.Runnable;
import a58.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.mini.engine.EngineCallback;
import java.lang.RuntimeException;
import java.lang.Throwable;

public class e$a implements Runnable	// class@000030
{
    public final boolean b;
    public final e c;

    public void e$a(e p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       if (this.b != null) {
          this.c.b.success();
       }else {
          this.c.b.failed(new RuntimeException());
       }
       return;
    }
}
