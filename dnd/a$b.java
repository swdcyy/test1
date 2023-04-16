package dnd.a$b;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$d;
import dnd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import wvc.a;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.v3.framework.player.UpdatePlayerStateAction;
import com.yxcorp.gifshow.v3.framework.player.UpdateTo;
import nsd.u;
import xvc.b;

public final class a$b extends VideoSDKPlayerView$d	// class@000ce2
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object[] objArray;
       Object obj = PatchProxy.apply(null, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String str = "SubtitleVideoPlayerViewBinder";
       if (!this.a.E().isPlaying()) {
          objArray = new Object[0];
          a.D().w(str, "onSingleTapUp, playerView play", objArray);
          this.a.G().t0(new UpdatePlayerStateAction(true, null, 2, null));
       }else {
          objArray = new Object[0];
          a.D().w(str, "onSingleTapUp, playerView pause", objArray);
          this.a.G().t0(new UpdatePlayerStateAction(0, null, 2, null));
       }
       return 0;
    }
}
