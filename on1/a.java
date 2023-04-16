package on1.a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.LiveHotSpotDetailRelatedAnchorsViewController;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;

public final class a implements Observer	// class@003542
{
    public final LiveHotSpotDetailRelatedAnchorsViewController b;

    public void a(LiveHotSpotDetailRelatedAnchorsViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          LiveHotSpotDetailRelatedAnchorsViewController k = this.b.k;
          if (k == null) {
             a.S("adapter");
          }
          a.o(p0, "it");
          k.O0(p0);
       }
       return;
    }
}
