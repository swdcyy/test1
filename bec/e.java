package bec.e;
import erd.g;
import com.kwai.kds.krn.api.page.router.KwaiRnTab;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.reminder.friend.relation.FriendsListContainerFragment;

public final class e implements g	// class@000466
{
    public final KwaiRnTab b;

    public void e(KwaiRnTab p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.eh((p0.booleanValue() ^ 0x01));
    }
}
