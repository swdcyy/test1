package g90.a;
import y36.c;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import z80.s;
import java.util.Objects;
import brd.t;
import z80.a;
import q87.c;
import wkd.b;
import e90.b;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import z80.r0;
import z80.s0;
import brd.w;
import kotlin.jvm.internal.a;

public final class a implements c	// class@00204d
{

    public void a(){
       super();
    }
    public List a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       s d = s.d;
       Objects.requireNonNull(d);
       t ot = PatchProxy.apply(objArray, d, s.class, "16");
       if (ot != patchProxyRe) {
       }else {
          objArray = new Object[0];
          a.D().w("MediaScenePublishUtil", "requestTopicText\(\) invoked", objArray);
          ot = b.a(-2124071004).a().subscribeOn(d.b).map(new e()).observeOn(d.a).map(r0.b).onErrorResumeNext(s0.b);
          a.o(ot, "Singleton.get\(MediaScene¡­t.onComplete\(\)\n        }\)");
       }
       obj.add(ot);
       return obj;
    }
}
