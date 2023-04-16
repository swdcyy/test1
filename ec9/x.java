package ec9.x;
import erd.g;
import ec9.w;
import java.lang.String;
import cc9.k;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.Number;
import q87.c;
import ec9.b1;
import ec9.k;
import sa6.b;
import cc9.q;
import java.util.HashMap;
import java.lang.Integer;
import cc9.j;
import u80.d;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.util.Map;
import java.util.List;

public final class x implements g	// class@0021a2
{
    public final w b;
    public final String c;
    public final k d;

    public void x(w p0,String p1,k p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("CameraAssistant", "download KuaiShan, id = "+this.c+", progress = "+p0.getFirst().intValue(), objArray);
          b uob = this.b.a().j();
          b1 obj = uob.i().get(Integer.valueOf(this.d.b()));
          if (!obj instanceof j) {
             obj = null;
          }
          Object obj1 = obj;
          if (obj1 != null) {
             uob.i().put(Integer.valueOf(this.d.b()), j.a(obj1, null, p0.getFirst().intValue(), false, p0.getSecond(), 5, null));
             if (uob.b() == this.d.b()) {
                obj = this.b.a();
                boolean b = (p0.getSecond() != null)? true: false;
                obj.h(q.a(uob, null, 0, 0, null, false, b, false, false, 207, null));
             }else {
                this.b.a().h(q.a(uob, null, 0, 0, null, false, false, false, false, 255, null));
             }
          }
       }
       return;
    }
}
