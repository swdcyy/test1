package bec.d;
import erd.g;
import com.kwai.kds.krn.api.page.router.KwaiRnTab;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.reminder.friend.relation.FriendsListContainerFragment;

public final class d implements g	// class@000465
{
    public final KwaiRnTab b;

    public void d(KwaiRnTab p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       if (p0.booleanValue()) {
          tb.A();
       }else {
          tb.m0();
       }
       return;
    }
}
