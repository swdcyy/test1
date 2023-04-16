package e63.n1;
import android.view.View$OnClickListener;
import e63.o1;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.core.show.profilecard.http.LiveUserProfileExtraInfo;
import com.kuaishou.live.core.show.profilecard.http.LiveProfileGuardInfo;
import com.kwai.framework.model.user.UserInfo;
import ne2.k;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import tx1.d;

public class n1 implements View$OnClickListener	// class@002664
{
    public final o1 b;

    public void n1(o1 p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n1.class, "1")) {
          return;
       }
       n1 tb = this.b;
       if (tb.e != null) {
          o1 f = tb.f;
          if (f != null) {
             k.l(f.a(), this.b.e.mLiveProfileGuardInfo.mProfileGuardUserInfo.mId, false);
             tb = this.b;
             tb.f.J(new UserProfile(tb.e.mLiveProfileGuardInfo.mProfileGuardUserInfo), LiveStreamClickType.LIVE_PROFILE_GUARD_USER, 7, false, null, 107, true);
          }
       }
       return;
    }
}
