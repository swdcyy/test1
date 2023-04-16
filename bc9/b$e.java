package bc9.b$e;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import bc9.b;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.kwai.video.player.KsMediaPlayer;

public final class b$e implements IMediaPlayer$OnCompletionListener	// class@0003d6
{
    public final b b;

    public void b$e(b p0){
       this.b = p0;
       super();
    }
    public final void onCompletion(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s(this.b.b, "onCompletion .", objArray);
       b x = this.b.x;
       if (x != null) {
          x.seekTo(0);
       }
       x = this.b.x;
       if (x != null) {
          x.start();
       }
       x = this.b.x;
       if (x != null) {
          x.setVolume(0x3f800000, 0x3f800000);
       }
       return;
    }
}
