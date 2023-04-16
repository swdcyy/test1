package hn1.v;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailPhotoPlayerCardViewController;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hn1.e0;
import hn1.g$a;
import hn1.g;

public final class v implements View$OnClickListener	// class@002743
{
    public final LiveHotSpotDetailPhotoPlayerCardViewController b;

    public void v(LiveHotSpotDetailPhotoPlayerCardViewController p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       this.b.W2().v0(g$a.a);
       return;
    }
}
