package in1.f$a;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import in1.f;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import px6.b;
import px6.a;
import mx6.a;

public final class f$a implements IMediaPlayer$OnPreparedListener	// class@002963
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public final void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       f$a tb = this.b;
       tb.b = true;
       if (tb.a != null) {
          a uoa = tb.c.getPlayerKitContext().e(a.class);
          if (uoa != null) {
             uoa.start();
          }
       }
       return;
    }
}
