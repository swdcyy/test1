package it1.b$c;
import w12.a$b;
import it1.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.pk.MultiPkGameState;
import android.os.Message;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class b$c extends a$b	// class@002996
{
    public final b a;

    public void b$c(b p0){
       this.a = p0;
       super();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "1")) {
          return;
       }
       this.a.k = MultiPkGameState.PUNISH;
       return;
    }
    public boolean d(Message p0){
       b$c ta;
       Message obj = PatchProxy.applyOneRefs(p0, this, b$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.what;
       if (obj != 1) {
          if (obj != 5) {
             return false;
          }
          ta = this.a;
          return ta.u(ta.j, MultiPkGameState.PUNISH, MultiPkGameState.POST_PUNISH, p0.obj);
       }else {
          ta = this.a;
          return ta.u(ta.g, MultiPkGameState.PUNISH, MultiPkGameState.IDLE, p0.obj);
       }
    }
}
