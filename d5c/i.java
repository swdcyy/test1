package d5c.i;
import erd.g;
import d5c.g0;
import java.lang.Object;
import j5c.d;
import xl8.b;
import java.lang.Boolean;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.profile.tab.DynamicTabHostFragment;
import androidx.fragment.app.Fragment;
import y8c.q;
import androidx.recyclerview.widget.RecyclerView;
import l17.a;
import androidx.recyclerview.widget.RecyclerView$r;

public final class i implements g	// class@0020fa
{
    public final g0 b;

    public void i(g0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       boolean b = tb.w.a().booleanValue();
       tb.d1 = b;
       if (tb.b1 == null) {
          tb.b1 = tb.q.mPhotoTabId;
       }
       if (tb.b1 != 1 || (tb.y == null && b)) {
          b = tb.s.t();
          tb.A = b;
          if (b instanceof q) {
             b = b.h0();
             tb.y = b;
             tb.c1 = a.a(b);
             tb.y.addOnScrollListener(tb.h1);
          }
       }
       return;
    }
}
