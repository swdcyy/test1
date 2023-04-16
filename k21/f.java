package k21.f;
import oq5.c;
import k21.k;
import java.lang.Object;
import android.content.res.Configuration;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.b5;
import tj3.k;
import tj3.e;
import t02.a0;
import yx2.r;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;

public final class f implements c	// class@002c6a
{
    public final k b;

    public void f(k p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       k r;
       f tb = this.b;
       Objects.requireNonNull(tb);
       k ok = null;
       boolean b = (p0.orientation == 2)? true: false;
       tb.R8(b);
       tb.P8();
       if (b) {
          if (!b5.a(tb.getActivity())) {
             k ok1 = tb.s.x();
             ok1.Q = ok1.Q + 1;
          }
          if (!r.c(tb.r)) {
             r = tb.r;
             r.B.onSwitchOrientation(b, r.c, 1);
          }
       }else if(!r.c(tb.r)){
          r = tb.r;
          r.B.onSwitchOrientation(b, r.c, ok);
       }
       return;
    }
}
