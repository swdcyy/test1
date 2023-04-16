package df2.r;
import erd.g;
import df2.m0;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import e17.i;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import bb1.n;

public final class r implements g	// class@002504
{
    public final m0 b;

    public void r(m0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r tb = this.b;
       tb.Y9(true);
       i.a(R.style.arg_RES_7f11066a, 0x7f101d28);
       n.c(1679, tb.x.getUserProfile().mProfile.mId, tb.x.getLiveStreamId());
    }
}
