package az9.g;
import erd.g;
import az9.i0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import xy5.j;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import az9.x;
import android.content.Context;
import n3d.a;

public final class g implements g	// class@000327
{
    public final i0 b;

    public void g(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, i0.class, "14")) {
       }else {
          String str = "COVER";
          tb.H.k(str, (tb.u.isCollected() ^ 0x01));
          if (!QCurrentUser.ME.isLogined()) {
             LoginParams$a uoa = new LoginParams$a();
             uoa.d(a1.p(R.string.arg_RES_7f103078));
             d.a(-1712118428).x00(tb.v, 67, uoa.a(), new x(tb));
          }else {
             tb.n0(str);
          }
       }
       return;
    }
}
