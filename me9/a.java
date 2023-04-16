package me9.a;
import le9.d;
import me9.a$a;
import nsd.u;
import le9.h;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import me9.a$b;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicRequest;
import ne9.b;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import me9.a$c;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import me9.a$d;
import erd.o;

public final class a extends d	// class@002fde
{
    public final a$b c;
    public final Activity d;
    public static final a$a e;

    static {
       a.e = new a$a(null);
    }
    public void a(h p0,Activity p1){
       a.p(p0, "callback");
       a.p(p1, "activity");
       super(p0);
       this.d = p1;
       this.c = new a$b(this);
    }
    public String b(){
       return "MagicRequestBridgeCenterHandler";
    }
    public t c(MagicRequest p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "request");
       a.p(p1, "extra");
       Object[] objArray = new Object[0];
       a.D().w("MagicRequestBridgeCenterHandler", "handle bridgeCenter request:"+p0, objArray);
       return t.fromCallable(new a$c(p0)).observeOn(d.a).flatMap(new a$d(this));
    }
    public boolean g(int p0){
       boolean b = (p0 == 5900)? true: false;
       return b;
    }
}
