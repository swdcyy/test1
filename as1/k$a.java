package as1.k$a;
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

public final class k$a extends k$d	// class@0002a1
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super(p0);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "1")) {
          return;
       }
       this.b.i = LiveMultiLinePuzzleState.ANSWER;
       return;
    }
    public boolean d(Message p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, k$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "msg");
       if (p0.what != 4) {
          b = false;
       }else {
          k$a tb = this.b;
          b = tb.v(tb.h, tb.f);
       }
       return b;
    }
    public LiveMultiLinePuzzleState e(){
       return LiveMultiLinePuzzleState.ANSWER;
    }
}
