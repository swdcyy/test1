package gi9.b$b;
import java.lang.Runnable;
import gi9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import lnc.a1;
import q87.c;

public final class b$b implements Runnable	// class@0024a7
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("VPController", "initAfterResume cost:"+a1.o(this.b.p), objArray);
       return;
    }
}
