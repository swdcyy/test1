package g82.j0;
import sfc.a;
import g82.v;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import g82.i0;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Integer;
import g82.h0;
import z1.a;
import f82.c;

public class j0 extends a	// class@002aa4
{
    public final boolean c;
    public final LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig d;
    public final int e;
    public final v f;

    public void j0(v p0,boolean p1,LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig p2,int p3){
       this.f = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0.class, "1")) {
          return;
       }
       j0 oj0 = null;
       if (this.f.p.x1 != null) {
          int i = (this.c != null)? k0.a(this.d, i0.a).or(Integer.valueOf(0)).intValue(): this.e;
          oj0 = new h0(this, i);
       }
       c.p(p0, oj0);
       super.b(p0);
       return;
    }
}
