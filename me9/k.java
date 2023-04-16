package me9.k;
import le9.d;
import me9.k$a;
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
import me9.k$b;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import me9.k$c;
import erd.o;
import me9.k$d;

public final class k extends d	// class@002ffa
{
    public static final k$a c;

    static {
       k.c = new k$a(null);
    }
    public void k(h p0){
       a.p(p0, "callback");
       super(p0);
    }
    public String b(){
       return "MagicRequestSaveImgHandler";
    }
    public t c(MagicRequest p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "request");
       a.p(p1, "extra");
       return t.fromCallable(new k$b(p1, p0)).observeOn(d.c).map(new k$c(p1)).onErrorReturn(k$d.b);
    }
    public boolean g(int p0){
       boolean b = (p0 == 5500)? true: false;
       return b;
    }
}
