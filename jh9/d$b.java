package jh9.d$b;
import fw8.b;
import jh9.d;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;

public final class d$b extends b	// class@002ad7
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       this.b.P8(CachePolicy.NETWORK_ELSE_CACHE);
       return;
    }
}
