package bc9.b$c;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import bc9.b;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import j8c.a;
import w46.b;

public final class b$c implements IMediaPlayer$OnErrorListener	// class@0003d4
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public final boolean onError(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(b$c.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b$c.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       Object[] objArray = new Object[0];
       a.D().t(this.b.b, "mediaPlayer prepare false", objArray);
       return 0;
    }
}
