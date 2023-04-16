package hn1.y;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailPhotoPlayerCardViewController;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import in1.f;
import hn1.a0$a;
import io.reactivex.subjects.PublishSubject;

public final class y implements IMediaPlayer$OnCompletionListener	// class@002746
{
    public final LiveHotSpotDetailPhotoPlayerCardViewController b;

    public void y(LiveHotSpotDetailPhotoPlayerCardViewController p0){
       this.b = p0;
       super();
    }
    public final void onCompletion(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
          return;
       }
       LiveHotSpotDetailPhotoPlayerCardViewController l = this.b.l;
       if (l != null) {
          l.a();
       }
       y tb = this.b;
       tb.l = null;
       tb.o.onNext(a0$a.a);
       return;
    }
}
