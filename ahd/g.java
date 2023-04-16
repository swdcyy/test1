package ahd.g;
import ehc.g;
import ihc.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import k2b.e0;
import com.yxcorp.gifshow.settings.stencil.item.ToolKitKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;

public final class g extends a implements g	// class@000039
{
    public final g r;
    public final g s;

    public void g(BaseFragment p0,SettingItemStencil p1){
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       super(p0, p1);
       this.r = ToolKitKt.b(p1, this.d);
       this.s = this;
    }
    public g f(){
       return this.s;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       g tr = this.r;
       if (tr != null) {
          tr.g();
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "INVITATION_ENTRANCE_BUTTON";
       ClientEvent$UrlPackage urlPackage = u1.k();
       if (urlPackage != null) {
          urlPackage.page = 5;
       }
       u1.A(urlPackage, "", 1, uElementPack, null);
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       g tr = this.r;
       if (tr != null) {
          tr.h();
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "INVITATION_ENTRANCE_BUTTON";
       ClientEvent$UrlPackage urlPackage = u1.k();
       if (urlPackage != null) {
          urlPackage.page = 5;
       }
       u1.y0(urlPackage, 3, uElementPack, null);
       return;
    }
}
