package as1.k$c;
import as1.k$d;
import as1.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleState;
import android.os.Message;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class k$c extends k$d	// class@0002a3
{
    public final k b;

    public void k$c(k p0){
       this.b = p0;
       super(p0);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, k$c.class, "1")) {
          return;
       }
       this.b.i = LiveMultiLinePuzzleState.IDLE;
       return;
    }
    public boolean d(Message p0){
       boolean b;
       k$c tb;
       Object obj = PatchProxy.applyOneRefs(p0, this, k$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "msg");
       p0 = p0.what;
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                b = false;
             }else {
                tb = this.b;
                b = tb.v(tb.f, tb.h);
             }
          }else {
             tb = this.b;
             b = tb.v(tb.f, tb.g);
          }
       }else {
          tb = this.b;
          b = tb.v(tb.f, tb.g);
       }
       return b;
    }
    public LiveMultiLinePuzzleState e(){
       return LiveMultiLinePuzzleState.IDLE;
    }
}
