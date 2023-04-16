package as1.h;
import erd.g;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleModel;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class h implements g	// class@00029e
{
    public final LiveMultiLinePuzzleModel b;

    public void h(LiveMultiLinePuzzleModel p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          b.W(this.b.a, "roomInfoError", p0);
       }
       return;
    }
}
