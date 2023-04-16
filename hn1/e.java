package hn1.e;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaViewController;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import hn1.h0;
import hn1.g0;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.recyclerview.widget.h$b;
import u2.f;

public final class e implements Observer	// class@002728
{
    public final LiveHotSpotDetailCoreMediaViewController b;
    public final LiveHotSpotDetailCoreMediaAdapter c;

    public void e(LiveHotSpotDetailCoreMediaViewController p0,LiveHotSpotDetailCoreMediaAdapter p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, e.class, "1")) {
       }else if(obj != null){
          p0 = this.b.k;
          if (p0 == null) {
             a.S("playManager");
          }
          p0.d();
          e tc = this.c;
          ViewControllerAdapter.J0(tc, obj, new g0(tc.L0(), obj), null, false, 12, null);
       }
       return;
    }
}
