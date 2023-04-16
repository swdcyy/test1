package b56.u;
import z46.f$a;
import com.kwai.feed.player.ui.KwaiXfPlayerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class u implements f$a	// class@000414
{
    public final KwaiXfPlayerView a;

    public void u(KwaiXfPlayerView p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, u.class, "2")) {
          return;
       }
       this.a.c(0, 0);
       this.a.f();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       this.a.c(0, true);
       return;
    }
}
