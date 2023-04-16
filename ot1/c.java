package ot1.c;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.vc.score.LiveMultiPkProgressBarDefaultController;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;

public final class c implements Observer	// class@00357e
{
    public final LiveMultiPkProgressBarDefaultController b;

    public void c(LiveMultiPkProgressBarDefaultController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          b.Z(LiveCommonLogTag.MULTI_PK, "update punish state:"+p0);
          a.o(p0, "it");
          this.b.w = p0.booleanValue();
       }
       return;
    }
}
