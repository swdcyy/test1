package df2.y;
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
import kb1.b;

public final class y implements g	// class@00250b
{
    public final m0 b;

    public void y(m0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       y tb = this.b;
       Object[] objArray = new Object[]{b.c(tb.x.getUserProfile().mProfile)};
       i.d(R.style.arg_RES_7f11066a, tb.w.getString(R.string.arg_RES_7f101d0e, objArray));
       LiveApiParams$AssistantType sUPER_ADMIN = LiveApiParams$AssistantType.SUPER_ADMIN;
       tb.x.setTargetUserAssType(sUPER_ADMIN);
       tb.X9(tb.x.getUserProfile(), sUPER_ADMIN);
       RxBus.f.b(new b(tb.x.getUserProfile().mProfile.mId));
    }
}
