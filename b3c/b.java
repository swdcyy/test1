package b3c.b;
import erd.g;
import b3c.g;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.page.component.a;
import b3c.h;
import com.yxcorp.gifshow.profile.components.common.actions.UserProfileAction;
import ee7.e;
import ee7.d;

public final class b implements g	// class@00039b
{
    public final g b;

    public void b(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.c.c.v(UserProfileAction.UPDATE, p0);
    }
}
