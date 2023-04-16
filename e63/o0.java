package e63.o0;
import erd.g;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.util.Objects;
import o56.c;
import o56.a;
import android.app.Application;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import java.lang.CharSequence;
import e17.i;
import e17.s;
import bb1.n;

public final class o0 implements g	// class@002666
{
    public final e b;

    public void o0(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o0 tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[]{tb.r.getUserProfile().mProfile.mName};
       s.h(a.a().a().getString(R.string.arg_RES_7f102523, objArray));
       n.c(1680, tb.r.getUserProfile().mProfile.mId, tb.r.getLiveStreamId());
    }
}
