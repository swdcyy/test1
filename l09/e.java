package l09.e;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import l09.d;
import com.kwai.framework.player.core.b;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class e implements IMediaPlayer$OnPreparedListener	// class@002c6b
{
    public final d b;
    public final b c;

    public void e(d p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       if (this.b.t == null) {
          this.c.start();
       }
       return;
    }
}
