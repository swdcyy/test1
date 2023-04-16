package by0.a;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class a	// class@00042d
{

    public void a(){
       super();
    }
    public static void a(ClientContent$LiveStreamPackage p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uoa, "5")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "BUTTON_CS_REPLY_CARD_REPLY";
       i3 oi3 = i3.f();
       oi3.c("biz_type", Integer.valueOf(p1));
       uElementPack.params = oi3.e();
       a.b(p0, uElementPack);
       return;
    }
    public static void b(ClientContent$LiveStreamPackage p0,ClientEvent$ElementPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "7")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       if (p0 != null) {
          uContentPack.liveStreamPackage = p0;
       }
       u1.u(1, p1, uContentPack);
       return;
    }
    public static void c(ClientContent$LiveStreamPackage p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uoa, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "BUTTON_ASK_CS";
       i3 oi3 = i3.f();
       oi3.c("entrance_position", Integer.valueOf(p1));
       uElementPack.params = oi3.e();
       a.d(p0, uElementPack);
       return;
    }
    public static void d(ClientContent$LiveStreamPackage p0,ClientEvent$ElementPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "8")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       if (p0 != null) {
          uContentPack.liveStreamPackage = p0;
       }
       u1.u0(3, p1, uContentPack);
       return;
    }
}
