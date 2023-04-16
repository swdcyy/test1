package h12.a$a;
import erd.g;
import com.kuaishou.live.core.voiceparty.b;
import h12.a$c;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import co2.r;

public final class a$a implements g	// class@002be6
{
    public final b b;
    public final a$c c;

    public void a$a(b p0,a$c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          p0 = this.b;
          if (p0 != null) {
             p0.a(this.c);
          }
       }
       return;
    }
}
