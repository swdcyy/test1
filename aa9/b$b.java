package aa9.b$b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import aa9.b;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Iterable;
import aa9.f;

public final class b$b implements IMediaPlayer$OnInfoListener	// class@00006c
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       Iterator obj;
       if (PatchProxy.isSupport(b$b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b$b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.b.i.iterator();
       while (obj.hasNext()) {
          obj.next().onInfo(p0, p1, p2);
       }
       return false;
    }
}
