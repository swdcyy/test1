package f43.c$f$a;
import f43.b$b;
import f43.c$f;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import brd.g;
import java.util.Set;
import com.kuaishou.live.gameinteractive.auth.model.GameLiveAuthInfo;
import java.util.Collections;
import f43.c;

public class c$f$a implements b$b	// class@002870
{
    public final v a;
    public final c$f b;

    public void c$f$a(c$f p0,v p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$f$a.class, "2")) {
          return;
       }
       this.a.onNext(Integer.valueOf(3));
       this.a.onComplete();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, c$f$a.class, "1")) {
          return;
       }
       this.a.onNext(Integer.valueOf(2));
       c$f$a tb = this.b;
       c$f h = tb.h;
       c$f e = tb.e;
       c$f c = (tb.d != null)? tb.c: tb.b.c(tb.c);
       c$f$a tb1 = this.b;
       Set set = (tb1.d != null)? Collections.emptySet(): tb1.c;
       h.a(e, c, set);
       this.a.onComplete();
       return;
    }
}
