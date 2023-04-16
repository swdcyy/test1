package djc.f1$d;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class f1$d implements IMediaPlayer$OnInfoListener	// class@0021ed
{
    public static final f1$d b;

    static {
       f1$d.b = new f1$d();
    }
    public void f1$d(){
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(f1$d.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, f1$d.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       return false;
    }
}
