package gz9.m$a;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import gz9.m;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class m$a implements IMediaPlayer$OnCompletionListener	// class@002522
{
    public final m b;

    public void m$a(m p0){
       this.b = p0;
       super();
    }
    public final void onCompletion(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       this.b.o0();
       return;
    }
}
