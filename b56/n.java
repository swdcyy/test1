package b56.n;
import erd.g;
import com.kwai.feed.player.ui.KwaiXfControlPanel;
import android.widget.ProgressBar;
import java.lang.Object;
import com.kwai.framework.player.helper.f$a;
import java.util.Objects;
import b56.z;

public final class n implements g	// class@00040d
{
    public final KwaiXfControlPanel b;
    public final ProgressBar c;

    public void n(KwaiXfControlPanel p0,ProgressBar p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       n tb = this.b;
       n tc = this.c;
       Objects.requireNonNull(tb);
       int i = z.a(p0.a, tb.getPanelDisplayDurationMs(), tc.getMax());
       if (!i) {
       }else {
          tc.setProgress(i);
       }
       return;
    }
}
