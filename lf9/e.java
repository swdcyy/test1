package lf9.e;
import lf9.b;
import lf9.e$a;
import nsd.u;
import lf9.m;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.a;
import kf9.c;
import sa6.b;
import kf9.f;
import java.lang.Integer;
import kf9.a;
import kf9.e;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import i4b.g;
import java.util.Map;
import java.util.List;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import lf9.f;
import io.reactivex.g;
import t45.d;
import brd.z;
import lf9.g;
import lf9.h;
import lf9.i;
import erd.g;
import erd.a;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public final class e extends b	// class@002dd0
{
    public final HashMap b;
    public static final e$a c;

    static {
       e.c = new e$a(null);
    }
    public void e(m p0){
       a.p(p0, "provider");
       super(p0);
       this.b = new HashMap();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.d();
       return;
    }
    public void c(a p0){
       Object[] objArray;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "1")) {
       }else {
          a.p(p0, "action");
          b uob = this.a().j();
          a uoa = uob.g().get(Integer.valueOf(p0.b()));
          if (!uoa instanceof e) {
             objArray = new Object[0];
             a.D().A("SliMode", "DownloadMagicActionDelegates state error", objArray);
          }else {
             a uoa1 = uoa;
             if (!g.y(uoa1.c())) {
                uob.g().put(Integer.valueOf(p0.b()), e.a(uoa1, null, -1, 2, false, 9, null));
                if (uob.b() == p0.b()) {
                   this.a().h(f.a(uob, null, 0, 0, null, false, false, 47, null));
                }else {
                   this.a().h(f.a(uob, null, 0, 0, null, false, false, 63, null));
                }
                objArray = new Object[0];
                a.D().w("SliMode", "magic is already downloaded", objArray);
             }else {
                b9.a(this.b.get(Integer.valueOf(p0.b())));
                MagicEmoji$MagicFace magicFace = uoa1.c();
                t ot = PatchProxy.applyOneRefs(magicFace, this, uoe, "3");
                if (ot != PatchProxyResult.class) {
                }else {
                   ot = t.create(new f(magicFace));
                   a.o(ot, "Observable.create { emit¡­       }\n        }\)\n    }");
                }
                b uob1 = ot.observeOn(d.a).subscribe(new g(this, p0, uoa1), new h(this, p0, uoa1), new i(this, p0, uoa1));
                a.o(uob1, "downloadDisposable");
                this.b.put(Integer.valueOf(p0.b()), uob1);
             }
          }
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       Iterator iterator = this.b.entrySet().iterator();
       while (iterator.hasNext()) {
          b9.a(iterator.next().getValue());
       }
       return;
    }
}
