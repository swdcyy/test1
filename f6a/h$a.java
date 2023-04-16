package f6a.h$a;
import gc6.k;
import f6a.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import p5a.e;
import kotlin.jvm.internal.a;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.b;

public final class h$a implements k	// class@0022d5
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public final void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, h$a.class, "1")) {
          return;
       }
       h$a tb = this.b;
       Objects.requireNonNull(tb);
       h oh = PatchProxy.applyWithListener(objArray, tb, h.class, "2");
       if (oh != PatchProxyResult.class) {
       }else {
          oh = tb.K;
          if (oh == null) {
             a.S("mMediaPlayer");
          }
          PatchProxy.onMethodExit(h.class, "2");
       }
       IKwaiMediaPlayer iKwaiMediaPl = oh.getIKwaiMediaPlayer();
       if (iKwaiMediaPl != null) {
          iKwaiMediaPl.setInteractiveMode(2);
       }
       PatchProxy.onMethodExit(h$a.class, "1");
       return;
    }
}
