package nz9.f;
import erd.g;
import nz9.z0;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class f implements g	// class@00321f
{
    public final z0 b;

    public void f(z0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       int i = 0x7f11066a;
       if (tb.u.getUser().isFemale()) {
          i.d(i, a1.p(R.string.arg_RES_7f10364b));
       }else {
          i.d(i, a1.p(R.string.arg_RES_7f10364c));
       }
       tb.u.getUser().setShowMissButton(false);
       tb.Q0(tb.u.getUserId(), false);
       return;
    }
}
