package a6c.a;
import erd.g;
import com.yxcorp.gifshow.profile.viewer.ProfilePhotoViewListFragment$a;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.framework.model.user.QCurrentUser;

public final class a implements g	// class@000086
{
    public final ProfilePhotoViewListFragment$a b;

    public void a(ProfilePhotoViewListFragment$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.o.a();
       QCurrentUser.ME.setEnablePhotoGuest(true).commitChanges();
    }
}
