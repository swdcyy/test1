package fn1.a;
import java.lang.Object;
import java.lang.String;
import fn1.b;
import msd.l;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.i3;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Number;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Boolean;

public final class a	// class@002375
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final ClientEvent$ElementPackage a(String p0,b p1,l p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ClientEvent$ElementPackage obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = p0;
       i3 oi3 = i3.f();
       a.o(oi3, "JsonStringBuilder.newInstance\(\)");
       Object obj1 = PatchProxy.applyTwoRefs(oi3, p1, this, a.class, "6");
       if (obj1 != patchProxyRe) {
          oi3 = obj1;
       }else {
          oi3.c("entry_src", Integer.valueOf(p1.b));
          oi3.d("hot_id", p1.c);
          String str = p1.a();
          obj1 = 0;
          if (str != null) {
             str = (str.length() > 0)? 1: null;
             if (str == 1) {
                oi3.d("author_id", p1.a());
             }
          }
          str = p1.b();
          if (str != null) {
             if (str.length() > 0) {
                obj1 = 1;
             }
             if (obj1 == 1) {
                oi3.d("live_stream_id", p1.b());
             }
          }
       }
       if (p2 != null) {
          l1 ol1 = p2.invoke(oi3);
       }
       obj.params = oi3.e();
       return obj;
    }
    public final void b(String p0,b p1,ClientContent$LiveStreamPackage p2,l p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "1")) {
          return;
       }
       a.p(p0, "action2");
       a.p(p1, "loggerContext");
       e0 uoe0 = p1.c();
       ClientEvent$ElementPackage uElementPack = this.a(p0, p1, p3);
       ClientContent$ContentPackage uContentPack = PatchProxy.applyOneRefs(p2, this, a.class, "5");
       if (uContentPack != PatchProxyResult.class) {
       }else {
          uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = p2;
       }
       u1.L("", uoe0, 1, uElementPack, uContentPack);
       return;
    }
    public final void c(boolean p0,String p1,b p2,ClientContent$LiveStreamPackage p3,l p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
             return;
          }
       }
       a.p(p1, "action2");
       a.p(p2, "loggerContext");
       if (p0) {
          this.b(p1, p2, p3, p4);
       }else {
          this.d(p1, p2, p3, p4);
       }
       return;
    }
    public final void d(String p0,b p1,ClientContent$LiveStreamPackage p2,l p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "2")) {
          return;
       }
       a.p(p0, "action2");
       a.p(p1, "loggerContext");
       u1.C0("", p1.c(), 9, this.a(p0, p1, p3), null);
       return;
    }
}
