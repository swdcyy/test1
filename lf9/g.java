package lf9.g;
import erd.g;
import lf9.e;
import kf9.c;
import kf9.e;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lf9.m;
import lf9.b;
import sa6.b;
import kf9.f;
import java.util.HashMap;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Map;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;

public final class g implements g	// class@002dd3
{
    public final e b;
    public final c c;
    public final e d;

    public void g(e p0,c p1,e p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          Object obj = this.b.a().j().g().get(Integer.valueOf(this.c.b()));
          if (!obj instanceof e) {
             obj = null;
          }
          Object[] obj1 = obj;
          if (obj1 != null) {
             a.o(p0, "it");
             this.b.a().j().g().put(Integer.valueOf(this.c.b()), e.a(obj1, null, p0.intValue(), 1, false, 9, null));
             obj1 = new Object[0];
             a.D().w("SliMode", "magic: "+this.d.c()+" download "+"process: "+p0, obj1);
             this.b.a().h(f.a(this.b.a().j(), null, 0, 0, null, false, false, 63, null));
          }
       }
       return;
    }
}
