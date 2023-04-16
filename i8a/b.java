package i8a.b;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import hn5.i0;
import java.lang.Throwable;

public final class b implements Runnable	// class@0027c1
{
    public final long b;

    public void b(long p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("CaptionLogger", "[logTagShowCost]["+this.b+']', objArray);
       i0.b("CaptionLoggerCost", String.valueOf(this.b));
       return;
    }
}
