package ee1.z0;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import ee1.z0$a;
import ee1.m0;
import xv4.e;
import xv4.h;
import java.util.Set;
import z1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;

public class z0	// class@00212d
{
    public final Set a;
    public final Set b;
    public final e c;
    public final h d;
    public static final List e;

    static {
       z0.e = LiveLogTag.LIVE_RTC.appendTag("LiveRtcListenerDelegate");
    }
    public void z0(){
       super();
       this.a = new CopyOnWriteArraySet();
       this.b = new CopyOnWriteArraySet();
       this.c = new z0$a(this);
       this.d = new m0(this);
    }
    public e a(){
       return this.c;
    }
    public h b(){
       return this.d;
    }
    public void c(Set p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, z0.class, "5")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          p1.accept(iterator.next());
       }
       return;
    }
}
