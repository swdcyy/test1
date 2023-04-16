package a58.e;
import java.lang.Runnable;
import com.mini.app.installer.b;
import com.mini.engine.EngineCallback;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k68.a;
import com.mini.app.runtime.f;
import k68.o;
import p68.b;
import a58.e$a;
import zi8.d1;

public class e implements Runnable	// class@000031
{
    public final EngineCallback b;
    public final b c;

    public void e(b p0,EngineCallback p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       o oo = null;
       if (this.c.e()) {
          oo = (a.d.b().R.e())? this.c.d(): this.c.c();
       }
    label_0030 :
       d1.f(new e$a(this, oo));
       return;
    }
}
