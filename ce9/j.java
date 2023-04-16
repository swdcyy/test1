package ce9.j;
import erd.g;
import com.yxcorp.gifshow.camera.record.magic.e;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camerasdk.p$b;
import com.yxcorp.gifshow.camerasdk.q;
import com.yxcorp.gifshow.camera.record.magic.l;

public final class j implements g	// class@0005c6
{
    public final e b;

    public void j(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "31")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().s("MagicController", "Gender detection timeout", objArray);
          tb.s = true;
          tb.h.u0(null);
          tb.r.e1(-1);
          tb.u = null;
       }
       return;
    }
}
