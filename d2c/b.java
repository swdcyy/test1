package d2c.b;
import c2c.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import java.lang.Number;
import com.kwai.video.wayne.player.main.PlayerState;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;

public final class b extends f	// class@0020b7
{
    public long x;
    public boolean y;

    public void b(){
       super();
    }
    public boolean P8(){
       return (this.y ^ 0x01);
    }
    public boolean Y8(){
       return true;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       super.j8();
       Object obj = this.r8("PROFILE_PREVIEW_VIDEO_PROGRESS");
       a.o(obj, "inject\(AccessIds.PROFILE_PREVIEW_VIDEO_PROGRESS\)");
       this.x = obj.longValue();
       return;
    }
    public void r0(PlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "state");
       super.r0(p0);
       if (p0 == PlayerState.Prepared && this.y == null) {
          this.y = true;
          IWaynePlayer iWaynePlayer = this.V8();
          if (iWaynePlayer != null) {
             iWaynePlayer.seekTo(this.x);
          }
       }
       return;
    }
}
