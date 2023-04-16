package jh9.d$f;
import erd.g;
import jh9.d;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;

public final class d$f implements g	// class@002adb
{
    public final d b;

    public void d$f(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$f.class, "1")) {
       }else {
          this.b.P8(CachePolicy.NETWORK_ONLY);
       }
       return;
    }
}
