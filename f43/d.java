package f43.d;
import f43.b$b;
import f43.c$b;
import com.kuaishou.live.gameinteractive.auth.model.GameLiveAuthInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gameinteractive.auth.model.a;
import java.util.Set;
import java.util.Collections;
import f43.c;

public class d implements b$b	// class@002874
{
    public final GameLiveAuthInfo a;
    public final c$b b;

    public void d(c$b p0,GameLiveAuthInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       d tb = this.b;
       c$b e = tb.e;
       c$b b = tb.b;
       GameLiveAuthInfo b1 = this.a.b;
       a b2 = (b1 != null)? b1.b: Collections.emptySet();
       GameLiveAuthInfo c = this.a.c;
       a b3 = (c != null)? c.b: Collections.emptySet();
       e.a(b, b2, b3);
       return;
    }
}
