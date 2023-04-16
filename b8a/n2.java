package b8a.n2;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.e0$b;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slidev2.presenter.e0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.i3;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserVerifiedDetail;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import k2b.u1;

public final class n2 implements Runnable	// class@0003cd
{
    public final e0$b b;

    public void n2(e0$b p0){
       this.b = p0;
    }
    public final void run(){
       String str;
       e0$b a = this.b.a;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoid(null, a, e0.class, "17")) {
       }else {
          i3 oi3 = i3.f();
          oi3.d("head_position", "BOTTOM_BAR");
          User mVerifiedDet = a.H.mVerifiedDetail;
          if (mVerifiedDet == null) {
          label_002d :
             str = "";
          }else {
             UserVerifiedDetail mIconType = mVerifiedDet.mIconType;
             if (mIconType != 1) {
                if (mIconType != 2) {
                   goto label_002d ;
                }else {
                   str = "BLUE";
                }
             }else {
                str = "ORANGE";
             }
          }
          oi3.d("author_info", str);
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SHOW_AUTHOR_AVATAR";
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(a.z.mEntity);
          u1.B0(new ShowMetaData().setLogPage(a.E).setType(0).setElementPackage(uElementPack).setContentPackage(uContentPack));
       }
       return;
    }
}
