package djc.f1$a$a;
import java.lang.Runnable;
import djc.f1$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import djc.f1;

public final class f1$a$a implements Runnable	// class@0021e7
{
    public final f1$a b;

    public void f1$a$a(f1$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, f1$a$a.class, "1")) {
          return;
       }
       this.b.b.f();
       this.b.b.e();
       PatchProxy.onMethodExit(f1$a$a.class, "1");
       return;
    }
}
