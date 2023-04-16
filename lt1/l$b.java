package lt1.l$b;
import androidx.lifecycle.Observer;
import lt1.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.plugin.live.widget.LiveNoShrinkTextView;

public final class l$b implements Observer	// class@003034
{
    public final l b;

    public void l$b(l p0){
       this.b = p0;
       super();
    }
    public final void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$b.class, "1")) {
          return;
       }
       b.Z(LiveCommonLogTag.MULTI_PK, "resetCountDownTexView");
       p0 = this.b.u;
       if (p0 != null) {
          p0.b();
       }
       return;
    }
}
