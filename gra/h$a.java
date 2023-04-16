package gra.h$a;
import io.reactivex.g;
import gra.h;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import brd.g;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import lnc.a1;
import com.kwai.feature.api.social.login.model.LoginParams;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gra.h$a$a;
import n3d.a;

public final class h$a implements g	// class@002bb0
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (mE.isLogined()) {
          p0.onNext(Boolean.TRUE);
          p0.onComplete();
       }else {
          LoginParams$a uoa = new LoginParams$a();
          uoa.d(a1.p(R.string.arg_RES_7f103078));
          d.a(-1712118428).x00(this.b.getContext(), 0, uoa.a(), new h$a$a(p0));
       }
       return;
    }
}
