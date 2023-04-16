package l09.d$f;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import l09.d;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import yx.j0;

public final class d$f implements IMediaPlayer$OnErrorListener	// class@002c68
{
    public final d b;

    public void d$f(d p0){
       this.b = p0;
       super();
    }
    public final boolean onError(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(d$f.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, d$f.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       Object[] objArray = new Object[0];
       j0.c("PopPlayVideoPresenter", "Player error "+p1+' '+p2, objArray);
       this.b.R8();
       return 0;
    }
}
