package r5c.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import r5c.b$a;
import s2b.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import s2b.a;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import r5c.a;
import k2b.f3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.profile.status.panel.StatusPanelListFragment;

public class b extends PresenterV2	// class@003edb
{
    public StatusPanelListFragment p;
    public QPhoto q;
    public a r;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (this.r == null) {
          this.r = new b$a(this);
       }
       this.p.r9().h(this.r);
       return;
    }
    public void P8(List p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "1")) {
          f3 uof3 = f3.l("2859457", "USER_LIKE_CARD");
          uof3.b(a.c(p0, p1));
          uof3.f(p1.getFeedLogCtx());
          uof3.g();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("FRIEND_LIKE_USER_LIST_FRAGMENT");
       this.q = this.q8(QPhoto.class);
       return;
    }
}
