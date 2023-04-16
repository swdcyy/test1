package hn1.l;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailLivePlayerCardViewController;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotLiveViewData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hn1.b$a;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kuaishou.live.viewcontroller.ViewController;
import ln1.b;
import brd.y;

public final class l implements Observer	// class@002739
{
    public final LiveHotSpotDetailLivePlayerCardViewController b;

    public void l(LiveHotSpotDetailLivePlayerCardViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.o.onNext(new b$a(p0, this.b.P2()));
       }
       return;
    }
}
