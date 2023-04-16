package me9.d;
import le9.d;
import me9.d$a;
import nsd.u;
import le9.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicRequest;
import ne9.b;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import me9.d$b;
import java.util.concurrent.Callable;
import me9.d$c;
import erd.o;
import me9.d$d;
import me9.d$e;

public final class d extends d	// class@002feb
{
    public final HashMap c;
    public static final d$a d;

    static {
       d.d = new d$a(null);
    }
    public void d(h p0){
       a.p(p0, "callback");
       super(p0);
       this.c = new HashMap();
    }
    public String b(){
       return "MagicRequestDownloadHandler";
    }
    public t c(MagicRequest p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "request");
       a.p(p1, "extra");
       Object[] objArray = new Object[0];
       a.D().w("MagicRequestDownloadHandler", "handle resource download request:"+p0, objArray);
       return t.fromCallable(new d$b(p0)).flatMap(new d$c(this, p0)).map(d$d.b).onErrorReturn(d$e.b);
    }
    public boolean g(int p0){
       boolean b = (p0 == 5200)? true: false;
       return b;
    }
}
