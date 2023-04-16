package bc9.b$f;
import java.lang.Runnable;
import com.kwai.video.player.KsMediaPlayer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b$f implements Runnable	// class@0003d7
{
    public final KsMediaPlayer b;

    public void b$f(KsMediaPlayer p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$f.class, "1")) {
          return;
       }
       this.b.release();
       return;
    }
}
