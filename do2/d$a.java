package do2.d$a;
import java.lang.Runnable;
import do2.d;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import do2.a;

public final class d$a implements Runnable	// class@002564
{
    public final d b;
    public final String c;

    public void d$a(d p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       d$a tb = this.b;
       tb.a.c(tb.b, true, "onError , message "+this.c);
       return;
    }
}
