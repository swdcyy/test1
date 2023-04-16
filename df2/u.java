package df2.u;
import erd.g;
import df2.m0;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import b61.b;
import android.app.Activity;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import com.yxcorp.gifshow.util.rx.RxBus;
import kb1.d;

public final class u implements g	// class@002507
{
    public final m0 b;

    public void u(m0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       u tb = this.b;
       Object[] objArray = new Object[]{b.c(tb.x.getUserProfile().mProfile)};
       i.d(R.style.arg_RES_7f11066a, tb.w.getString(R.string.arg_RES_7f102bb5, objArray));
       LiveApiParams$AssistantType aUDIENCE = LiveApiParams$AssistantType.AUDIENCE;
       tb.x.setTargetUserAssType(aUDIENCE);
       tb.X9(tb.x.getUserProfile(), aUDIENCE);
       RxBus.f.b(new d(tb.x.getUserProfile().mProfile.mId, 0));
    }
}
