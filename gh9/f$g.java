package gh9.f$g;
import erd.g;
import gh9.f;
import java.lang.Object;
import zb9.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.base.d;
import zb9.p0;
import zb9.p0$a;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import gh9.a;

public final class f$g implements g	// class@00249a
{
    public final f b;

    public void f$g(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$g.class, "1")) {
       }else {
          a.p(p0, "event");
          Object obj = this.b.d.d(p0.j.a());
          a.o(obj, "mCallerContext.getData\(A¡­tantModeData.defaultData\)");
          if (!obj.b() && (obj.e() || obj.d())) {
             RxBus.f.b(new a(p0.a()));
          }
       }
       return;
    }
}
