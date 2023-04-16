package b12.d;
import b12.a;
import java.util.LinkedList;
import java.lang.Object;
import lp3.e;
import lp3.c;
import lp3.b;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.d0;
import b12.b;
import java.lang.Iterable;
import ok.o;
import qk.y;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.ref.WeakReference;
import java.util.Deque;
import java.lang.Integer;
import b12.c;

public class d implements a	// class@0002eb
{
    public static final Deque b;

    static {
       d.b = new LinkedList();
    }
    public void d(){
       super();
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void ne(Activity p0){
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "1")) {
          return;
       }
       if (d0.k(p0)) {
          return;
       }
       Deque b = d.b;
       if (y.c(b, new b(p0))) {
          b.Z(LiveLogTag.LIVE_AUDIENCE_LIVE_LIMIT, "addLimitActivity, ignore£¬is contain");
          return;
       }else {
          b.add(new WeakReference(p0));
          b.c0(LiveLogTag.LIVE_AUDIENCE_LIVE_LIMIT, "addLimitActivity", "size", Integer.valueOf(b.size()));
          if (!PatchProxy.applyVoid(null, this, uod, "2")) {
             y.q(b, c.b);
             Deque b1 = d.b;
             while (b1.size() > 4) {
                b1 = b1.pollFirst().get();
                if (b1 != null && !d0.k(b1)) {
                   b1.finish();
                   b.Z(LiveLogTag.LIVE_AUDIENCE_LIVE_LIMIT, "discardOutdatedLiveIfNeed, remove one");
                }
             }
          }
          return;
       }
    }
}
