package knd.i;
import com.yxcorp.gifshow.player.KsAudioPlayer$c;
import knd.h;
import java.lang.Object;
import com.yxcorp.gifshow.player.KsAudioPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import knd.j$a;

public final class i implements KsAudioPlayer$c	// class@0017e5
{
    public final h a;

    public void i(h p0){
       this.a = p0;
       super();
    }
    public final void a(KsAudioPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TTSAuditionManagerV2", "onPlayCompleted: using KSAudioPlayer", objArray);
       h h = this.a.h;
       if (h != null) {
          h.n();
       }
       i ta = this.a;
       ta.h = null;
       h = ta.l;
       if (h != null) {
          h.c();
       }
       return;
    }
}
