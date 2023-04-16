package cec.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import cec.b;
import cec.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.event.a;
import oj0.a;
import com.yxcorp.gifshow.reminder.friend.relation.FriendsListContainerFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class d extends PresenterV2	// class@000587
{
    public BaseFragment p;
    public final a q;
    public final a r;

    public void d(){
       super();
       this.q = new b(this);
       this.r = new a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       a.b().a("KRNShiftOutUninterestedUserNotification", this.q);
       a.b().a("KRNFriendsListPageEmptyNotification", this.r);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       a.b().c("KRNShiftOutUninterestedUserNotification", this.q);
       a.b().c("KRNFriendsListPageEmptyNotification", this.r);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.s8(FriendsListContainerFragment.class);
       return;
    }
}
