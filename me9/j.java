package me9.j;
import le9.d;
import me9.j$a;
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
import me9.j$b;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import re9.z;
import me9.j$c;
import erd.g;
import crd.b;
import eoc.f;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;

public final class j extends d	// class@002ff5
{
    public boolean c;
    public static final j$a d;

    static {
       j.d = new j$a(null);
    }
    public void j(h p0){
       a.p(p0, "callback");
       super(p0);
    }
    public String b(){
       return "MagicRequestGuideStatusHandler";
    }
    public t c(MagicRequest p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "request");
       a.p(p1, "extra");
       return t.fromCallable(new j$b(this)).subscribeOn(d.c);
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       b uob = f.a(z.class, new j$c(this));
       a.o(uob, "RxBusUtils.listenInMainT¡­\(response\)\)\n            }");
       this.a().a(uob);
       return;
    }
    public boolean g(int p0){
       boolean b = (p0 == 5800)? true: false;
       return b;
    }
    public final JsonObject h(){
       JsonObject obj = PatchProxy.apply(null, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.a0("guideState", Integer.valueOf(this.c));
       return obj;
    }
}
