package azb.c;
import io.reactivex.g;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.post.growth.GrowthGuideConfigCacheHelper;
import java.util.concurrent.CopyOnWriteArrayList;
import r46.d;
import com.google.gson.JsonArray;
import java.lang.Boolean;
import brd.g;

public final class c implements g	// class@000367
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "it");
       GrowthGuideConfigCacheHelper e = GrowthGuideConfigCacheHelper.e;
       boolean b = GrowthGuideConfigCacheHelper.d.isEmpty();
       if (b) {
          e.g(d.a.a());
       }
       p0.onNext(Boolean.valueOf(b));
       p0.onComplete();
       return;
    }
}
