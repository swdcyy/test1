package xq.b;
import java.lang.Runnable;
import tq.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Exception;

public class b implements Runnable	// class@002818
{
    public final d b;
    public final Runnable c;

    public void b(d p0,Runnable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       try{
          this.c.run();
       }catch(java.lang.Exception e0){
          this.b.a(e0);
       }
       return;
    }
}
