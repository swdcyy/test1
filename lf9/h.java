package lf9.h;
import erd.g;
import lf9.e;
import kf9.c;
import kf9.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lf9.m;
import lf9.b;
import sa6.b;
import kf9.f;
import java.util.HashMap;
import java.lang.Integer;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Map;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;

public final class h implements g	// class@002dd4
{
    public final e b;
    public final c c;
    public final e d;

    public void h(e p0,c p1,e p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          p0 = this.b.a().j().g().get(Integer.valueOf(this.c.b()));
          if (!p0 instanceof e) {
             p0 = null;
          }
          Object obj = p0;
          if (obj != null) {
             this.b.a().j().g().put(Integer.valueOf(this.c.b()), e.a(obj, null, -1, 3, false, 9, null));
             Object[] objArray = new Object[0];
             a.D().w("SliMode", "magic: "+this.d.c()+" download "+"failed", objArray);
             if (this.b.a().j().b() == this.c.b()) {
                this.b.a().h(f.a(this.b.a().j(), null, 0, 0, null, true, false, 47, null));
             }else {
                this.b.a().h(this.b.a().j());
             }
          }
       }
       return;
    }
}
