package c03.k;
import java.lang.Object;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.util.concurrent.ConcurrentHashMap;
import c03.j;
import c03.k$b;
import c03.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import com.kuaishou.live.effect.resource.download.v2.Status;
import com.kuaishou.android.live.log.b;
import java.lang.Throwable;

public class k	// class@000494
{
    public final List a;
    public final Map b;

    public void k(){
       super();
       this.a = LiveLogTag.LIVE_EFFECT.appendTag("LiveDependencyResourceLoader");
       this.b = new ConcurrentHashMap();
    }
    public void k(j p0){
       super();
       this.a = LiveLogTag.LIVE_EFFECT.appendTag("LiveDependencyResourceLoader");
       this.b = new ConcurrentHashMap();
    }
    public void a(k$b p0,l p1,int p2){
       boolean b;
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, k.class, "5")) {
          return;
       }
       Objects.requireNonNull(p0);
       k$b obj = PatchProxy.apply(null, p0, k$b.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Iterator iterator = p0.a.values().iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (!Status.isDownloadComplete(iterator.next())) {
                   b = false;
                }
             }else {
                b = true;
             }
          }
       }
       if (!b) {
          return;
       }else {
          obj = p0.b;
          b.T(this.a, "[checkDownloadStatus]", "mDependKey", obj, "success", Boolean.valueOf(p0.a()));
          if (p0.a()) {
             p1.e(obj);
          }else {
             p1.a(obj, 0x2719, null);
          }
          this.b.remove(obj);
          return;
       }
    }
}
