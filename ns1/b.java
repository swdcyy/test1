package ns1.b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkTeamFrameView;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ns1.e;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;

public final class b implements Observer	// class@0033b1
{
    public final LiveMultiPkTeamFrameView b;

    public void b(LiveMultiPkTeamFrameView p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          b.P(e.a, "refresh background "+p0);
          a.o(p0, "it");
          this.b.a(p0);
       }
       return;
    }
}
