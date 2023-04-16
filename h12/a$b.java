package h12.a$b;
import erd.a;
import com.kuaishou.live.core.voiceparty.b;
import h12.a$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import co2.r;

public final class a$b implements a	// class@002be7
{
    public final b b;
    public final a$c c;

    public void a$b(b p0,a$c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       a$b tb = this.b;
       if (tb != null) {
          tb.b(this.c);
       }
       return;
    }
}
