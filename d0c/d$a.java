package d0c.d$a;
import java.lang.Object;
import nsd.u;
import d0c.a;
import d0c.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.postfont.model.FontType;
import java.util.List;

public final class d$a	// class@0020a9
{

    public void d$a(){
       super();
    }
    public void d$a(u p0){
       super();
    }
    public final d a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "config");
       d uod = new d(false, null, 0, null, false, 31, null);
       obj.a = p0.d();
       obj.b = p0.e();
       obj.c = p0.c();
       obj.d = p0.a();
       obj.e = p0.b();
       obj.f = p0.f;
       obj.g = p0.h();
       obj.h = p0.g();
       obj.i = p0.f();
       return obj;
    }
}
