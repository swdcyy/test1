package kn1.j;
import erd.g;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewModel;
import java.util.List;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailNavigatorModel$RollHotspots;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import zh3.c;
import yh3.a;

public final class j implements g	// class@002d76
{
    public final LiveHotSpotDetailBottomNavigatorViewModel b;
    public final List c;

    public void j(LiveHotSpotDetailBottomNavigatorViewModel p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          p0 = this.c;
          j tb = this.b;
          LiveHotSpotDetailBottomNavigatorViewModel g = tb.g;
          tb.g = g + 1;
          tb = this.b;
          tb.s0(tb.w0()).q(p0.get((g % p0.size())));
       }
       return;
    }
}
