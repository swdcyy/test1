package dta.s;
import java.lang.Runnable;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import java.util.List;
import wq6.g;
import androidx.fragment.app.Fragment;
import wq6.f;
import k2b.e0;
import dta.j0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import wq6.h;
import wn5.b;
import com.yxcorp.utility.TextUtils;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagShowPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import java.util.Iterator;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class s implements Runnable	// class@00254e
{
    public final a b;

    public void s(a p0){
       this.b = p0;
    }
    public final void run(){
       s tb = this.b;
       a p = tb.p;
       List children = p.getChildren();
       e0 uoe0 = tb.p.Q();
       if (PatchProxy.applyVoidFourRefs(p, children, "HOT_CHANNEL_TAB", uoe0, null, j0.class, "3")) {
       }else if(q.f(children)){
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "HOT_CHANNEL_TAB";
          i3 oi3 = i3.f();
          int i = 0;
          oi3.c("montm_layer", Integer.valueOf(i));
          oi3.d("current_tab_name", TextUtils.I(children.get(p.getCurrentPosition()).q("KEY_TAB_NAME_DEST").c()));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$TagShowPackage tagShowPacka = new ClientContent$TagShowPackage();
          ClientContent$TagPackage[] tagPackageAr = new ClientContent$TagPackage[children.size()];
          Iterator iterator = children.iterator();
          while (iterator.hasNext()) {
             int i1 = i + 1;
             tagPackageAr[i] = j0.a(p, iterator.next(), i);
             i = i1;
          }
          tagShowPacka.tagPackage = tagPackageAr;
          uContentPack.tagShowPackage = tagShowPacka;
          if (uoe0 == null) {
             u1.v0(3, uElementPack, uContentPack, null);
          }else {
             u1.D0("", uoe0, 3, uElementPack, uContentPack, null);
          }
       }
       return;
    }
}
