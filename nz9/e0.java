package nz9.e0;
import java.lang.Runnable;
import nz9.z0;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import com.kwai.framework.model.user.User;
import nz9.h1;
import uf5.i0$a;
import crd.b;
import uf5.i0;
import qp7.b;

public final class e0 implements Runnable	// class@00321a
{
    public final z0 b;

    public void e0(z0 p0){
       this.b = p0;
    }
    public final void run(){
       e0 tb = this.b;
       Objects.requireNonNull(tb);
       z0 oz0 = z0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, oz0, "19")) {
       }else if(PatchProxy.applyVoid(objArray, tb, oz0, "73")){
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "TO_FAVORITE";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(tb.u.mEntity);
          u1.u(1, uElementPack, uContentPack);
       }
       tb.j(tb.Z.b(new h1(tb, tb.u.getUser())));
       return;
    }
}
