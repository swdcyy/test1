package ly0.a;
import erd.g;
import ly0.b;
import java.lang.Object;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;
import vf1.b;

public final class a implements g	// class@003077
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == null) {
       }else if(q.f(tb.d)){
          Iterator iterator = new ArrayList(tb.d).iterator();
          while (iterator.hasNext()) {
             iterator.next().x6(p0);
          }
       }
       return;
    }
}
