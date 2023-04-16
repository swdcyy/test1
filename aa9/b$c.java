package aa9.b$c;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import aa9.b;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import aa9.f;

public final class b$c implements IMediaPlayer$OnPreparedListener	// class@00006d
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public final void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       Iterator iterator = this.b.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPrepared(p0);
       }
       return;
    }
}
