package b56.v;
import z46.i$b;
import com.kwai.feed.player.ui.KwaiXfPlayerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class v implements i$b	// class@000415
{
    public final KwaiXfPlayerView a;

    public void v(KwaiXfPlayerView p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       this.a.g("onPlayerDied");
       v ta = this.a;
       ta.l = true;
       ta.b();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, v.class, "2")) {
          return;
       }
       this.a.g("onPlayerWorkHint");
       v ta = this.a;
       ta.l = false;
       ta.b();
       return;
    }
}
