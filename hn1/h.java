package hn1.h;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailLivePlayerCardViewController;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotLiveViewData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hn1.b$b;
import kotlin.jvm.internal.a;
import ln1.b;
import brd.y;

public final class h implements Observer	// class@002735
{
    public final LiveHotSpotDetailLivePlayerCardViewController b;

    public void h(LiveHotSpotDetailLivePlayerCardViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.o.onNext(new b$b(p0));
       }
       return;
    }
}
