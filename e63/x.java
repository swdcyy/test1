package e63.x;
import n3d.a;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;

public final class x implements a	// class@00267a
{
    public final e b;

    public void x(e p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       x tb = this.b;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined() && tb.r.getUserProfile().mProfile != null) {
          tb.E9();
       }
       return;
    }
}
