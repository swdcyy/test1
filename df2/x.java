package df2.x;
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
import kb1.e;

public final class x implements g	// class@00250a
{
    public final m0 b;

    public void x(m0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       x tb = this.b;
       Object[] objArray = new Object[]{b.c(tb.x.getUserProfile().mProfile)};
       i.d(R.style.arg_RES_7f11066a, tb.w.getString(R.string.arg_RES_7f102bb6, objArray));
       tb.X9(tb.x.getUserProfile(), LiveApiParams$AssistantType.AUDIENCE);
       RxBus.f.b(new e(tb.x.getUserProfile().mProfile.mId, 0));
    }
}
