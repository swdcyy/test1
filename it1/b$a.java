package it1.b$a;
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

public final class b$a extends a$b	// class@002994
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       this.a.k = MultiPkGameState.IDLE;
       return;
    }
    public boolean d(Message p0){
       b$a ta;
       Message obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.what;
       if (obj != 2) {
          if (obj != 3) {
             return false;
          }
          ta = this.a;
          return ta.u(ta.i, MultiPkGameState.IDLE, MultiPkGameState.PUNISH, p0.obj);
       }else {
          ta = this.a;
          return ta.u(ta.h, MultiPkGameState.IDLE, MultiPkGameState.VOTE, p0.obj);
       }
    }
}
