package h19.f$a;
import d6a.a;
import h19.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import joc.m;
import foc.m$d;

public class f$a extends a	// class@00253f
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void F1(){
       this.b.y = false;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$a.class, "1")) {
          return;
       }
       f$a tb = this.b;
       tb.y = true;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, f.class, "3")) {
          f x = tb.x;
          if (x != null) {
             x.i(tb.q.getDetailCommonParam().getUnserializableBundleId());
             tb.x.h(tb.C);
          }
       }
       return;
    }
}
