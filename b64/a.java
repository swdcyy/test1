package b64.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.framework.model.user.QCurrentUser;
import k2b.u1;

public final class a	// class@000319
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MERCHANT_PREVIEW_REMIND_POPUP";
       i3 oi3 = i3.f();
       String str = (p0)? "RESTART": "CONTINUE";
       oi3.d("button_name", str);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$LiveStreamPackage liveStreamPa = new ClientContent$LiveStreamPackage();
       liveStreamPa.anchorUserId = QCurrentUser.me().getId();
       uContentPack.liveStreamPackage = liveStreamPa;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
}
