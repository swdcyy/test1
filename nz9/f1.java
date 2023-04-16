package nz9.f1;
import nz9.u1$b;
import nz9.z0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public class f1 implements u1$b	// class@00321e
{
    public final z0 a;

    public void f1(z0 p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void b(){
    }
    public void onShow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f1.class, "1")) {
          return;
       }
       this.a.K0("t");
       f1 ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, z0.class, "85")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SHOW_FOLLOW_BUTTON_GUILD";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(ta.u.mEntity);
          u1.D0("", ta.G, 6, uElementPack, uContentPack, null);
       }
       return;
    }
}
