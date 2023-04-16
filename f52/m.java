package f52.m;
import erd.g;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.f;
import java.lang.Object;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.LiveCloseEndAutoSlideFeedResponse;
import java.util.Objects;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;

public final class m implements g	// class@002892
{
    public final f b;

    public void m(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (!q.f(p0.getFeedList())) {
          if (tb.D == null) {
             tb.D = new ArrayList();
          }
          tb.D.clear();
          tb.D.addAll(p0.getFeedList());
       }
       return;
    }
}
