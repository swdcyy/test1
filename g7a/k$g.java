package g7a.k$g;
import erd.g;
import g7a.k;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class k$g implements g	// class@0023e6
{
    public final k b;

    public void k$g(k p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$g.class, "1")) {
       }else if(a.g(k.W8(this.b).t(), k.P8(this.b)) ^ 0x01){
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, k.class, "12")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "FANS_GUIDE_ICON";
             i3 oi3 = i3.f();
             k q = p0.q;
             String str = "mPhoto";
             if (q == null) {
                a.S(str);
             }
             oi3.d("icon_type", q.getFansTopPurchaseText());
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             k q1 = p0.q;
             if (q1 == null) {
                a.S(str);
             }
             uContentPack.photoPackage = w1.f(q1.mEntity);
             k t = p0.t;
             if (t == null) {
                a.S("mFragment");
             }
             u1.D0("", t, 6, uElementPack, uContentPack, null);
          }
       }
       return;
    }
}
