package goa.d;
import goa.d$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import cra.w;
import q87.c;
import java.lang.CharSequence;
import wkd.b;
import joa.a;
import kotlin.jvm.internal.a;
import yma.a;
import yma.b;
import brd.t;
import cjd.e;
import erd.o;
import goa.d$b;
import goa.d$c;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import zsd.u;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.i3;
import java.lang.Number;
import goa.d$d;
import goa.d$e;
import com.kuaishou.gifshow.network.degrade.RequestTiming;

public class d	// class@002b40
{
    public boolean a;
    public int b;
    public static b c;
    public static final d$a d;

    static {
       d.d = new d$a(null);
    }
    public void d(){
       super();
       this.b = 1;
    }
    public final void a(String p0,int p1,String p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, d.class, "8")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "GrowthModule";
       w.C().t(str, "bindInviteCode request start", objArray);
       objArray = (p0 == null || !p0.length())? 1: 0;
       if (objArray) {
          Object[] objArray1 = new Object[i];
          w.C().t(str, "bindInviteCode inviteCode is null", objArray1);
          return;
       }else {
          b.a(-415247079).e(null, -1, null);
          Object obj = b.a(-1257347683);
          a.o(obj, "Singleton.get\(GrowthApi::class.java\)");
          obj.b().v(p0, p1, 1, p2).map(new e()).subscribe(new d$b(this), d$c.b);
          return;
       }
    }
    public final boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null) {
          b = u.q2(p0, "INVITE_CODE", b, 2, null);
       }
       return b;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (!mE.isLogined()) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.a("watchEnoughTime", Boolean.FALSE);
       oi3.c("sourceType", Integer.valueOf(0));
       Object obj = b.a(-1257347683);
       a.o(obj, "Singleton.get\(GrowthApi::class.java\)");
       obj.b().y(oi3.e()).map(new e()).subscribe(new d$d(this), d$e.b);
       return;
    }
    public final void d(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "requestTiming");
       int i = (p0 == RequestTiming.COLD_START)? 1: 2;
       this.b = i;
       return;
    }
}
