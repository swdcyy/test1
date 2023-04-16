package b56.k;
import com.kwai.framework.player.core.b$b;
import com.kwai.feed.player.ui.KwaiXfControlPanel;
import java.lang.Object;
import android.widget.FrameLayout;

public final class k implements b$b	// class@00040a
{
    public final KwaiXfControlPanel b;

    public void k(KwaiXfControlPanel p0){
       this.b = p0;
    }
    public final void d(int p0){
       k tb = this.b;
       tb.x(p0);
       if (p0 == 3) {
          if (!tb.u.getVisibility()) {
             tb.r();
          }
       }else {
          tb.t();
       }
       return;
    }
}
