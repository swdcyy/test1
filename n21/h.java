package n21.h;
import n21.s;
import n21.f;
import n21.h$b;
import java.lang.Object;
import java.util.HashMap;
import n21.h$a;
import n21.d;
import n21.f$a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import n21.h$c;

public class h	// class@00328e
{
    public final h$b a;
    public final s b;
    public final f c;
    public final Map d;
    public final f$a e;

    public void h(s p0,f p1,h$b p2){
       super();
       this.d = new HashMap();
       h$a uoa = new h$a(this);
       this.e = uoa;
       this.b = p0;
       this.c = p1;
       this.a = p2;
       p1.a(uoa);
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "4")) {
          return;
       }
       h$c uoc = this.d.remove(p0);
       if (uoc != null) {
          uoc.a();
          this.a.c(uoc.b());
       }
       return;
    }
}
