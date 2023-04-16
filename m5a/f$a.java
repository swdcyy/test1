package m5a.f$a;
import d6a.a;
import m5a.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import joc.m;
import foc.m$d;

public class f$a extends a	// class@002f42
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$a.class, "1")) {
          return;
       }
       f$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, f.class, "4")) {
          f a = tb.A;
          if (a != null) {
             a.i(tb.r.getDetailCommonParam().getUnserializableBundleId());
             tb.A.h(tb.D);
          }
       }
       return;
    }
}
