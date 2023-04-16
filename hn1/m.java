package hn1.m;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailLivePlayerCardViewController;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hn1.c0;
import hn1.g$a;
import hn1.g;

public final class m implements View$OnClickListener	// class@00273a
{
    public final LiveHotSpotDetailLivePlayerCardViewController b;

    public void m(LiveHotSpotDetailLivePlayerCardViewController p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       this.b.V2().v0(g$a.a);
       return;
    }
}
