package je.c;
import java.lang.Runnable;
import com.facebook.react.modules.core.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c implements Runnable	// class@0023f5
{
    public final boolean b;
    public final b c;

    public void c(b p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       b f = this.c.f;
       _monitor_enter(f);
       if (this.b != null) {
          this.c.f();
       }else {
          this.c.a();
       }
       _monitor_exit(f);
       return;
    }
}
