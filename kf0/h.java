package kf0.h;
import erd.o;
import kf0.f$b;
import java.lang.Object;
import com.kuaishou.growth.pendant.core.manager.f$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonArray;
import kotlin.jvm.internal.a;

public final class h implements o	// class@002d0f
{
    public final f$b b;

    public void h(f$b p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       f$a uoa = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "wrapper");
          f$a b = p0.b;
          a.o(b, "wrapper.mOrigin");
          this.b.b(b);
          uoa = p0.a;
       }
       return uoa;
    }
}
