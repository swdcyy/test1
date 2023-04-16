package lu1.q$b;
import java.lang.Runnable;
import lu1.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class q$b implements Runnable	// class@00304a
{
    public final q b;

    public void q$b(q p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, q$b.class, "1")) {
          return;
       }
       q$b tb = this.b;
       tb.s3(tb.E);
       return;
    }
}
