package b56.g;
import java.lang.Runnable;
import com.kwai.feed.player.ui.KwaiXfControlPanel;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.player.core.b;

public final class g implements Runnable	// class@000403
{
    public final KwaiXfControlPanel b;

    public void g(KwaiXfControlPanel p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       tb.n("time to switch");
       if (tb.z == null) {
          KwaiXfControlPanel c = tb.c;
          if (c != null) {
             if (c.isPlaying()) {
                tb.v(false);
             }else {
                tb.n("player no playing, abort");
             }
          }
       }
       return;
    }
}
