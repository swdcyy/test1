package gz9.m$b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import gz9.m;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class m$b implements IMediaPlayer$OnInfoListener	// class@002523
{
    public final m b;

    public void m$b(m p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(m$b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, m$b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "<anonymous parameter 0>");
       if (p1 == 3 && this.b.n0()) {
          this.b.p0();
       }
       return false;
    }
}
