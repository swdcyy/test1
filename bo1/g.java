package bo1.g;
import bo1.f;
import java.lang.Object;
import java.util.ArrayList;
import lp3.e;
import lp3.c;
import lp3.b;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bo1.b;
import java.util.Collection;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import bo1.c;
import bo1.d;
import bo1.d$b;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.interactwatchdog.LiveInteractWatchDogPluginStopReason;

public abstract class g implements f	// class@0003d2
{
    public final List b;

    public void g(){
       super();
       this.b = new ArrayList();
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public abstract List r();
    public void start(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       b uob = new b();
       this.b.addAll(this.r());
       b.Z(LiveLogTag.LIVE_INTERACT_WATCH_DOG, "loadPlugins: "+this.b);
       Iterator iterator = CollectionsKt___CollectionsKt.G5(this.b).iterator();
       while (iterator.hasNext()) {
          iterator.next().e(uob);
       }
       return;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       Iterator iterator = CollectionsKt___CollectionsKt.G5(this.b).iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (a.g(uoc.getState(), d$b.a)) {
             uoc.f(LiveInteractWatchDogPluginStopReason.SERVICE_STOP);
          }
       }
       this.b.clear();
       return;
    }
}
