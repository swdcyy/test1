package nz9.u;
import erd.g;
import nz9.z0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class u implements g	// class@00324f
{
    public final z0 b;

    public void u(z0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       u tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, z0.class, "86")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "QUICK_SPECIAL_FOLLOW_PANEL";
          p0 = i3.f();
          String str = (tb.F0())? "cancel_special_follow": "special_follow";
          p0.d("follow_btn_type", str);
          uElementPack.params = p0.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(tb.u.mEntity);
          u1.D0("", tb.G, 7, uElementPack, uContentPack, null);
       }
       return;
    }
}
