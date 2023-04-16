package hd9.p$f;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import hd9.p;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.followshoot.f$d;

public final class p$f implements IMediaPlayer$OnInfoListener	// class@002625
{
    public final p b;

    public void p$f(p p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(p$f.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, p$f.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       p g = this.b.g;
       if (g != null) {
          g.onInfo(p1, p2);
       }
       return true;
    }
}
