package as1.k$e;
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

public final class k$e extends k$d	// class@0002a5
{
    public final k b;

    public void k$e(k p0){
       this.b = p0;
       super(p0);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, k$e.class, "1")) {
          return;
       }
       this.b.i = LiveMultiLinePuzzleState.QUESTION;
       return;
    }
    public boolean d(Message p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, k$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "msg");
       if (p0.what != 3) {
          b = false;
       }else {
          k$e tb = this.b;
          b = tb.v(tb.g, tb.h);
       }
       return b;
    }
    public LiveMultiLinePuzzleState e(){
       return LiveMultiLinePuzzleState.QUESTION;
    }
}
