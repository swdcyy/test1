package hz8.i;
import erd.g;
import hz8.d;
import java.lang.Object;
import bm5.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import em9.c;
import em9.b;

public final class i implements g	// class@0025fd
{
    public final d b;

    public void i(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else if(a.g(d.P8(this.b), p0.a)){
          p0 = this.b.u;
          if (p0 != null) {
             p0.e();
          }
          p0 = this.b.u;
          if (p0 != null) {
             p0.start();
          }
          p0.v = false;
       }else {
          p0 = this.b;
          if (p0.v == null) {
             p0 = p0.u;
             if (p0 != null) {
                p0.stop();
             }
             p0 = this.b;
             d u = p0.u;
             if (u != null) {
                u.b(d.P8(p0));
             }
             p0.t = false;
          }
       }
       return;
    }
}
