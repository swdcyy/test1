package b56.m;
import erd.g;
import com.kwai.feed.player.ui.KwaiXfControlPanel;
import java.lang.Object;
import com.kwai.framework.player.helper.f$a;
import b56.f0;

public final class m implements g	// class@00040c
{
    public final KwaiXfControlPanel b;

    public void m(KwaiXfControlPanel p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       tb.k = p0;
       if (tb.G == null && (tb.A == null || tb.H == null)) {
          tb.f.f(p0.a, tb.getPanelDisplayDurationMs());
       }
       return;
    }
}
