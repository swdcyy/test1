package g31.g;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.topbar.LiveAudienceTopBarPresenter$3;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.live.audience.component.topbar.LiveAudienceTopBarPresenter;
import android.view.ViewGroup;
import java.lang.Integer;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import jv1.b;
import com.kuaishou.live.common.core.basic.optimizeui.ViewElement;
import android.view.View;
import ea1.b;

public final class g implements Runnable	// class@00240e
{
    public final LiveAudienceTopBarPresenter$3 b;

    public void g(LiveAudienceTopBarPresenter$3 p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       Objects.requireNonNull(tb);
       b.c0(LiveLogTag.LIVE_TOP_BAR, "LiveViewChoreographer invoke show", "topBar current visibility", Integer.valueOf(tb.b.O.getVisibility()));
       if (tb.b.O.getVisibility() && !tb.b.X.H2()) {
          b.a(tb.b.O, ViewElement.TOP_BAR);
       }
       return;
    }
}
