package d5c.k;
import erd.g;
import d5c.g0;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import android.view.View;
import d5c.x;
import java.lang.Runnable;
import ekd.k1;

public final class k implements g	// class@0020fe
{
    public final g0 b;

    public void k(g0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       boolean b = true;
       tb.X = b;
       tb.D.setVisibility(0);
       if (tb.Y == null) {
          tb.Y = b;
          x ox = new x(tb, p0);
          tb.Z = ox;
          k1.r(ox, 100);
       }else {
          tb.u9(p0);
          tb.j9(p0);
          tb.R = false;
       }
       return;
    }
}
