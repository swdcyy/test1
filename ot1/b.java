package ot1.b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class b implements Observer	// class@00357d
{
    public final LiveMultiPkProgressBarDefaultController b;

    public void b(LiveMultiPkProgressBarDefaultController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.x = p0.longValue();
       }
       return;
    }
}
