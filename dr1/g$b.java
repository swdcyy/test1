package dr1.g$b;
import w12.a$b;
import dr1.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import android.os.Message;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;

public final class g$b extends a$b	// class@002007
{
    public final g a;

    public void g$b(g p0){
       this.a = p0;
       super();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, g$b.class, "1")) {
          return;
       }
       this.a.i = LiveMultiLineArenaLiveState.IDLE;
       return;
    }
    public boolean d(Message p0){
       g$b ta;
       Integer obj = PatchProxy.applyOneRefs(p0, this, g$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = (p0 != null)? Integer.valueOf(p0.what): null;
       if (obj != null && obj.intValue() == 1) {
          ta = this.a;
          ta.v(ta.g, LiveMultiLineArenaLiveState.IDLE, LiveMultiLineArenaLiveState.SHOWING, p0.obj);
          return true;
       }else {
          g og = 2;
          if (obj != null && obj.intValue() == og) {
             ta = this.a;
             ta.v(ta.h, LiveMultiLineArenaLiveState.IDLE, LiveMultiLineArenaLiveState.SHOW_END, p0.obj);
             return true;
          }else {
             return false;
          }
       }
    }
}