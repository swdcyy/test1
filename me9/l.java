package me9.l;
import le9.d;
import me9.l$a;
import nsd.u;
import le9.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicRequest;
import ne9.b;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import j8c.a;
import q87.c;
import me9.l$b;
import java.util.concurrent.Callable;
import me9.l$c;
import erd.o;
import t45.d;
import brd.z;
import me9.l$d;
import me9.l$e;

public final class l extends d	// class@003000
{
    public static final l$a c;

    static {
       l.c = new l$a(null);
    }
    public void l(h p0){
       a.p(p0, "callback");
       super(p0);
    }
    public String b(){
       return "MagicRequestServerHandler";
    }
    public t c(MagicRequest p0,b p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "request");
       a.p(p1, "extra");
       obj = new Object[0];
       a.D().w("MagicRequestServerHandler", "handle server request", obj);
       return t.fromCallable(new l$b(p0)).flatMap(l$c.b).subscribeOn(d.c).observeOn(d.a).map(l$d.b).onErrorReturn(l$e.b);
    }
    public boolean g(int p0){
       boolean b = (p0 == 5300)? true: false;
       return b;
    }
}
