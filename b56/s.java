package b56.s;
import com.kwai.framework.player.core.b$a;
import com.kwai.feed.player.ui.KwaiXfPlayerView;
import java.lang.Object;
import java.util.Objects;
import z46.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class s implements b$a	// class@000412
{
    public final KwaiXfPlayerView a;

    public void s(KwaiXfPlayerView p0){
       this.a = p0;
    }
    public final void a(){
       KwaiXfPlayerView o = this.a.o;
       Objects.requireNonNull(o);
       if (PatchProxy.applyVoid(null, o, f.class, "2")) {
       }else {
          o.c(true);
       }
       return;
    }
}
