package e63.m0;
import erd.g;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.kwai.framework.model.user.UserProfile;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import android.app.Activity;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import com.yxcorp.gifshow.util.rx.RxBus;
import kb1.a;

public final class m0 implements g	// class@002660
{
    public final e b;

    public void m0(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m0 tb = this.b;
       Object[] objArray = new Object[]{tb.r.getUserProfile().mProfile.mName};
       i.d(R.style.arg_RES_7f11066a, tb.p.getString(R.string.arg_RES_7f101d0a, objArray));
       LiveApiParams$AssistantType aDMIN = LiveApiParams$AssistantType.ADMIN;
       tb.r.setTargetUserAssType(aDMIN);
       tb.Q9(tb.r.getUserProfile(), aDMIN);
       RxBus.f.b(new a(tb.r.getUserProfile().mProfile.mId));
    }
}