package it1.b$b;
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

public final class b$b extends a$b	// class@002995
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       this.a.k = MultiPkGameState.POST_PUNISH;
       return;
    }
    public boolean d(Message p0){
       b$b obj = PatchProxy.applyOneRefs(p0, this, b$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.what != 1) {
          return false;
       }
       obj = this.a;
       return obj.u(obj.g, MultiPkGameState.POST_PUNISH, MultiPkGameState.IDLE, p0.obj);
    }
}
