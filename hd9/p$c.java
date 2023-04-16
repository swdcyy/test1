package hd9.p$c;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import hd9.p;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.followshoot.f;
import com.yxcorp.gifshow.camera.record.followshoot.f$c;

public final class p$c implements IMediaPlayer$OnErrorListener	// class@002622
{
    public final p b;

    public void p$c(p p0){
       this.b = p0;
       super();
    }
    public final boolean onError(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(p$c.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, p$c.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       p$c tb = this.b;
       p c = tb.c;
       boolean b = true;
       if (c == null || c.a(tb, p1, p2) != b) {
          b = false;
       }
       return b;
    }
}
