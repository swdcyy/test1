package ec9.b0;
import erd.g;
import ec9.z;
import cc9.k;
import cc9.n;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ec9.b1;
import ec9.k;
import sa6.b;
import cc9.q;
import java.util.HashMap;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Map;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;

public final class b0 implements g	// class@002165
{
    public final z b;
    public final k c;
    public final n d;

    public void b0(z p0,k p1,n p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "1")) {
       }else {
          Object obj = this.b.a().j().i().get(Integer.valueOf(this.c.b()));
          if (!obj instanceof n) {
             obj = null;
          }
          Object[] obj1 = obj;
          if (obj1 != null) {
             a.o(p0, "it");
             this.b.a().j().i().put(Integer.valueOf(this.c.b()), n.a(obj1, null, p0.intValue(), 1, false, 9, null));
             obj1 = new Object[0];
             a.D().w("CameraAssistant", "magic: "+this.d.c()+" download "+"process: "+p0, obj1);
             this.b.a().h(q.a(this.b.a().j(), null, 0, 0, null, false, false, false, false, 255, null));
          }
       }
       return;
    }
}
