package e63.i0;
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

public final class i0 implements g	// class@002654
{
    public final e b;

    public void i0(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i0 tb = this.b;
       Object[] objArray = new Object[]{tb.r.getUserProfile().mProfile.mName};
       i.d(R.style.arg_RES_7f11066a, tb.p.getString(R.string.arg_RES_7f102523, objArray));
    }
}
