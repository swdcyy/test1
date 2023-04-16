package ec9.c0;
import erd.g;
import ec9.z;
import cc9.k;
import cc9.n;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ec9.b1;
import ec9.k;
import sa6.b;
import cc9.q;
import java.util.HashMap;
import java.lang.Integer;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Map;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import ac9.j;
import ec9.f1;
import lnc.a1;
import kotlin.jvm.internal.a;
import java.util.List;

public final class c0 implements g	// class@002168
{
    public final z b;
    public final k c;
    public final n d;

    public void c0(z p0,k p1,n p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "1")) {
       }else {
          p0 = this.b.a().j().i().get(Integer.valueOf(this.c.b()));
          if (!p0 instanceof n) {
             p0 = null;
          }
          String obj = p0;
          if (obj != null) {
             this.b.a().j().i().put(Integer.valueOf(this.c.b()), n.a(obj, null, -1, 3, false, 9, null));
             Object[] objArray = new Object[0];
             a.D().w("CameraAssistant", "magic: "+this.d.c()+" download "+"failed", objArray);
             if (this.b.a().j().b() == this.c.b()) {
                obj = a1.p(R.string.arg_RES_7f1041ec);
                a.o(obj, "CommonUtil.string\(R.stri¡­rt_shoot_recommend_error\)");
                this.b.c.u0().g(obj);
                this.b.a().h(q.a(this.b.a().j(), null, 0, 0, null, true, false, false, false, 207, null));
             }else {
                this.b.a().h(this.b.a().j());
             }
          }
       }
       return;
    }
}
