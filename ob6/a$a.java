package ob6.a$a;
import ob6.p$b;
import java.lang.Object;
import ob6.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.gifshow.platform.network.keyconfig.FeatureConfig;
import pb6.o;
import java.util.Objects;
import pb6.o$a;
import java.util.Iterator;
import java.lang.Iterable;
import pb6.p;
import com.google.gson.JsonObject;
import java.lang.Throwable;
import ob6.q;

public final class a$a implements p$b	// class@001fe2
{

    public void a$a(){
       super();
    }
    public void a(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "keyConfig");
       p0 = p0.mFeatureConfig;
       if (p0 != null) {
          FeatureConfig mResolveConf = p0.mResolveConfig;
          if (mResolveConf != null) {
             Objects.requireNonNull(o.a);
             Iterator iterator = o$a.a.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(mResolveConf);
             }
          }
       }
       return;
    }
    public void onError(Throwable p0){
       q.a(this, p0);
    }
}
