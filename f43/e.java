package f43.e;
import f43.b$b;
import f43.c;
import java.lang.String;
import com.kuaishou.live.gameinteractive.auth.model.GameLiveAuthInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gameinteractive.auth.model.a;
import java.util.Set;
import java.util.Collections;

public class e implements b$b	// class@002875
{
    public final String a;
    public final GameLiveAuthInfo b;
    public final c c;

    public void e(c p0,String p1,GameLiveAuthInfo p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(){
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       e tc = this.c;
       e ta = this.a;
       GameLiveAuthInfo b = this.b.b;
       a b1 = (b != null)? b.b: Collections.emptySet();
       GameLiveAuthInfo c = this.b.c;
       a b2 = (c != null)? c.b: Collections.emptySet();
       tc.a(ta, b1, b2);
       return;
    }
}
