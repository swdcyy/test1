package az9.j;
import erd.g;
import az9.i0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import tkd.b;
import tkd.d;
import ou5.b;
import az9.a0;
import com.yxcorp.gifshow.entity.QPhoto;
import android.content.Context;
import n3d.a;
import cm5.a;
import android.app.Activity;
import k2b.e0;
import cm5.c;

public final class j implements g	// class@00032f
{
    public final i0 b;

    public void j(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       p0 = tb.u;
       if (PatchProxy.applyVoidOneRefs(p0, tb, i0.class, "17")) {
       }else {
          tb.o0();
          if (!QCurrentUser.me().isLogined()) {
             LoginParams$a uoa = new LoginParams$a();
             uoa.d(a1.p(R.string.arg_RES_7f103078));
             d.a(-1712118428).x00(tb.v, 144, uoa.a(), new a0(tb, p0));
          }else {
             d.a(0x5f78d73).dw(p0, tb.v, tb.x, true);
          }
       }
       return;
    }
}
