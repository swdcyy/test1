package foa.b$b;
import mx6.c;
import foa.b;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.video.wayne.player.main.PlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mx6.b;
import com.kwai.video.wayne.player.main.IWaynePlayer;

public final class b$b implements c	// class@0029a3
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void onInfo(IMediaPlayer p0,int p1,int p2){
    }
    public void r0(PlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       a.p(p0, "state");
       b.c(this, p0);
       if (p0 == PlayerState.Prepared) {
          IWaynePlayer iWaynePlayer = this.b.P8();
          if (iWaynePlayer != null && !iWaynePlayer.isPlaying()) {
             b$b tb = this.b;
             if (tb.q != null) {
                tb.V8();
             }
          }
       }
       return;
    }
    public void w(boolean p0){
       b.b(this, p0);
    }
}
