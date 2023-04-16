package dl9.u$d;
import android.view.View$OnClickListener;
import dl9.u;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import dl9.u$d$a;
import n3d.a;

public final class u$d implements View$OnClickListener	// class@001fae
{
    public final u b;

    public void u$d(u p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$d.class, "1")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (!mE.isLogined()) {
          d.a(-1712118428).x00(this.b.getContext(), 0, new LoginParams$a().a(), new u$d$a(this));
       }else {
          this.b.a9();
       }
       return;
    }
}
