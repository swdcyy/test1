package f6a.g$b;
import mx6.c;
import f6a.g;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import mx6.b;
import com.kwai.video.wayne.player.main.PlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import f6a.f;

public final class g$b implements c	// class@0022d2
{
    public final g b;

    public void g$b(g p0){
       this.b = p0;
       super();
    }
    public void onInfo(IMediaPlayer p0,int p1,int p2){
       b.a(this, p0, p1, p2);
    }
    public void r0(PlayerState p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g$b.class, "1")) {
          return;
       }
       a.p(p0, "state");
       g$b tb = this.b;
       IWaynePlayer iWaynePlayer = tb.k9();
       boolean b = true;
       if (iWaynePlayer == null || iWaynePlayer.isPlaying() != b) {
          b = false;
       }
       tb.b9(b);
       PatchProxy.onMethodExit(g$b.class, "1");
       return;
    }
    public void w(boolean p0){
       b.b(this, p0);
    }
}
