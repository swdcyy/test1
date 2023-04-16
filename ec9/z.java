package ec9.z;
import ec9.k;
import ec9.z$a;
import nsd.u;
import ec9.b1;
import ec9.f1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.a;
import cc9.k;
import j8c.a;
import q87.c;
import sa6.b;
import cc9.q;
import java.lang.Integer;
import cc9.h;
import cc9.n;
import java.lang.StringBuilder;
import w46.b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import i4b.g;
import java.util.Map;
import java.util.List;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import ec9.a0;
import io.reactivex.g;
import t45.d;
import brd.z;
import ec9.b0;
import ec9.c0;
import ec9.d0;
import erd.g;
import erd.a;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public final class z extends k	// class@0021a7
{
    public final HashMap b;
    public final f1 c;
    public static final z$a d;

    static {
       z.d = new z$a(null);
    }
    public void z(b1 p0,f1 p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.c = p1;
       this.b = new HashMap();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, z.class, "4")) {
          return;
       }
       this.d();
       return;
    }
    public void c(a p0){
       Object obj = this;
       Object obj1 = p0;
       z oz = z.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, oz, "1")) {
       }else {
          a.p(obj1, "action");
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().s("CameraAssistant", "CheckOrDownloadMagicActionDelegates", objArray);
          b uob = this.a().j();
          h oh = uob.i().get(Integer.valueOf(obj1.b()));
          if (!oh instanceof n) {
             Object[] objArray1 = new Object[i];
             a.D().t("CameraAssistant", "DownloadMagicActionDelegates state error, it:"+oh, objArray1);
          }else {
             h oh1 = oh;
             if (!g.y(oh1.c())) {
                uob.i().put(Integer.valueOf(obj1.b()), n.a(oh1, null, -1, 2, false, 9, null));
                if (uob.b() == obj1.b()) {
                   this.a().h(q.a(uob, null, 0, 0, null, false, false, false, false, 239, null));
                }else {
                   this.a().h(q.a(uob, null, 0, 0, null, false, false, false, false, 255, null));
                }
                Object[] objArray2 = new Object[i];
                a.D().w("CameraAssistant", "magic is already downloaded", objArray2);
             }else {
                b9.a(obj.b.get(Integer.valueOf(obj1.b())));
                MagicEmoji$MagicFace magicFace = oh1.c();
                t ot = PatchProxy.applyOneRefs(magicFace, obj, oz, "3");
                if (ot != PatchProxyResult.class) {
                }else {
                   ot = t.create(new a0(magicFace));
                   a.o(ot, "Observable.create { emit¡­     }\n          }\)\n    }");
                }
                b uob1 = ot.observeOn(d.a).subscribe(new b0(obj, obj1, oh1), new c0(obj, obj1, oh1), new d0(obj, obj1, oh1));
                a.o(uob1, "downloadDisposable");
                obj.b.put(Integer.valueOf(obj1.b()), uob1);
             }
          }
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, z.class, "5")) {
          return;
       }
       Iterator iterator = this.b.entrySet().iterator();
       while (iterator.hasNext()) {
          b9.a(iterator.next().getValue());
       }
       return;
    }
}
