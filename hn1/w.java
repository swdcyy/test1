package hn1.w;
import com.kwai.video.wayne.player.listeners.OnPlayerActualPlayingChangedListener;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailPhotoPlayerCardViewController;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hn1.e0;
import hn1.g$c;
import kotlin.jvm.internal.a;
import hn1.g;

public final class w implements OnPlayerActualPlayingChangedListener	// class@002744
{
    public final LiveHotSpotDetailPhotoPlayerCardViewController a;

    public void w(LiveHotSpotDetailPhotoPlayerCardViewController p0){
       this.a = p0;
       super();
    }
    public final void onChanged(Boolean p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "1")) {
          return;
       }
       a.o(p0, "it");
       this.a.W2().v0(new g$c(p0.booleanValue()));
       return;
    }
}
