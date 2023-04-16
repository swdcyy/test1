package e63.g0;
import erd.g;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import zic.f;
import e17.i;

public final class g0 implements g	// class@00264e
{
    public final e b;

    public void g0(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g0 tb = this.b;
       p0.isBlocked = true;
       f.e(tb.r.getUserProfile().mProfile.mId, 0, tb.p.Q2(), 0);
       i.a(R.style.arg_RES_7f110669, 0x7f10011b);
    }
}
