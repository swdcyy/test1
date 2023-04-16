package e63.f0;
import erd.g;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import e17.i;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import bb1.n;

public final class f0 implements g	// class@00264b
{
    public final e b;

    public void f0(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f0 tb = this.b;
       tb.f1 = false;
       i.a(R.style.arg_RES_7f11066a, 0x7f101d28);
       n.c(1687, tb.r.getUserProfile().mProfile.mId, tb.r.getLiveStreamId());
    }
}
