package c8a.b$c;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import c8a.b;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class b$c implements IMediaPlayer$OnInfoListener	// class@000572
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(b$c.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b$c.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       b$c tb = this.b;
       if (tb.v != null && p1 == 0x2775) {
          p1 = tb.u + 1;
          tb.u = p1;
          if (p1 == 3) {
             tb.R8();
          }
       }
       return false;
    }
}
