package bc9.b$d;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import bc9.b;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b$d implements IMediaPlayer$OnPreparedListener	// class@0003d5
{
    public final b b;

    public void b$d(b p0){
       this.b = p0;
       super();
    }
    public final void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "1")) {
          return;
       }
       b$d tb = this.b;
       if (tb.u != null) {
          tb.r();
       }else {
          tb.i();
       }
       return;
    }
}
