package hn1.x;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailPhotoPlayerCardViewController;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import com.kuaishou.live.viewcontroller.ViewController;
import hn1.o;

public final class x implements IMediaPlayer$OnVideoSizeChangedListener	// class@002745
{
    public final LiveHotSpotDetailPhotoPlayerCardViewController b;
    public final KwaiPlayerKitView c;

    public void x(LiveHotSpotDetailPhotoPlayerCardViewController p0,KwaiPlayerKitView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(x.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, x.class, "1")) {
             return;
          }
       }
       o.a(this.c, this.b.P2(), p1, p2);
       return;
    }
}
