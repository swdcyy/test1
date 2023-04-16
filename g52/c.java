package g52.c;
import erd.g;
import g52.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import brd.v;
import brd.g;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class c implements g	// class@002a6d
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       tb.r = p0;
       e q = tb.q;
       if (PatchProxy.applyVoidTwoRefs(p0, q, tb, e.class, "6")) {
       }else if(!q.f(q)){
          Iterator iterator = q.iterator();
          while (iterator.hasNext()) {
             v ov = iterator.next();
             if (!ov.isDisposed()) {
                ov.onError(p0);
             }
          }
          q.clear();
       }
       b.I(LiveLogTag.LIVE_AUDIENCE_CLOSE, "getEndInfoError", p0);
       return;
    }
}
