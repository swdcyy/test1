package bh.g$a;
import java.util.concurrent.FutureTask;
import bh.g;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bh.e;
import java.lang.Throwable;

public class g$a extends FutureTask	// class@000b33
{
    public final g b;

    public void g$a(g p0,Callable p1){
       this.b = p0;
       super(p1);
    }
    public void done(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "1")) {
          return;
       }
       if (this.isCancelled()) {
          return;
       }
       try{
          this.b.c(this.get());
       label_002c :
          return;
       }catch(java.lang.InterruptedException e0){
       }catch(java.util.concurrent.ExecutionException e0){
       }
       this.b.c(new e(e0));
       goto label_002c ;
    }
}
