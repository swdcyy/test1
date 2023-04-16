package hn1.n;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailLivePlayerCardViewController;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import hn1.c0;
import hn1.g$c;
import hn1.g;

public final class n implements LivePlayerStateChangeListener	// class@00273b
{
    public final LiveHotSpotDetailLivePlayerCardViewController b;

    public void n(LiveHotSpotDetailLivePlayerCardViewController p0){
       this.b = p0;
       super();
    }
    public final void onStateChange(LivePlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       a.p(p0, "it");
       c0 uoc0 = this.b.V2();
       boolean b = (p0 == LivePlayerState.PLAYING)? true: false;
       uoc0.v0(new g$c(b));
       return;
    }
}
